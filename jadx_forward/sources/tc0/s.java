package tc0;

@j95.b
/* loaded from: classes5.dex */
public final class s extends i95.w implements uc0.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f498664d = "MicroMsg.RemarkRecommendFeatureService";

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ai(int r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tc0.r
            if (r0 == 0) goto L13
            r0 = r6
            tc0.r r0 = (tc0.r) r0
            int r1 = r0.f498663g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f498663g = r1
            goto L18
        L13:
            tc0.r r0 = new tc0.r
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f498661e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f498663g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f498660d
            tc0.s r5 = (tc0.s) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            boolean r5 = r4.Bi(r5)
            if (r5 != 0) goto L3f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L3f:
            gc0.d3 r5 = gc0.d3.f351664a
            r0.f498660d = r4
            r0.f498663g = r3
            java.lang.Object r6 = r5.h(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r5 = r4
        L4d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5c
            java.lang.String r5 = r5.f498664d
            java.lang.String r0 = "canUseRecommendRemark() tryInitRes false"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tc0.s.Ai(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean Bi(int i17) {
        java.lang.String str = this.f498664d;
        if (i17 == 1) {
            if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20639x4f64b359()) == 1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isRecommendRemarkOpen Verify scene disable");
                return false;
            }
        } else if (i17 == 2) {
            if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20635x75cfbac9()) == 1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isRecommendRemarkOpen Profile scene disable");
                return false;
            }
        } else if (i17 == 3) {
            if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20631xff3ff638()) == 1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isRecommendRemarkOpen Chat scene disable");
                return false;
            }
        }
        return true;
    }

    public java.lang.Object wi(int i17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (str != null) {
            gc0.q2 q2Var = gc0.q2.f351790a;
            long b17 = q2Var.b(str);
            long a17 = q2Var.a();
            boolean z17 = c01.id.c() - a17 < b17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f498664d, "canRecommendRemark:" + z17 + ", " + str + ", scene:" + i17 + ' ' + b17 + ' ' + a17);
            if (!z17) {
                return java.lang.Boolean.FALSE;
            }
        }
        return Ai(i17, interfaceC29045xdcb5ca57);
    }
}
