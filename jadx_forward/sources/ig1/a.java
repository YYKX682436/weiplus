package ig1;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final java.math.BigInteger f372873b = java.math.BigInteger.valueOf(1024);

    /* renamed from: a, reason: collision with root package name */
    public final ig1.c f372874a = new ig1.c(null);

    public ye1.d a(int i17, int i18) {
        ye1.d dVar;
        ye1.d.f542715d.getClass();
        ye1.d dVar2 = null;
        if (-4000 >= i17) {
            if (i17 != -4999) {
                switch (i17) {
                    case com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14393xa0320ed6 /* -4006 */:
                    case -4000:
                        dVar = ye1.d.f542716e;
                        break;
                    case com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14392x660d477e /* -4005 */:
                        dVar = ye1.d.f542721m;
                        break;
                    case com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14391xd665298e /* -4004 */:
                        dVar = ye1.d.f542717f;
                        break;
                    case com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14396x273766a1 /* -4003 */:
                        dVar = ye1.d.f542719h;
                        break;
                    case com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14389xe3ffb3dd /* -4002 */:
                        dVar = ye1.d.f542722n;
                        break;
                    case com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14395x5bc87bc1 /* -4001 */:
                        dVar = ye1.d.f542718g;
                        break;
                }
            } else {
                dVar = ye1.d.f542723o;
            }
            dVar2 = dVar;
            if (dVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.GeneralErrorType", "fromExoErrorInfo, errorType is null, errorWhat: " + i17 + ", errorExtra: " + i18);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GeneralErrorType", "fromErrorInfo, errorWhat: " + i17 + ", errorExtra: " + i18 + ", errorType: " + dVar2);
        return dVar2;
    }

    public boolean b(ye1.e eVar) {
        return false;
    }

    public final void c(dg.f fVar, sf.f fVar2, ye1.e eVar, java.lang.String str) {
        o8.f fVar3;
        int i17;
        int i18;
        int i19;
        ig1.c cVar = this.f372874a;
        if (cVar.f372882g < cVar.f372881f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "reportVideoProfile, wired case, ignore reporting and reset data");
            cVar.a();
            return;
        }
        java.lang.String mo50271x74292566 = fVar2 != null ? fVar2.mo50271x74292566() : "";
        o8.f fVar4 = af1.z.f86050b;
        af1.i0 i0Var = (af1.i0) eVar.l(af1.i0.class);
        if (i0Var != null) {
            int i27 = i0Var.Q;
            int i28 = i0Var.R;
            int i29 = i0Var.S;
            o8.f fVar5 = i0Var.W;
            if (fVar5 == null) {
                fVar5 = fVar4;
            }
            o8.f fVar6 = i0Var.V;
            if (fVar6 != null) {
                fVar4 = fVar6;
            }
            fVar3 = fVar4;
            i17 = i27;
            i18 = i28;
            i19 = i29;
            fVar4 = fVar5;
        } else {
            fVar3 = fVar4;
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        int i37 = fVar4.f425138d;
        int i38 = fVar4.f425140f;
        int i39 = fVar4.f425141g;
        int i47 = fVar3.f425138d;
        int i48 = fVar3.f425140f;
        int i49 = fVar3.f425141g;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(oe1.v1.h().f426281e);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cVar.f372877b);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(cVar.f372878c);
        java.lang.String str2 = cVar.f372876a;
        java.lang.Long valueOf4 = java.lang.Long.valueOf(cVar.f372879d);
        java.lang.Long valueOf5 = java.lang.Long.valueOf(cVar.f372880e);
        java.lang.Long valueOf6 = java.lang.Long.valueOf(cVar.f372883h);
        java.lang.Integer valueOf7 = java.lang.Integer.valueOf(cVar.f372884i);
        java.lang.Long valueOf8 = java.lang.Long.valueOf(cVar.f372885j);
        java.lang.Integer valueOf9 = java.lang.Integer.valueOf(cVar.f372890o);
        java.lang.Integer valueOf10 = java.lang.Integer.valueOf(cVar.f372891p);
        java.lang.String str3 = cVar.f372892q;
        java.lang.Integer valueOf11 = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf12 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf13 = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf14 = java.lang.Integer.valueOf(cVar.f372893r.f86023a);
        cVar.f372893r.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        cVar.f372893r.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "reportVideoProfile:%s, appId:%s, proxy:%s, playerType:%s, playerCreateTime:%s, videoPath:%s, cachedSize:%s, duration:%s, prepareTime:%s, bufferCount:%s, bufferTime:%s, error(%s, %s, %s), minBufferMs:%s, maxBufferMs:%s, bufferForPlaybackMs:%s, fixNotifyErrorChannel: %d, lockCache: %b, useCronet: %b, interruptCache: %b, notifyErrorFix2FailCount: %d, audioRenderedCount: %d, audioDroppedCount: %d, audioMaxConsecutiveDroppedCount: %d, videoRenderedCount: %d, videoDroppedCount: %d, videoMaxConsecutiveDroppedCount: %d", str, mo50271x74292566, valueOf, valueOf2, valueOf3, str2, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, str3, valueOf11, valueOf12, valueOf13, valueOf14, bool, bool, java.lang.Boolean.valueOf(cVar.f372893r.f86024b), java.lang.Integer.valueOf(cVar.f372894s), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49));
        cVar.f372893r.getClass();
        cVar.f372893r.getClass();
        java.lang.Object[] objArr = {mo50271x74292566, java.lang.Integer.valueOf(cVar.f372877b), cVar.f372876a, java.lang.Long.valueOf(cVar.f372883h), java.lang.Long.valueOf(cVar.f372880e), java.lang.Long.valueOf(cVar.f372879d), java.lang.Integer.valueOf(cVar.f372890o), java.lang.Integer.valueOf(cVar.f372891p), cVar.f372892q, 1, java.lang.Integer.valueOf(oe1.v1.h().f426281e ? 1 : 0), java.lang.Integer.valueOf(cVar.f372884i), java.lang.Long.valueOf(cVar.f372885j), java.lang.Long.valueOf(cVar.f372878c), java.lang.Long.valueOf(cVar.f372881f), java.lang.Long.valueOf(cVar.f372882g), java.lang.Long.valueOf(cVar.f372888m), java.lang.Long.valueOf(cVar.f372889n), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(cVar.f372893r.f86023a), 0, 0, java.lang.Integer.valueOf(cVar.f372893r.f86024b ? 1 : 0), java.lang.Integer.valueOf(cVar.f372894s), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49)};
        ((fg1.q0) fVar).getClass();
        ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true))).c(18651, objArr);
        cVar.a();
    }
}
