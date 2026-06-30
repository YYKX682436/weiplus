package com.tencent.mm.feature.brandecs.aff;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/feature/brandecs/aff/AffBrandEcsCppToNativeManagerImpl;", "Lcom/tencent/wechat/mm/brand_service/a;", "Ljz5/f0;", "forceInitBrsAffEnv", "", "getLocalCanvasPkgVersion", "", "getAllowEmptyListResortSwitch", "", "getSyncServerTimeMs", "dictId", "registerDIct", "checkBrandListDBHasStartCompression", "checkBrandNotiListDBHasStartCompression", "Lcom/tencent/wechat/mm/brand_service/j;", "msgInfo", "", "getDigest", "userName", "getUserNameIsFollowed", "<init>", "()V", "plugin-brandecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AffBrandEcsCppToNativeManagerImpl implements com.tencent.wechat.mm.brand_service.a {
    @Override // com.tencent.wechat.mm.brand_service.a
    public boolean checkBrandListDBHasStartCompression() {
        return false;
    }

    @Override // com.tencent.wechat.mm.brand_service.a
    public boolean checkBrandNotiListDBHasStartCompression() {
        return false;
    }

    @Override // com.tencent.wechat.mm.brand_service.a
    public void forceInitBrsAffEnv() {
        yw.a3.f466266a.e();
    }

    @Override // com.tencent.wechat.mm.brand_service.a
    public boolean getAllowEmptyListResortSwitch() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_empty_list_resort, 0) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r7 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        if ((r10.f218979m == 2) != false) goto L54;
     */
    @Override // com.tencent.wechat.mm.brand_service.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getDigest(com.tencent.wechat.mm.brand_service.j r10) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.brandecs.aff.AffBrandEcsCppToNativeManagerImpl.getDigest(com.tencent.wechat.mm.brand_service.j):java.lang.String");
    }

    @Override // com.tencent.wechat.mm.brand_service.a
    public int getLocalCanvasPkgVersion() {
        java.lang.String Vi;
        jc3.x E1;
        hw.o0 o0Var = (hw.o0) ((gw.i) i95.n0.c(gw.i.class));
        hw.c0 c0Var = o0Var.f285409e;
        if (c0Var == null || (E1 = c0Var.E1()) == null || (Vi = E1.e()) == null) {
            Vi = ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi(o0Var.Ri());
        }
        int i17 = 0;
        try {
            i17 = new cl0.g(Vi).optInt("updateUnixTimeStamp", 0);
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AffBrandServiceCppToNativeManagerImpl", "parse pkg config fail, cause by: " + android.util.Log.getStackTraceString(e17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBrandServiceCppToNativeManagerImpl", "get local canvas pkg version: " + i17);
        return i17;
    }

    @Override // com.tencent.wechat.mm.brand_service.a
    public long getSyncServerTimeMs() {
        return c01.id.c();
    }

    @Override // com.tencent.wechat.mm.brand_service.a
    public boolean getUserNameIsFollowed(java.lang.String userName) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        return n17 != null && n17.r2();
    }

    @Override // com.tencent.wechat.mm.brand_service.a
    public boolean registerDIct(int dictId) {
        return true;
    }
}
