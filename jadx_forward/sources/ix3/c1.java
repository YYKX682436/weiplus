package ix3;

/* loaded from: classes.dex */
public final class c1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f376908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f376908d = jz5.h.b(new ix3.b1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.emh;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("表情消息调试页面");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ix3.z0(this));
        }
        long longExtra = m158359x1e885992().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        em.y2 y2Var = (em.y2) ((jz5.n) this.f376908d).mo141623x754a37bb();
        if (y2Var.f336477b == null) {
            y2Var.f336477b = (android.widget.Button) y2Var.f336476a.findViewById(com.p314xaae8f345.mm.R.id.upa);
        }
        y2Var.f336477b.setOnClickListener(new ix3.a1(stringExtra, longExtra, this));
    }
}
