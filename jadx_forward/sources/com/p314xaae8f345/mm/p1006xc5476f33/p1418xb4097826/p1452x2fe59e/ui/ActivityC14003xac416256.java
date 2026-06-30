package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveKTVReplayUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Lvm2/f;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI */
/* loaded from: classes10.dex */
public final class ActivityC14003xac416256 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 implements vm2.f {
    public static final /* synthetic */ int D = 0;
    public android.widget.TextView A;
    public dk2.ca B;

    /* renamed from: v, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f190910v;

    /* renamed from: w, reason: collision with root package name */
    public r45.b54 f190911w;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.FrameLayout f190913y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14401x37eb3b44 f190914z;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f190912x = new java.util.ArrayList();
    public final jz5.g C = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ga.f191613d);

    public final void d7(java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayUI", "startDownloadVideos: videoCount=" + list.size());
        android.widget.FrameLayout frameLayout = this.f190913y;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14401x37eb3b44 c14401x37eb3b44 = this.f190914z;
        if (c14401x37eb3b44 != null) {
            c14401x37eb3b44.m57910x3ae760af(0);
        }
        int size = list.size();
        android.widget.TextView textView = this.A;
        if (textView != null) {
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ot9, 0, java.lang.Integer.valueOf(size)));
        }
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.pa(this, list, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570442ea0;
    }

    @Override // vm2.f
    public void m1(dk2.rf micReplayInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micReplayInfo, "micReplayInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickItem: micReplayInfo = ");
        sb6.append(micReplayInfo);
        sb6.append(",status = ");
        int i18 = micReplayInfo.f315578m;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayUI", sb6.toString());
        if (i18 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayUI", "onClickItem: status is not success,status: " + i18);
            return;
        }
        java.lang.String str = micReplayInfo.f315572d;
        if (str == null) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("openFinderPostGallery: mediaId = ");
        sb7.append(str);
        sb7.append(",coverImageUrl = ");
        java.lang.String str2 = micReplayInfo.f315574f;
        sb7.append(str2);
        sb7.append(",micReplayUrl = ");
        java.lang.String str3 = micReplayInfo.f315573e;
        sb7.append(str3);
        sb7.append(",duration = ");
        float f17 = micReplayInfo.f315575g;
        sb7.append(f17);
        sb7.append(",liveId = ");
        java.lang.Long l17 = micReplayInfo.f315579n;
        sb7.append(l17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayUI", sb7.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646 c10598x47b4a646 = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646();
        c10598x47b4a646.f148136d = 1;
        c10598x47b4a646.f148137e = str;
        c10598x47b4a646.f148138f = str2;
        c10598x47b4a646.f148139g = str3;
        c10598x47b4a646.f148140h = f17;
        c10598x47b4a646.f148141i = java.lang.String.valueOf(l17);
        arrayList.add(c10598x47b4a646);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        t40.b bVar = new t40.b("task_FinderCdnDownloader", 2, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183671g, t40.d.f497013h, 111);
        s40.x0 x0Var = (s40.x0) i95.n0.c(s40.x0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ((ci5.h) x0Var).wi(mo55332x76847179, bVar, arrayList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.LinkedList<r45.gl4> m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        r45.gl4 gl4Var;
        java.util.LinkedList m75941xfb8219143;
        r45.gl4 gl4Var2;
        java.lang.String l17;
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.oud);
        mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f);
        mo78530x8b45058f();
        m78563x4e0f6657(false);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ha(this));
        try {
            r45.b54 b54Var = new r45.b54();
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_PARAMS_REPLAY_INFO");
            if (byteArrayExtra != null && b54Var.mo11468x92b714fd(byteArrayExtra) != null) {
                this.f190911w = b54Var;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f566226tk0);
                this.f190910v = c1163xf1deaba4;
                if (c1163xf1deaba4 != null) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                    c1163xf1deaba4.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(mo55332x76847179));
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f190910v;
                java.util.ArrayList arrayList = this.f190912x;
                if (c1163xf1deaba42 != null) {
                    c1163xf1deaba42.mo7960x6cab2c8d(new vm2.e(arrayList, this));
                }
                this.f190913y = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.tjy);
                this.f190914z = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14401x37eb3b44) findViewById(com.p314xaae8f345.mm.R.id.tjx);
                this.A = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.tjz);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                this.B = new dk2.ca(this, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183671g);
                java.lang.String str2 = "";
                if (this.f190911w == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayUI", "updateRecyclerView: no replay info");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayUI", "updateRecyclerView,old size: " + arrayList.size());
                    arrayList.clear();
                    arrayList.add(new vm2.k(1));
                    i95.m c17 = i95.n0.c(zy2.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c17;
                    ml2.u1 u1Var = ml2.u1.f409611q3;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    r45.b54 b54Var2 = this.f190911w;
                    if (b54Var2 == null || (m75941xfb8219142 = b54Var2.m75941xfb821914(0)) == null || (gl4Var = (r45.gl4) kz5.n0.Z(m75941xfb8219142)) == null || (str = java.lang.Long.valueOf(gl4Var.m75942xfb822ef2(10)).toString()) == null) {
                        str = "";
                    }
                    linkedHashMap.put("live_id", str);
                    zy2.zb.I8(zbVar, u1Var, linkedHashMap, null, "378", null, null, false, 52, null);
                    int a17 = com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 16);
                    r45.b54 b54Var3 = this.f190911w;
                    if (b54Var3 != null && (m75941xfb821914 = b54Var3.m75941xfb821914(0)) != null) {
                        for (r45.gl4 gl4Var3 : m75941xfb821914) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gl4Var3);
                            dk2.rf rfVar = new dk2.rf(gl4Var3);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayUI", "add info: " + rfVar);
                            int i17 = rfVar.f315578m;
                            if (i17 == 3) {
                                arrayList.add(new vm2.n(rfVar, a17));
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayUI", "add info: status is not success,status: " + i17);
                            }
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayUI", "updateRecyclerView,new size: " + arrayList.size());
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f190910v;
                    if (c1163xf1deaba43 != null && (mo7946xf939df19 = c1163xf1deaba43.mo7946xf939df19()) != null) {
                        mo7946xf939df19.m8146xced61ae5();
                    }
                }
                i95.m c18 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.u1 u1Var2 = ml2.u1.f409608p3;
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                r45.b54 b54Var4 = this.f190911w;
                if (b54Var4 != null && (m75941xfb8219143 = b54Var4.m75941xfb821914(0)) != null && (gl4Var2 = (r45.gl4) kz5.n0.Z(m75941xfb8219143)) != null && (l17 = java.lang.Long.valueOf(gl4Var2.m75942xfb822ef2(10)).toString()) != null) {
                    str2 = l17;
                }
                linkedHashMap2.put("live_id", str2);
                zy2.zb.I8(zbVar2, u1Var2, linkedHashMap2, null, "378", null, null, false, 52, null);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayUI", "onCreate: no replay info");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayUI", "onCreate: " + e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dk2.ca caVar = this.B;
        if (caVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelAllTasks: taskCount=");
            java.util.Map map = caVar.f314825b;
            sb6.append(map.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", sb6.toString());
            caVar.f314826c = false;
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                ((dn.o) entry.getValue()).f323348c2 = null;
                ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                t21.o2.Di().g(str, new java.lang.Object[0]);
            }
            linkedHashMap.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if ((r4 == null || r4.length() == 0) == false) goto L36;
     */
    @Override // vm2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s5() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256.s5():void");
    }
}
