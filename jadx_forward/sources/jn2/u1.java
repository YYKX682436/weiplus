package jn2;

/* loaded from: classes8.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.s1 f382248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f382249e;

    public u1(jn2.s1 s1Var, jn2.z1 z1Var) {
        this.f382248d = s1Var;
        this.f382249e = z1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f382248d.m8183xf806b362();
        boolean z17 = false;
        jn2.z1 z1Var = this.f382249e;
        if (m8183xf806b362 >= 0 && m8183xf806b362 < z1Var.f382302h.size()) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj = z1Var.f382302h.get(m8183xf806b362);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.z22 z22Var = (r45.z22) obj;
            yz5.p pVar = z1Var.f382306o;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(m8183xf806b362), z22Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
