package c84;

/* loaded from: classes4.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f121221d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f121222e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f121223f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f121224g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f121225h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f121226i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f121227m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f121228n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f121229o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f121230p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f121231q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f121232r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f121233s;

    /* renamed from: t, reason: collision with root package name */
    public s34.a f121234t;

    /* renamed from: u, reason: collision with root package name */
    public final int f121235u;

    /* renamed from: v, reason: collision with root package name */
    public w64.k f121236v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f121237w;

    public c(android.content.Context context, int i17) {
        this.f121221d = context;
        this.f121235u = i17;
    }

    public static void a(c84.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = cVar.f121223f;
        if (u3Var != null && u3Var.isShowing()) {
            cVar.f121223f.dismiss();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.ADAppointmentHalfScreenWidget", "hideProgressDlg");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public static /* synthetic */ s34.a b(c84.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        s34.a aVar = cVar.f121234t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        return aVar;
    }

    public static void c(c84.c cVar, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showToast", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        if (!android.text.TextUtils.isEmpty(str)) {
            android.content.Context context = cVar.f121221d;
            try {
                if (z17) {
                    db5.t7.h(context, str);
                } else {
                    db5.t7.g(context, str);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.ADAppointmentHalfScreenWidget", "showToast, exp=" + th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showToast", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public static /* synthetic */ w64.k d(c84.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        w64.k kVar = cVar.f121236v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        return kVar;
    }

    public final void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClickReport", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", this.f121233s);
            jSONObject.put("uxinfo", this.f121232r);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f121235u == 0 ? 1 : 2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            s34.a aVar = this.f121234t;
            jSONObject2.put("appointmentId", aVar == null ? 0L : aVar.f484079a);
            jSONObject2.put("opType", i17);
            jSONObject.put("extInfo", jSONObject2);
            ca4.m0.a("timeline_ad_appointment_submit_action", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.ADAppointmentHalfScreenWidget", "doCancelReport, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClickReport", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f121222e;
        if (k0Var != null && k0Var.i()) {
            this.f121222e.u();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public void g(w64.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActionBtnParam", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        this.f121236v = kVar;
        this.f121237w = c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActionBtnParam", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public void h(java.lang.String str, java.lang.String str2, s34.a aVar, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        if (android.text.TextUtils.isEmpty(str2) || aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.ADAppointmentHalfScreenWidget", "showBottomSheet err, uxinfo=" + str2 + ", info=" + aVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.ADAppointmentHalfScreenWidget", "showBottomSheet, status=" + str3 + ", appointmentId=" + aVar.f484079a + ", uxInfo=" + str2);
        this.f121232r = str2;
        this.f121233s = str;
        this.f121234t = aVar;
        this.f121231q = str3;
        if (this.f121222e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initContentView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            android.content.Context context = this.f121221d;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569485cf, (android.view.ViewGroup) null);
            this.f121224g = inflate;
            this.f121225h = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            this.f121226i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbq);
            this.f121227m = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
            this.f121228n = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
            this.f121229o = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
            inflate.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260).setOnClickListener(this);
            android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.azj);
            this.f121230p = button;
            button.setOnClickListener(this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initContentView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            this.f121226i.setText(this.f121234t.f484080b);
            this.f121227m.setText(this.f121234t.f484082d);
            this.f121228n.setText(this.f121234t.f484083e);
            this.f121229o.setText(this.f121234t.f484084f);
            int i17 = this.f121235u;
            if (i17 != 0 && i17 != 1) {
                this.f121230p.setText(this.f121234t.f484085g);
            } else if ("0".equals(this.f121231q)) {
                this.f121230p.setText(this.f121234t.f484085g);
                this.f121230p.setEnabled(true);
            } else if ("1".equals(this.f121231q)) {
                this.f121230p.setText(this.f121234t.f484086h);
                this.f121230p.setEnabled(true);
                this.f121230p.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy);
                this.f121230p.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aax));
            } else if ("1000".equals(this.f121231q)) {
                this.f121230p.setText(this.f121234t.f484093o);
                this.f121230p.setEnabled(false);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                a84.m.a(this.f121234t.f484081c, this.f121225h);
            } else {
                a84.z.c(this.f121234t.f484081c, this.f121225h);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, true, 0);
            this.f121222e = k0Var;
            k0Var.s(this.f121224g, true);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f121222e;
            k0Var2.V1 = true;
            k0Var2.e(true);
            if (i17 == 2) {
                this.f121222e.X1 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        }
        if (!this.f121222e.i()) {
            this.f121222e.v();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public final void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        android.content.Context context = this.f121221d;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq);
        if (this.f121223f == null) {
            this.f121223f = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(context, string, true, 0, null);
        }
        if (!this.f121223f.isShowing()) {
            this.f121223f.show();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/ADAppointmentHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.f78246x851a1260) {
            f();
        } else if (id6 == com.p314xaae8f345.mm.R.id.azj) {
            int i17 = this.f121235u;
            if (i17 == 0 || i17 == 1) {
                f();
                if ("0".equals(this.f121231q)) {
                    i();
                    java.lang.String str = this.f121233s;
                    java.lang.String str2 = this.f121232r;
                    long j17 = this.f121234t.f484079a;
                    c84.a aVar = new c84.a(this);
                    java.util.HashMap hashMap = l44.d.f397611a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.AdAppointmentHelper", "doAppointment, id=" + j17 + ", snsId=" + str + ", uxInfo=" + str2);
                    k64.o oVar = new k64.o(str2, j17, 0);
                    gm0.j1.d().a(5159, new l44.c(str, j17, 0, aVar));
                    gm0.j1.d().g(oVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    e(0);
                } else {
                    i();
                    java.lang.String str3 = this.f121233s;
                    java.lang.String str4 = this.f121232r;
                    long j18 = this.f121234t.f484079a;
                    c84.b bVar = new c84.b(this);
                    java.util.HashMap hashMap2 = l44.d.f397611a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.AdAppointmentHelper", "cancelAppointment, id=" + j18 + ", snsId=" + str3 + ", uxInfo=" + str4);
                    k64.o oVar2 = new k64.o(str4, j18, 1);
                    gm0.j1.d().a(5159, new l44.c(str3, j18, 1, bVar));
                    gm0.j1.d().g(oVar2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    e(1);
                }
            } else {
                f();
            }
        }
        try {
            android.content.Context context = this.f121221d;
            if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.f((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) context);
            }
        } catch (java.lang.Throwable unused) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/ADAppointmentHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }
}
