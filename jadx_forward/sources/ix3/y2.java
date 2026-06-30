package ix3;

/* loaded from: classes3.dex */
public final class y2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f377148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f377148d = jz5.h.b(new ix3.x2(this));
    }

    public final em.e3 T6() {
        return (em.e3) ((jz5.n) this.f377148d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dw7;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("图片消息调试页面");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ix3.r2(this));
        }
        long longExtra = m158359x1e885992().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(stringExtra, longExtra);
        em.e3 T6 = T6();
        if (T6.f335816b == null) {
            T6.f335816b = (android.widget.Button) T6.f335815a.findViewById(com.p314xaae8f345.mm.R.id.s8j);
        }
        T6.f335816b.setOnClickListener(new ix3.s2(k17, this, longExtra));
        em.e3 T62 = T6();
        if (T62.f335817c == null) {
            T62.f335817c = (android.widget.Button) T62.f335815a.findViewById(com.p314xaae8f345.mm.R.id.rqt);
        }
        T62.f335817c.setOnClickListener(new ix3.t2(k17, this, longExtra));
        em.e3 T63 = T6();
        if (T63.f335820f == null) {
            T63.f335820f = (android.widget.Button) T63.f335815a.findViewById(com.p314xaae8f345.mm.R.id.f567455ry1);
        }
        T63.f335820f.setOnClickListener(new ix3.u2(k17, this, longExtra));
        em.e3 T64 = T6();
        if (T64.f335819e == null) {
            T64.f335819e = (android.widget.Button) T64.f335815a.findViewById(com.p314xaae8f345.mm.R.id.rdp);
        }
        T64.f335819e.setOnClickListener(new ix3.v2(k17, this, longExtra));
        em.e3 T65 = T6();
        if (T65.f335818d == null) {
            T65.f335818d = (android.widget.Button) T65.f335815a.findViewById(com.p314xaae8f345.mm.R.id.t98);
        }
        T65.f335818d.setOnClickListener(new ix3.w2(k17, this));
    }
}
