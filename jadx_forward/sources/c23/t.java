package c23;

/* loaded from: classes.dex */
public final class t extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f119586d;

    /* renamed from: e, reason: collision with root package name */
    public long f119587e;

    /* renamed from: f, reason: collision with root package name */
    public final long f119588f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.i f119589g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f119586d = "MicroMsg.FTS.FTSPardusUIC";
        this.f119588f = 60L;
    }

    public static final void T6(c23.t tVar) {
        tVar.getClass();
        if (java.lang.System.currentTimeMillis() - tVar.f119587e <= tVar.f119588f * 1000 || su4.r2.l()) {
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.i iVar = tVar.f119589g;
        if (iVar != null) {
            iVar.j();
        }
        r45.b55 b55Var = new r45.b55();
        b55Var.f452065d = su4.r2.i();
        b55Var.f452066e = su4.r2.g();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1417;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/parduspresearch";
        lVar.f152197a = b55Var;
        lVar.f152198b = new r45.c55();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar2 = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar2.p(a17);
        tVar.f119589g = iVar2;
        pq5.g l17 = iVar2.l();
        if (l17 != null) {
            android.view.LayoutInflater.Factory m158354x19263085 = tVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.vending.lifecycle.ILifeCycleKeeper<*>");
            l17.f((im5.b) m158354x19263085);
            l17.q(new c23.s(tVar));
        }
        tVar.f119587e = c01.id.c();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.m3(m158354x19263085(), new c23.r(this));
        }
    }
}
