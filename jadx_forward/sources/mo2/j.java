package mo2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mo2.q f411907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f411908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f411909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f411910g;

    public j(mo2.q qVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17) {
        this.f411907d = qVar;
        this.f411908e = s0Var;
        this.f411909f = abstractC14490x69736cb5;
        this.f411910g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshPosterContact$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f411908e.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f411907d.o(context, this.f411909f, 5, this.f411910g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshPosterContact$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
