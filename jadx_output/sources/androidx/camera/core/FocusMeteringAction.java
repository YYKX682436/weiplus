package androidx.camera.core;

/* loaded from: classes14.dex */
public final class FocusMeteringAction {
    static final long DEFAULT_AUTOCANCEL_DURATION = 5000;
    static final int DEFAULT_METERING_MODE = 7;
    public static final int FLAG_AE = 2;
    public static final int FLAG_AF = 1;
    public static final int FLAG_AWB = 4;
    private final long mAutoCancelDurationInMillis;
    private final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAe;
    private final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAf;
    private final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAwb;

    /* loaded from: classes14.dex */
    public static class Builder {
        long mAutoCancelDurationInMillis;
        final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAe;
        final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAf;
        final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAwb;

        public Builder(androidx.camera.core.MeteringPoint meteringPoint) {
            this(meteringPoint, 7);
        }

        public androidx.camera.core.FocusMeteringAction.Builder addPoint(androidx.camera.core.MeteringPoint meteringPoint) {
            return addPoint(meteringPoint, 7);
        }

        public androidx.camera.core.FocusMeteringAction build() {
            return new androidx.camera.core.FocusMeteringAction(this);
        }

        public androidx.camera.core.FocusMeteringAction.Builder disableAutoCancel() {
            this.mAutoCancelDurationInMillis = 0L;
            return this;
        }

        public androidx.camera.core.FocusMeteringAction.Builder removePoints(int i17) {
            if ((i17 & 1) != 0) {
                this.mMeteringPointsAf.clear();
            }
            if ((i17 & 2) != 0) {
                this.mMeteringPointsAe.clear();
            }
            if ((i17 & 4) != 0) {
                this.mMeteringPointsAwb.clear();
            }
            return this;
        }

        public androidx.camera.core.FocusMeteringAction.Builder setAutoCancelDuration(long j17, java.util.concurrent.TimeUnit timeUnit) {
            m3.h.b(j17 >= 1, "autoCancelDuration must be at least 1");
            this.mAutoCancelDurationInMillis = timeUnit.toMillis(j17);
            return this;
        }

        public Builder(androidx.camera.core.MeteringPoint meteringPoint, int i17) {
            this.mMeteringPointsAf = new java.util.ArrayList();
            this.mMeteringPointsAe = new java.util.ArrayList();
            this.mMeteringPointsAwb = new java.util.ArrayList();
            this.mAutoCancelDurationInMillis = androidx.camera.core.FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
            addPoint(meteringPoint, i17);
        }

        public androidx.camera.core.FocusMeteringAction.Builder addPoint(androidx.camera.core.MeteringPoint meteringPoint, int i17) {
            boolean z17 = false;
            m3.h.b(meteringPoint != null, "Point cannot be null.");
            if (i17 >= 1 && i17 <= 7) {
                z17 = true;
            }
            m3.h.b(z17, "Invalid metering mode " + i17);
            if ((i17 & 1) != 0) {
                this.mMeteringPointsAf.add(meteringPoint);
            }
            if ((i17 & 2) != 0) {
                this.mMeteringPointsAe.add(meteringPoint);
            }
            if ((i17 & 4) != 0) {
                this.mMeteringPointsAwb.add(meteringPoint);
            }
            return this;
        }

        public Builder(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.mMeteringPointsAf = arrayList;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            this.mMeteringPointsAe = arrayList2;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            this.mMeteringPointsAwb = arrayList3;
            this.mAutoCancelDurationInMillis = androidx.camera.core.FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
            arrayList.addAll(focusMeteringAction.getMeteringPointsAf());
            arrayList2.addAll(focusMeteringAction.getMeteringPointsAe());
            arrayList3.addAll(focusMeteringAction.getMeteringPointsAwb());
            this.mAutoCancelDurationInMillis = focusMeteringAction.getAutoCancelDurationInMillis();
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface MeteringMode {
    }

    public FocusMeteringAction(androidx.camera.core.FocusMeteringAction.Builder builder) {
        this.mMeteringPointsAf = java.util.Collections.unmodifiableList(builder.mMeteringPointsAf);
        this.mMeteringPointsAe = java.util.Collections.unmodifiableList(builder.mMeteringPointsAe);
        this.mMeteringPointsAwb = java.util.Collections.unmodifiableList(builder.mMeteringPointsAwb);
        this.mAutoCancelDurationInMillis = builder.mAutoCancelDurationInMillis;
    }

    public long getAutoCancelDurationInMillis() {
        return this.mAutoCancelDurationInMillis;
    }

    public java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAe() {
        return this.mMeteringPointsAe;
    }

    public java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAf() {
        return this.mMeteringPointsAf;
    }

    public java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAwb() {
        return this.mMeteringPointsAwb;
    }

    public boolean isAutoCancelEnabled() {
        return this.mAutoCancelDurationInMillis > 0;
    }
}
