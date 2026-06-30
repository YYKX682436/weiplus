package uf5;

/* loaded from: classes3.dex */
public final class t1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.u1 f508834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf5.s1 f508835e;

    public t1(uf5.u1 u1Var, uf5.s1 s1Var) {
        this.f508834d = u1Var;
        this.f508835e = s1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/SelectedAvatarAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.p pVar = this.f508834d.f508840f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        pVar.mo149xb9724478(view, java.lang.Integer.valueOf(this.f508835e.m8183xf806b362()));
        yj0.a.i(true, this, "com/tencent/mm/ui/contact/privacy/SelectedAvatarAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
