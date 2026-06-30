package jn2;

/* loaded from: classes8.dex */
public final class x1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.s1 f382283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f382284e;

    public x1(jn2.s1 s1Var, jn2.z1 z1Var) {
        this.f382283d = s1Var;
        this.f382284e = z1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int m8183xf806b362 = this.f382283d.m8183xf806b362();
        boolean z17 = false;
        jn2.z1 z1Var = this.f382284e;
        if (m8183xf806b362 >= 0 && m8183xf806b362 < z1Var.f382302h.size()) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj = z1Var.f382302h.get(m8183xf806b362);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.z22 z22Var = (r45.z22) obj;
            yz5.q qVar = z1Var.f382303i;
            if (qVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                qVar.mo147xb9724478(view, java.lang.Integer.valueOf(m8183xf806b362), z22Var);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
