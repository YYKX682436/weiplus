package ic3;

/* loaded from: classes12.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371955d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        this.f371955d = activityC16419x510d00b7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371955d;
        java.lang.String str = activityC16419x510d00b7.f229383d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "getAdInfoAsync start");
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Vi(activityC16419x510d00b7.f229384e, activityC16419x510d00b7.f229389m, new ic3.u(activityC16419x510d00b7));
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
