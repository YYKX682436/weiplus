package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPElapsedTimeStatistics */
/* loaded from: classes16.dex */
public class C26568x28144350 {

    /* renamed from: mLastPointTimeMs */
    private long f55291x626a9e60;

    /* renamed from: mStartTimeMs */
    private long f55292x3be94da8;

    /* renamed from: costTimeMsFromLastPoint */
    public long m104290xb96f3c70() {
        return android.os.SystemClock.elapsedRealtime() - this.f55291x626a9e60;
    }

    /* renamed from: costTimeMsFromLastPointAndPoint */
    public long m104291x8cbdaa89() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = elapsedRealtime - this.f55291x626a9e60;
        this.f55291x626a9e60 = elapsedRealtime;
        return j17;
    }

    /* renamed from: costTimeMsFromStartPoint */
    public long m104292xa7a94d38() {
        return android.os.SystemClock.elapsedRealtime() - this.f55292x3be94da8;
    }

    /* renamed from: costTimeMsFromStartPointAndPoint */
    public long m104293xbd5e7351() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f55291x626a9e60 = elapsedRealtime;
        return elapsedRealtime - this.f55292x3be94da8;
    }

    /* renamed from: point */
    public void m104294x65e5590() {
        this.f55291x626a9e60 = android.os.SystemClock.elapsedRealtime();
    }

    /* renamed from: startPoint */
    public void m104295xa1660e4e() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f55292x3be94da8 = elapsedRealtime;
        this.f55291x626a9e60 = elapsedRealtime;
    }
}
