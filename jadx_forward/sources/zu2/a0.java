package zu2;

/* loaded from: classes8.dex */
public final class a0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f557225d;

    /* renamed from: e, reason: collision with root package name */
    public r45.i33 f557226e;

    /* renamed from: f, reason: collision with root package name */
    public zu2.q f557227f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f557228g;

    /* renamed from: h, reason: collision with root package name */
    public jx2.j f557229h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f557230i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f557231m;

    /* renamed from: n, reason: collision with root package name */
    public int f557232n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f557233o;

    /* renamed from: p, reason: collision with root package name */
    public int f557234p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f557235q;

    /* renamed from: r, reason: collision with root package name */
    public mn2.j4 f557236r;

    /* renamed from: s, reason: collision with root package name */
    public int f557237s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm f557238t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f557225d = "Finder.WxaAdUIC";
        this.f557232n = 15;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        cw2.f8 f8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 nb0Var;
        if (!(this.f557226e != null) || this.f557233o) {
            return super.mo2274xbdc3c5dc();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = this.f557238t;
        if (qmVar != null && (f8Var = qmVar.f187962o) != null && (nb0Var = f8Var.f305233h) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) nb0Var).c7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m80379x76847179());
        u1Var.g(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cjs));
        u1Var.n(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq));
        u1Var.l(zu2.w.f557285a);
        u1Var.j(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmj));
        u1Var.i(new zu2.x(this));
        u1Var.e(new zu2.y(this));
        u1Var.q(false);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        fc2.c n17;
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ggn);
        if (this.f557226e != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo144222x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.f564848aa4);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79678x41464de0);
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560794ud));
            }
            c22699x3dcdb352.getLayoutParams().width = (int) m158361x893a2f6f().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            c22699x3dcdb352.getLayoutParams().height = (int) m158361x893a2f6f().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ggl);
            if (mo144222x4ff8c0f02 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo144222x4ff8c0f02, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mo144222x4ff8c0f02.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(m80379x76847179());
            android.view.View decorView = m158354x19263085().getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.adx, (android.view.ViewGroup) decorView, true);
            android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564162jr);
            this.f557228g = (android.widget.TextView) mo144222x4ff8c0f03.findViewById(com.p314xaae8f345.mm.R.id.f564164js);
            mo144222x4ff8c0f03.setPadding(0, com.p314xaae8f345.mm.ui.bl.h(m158354x19263085()), 0, 0);
            com.p314xaae8f345.mm.ui.a4.g(mo144222x4ff8c0f03, true);
            pm0.v.X(new zu2.v(this));
            r45.i33 i33Var = this.f557226e;
            if (i33Var != null) {
                zu2.q qVar = new zu2.q(m80379x76847179(), i33Var);
                this.f557227f = qVar;
                r45.i33 i33Var2 = qVar.f557264a;
                qVar.f557268e = c01.id.c();
                try {
                    java.lang.String m75945x2fec8307 = i33Var2.m75945x2fec8307(5);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject(m75945x2fec8307);
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
                    if (optJSONObject == null) {
                        optJSONObject = new org.json.JSONObject();
                    }
                    jSONObject.put("report_type", 1);
                    jSONObject.put("report_link", i33Var2.m75945x2fec8307(3));
                    jSONObject.put("viewable", false);
                    jSONObject.put("exposure_type", 0);
                    optJSONObject.put("exp_time", qVar.f557268e);
                    optJSONObject.put("clk_time", 0);
                    jSONObject.put("weapp_extra_data", optJSONObject.toString());
                    if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K().r()).booleanValue()) {
                        java.lang.String jSONObject2 = jSONObject.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                        new db2.m2(1, jSONObject2, null).l();
                    } else {
                        java.lang.String jSONObject3 = jSONObject.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                        gm0.j1.d().g(new db2.w5(1, jSONObject3));
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(qVar.f557265b, th6, "reportExpose", new java.lang.Object[0]);
                }
                boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209217eh).mo141623x754a37bb()).r()).booleanValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdFeedbackSwitch", "WxaAdUIC, useRefactor=" + booleanValue);
                if (booleanValue) {
                    android.view.View findViewById = mo144222x4ff8c0f03.findViewById(com.p314xaae8f345.mm.R.id.f564156jl);
                    android.view.View findViewById2 = mo144222x4ff8c0f03.findViewById(com.p314xaae8f345.mm.R.id.hvm);
                    this.f557230i = findViewById;
                    this.f557231m = findViewById2;
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new zu2.t(this, i33Var, qVar, findViewById2, findViewById));
                    }
                } else {
                    new zu2.o(m80379x76847179(), mo144222x4ff8c0f03, i33Var, qVar);
                }
            }
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
                return;
            }
            n17.a(new zu2.u(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2277xb2f1ab1a(android.os.Bundle r4) {
        /*
            r3 = this;
            super.mo2277xb2f1ab1a(r4)
            r45.i33 r4 = new r45.i33
            r4.<init>()
            android.content.Intent r0 = r3.m158359x1e885992()
            java.lang.String r1 = "KEY_MINI_APP_AD_FLOW_INFO"
            byte[] r0 = r0.getByteArrayExtra(r1)
            r1 = 0
            if (r0 != 0) goto L17
        L15:
            r4 = r1
            goto L28
        L17:
            r4.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L1b
            goto L28
        L1b:
            r4 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r2 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r2, r0, r4)
            goto L15
        L28:
            r3.f557226e = r4
            if (r4 == 0) goto L3f
            r0 = 10
            int r1 = r4.m75939xb282bd08(r0)
            if (r1 <= 0) goto L3b
            int r4 = r4.m75939xb282bd08(r0)
            r3.f557232n = r4
            goto L3f
        L3b:
            r4 = 15
            r3.f557232n = r4
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu2.a0.mo2277xb2f1ab1a(android.os.Bundle):void");
    }
}
