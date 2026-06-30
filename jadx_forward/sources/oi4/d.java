package oi4;

/* loaded from: classes9.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f427162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f427163e;

    public d(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, in5.s0 s0Var) {
        this.f427162d = z3Var;
        this.f427163e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/like/HalfScreenLikeItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f427162d;
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 54);
        j45.l.n(this.f427163e.f374654e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 213);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(z3Var.d1(), 4L);
        hi4.k kVar = hi4.m.f363088f;
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        kVar.c(d17, 201);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/like/HalfScreenLikeItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
