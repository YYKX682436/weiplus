package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.AssetFrameRateInfo */
/* loaded from: classes5.dex */
public class C4133xf4cd4d4b {

    /* renamed from: a, reason: collision with root package name */
    public final qg.c f129899a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.f f129900b;

    public C4133xf4cd4d4b(qg.c cVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.f fVar) {
        this.f129899a = cVar;
        this.f129900b = fVar;
    }

    /* renamed from: toString */
    public java.lang.String m34023x9616526c() {
        return "AssetFrameRateInfo{mediaType=" + this.f129899a + ", frameRate=" + this.f129900b + '}';
    }

    private C4133xf4cd4d4b(int i17, int i18) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.f fVar;
        this.f129899a = qg.c.a(i17);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.f[] m34316xcee59d22 = com.p314xaae8f345.p457x3304c6.p479x4179489f.f.m34316xcee59d22();
        int length = m34316xcee59d22.length;
        int i19 = 0;
        while (true) {
            if (i19 < length) {
                fVar = m34316xcee59d22[i19];
                if (fVar.f130026d == i18) {
                    break;
                } else {
                    i19++;
                }
            } else {
                fVar = com.p314xaae8f345.p457x3304c6.p479x4179489f.f.FRAMERATE15;
                break;
            }
        }
        this.f129900b = fVar;
    }
}
