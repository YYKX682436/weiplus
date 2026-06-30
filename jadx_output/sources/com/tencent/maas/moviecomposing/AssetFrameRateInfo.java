package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class AssetFrameRateInfo {

    /* renamed from: a, reason: collision with root package name */
    public final qg.c f48366a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.f f48367b;

    public AssetFrameRateInfo(qg.c cVar, com.tencent.maas.moviecomposing.f fVar) {
        this.f48366a = cVar;
        this.f48367b = fVar;
    }

    public java.lang.String toString() {
        return "AssetFrameRateInfo{mediaType=" + this.f48366a + ", frameRate=" + this.f48367b + '}';
    }

    private AssetFrameRateInfo(int i17, int i18) {
        com.tencent.maas.moviecomposing.f fVar;
        this.f48366a = qg.c.a(i17);
        com.tencent.maas.moviecomposing.f[] values = com.tencent.maas.moviecomposing.f.values();
        int length = values.length;
        int i19 = 0;
        while (true) {
            if (i19 < length) {
                fVar = values[i19];
                if (fVar.f48493d == i18) {
                    break;
                } else {
                    i19++;
                }
            } else {
                fVar = com.tencent.maas.moviecomposing.f.FRAMERATE15;
                break;
            }
        }
        this.f48367b = fVar;
    }
}
