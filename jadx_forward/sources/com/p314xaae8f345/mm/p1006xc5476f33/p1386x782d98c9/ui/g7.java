package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes4.dex */
public final class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f181000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f181001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f181002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 f181003g;

    public g7(android.widget.TextView textView, k91.v5 v5Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 activityC13481xc7ac0134) {
        this.f181000d = textView;
        this.f181001e = v5Var;
        this.f181002f = c22699x3dcdb352;
        this.f181003g = activityC13481xc7ac0134;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k91.v5 v5Var = this.f181001e;
        android.widget.TextView textView = this.f181000d;
        if (textView != null) {
            textView.setText(v5Var.f68913x21f9b213);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f181002f;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(this.f181003g.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        o11.f fVar = new o11.f();
        fVar.f423629t = true;
        fVar.f423612c = true;
        n11.a.b().h(v5Var.f68920x68aa7b8d, c22699x3dcdb352, fVar.a());
    }
}
