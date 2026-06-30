package c84;

/* loaded from: classes4.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f39688d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f39689e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f39690f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f39691g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f39692h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f39693i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f39694m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f39695n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f39696o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f39697p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f39698q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f39699r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f39700s;

    /* renamed from: t, reason: collision with root package name */
    public s34.a f39701t;

    /* renamed from: u, reason: collision with root package name */
    public final int f39702u;

    /* renamed from: v, reason: collision with root package name */
    public w64.k f39703v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f39704w;

    public c(android.content.Context context, int i17) {
        this.f39688d = context;
        this.f39702u = i17;
    }

    public static void a(c84.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = cVar.f39690f;
        if (u3Var != null && u3Var.isShowing()) {
            cVar.f39690f.dismiss();
            com.tencent.mars.xlog.Log.i("ADAppointment.ADAppointmentHalfScreenWidget", "hideProgressDlg");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public static /* synthetic */ s34.a b(c84.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        s34.a aVar = cVar.f39701t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        return aVar;
    }

    public static void c(c84.c cVar, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showToast", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        if (!android.text.TextUtils.isEmpty(str)) {
            android.content.Context context = cVar.f39688d;
            try {
                if (z17) {
                    db5.t7.h(context, str);
                } else {
                    db5.t7.g(context, str);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("ADAppointment.ADAppointmentHalfScreenWidget", "showToast, exp=" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showToast", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public static /* synthetic */ w64.k d(c84.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        w64.k kVar = cVar.f39703v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        return kVar;
    }

    public final void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClickReport", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", this.f39700s);
            jSONObject.put("uxinfo", this.f39699r);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f39702u == 0 ? 1 : 2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            s34.a aVar = this.f39701t;
            jSONObject2.put("appointmentId", aVar == null ? 0L : aVar.f402546a);
            jSONObject2.put("opType", i17);
            jSONObject.put("extInfo", jSONObject2);
            ca4.m0.a("timeline_ad_appointment_submit_action", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ADAppointment.ADAppointmentHalfScreenWidget", "doCancelReport, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickReport", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f39689e;
        if (k0Var != null && k0Var.i()) {
            this.f39689e.u();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public void g(w64.k kVar, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionBtnParam", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        this.f39703v = kVar;
        this.f39704w = adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionBtnParam", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public void h(java.lang.String str, java.lang.String str2, s34.a aVar, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        if (android.text.TextUtils.isEmpty(str2) || aVar == null) {
            com.tencent.mars.xlog.Log.e("ADAppointment.ADAppointmentHalfScreenWidget", "showBottomSheet err, uxinfo=" + str2 + ", info=" + aVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            return;
        }
        com.tencent.mars.xlog.Log.i("ADAppointment.ADAppointmentHalfScreenWidget", "showBottomSheet, status=" + str3 + ", appointmentId=" + aVar.f402546a + ", uxInfo=" + str2);
        this.f39699r = str2;
        this.f39700s = str;
        this.f39701t = aVar;
        this.f39698q = str3;
        if (this.f39689e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            android.content.Context context = this.f39688d;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487952cf, (android.view.ViewGroup) null);
            this.f39691g = inflate;
            this.f39692h = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
            this.f39693i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
            this.f39694m = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
            this.f39695n = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2);
            this.f39696o = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
            inflate.findViewById(com.tencent.mm.R.id.close_icon).setOnClickListener(this);
            android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.azj);
            this.f39697p = button;
            button.setOnClickListener(this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            this.f39693i.setText(this.f39701t.f402547b);
            this.f39694m.setText(this.f39701t.f402549d);
            this.f39695n.setText(this.f39701t.f402550e);
            this.f39696o.setText(this.f39701t.f402551f);
            int i17 = this.f39702u;
            if (i17 != 0 && i17 != 1) {
                this.f39697p.setText(this.f39701t.f402552g);
            } else if ("0".equals(this.f39698q)) {
                this.f39697p.setText(this.f39701t.f402552g);
                this.f39697p.setEnabled(true);
            } else if ("1".equals(this.f39698q)) {
                this.f39697p.setText(this.f39701t.f402553h);
                this.f39697p.setEnabled(true);
                this.f39697p.setBackgroundResource(com.tencent.mm.R.drawable.f481068jy);
                this.f39697p.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.aax));
            } else if ("1000".equals(this.f39698q)) {
                this.f39697p.setText(this.f39701t.f402560o);
                this.f39697p.setEnabled(false);
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                a84.m.a(this.f39701t.f402548c, this.f39692h);
            } else {
                a84.z.c(this.f39701t.f402548c, this.f39692h);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, true, 0);
            this.f39689e = k0Var;
            k0Var.s(this.f39691g, true);
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f39689e;
            k0Var2.V1 = true;
            k0Var2.e(true);
            if (i17 == 2) {
                this.f39689e.X1 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        }
        if (!this.f39689e.i()) {
            this.f39689e.v();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public final void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        android.content.Context context = this.f39688d;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f490604zq);
        if (this.f39690f == null) {
            this.f39690f = com.tencent.mm.ui.widget.dialog.u3.c(context, string, true, 0, null);
        }
        if (!this.f39690f.isShowing()) {
            this.f39690f.show();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/ADAppointmentHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        if (id6 == com.tencent.mm.R.id.close_icon) {
            f();
        } else if (id6 == com.tencent.mm.R.id.azj) {
            int i17 = this.f39702u;
            if (i17 == 0 || i17 == 1) {
                f();
                if ("0".equals(this.f39698q)) {
                    i();
                    java.lang.String str = this.f39700s;
                    java.lang.String str2 = this.f39699r;
                    long j17 = this.f39701t.f402546a;
                    c84.a aVar = new c84.a(this);
                    java.util.HashMap hashMap = l44.d.f316078a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    com.tencent.mars.xlog.Log.i("ADAppointment.AdAppointmentHelper", "doAppointment, id=" + j17 + ", snsId=" + str + ", uxInfo=" + str2);
                    k64.o oVar = new k64.o(str2, j17, 0);
                    gm0.j1.d().a(5159, new l44.c(str, j17, 0, aVar));
                    gm0.j1.d().g(oVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    e(0);
                } else {
                    i();
                    java.lang.String str3 = this.f39700s;
                    java.lang.String str4 = this.f39699r;
                    long j18 = this.f39701t.f402546a;
                    c84.b bVar = new c84.b(this);
                    java.util.HashMap hashMap2 = l44.d.f316078a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    com.tencent.mars.xlog.Log.i("ADAppointment.AdAppointmentHelper", "cancelAppointment, id=" + j18 + ", snsId=" + str3 + ", uxInfo=" + str4);
                    k64.o oVar2 = new k64.o(str4, j18, 1);
                    gm0.j1.d().a(5159, new l44.c(str3, j18, 1, bVar));
                    gm0.j1.d().g(oVar2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    e(1);
                }
            } else {
                f();
            }
        }
        try {
            android.content.Context context = this.f39688d;
            if (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.f((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context);
            }
        } catch (java.lang.Throwable unused) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/ADAppointmentHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }
}
