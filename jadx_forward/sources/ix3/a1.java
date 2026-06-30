package ix3;

/* loaded from: classes.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f376891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix3.c1 f376892f;

    public a1(java.lang.String str, long j17, ix3.c1 c1Var) {
        this.f376890d = str;
        this.f376891e = j17;
        this.f376892f = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerEmojiMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        java.lang.String str = this.f376890d;
        long j17 = this.f376891e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(str, j17);
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        java.lang.String z07 = k17 != null ? k17.z0() : null;
        ((k90.b) u0Var).getClass();
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5 z5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).getClass();
        h12.b0.a();
        java.lang.String z08 = k17 != null ? k17.z0() : null;
        if (z08 != null) {
            z07 = z08;
        } else if (z07 == null) {
            z07 = "";
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) z5Var).getClass();
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(n22.m.g(), "", z07);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(p17 != null ? p17 : ""));
        ix3.c1 c1Var = this.f376892f;
        android.content.Intent intent = new android.content.Intent(c1Var.m158354x19263085(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, j17 + "-Path");
        intent.putExtra("dirPath", r6Var.r());
        intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, r6Var.m82467xfb82e301());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c1Var.m158354x19263085();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m158354x19263085, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerEmojiMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/repairer/ui/uic/RepairerEmojiMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerEmojiMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
