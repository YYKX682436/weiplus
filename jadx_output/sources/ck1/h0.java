package ck1;

/* loaded from: classes4.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.o f42331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ck1.k0 k0Var, ck1.o oVar) {
        super(0);
        this.f42330d = k0Var;
        this.f42331e = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ck1.t0 t0Var = ((ck1.n) this.f42331e).f42353a;
        ck1.k0 k0Var = this.f42330d;
        k0Var.getClass();
        com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage appBrandUserInfoRevokePage = k0Var.f42338d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0(ak1.f.d(appBrandUserInfoRevokePage), 1, false);
        android.widget.TextView textView = new android.widget.TextView(ak1.f.d(appBrandUserInfoRevokePage));
        textView.setMinHeight(i65.a.f(ak1.f.d(appBrandUserInfoRevokePage), com.tencent.mm.R.dimen.f479727dj));
        int f17 = i65.a.f(ak1.f.d(appBrandUserInfoRevokePage), com.tencent.mm.R.dimen.f480142ph);
        textView.setPadding(f17, 0, f17, 0);
        textView.setGravity(17);
        textView.setTextColor(b3.l.getColor(ak1.f.d(appBrandUserInfoRevokePage), com.tencent.mm.R.color.f478730fl));
        textView.setTextSize(0, i65.a.h(ak1.f.d(appBrandUserInfoRevokePage), com.tencent.mm.R.dimen.f479930ja));
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = t0Var.f42383c.f378980e;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        textView.setText(appBrandUserInfoRevokePage.getString(com.tencent.mm.R.string.a5e, objArr));
        k0Var2.s(textView, false);
        k0Var2.f211872n = new ck1.x(k0Var);
        k0Var2.f211881s = new ck1.z(k0Var, t0Var);
        k0Var2.v();
        return jz5.f0.f302826a;
    }
}
