package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class ha0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f208414d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f208415e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ha0(int r2, tu2.b r3, boolean r4, java.lang.String r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r2 = -1
        L5:
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L11
            tu2.b r3 = new tu2.b
            r3.<init>()
            r3.f503664a = r0
        L11:
            r6 = r6 & 4
            if (r6 == 0) goto L16
            r4 = r0
        L16:
            java.lang.String r6 = "itemViewConfig"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r6)
            java.lang.String r6 = "authorFinderUsername"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r6)
            r1.<init>(r2, r3)
            r1.f208414d = r4
            r1.f208415e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ha0.<init>(int, tu2.b, boolean, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0
    public in5.s b(final yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.storage.FinderMemberTabConfig$getItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                in5.r rVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ha0 ha0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ha0.this;
                yz5.l lVar2 = lVar;
                ha0Var.getClass();
                boolean z17 = type == 3002 || type == 4;
                int i17 = ha0Var.f208549a;
                boolean z18 = ha0Var.f208414d;
                tu2.b bVar = ha0Var.f208550b;
                if (z17) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.go(i17, bVar, z18);
                }
                if (type == 3001 || type == 2) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fo(i17, bVar, z18);
                }
                if (type == -3) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ik();
                }
                if (type == -5) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xh();
                }
                if (type == -7) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zh();
                }
                if (type == -12) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xr();
                }
                if (type == 1) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                }
                if (type != -15 && type != -16) {
                    if (type == -20) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eo(i17, bVar);
                    }
                    if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e.class.hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.io(ha0Var.f208415e);
                    }
                    if (lVar2 != null && (rVar = (in5.r) lVar2.mo146xb9724478(java.lang.Integer.valueOf(type))) != null) {
                        return rVar;
                    }
                    hc2.l.a("FinderStaggeredConfig", type);
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                }
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.mo(i17, -1, -1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), false, true);
            }
        };
    }
}
