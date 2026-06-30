package ic3;

/* loaded from: classes12.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371947d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        this.f371947d = activityC16419x510d00b7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371947d;
        java.lang.String str = activityC16419x510d00b7.f229383d;
        wj.t0 t0Var = activityC16419x510d00b7.f229384e;
        wj.t0 t0Var2 = wj.t0.N;
        activityC16419x510d00b7.f229384e = t0Var2;
        java.util.Objects.toString(t0Var2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "综合测试-拦截流程\n1. 使用测试 posId（NotInstalled 策略）\n2. 调用 getAdInfoAsync\n3. 验证拦截行为\n\n请查看 logcat 日志");
        xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
        wj.j0 j0Var = (wj.j0) iVar;
        j0Var.Vi(t0Var2, activityC16419x510d00b7.f229389m, new ic3.m(java.lang.System.currentTimeMillis(), activityC16419x510d00b7, t0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
