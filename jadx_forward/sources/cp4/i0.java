package cp4;

/* loaded from: classes8.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.k0 f302569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cp4.g1 f302571f;

    public i0(cp4.k0 k0Var, int i17, cp4.g1 g1Var) {
        this.f302569d = k0Var;
        this.f302570e = i17;
        this.f302571f = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p m122408xc01af953;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cp4.k0 k0Var = this.f302569d;
        java.util.ArrayList arrayList2 = k0Var.f302576f;
        int i17 = this.f302570e;
        if (!((r45.is) arrayList2.get(i17)).f458833g && (m122408xc01af953 = this.f302571f.m122408xc01af953()) != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(k0Var.f302574d);
            java.lang.Object obj = k0Var.f302576f.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            m122408xc01af953.mo149xb9724478(valueOf, obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
