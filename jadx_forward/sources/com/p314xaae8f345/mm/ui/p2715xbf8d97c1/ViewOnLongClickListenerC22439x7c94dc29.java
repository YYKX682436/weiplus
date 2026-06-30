package com.p314xaae8f345.mm.ui.p2715xbf8d97c1;

/* renamed from: com.tencent.mm.ui.matrix.ManualDumpActivity */
/* loaded from: classes12.dex */
public class ViewOnLongClickListenerC22439x7c94dc29 extends com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI implements android.view.View.OnLongClickListener {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f290635s = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f290636g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f290637h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f290638i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f290639m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f290640n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f290641o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f290642p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f290643q;

    /* renamed from: r, reason: collision with root package name */
    public nh5.g f290644r = nh5.g.f418680d;

    /* renamed from: getLayoutId */
    public int m80765x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bwx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: mute */
    public void m80766x335219(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x xVar = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x) ih.d.d().a(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x.class);
        if (xVar == null) {
            yj0.a.h(this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar = xVar.f134534i;
        if (fVar == null) {
            yj0.a.h(this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!(fVar.f134520l instanceof cj.f)) {
            yj0.a.h(this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        oh5.o oVar = oh5.o.f427044d;
        java.lang.String activityName = getIntent().getStringExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        oVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixResPluginManualDu", "mute " + activityName + " for 1d");
        oh5.o.f427045e.B(activityName, -java.lang.System.currentTimeMillis());
        dp.a.m125854x26a183b((android.content.Context) this, (java.lang.CharSequence) "当前 Activity 在 1 天内不再提醒", 0).show();
        if (this.f290644r == nh5.g.f418680d) {
            this.f290644r = nh5.g.f418682f;
        }
        yj0.a.h(this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: onCreate */
    public void m80767x3e5a77bb(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        mo54450xbf7c1df6(z65.c.a() ? "Activity Leak(coolassist)" : "Activity Leak");
        this.f290639m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hzq);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hzo);
        this.f290641o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566811h53);
        this.f290640n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hzp);
        this.f290642p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hzr);
        textView.setOnLongClickListener(this);
        this.f290641o.setOnLongClickListener(this);
        this.f290640n.setOnLongClickListener(this);
        this.f290643q = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.hzn);
        this.f290637h = getIntent().getStringExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        this.f290636g = getIntent().getStringExtra("ref_key");
        this.f290638i = getIntent().getStringExtra("leak_process");
        textView.setText(this.f290637h);
        if (((com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x) ih.d.d().a(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x.class)) != null) {
            this.f290642p.setText("反馈提供【截图】【Reference 文本】【uin/微信号】\n\nbuild=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a + "\nrev=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        }
        if (getIntent().getBooleanExtra("issue_tapd", false)) {
            this.f290639m.setVisibility(0);
            this.f290643q.setVisibility(0);
            this.f290643q.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: nh5.a$$a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    int i17 = com.p314xaae8f345.mm.ui.p2715xbf8d97c1.ViewOnLongClickListenerC22439x7c94dc29.f290635s;
                    com.p314xaae8f345.mm.ui.p2715xbf8d97c1.ViewOnLongClickListenerC22439x7c94dc29 viewOnLongClickListenerC22439x7c94dc29 = com.p314xaae8f345.mm.ui.p2715xbf8d97c1.ViewOnLongClickListenerC22439x7c94dc29.this;
                    viewOnLongClickListenerC22439x7c94dc29.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", viewOnLongClickListenerC22439x7c94dc29, array);
                    viewOnLongClickListenerC22439x7c94dc29.m80766x335219(view);
                    yj0.a.i(false, viewOnLongClickListenerC22439x7c94dc29, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return false;
                }
            });
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManualDumpActivity", "onCreate:mLeakedActivity:%s, mRefString:%s, mLeakProcess:%s", this.f290637h, this.f290636g, this.f290638i);
        java.lang.String stringExtra = getIntent().getStringExtra("hprof_path");
        java.lang.String stringExtra2 = getIntent().getStringExtra("leak_detail");
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x xVar = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x) ih.d.d().a(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x.class);
        if (xVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManualDumpActivity", "plugin == null");
            dp.a.m125854x26a183b((android.content.Context) this, (java.lang.CharSequence) "plugin == null", 0).show();
            return;
        }
        if (xVar.f134534i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManualDumpActivity", "watcher == null");
            dp.a.m125854x26a183b((android.content.Context) this, (java.lang.CharSequence) "watcher == null", 0).show();
            return;
        }
        wi.b bVar = xVar.f134533h.f527659b;
        if (bVar != wi.b.MANUAL_DUMP && bVar != wi.b.MANUAL_DUMP_LAZY_ANALYSE) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManualDumpActivity", "current dump mode [%s] is not MANUAL_DUMP", bVar.name());
            dp.a.m125854x26a183b((android.content.Context) this, (java.lang.CharSequence) ("current dump mode [" + bVar.name() + "] is not MANUAL_DUMP, pls confirm that you are in the debug/coolassist env."), 1).show();
            return;
        }
        if (stringExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManualDumpActivity", "analyze failed");
            dp.a.m125854x26a183b((android.content.Context) this, (java.lang.CharSequence) "analyze failed", 0).show();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManualDumpActivity", "dump success! leak process = %s, leak activity = %s, leak instance = %s", this.f290638i, this.f290637h, this.f290636g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManualDumpActivity", "dump success! hprof = %s", stringExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManualDumpActivity", "dump success! refChain = %s", stringExtra2);
        this.f290641o.setText(stringExtra);
        this.f290640n.setText(stringExtra2 == null ? "reference is null, pls pull hprof." : stringExtra2.replace(";", ";\n"));
    }

    /* renamed from: onDestroy */
    public void m80768xac79a11b() {
        super.onDestroy();
        nh5.g gVar = this.f290644r;
        jx3.f.INSTANCE.d(18573, gVar.h(), java.lang.String.valueOf(gVar.i()), "0", 18, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view instanceof android.widget.TextView) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(((android.widget.TextView) view).getText().toString());
            db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: onResume */
    public void m80769x57429eec() {
        super/*com.tencent.mm.ui.vas.VASActivity*/.onResume();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: share */
    public void m80770x6854fdf(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, "compressing...", false, 0, null);
        ((ku5.t0) ku5.t0.f394148d).r(new nh5.c(this, f17), "MicroMsg.ManualDumpActivity");
        if (this.f290644r == nh5.g.f418680d) {
            this.f290644r = nh5.g.f418681e;
        }
    }
}
