package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class a7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.b7 f288124e;

    public a7(com.p314xaae8f345.mm.ui.p2690x38b72420.b7 b7Var, java.lang.String str) {
        this.f288124e = b7Var;
        this.f288123d = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f288123d);
        intent.putExtra("view_mode", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.m(intent, this.f288124e.f288159d.mo55332x76847179());
    }
}
