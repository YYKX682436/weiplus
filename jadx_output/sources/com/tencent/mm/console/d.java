package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class d implements jc3.m0 {
    @Override // jc3.m0
    public void J(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("shortlink", "checkMagicPkg failed with %s", str);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.console.c(this, str));
    }

    @Override // jc3.m0
    public void K(com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo) {
        com.tencent.mars.xlog.Log.i("shortlink", "checkMagicPkg success with %s", wxaMagicPkgInfo);
        if (wxaMagicPkgInfo != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.console.b(this, wxaMagicPkgInfo));
        }
    }
}
