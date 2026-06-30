package df2;

/* loaded from: classes3.dex */
public final class cy extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311448m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f311449n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Vector f311450o;

    /* renamed from: p, reason: collision with root package name */
    public r45.u12 f311451p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f311452q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f311453r;

    /* renamed from: s, reason: collision with root package name */
    public int f311454s;

    /* renamed from: t, reason: collision with root package name */
    public int f311455t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311448m = "Live.MsgBoxSpamController";
        this.f311450o = new java.util.Vector();
        this.f311452q = new java.util.ArrayList();
        this.f311455t = 1;
    }

    public final void Z6() {
        synchronized (this.f311450o) {
            java.util.ArrayList<r45.u12> arrayList = new java.util.ArrayList();
            arrayList.addAll(this.f311450o);
            for (r45.u12 u12Var : arrayList) {
                this.f311450o.remove(u12Var);
                c7(u12Var);
            }
        }
        r45.u12 u12Var2 = this.f311451p;
        if (u12Var2 != null) {
            d7(u12Var2);
        }
    }

    public final void a7() {
        r45.u12 u12Var = new r45.u12();
        u12Var.f468460d = 1;
        u12Var.f468462f = "安全打击title";
        u12Var.f468463g = "安全打击弹框content";
        u12Var.f468468o = "安全打击弹框short_content";
        u12Var.f468464h = "btn_title";
        if (this.f311455t % 2 > 0) {
            u12Var.f468464h = "无异议";
            r45.v12 v12Var = new r45.v12();
            v12Var.f469330d = "alert_id";
            v12Var.f469331e = 8;
            v12Var.f469332f = "申请复核";
            v12Var.f469333g = "review_title";
            v12Var.f469334h = "review_content";
            u12Var.f468469p = v12Var;
        }
        c7(u12Var);
        this.f311455t++;
    }

    public final void b7() {
        this.f311454s++;
        r45.u12 u12Var = new r45.u12();
        u12Var.f468460d = 2;
        u12Var.f468462f = "直播间存在违规行为直播间存在违规行为直播间存在违规行为直播间存在违规行为直播间存在违规行为直播间存在违规行为";
        u12Var.f468463g = "直播主题涉及利用学生名义博眼球反反复复凤飞飞反反复复付反反复复否否否";
        u12Var.f468464h = "我知道了";
        u12Var.f468465i = "https://dldir1v6.qq.com/weixin/checkresupdate/error_3714145a95bf447b832dbcad240813e1.png";
        if (this.f311454s % 2 == 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            u12Var.f468472s = linkedList;
            linkedList.add("当前直播间涉及抽烟内容，请及时整改，否则直播可能会被限流或掐断");
            for (int i17 = 0; i17 < 15; i17++) {
                linkedList.add("直播主题涉及利用学生名义博眼球");
            }
            linkedList.add("昵称涉及低俗色情");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            c19786x6a1e2862.m76550x2592a27b(2);
            c19786x6a1e2862.m76570xc2385d6("去申诉");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 c19799x6a7e198 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198();
            c19799x6a7e198.m77171xca029dad("https://weixin110.qq.com/security/con/newreadtemplate?t=appeal/index.html&commentScene=0#/submit?live_key=75727970725641521766394783815&type=live&punish_id=FD202512221726301693418164&from_living=true&appeal_source=2");
            c19799x6a7e198.m77169x53b6de6f(0);
            c19799x6a7e198.m77168x732aba2f(0);
            c19786x6a1e2862.m76541x751b57e5(c19799x6a7e198);
            u12Var.f468470q = c19786x6a1e2862;
            r45.w12 w12Var = new r45.w12();
            w12Var.f470314d = 1;
            u12Var.f468473t = w12Var;
        }
        d7(u12Var);
    }

    public final void c7(r45.u12 it) {
        df2.k kVar = (df2.k) m56789x25fe639c(df2.k.class);
        if (kVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f312055m, "notifyWarning FinderLiveMsgBoxInfo hash:" + it.hashCode() + ", type:" + it.f468460d + ", desc:" + it.f468468o);
            if (it.f468460d == 1 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it, kVar.f312062t)) {
                kVar.f312062t = it;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                java.lang.String str = it.f468462f;
                if (str == null) {
                    str = "";
                }
                jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str);
                java.lang.String str2 = it.f468468o;
                jSONObject.put("desc", str2 != null ? str2 : "");
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                kVar.a7("liveWarning", jSONObject2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        java.util.Vector vector = this.f311450o;
        if (ubVar != null && !this.f311453r) {
            vector.remove(it);
            e7(it);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311448m, "processAlert, isPause:" + this.f311453r + ", add to pendingAlerts:" + it.hashCode() + ", " + it.mo12245xcc313de3());
        vector.add(it);
    }

    public final void d7(r45.u12 u12Var) {
        if (this.f372632e != null && !this.f311453r) {
            this.f311451p = null;
            e7(u12Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311448m, "processPopup, isPause:" + this.f311453r + ", set to pendingPopup:" + u12Var.hashCode() + ", " + u12Var.mo12245xcc313de3());
        this.f311451p = u12Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7(r45.u12 r25) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cy.e7(r45.u12):void");
    }

    public final void f7(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, android.content.Context context) {
        java.lang.String str5 = "showAlertInfo type:" + i17 + ",title:" + str + ",content:" + str2 + ",buttonTitle:" + str3 + ",iconName:" + str4 + ",uiStyle:" + i18;
        java.lang.String str6 = this.f311448m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str6, str5);
        if (str != null) {
            try {
                int identifier = context.getResources().getIdentifier(str4, "drawable", context.getPackageName());
                int identifier2 = context.getResources().getIdentifier(str4, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463, context.getPackageName());
                if (identifier2 != 0) {
                    identifier = identifier2;
                }
                if (identifier != 0) {
                    pm0.v.X(new df2.qx(context, str, identifier));
                } else {
                    pm0.v.X(new df2.rx(str, i18, context));
                }
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.E, "1", null, 4, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str6, "showAlertInfo exception:" + e17.getMessage());
                pm0.v.X(new df2.rx(str, i18, context));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        java.util.Iterator it = this.f311452q.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) ((java.lang.ref.WeakReference) it.next()).get();
            if (j0Var != null) {
                if (!j0Var.isShowing()) {
                    j0Var = null;
                }
                if (j0Var != null) {
                    j0Var.dismiss();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0048 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo14867x5aa1c816(r45.r71 r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cy.mo14867x5aa1c816(r45.r71):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onNormalMode */
    public void mo14868x7c41fe69() {
        super.mo14868x7c41fe69();
        if (zl2.q4.f555466a.E()) {
            ae2.in inVar = ae2.in.f85221a;
            inVar.a0();
            inVar.U();
            inVar.V();
            java.lang.Object r17 = ((nb2.a) ((jz5.n) ae2.in.f85462y5).mo141623x754a37bb()).r();
            if (!((java.lang.Boolean) r17).booleanValue()) {
                r17 = null;
            }
            java.lang.Boolean bool = (java.lang.Boolean) r17;
            if (bool != null) {
                bool.booleanValue();
                b7();
            }
            java.lang.Object r18 = ((nb2.a) ((jz5.n) ae2.in.A5).mo141623x754a37bb()).r();
            if (!((java.lang.Boolean) r18).booleanValue()) {
                r18 = null;
            }
            java.lang.Boolean bool2 = (java.lang.Boolean) r18;
            if (bool2 != null) {
                bool2.booleanValue();
                a7();
            }
            java.lang.Object r19 = ((nb2.a) ((jz5.n) ae2.in.C5).mo141623x754a37bb()).r();
            java.lang.Boolean bool3 = (java.lang.Boolean) (((java.lang.Boolean) r19).booleanValue() ? r19 : null);
            if (bool3 != null) {
                bool3.booleanValue();
                r45.u12 u12Var = new r45.u12();
                u12Var.f468460d = 0;
                u12Var.f468462f = "安全打击toast title";
                u12Var.f468463g = "安全打击toast content";
                u12Var.f468468o = "安全打击toast short_content";
                u12Var.f468464h = "btn_title";
                e7(u12Var);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        Z6();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f311452q.clear();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f311449n;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f311449n = null;
    }

    @Override // if2.e
    /* renamed from: pause */
    public void mo124180x65825f6() {
        this.f311453r = true;
    }

    @Override // if2.e
    /* renamed from: resume */
    public void mo57157xc84dc82d() {
        this.f311453r = false;
        Z6();
    }
}
