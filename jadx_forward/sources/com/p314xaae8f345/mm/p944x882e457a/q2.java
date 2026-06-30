package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class q2 extends com.p314xaae8f345.mm.p971x6de15a2e.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f152281d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.l0 f152282e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f152283f;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.m1 f152285h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f152286i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s f152287m;

    /* renamed from: g, reason: collision with root package name */
    public boolean f152284g = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f152288n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f152289o = new com.p314xaae8f345.mm.p944x882e457a.o2(this);

    public q2(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 onGYNetEnd, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var, com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        this.f152281d = v0Var;
        synchronized (m1Var) {
            if (u0Var instanceof q01.x) {
                q01.x xVar = (q01.x) u0Var;
                xVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onGYNetEnd, "onGYNetEnd");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueueTracker", "#wrapOnGYNetEnd: " + xVar.e());
                xVar.f440880g = onGYNetEnd;
                onGYNetEnd = xVar;
            }
        }
        this.f152282e = onGYNetEnd;
        this.f152285h = m1Var;
        this.f152286i = u0Var;
        this.f152283f = android.os.Looper.myLooper() == null ? new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()) : new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f152287m = sVar;
    }

    public static boolean d(com.p314xaae8f345.mm.p944x882e457a.q2 q2Var, byte[] bArr) {
        q2Var.getClass();
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            java.lang.String l17 = bm5.o1.f104252a.l(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.cgi.C19976xcc434991());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(l17);
                    int optInt = jSONObject.optInt("cgiType", 0);
                    int optInt2 = jSONObject.optInt("netId", 0);
                    int optInt3 = jSONObject.optInt("errType", 0);
                    int optInt4 = jSONObject.optInt("errCode", 0);
                    java.lang.String optString = jSONObject.optString("errMsg", "");
                    if (optInt == q2Var.f152285h.mo808xfb85f7b0()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteOnGYNetEnd", "check use fake cgi resp");
                        q2Var.f152282e.mo804x5f9cdc6f(optInt2, optInt3, optInt4, optString, q2Var.f152281d, bArr);
                        return true;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.o0
    public void j4(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, byte[] bArr, int i27, int i28) {
        int i29;
        int mo808xfb85f7b0 = this.f152285h.mo808xfb85f7b0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd netId:%d, type:%s, errType:%d, errCode:%d, isCancel:%b, hash[%d,%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mo808xfb85f7b0), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(this.f152284g), java.lang.Integer.valueOf(this.f152285h.hashCode()), java.lang.Integer.valueOf(this.f152281d.hashCode()));
        if (this.f152285h.m48007x9bb1d6a7()) {
            q01.o0 m48022x4479fa06 = this.f152285h.m48022x4479fa06();
            r45.xw m150576x2b5bc573 = m48022x4479fa06.f440849a.mo47948x7f0c4558().mo13821x7f35c2d1().m150576x2b5bc573();
            if (m150576x2b5bc573 != null && m48022x4479fa06.c()) {
                synchronized (m48022x4479fa06.e()) {
                    if (!m48022x4479fa06.f440852d) {
                        java.util.List e17 = m48022x4479fa06.e();
                        java.util.ListIterator listIterator = e17.listIterator(e17.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i29 = -1;
                                break;
                            } else {
                                if (((q01.h0) listIterator.previous()).f440823a < 250) {
                                    i29 = listIterator.nextIndex();
                                    break;
                                }
                            }
                        }
                        int i37 = i29 + 1;
                        java.util.List e18 = m48022x4479fa06.e();
                        m48022x4479fa06.a(e18, i37, 260, m150576x2b5bc573.f472087x, m150576x2b5bc573);
                        m48022x4479fa06.a(e18, i37, com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, m150576x2b5bc573.f472079p, m150576x2b5bc573);
                        m48022x4479fa06.a(e18, i37, 258, m150576x2b5bc573.f472078o, m150576x2b5bc573);
                        m48022x4479fa06.a(e18, i37, 257, m150576x2b5bc573.f472077n, m150576x2b5bc573);
                        m48022x4479fa06.a(e18, i37, 256, m150576x2b5bc573.f472076m, m150576x2b5bc573);
                        m48022x4479fa06.a(e18, i37, 255, m150576x2b5bc573.f472075i, m150576x2b5bc573);
                        m48022x4479fa06.a(e18, i37, 254, m150576x2b5bc573.f472074h, m150576x2b5bc573);
                        m48022x4479fa06.a(e18, i37, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432, m150576x2b5bc573.f472073g, m150576x2b5bc573);
                        m48022x4479fa06.a(e18, i37, 252, m150576x2b5bc573.f472072f, m150576x2b5bc573);
                        m48022x4479fa06.a(e18, i37, 251, m150576x2b5bc573.f472071e, m150576x2b5bc573);
                        m48022x4479fa06.a(e18, i37, 250, m150576x2b5bc573.f472070d, m150576x2b5bc573);
                        m48022x4479fa06.f440852d = true;
                    }
                }
            }
        }
        q01.a1.f440792a.d(this.f152285h);
        this.f152285h.m48025x7d7117e2(-1);
        if (this.f152284g || this.f152288n) {
            return;
        }
        this.f152288n = true;
        this.f152283f.mo50300x3fa464aa(this.f152289o);
        this.f152283f.mo50293x3498a0(new com.p314xaae8f345.mm.p944x882e457a.p2(this, i17, i18, i19, mo808xfb85f7b0, bArr, str));
    }
}
