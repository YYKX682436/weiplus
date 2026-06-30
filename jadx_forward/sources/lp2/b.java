package lp2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.C14515x36e97cca f401812d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.C14515x36e97cca c14515x36e97cca) {
        this.f401812d = c14515x36e97cca;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.C14515x36e97cca c14515x36e97cca = this.f401812d;
        if (currentTimeMillis - c14515x36e97cca.f203040s < 300) {
            c14515x36e97cca.z0();
        }
        c14515x36e97cca.f203040s = currentTimeMillis;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
