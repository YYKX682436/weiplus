package ix3;

/* loaded from: classes.dex */
public final class s extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f377082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f377082d = jz5.h.b(new ix3.r(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.emb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("AppMsg消息调试页面");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ix3.o(this));
        }
        long longExtra = m158359x1e885992().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(stringExtra, longExtra);
        jz5.g gVar = this.f377082d;
        em.t2 t2Var = (em.t2) ((jz5.n) gVar).mo141623x754a37bb();
        if (t2Var.f336349c == null) {
            t2Var.f336349c = (android.widget.Button) t2Var.f336347a.findViewById(com.p314xaae8f345.mm.R.id.upa);
        }
        t2Var.f336349c.setOnClickListener(new ix3.p(k17, this, longExtra));
        em.t2 t2Var2 = (em.t2) ((jz5.n) gVar).mo141623x754a37bb();
        if (t2Var2.f336348b == null) {
            t2Var2.f336348b = (android.widget.Button) t2Var2.f336347a.findViewById(com.p314xaae8f345.mm.R.id.t98);
        }
        t2Var2.f336348b.setOnClickListener(new ix3.q(k17, this));
    }
}
