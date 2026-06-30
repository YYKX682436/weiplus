package xd4;

/* loaded from: classes4.dex */
public class o0 {

    /* renamed from: f, reason: collision with root package name */
    public static xd4.o0 f535219f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f535220a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f535221b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f535222c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f535223d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 f535224e;

    public static synchronized xd4.o0 d() {
        xd4.o0 o0Var;
        synchronized (xd4.o0.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            if (f535219f == null) {
                f535219f = new xd4.o0();
            }
            o0Var = f535219f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        }
        return o0Var;
    }

    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNewSmallViewType", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_timeline_enable_new_small_video_type, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "enableNewSmallViewType %b", java.lang.Boolean.valueOf(fj6));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewSmallViewType", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return fj6;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = this.f535224e;
        if (c18390xafce807 != null && str.equals(c18390xafce807.f252174m2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8072 = this.f535224e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return c18390xafce8072;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f535221b).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8073 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) it.next();
            if (str.equals(c18390xafce8073.f252174m2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
                return c18390xafce8073;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvailableVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        java.util.Iterator it = ((java.util.ArrayList) this.f535221b).iterator();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = null;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8072 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) it.next();
            if (c18390xafce8072.f252172k2 == xd4.d0.AVAILABLE) {
                c18390xafce807 = c18390xafce8072;
            }
        }
        if (c18390xafce807 == null) {
            if (((java.util.ArrayList) this.f535221b).size() < 3) {
                c18390xafce807 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807(context);
                ((java.util.ArrayList) this.f535221b).add(c18390xafce807);
                ((java.util.LinkedList) this.f535220a).add(new java.lang.ref.WeakReference(c18390xafce807));
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i17 = -1;
                for (int i18 = 0; i18 < ((java.util.ArrayList) this.f535221b).size(); i18++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8073 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) ((java.util.ArrayList) this.f535221b).get(i18);
                    if (c18390xafce8073.f252172k2 != xd4.d0.PLAYING && c18390xafce8073.f252175n2 < com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 && !c18390xafce8073.f252177p2) {
                        i17 = i18;
                    }
                    if (c18390xafce8073.f252177p2) {
                        arrayList.add(c18390xafce8073);
                    }
                }
                if (i17 >= 0 || arrayList.size() <= 0) {
                    c18390xafce807 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) ((java.util.ArrayList) this.f535221b).get(i17 < 0 ? 0 : i17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "use minIndex: %s", java.lang.Integer.valueOf(i17));
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8074 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) arrayList.get(0);
                    ((java.util.ArrayList) this.f535221b).remove(c18390xafce8074);
                    if (c18390xafce8074 != null && c18390xafce8074.getParent() != null) {
                        c18390xafce8074.f252178q2 = false;
                        ((android.view.ViewGroup) c18390xafce8074.getParent()).removeView(c18390xafce8074);
                    } else if (c18390xafce8074 != null) {
                        c18390xafce8074.g0();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8075 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807(context);
                    ((java.util.ArrayList) this.f535221b).add(c18390xafce8075);
                    ((java.util.LinkedList) this.f535220a).add(new java.lang.ref.WeakReference(c18390xafce8075));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "use new one, removes size:%s, first:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) arrayList.get(0)).hashCode()));
                    c18390xafce807 = c18390xafce8075;
                }
            }
        }
        c18390xafce807.f252172k2 = xd4.d0.ATTACHING;
        c18390xafce807.x(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s getAvailableVideoView, setState ATTACHING", java.lang.Integer.valueOf(c18390xafce807.hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvailableVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return c18390xafce807;
    }

    public boolean e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return false;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f535221b).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) it.next();
            if (str.equals(c18390xafce807.f252174m2) && c18390xafce807.f252172k2 != xd4.d0.AVAILABLE) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return false;
    }

    public boolean f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCurrentPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f535223d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCurrentPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return false;
        }
        boolean equals = this.f535223d.equals(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCurrentPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return equals;
    }

    public final boolean g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needRpt", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        boolean z17 = false;
        if (c17983xb14a9c8d != null) {
            try {
                if (c17983xb14a9c8d.w()) {
                    z17 = true;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needRpt", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return z17;
    }

    public void h(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        int i17 = this.f535222c - 1;
        this.f535222c = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "onUIDestroy %d", java.lang.Integer.valueOf(i17));
        int i18 = this.f535222c;
        if (i18 <= 0 || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5)) {
            if (i18 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(31L, 4L, 1L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopAll", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "stopAll");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = this.f535224e;
            if (c18390xafce807 != null) {
                ((java.util.ArrayList) this.f535221b).add(c18390xafce807);
            }
            int i19 = 0;
            if (!((java.util.ArrayList) this.f535221b).isEmpty()) {
                java.util.Iterator it = ((java.util.ArrayList) this.f535221b).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8072 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) it.next();
                    if (c18390xafce8072 != null && c18390xafce8072.getParent() != null) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) c18390xafce8072.getParent();
                        c18390xafce8072.f252178q2 = false;
                        viewGroup.removeView(c18390xafce8072);
                    }
                    if (c18390xafce8072 != null) {
                        c18390xafce8072.g0();
                    }
                }
                ((java.util.ArrayList) this.f535221b).clear();
            }
            this.f535224e = null;
            this.f535223d = "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fallbackRelease", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            java.util.Iterator it6 = this.f535220a.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8073 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) ((java.lang.ref.WeakReference) it6.next()).get();
                if (c18390xafce8073 != null) {
                    if (!c18390xafce8073.f252179r2) {
                        i19++;
                    }
                    c18390xafce8073.t();
                    ((ku5.t0) ku5.t0.f394148d).g(new xd4.m0(this, c18390xafce8073));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.SnsVideoViewMgr", "[fallbackRelease] releaseCount=%s allCount=%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(((java.util.LinkedList) this.f535220a).size()));
            ((java.util.LinkedList) this.f535220a).clear();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fallbackRelease", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopAll", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }

    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "pausePlay onUIPause");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = this.f535224e;
        if (c18390xafce807 != null) {
            boolean g17 = g(c18390xafce807);
            this.f535224e.j0();
            if (g17) {
                this.f535224e.H();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }

    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "pausePlay");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = this.f535224e;
        if (c18390xafce807 != null) {
            boolean g17 = g(c18390xafce807);
            this.f535224e.i0(true);
            if (g17) {
                this.f535224e.H();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }

    public void k(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, xd4.j0 j0Var, java.lang.String str, int i17, boolean z17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (j0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.SnsVideoViewMgr", "startPlay without videoInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) c17983xb14a9c8d;
        this.f535224e = c18390xafce807;
        if (c18390xafce807 != null) {
            c18390xafce807.setVisibility(0);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str3 = j0Var.f535192a.f459388d;
        java.util.List list = this.f535221b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "lxl startPlay, pos:%s, vid:%s, tlObjId:%s videoViewsSize: %s info %s", valueOf, str3, str2, java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), c17983xb14a9c8d.Q());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8072 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) it.next();
            if (c18390xafce8072 != c17983xb14a9c8d) {
                if (c18390xafce8072.w() || c18390xafce8072.f0()) {
                    boolean g17 = g(c18390xafce8072);
                    c18390xafce8072.i0(true);
                    if (g17) {
                        c18390xafce8072.H();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s pause ", java.lang.Integer.valueOf(c18390xafce8072.hashCode()));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s remove isPlaying:%s, isPause:%s", java.lang.Integer.valueOf(c18390xafce8072.hashCode()), java.lang.Boolean.valueOf(c18390xafce8072.w()), java.lang.Boolean.valueOf(c18390xafce8072.f0()));
                    arrayList.add(c18390xafce8072);
                }
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8073 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) it6.next();
            if (c18390xafce8073.getParent() != null) {
                ((android.view.ViewGroup) c18390xafce8073.getParent()).removeView(c18390xafce8073);
            }
            ((java.util.ArrayList) list).remove(c18390xafce8073);
            c18390xafce8073.g0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8074 = this.f535224e;
        if (c18390xafce8074.f252173l2 != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, c18390xafce8074.f252174m2) && this.f535224e.f252173l2.f535192a.f459388d.equals(j0Var.f535192a.f459388d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s has been played or playing, just resume", java.lang.Integer.valueOf(this.f535224e.hashCode()));
                if (!this.f535224e.w()) {
                    this.f535224e.m70645x53aed94a(1);
                    this.f535224e.m70647x7ffb700f(new kk.v(gm0.j1.b().h()).m143587x9616526c() + "_" + java.lang.System.currentTimeMillis());
                    this.f535224e.m70649xd8ba4ba2(java.lang.System.currentTimeMillis());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8075 = this.f535224e;
                    c18390xafce8075.m70651x53b40971(c18390xafce8075.f252173l2.f535195d);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8076 = this.f535224e;
                    c18390xafce8076.m70642x4ab94e43(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.p(c18390xafce8076.f252173l2.f535192a));
                }
                this.f535224e.K();
                this.f535224e.m70644x764d819b(true);
                this.f535224e.a();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s played another video, destroy it", java.lang.Integer.valueOf(this.f535224e.hashCode()));
            this.f535224e.h0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8077 = this.f535224e;
        c18390xafce8077.f252173l2 = j0Var;
        c18390xafce8077.f252174m2 = str2;
        c18390xafce8077.f252172k2 = xd4.d0.PLAYING;
        c18390xafce8077.f252175n2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s startPlay, setState PLAYING %s", java.lang.Integer.valueOf(this.f535224e.hashCode()), c17983xb14a9c8d.Q());
        this.f535223d = str2;
        this.f535224e.m70644x764d819b(true);
        this.f535224e.P(j0Var.f535192a, j0Var.f535193b, j0Var.f535194c);
        this.f535224e.a();
        this.f535224e.C();
        this.f535224e.m70645x53aed94a(1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8078 = this.f535224e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(new kk.v(gm0.j1.b().h()).m143587x9616526c());
        sb6.append("_");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        c18390xafce8078.m70647x7ffb700f(sb6.toString());
        this.f535224e.m70649xd8ba4ba2(java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8079 = this.f535224e;
        c18390xafce8079.m70651x53b40971(c18390xafce8079.f252173l2.f535195d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce80710 = this.f535224e;
        c18390xafce80710.m70642x4ab94e43(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.p(c18390xafce80710.f252173l2.f535192a));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "lxl normal start");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }
}
