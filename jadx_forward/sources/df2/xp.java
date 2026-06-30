package df2;

/* loaded from: classes3.dex */
public final class xp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.yp f313326d;

    public xp(df2.yp ypVar) {
        this.f313326d = ypVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePostStrengthenController$initStrengthenPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14333x5924cb6c c14333x5924cb6c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14333x5924cb6c) this.f313326d.S6(com.p314xaae8f345.mm.R.id.l0q);
        if (c14333x5924cb6c != null) {
            c14333x5924cb6c.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LivePostStrengthenController$initStrengthenPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
