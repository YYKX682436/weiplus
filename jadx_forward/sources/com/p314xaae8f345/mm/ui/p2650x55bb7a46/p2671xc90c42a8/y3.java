package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z3 f284096e;

    public y3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z3 z3Var, java.lang.String str) {
        this.f284096e = z3Var;
        this.f284095d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z3 z3Var = this.f284096e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c4 c4Var = z3Var.f284117i;
        if (c4Var.f283682n == z3Var.f284115g) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var = z3Var.f284118m;
            o3Var.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = this.f284095d;
            if (str == null) {
                str = "";
            }
            android.widget.TextView textView = c4Var.f283681m;
            textView.setText(str);
            c4Var.i(textView, o3Var.f284077g.f279966e);
        }
    }
}
