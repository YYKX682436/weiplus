package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d0 f206002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f206003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206004f;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d0 d0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str) {
        this.f206002d = d0Var;
        this.f206003e = h0Var;
        this.f206004f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderEnterpriseAddWidget$handleEnterprise$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d0 d0Var = this.f206002d;
        if (!d0Var.f206043g) {
            d0Var.f206043g = true;
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f206003e;
            java.lang.String str = (java.lang.String) h0Var.f391656d;
            r45.g05 g05Var = new r45.g05();
            java.lang.String str2 = this.f206004f;
            g05Var.f456318e = str2;
            g05Var.f456317d = 1;
            ((za0.k) b0Var).getClass();
            d17.g(new l41.e0(str, true, g05Var));
            d0Var.f206039c = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(d0Var.b().getContext(), d0Var.b().getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, 3, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d0.a(d0Var, 1, str2, (java.lang.String) h0Var.f391656d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderEnterpriseAddWidget$handleEnterprise$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
