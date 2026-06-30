package y20;

/* loaded from: classes11.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.test.EcsTestUIRichText f540566d;

    public v(com.tencent.mm.feature.ecs.test.EcsTestUIRichText ecsTestUIRichText) {
        this.f540566d = ecsTestUIRichText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/test/EcsTestUIRichText$setupListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.feature.ecs.test.EcsTestUIRichText.g;
        com.tencent.mm.feature.ecs.test.EcsTestUIRichText ecsTestUIRichText = this.f540566d;
        ecsTestUIRichText.getClass();
        y20.u[] m176415xcee59d22 = y20.u.m176415xcee59d22();
        ecsTestUIRichText.e = m176415xcee59d22[c06.e.f119249d.d(m176415xcee59d22.length)];
        ecsTestUIRichText.i7();
        ecsTestUIRichText.b7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsTestUIRichText", "Randomized width to: " + ecsTestUIRichText.e);
        yj0.a.h(this, "com/tencent/mm/feature/ecs/test/EcsTestUIRichText$setupListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
