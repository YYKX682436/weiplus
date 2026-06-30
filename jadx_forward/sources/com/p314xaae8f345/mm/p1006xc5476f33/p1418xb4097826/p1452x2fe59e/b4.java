package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class b4 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f187883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f187884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a f187885c;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a) {
        this.f187883a = a7Var;
        this.f187884b = c14994x9b99c079;
        this.f187885c = c15268x6a41bd8a;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.util.HashMap hashMap;
        java.util.Iterator it;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        java.lang.String str;
        int i17;
        so2.y0 y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b4 b4Var = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var2 = b4Var.f187883a;
        android.content.Context context = a7Var2.f187740d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        java.util.Iterator it6 = exposedHolders.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            java.util.HashMap hashMap3 = a7Var2.Q;
            if (!hasNext) {
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it6.next();
            if (k3Var instanceof in5.s0) {
                in5.s0 s0Var = (in5.s0) k3Var;
                java.lang.Object obj = s0Var.f374658i;
                so2.y0 y0Var2 = obj instanceof so2.y0 ? (so2.y0) obj : null;
                if (y0Var2 != null) {
                    long mo2128x1ed62e84 = y0Var2.mo2128x1ed62e84();
                    hashMap2.put(java.lang.Long.valueOf(mo2128x1ed62e84), y0Var2);
                    if (!hashMap3.containsKey(java.lang.Long.valueOf(mo2128x1ed62e84))) {
                        r45.ky0 m76052x34c6289e = y0Var2.f492236d.u0().m76052x34c6289e();
                        if (m76052x34c6289e == null || (str = m76052x34c6289e.m75945x2fec8307(3)) == null) {
                            str = "";
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                        long j17 = a7Var2.f187754r;
                        java.lang.String str2 = nyVar2 != null ? nyVar2.f216918q : null;
                        java.lang.String str3 = nyVar2 != null ? nyVar2.f216915p : null;
                        java.lang.String str4 = nyVar2 != null ? nyVar2.f216919r : null;
                        if (nyVar2 != null) {
                            i17 = nyVar2.f216913n;
                            it = it6;
                        } else {
                            it = it6;
                            i17 = 0;
                        }
                        long m76784x5db1b11 = b4Var.f187884b.getFeedObject().m76784x5db1b11();
                        int i18 = b4Var.f187885c.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String();
                        int m8183xf806b362 = s0Var.m8183xf806b362();
                        so2.e0 e0Var = y0Var2.D;
                        a7Var = a7Var2;
                        nyVar = nyVar2;
                        hashMap = hashMap2;
                        long j18 = e0Var.f491854a + e0Var.f491855b;
                        o3Var.getClass();
                        java.lang.String m76097xcb1fb7dd = y0Var2.f492236d.u0().m76097xcb1fb7dd();
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6378x2b9e1c98 c6378x2b9e1c98 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6378x2b9e1c98();
                        if (str2 == null) {
                            str2 = "";
                        }
                        so2.y0 y0Var3 = y0Var2;
                        c6378x2b9e1c98.f137238d = c6378x2b9e1c98.b("SessionId", str2, true);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c6378x2b9e1c98.f137239e = c6378x2b9e1c98.b("ContextId", str3, true);
                        if (str4 == null) {
                            str4 = "";
                        }
                        c6378x2b9e1c98.f137240f = c6378x2b9e1c98.b("ClickTabContextId", str4, true);
                        c6378x2b9e1c98.f137241g = i17;
                        c6378x2b9e1c98.f137242h = c6378x2b9e1c98.b("feedid", pm0.v.u(m76784x5db1b11), true);
                        c6378x2b9e1c98.f137245k = o3Var.tk(i18);
                        c6378x2b9e1c98.f137248n = c6378x2b9e1c98.b("enterSessionID", java.lang.String.valueOf(j17), true);
                        c6378x2b9e1c98.f137246l = c6378x2b9e1c98.b("reportJson", m76097xcb1fb7dd != null ? r26.i0.t(m76097xcb1fb7dd, ",", ";", false) : null, true);
                        long j19 = m8183xf806b362 - 1;
                        if (j19 < 0) {
                            j19 = 0;
                        }
                        c6378x2b9e1c98.f137247m = j19;
                        c6378x2b9e1c98.f137249o = c6378x2b9e1c98.b("ad_report_data", r26.i0.t(str, ",", ";", false), true);
                        c6378x2b9e1c98.f137250p = 0L;
                        c6378x2b9e1c98.f137251q = j18;
                        int h17 = y0Var3.h();
                        if (h17 == 1 || h17 == 5) {
                            y0Var = y0Var3;
                            c6378x2b9e1c98.f137243i = c6378x2b9e1c98.b("rootCommentid", pm0.v.u(y0Var.f492236d.t0()), true);
                            c6378x2b9e1c98.f137244j = c6378x2b9e1c98.b("subCommentid", "", true);
                        } else {
                            y0Var = y0Var3;
                            if (h17 == 2) {
                                c6378x2b9e1c98.f137243i = c6378x2b9e1c98.b("rootCommentid", pm0.v.u(y0Var.f492236d.Y0()), true);
                                c6378x2b9e1c98.f137244j = c6378x2b9e1c98.b("subCommentid", pm0.v.u(y0Var.f492236d.t0()), true);
                            } else {
                                b4Var = this;
                                it6 = it;
                                a7Var2 = a7Var;
                                nyVar2 = nyVar;
                                hashMap2 = hashMap;
                            }
                        }
                        c6378x2b9e1c98.f137255u = y0Var.f492236d.w0();
                        cl0.g gVar = new cl0.g();
                        cl0.g gVar2 = new cl0.g();
                        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = y0Var.f492247r;
                        if (interfaceC4987x84e327cb != null) {
                            gVar2.h("pid", interfaceC4987x84e327cb.mo42930x4f4a97c4());
                            gVar2.h("emoticon_designerid", interfaceC4987x84e327cb.X0());
                            gVar2.h("emoticon_activityid", interfaceC4987x84e327cb.S0());
                        }
                        gVar.h("big_sticker_info", gVar2);
                        java.lang.String gVar3 = gVar.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
                        c6378x2b9e1c98.f137254t = c6378x2b9e1c98.b("extrainfo", r26.i0.t(gVar3, ",", ";", false), true);
                        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = y0Var.f492247r;
                        c6378x2b9e1c98.f137256v = c6378x2b9e1c98.b("EmoticonMd5", interfaceC4987x84e327cb2 != null ? interfaceC4987x84e327cb2.mo42933xb5885648() : null, true);
                        c6378x2b9e1c98.k();
                        o3Var.Zk(c6378x2b9e1c98);
                        b4Var = this;
                        it6 = it;
                        a7Var2 = a7Var;
                        nyVar2 = nyVar;
                        hashMap2 = hashMap;
                    }
                }
            }
            hashMap = hashMap2;
            it = it6;
            a7Var = a7Var2;
            nyVar = nyVar2;
            b4Var = this;
            it6 = it;
            a7Var2 = a7Var;
            nyVar2 = nyVar;
            hashMap2 = hashMap;
        }
    }
}
