package im2;

/* loaded from: classes3.dex */
public final class t6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f374087d;

    /* renamed from: e, reason: collision with root package name */
    public int f374088e;

    /* renamed from: f, reason: collision with root package name */
    public int f374089f;

    /* renamed from: g, reason: collision with root package name */
    public r45.k30 f374090g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f374091h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374092i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374093m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374094n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f374095o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f374096p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f374097q;

    /* renamed from: r, reason: collision with root package name */
    public int f374098r;

    /* renamed from: s, reason: collision with root package name */
    public int f374099s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f374100t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f374087d = "FinderLiveVisitorReportUIC@" + hashCode() + '}';
        this.f374092i = "";
        this.f374093m = "";
        this.f374094n = "";
        this.f374095o = "";
        this.f374098r = -1;
        this.f374099s = -1;
        this.f374100t = "";
    }

    public final java.lang.String O6(java.lang.String str) {
        if (str == null) {
            return "";
        }
        if (!(this.f374100t.length() > 0)) {
            return str;
        }
        try {
            org.json.JSONObject jSONObject = str.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(r26.i0.t(str, ";", ",", false));
            jSONObject.put("session_type", this.f374098r);
            jSONObject.put("share_username", this.f374100t);
            jSONObject.put("is_enterprise", this.f374099s);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374087d, "append ChatFields err: " + e17.getMessage());
            return str;
        }
    }

    public final void P6(r45.gc1 request) {
        java.lang.Object obj;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (str = ((mm2.c1) eVar.a(mm2.c1.class)).f410377m5) == null) {
            obj = this.f374091h;
        } else {
            byte[] bytes = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            obj = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        }
        request.set(22, obj);
        java.lang.String str2 = "[fillJoinLiveReq], request.ux_info = " + request.m75934xbce7f2f(22);
        java.lang.String str3 = this.f374087d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        request.set(24, this.f374093m);
        request.set(28, this.f374094n);
        java.lang.Object l07 = zl2.r4.f555483a.l0("source_type");
        if (l07 == null) {
            l07 = "";
        }
        request.set(29, l07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[fillJoinLiveReq], func_msg_report_ext_info = " + request.m75945x2fec8307(29));
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f374096p;
        if (gVar != null) {
            request.set(34, gVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[fillJoinLiveReq], open_live_h5_buffer size = " + gVar.f273689a.length);
        }
        this.f374093m = "";
        this.f374094n = "";
        this.f374096p = null;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        im2.n nVar = (im2.n) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.n.class);
        nVar.getClass();
        if (request.m75942xfb822ef2(2) == nVar.f373982d) {
            r45.li4 li4Var = nVar.f373984f;
            if (li4Var != null) {
                r45.jr0 jr0Var = new r45.jr0();
                jr0Var.set(1, li4Var);
                request.set(26, jr0Var);
            }
            nVar.f373984f = null;
        }
    }

    public final void Q6(long j17, r45.kv0 kv0Var) {
        java.util.LinkedList m75941xfb821914;
        if (this.f374092i != null && kv0Var != null && (m75941xfb821914 = kv0Var.m75941xfb821914(7)) != null) {
            r45.fl2 fl2Var = new r45.fl2();
            fl2Var.set(0, java.lang.Long.valueOf(j17));
            fl2Var.set(1, this.f374092i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374087d, "fillObjectBaseInfoOnce id:" + pm0.v.u(fl2Var.m75942xfb822ef2(0)) + ", jumperSessionBuffer:" + fl2Var.m75945x2fec8307(1));
            m75941xfb821914.add(fl2Var);
        }
        this.f374092i = null;
    }

    public final void R6(r45.o72 baseInfo) {
        r45.nw1 nw1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        baseInfo.set(11, java.lang.Integer.valueOf(this.f374088e));
        if (((r45.x24) baseInfo.m75936x14adae67(18)) == null) {
            baseInfo.set(18, new r45.x24());
        }
        r45.x24 x24Var = (r45.x24) baseInfo.m75936x14adae67(18);
        if (x24Var != null) {
            x24Var.set(0, java.lang.Integer.valueOf(this.f374089f));
        }
        r45.x24 x24Var2 = (r45.x24) baseInfo.m75936x14adae67(18);
        if (x24Var2 != null) {
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zy2.v9 v9Var = (zy2.v9) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.v9.class);
            gk2.e eVar = gk2.e.f354004n;
            long m75942xfb822ef2 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa aaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) v9Var;
            r45.md5 md5Var = aaVar.f198440e;
            x24Var2.set(1, md5Var != null && (md5Var.m75942xfb822ef2(1) > m75942xfb822ef2 ? 1 : (md5Var.m75942xfb822ef2(1) == m75942xfb822ef2 ? 0 : -1)) == 0 ? aaVar.f198439d : "");
        }
        r45.k30 k30Var = this.f374090g;
        if (k30Var != null) {
            baseInfo.set(16, k30Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillReportBaseInfo noticeType:");
        sb6.append(this.f374088e);
        sb6.append(", notificationMsgType:");
        sb6.append(this.f374089f);
        sb6.append(", last_g_msg_id:");
        r45.x24 x24Var3 = (r45.x24) baseInfo.m75936x14adae67(18);
        sb6.append(x24Var3 != null ? x24Var3.m75945x2fec8307(1) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f374087d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("fillReportBaseInfo chnlExtraInfo:");
        r45.k30 k30Var2 = this.f374090g;
        sb8.append(pm0.v.u(k30Var2 != null ? k30Var2.m75942xfb822ef2(0) : 0L));
        sb8.append(", ");
        r45.k30 k30Var3 = this.f374090g;
        sb8.append(k30Var3 != null ? java.lang.Integer.valueOf(k30Var3.m75939xb282bd08(1)) : null);
        sb8.append(", sourceType:");
        r45.k30 k30Var4 = this.f374090g;
        sb8.append(k30Var4 != null ? k30Var4.m75945x2fec8307(6) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        r45.ta4 ta4Var;
        r45.ta4 ta4Var2;
        r45.ta4 ta4Var3;
        r45.ta4 ta4Var4;
        r45.ta4 ta4Var5;
        r45.ta4 ta4Var6;
        r45.ta4 ta4Var7;
        r45.ta4 ta4Var8;
        r45.ta4 ta4Var9;
        r45.ta4 ta4Var10;
        r45.ta4 ta4Var11;
        r45.ta4 ta4Var12;
        r45.nw1 nw1Var;
        gk2.e eVar = gk2.e.f354004n;
        boolean z17 = false;
        long m75942xfb822ef2 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
        dk2.x4 a17 = dk2.x4.C.a(m158359x1e885992());
        java.lang.String str = null;
        if (a17 == null && m75942xfb822ef2 != 0) {
            dk2.ef efVar = dk2.ef.f314905a;
            km2.n nVar = dk2.ef.H;
            a17 = nVar != null ? nVar.f390688g : null;
        }
        this.f374088e = (a17 == null || (ta4Var12 = a17.B) == null) ? 0 : ta4Var12.m75939xb282bd08(0);
        this.f374089f = (a17 == null || (ta4Var11 = a17.B) == null) ? 0 : ta4Var11.m75939xb282bd08(12);
        this.f374090g = (a17 == null || (ta4Var10 = a17.B) == null) ? null : (r45.k30) ta4Var10.m75936x14adae67(13);
        this.f374091h = (a17 == null || (ta4Var9 = a17.B) == null) ? null : ta4Var9.m75934xbce7f2f(1);
        this.f374092i = (a17 == null || (ta4Var8 = a17.B) == null) ? null : ta4Var8.m75945x2fec8307(2);
        r45.ta4 ta4Var13 = a17 != null ? a17.B : null;
        if (ta4Var13 != null) {
            ta4Var13.set(2, null);
        }
        this.f374093m = (a17 == null || (ta4Var7 = a17.B) == null) ? null : ta4Var7.m75945x2fec8307(3);
        this.f374094n = (a17 == null || (ta4Var6 = a17.B) == null) ? null : ta4Var6.m75945x2fec8307(15);
        r45.ta4 ta4Var14 = a17 != null ? a17.B : null;
        if (ta4Var14 != null) {
            ta4Var14.set(3, null);
        }
        r45.ta4 ta4Var15 = a17 != null ? a17.B : null;
        if (ta4Var15 != null) {
            ta4Var15.set(15, null);
        }
        this.f374096p = (a17 == null || (ta4Var5 = a17.B) == null) ? null : ta4Var5.m75934xbce7f2f(36);
        r45.ta4 ta4Var16 = a17 != null ? a17.B : null;
        if (ta4Var16 != null) {
            ta4Var16.set(36, null);
        }
        int i17 = -1;
        this.f374098r = (a17 == null || (ta4Var4 = a17.B) == null) ? -1 : ta4Var4.m75939xb282bd08(4);
        if (a17 != null && (ta4Var3 = a17.B) != null) {
            i17 = ta4Var3.m75939xb282bd08(6);
        }
        this.f374099s = i17;
        if (a17 != null && (ta4Var2 = a17.B) != null) {
            str = ta4Var2.m75945x2fec8307(5);
        }
        if (str == null) {
            str = "";
        }
        this.f374100t = str;
        if (a17 != null && (ta4Var = a17.B) != null) {
            z17 = ta4Var.m75933x41a8a7f2(7);
        }
        this.f374097q = z17;
        if (z17) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            a52.a.d("194");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.getClass();
            y4Var.f409819a = "194";
        }
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("FINDER_PRODUCT_LAST_GLOBAL_MSG_ID");
        this.f374095o = stringExtra != null ? stringExtra : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374087d, "onCreate noticeType:" + this.f374088e + ", notificationMsgType:" + this.f374089f + ", snsUxInfo:" + this.f374091h);
    }
}
