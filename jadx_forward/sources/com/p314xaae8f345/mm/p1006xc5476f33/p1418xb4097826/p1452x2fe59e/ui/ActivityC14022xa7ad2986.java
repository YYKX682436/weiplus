package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI */
/* loaded from: classes10.dex */
public final class ActivityC14022xa7ad2986 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {
    public long E;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d F;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f190929v = "FinderLivePostSecurityUI";

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f190930w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.jb(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f190931x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.nb(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f190932y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ib(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f190933z = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.hb(this));
    public final jz5.g A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.gb(this));
    public final int B = 10000;
    public final int C = 10001;
    public int D = -1;

    public ActivityC14022xa7ad2986() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.F = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$exWindowCloseEventIListener$1
            {
                this.f39173x3fe91575 = 1684674094;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e c6268x26920e3e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e event = c6268x26920e3e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(event.f136517g.f88753a, "next_continue_open_live")) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986 activityC14022xa7ad2986 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC14022xa7ad2986.f190929v, "face verify success,and next");
                activityC14022xa7ad2986.setResult(-1);
                activityC14022xa7ad2986.finish();
                return false;
            }
        };
    }

    public static final void d7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986 activityC14022xa7ad2986, java.lang.String str) {
        activityC14022xa7ad2986.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (zl2.q4.f555466a.E()) {
            db5.t7.m123883x26a183b(activityC14022xa7ad2986.mo55332x76847179(), "url: " + str, 0).show();
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        intent.putExtra("forceHideShare", true);
        j45.l.o(activityC14022xa7ad2986.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, activityC14022xa7ad2986.C, true);
    }

    public static /* synthetic */ java.lang.String g7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986 activityC14022xa7ad2986, java.lang.Boolean bool, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        if ((i17 & 2) != 0) {
            l17 = 0L;
        }
        return activityC14022xa7ad2986.e7(bool, l17);
    }

    public final java.lang.String e7(java.lang.Boolean bool, java.lang.Long l17) {
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        int i17 = eVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) eVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198580h : 0;
        gk2.e eVar2 = dk2.ef.I;
        long j17 = eVar2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) eVar2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198581i : 0L;
        try {
            cl0.g gVar = new cl0.g();
            gVar.h("finder_username", xy2.c.e(this));
            gVar.o("entrance_type", i17);
            gVar.p("entrance_id", j17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
                gVar.h("staytime", l17);
            }
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
            return gVar2;
        } catch (java.lang.Exception unused) {
            return "{}";
        }
    }

    public final java.util.HashMap f7(java.lang.String str) {
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        int i17 = eVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) eVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198580h : 0;
        gk2.e eVar2 = dk2.ef.I;
        long j17 = eVar2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) eVar2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198581i : 0L;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", str);
        hashMap.put("fidner_username", xy2.c.e(this));
        hashMap.put("entrance_type", java.lang.String.valueOf(i17));
        hashMap.put("entrance_id", java.lang.String.valueOf(j17));
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.axb;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 h7() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) ((jz5.n) this.f190932y).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str = this.f190929v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onActivityResult requestCode:" + i17 + " , resultCode:" + i18);
        if (i17 != this.B) {
            if (i17 == this.C) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("161", e7(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.E)));
                return;
            }
            return;
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("159", e7(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.E)));
        android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
        if (i18 != -1 || bundleExtra == null) {
            return;
        }
        java.lang.String string = bundleExtra.getString("result_json");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return;
        }
        int mo15072xb58848b9 = new cl0.g(string).mo15072xb58848b9("code");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onFaceVertifyResult, code:" + mo15072xb58848b9);
        if (mo15072xb58848b9 == 0) {
            setResult(-1);
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0216  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        int i17 = this.D;
        if (i17 == 2) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("157", e7(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.E)));
        } else if (i17 == 3) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("158", e7(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.E)));
        } else if (i17 == 4) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("160", e7(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.E)));
        }
        this.F.mo48814x2efc64();
        super.onDestroy();
    }
}
