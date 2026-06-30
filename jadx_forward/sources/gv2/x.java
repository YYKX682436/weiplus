package gv2;

/* loaded from: classes9.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gv2.n0 f357626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f357627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f357628f;

    public x(gv2.n0 n0Var, android.widget.TextView textView, in5.s0 s0Var) {
        this.f357626d = n0Var;
        this.f357627e = textView;
        this.f357628f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g2 g2Var = this.f357626d.f357580e;
        android.widget.TextView commentFailTV = this.f357627e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(commentFailTV, "$commentFailTV");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) g2Var).E(commentFailTV, this.f357628f.m8183xf806b362());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
