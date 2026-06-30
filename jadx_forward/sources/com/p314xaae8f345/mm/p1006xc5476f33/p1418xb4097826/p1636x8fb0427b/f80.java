package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class f80 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f208286d;

    /* renamed from: e, reason: collision with root package name */
    public final cw2.f8 f208287e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f80(android.content.Context r1, tu2.b r2, int r3, cw2.f8 r4, int r5, p3321xbce91901.jvm.p3324x21ffc6bd.i r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            tu2.b r2 = new tu2.b
            r2.<init>()
            r6 = 0
            r2.f503664a = r6
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L11
            r3 = -1
        L11:
            r5 = r5 & 8
            if (r5 == 0) goto L16
            r4 = 0
        L16:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f80.<init>(android.content.Context, tu2.b, int, cw2.f8, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0
    public in5.s b(final yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle$getItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f80.this.g(type, lVar, null);
            }
        };
    }

    public final in5.r g(int i17, yz5.l lVar, yz5.q qVar) {
        in5.r rVar;
        if (i17 == -12) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xr();
        }
        if (i17 == -7) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zh();
        }
        if (i17 == -5) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xh();
        }
        if (i17 == -3) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ik();
        }
        tu2.b bVar = this.f208550b;
        int i18 = this.f208549a;
        if (i17 != 2) {
            if (i17 != 4) {
                if (i17 == 9) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.c80(this, qVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d80(this));
                }
                if (i17 != 3001) {
                    if (i17 != 3002) {
                        if (lVar != null && (rVar = (in5.r) lVar.mo146xb9724478(java.lang.Integer.valueOf(i17))) != null) {
                            return rVar;
                        }
                        hc2.l.a("FinderStaggeredConfig", i17);
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                    }
                }
            }
            cw2.f8 f8Var = this.f208287e;
            return f8Var != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.a80(qVar, i18, bVar, f8Var) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.b80(qVar, i18, bVar);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.e80(qVar, i18, bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(android.content.Context baseContext, tu2.b itemViewConfig, int i17, cw2.f8 f8Var) {
        super(i17, itemViewConfig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseContext, "baseContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemViewConfig, "itemViewConfig");
        this.f208286d = baseContext;
        this.f208287e = f8Var;
    }
}
