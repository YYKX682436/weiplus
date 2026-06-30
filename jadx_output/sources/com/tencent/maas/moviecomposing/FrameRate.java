package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class FrameRate {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48379a;

    /* renamed from: b, reason: collision with root package name */
    public final float f48380b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48381c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.f f48382d;

    private FrameRate(boolean z17, float f17, com.tencent.maas.model.time.MJTime mJTime, int i17) {
        com.tencent.maas.moviecomposing.f fVar;
        this.f48379a = z17;
        this.f48380b = f17;
        this.f48381c = mJTime;
        com.tencent.maas.moviecomposing.f[] values = com.tencent.maas.moviecomposing.f.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                fVar = com.tencent.maas.moviecomposing.f.FRAMERATE15;
                break;
            }
            fVar = values[i18];
            if (fVar.f48493d == i17) {
                break;
            } else {
                i18++;
            }
        }
        this.f48382d = fVar;
    }

    public java.lang.String toString() {
        return "FrameRate{isNull=" + this.f48379a + ", numericValue=" + this.f48380b + ", frameDuration=" + this.f48381c + ", type=" + this.f48382d + '}';
    }
}
