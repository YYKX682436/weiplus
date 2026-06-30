package com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9;

/* renamed from: com.tencent.mm.sandbox.updater.Updater */
/* loaded from: classes11.dex */
public class C20973x553f78a9 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p944x882e457a.u0, mi3.e {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f273855o = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f273856d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f273857e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f273858f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f273859g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f273860h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f273861i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f273862m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f273863n;

    public C20973x553f78a9(android.content.Context context) {
        super(context);
        this.f273857e = null;
        this.f273859g = false;
        this.f273860h = false;
        this.f273861i = false;
    }

    public static void a(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9 c20973x553f78a9, android.content.Intent intent, com.p314xaae8f345.mm.p971x6de15a2e.s sVar, r65.a aVar) {
        intent.putExtra("intent_short_ips", c20973x553f78a9.m77662x676fb786());
        intent.putExtra("intent_client_version", o45.wf.f424562g);
        intent.putExtra("intent_extra_session", sVar.G().r(1));
        intent.putExtra("intent_extra_cookie", sVar.G().o());
        intent.putExtra("intent_extra_ecdhkey", sVar.G().s());
        intent.putExtra("intent_extra_uin", sVar.G().mo9862xb5887524());
        intent.putExtra("intent_update_type", c20973x553f78a9.f273856d);
        intent.putExtra("intent_extra_desc", ((r45.wp3) aVar.f474600d.f152244b.f152233a).f470900g);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = aVar.f474600d;
        intent.putExtra("intent_extra_md5", ((r45.wp3) oVar.f152244b.f152233a).f470898e);
        intent.putExtra("intent_extra_size", ((r45.wp3) oVar.f152244b.f152233a).f470899f);
        r45.wp3 wp3Var = (r45.wp3) oVar.f152244b.f152233a;
        int size = wp3Var.f470902i.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i17 = 0; i17 < size; i17++) {
            strArr[i17] = ((r45.du5) wp3Var.f470902i.get(i17)).f454289d;
        }
        intent.putExtra("intent_extra_download_url", strArr);
        java.lang.String str = ((r45.wp3) oVar.f152244b.f152233a).f470903m;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        intent.putExtra("intent_extra_patchInfo", str);
        intent.putExtra("intent_extra_updateMode", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a);
        intent.putExtra("intent_extra_marketUrl", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273977g);
        java.lang.String f17 = x51.j1.f(((r45.wp3) oVar.f152244b.f152233a).f470907q);
        if (f17 == null) {
            f17 = "";
        }
        intent.putExtra("intent_extra_extinfo", f17);
    }

    public static void e(int i17) {
        if (gm0.j1.a()) {
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.v(i17));
        }
    }

    /* renamed from: getShortIps */
    private java.lang.String[] m77662x676fb786() {
        java.lang.String str = x51.o1.f533587g;
        if (str != null && str.length() > 0) {
            return new java.lang.String[]{x51.o1.f533587g};
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
        if (string == null || string.length() <= 0) {
            string = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) o45.hh.d(string);
        java.lang.String[] strArr = new java.lang.String[linkedList.size()];
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            strArr[i17] = ((o45.hh) linkedList.get(i17)).f424478c;
        }
        return strArr;
    }

    public void b(android.content.Intent intent, s65.i0 i0Var) {
        java.util.LinkedList linkedList;
        if (i0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Updater", "tinker sync response is empty.");
            return;
        }
        intent.putExtra("intent_short_ips", m77662x676fb786());
        intent.putExtra("intent_client_version", o45.wf.f424562g);
        intent.putExtra("intent_update_type", 3);
        java.util.HashMap hashMap = i0Var.f485002b;
        java.lang.String str = "";
        if (((hashMap == null || hashMap.isEmpty() || !hashMap.containsKey(4)) ? false : true) && hashMap != null && !hashMap.isEmpty() && (linkedList = (java.util.LinkedList) hashMap.get(4)) != null && !linkedList.isEmpty()) {
            int size = linkedList.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                r45.br4 br4Var = (r45.br4) linkedList.get(i17);
                if (br4Var.f452539d.equalsIgnoreCase("default")) {
                    str = new java.lang.String(android.util.Base64.decode(br4Var.f452540e, 0));
                } else if (br4Var.f452539d.equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d())) {
                    str = new java.lang.String(android.util.Base64.decode(br4Var.f452540e, 0));
                    break;
                }
                i17++;
            }
        }
        intent.putExtra("intent_extra_desc", str);
        intent.putExtra("intent_extra_md5", i0Var.f485006f);
        intent.putExtra("intent_extra_size", i0Var.f485008h);
        java.lang.String str2 = i0Var.f485005e;
        intent.putExtra("intent_extra_download_url", new java.lang.String[]{str2});
        java.lang.String substring = str2.substring(0, str2.lastIndexOf(47) + 1);
        java.lang.String substring2 = str2.substring(str2.lastIndexOf(47) + 1);
        uk.m mVar = new uk.m(substring, java.lang.Integer.valueOf(i0Var.f485011k).intValue());
        java.lang.String str3 = i0Var.f485010j;
        ((java.util.HashMap) mVar.f510040b).put(str3, new uk.l(str3, i0Var.f485009i, i0Var.f485006f, substring2, i0Var.f485008h));
        intent.putExtra("intent_extra_patchInfo", mVar.b());
        intent.putExtra("intent_extra_updateMode", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a);
        intent.putExtra("intent_extra_marketUrl", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273977g);
        intent.putExtra("intent_extra_extinfo", "<extinfo></extinfo>");
        intent.putExtra("intent_extra_tinker_patch", true);
        intent.putExtra("intent_extra_download_mode", 1);
    }

    public void c() {
        gm0.j1.n().f354821b.a(11, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 42L, 1L, true);
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 43L, 1L, true);
        gm0.j1.n().f354821b.q(11, this);
    }

    public void f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "summerupdate begin update routine, type=" + i17);
        this.f273856d = i17;
        this.f273861i = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 44L, 1L, true);
        gm0.j1.n().f354821b.g(new r65.a(i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 51L, 1L, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "isShow " + this.f273858f);
            if (!this.f273858f && (u3Var = this.f273857e) != null) {
                u3Var.show();
            }
            this.f273859g = true;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f273857e;
            if (u3Var2 != null) {
                u3Var2.cancel();
            }
            gm0.j1.n().f354821b.g(new c01.ra(new s65.s0(this, (r65.a) m1Var), null));
            d();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(405L, 62L, 1L, true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f273857e;
        if (u3Var3 != null) {
            android.widget.ProgressBar progressBar = u3Var3.f293538e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            android.widget.TextView textView = (android.widget.TextView) this.f273857e.findViewById(com.p314xaae8f345.mm.R.id.jma);
            if (i17 == 4 && i18 == -18) {
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5260x2f017aaa().e();
                com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
                s65.t0 t0Var = new s65.t0(this, textView);
                this.f273863n = t0Var;
                r1Var.a(3899, t0Var);
            } else if (textView != null) {
                g0Var.mo68477x336bdfd8(405L, 64L, 1L, true);
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574950k34);
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView, 1);
            }
        }
        s65.o0.f();
        gm0.j1.n().f354821b.q(11, this);
    }

    public C20973x553f78a9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f273857e = null;
        this.f273859g = false;
        this.f273860h = false;
        this.f273861i = false;
    }
}
