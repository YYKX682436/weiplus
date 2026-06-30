package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestEnvironmentUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI */
/* loaded from: classes14.dex */
public final class ActivityC17427x695175aa extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f241969z = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f241970d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f241971e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f241972f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d f241973g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f241974h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241975i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241976m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241977n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241978o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241979p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241980q;

    /* renamed from: r, reason: collision with root package name */
    public final float f241981r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.BroadcastReceiver f241982s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f241983t;

    /* renamed from: u, reason: collision with root package name */
    public long f241984u;

    /* renamed from: v, reason: collision with root package name */
    public tl.w f241985v;

    /* renamed from: w, reason: collision with root package name */
    public long f241986w;

    /* renamed from: x, reason: collision with root package name */
    public long f241987x;

    /* renamed from: y, reason: collision with root package name */
    public final android.os.Handler f241988y;

    public ActivityC17427x695175aa() {
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.le.f242827d);
        this.f241981r = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2536x30bfd4.C20333xf0e00ca());
        this.f241983t = new java.util.ArrayList();
        this.f241984u = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
        this.f241985v = new tl.w(16000, 1, 10);
        this.f241986w = java.lang.System.currentTimeMillis();
        this.f241987x = -1L;
        this.f241988y = new android.os.Handler(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fe(this));
    }

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa activityC17427x695175aa) {
        if (!activityC17427x695175aa.f241976m) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17427x695175aa.mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p1j);
            e4Var.c();
            return;
        }
        if (activityC17427x695175aa.f241978o) {
            return;
        }
        if (k14.t.f384910a.b()) {
            activityC17427x695175aa.X6();
            return;
        }
        activityC17427x695175aa.f241978o = true;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC17427x695175aa.mo55332x76847179();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x768471792);
        e4Var2.f293309c = activityC17427x695175aa.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5q);
        e4Var2.f293313g = 2;
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ee(e4Var2.c(), activityC17427x695175aa), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }

    public final void V6(java.lang.String str, int i17) {
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ce.f242442a.a();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, kz5.c1.k(new jz5.l("aid_process_result", java.lang.Integer.valueOf(i17)), new jz5.l("care_session_id", a17)), 35684);
    }

    public final void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetectInitEnvironment");
        android.widget.TextView textView = this.f241972f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
            throw null;
        }
        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.p1f));
        android.widget.TextView textView2 = this.f241972f;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
            throw null;
        }
        textView2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = this.f241973g;
        if (c21330xc127fb4d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newVoice2txtTxtReactWave");
            throw null;
        }
        c21330xc127fb4d.m78274xb63fd1a8(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        this.f241985v.g(20);
        tl.w wVar = this.f241985v;
        wVar.f501693m = -19;
        wVar.f501705y = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ge(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect start");
        if (this.f241985v.k()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect startRecord failed");
        this.f241985v.l();
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.f241984u);
    }

    public final void X6() {
        java.util.List C0;
        java.util.List C02;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        if (this.f241979p) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect end");
        this.f241979p = true;
        this.f241985v.l();
        if (!this.f241980q) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.f241984u);
            this.f241980q = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae aeVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242345a;
        java.io.File[] d17 = aeVar.d(3);
        java.io.File[] d18 = aeVar.d(1);
        java.io.File[] d19 = aeVar.d(5);
        if (!(d17.length == 0)) {
            if (!(d18.length == 0)) {
                if (!(d19.length == 0)) {
                    c06.d dVar = c06.e.f119249d;
                    java.lang.String name = d17[dVar.d(d17.length)].getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242346b = name;
                    java.lang.String name2 = d18[dVar.d(d18.length)].getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "getName(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242347c = name2;
                    java.lang.String name3 = d19[dVar.d(d19.length)].getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name3, "getName(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242348d = name3;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidResourceManager", "setDisableTestFiles: ysFileRandomChooseOrigin is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242346b + ", ysFileRandomChooseClearly is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242347c + ", ysFileRandomChooseUnClearly is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242348d);
                    java.util.List C03 = kz5.z.C0(aeVar.c("DJ", 2, false));
                    java.util.List C04 = kz5.z.C0(aeVar.c("PS", 2, false));
                    java.util.List C05 = kz5.z.C0(aeVar.c("PX", 2, false));
                    C0 = kz5.z.C0(aeVar.c("DJ", 4, false));
                    java.util.List C06 = kz5.z.C0(aeVar.c("PS", 4, false));
                    java.util.List C07 = kz5.z.C0(aeVar.c("PX", 4, false));
                    C02 = kz5.z.C0(aeVar.c("DJ", 0, true));
                    java.util.List C08 = kz5.z.C0(aeVar.c("PS", 0, true));
                    java.util.List C09 = kz5.z.C0(aeVar.c("PX", 0, true));
                    arrayList = (java.util.ArrayList) C03;
                    if (!arrayList.isEmpty() && !((java.util.ArrayList) C04).isEmpty() && !((java.util.ArrayList) C05).isEmpty()) {
                        arrayList2 = (java.util.ArrayList) C0;
                        if (!arrayList2.isEmpty() && !((java.util.ArrayList) C06).isEmpty() && !((java.util.ArrayList) C07).isEmpty()) {
                            arrayList3 = (java.util.ArrayList) C02;
                            if (!arrayList3.isEmpty() && !((java.util.ArrayList) C08).isEmpty() && !((java.util.ArrayList) C09).isEmpty()) {
                                c06.d dVar2 = c06.e.f119249d;
                                java.io.File file = (java.io.File) arrayList.get(dVar2.d(arrayList.size()));
                                java.lang.String name4 = file.getName();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name4, "getName(...)");
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242349e = name4;
                                arrayList.remove(file);
                                java.lang.String name5 = ((java.io.File) arrayList.get(dVar2.d(arrayList.size()))).getName();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name5, "getName(...)");
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242355k = name5;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242352h = "HearingModelSelector_PS_SNR_L2_AUD" + aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242349e, aeVar.a("DJ", 2, false)) + ".wav";
                                java.lang.Integer b17 = aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242355k, aeVar.a("DJ", 2, false));
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242358n = "HearingModelSelector_PS_SNR_L2_AUD" + b17 + ".wav";
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242361q = "HearingModelSelector_PX_SNR_L2_AUD" + b17 + ".wav";
                                java.io.File file2 = (java.io.File) arrayList2.get(dVar2.d(arrayList2.size()));
                                java.lang.String name6 = file2.getName();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name6, "getName(...)");
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242350f = name6;
                                arrayList2.remove(file2);
                                java.lang.String name7 = ((java.io.File) arrayList2.get(dVar2.d(arrayList2.size()))).getName();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name7, "getName(...)");
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242356l = name7;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242353i = "HearingModelSelector_PS_SNR_L4_AUD" + aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242350f, aeVar.a("DJ", 4, false)) + ".wav";
                                java.lang.Integer b18 = aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242356l, aeVar.a("DJ", 4, false));
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242359o = "HearingModelSelector_PS_SNR_L4_AUD" + b18 + ".wav";
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242362r = "HearingModelSelector_PX_SNR_L4_AUD" + b18 + ".wav";
                                java.io.File file3 = (java.io.File) arrayList3.get(dVar2.d(arrayList3.size()));
                                java.lang.String name8 = file3.getName();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name8, "getName(...)");
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242351g = name8;
                                arrayList3.remove(file3);
                                java.lang.String name9 = ((java.io.File) arrayList3.get(dVar2.d(arrayList3.size()))).getName();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name9, "getName(...)");
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242357m = name9;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242354j = "HearingModelSelector_PS_SNR_NA_AUD" + aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242351g, aeVar.a("DJ", 0, true)) + ".wav";
                                java.lang.Integer b19 = aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242357m, aeVar.a("DJ", 0, true));
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242360p = "HearingModelSelector_PS_SNR_NA_AUD" + b19 + ".wav";
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242363s = "HearingModelSelector_PX_SNR_NA_AUD" + b19 + ".wav";
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: test1DjL2 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242349e + ", test1PsL2 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242352h + ", test1DjL4 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242350f + ", test1PsL4 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242353i + ", test1DjNA is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242351g + ", test1PsNA is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242354j);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: test2DjL2 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242355k + ", test2PsL2 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242358n + ", test2DjL4 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242356l + ", test2PsL4 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242359o + ", test2DjNA is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242357m + ", test2PsNA is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242360p);
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setDifferentHearingAidModelMap: test2PxL2 is ");
                                sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242361q);
                                sb6.append(", test2PxL4 is ");
                                sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242362r);
                                sb6.append(", test2PxNA is ");
                                sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242363s);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidResourceManager", sb6.toString());
                                android.content.Intent intent = new android.content.Intent();
                                intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891.class);
                                V6("noise_detect_end", 1);
                                V6("download_materials", 1);
                                intent.putExtra("audio_auto_play", this.f241975i);
                                intent.putExtra("audio_test_type", 2);
                                m78751x5dc77fb5(intent);
                            }
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: files is empty");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891.class);
                    V6("noise_detect_end", 1);
                    V6("download_materials", 1);
                    intent2.putExtra("audio_auto_play", this.f241975i);
                    intent2.putExtra("audio_test_type", 2);
                    m78751x5dc77fb5(intent2);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsHearingAidResourceManager", "setDisableTestFiles: files is empty");
        java.util.List C032 = kz5.z.C0(aeVar.c("DJ", 2, false));
        java.util.List C042 = kz5.z.C0(aeVar.c("PS", 2, false));
        java.util.List C052 = kz5.z.C0(aeVar.c("PX", 2, false));
        C0 = kz5.z.C0(aeVar.c("DJ", 4, false));
        java.util.List C062 = kz5.z.C0(aeVar.c("PS", 4, false));
        java.util.List C072 = kz5.z.C0(aeVar.c("PX", 4, false));
        C02 = kz5.z.C0(aeVar.c("DJ", 0, true));
        java.util.List C082 = kz5.z.C0(aeVar.c("PS", 0, true));
        java.util.List C092 = kz5.z.C0(aeVar.c("PX", 0, true));
        arrayList = (java.util.ArrayList) C032;
        if (!arrayList.isEmpty()) {
            arrayList2 = (java.util.ArrayList) C0;
            if (!arrayList2.isEmpty()) {
                arrayList3 = (java.util.ArrayList) C02;
                if (!arrayList3.isEmpty()) {
                    c06.d dVar22 = c06.e.f119249d;
                    java.io.File file4 = (java.io.File) arrayList.get(dVar22.d(arrayList.size()));
                    java.lang.String name42 = file4.getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name42, "getName(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242349e = name42;
                    arrayList.remove(file4);
                    java.lang.String name52 = ((java.io.File) arrayList.get(dVar22.d(arrayList.size()))).getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name52, "getName(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242355k = name52;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242352h = "HearingModelSelector_PS_SNR_L2_AUD" + aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242349e, aeVar.a("DJ", 2, false)) + ".wav";
                    java.lang.Integer b172 = aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242355k, aeVar.a("DJ", 2, false));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242358n = "HearingModelSelector_PS_SNR_L2_AUD" + b172 + ".wav";
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242361q = "HearingModelSelector_PX_SNR_L2_AUD" + b172 + ".wav";
                    java.io.File file22 = (java.io.File) arrayList2.get(dVar22.d(arrayList2.size()));
                    java.lang.String name62 = file22.getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name62, "getName(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242350f = name62;
                    arrayList2.remove(file22);
                    java.lang.String name72 = ((java.io.File) arrayList2.get(dVar22.d(arrayList2.size()))).getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name72, "getName(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242356l = name72;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242353i = "HearingModelSelector_PS_SNR_L4_AUD" + aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242350f, aeVar.a("DJ", 4, false)) + ".wav";
                    java.lang.Integer b182 = aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242356l, aeVar.a("DJ", 4, false));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242359o = "HearingModelSelector_PS_SNR_L4_AUD" + b182 + ".wav";
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242362r = "HearingModelSelector_PX_SNR_L4_AUD" + b182 + ".wav";
                    java.io.File file32 = (java.io.File) arrayList3.get(dVar22.d(arrayList3.size()));
                    java.lang.String name82 = file32.getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name82, "getName(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242351g = name82;
                    arrayList3.remove(file32);
                    java.lang.String name92 = ((java.io.File) arrayList3.get(dVar22.d(arrayList3.size()))).getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name92, "getName(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242357m = name92;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242354j = "HearingModelSelector_PS_SNR_NA_AUD" + aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242351g, aeVar.a("DJ", 0, true)) + ".wav";
                    java.lang.Integer b192 = aeVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242357m, aeVar.a("DJ", 0, true));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242360p = "HearingModelSelector_PS_SNR_NA_AUD" + b192 + ".wav";
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242363s = "HearingModelSelector_PX_SNR_NA_AUD" + b192 + ".wav";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: test1DjL2 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242349e + ", test1PsL2 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242352h + ", test1DjL4 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242350f + ", test1PsL4 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242353i + ", test1DjNA is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242351g + ", test1PsNA is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242354j);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: test2DjL2 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242355k + ", test2PsL2 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242358n + ", test2DjL4 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242356l + ", test2PsL4 is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242359o + ", test2DjNA is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242357m + ", test2PsNA is " + com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242360p);
                    java.lang.StringBuilder sb62 = new java.lang.StringBuilder("setDifferentHearingAidModelMap: test2PxL2 is ");
                    sb62.append(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242361q);
                    sb62.append(", test2PxL4 is ");
                    sb62.append(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242362r);
                    sb62.append(", test2PxNA is ");
                    sb62.append(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae.f242363s);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidResourceManager", sb62.toString());
                    android.content.Intent intent22 = new android.content.Intent();
                    intent22.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891.class);
                    V6("noise_detect_end", 1);
                    V6("download_materials", 1);
                    intent22.putExtra("audio_auto_play", this.f241975i);
                    intent22.putExtra("audio_test_type", 2);
                    m78751x5dc77fb5(intent22);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: files is empty");
        android.content.Intent intent222 = new android.content.Intent();
        intent222.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891.class);
        V6("noise_detect_end", 1);
        V6("download_materials", 1);
        intent222.putExtra("audio_auto_play", this.f241975i);
        intent222.putExtra("audio_test_type", 2);
        m78751x5dc77fb5(intent222);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r2.isTouchExplorationEnabled() == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6(boolean r22) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa.Y6(boolean):void");
    }

    public final void Z6() {
        this.f241985v.l();
        if (this.f241980q) {
            return;
        }
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.f241984u);
        this.f241980q = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.enp;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect onActivityResult: " + i17 + ", " + i18);
        if (intent != null ? intent.getBooleanExtra("audio_test_abandon", false) : false) {
            setResult(0, intent);
            finish();
        }
        if (intent != null ? intent.getBooleanExtra("audio_reoptimize", false) : false) {
            setResult(0, intent);
            finish();
        }
        if (i18 == -1) {
            setResult(i18);
            finish();
        } else {
            if (i18 != 0) {
                return;
            }
            setResult(i18);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56583xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.he(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.odf);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cut);
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.bk.s0(textView2.getPaint());
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f241972f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ngc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById2;
        this.f241970d = c22661xa3a2b3c0;
        c22661xa3a2b3c0.setVisibility(4);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.v_o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f241971e = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.cut);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f241974h = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.k_m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f241973g = (com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d) findViewById5;
        getIntent().getIntExtra("audio_test_type", 1);
        this.f241975i = getIntent().getBooleanExtra("audio_auto_play", true);
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = this.f241973g;
        if (c21330xc127fb4d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newVoice2txtTxtReactWave");
            throw null;
        }
        c21330xc127fb4d.m78274xb63fd1a8(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d2 = this.f241973g;
        if (c21330xc127fb4d2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newVoice2txtTxtReactWave");
            throw null;
        }
        c21330xc127fb4d2.f277978y = true;
        float[] fArr = ca5.j.f121628a;
        c21330xc127fb4d2.f277969p = com.p314xaae8f345.mm.ui.zk.a(c21330xc127fb4d2.getContext(), 5);
        c21330xc127fb4d2.f277970q = com.p314xaae8f345.mm.ui.zk.a(c21330xc127fb4d2.getContext(), 3);
        c21330xc127fb4d2.f277973t = com.p314xaae8f345.mm.ui.zk.a(c21330xc127fb4d2.getContext(), 70);
        c21330xc127fb4d2.f277975v = com.p314xaae8f345.mm.ui.zk.a(c21330xc127fb4d2.getContext(), 37);
        c21330xc127fb4d2.f277971r = com.p314xaae8f345.mm.ui.zk.a(c21330xc127fb4d2.getContext(), 2);
        c21330xc127fb4d2.f277979z = 197;
        c21330xc127fb4d2.f277976w = com.p314xaae8f345.mm.ui.zk.a(c21330xc127fb4d2.getContext(), c21330xc127fb4d2.f277979z);
        c21330xc127fb4d2.f277977x = com.p314xaae8f345.mm.ui.zk.a(c21330xc127fb4d2.getContext(), 70);
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d3 = this.f241973g;
        if (c21330xc127fb4d3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newVoice2txtTxtReactWave");
            throw null;
        }
        c21330xc127fb4d3.m78273x167b38ec(0.005d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = this.f241970d;
        if (c22661xa3a2b3c02 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnStart");
            throw null;
        }
        c22661xa3a2b3c02.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ie(this));
        k14.t.f384910a.e();
        Y6(true);
        android.view.View view = this.f241971e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnStartView");
            throw null;
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.je(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c03 = this.f241970d;
        if (c22661xa3a2b3c03 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnStart");
            throw null;
        }
        c22661xa3a2b3c03.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ke(this));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        if (i65.a.D(mo55332x76847179)) {
            android.widget.TextView textView3 = this.f241974h;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
                throw null;
            }
            textView3.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.anm) / i65.a.m(mo55332x76847179()));
        }
        W6();
        this.f241982s = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI$onCreate$7
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                boolean booleanExtra = intent != null ? intent.getBooleanExtra("isGetFocus", false) : false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa activityC17427x695175aa = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa.this;
                activityC17427x695175aa.f241976m = booleanExtra;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "receive AudioFocus Change,current state is " + activityC17427x695175aa.f241976m);
                if (activityC17427x695175aa.f241976m) {
                    if (activityC17427x695175aa.f241977n) {
                        activityC17427x695175aa.onRestart();
                        return;
                    }
                    return;
                }
                activityC17427x695175aa.Z6();
                com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d4 = activityC17427x695175aa.f241973g;
                if (c21330xc127fb4d4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newVoice2txtTxtReactWave");
                    throw null;
                }
                c21330xc127fb4d4.i(0);
                activityC17427x695175aa.Y6(true);
            }
        };
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("hearing_aid_message");
        b4.d a17 = b4.d.a(this);
        android.content.BroadcastReceiver broadcastReceiver = this.f241982s;
        if (broadcastReceiver != null) {
            a17.b(broadcastReceiver, intentFilter);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("receiver");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Z6();
        b4.d a17 = b4.d.a(this);
        android.content.BroadcastReceiver broadcastReceiver = this.f241982s;
        if (broadcastReceiver == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("receiver");
            throw null;
        }
        a17.d(broadcastReceiver);
        this.f241988y.removeCallbacksAndMessages(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect destroy");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (i17 == 4) {
            V6("noise_detect_end", 21);
        }
        return super.onKeyDown(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        Z6();
        this.f241977n = false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetectRestart onResume");
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_noise_detect_page_in");
        this.f241977n = true;
        if (!this.f241976m || !this.f241980q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetectRestart ignore");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetectRestart");
        this.f241986w = java.lang.System.currentTimeMillis();
        this.f241987x = -1L;
        this.f241979p = false;
        this.f241984u = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
        this.f241980q = false;
        this.f241985v = new tl.w(16000, 1, 10);
        W6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8.class);
    }
}
