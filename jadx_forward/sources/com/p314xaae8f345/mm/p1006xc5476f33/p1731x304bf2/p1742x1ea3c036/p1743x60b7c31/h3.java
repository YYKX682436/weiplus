package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f221190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 f221192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221193g;

    public h3(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 j3Var, android.content.Context context) {
        this.f221190d = jSONObject;
        this.f221191e = q5Var;
        this.f221192f = j3Var;
        this.f221193g = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.json.JSONObject jSONObject = this.f221190d;
        if (jSONObject == null) {
            this.f221191e.a("input data is empty", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("patchDownloadUrl");
        java.lang.String optString2 = this.f221190d.optString("pkgName");
        boolean optBoolean = this.f221190d.optBoolean("isServerPatch");
        if (optString2 == null || optString2.length() == 0) {
            this.f221191e.a("pkgName is null or empty", null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 j3Var = this.f221192f;
        org.json.JSONObject data = this.f221190d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "$data");
        j3Var.getClass();
        java.lang.String optString3 = data.optString("appId");
        g02.c cVar = j3Var.f221227e;
        cVar.f348953a = optString3;
        cVar.f348954b = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        cVar.f348970r = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f, 0);
        cVar.f348968p = data.optInt("uiarea", 0);
        cVar.f348969q = data.optInt("noticeId", 0);
        cVar.f348965m = data.optString("extInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220937b;
        eVar.a();
        eVar.getClass();
        cVar.f348972t = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220938c.b(eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.e.f220935a[0]);
        if (optBoolean) {
            vz.t1 t1Var = (vz.t1) i95.n0.c(vz.t1.class);
            g02.c cVar2 = this.f221192f.f221227e;
            ((uz.r1) t1Var).getClass();
            g02.b.c(32, cVar2);
        } else {
            vz.t1 t1Var2 = (vz.t1) i95.n0.c(vz.t1.class);
            g02.c cVar3 = this.f221192f.f221227e;
            ((uz.r1) t1Var2).getClass();
            g02.b.c(31, cVar3);
        }
        u43.a aVar = (u43.a) i95.n0.c(u43.a.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        u43.b e17 = aVar.e(optString2);
        if (e17 == null) {
            if (optBoolean) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3.h(this.f221192f, optString, optString2, this.f221191e, this.f221193g);
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3.g(this.f221192f, this.f221193g, optString2, this.f221191e);
                return;
            }
        }
        e17.f67996x1bb3b54a = java.lang.System.currentTimeMillis();
        e17.f67989xf72be4b6 = optBoolean;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 j3Var2 = this.f221192f;
        j3Var2.j(j3Var2.f221227e, e17);
        ((u43.a) i95.n0.c(u43.a.class)).ya(e17);
        if (!optBoolean) {
            if (e17.f67997xf2f12e3c != 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3.g(this.f221192f, this.f221193g, optString2, this.f221191e);
                return;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(e17.f67990x867b0399)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3.g(this.f221192f, this.f221193g, optString2, this.f221191e);
                return;
            }
            vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str = e17.f67990x867b0399;
            g02.c cVar4 = this.f221192f.f221227e;
            ((uz.a2) y1Var).getClass();
            k02.l.b(context, str, new k02.i(cVar4));
            this.f221191e.a(null, null);
            return;
        }
        int i17 = e17.f67997xf2f12e3c;
        if (i17 == 1) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(e17.f67992x7c02bf88)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3.h(this.f221192f, optString, optString2, this.f221191e, this.f221193g);
                return;
            } else {
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.f3(this.f221192f, this.f221193g, optString2, e17));
                this.f221191e.a(null, null);
                return;
            }
        }
        if (i17 != 2) {
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(e17.f67990x867b0399)) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(e17.f67992x7c02bf88)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3.h(this.f221192f, optString, optString2, this.f221191e, this.f221193g);
                return;
            } else {
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.g3(this.f221192f, this.f221193g, optString2, e17));
                this.f221191e.a(null, null);
                return;
            }
        }
        vz.y1 y1Var2 = (vz.y1) i95.n0.c(vz.y1.class);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str2 = e17.f67990x867b0399;
        g02.c cVar5 = this.f221192f.f221227e;
        ((uz.a2) y1Var2).getClass();
        k02.l.b(context2, str2, new k02.i(cVar5));
        this.f221191e.a(null, null);
    }
}
