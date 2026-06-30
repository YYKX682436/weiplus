package ic3;

/* loaded from: classes12.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371937d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        this.f371937d = activityC16419x510d00b7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371937d;
        java.lang.String str = activityC16419x510d00b7.f229383d;
        if (!activityC16419x510d00b7.f229384e.f528060p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "⚠️ 当前 posId 未配置 useFallback\n请先选择已配置 fallback 的 posId（如 FORWARD_TO_YUANBAO）");
            java.lang.String str2 = activityC16419x510d00b7.f229383d;
            yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "综合测试-Fallback注入\n1. 清缓存\n2. 模拟 CGI 失败（断网或超时）\n3. 验证返回 fallback adInfo\n\n请查看 logcat 日志");
            wj.j0 j0Var = (wj.j0) ((xj.i) i95.n0.c(xj.i.class));
            j0Var.Ni();
            activityC16419x510d00b7.f229385f = null;
            j0Var.Vi(activityC16419x510d00b7.f229384e, 5000L, new ic3.h(activityC16419x510d00b7));
            yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
