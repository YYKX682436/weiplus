package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class dr implements ss5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f213459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er f213460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f213461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f213463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f213464f;

    public dr(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er erVar, long j17, java.lang.String str, int i17, android.content.Intent intent) {
        this.f213459a = c19792x256d2725;
        this.f213460b = erVar;
        this.f213461c = j17;
        this.f213462d = str;
        this.f213463e = i17;
        this.f213464f = intent;
    }

    @Override // ss5.d0
    public void b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject) {
        r45.rp1 rp1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f213459a;
        if (c19792x256d2725 != null && c19792x256d2725.m76794xd0557130() == null) {
            c19792x256d2725.m76887xcb0dd23c(finderObject.m76794xd0557130());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er erVar = this.f213460b;
        java.lang.String name = erVar.f213586a.getClass().getName();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = c19792x256d2725 == null ? finderObject : c19792x256d2725;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er erVar2 = this.f213460b;
        erVar.d(name, c19792x256d27252, erVar2.f213588c, erVar2.f213589d, this.f213461c, this.f213462d);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = finderObject.m76760x76845fea();
        if (m76760x76845fea != null && m76760x76845fea.m76177x2220c3f4() == 1) {
            android.content.Context context = erVar2.f213586a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[9];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(finderObject.m76784x5db1b11()));
            r45.nw1 m76794xd0557130 = finderObject.m76794xd0557130();
            lVarArr[1] = new jz5.l("live_id", m76794xd0557130 != null ? pm0.v.u(m76794xd0557130.m75942xfb822ef2(0)) : null);
            lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(this.f213463e));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = finderObject.m76760x76845fea();
            lVarArr[3] = new jz5.l("finder_username", m76760x76845fea2 != null ? m76760x76845fea2.m76197x6c03c64c() : null);
            lVarArr[4] = new jz5.l("session_buffer", finderObject.m76829x97edf6c0());
            lVarArr[5] = new jz5.l("behaviour_session_id", V6.m75945x2fec8307(1));
            lVarArr[6] = new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2));
            ml2.v1 v1Var = ml2.v1.f409673e;
            lVarArr[7] = new jz5.l("live_enter_status", 1L);
            lVarArr[8] = new jz5.l("share_username", "");
            ((cy1.a) rVar).Cj("finder_feed_living_label_click", null, kz5.c1.k(lVarArr), 26236);
        }
        r45.nw1 m76794xd05571302 = finderObject.m76794xd0557130();
        int m75939xb282bd08 = m76794xd05571302 != null ? m76794xd05571302.m75939xb282bd08(42) : 0;
        android.content.Intent intent = this.f213464f;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", m75939xb282bd08);
        r45.nw1 m76794xd05571303 = finderObject.m76794xd0557130();
        if (m76794xd05571303 == null || (rp1Var = (r45.rp1) m76794xd05571303.m75936x14adae67(45)) == null) {
            return;
        }
        intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.mo14344x5f01b1f6());
    }
}
