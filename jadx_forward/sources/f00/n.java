package f00;

/* loaded from: classes.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f00.o f339852d;

    public n(f00.o oVar) {
        this.f339852d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/card/view/EcsProductWxaCoverWidget$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick data:");
        f00.o oVar = this.f339852d;
        sb6.append(oVar.f339854b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsProductWxaCoverWidget", sb6.toString());
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(oVar.f339854b), f00.h.class, f00.m.f339851d, null);
        yj0.a.h(this, "com/tencent/mm/feature/ecs/card/view/EcsProductWxaCoverWidget$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
