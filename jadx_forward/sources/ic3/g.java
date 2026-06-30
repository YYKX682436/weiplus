package ic3;

/* loaded from: classes12.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371935d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        this.f371935d = activityC16419x510d00b7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371935d;
        java.lang.String str = activityC16419x510d00b7.f229383d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "综合测试-Preload流程\n1. 清缓存\n2. preloadAd\n3. getAdInfoAsync（验证去重）\n请查看 logcat 日志");
        wj.j0 j0Var = (wj.j0) ((xj.i) i95.n0.c(xj.i.class));
        j0Var.Ni();
        activityC16419x510d00b7.f229385f = null;
        j0Var.ij(activityC16419x510d00b7.f229384e);
        new android.os.Handler(activityC16419x510d00b7.getMainLooper()).postDelayed(new ic3.f(activityC16419x510d00b7, j0Var), 2000L);
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
