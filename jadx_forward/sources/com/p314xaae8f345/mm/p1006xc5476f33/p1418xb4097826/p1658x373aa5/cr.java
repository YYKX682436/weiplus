package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class cr implements ss5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er f213331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f213332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f213333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f213334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213335e;

    public cr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er erVar, android.content.Intent intent, int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str) {
        this.f213331a = erVar;
        this.f213332b = intent;
        this.f213333c = i17;
        this.f213334d = c19792x256d2725;
        this.f213335e = str;
    }

    @Override // ss5.d0
    public void d(com.p314xaae8f345.mm.p944x882e457a.f it) {
        android.content.Intent intent;
        int i17;
        r45.rp1 rp1Var;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.z61) it.f152151d).m75936x14adae67(1);
        if (c19792x256d2725 != null) {
            java.lang.String str = this.f213335e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er erVar = this.f213331a;
            boolean z18 = erVar.f213589d;
            android.content.Intent intent2 = this.f213332b;
            android.content.Context context = erVar.f213586a;
            if (z18) {
                intent = intent2;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                zy2.v9 v9Var = (zy2.v9) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.v9.class);
                r45.md5 md5Var = new r45.md5();
                r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
                md5Var.set(1, java.lang.Long.valueOf(m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa aaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) v9Var;
                android.content.Intent intent3 = intent2 == null ? new android.content.Intent() : intent2;
                r45.md5 md5Var2 = aaVar.f198440e;
                if (md5Var2 != null) {
                    intent = intent2;
                    if (md5Var2.m75942xfb822ef2(0) == erVar.f213590e) {
                        z17 = true;
                        if (!z17 || aaVar.f198441f) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa.f198438h.a(intent3, aaVar.f198439d, md5Var);
                        }
                    }
                } else {
                    intent = intent2;
                }
                z17 = false;
                if (!z17) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa.f198438h.a(intent3, aaVar.f198439d, md5Var);
            }
            c61.p2 p2Var = (c61.p2) ((c61.yb) i95.n0.c(c61.yb.class));
            int i18 = this.f213333c;
            p2Var.Fj(c19792x256d2725, i18);
            java.lang.String name = context.getClass().getName();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f213334d;
            if (c19792x256d27252 == null) {
                c19792x256d27252 = c19792x256d2725;
            }
            erVar.d(name, c19792x256d27252, erVar.f213588c, erVar.f213589d, 0L, str);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
            if (m76760x76845fea != null && m76760x76845fea.m76177x2220c3f4() == 1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[9];
                i17 = 0;
                lVarArr[0] = new jz5.l("feed_id", pm0.v.u(c19792x256d2725.m76784x5db1b11()));
                r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
                lVarArr[1] = new jz5.l("live_id", m76794xd05571302 != null ? pm0.v.u(m76794xd05571302.m75942xfb822ef2(0)) : null);
                lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = c19792x256d2725.m76760x76845fea();
                lVarArr[3] = new jz5.l("finder_username", m76760x76845fea2 != null ? m76760x76845fea2.m76197x6c03c64c() : null);
                lVarArr[4] = new jz5.l("session_buffer", c19792x256d2725.m76829x97edf6c0());
                lVarArr[5] = new jz5.l("behaviour_session_id", V6.m75945x2fec8307(1));
                lVarArr[6] = new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2));
                ml2.v1 v1Var = ml2.v1.f409673e;
                lVarArr[7] = new jz5.l("live_enter_status", 1L);
                lVarArr[8] = new jz5.l("share_username", "");
                ((cy1.a) rVar).Cj("finder_feed_living_label_click", null, kz5.c1.k(lVarArr), 26236);
            } else {
                i17 = 0;
            }
            r45.nw1 m76794xd05571303 = c19792x256d2725.m76794xd0557130();
            android.content.Intent intent4 = intent;
            intent4.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", m76794xd05571303 != null ? m76794xd05571303.m75939xb282bd08(42) : i17);
            r45.nw1 m76794xd05571304 = c19792x256d2725.m76794xd0557130();
            if (m76794xd05571304 == null || (rp1Var = (r45.rp1) m76794xd05571304.m75936x14adae67(45)) == null) {
                return;
            }
            intent4.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.mo14344x5f01b1f6());
        }
    }
}
