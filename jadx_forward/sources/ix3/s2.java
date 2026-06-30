package ix3;

/* loaded from: classes3.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f377085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.y2 f377086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f377087f;

    public s2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ix3.y2 y2Var, long j17) {
        this.f377085d = f9Var;
        this.f377086e = y2Var;
        this.f377087f = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 S1 = m11.b1.Di().S1(this.f377085d);
        if (S1 != null) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(this.f377085d, bm5.f0.f104097i, S1.f404172g, "", ""));
            ix3.y2 y2Var = this.f377086e;
            android.content.Intent intent = new android.content.Intent(y2Var.m158354x19263085(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f377087f + "-Thumb");
            intent.putExtra("dirPath", r6Var.r());
            intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, r6Var.m82467xfb82e301());
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = y2Var.m158354x19263085();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m158354x19263085, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m158354x19263085.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
