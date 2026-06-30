package ix3;

/* loaded from: classes.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f377066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.s f377067e;

    public q(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ix3.s sVar) {
        this.f377066d = f9Var;
        this.f377067e = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerAppMsgDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f377066d;
        if (f9Var != null) {
            f9Var.e1(c01.id.c() - 1296000000);
            pt0.f0.f439742b1.s(f9Var.Q0(), f9Var.m124847x74d37ac6(), f9Var);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = this.f377067e.m158354x19263085();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
            e4Var.f293309c = "消息时间已修改为15天之前";
            e4Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerAppMsgDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
