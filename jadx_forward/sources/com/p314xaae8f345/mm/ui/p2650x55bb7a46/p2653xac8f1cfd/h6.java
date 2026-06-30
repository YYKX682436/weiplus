package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kg.class)
/* loaded from: classes5.dex */
public class h6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kg {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f280679e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f280680f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final android.view.animation.Animation f280681g = android.view.animation.AnimationUtils.loadAnimation(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30854x2dc211.f559266u);

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Vibrator f280682h = (android.os.Vibrator) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("vibrator");

    /* renamed from: i, reason: collision with root package name */
    public int f280683i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f280684m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f280685n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f280686o = 0;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        this.f280683i = 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
    }

    @Override // yn.d
    public void Z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingPatMsgUpdateComponent", "onFinish");
        ((java.util.HashSet) this.f280679e).clear();
        ((java.util.HashMap) ((lp3.r) i95.n0.c(lp3.r.class)).f401837d).clear();
        if (!((java.util.HashMap) this.f280680f).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingPatMsgUpdateComponent", "updatedPatMsg id: %s", ((java.util.HashMap) this.f280680f).keySet());
            java.util.HashMap hashMap = new java.util.HashMap(this.f280680f);
            ((java.util.HashMap) this.f280680f).clear();
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g6(this, hashMap), "updatePatMsgWhenExitChatting");
        }
        this.f280684m = 0;
        this.f280685n = 0;
        this.f280686o = 0;
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        this.f280684m = i17;
        this.f280685n = i18;
        this.f280686o = i19;
        if (this.f280683i < 3) {
            m0(i17, i18, i19);
            this.f280683i++;
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0) {
            m0(this.f280684m, this.f280685n, this.f280686o);
        }
    }

    public final void m0(int i17, int i18, int i19) {
        java.lang.String str;
        java.lang.String str2;
        this.f280113d.m();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.lang.String r17 = c01.z1.r();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = null;
            int i27 = 0;
            while (i27 < i18) {
                android.view.View f17 = this.f280113d.f(i27);
                if (f17 != null && f17.getTag() != null) {
                    if (f17.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc) {
                        if (f9Var == null) {
                            f9Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(this.f280113d.x());
                        }
                        android.os.SystemClock.elapsedRealtime();
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc vcVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc) f17.getTag();
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) vcVar.f287380c.getTag();
                        android.widget.LinearLayout linearLayout = vcVar.f287379b;
                        int i28 = Integer.MAX_VALUE;
                        int i29 = Integer.MIN_VALUE;
                        for (int i37 = 0; i37 < linearLayout.getChildCount(); i37++) {
                            android.view.View childAt = linearLayout.getChildAt(i37);
                            android.graphics.Rect rect = new android.graphics.Rect();
                            childAt.getLocalVisibleRect(rect);
                            if (rect.height() > 0) {
                                if (i37 < i28) {
                                    i28 = i37;
                                }
                                if (i37 > i29) {
                                    i29 = i37;
                                }
                            }
                        }
                        android.util.Pair create = android.util.Pair.create(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                        erVar.c().m124847x74d37ac6();
                        java.lang.Object obj = create.first;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(erVar.c().Q0(), erVar.c().m124847x74d37ac6());
                        erVar.c().m124847x74d37ac6();
                        android.os.SystemClock.elapsedRealtime();
                        android.os.SystemClock.elapsedRealtime();
                        java.util.Map map = this.f280680f;
                        r45.k55 k55Var = (r45.k55) ((java.util.HashMap) map).get(java.lang.Long.valueOf(erVar.c().m124847x74d37ac6()));
                        if (k55Var == null) {
                            mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
                            java.lang.String j17 = Li.j();
                            ((lp3.l) jVar).getClass();
                            k55Var = bm5.d1.e(j17);
                        }
                        if (erVar.c().m124847x74d37ac6() == f9Var.m124847x74d37ac6()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingPatMsgUpdateComponent", "merge last pat msg %d", java.lang.Long.valueOf(erVar.c().m124847x74d37ac6()));
                            mp3.j jVar2 = (mp3.j) i95.n0.c(mp3.j.class);
                            java.lang.String j18 = f9Var.j();
                            ((lp3.l) jVar2).getClass();
                            k55Var = n0(k55Var, bm5.d1.e(j18));
                        } else if (((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).ij(erVar.c().m124847x74d37ac6(), erVar.c().Q0())) {
                            erVar.c().m124847x74d37ac6();
                            android.os.SystemClock.elapsedRealtime();
                        }
                        if (!android.text.TextUtils.equals(k55Var.f459918d, erVar.c().Q0())) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingPatMsgUpdateComponent", "patMsgContent's talker[%s] is not same with chatting talker[%s]", k55Var.f459918d, erVar.c().Q0());
                            k55Var.f459918d = erVar.c().Q0();
                        }
                        erVar.c().m124847x74d37ac6();
                        android.os.SystemClock.elapsedRealtime();
                        android.os.SystemClock.elapsedRealtime();
                        if (((java.lang.Integer) create.first).intValue() <= ((java.lang.Integer) create.second).intValue()) {
                            int intValue = ((java.lang.Integer) create.first).intValue();
                            while (intValue <= ((java.lang.Integer) create.second).intValue()) {
                                if (intValue >= 0) {
                                    java.util.LinkedList linkedList = k55Var.f459919e;
                                    if (intValue < linkedList.size()) {
                                        if (r17.equals(((r45.l55) linkedList.get(intValue)).f460685d) || !r17.equals(((r45.l55) linkedList.get(intValue)).f460686e) || ((r45.l55) linkedList.get(intValue)).f460689h != 0 || hashMap.containsKey(java.lang.Integer.valueOf(i27))) {
                                            str2 = r17;
                                        } else {
                                            str2 = r17;
                                            hashMap.put(java.lang.Integer.valueOf(i27), -1);
                                        }
                                        ((r45.l55) linkedList.get(intValue)).f460689h = 1;
                                        ((r45.l55) linkedList.get(intValue)).f460692n = 1;
                                        intValue++;
                                        r17 = str2;
                                    }
                                }
                                str2 = r17;
                                intValue++;
                                r17 = str2;
                            }
                        }
                        str = r17;
                        erVar.c().m124847x74d37ac6();
                        android.os.SystemClock.elapsedRealtime();
                        ((java.util.HashMap) map).put(java.lang.Long.valueOf(Li.m124847x74d37ac6()), k55Var);
                    } else {
                        str = r17;
                        if ((f17.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) f17.getTag()).f39491xbb6bd679.M()) {
                            hashSet.add(java.lang.Integer.valueOf(i27));
                        }
                    }
                    i27++;
                    r17 = str;
                }
                str = r17;
                i27++;
                r17 = str;
            }
            android.os.SystemClock.elapsedRealtime();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue2 = ((java.lang.Integer) it.next()).intValue();
                java.util.Iterator it6 = hashMap.keySet().iterator();
                while (it6.hasNext()) {
                    int intValue3 = ((java.lang.Integer) it6.next()).intValue();
                    int intValue4 = ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue3))).intValue();
                    if (intValue4 == -1) {
                        hashMap.put(java.lang.Integer.valueOf(intValue3), java.lang.Integer.valueOf(intValue2));
                    } else if (java.lang.Math.abs(intValue3 - intValue2) < java.lang.Math.abs(intValue3 - intValue4)) {
                        hashMap.put(java.lang.Integer.valueOf(intValue3), java.lang.Integer.valueOf(intValue2));
                    }
                }
            }
            java.util.HashSet hashSet2 = new java.util.HashSet(hashMap.values());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingPatMsgUpdateComponent", "%s are going to shake", hashSet2);
            java.util.Iterator it7 = hashSet2.iterator();
            while (it7.hasNext()) {
                int intValue5 = ((java.lang.Integer) it7.next()).intValue();
                if (intValue5 >= 0) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) this.f280113d.f(intValue5).getTag();
                    if (g0Var.f39488x6a87d846.getAnimation() == null || g0Var.f39488x6a87d846.getAnimation().hasEnded()) {
                        g0Var.f39488x6a87d846.startAnimation(this.f280681g);
                        if (!ip.l.d(this.f280113d.x())) {
                            this.f280682h.vibrate(10L);
                        }
                    }
                }
            }
            hashMap.clear();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingPatMsgUpdateComponent", e17, "", new java.lang.Object[0]);
        }
    }

    public final r45.k55 n0(r45.k55 k55Var, r45.k55 k55Var2) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        r45.k55 k55Var3 = new r45.k55();
        int min = java.lang.Math.min(k55Var2.f459919e.size(), k55Var.f459919e.size());
        if (android.text.TextUtils.isEmpty(k55Var2.f459918d) || android.text.TextUtils.equals(k55Var2.f459918d, k55Var.f459918d)) {
            k55Var3.f459918d = k55Var.f459918d;
        } else {
            k55Var3.f459918d = k55Var2.f459918d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingPatMsgUpdateComponent", "mergePatMsg err db:%s updatedPatMsg:%s", k55Var2.f459918d, k55Var.f459918d);
        }
        int i17 = 0;
        while (true) {
            linkedList = k55Var3.f459919e;
            linkedList2 = k55Var2.f459919e;
            linkedList3 = k55Var.f459919e;
            if (i17 >= min) {
                break;
            }
            linkedList.add((r45.l55) linkedList2.get(i17));
            ((r45.l55) linkedList.get(i17)).f460689h = ((r45.l55) linkedList3.get(i17)).f460689h;
            i17++;
        }
        if (linkedList2.size() >= linkedList3.size()) {
            while (min < linkedList2.size()) {
                linkedList.add((r45.l55) linkedList2.get(min));
                min++;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingPatMsgUpdateComponent", "db record list %d, updated record list %d", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(linkedList3.size()));
        }
        return k55Var3;
    }
}
