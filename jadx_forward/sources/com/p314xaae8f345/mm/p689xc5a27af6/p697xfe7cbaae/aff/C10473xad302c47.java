package com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.aff;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/feature/brandecs/aff/AffBrandEcsCppToNativeManagerImpl;", "Lcom/tencent/wechat/mm/brand_service/a;", "Ljz5/f0;", "forceInitBrsAffEnv", "", "getLocalCanvasPkgVersion", "", "getAllowEmptyListResortSwitch", "", "getSyncServerTimeMs", "dictId", "registerDIct", "checkBrandListDBHasStartCompression", "checkBrandNotiListDBHasStartCompression", "Lcom/tencent/wechat/mm/brand_service/j;", "msgInfo", "", "getDigest", "userName", "getUserNameIsFollowed", "<init>", "()V", "plugin-brandecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.brandecs.aff.AffBrandEcsCppToNativeManagerImpl */
/* loaded from: classes11.dex */
public final class C10473xad302c47 implements com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a {
    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a
    /* renamed from: checkBrandListDBHasStartCompression */
    public boolean mo44050x31e36c83() {
        return false;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a
    /* renamed from: checkBrandNotiListDBHasStartCompression */
    public boolean mo44051xb71f44ad() {
        return false;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a
    /* renamed from: forceInitBrsAffEnv */
    public void mo44052x63ec4bf4() {
        yw.a3.f547799a.e();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a
    /* renamed from: getAllowEmptyListResortSwitch */
    public boolean mo44053x745dfc3d() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_empty_list_resort, 0) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r7 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        if ((r10.f300512m == 2) != false) goto L54;
     */
    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a
    /* renamed from: getDigest */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mo44054x15b3c0ba(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j r10) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.aff.C10473xad302c47.mo44054x15b3c0ba(com.tencent.wechat.mm.brand_service.j):java.lang.String");
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a
    /* renamed from: getLocalCanvasPkgVersion */
    public int mo44055x4a95e8b9() {
        java.lang.String Vi;
        jc3.x E1;
        hw.o0 o0Var = (hw.o0) ((gw.i) i95.n0.c(gw.i.class));
        hw.c0 c0Var = o0Var.f366942e;
        if (c0Var == null || (E1 = c0Var.E1()) == null || (Vi = E1.e()) == null) {
            Vi = ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi(o0Var.Ri());
        }
        int i17 = 0;
        try {
            i17 = new cl0.g(Vi).mo15080xc3ca103c("updateUnixTimeStamp", 0);
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffBrandServiceCppToNativeManagerImpl", "parse pkg config fail, cause by: " + android.util.Log.getStackTraceString(e17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffBrandServiceCppToNativeManagerImpl", "get local canvas pkg version: " + i17);
        return i17;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a
    /* renamed from: getSyncServerTimeMs */
    public long mo44056x3bce0027() {
        return c01.id.c();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a
    /* renamed from: getUserNameIsFollowed */
    public boolean mo44057xb836c6e6(java.lang.String userName) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        return n17 != null && n17.r2();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a
    /* renamed from: registerDIct */
    public boolean mo44058x9a2e2cd9(int dictId) {
        return true;
    }
}
