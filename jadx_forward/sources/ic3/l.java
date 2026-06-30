package ic3;

/* loaded from: classes12.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371943d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        this.f371943d = activityC16419x510d00b7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371943d;
        java.lang.String str = activityC16419x510d00b7.f229383d;
        java.lang.String str2 = activityC16419x510d00b7.f229385f;
        if (str2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "⚠️ 请先获取广告信息（用于拿到 aid）");
            java.lang.String str3 = activityC16419x510d00b7.f229383d;
            yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "综合测试-上报流程\n1. reportAd(Expose)\n2. reportAd(ExposeEnd)\n3. reportNotShow\n\n请查看 logcat 日志");
        xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
        java.lang.String str4 = activityC16419x510d00b7.f229383d;
        wj.j0 j0Var = (wj.j0) iVar;
        j0Var.mj(str2, wj.w0.f528074d, null);
        new android.os.Handler(activityC16419x510d00b7.getMainLooper()).postDelayed(new ic3.k(activityC16419x510d00b7, j0Var, str2), 1000L);
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
