package ns2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ns2.g f420921a = new ns2.g();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ns2.b bVar, ns2.a aVar, int i17) {
        java.lang.String m75945x2fec8307 = bVar.f420890c.m75945x2fec8307(4);
        int i18 = 0;
        boolean z17 = true;
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) == true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeReserveHandler", "[doReserveInternal] noticeId is null or empty, abort reserve");
            return;
        }
        r45.h32 h32Var = bVar.f420890c;
        h32Var.m75939xb282bd08(1);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3 t3Var = vd2.t3.f517454a;
        ml2.q1 q1Var = ml2.q1.f409345e;
        java.lang.String l17 = t3Var.l("temp_5", bVar.f420898k ? 1 : 0, bVar.f420895h, null, null);
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String str = bVar.f420889b;
        android.content.Context context = bVar.f420888a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        java.lang.String str2 = bVar.f420900m;
        java.lang.Integer num = bVar.f420902o;
        if (num != null) {
            i18 = num.intValue();
        } else {
            java.lang.String str3 = bVar.f420895h;
            if (str3 != null && str3.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                i18 = 901;
            }
        }
        gm0.j1.d().g(c61.zb.x3(zbVar, str, m75945x2fec8307, i17, V6, str2, java.lang.Integer.valueOf(i18), null, null, l17, bVar.f420899l, null, null, null, 7360, null));
        java.lang.String str4 = bVar.f420889b;
        e(str4, h32Var);
        b(context, str4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mj mjVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mj) aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf c15422x1a5a3ecf = mjVar.f200609a.f199158o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c15422x1a5a3ecf, "access$getLiveNoticeActionBtn$p(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf.g(c15422x1a5a3ecf, mjVar.f200610b, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lj(mjVar.f200611c), 2, null);
        d(bVar, i17);
    }

    public final void b(android.content.Context context, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.e4) ((zy2.g8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.g8.class))).f499507d.M0(str);
    }

    public final void c(ns2.b bVar, ml2.i5 i5Var, java.lang.String str) {
        cl0.g gVar = new cl0.g();
        java.lang.Integer num = bVar.f420902o;
        gVar.s("source_type", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        gVar.s("ref_page_type", bVar.f420895h);
        gVar.o("notice_type", 1);
        java.lang.Integer num2 = bVar.f420903p;
        if (num2 != null) {
            gVar.o("pull_source", num2.intValue());
        }
        i95.m c17 = i95.n0.c(c50.c1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c50.c1 c1Var = (c50.c1) c17;
        java.lang.String str2 = bVar.f420889b;
        java.lang.String str3 = bVar.f420892e;
        r45.h32 h32Var = bVar.f420890c;
        java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        c50.c1.l9(c1Var, i5Var, str2, 0L, 0, str3, null, null, null, null, m75945x2fec8307, gVar.toString(), h32Var.m75945x2fec8307(4), str, bVar.f420893f, bVar.f420894g, null, 33248, null);
    }

    public final void d(ns2.b bVar, int i17) {
        long j17 = bVar.f420893f;
        if (j17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a;
            r45.qt2 qt2Var = bVar.f420891d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j17);
            int i18 = i17 == 1 ? 83 : 84;
            java.lang.String m75945x2fec8307 = bVar.f420890c.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.e(l0Var, qt2Var, h17, i18, m75945x2fec8307, 0, 16, null);
        }
    }

    public final void e(java.lang.String str, r45.h32 h32Var) {
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        if (((b92.d1) zbVar).bj(str, m75945x2fec8307) == null) {
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
            ((b92.d1) zbVar2).Ai(str, m75945x2fec83072 != null ? m75945x2fec83072 : "", h32Var);
        } else {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
            r45.h32 bj6 = ((b92.d1) zbVar3).bj(str, m75945x2fec83073 != null ? m75945x2fec83073 : "");
            if (bj6 == null) {
                return;
            }
            bj6.set(1, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(1)));
        }
    }
}
