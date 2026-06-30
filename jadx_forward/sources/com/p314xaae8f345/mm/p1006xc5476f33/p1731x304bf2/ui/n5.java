package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class n5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f223209d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f223210e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b f223211f;

    /* renamed from: g, reason: collision with root package name */
    public int f223212g;

    public n5(android.content.Context context, java.lang.String str) {
        this.f223209d = context;
        this.f223210e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GamePreemptiveCliclListener", "No GameAppInfo");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f223211f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) view.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePreemptiveCliclListener", "Clicked appid = " + this.f223211f.f67370x28d45f97);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f223211f.f67370x28d45f97;
        ((kt.c) i0Var).getClass();
        android.content.Context context = this.f223209d;
        if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(context, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePreemptiveCliclListener", "get preemptive url:[%s]", this.f223210e);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223210e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GamePreemptiveCliclListener", "null or nill preemptive url");
            } else {
                r53.f.u(context, this.f223210e);
                android.content.Context context2 = this.f223209d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = this.f223211f;
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(context2, bVar.f221745o2, bVar.f221746p2, bVar.f221747q2, 11, bVar.f67370x28d45f97, this.f223212g, bVar.f221743m2, bVar.f221754x2);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar2 = this.f223211f;
        java.lang.String str2 = bVar2.f67370x28d45f97;
        java.lang.String str3 = bVar2.f67386xa1e9e82c;
        java.lang.String str4 = bVar2.f67384x996f3ea;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.j(context, str2);
        android.content.Context context3 = this.f223209d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar3 = this.f223211f;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(context3, bVar3.f221745o2, bVar3.f221746p2, bVar3.f221747q2, 3, bVar3.f67370x28d45f97, this.f223212g, bVar3.f221743m2, bVar3.f221754x2);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
