package ix3;

/* loaded from: classes.dex */
public final class x3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f377139d;

    /* renamed from: e, reason: collision with root package name */
    public l15.c f377140e;

    /* renamed from: f, reason: collision with root package name */
    public s15.w f377141f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f377139d = jz5.h.b(new ix3.w3(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.emn;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("聊天记录消息调试页面");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ix3.t3(this));
        }
        long longExtra = m158359x1e885992().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(stringExtra, longExtra);
        jz5.g gVar = this.f377139d;
        em.l3 l3Var = (em.l3) ((jz5.n) gVar).mo141623x754a37bb();
        if (l3Var.f336104b == null) {
            l3Var.f336104b = (android.widget.Button) l3Var.f336103a.findViewById(com.p314xaae8f345.mm.R.id.txw);
        }
        l3Var.f336104b.setOnClickListener(new ix3.u3(stringExtra, longExtra, this));
        em.l3 l3Var2 = (em.l3) ((jz5.n) gVar).mo141623x754a37bb();
        if (l3Var2.f336105c == null) {
            l3Var2.f336105c = (android.widget.Button) l3Var2.f336103a.findViewById(com.p314xaae8f345.mm.R.id.t97);
        }
        l3Var2.f336105c.setOnClickListener(new ix3.v3(k17, this));
    }
}
