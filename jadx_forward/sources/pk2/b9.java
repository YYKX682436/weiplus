package pk2;

/* loaded from: classes3.dex */
public final class b9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f437120e;

    public b9(pk2.o9 o9Var, pk2.d9 d9Var) {
        this.f437119d = o9Var;
        this.f437120e = d9Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.nw1 m76794xd0557130;
        o25.y1 y1Var;
        pk2.a9 a9Var = new pk2.a9(this.f437120e);
        pk2.o9 o9Var = this.f437119d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
        if (c19792x256d2725 != null) {
            pk2.d9 d9Var = o9Var.f437615f;
            if (d9Var != null && (y1Var = d9Var.f437199i) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).aj((db5.h4) menuItem, new pk2.hb(o9Var, a9Var, c19792x256d2725, menuItem));
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f409503o, null, null, null, null, null, false, 126, null);
            i95.m c18 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.t1 t1Var = ml2.t1.f409506p;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("share_scene", java.lang.String.valueOf(zl2.r4.f555483a.Z0()));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
            hashMap.put("liveid", pm0.v.u((c19792x256d27252 == null || (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) == null) ? 0L : m76794xd0557130.m75942xfb822ef2(0)));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
            hashMap.put("feedid", pm0.v.u(c19792x256d27253 != null ? c19792x256d27253.m76784x5db1b11() : 0L));
            zy2.zb.T8(zbVar, t1Var, hashMap, null, null, null, null, false, 124, null);
        }
    }
}
