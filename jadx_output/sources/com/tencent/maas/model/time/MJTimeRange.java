package com.tencent.maas.model.time;

/* loaded from: classes5.dex */
public class MJTimeRange implements java.lang.Cloneable {
    public static final com.tencent.maas.model.time.MJTimeRange InvalidTimeRange;
    public static final com.tencent.maas.model.time.MJTimeRange PositiveInfiniteTimeRange;
    public static final com.tencent.maas.model.time.MJTimeRange ZeroTimeRange;
    private final com.tencent.maas.model.time.MJTime duration;
    private final com.tencent.maas.model.time.MJTime startTime;

    static {
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        ZeroTimeRange = new com.tencent.maas.model.time.MJTimeRange(mJTime, mJTime);
        com.tencent.maas.model.time.MJTime mJTime2 = com.tencent.maas.model.time.MJTime.InvalidTime;
        InvalidTimeRange = new com.tencent.maas.model.time.MJTimeRange(mJTime2, mJTime2);
        PositiveInfiniteTimeRange = new com.tencent.maas.model.time.MJTimeRange(mJTime, com.tencent.maas.model.time.MJTime.PositiveInfinityTime);
    }

    public MJTimeRange(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2) {
        this.startTime = mJTime;
        this.duration = mJTime2;
    }

    public static com.tencent.maas.model.time.MJTimeRange fromSecondsStartTimeDuration(double d17, double d18) {
        return new com.tencent.maas.model.time.MJTimeRange(com.tencent.maas.model.time.MJTime.fromSeconds(d17), com.tencent.maas.model.time.MJTime.fromSeconds(d18));
    }

    public static com.tencent.maas.model.time.MJTimeRange fromSecondsStartTimeEndTime(double d17, double d18) {
        return new com.tencent.maas.model.time.MJTimeRange(com.tencent.maas.model.time.MJTime.fromSeconds(d17), com.tencent.maas.model.time.MJTime.fromSeconds(d18 - d17));
    }

    public static com.tencent.maas.model.time.MJTimeRange fromStartEnd(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2) {
        return new com.tencent.maas.model.time.MJTimeRange(mJTime, mJTime2.sub(mJTime));
    }

    public com.tencent.maas.model.time.MJTimeRange calcIntersection(com.tencent.maas.model.time.MJTimeRange mJTimeRange) {
        if (!isValid() || !mJTimeRange.isValid()) {
            com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            return new com.tencent.maas.model.time.MJTimeRange(mJTime, mJTime);
        }
        com.tencent.maas.model.time.MJTime mJTime2 = this.startTime;
        com.tencent.maas.model.time.MJTime endTime = getEndTime();
        com.tencent.maas.model.time.MJTime mJTime3 = mJTimeRange.startTime;
        com.tencent.maas.model.time.MJTime endTime2 = mJTimeRange.getEndTime();
        com.tencent.maas.model.time.MJTime mJTime4 = mJTime2.smallThan(mJTime3) ? mJTime3 : mJTime2;
        if (endTime.smallThan(endTime2)) {
            endTime2 = endTime;
        }
        return endTime2.smallThan(mJTime4) ? (mJTime3.bigThan(endTime) || mJTime3.equalsTo(endTime)) ? new com.tencent.maas.model.time.MJTimeRange(endTime, com.tencent.maas.model.time.MJTime.ZeroTime) : new com.tencent.maas.model.time.MJTimeRange(mJTime2, com.tencent.maas.model.time.MJTime.ZeroTime) : new com.tencent.maas.model.time.MJTimeRange(mJTime4, endTime2.sub(mJTime4));
    }

    public com.tencent.maas.model.time.MJTimeRange calcMergedTimeRangeWith(com.tencent.maas.model.time.MJTimeRange mJTimeRange) {
        if (!isValid()) {
            return mJTimeRange;
        }
        if (!mJTimeRange.isValid()) {
            return this;
        }
        if (mJTimeRange.getStartTime().smallThan(this.startTime)) {
            mJTimeRange.getStartTime();
        }
        return fromStartEnd(this.startTime, mJTimeRange.getEndTime().bigThan(getEndTime()) ? mJTimeRange.getEndTime() : getEndTime());
    }

    public boolean containsTime(com.tencent.maas.model.time.MJTime mJTime) {
        if (isValid() && mJTime.isValid()) {
            return (mJTime.bigThan(this.startTime) || mJTime.equalsTo(this.startTime)) && mJTime.smallThan(getEndTime());
        }
        return false;
    }

    public boolean containsTimeRange(com.tencent.maas.model.time.MJTimeRange mJTimeRange) {
        return (mJTimeRange.getStartTime().bigThan(getStartTime()) || mJTimeRange.getStartTime().equalsTo(getStartTime())) && mJTimeRange.getStartTime().smallThan(getEndTime()) && mJTimeRange.getEndTime().bigThan(getStartTime()) && (mJTimeRange.getEndTime().smallThan(getEndTime()) || mJTimeRange.getEndTime().equalsTo(getEndTime()));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.tencent.maas.model.time.MJTimeRange mJTimeRange = (com.tencent.maas.model.time.MJTimeRange) obj;
        return this.startTime.equals(mJTimeRange.startTime) && this.duration.equals(mJTimeRange.duration);
    }

    public com.tencent.maas.model.time.MJTime getDuration() {
        return this.duration;
    }

    public long getDurationFlicks() {
        return this.duration.getFlicks();
    }

    public com.tencent.maas.model.time.MJTime getEndTime() {
        return this.startTime.add(this.duration);
    }

    public long getStartFlicks() {
        return this.startTime.getFlicks();
    }

    public com.tencent.maas.model.time.MJTime getStartTime() {
        return this.startTime;
    }

    public boolean isValid() {
        return this.startTime.isNumeric() && this.duration.isValid() && !this.duration.isNegative();
    }

    public java.lang.String toString() {
        return "MJTimeRange{startTime=" + this.startTime + ", duration=" + this.duration + '}';
    }
}
