package ix3;

/* loaded from: classes.dex */
public final class l5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f377024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.p5 f377025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f377026f;

    public l5(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ix3.p5 p5Var, long j17) {
        this.f377024d = f9Var;
        this.f377025e = p5Var;
        this.f377026f = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ri(bm5.f0.f104104s, this.f377024d, null, false));
        ix3.p5 p5Var = this.f377025e;
        android.content.Intent intent = new android.content.Intent(p5Var.m158354x19263085(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f377026f + "-Compress");
        intent.putExtra("dirPath", r6Var.r());
        intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, r6Var.m82467xfb82e301());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = p5Var.m158354x19263085();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m158354x19263085, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
