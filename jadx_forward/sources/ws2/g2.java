package ws2;

/* loaded from: classes3.dex */
public final class g2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.j2 f530574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f530575e;

    public g2(ws2.j2 j2Var, gk2.e eVar) {
        this.f530574d = j2Var;
        this.f530575e = eVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        dk2.xf k17;
        java.lang.String str;
        r45.nt2 nt2Var;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f530574d.f530595i);
        ws2.j2 j2Var = this.f530574d;
        gk2.e eVar = this.f530575e;
        synchronized (valueOf) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j2Var.f530592f, "count down looping");
            if (j2Var.f530595i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j2Var.f530592f, "cgi going,return ");
                return false;
            }
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.f6 f6Var = (mm2.f6) efVar.i(mm2.f6.class);
            if ((f6Var == null || (nt2Var = f6Var.E) == null || nt2Var.m75939xb282bd08(1) != 0) ? false : true) {
                return true;
            }
            mm2.i7 i7Var = ((mm2.h5) eVar.a(mm2.h5.class)).f410645g;
            r45.hd5 hd5Var = i7Var != null ? i7Var.f410681e : null;
            if (i7Var == null || hd5Var == null) {
                return false;
            }
            long longValue = ((java.lang.Number) ((jz5.n) j2Var.f530593g).mo141623x754a37bb()).longValue() - (c01.id.e() - hd5Var.m75939xb282bd08(2));
            if (!j2Var.f530594h.containsKey(java.lang.Long.valueOf(i7Var.f410680d))) {
                j2Var.f530594h.put(java.lang.Long.valueOf(i7Var.f410680d), new ws2.d2(false, false, false));
            }
            java.lang.Object obj = j2Var.f530594h.get(java.lang.Long.valueOf(i7Var.f410680d));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            ws2.d2 d2Var = (ws2.d2) obj;
            if (longValue > 0) {
                return true;
            }
            if (!d2Var.f530558a) {
                pm0.v.X(new ws2.i2(com.p314xaae8f345.mm.R.C30867xcad56011.e6w));
            }
            d2Var.f530558a = true;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.j0.Qj((ml2.j0) c17, 7, 0, 0L, 0, 12, null);
            j2Var.f530595i = true;
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            if (e1Var != null && (k17 = efVar.k(eVar)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                android.content.Context context = k0Var != null ? k0Var.getContext() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
                long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
                long j17 = e1Var.f410516m;
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var == null || (str = c1Var.f410385o) == null) {
                    str = "";
                }
                java.lang.String str2 = str;
                r45.hx0 hx0Var = new r45.hx0();
                hx0Var.set(0, 106);
                r45.l12 l12Var = new r45.l12();
                l12Var.set(0, java.lang.Long.valueOf(i7Var.f410680d));
                hx0Var.set(1, hc2.b.a(l12Var));
                ((dk2.r4) k17).a0(abstractActivityC21394xb3d2c0cf, m75942xfb822ef2, j17, str2, hx0Var, new ws2.f2(j2Var, i7Var, eVar));
            }
            return false;
        }
    }
}
