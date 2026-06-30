package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class u7 extends zl1.w {
    public u7(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
    }

    @Override // zl1.w
    public void a(java.lang.String str, zl1.y yVar) {
        super.a(str, yVar);
        com.tencent.mars.xlog.Log.e("IconLoadErrorHandler ", "load icon fail: " + str);
    }
}
