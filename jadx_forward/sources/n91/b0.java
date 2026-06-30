package n91;

/* loaded from: classes7.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n91.c0 f417387d;

    public b0(n91.c0 c0Var) {
        this.f417387d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/custom_loading/MagicGameLoadingImpl$setUpDefaultView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] requestFullScreen");
        n91.e eVar = this.f417387d.f417403n;
        if (eVar != null) {
            ((n91.h) eVar).f417411b.f417405b.K2.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/custom_loading/MagicGameLoadingImpl$setUpDefaultView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
