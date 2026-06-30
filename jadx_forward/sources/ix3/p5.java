package ix3;

/* loaded from: classes.dex */
public final class p5 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f377064d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f377065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f377064d = jz5.h.b(new ix3.n5(this));
        this.f377065e = jz5.h.b(ix3.o5.f377056d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.emq;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("视频路径调试页面");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ix3.j5(this));
        }
        long longExtra = m158359x1e885992().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(stringExtra, longExtra);
        if (k17 == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
            e4Var.f293309c = "消息不存在";
            e4Var.c();
            return;
        }
        t21.v2 g17 = ((t21.w2) ((wf0.w1) ((jz5.n) this.f377065e).mo141623x754a37bb())).g(k17.z0());
        if (g17 == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x192630852);
            e4Var2.f293309c = "视频信息不存在";
            e4Var2.c();
            return;
        }
        java.lang.String d17 = g17.d();
        java.lang.String str = g17.S;
        jz5.g gVar = this.f377064d;
        em.r3 r3Var = (em.r3) ((jz5.n) gVar).mo141623x754a37bb();
        if (r3Var.f336295d == null) {
            r3Var.f336295d = (android.widget.Button) r3Var.f336292a.findViewById(com.p314xaae8f345.mm.R.id.vmk);
        }
        r3Var.f336295d.setOnClickListener(new ix3.k5(k17, d17, this, longExtra));
        em.r3 r3Var2 = (em.r3) ((jz5.n) gVar).mo141623x754a37bb();
        if (r3Var2.f336293b == null) {
            r3Var2.f336293b = (android.widget.Button) r3Var2.f336292a.findViewById(com.p314xaae8f345.mm.R.id.sxm);
        }
        r3Var2.f336293b.setOnClickListener(new ix3.l5(k17, this, longExtra));
        em.r3 r3Var3 = (em.r3) ((jz5.n) gVar).mo141623x754a37bb();
        if (r3Var3.f336294c == null) {
            r3Var3.f336294c = (android.widget.Button) r3Var3.f336292a.findViewById(com.p314xaae8f345.mm.R.id.unj);
        }
        r3Var3.f336294c.setOnClickListener(new ix3.m5(str, this, k17, longExtra));
    }
}
