package ld2;

/* loaded from: classes3.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f399619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f399621c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ml2.l1 f399622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f399623e;

    public e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, yz5.p pVar, ml2.l1 l1Var, gk2.e eVar) {
        this.f399619a = abstractActivityC21394xb3d2c0cf;
        this.f399620b = str;
        this.f399621c = pVar;
        this.f399622d = l1Var;
        this.f399623e = eVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152149b == 0 && fVar.f152148a == 0) {
            ya2.b2 b17 = ya2.h.f542017a.b(this.f399620b);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i17 = b17 != null ? ya2.d.i(b17) : null;
            yz5.p pVar = this.f399621c;
            if (i17 == null) {
                pVar.mo149xb9724478(com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476.f43669x24a738, null);
            } else {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f409116i;
                y4Var.getClass();
                ml2.l1 l1Var = this.f399622d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l1Var, "<set-?>");
                y4Var.f409828e0 = l1Var;
                i95.m c17 = i95.n0.c(c61.ub.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f399619a;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
                c61.ub.A3((c61.ub) c17, abstractActivityC21394xb3d2c0cf, intent, i17, 0, false, java.lang.Boolean.valueOf(((mm2.c1) this.f399623e.a(mm2.c1.class)).a8()), null, true, (r45.j01) fVar.f152151d, new ld2.d(pVar), 80, null);
            }
        } else {
            db5.t7.m123882x26a183b(this.f399619a, com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8, 0).show();
        }
        return jz5.f0.f384359a;
    }
}
