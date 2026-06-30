package np5;

/* loaded from: classes9.dex */
public class a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p f420342d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.i f420343e;

    /* renamed from: f, reason: collision with root package name */
    public int f420344f = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f420345g;

    public a(com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f420345g = u0Var;
    }

    public final void a(com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar) {
        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.i dVar;
        this.f420342d = pVar;
        pVar.m83052xd700b33f(true);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(385, this);
        int i17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95542r;
        if (i17 <= 0) {
            i17 = 10000;
        }
        this.f420344f++;
        java.util.HashMap hashMap = (java.util.HashMap) this.f420342d.f295582d;
        java.lang.String str = (java.lang.String) hashMap.get("req_key");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "no reqKey");
            dVar = new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.i(hashMap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "payorder reqKey: %s", str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "delayquery go new split cgi");
            dVar = str.startsWith("sns_aa_") ? new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.d(hashMap) : str.startsWith("sns_tf_") ? new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.m(hashMap) : str.startsWith("sns_ff_") ? new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.f(hashMap) : str.startsWith("ts_") ? new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.g(hashMap) : str.startsWith("sns_") ? new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.k(hashMap) : str.startsWith("offline_") ? new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.h(hashMap) : str.startsWith("up_") ? new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.n(hashMap) : str.startsWith("seb_ff_") ? new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.j(hashMap) : str.startsWith("tax_") ? new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.l(hashMap) : str.startsWith("dc_") ? new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.e(hashMap) : new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.i(hashMap);
        }
        this.f420343e = dVar;
        int i18 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95543s;
        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.i iVar = this.f420343e;
        int i19 = this.f420344f;
        int i27 = i19 < i18 ? 0 : 1;
        iVar.getClass();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("is_last_query", i27 + "");
        hashMap2.put("curr_query_count", i19 + "");
        iVar.m83003x698ba778(hashMap2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        gm0.j1.i();
        gm0.j1.n().f354821b.h(this.f420343e, i17);
    }

    public void b(int i17, int i18, java.lang.String str, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback errCode = " + i18 + "errType = " + i17);
        if (this.f420342d != null && jSONObject != null && i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mScene !=null");
            this.f420342d.mo1065x5f9cdc6f(i18, str, jSONObject);
            this.f420345g.mo815x76e0bfae(i17, i18, str, this.f420342d);
            int i19 = this.f420344f;
            if (i19 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 4L, 1L);
            } else if (i19 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 5L, 1L);
            } else if (i19 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 6L, 1L);
            }
        } else if (this.f420345g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mRealCallback !=null");
            this.f420345g.mo815x76e0bfae(i17, i18, str, this.f420342d);
            int i27 = this.f420344f;
            if (i27 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 7L, 1L);
            } else if (i27 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 8L, 1L);
            } else if (i27 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 9L, 1L);
            }
            if (!iVar.m83005xab5ceedf()) {
                int i28 = this.f420344f;
                if (i28 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 15L, 1L);
                } else if (i28 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 16L, 1L);
                } else if (i28 == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 17L, 1L);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback reset");
        this.f420344f = 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.i) || !this.f420343e.equals(m1Var)) {
            if ((m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p) && this.f420342d.equals(m1Var)) {
                gm0.j1.i();
                gm0.j1.n().f354821b.q(385, this);
                com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p) m1Var;
                if (pVar.m83048x52260e22()) {
                    if (this.f420342d.m83043x632cb163()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess ok");
                        b(i17, i18, str, pVar.f295588m, this.f420343e);
                        return;
                    }
                    if (this.f420342d.f295583e == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "try isServerDelayQuery true");
                        a(this.f420342d);
                        return;
                    } else {
                        java.lang.String str2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95544t;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", str2);
                        b(i17, i18, str2, pVar.f295588m, this.f420343e);
                        return;
                    }
                }
                return;
            }
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.q(385, this);
        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.i iVar = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.i) m1Var;
        if (iVar.f295581e == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step A");
            b(i17, i18, str, iVar.f295580d, iVar);
            return;
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step B");
            if (iVar.f295581e != 2) {
                b(i17, i18, str, iVar.f295580d, iVar);
                return;
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar2 = this.f420342d;
                b(pVar2.f295585g, pVar2.f295586h, pVar2.f295587i, pVar2.f295588m, iVar);
                return;
            }
        }
        if (!iVar.m83005xab5ceedf() && this.f420344f < ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95543s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step C");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95544t);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 0L, 1L);
            a(this.f420342d);
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar3 = this.f420342d;
        int i19 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95543s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", java.lang.Boolean.valueOf(pVar3.f295583e == 1), java.lang.Integer.valueOf(this.f420344f));
        if (this.f420344f < i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D doLoopDelayScene");
            a(this.f420342d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D fail, retmsg_type: %s", java.lang.Integer.valueOf(iVar.f295581e));
        int i27 = iVar.f295581e;
        if (i27 == 1) {
            b(i17, i18, str, iVar.f295580d, iVar);
            return;
        }
        if (i27 == 2) {
            com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar4 = this.f420342d;
            b(pVar4.f295585g, pVar4.f295586h, pVar4.f295587i, pVar4.f295588m, iVar);
            return;
        }
        java.lang.String str3 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95544t;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f420342d.f295587i)) {
            str3 = this.f420342d.f295587i;
        }
        java.lang.String str4 = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", str4);
        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar5 = this.f420342d;
        b(pVar5.f295585g, pVar5.f295586h, str4, pVar5.f295588m, iVar);
    }
}
