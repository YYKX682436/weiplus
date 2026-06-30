package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingManageFindMoreDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "com/tencent/mm/plugin/setting/ui/setting/x3", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI */
/* loaded from: classes8.dex */
public final class ActivityC17397x56ca4f48 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: x, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x3 f241753x = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x3(null);

    /* renamed from: d, reason: collision with root package name */
    public boolean f241754d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241755e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241756f;

    /* renamed from: g, reason: collision with root package name */
    public long f241757g;

    /* renamed from: h, reason: collision with root package name */
    public long f241758h;

    /* renamed from: i, reason: collision with root package name */
    public long f241759i;

    /* renamed from: q, reason: collision with root package name */
    public int f241764q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241765r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f241767t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f241768u;

    /* renamed from: w, reason: collision with root package name */
    public int f241770w;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f241760m = new java.util.LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f241761n = new java.util.LinkedHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f241762o = new java.util.LinkedHashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f241763p = new java.util.LinkedHashMap();

    /* renamed from: s, reason: collision with root package name */
    public final boolean f241766s = true;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f241769v = "";

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 activityC17397x56ca4f48, boolean z17) {
        activityC17397x56ca4f48.getClass();
        pf5.z zVar = pf5.z.f435481a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activityC17397x56ca4f48).a(w24.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        boolean z18 = !z17;
        ((w24.k) a17).U6("ITEM_KEY_IS_NOTIFY", z18);
        p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a(activityC17397x56ca4f48).a(w24.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        ((w24.k) a18).U6("ITEM_KEY_IS_SHOW_NEARBY", z18);
    }

    public final w24.w V6() {
        w24.w wVar = new w24.w("ITEM_KEY_IS_NOTIFY", this.f241755e);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ish);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        wVar.f524180i = string;
        wVar.c();
        wVar.f524179h = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y3(this);
        wVar.c();
        return wVar;
    }

    public final w24.w W6() {
        w24.w wVar = new w24.w("ITEM_KEY_IS_SHOW", this.f241754d);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.isg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        wVar.f524180i = string;
        wVar.c();
        wVar.f524179h = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z3(this);
        wVar.c();
        return wVar;
    }

    public final void X6(boolean z17, int i17, java.lang.String str, java.lang.String str2, wd0.o1 o1Var, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574517ik0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijz);
        }
        v24.o0.g(this, str, str2, str3, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p4(z17, i17, this, o1Var));
    }

    public final void Y6(boolean z17) {
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).Ni("labs_browse", z17);
        this.f241758h = z17 ? this.f241758h & (-67108865) : this.f241758h | 67108864;
        this.f241761n.put(56, java.lang.Integer.valueOf(z17 ? 1 : 0));
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("com.tencent.xin.newLife.internalKV." + new kk.v(gm0.j1.b().h()), 2, null).A("newlife_jump_top_story_show_time", 0);
    }

    public final void Z6(boolean z17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch ext change : open = " + z17 + " item value = " + j17);
        this.f241759i = z17 ? this.f241759i & (~j17) : this.f241759i | j17;
        this.f241760m.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(z17 ? 0L : j17));
    }

    public final void a7(boolean z17, long j17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch ext change : open = " + z17 + " item value = " + j17 + " functionId = " + i17);
        this.f241758h = z17 ? (~j17) & this.f241758h : j17 | this.f241758h;
        this.f241761n.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    public final void b7(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch plugin flag, open %s, flag %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        this.f241764q = !z17 ? this.f241764q | i17 : this.f241764q & (~i17);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        android.content.Intent intent = new android.content.Intent(getIntent());
        intent.putExtra("is_show_in_findmore", this.f241754d);
        intent.putExtra("is_new_notify", this.f241755e);
        intent.putExtra("is_show_nearby", this.f241756f);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clm;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
    /* renamed from: isContentAtTop */
    public boolean mo45060x28c9d73() {
        return !((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.gvd)).canScrollVertically(-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0341, code lost:
    
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0394  */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "oplog extstatus:" + this.f241758h + ",pluginFlag:" + this.f241764q + ",discoveryCtrlFlag:" + this.f241759i);
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f241758h));
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(this.f241764q));
        gm0.j1.u().c().w(147458, java.lang.Long.valueOf(this.f241759i));
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f241761n;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Number) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = intValue;
            p53Var.f464295e = intValue2;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch  " + intValue + ' ' + intValue2);
        }
        linkedHashMap.clear();
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) this.f241760m;
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            long longValue = ((java.lang.Number) entry2.getKey()).longValue();
            long longValue2 = ((java.lang.Number) entry2.getValue()).longValue();
            r45.io4 io4Var = new r45.io4();
            io4Var.f458749d = longValue;
            io4Var.f458750e = longValue2;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(75, io4Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switchDiscoveryState switch " + longValue + ' ' + longValue2);
        }
        linkedHashMap2.clear();
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", this.f241764q, "", 0, "", 0));
        java.util.LinkedHashMap linkedHashMap3 = (java.util.LinkedHashMap) this.f241763p;
        java.util.Iterator it = linkedHashMap3.keySet().iterator();
        while (it.hasNext()) {
            int intValue3 = ((java.lang.Number) it.next()).intValue();
            java.util.Map map = this.f241762o;
            if (map.containsKey(java.lang.Integer.valueOf(intValue3))) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(intValue3)), linkedHashMap3.get(java.lang.Integer.valueOf(intValue3)))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15185, java.lang.Integer.valueOf(intValue3), linkedHashMap3.get(java.lang.Integer.valueOf(intValue3)), 1);
                    if (intValue3 == 0) {
                        java.lang.Integer num = (java.lang.Integer) linkedHashMap3.get(java.lang.Integer.valueOf(intValue3));
                        if (num != null && num.intValue() == 0) {
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_ENTRY_SWITCH_INT, -1);
                        } else {
                            java.lang.Integer num2 = (java.lang.Integer) linkedHashMap3.get(java.lang.Integer.valueOf(intValue3));
                            if (num2 != null && num2.intValue() == 1) {
                                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_ENTRY_SWITCH_INT, 1);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(w24.k.class);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.a.class);
        set.add(n14.j.class);
    }
}
