package s74;

/* loaded from: classes4.dex */
public final class k1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f485919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f485920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f485921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f485922g;

    public k1(s74.f3 f3Var, s74.o2 o2Var, java.lang.String str, java.lang.String str2) {
        this.f485919d = f3Var;
        this.f485920e = o2Var;
        this.f485921f = str;
        this.f485922g = str2;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        org.json.JSONObject g17;
        java.lang.String x17;
        android.widget.Button g18;
        org.json.JSONObject g19;
        java.lang.String x18;
        android.widget.Button g27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2$1");
        i64.r rVar = (i64.r) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2$1");
        s74.f3 f3Var = this.f485919d;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd c17 = f3Var.c();
        if (c17 != null) {
            c17.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
        }
        s74.o2 o2Var = this.f485920e;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o2Var.j(), "null in observe AdDownloadModel! " + this.f485921f + ' ' + this.f485922g);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd c18 = f3Var.c();
            if (c18 != null) {
                c18.setImageResource(com.p314xaae8f345.mm.R.raw.f80471x5ecaa67);
            }
            android.widget.Button g28 = f3Var.g();
            if (g28 != null && (g19 = s74.q4.f486046a.g(g28)) != null && (x18 = s74.u3.f486095a.x(g19, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, f3Var.e())) != null && (g27 = f3Var.g()) != null) {
                g27.setText(x18);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o2Var.j(), "observeActionButtonUI state = " + rVar.a());
            int a17 = rVar.a();
            if (a17 == 1) {
                android.widget.Button g29 = f3Var.g();
                if (g29 != null) {
                    g29.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574698j62);
                }
            } else if (a17 == 2) {
                android.widget.Button g37 = f3Var.g();
                if (g37 != null) {
                    g37.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j67);
                }
            } else if (a17 == 3) {
                android.widget.Button g38 = f3Var.g();
                if (g38 != null) {
                    g38.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574699j63);
                }
            } else if (a17 != 5) {
                android.widget.Button g39 = f3Var.g();
                if (g39 != null && (g17 = s74.q4.f486046a.g(g39)) != null && (x17 = s74.u3.f486095a.x(g17, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, f3Var.e())) != null && (g18 = f3Var.g()) != null) {
                    g18.setText(x17);
                }
            } else {
                android.widget.Button g47 = f3Var.g();
                if (g47 != null) {
                    g47.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574700j64);
                }
            }
            if (rVar.a() == 5) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd c19 = f3Var.c();
                if (c19 != null) {
                    c19.setImageResource(com.p314xaae8f345.mm.R.raw.f78391x28090db6);
                }
            } else {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd c27 = f3Var.c();
                if (c27 != null) {
                    c27.setImageResource(com.p314xaae8f345.mm.R.raw.f80471x5ecaa67);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2$1");
        return f0Var;
    }
}
