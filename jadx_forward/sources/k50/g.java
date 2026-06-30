package k50;

/* loaded from: classes9.dex */
public final class g extends m50.x {

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f385746s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f385746s = jz5.h.b(new k50.e(this));
    }

    @Override // m50.x
    public co.a V6() {
        return new pb5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String m126747x696739c;
        m15.a j17 = ((pb5.a) c7()).j();
        return (j17 == null || (m126747x696739c = j17.m126747x696739c()) == null) ? "" : m126747x696739c;
    }

    @Override // m50.x
    public void X6(java.util.List usernameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        jz5.g gVar = this.f385746s;
        java.lang.String str = (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-cardReceiveUsername>(...)");
        if (r26.n0.N(str)) {
            super.X6(usernameList);
            return;
        }
        java.lang.String str2 = (java.lang.String) kz5.n0.Z(usernameList);
        if (str2 == null) {
            str2 = "";
        }
        pb5.a aVar = new pb5.a();
        m15.a aVar2 = new m15.a();
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).getClass();
        java.lang.String b17 = com.p314xaae8f345.mm.ui.p2690x38b72420.db.b(str2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getCardMsg(...)");
        aVar2.m126728xdc93280d(b17);
        aVar.l(aVar2);
        java.util.List c17 = kz5.b0.c((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
        m50.x.f405044r.a(m80379x76847179(), aVar, c17, f7(), (r23 & 16) != 0 ? true : true, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? null : null, (r23 & 128) != 0, new k50.f(this, c17, str2));
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).Ai(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ifb), action.f536274b);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        if (((pb5.a) c7()).j() == null) {
            pb5.a aVar = (pb5.a) c7();
            m15.a aVar2 = new m15.a();
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            java.lang.String k17 = ((pb5.a) c7()).k();
            ((dk5.b0) b0Var).getClass();
            java.lang.String b17 = com.p314xaae8f345.mm.ui.p2690x38b72420.db.b(k17, null);
            if (b17 == null) {
                b17 = "";
            }
            aVar2.m126728xdc93280d(b17);
            aVar.l(aVar2);
        }
        m158354x19263085().getIntent().putExtra("Select_Send_Card", true);
        android.content.Intent intent = m158354x19263085().getIntent();
        m15.a j17 = ((pb5.a) c7()).j();
        intent.putExtra("Select_Talker_Name", j17 != null ? j17.m146661x6c03c64c() : null);
    }

    public final void q7(java.lang.String str, java.lang.String str2) {
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str2)) {
            ((dk5.s5) tg3.t1.a()).Di(str2, str, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str), null);
        } else if (((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Ni(str, str2)) {
            ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).getClass();
            q41.f.e(str2, str);
        }
    }
}
