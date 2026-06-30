package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public class u3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y {

    /* renamed from: g, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3 f231689g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f231690d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f231691e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f231692f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public void B2(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public java.lang.String De(java.lang.String str, java.lang.String str2) {
        boolean z17;
        er4.e c17 = c(str);
        if (c17 == null || !(z17 = c17.f337609g[1])) {
            return null;
        }
        return z17 ? c17.f337606d : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean Gf(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public void I9(java.util.List list, java.util.List list2) {
        if (list == null || list2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMPMultitalkRoomListMgr", "loadAllBannerInfo: null parameters");
            return;
        }
        if (list.size() != list2.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPMultitalkRoomListMgr", "loadAllBannerInfo: size mismatch, wxGroupIds=%d, bannerInfos=%d", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(list2.size()));
            return;
        }
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "loadAllBannerInfo: empty data");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "loadAllBannerInfo: loading %d banner(s)", java.lang.Integer.valueOf(list.size()));
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.lang.String str = (java.lang.String) list.get(i17);
            er4.e eVar = (er4.e) list2.get(i17);
            if (!android.text.TextUtils.isEmpty(str) && eVar != null && eVar.f337609g[2] && !eVar.f337607e.isEmpty() && !android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "setVoipmpBannerInfo wxGroupId = %s", str);
                this.f231690d.put(str, eVar);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5896x6b6f0c84 c5896x6b6f0c84 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5896x6b6f0c84();
        c5896x6b6f0c84.f136204g.f88891a = 1;
        c5896x6b6f0c84.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "loadAllBannerInfo: completed, loaded %d banner(s)", java.lang.Integer.valueOf(list.size()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public void J4(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPMultitalkRoomListMgr", "cleanBanner failure ! wxGroupId is null or empty!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "cleanBanner wxGroupId = %s", str);
        f(str);
        b(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public void Ji(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "outRoom wxGroupId = %s", str);
        this.f231692f.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s3(this, str), 2000L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public void Ld(java.lang.String str, er4.e eVar) {
        char c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "notifyBannerUpdate wxGroupId = %s", str);
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f231690d;
        boolean containsKey = isEmpty ? false : concurrentHashMap.containsKey(str);
        if (eVar == null || !eVar.f337609g[2] || eVar.f337607e.isEmpty()) {
            f(str);
            c17 = 3;
        } else {
            c17 = containsKey ? (char) 2 : (char) 1;
            if (!android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "setVoipmpBannerInfo wxGroupId = %s", str);
                concurrentHashMap.put(str, eVar);
            }
        }
        b(str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5896x6b6f0c84 c5896x6b6f0c84 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5896x6b6f0c84();
        am.mq mqVar = c5896x6b6f0c84.f136204g;
        if (c17 == 1) {
            mqVar.f88891a = 1;
            c5896x6b6f0c84.e();
        } else if (c17 == 2) {
            mqVar.f88891a = 1;
            c5896x6b6f0c84.e();
        } else if (c17 == 3 && containsKey) {
            mqVar.f88891a = 2;
            c5896x6b6f0c84.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public dm.f8 O7(java.lang.String str) {
        c(str);
        p21.j jVar = new p21.j();
        jVar.f66530xacb0c0d4 = str;
        jVar.f66522x861009b5 = "";
        jVar.f66526xeabee3b = 0;
        jVar.f66527xc6d1e13f = 0L;
        return jVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public int Og(java.lang.String str, java.lang.String str2) {
        boolean z17;
        er4.e c17 = c(str);
        if (c17 == null || !(z17 = c17.f337609g[3])) {
            return 30;
        }
        er4.f fVar = er4.f.BANNER_STATUS_EXIT;
        er4.f fVar2 = z17 ? c17.f337608f : fVar;
        if (fVar2 == er4.f.BANNER_STATUS_ENTER) {
            return 10;
        }
        if (fVar2 == er4.f.BANNER_STATUS_WAIT) {
            return 1;
        }
        return fVar2 == fVar ? 20 : 30;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public java.util.List P6(java.lang.String str) {
        er4.e c17 = c(str);
        return (c17 == null || !c17.f337609g[2]) ? new java.util.LinkedList() : new java.util.LinkedList(c17.f337607e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean Si() {
        return ((jp5.o) i95.n0.c(jp5.o.class)).lh();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean Th(java.lang.String str, java.lang.String str2) {
        er4.e c17 = c(str);
        if (c17 == null || !c17.f337609g[2]) {
            return false;
        }
        return c17.f337607e.contains(str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public synchronized void Ud(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x xVar) {
        ((java.util.ArrayList) this.f231691e).add(xVar);
    }

    public final void b(java.lang.String str) {
        java.util.Iterator it = ((java.util.ArrayList) this.f231691e).iterator();
        while (it.hasNext()) {
            this.f231692f.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t3(this, (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x) it.next(), str));
        }
    }

    public final er4.e c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return (er4.e) this.f231690d.get(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean d(java.lang.String str) {
        f(str);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean e5() {
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        if (oVar != null) {
            return oVar.Sd();
        }
        return false;
    }

    public final void f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "removeVoipmpBannerInfo wxGroupId = %s", str);
        this.f231690d.remove(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean ff() {
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        return oVar != null ? vq4.p0.d() || oVar.ie() : vq4.p0.d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    /* renamed from: getDisplayName */
    public java.lang.String mo67022x40021d37(java.lang.String str) {
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return c01.a2.e(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean kb(java.lang.String str) {
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        if (oVar != null) {
            return oVar.a5();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean mh(java.lang.String str) {
        return java.lang.Boolean.valueOf(((jp5.o) i95.n0.c(jp5.o.class)).jb(str)).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public synchronized void p2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x xVar) {
        ((java.util.ArrayList) this.f231691e).remove(xVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean q4(java.lang.String str) {
        er4.e c17 = c(str);
        return c17 != null && c17.f337609g[2] && c17.f337607e.size() > 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean s4(android.content.Context context) {
        return iq.b.C(context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean y8() {
        return ((jp5.o) i95.n0.c(jp5.o.class)).Sd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean zc(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f231690d.containsKey(str);
    }
}
