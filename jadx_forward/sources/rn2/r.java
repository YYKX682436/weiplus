package rn2;

/* loaded from: classes.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.w f479359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f479360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479361f;

    public r(rn2.w wVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.view.View view) {
        this.f479359d = wVar;
        this.f479360e = abstractActivityC21394xb3d2c0cf;
        this.f479361f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper$showGiftSelectorPanel$1$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        v65.i.c(this.f479359d.f479437c, null, new rn2.q(this.f479360e, this.f479361f, null), 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper$showGiftSelectorPanel$1$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
