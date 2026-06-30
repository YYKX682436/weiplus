package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.Chunk */
/* loaded from: classes13.dex */
public class C25430x3e1324d {

    /* renamed from: bufferSize */
    public final int f46096x719ec861;

    /* renamed from: size */
    public final long f46097x35e001;

    /* renamed from: start */
    public final long f46098x68ac462;

    public C25430x3e1324d(int i17, long j17, long j18) {
        this.f46096x719ec861 = i17;
        this.f46098x68ac462 = j17;
        this.f46097x35e001 = j18;
    }

    /* renamed from: contains */
    public boolean m94282xde2d761f(long j17) {
        if (m94283x7daf8c6a()) {
            return j17 >= this.f46098x68ac462;
        }
        long j18 = this.f46098x68ac462;
        return j17 >= j18 && j17 <= j18 + this.f46097x35e001;
    }

    /* renamed from: isEndless */
    public boolean m94283x7daf8c6a() {
        return this.f46097x35e001 == -1;
    }

    /* renamed from: toString */
    public java.lang.String m94284x9616526c() {
        return "Chunk{bufferSize=" + this.f46096x719ec861 + ", start=" + this.f46098x68ac462 + ", size=" + this.f46097x35e001 + '}';
    }
}
