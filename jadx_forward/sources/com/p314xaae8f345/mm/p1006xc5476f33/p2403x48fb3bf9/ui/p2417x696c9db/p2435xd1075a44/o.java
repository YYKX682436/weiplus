package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f268986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f268987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f268988f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.Context context) {
        super(1);
        this.f268986d = view;
        this.f268987e = k0Var;
        this.f268988f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f268987e;
            android.view.View view = this.f268986d;
            if (view != null) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
                if (k0Var.P.size() > 0 && k0Var.D1 == null) {
                    k0Var.g();
                    k0Var.b(0);
                }
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
                int b17 = i65.a.b(this.f268988f, 4);
                android.widget.TextView textView = k0Var.Q1;
                if (textView != null) {
                    textView.setPadding(textView.getPaddingLeft(), k0Var.Q1.getPaddingTop(), k0Var.Q1.getPaddingRight(), b17);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
