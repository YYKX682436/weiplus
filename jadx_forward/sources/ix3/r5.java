package ix3;

/* loaded from: classes.dex */
public final class r5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f377079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f377080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix3.t5 f377081f;

    public r5(java.lang.String str, long j17, ix3.t5 t5Var) {
        this.f377079d = str;
        this.f377080e = j17;
        this.f377081f = t5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerVoiceMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        java.lang.String str = this.f377079d;
        long j17 = this.f377080e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(str, j17);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(k17, k17 != null ? k17.z0() : null, false)));
        ix3.t5 t5Var = this.f377081f;
        android.content.Intent intent = new android.content.Intent(t5Var.m158354x19263085(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, j17 + "-Path");
        intent.putExtra("dirPath", r6Var.r());
        intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, r6Var.m82467xfb82e301());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = t5Var.m158354x19263085();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m158354x19263085, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerVoiceMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/repairer/ui/uic/RepairerVoiceMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerVoiceMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
