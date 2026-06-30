package io2;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io2.i f375009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(io2.i iVar) {
        super(1);
        this.f375009d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa resp = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        resp.getHasMore();
        io2.i iVar = this.f375009d;
        iVar.getClass();
        if (!resp.getHasMore()) {
            iVar.f().f375026c.m82690xd3a27e96(false);
            iVar.f().f375026c.m82688x390c1d00(false);
        }
        iVar.f().a(false);
        if (iVar.c().x() == 0 && iVar.f375010d.m56388xcaeb60d0().size() == 0 && resp.getPullType() != 1000) {
            io2.p f17 = iVar.f();
            f17.a(false);
            f17.f375029f.setVisibility(0);
        } else {
            io2.p f18 = iVar.f();
            f18.a(false);
            f18.f375029f.setVisibility(8);
        }
        iVar.c().m8146xced61ae5();
        return jz5.f0.f384359a;
    }
}
