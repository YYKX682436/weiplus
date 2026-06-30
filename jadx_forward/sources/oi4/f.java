package oi4;

/* loaded from: classes9.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f427164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f427165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kj4.b f427166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi4.g f427167g;

    public f(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, in5.s0 s0Var, kj4.b bVar, oi4.g gVar) {
        this.f427164d = z3Var;
        this.f427165e = s0Var;
        this.f427166f = bVar;
        this.f427167g = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/like/LikeHistoryItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f427164d;
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 54);
        in5.s0 s0Var = this.f427165e;
        j45.l.n(s0Var.f374654e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 213);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(z3Var.d1(), 4L);
        hi4.k kVar = hi4.m.f363088f;
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        kVar.c(d17, 201);
        java.lang.String str = this.f427166f.f389985d;
        mj4.h t17 = ai4.m0.f86706a.G().t(str);
        oi4.g gVar = this.f427167g;
        if (t17 != null) {
            java.lang.String a17 = en1.a.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
            gVar.n(a17, t17, null);
        } else {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            gVar.p(context, str, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/like/LikeHistoryItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
