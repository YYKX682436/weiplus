package ij4;

/* loaded from: classes11.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f373249d;

    public b(in5.s0 s0Var) {
        this.f373249d = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/model/feed/CardFeedBottomItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bi4.d1 d1Var = new bi4.d1();
        d1Var.f436475i = 14L;
        d1Var.f436474h = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Bi();
        bi4.o1.f102608a.a(this.f373249d.f374654e, d1Var, null);
        qj4.s sVar = qj4.s.f445491a;
        qj4.s.l(sVar, 34L, null, null, 0L, null, 0L, 62, null);
        java.lang.String a17 = en1.a.a();
        java.lang.String str = d1Var.f436474h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        sVar.u(new qj4.l(a17, false, 14L, null, str, null, null, 104, null));
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/model/feed/CardFeedBottomItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
