package xe2;

/* loaded from: classes3.dex */
public final class o extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535423c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f535424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535423c = "LiveCommonSysMsgInterceptor";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        if (ch1Var == null) {
            return;
        }
        int m75939xb282bd08 = ch1Var.m75939xb282bd08(1);
        java.lang.Object obj = null;
        r5 = null;
        java.lang.String str = null;
        if (m75939xb282bd08 == 20072) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535424d, ch1Var.m75945x2fec8307(2))) {
                return;
            }
            this.f535424d = ch1Var.m75945x2fec8307(2);
            r45.zh1 zh1Var = new r45.zh1();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
            if (m75934xbce7f2f != null) {
                zh1Var.mo11468x92b714fd(m75934xbce7f2f.g());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535423c, "from msg commonSysMsg content: " + zh1Var.m75945x2fec8307(0));
            java.lang.String m75945x2fec8307 = zh1Var.m75945x2fec8307(0);
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                r0 = 0;
            }
            if (r0 == 0) {
                dk2.xa xaVar = dk2.xa.f315877a;
                gk2.e eVar = this.f526800a;
                java.lang.String m75945x2fec83072 = zh1Var.m75945x2fec8307(0);
                if (eVar != null) {
                    java.util.List list = ((mm2.x4) eVar.a(mm2.x4.class)).f411061f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
                    synchronized (list) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            if (r26.i0.q(((dk2.zf) next).j(), m75945x2fec83072, false, 2, null)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    if (((dk2.zf) obj) == null || c01.id.c() - dk2.q5.f315475d >= 30000) {
                        r45.t12 t12Var = new r45.t12();
                        t12Var.set(3, 10001);
                        t12Var.set(2, m75945x2fec83072);
                        ((mm2.x4) eVar.a(mm2.x4.class)).f411061f.add(new dk2.mf(t12Var));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (m75939xb282bd08 != 20108) {
            return;
        }
        r45.nj1 nj1Var = new r45.nj1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = ch1Var.m75934xbce7f2f(4);
        if (m75934xbce7f2f2 != null) {
            nj1Var.mo11468x92b714fd(m75934xbce7f2f2.g());
        }
        long m75942xfb822ef2 = ch1Var.m75942xfb822ef2(12);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535423c, "from msg commonSysMsg notification content: " + nj1Var.m75945x2fec8307(1) + ", color:" + nj1Var.m75945x2fec8307(2) + ", seq:" + m75942xfb822ef2 + ", badge=" + nj1Var.m75945x2fec8307(5) + ", source:" + nj1Var.m75939xb282bd08(3));
        java.lang.String m75945x2fec83073 = nj1Var.m75945x2fec8307(1);
        if ((m75945x2fec83073 == null || m75945x2fec83073.length() == 0) == true) {
            return;
        }
        dk2.mf a17 = dk2.mf.f315305j.a(nj1Var, java.lang.Long.valueOf(m75942xfb822ef2));
        if (a17.b()) {
            ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) this.f526800a.a(mm2.c1.class)).f410385o);
            a17.q(b17 != null ? ya2.d.i(b17) : null, 3);
        }
        if (nj1Var.m75939xb282bd08(4) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535423c, "from msg commonSysMsg notification content, FloatTop");
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.c1) this.f526800a.a(mm2.c1.class)).Z1).k(a17);
        }
        ((mm2.x4) this.f526800a.a(mm2.x4.class)).f411061f.add(a17);
        r45.oj1 oj1Var = (r45.oj1) nj1Var.m75936x14adae67(6);
        if (((oj1Var == null || (c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) oj1Var.m75936x14adae67(2)) == null) ? null : c19786x6a1e28622.m76517xcb1f2fa3()) != null) {
            r45.oj1 oj1Var2 = (r45.oj1) nj1Var.m75936x14adae67(6);
            if (oj1Var2 != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) oj1Var2.m75936x14adae67(2)) != null) {
                str = c19786x6a1e2862.m76517xcb1f2fa3();
            }
            boolean z17 = new cl0.g(str).mo15080xc3ca103c("platform_reminder_notification_biz_type", 0) == 2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("card_type", z17 ? 2 : 1);
            java.lang.String str2 = this.f535423c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report anchor platform notice comment type = 1, cardType = ");
            sb6.append(z17 ? 2 : 1);
            sb6.append(", report str = ");
            sb6.append(jSONObject);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409894l2, jSONObject.toString(), null, 4, null);
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20072, 20108};
    }
}
