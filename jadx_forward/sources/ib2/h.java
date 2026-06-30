package ib2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.w f371650d;

    public h(ib2.w wVar) {
        this.f371650d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$initViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ib2.w wVar = this.f371650d;
        r45.ev2 O6 = ib2.w.O6(wVar);
        if (O6 != null) {
            so2.v0 v0Var = so2.v0.f492177a;
            r45.vx0 vx0Var = wVar.f371689d;
            android.app.Activity m80379x76847179 = wVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            so2.v0.a(v0Var, vx0Var, O6, (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m80379x76847179, null, null, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$initViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
