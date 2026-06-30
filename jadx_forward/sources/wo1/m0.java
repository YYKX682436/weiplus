package wo1;

/* loaded from: classes5.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a f529522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f529523e;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a aVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar) {
        this.f529522d = aVar;
        this.f529523e = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onExtState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onExtState] remove extState=");
        sb6.append(this.f529522d);
        sb6.append(", pkgId=");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f529523e;
        sb6.append(gVar.f297362d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b.f174101a.b(gVar.f297362d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.q(gVar.f297362d);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onExtState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
