package np2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1581x631ad567.C14520xbeea3ca5 f420327d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1581x631ad567.C14520xbeea3ca5 c14520xbeea3ca5) {
        this.f420327d = c14520xbeea3ca5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/square/operation/FinderLiveOperationFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1581x631ad567.C14520xbeea3ca5 c14520xbeea3ca5 = this.f420327d;
        if (currentTimeMillis - c14520xbeea3ca5.f203050u < 300) {
            c14520xbeea3ca5.z0();
        }
        c14520xbeea3ca5.f203050u = currentTimeMillis;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/operation/FinderLiveOperationFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
