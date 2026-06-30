package zl2;

/* loaded from: classes2.dex */
public final class d2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f555247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f555249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555250g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555251h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f555252i;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, r45.qt2 qt2Var, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.a aVar) {
        this.f555247d = abstractC14490x69736cb5;
        this.f555248e = i17;
        this.f555249f = qt2Var;
        this.f555250g = context;
        this.f555251h = h0Var;
        this.f555252i = aVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.qw1 qw1Var;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        int i18 = this.f555248e;
        r45.qt2 qt2Var = this.f555249f;
        android.content.Context context = this.f555250g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f555247d;
        if (valueOf != null && valueOf.intValue() == 99) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.t1 t1Var = ml2.t1.f409467a2;
            jz5.l[] lVarArr = new jz5.l[3];
            r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
            lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null));
            lVarArr[1] = new jz5.l("feedId", java.lang.String.valueOf(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()));
            lVarArr[2] = new jz5.l("panel_sence", i18 != 1005 ? "4" : "2");
            zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, java.lang.String.valueOf(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null), null, null, false, 112, null);
            long m76784x5db1b11 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11();
            java.lang.String m59276x6c285d75 = abstractC14490x69736cb5.getFeedObject().m59276x6c285d75();
            r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
            pq5.g l17 = new ek2.u0(m76784x5db1b11, m59276x6c285d75, m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null, 1, 0, this.f555249f, 3).l();
            l17.H(new zl2.c2(context, this.f555252i));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
        } else if (valueOf != null && valueOf.intValue() == 101) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = abstractC14490x69736cb5.getFeedObject().getFeedObject();
            if (feedObject != null) {
                r45.qt2 qt2Var2 = this.f555249f;
                android.content.Context context2 = this.f555250g;
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.t1 t1Var2 = ml2.t1.f409469b2;
                jz5.l[] lVarArr2 = new jz5.l[3];
                r45.nw1 m59258xd05571302 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
                lVarArr2[0] = new jz5.l("liveid", java.lang.String.valueOf(m59258xd05571302 != null ? java.lang.Long.valueOf(m59258xd05571302.m75942xfb822ef2(0)) : null));
                lVarArr2[1] = new jz5.l("feedid", pm0.v.u(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()));
                lVarArr2[2] = new jz5.l("panel_sence", i18 != 1005 ? "4" : "2");
                zy2.zb.T8(zbVar2, t1Var2, kz5.c1.l(lVarArr2), qt2Var2 != null ? qt2Var2.m75945x2fec8307(1) : null, java.lang.String.valueOf(qt2Var2 != null ? java.lang.Integer.valueOf(qt2Var2.m75939xb282bd08(5)) : null), null, null, false, 112, null);
                i95.m c19 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                c61.yb ybVar = (c61.yb) c19;
                r45.nw1 m76794xd0557130 = feedObject.m76794xd0557130();
                long m75942xfb822ef2 = m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L;
                java.lang.String m76836x6c03c64c = feedObject.m76836x6c03c64c();
                if (m76836x6c03c64c == null) {
                    m76836x6c03c64c = "";
                }
                ((c61.p2) ybVar).xj(context2, qt2Var2, m75942xfb822ef2, m76836x6c03c64c, null, 62, feedObject);
            }
        } else if (valueOf != null && valueOf.intValue() == 403) {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            r45.s02 s02Var = new r45.s02();
            s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
            s02Var.set(3, 8);
            ((b92.d1) zbVar3).uj(context, s02Var);
            i95.m c27 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
            zy2.zb.T8((zy2.zb) c27, ml2.t1.W2, kz5.c1.i(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "8")), qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)).toString() : null, null, null, false, 112, null);
        } else if (valueOf != null && valueOf.intValue() == 211) {
            r45.dm2 m76806xdef680642 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
            java.lang.String m75945x2fec8307 = (m76806xdef680642 == null || (qw1Var = (r45.qw1) m76806xdef680642.m75936x14adae67(14)) == null) ? null : qw1Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "clickInnerData but innerUrl is null");
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", m75945x2fec8307);
                intent.putExtra("convertActivityFromTranslucent", true);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) this.f555251h.f391656d;
        if (k0Var != null) {
            k0Var.u();
        }
    }
}
