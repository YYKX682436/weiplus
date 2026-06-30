package pk2;

/* loaded from: classes3.dex */
public final class qa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f437734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437735e;

    public qa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, pk2.o9 o9Var) {
        this.f437734d = e3Var;
        this.f437735e = o9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/VisitorMoreSettingOption$showMoreSettingPanel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f437734d.h();
        pk2.d9 d9Var = this.f437735e.f437615f;
        if (d9Var != null) {
            d9Var.f437196f = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/VisitorMoreSettingOption$showMoreSettingPanel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
