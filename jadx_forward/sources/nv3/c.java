package nv3;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final nv3.c f422187a = new nv3.c();

    public final void a(rv3.h item, int i17, boolean z17, int i18, dv3.c cVar, ev3.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        nv3.a aVar = new nv3.a(item, z17, cVar, i17, dVar, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info = item.f481928d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        c(info, r45.kh.kBgmInteractType_Fav, z17 ? r45.jh.kBgmInteractFlag_None : r45.jh.kBgmInteractFlag_Del, aVar);
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info, boolean z17, int i17, rv3.v musicPlayStatus, ev3.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicPlayStatus, "musicPlayStatus");
        c(info, r45.kh.kBgmInteractType_Listen, z17 ? r45.jh.kBgmInteractFlag_None : r45.jh.kBgmInteractFlag_Del, new nv3.b(dVar, i17, info, z17, musicPlayStatus));
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, r45.kh type, r45.jh flag, yz5.p pVar) {
        int i17 = c16997xb0aa383a.I;
        r45.pg4 pg4Var = c16997xb0aa383a.A;
        long Z = pm0.v.Z(pg4Var != null ? pg4Var.f464551d : null);
        r45.pg4 pg4Var2 = c16997xb0aa383a.A;
        long Z2 = pm0.v.Z(pg4Var2 != null ? pg4Var2.f464557m : null);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flag, "flag");
        i95.m c18 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        new bq.l1(type, flag, Z, Z2, i17, currentTimeMillis).l().h(new cq.l0(pVar));
    }
}
