package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class pp implements ju2.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp f185808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dm.pd f185810c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f185811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f185812e;

    public pp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp rpVar, in5.s0 s0Var, dm.pd pdVar, int i17, boolean z17) {
        this.f185808a = rpVar;
        this.f185809b = s0Var;
        this.f185810c = pdVar;
        this.f185811d = i17;
        this.f185812e = z17;
    }

    @Override // ju2.s
    public void a() {
        java.lang.String str;
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp kpVar;
        int i17;
        int i18;
        int i19 = this.f185811d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20.Companion companion = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20.f204501f;
        dm.pd mention = this.f185810c;
        int a17 = companion.a(mention);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp rpVar = this.f185808a;
        rpVar.getClass();
        in5.s0 holder = this.f185809b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        if (a17 == 0 || a17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp kpVar2 = rpVar.f186031g;
            int i27 = kpVar2.f185384a == 1 ? 14 : 15;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
            int g17 = c14727x5e078d.g(mention);
            boolean z17 = mention.f66072xe412923f == 1;
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            android.content.Context context2 = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            long j17 = i27;
            int i28 = kpVar2.f185384a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = mention.f66078xad49d1db;
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj(o3Var, context2, j17, 1L, false, g17, 3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.l(c14727x5e078d, context2, i28, false, str, mention, z17, false, true, false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q3.f34709x366c91de, null), 8, null);
            boolean z18 = this.f185812e;
            int i29 = 2;
            int i37 = z18 ? 2 : 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.I2().r()).booleanValue()) {
                nv2.d1 d1Var = nv2.d1.f422008b;
                boolean z19 = !z18;
                java.lang.String field_finderUserName = mention.f66086x552bcd21;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finderUserName, "field_finderUserName");
                d1Var.getClass();
                int i38 = mention.f66129x2262335f;
                if (i38 != 1) {
                    if (i38 != 2) {
                        if (i38 == 15) {
                            i29 = 3;
                        } else if (i38 != 33) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.InteractActionMgr", "unexpected mention type with mentionID:" + mention.f66124x65f321b + " type:" + mention.f66129x2262335f);
                            context = context2;
                            kpVar = kpVar2;
                            i17 = 1;
                        } else {
                            i29 = 5;
                        }
                    }
                    i18 = i29;
                } else {
                    i18 = 1;
                }
                java.lang.String field_username = mention.f66131xdec927b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
                db2.k6 k6Var = new db2.k6(z19, field_finderUserName, field_username, i18, 0, java.lang.Long.valueOf(mention.f66124x65f321b), null, null, 192, null);
                k6Var.a(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g2.a(d1Var.f422009a, 600L, "mentionThank_" + mention.f66124x65f321b, new nv2.x0(k6Var, V6), null, null, 24, null);
                context = context2;
                kpVar = kpVar2;
                i17 = 1;
            } else {
                nv2.e2 e2Var = nv2.e2.f422014d;
                long j18 = mention.f66124x65f321b;
                java.lang.String field_finderUserName2 = mention.f66086x552bcd21;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finderUserName2, "field_finderUserName");
                java.lang.String field_username2 = mention.f66131xdec927b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username2, "field_username");
                e2Var.getClass();
                context = context2;
                kpVar = kpVar2;
                nv2.b2 b2Var = new nv2.b2(field_finderUserName2, field_username2, i37, i19, 0, V6, null, 64, null);
                b2Var.f421997k = java.lang.Long.valueOf(j18);
                e2Var.b(b2Var);
                i17 = 1;
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 d17 = b2Var.d(true);
                if (d17 != null) {
                    d17.e();
                }
            }
            if (z18 || kpVar.f185384a != i17) {
                return;
            }
            c14727x5e078d.a(context, i17);
        }
    }
}
