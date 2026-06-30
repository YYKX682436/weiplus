package com.tencent.mm.console;

/* loaded from: classes.dex */
public class f implements yz5.l {
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) obj;
        if (r6Var == null) {
            str = "check udr null";
        } else {
            str = "check udr: " + r6Var.o();
        }
        com.tencent.mars.xlog.Log.i("shortlink", str);
        return null;
    }
}
