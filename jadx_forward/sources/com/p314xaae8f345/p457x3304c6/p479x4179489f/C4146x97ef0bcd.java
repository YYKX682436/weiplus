package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.FrameRate */
/* loaded from: classes5.dex */
public class C4146x97ef0bcd {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f129912a;

    /* renamed from: b, reason: collision with root package name */
    public final float f129913b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f129914c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.f f129915d;

    private C4146x97ef0bcd(boolean z17, float f17, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.f fVar;
        this.f129912a = z17;
        this.f129913b = f17;
        this.f129914c = c4128x879fba0a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.f[] m34316xcee59d22 = com.p314xaae8f345.p457x3304c6.p479x4179489f.f.m34316xcee59d22();
        int length = m34316xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                fVar = com.p314xaae8f345.p457x3304c6.p479x4179489f.f.FRAMERATE15;
                break;
            }
            fVar = m34316xcee59d22[i18];
            if (fVar.f130026d == i17) {
                break;
            } else {
                i18++;
            }
        }
        this.f129915d = fVar;
    }

    /* renamed from: toString */
    public java.lang.String m34066x9616526c() {
        return "FrameRate{isNull=" + this.f129912a + ", numericValue=" + this.f129913b + ", frameDuration=" + this.f129914c + ", type=" + this.f129915d + '}';
    }
}
