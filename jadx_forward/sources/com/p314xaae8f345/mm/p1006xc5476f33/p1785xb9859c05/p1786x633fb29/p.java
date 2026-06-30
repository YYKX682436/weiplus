package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes14.dex */
public class p implements k83.a, k83.e {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o f224022i;

    /* renamed from: u, reason: collision with root package name */
    public k83.g f224031u;

    /* renamed from: d, reason: collision with root package name */
    public int f224017d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f224018e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f224019f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f224020g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f224021h = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f224032v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f224033w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f224034x = false;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f224035y = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.n(this);

    /* renamed from: m, reason: collision with root package name */
    public final r83.d f224023m = new r83.d();

    /* renamed from: n, reason: collision with root package name */
    public final r83.i f224024n = new r83.i();

    /* renamed from: o, reason: collision with root package name */
    public final r83.a f224025o = new r83.a();

    /* renamed from: p, reason: collision with root package name */
    public final r83.h f224026p = new r83.h();

    /* renamed from: q, reason: collision with root package name */
    public final r83.c f224027q = new r83.c();

    /* renamed from: r, reason: collision with root package name */
    public final r83.e f224028r = new r83.e();

    /* renamed from: s, reason: collision with root package name */
    public final r83.g f224029s = new r83.g();

    /* renamed from: t, reason: collision with root package name */
    public final r83.f f224030t = new r83.f();

    @Override // k83.a
    public void a(int i17, java.lang.Object obj, int i18, int i19) {
        if (i(i17, obj, i18, i19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "onServiceFailed different room ignore");
            return;
        }
        if (i17 == 1) {
            f(false);
            return;
        }
        if (i17 == 6) {
            h(false);
            return;
        }
        if (i17 == 8) {
            g(false);
        } else if (i17 == 3) {
            d(false, i19);
        } else {
            if (i17 != 4) {
                return;
            }
            l(false, i19);
        }
    }

    @Override // k83.a
    public void b(int i17, java.lang.Object obj, int i18, int i19) {
        if (i(i17, obj, i18, i19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "onServiceResult different room ignore");
            return;
        }
        if (i17 == 1) {
            f(true);
            return;
        }
        if (i17 == 6) {
            h(true);
            return;
        }
        if (i17 == 8) {
            g(true);
        } else if (i17 == 3) {
            d(true, i19);
        } else {
            if (i17 != 4) {
                return;
            }
            l(true, i19);
        }
    }

    public void c() {
        if (this.f224031u.M) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "cancelIPCall, already accept");
        }
        this.f224020g = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "cancelIPCall, roomId: %d, inviteId: %d", java.lang.Integer.valueOf(this.f224031u.f386431a), java.lang.Integer.valueOf(this.f224031u.f386434d));
        this.f224027q.p();
        this.f224024n.p();
        this.f224025o.j(this.f224031u);
        this.f224029s.j(this.f224031u);
    }

    public final void d(boolean z17, int i17) {
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleCancel, success: %b", java.lang.Boolean.valueOf(z17));
        if (z17 || i17 >= 0 || (i18 = this.f224019f) >= 1) {
            return;
        }
        int i19 = i18 + 1;
        this.f224019f = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "cancel failed, retry count: %d", java.lang.Integer.valueOf(i19));
        this.f224025o.j(this.f224031u);
    }

    public final void e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleHeartbeat, success: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f224017d = 0;
            return;
        }
        int i17 = this.f224017d + 1;
        this.f224017d = i17;
        if (i17 >= 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "heartbeat failed twice!");
            this.f224027q.p();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().c() || (oVar = this.f224022i) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar;
            jVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onHeartbeatFailed");
            if (jVar.j(7, 29)) {
                jVar.i(7, null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.apy), 1);
            }
        }
    }

    public final void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleInvite, success: %b, isLaunchCancel: %b, isLaunchShutdown: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f224020g), java.lang.Boolean.valueOf(this.f224021h));
        if (this.f224020g || this.f224021h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleInvite, ignore this");
            return;
        }
        boolean z18 = false;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar = this.f224022i;
            if (oVar != null) {
                k83.g gVar = this.f224031u;
                if (gVar.f386446p) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar).e(gVar.f386437g, gVar.f386440j, gVar.f386438h, gVar.f386439i);
                    return;
                }
                if (gVar.f386447q) {
                    int i17 = gVar.f386437g;
                    java.lang.String str = gVar.f386440j;
                    java.lang.String str2 = gVar.f386438h;
                    int i18 = gVar.f386439i;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar;
                    jVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onCallRestricted, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
                    if (jVar.j(10, 0)) {
                        jVar.i(10, str, str2, i18);
                        return;
                    }
                    return;
                }
                if (gVar.f386448r) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar).f(gVar.f386437g, gVar.f386440j, gVar.f386438h, gVar.f386439i);
                    return;
                }
                if (!gVar.f386449s) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar).h(gVar.f386437g, gVar.f386440j, gVar.f386438h, gVar.f386439i, gVar.f386445o);
                    return;
                }
                int i19 = gVar.f386437g;
                java.lang.String str3 = gVar.f386440j;
                java.lang.String str4 = gVar.f386438h;
                int i27 = gVar.f386439i;
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar;
                jVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onInviteFailed, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
                if (jVar2.j(2, 0)) {
                    jVar2.i(2, str3, str4, i27);
                    return;
                }
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar2 = this.f224022i;
        if (oVar2 != null) {
            k83.g gVar2 = this.f224031u;
            if (gVar2.f386449s) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar2;
                jVar3.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onInviteSuccess");
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f(3)) {
                    m83.d Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                    if (Zi.f406273r == 0) {
                        Zi.f406273r = java.lang.System.currentTimeMillis();
                    }
                    k83.g gVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u;
                    m83.d Zi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                    int i28 = gVar3.f386434d;
                    java.lang.String str5 = gVar3.I;
                    java.lang.String str6 = gVar3.f386430J;
                    int i29 = gVar3.f386431a;
                    long j17 = gVar3.f386432b;
                    long j18 = gVar3.f386433c;
                    Zi2.f406266k = i28;
                    Zi2.f406272q = str5;
                    Zi2.f406270o = str6;
                    Zi2.f406267l = i29;
                    Zi2.f406268m = j17;
                    Zi2.f406269n = j18;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.l lVar = jVar3.f223977d;
                    if (lVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) lVar;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "onInviteSuccess");
                        java.lang.String str7 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386430J;
                        java.lang.String str8 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.K;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8) && !str7.equals(str8)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "toPhoneNumber:%s,serverRetPhoneNumber:%s", str7, str8);
                            l6Var.h(str8);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "callFlag:" + com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386450t);
                        int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386450t;
                        if ((i37 & 1) > 0 && (i37 & 2) > 0 && (i37 & 8) <= 0) {
                            z18 = true;
                        }
                        if (z18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "isNotFree");
                            db5.e1.k(l6Var.f224457w, com.p314xaae8f345.mm.R.C30867xcad56011.f573881g54, com.p314xaae8f345.mm.R.C30867xcad56011.f573882g55, com.p314xaae8f345.mm.R.C30867xcad56011.f573880g53, com.p314xaae8f345.mm.R.C30867xcad56011.f573879g52, true, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.z5(l6Var));
                        }
                        l6Var.g(3);
                    }
                }
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar2).h(gVar2.f386437g, gVar2.f386440j, gVar2.f386438h, gVar2.f386439i, gVar2.f386445o);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "start sync");
        this.f224024n.j(this.f224031u);
    }

    public final void g(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleNotify, success: %b", java.lang.Boolean.valueOf(z17));
        if (z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406253d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().b(this.f224031u.f386455y);
        }
        k83.g gVar = this.f224031u;
        if (gVar == null || !z17) {
            return;
        }
        int a17 = gVar.a();
        if (a17 == 2 || a17 == 1) {
            if (this.f224034x) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "current status has jni accepted, ignore notify accept");
                return;
            } else {
                k83.g gVar2 = this.f224031u;
                c01.d9.e().g(new p83.o(gVar2.f386431a, gVar2.f386432b, gVar2.b(), this.f224031u.f386433c, false));
            }
        }
        k(this.f224031u.a());
    }

    public final void h(boolean z17) {
        byte[] bArr;
        int m72777xf4d2fd75;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleRedirect, isSuccess: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            m83.c Ni = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni();
            k83.g gVar = this.f224031u;
            Ni.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "redirectSvrAddr");
            if (gVar != null && (linkedList4 = gVar.B) != null && linkedList4.size() > 0) {
                t83.f.g(gVar.B);
            }
            if (gVar != null && (linkedList3 = gVar.C) != null && linkedList3.size() > 0) {
                t83.f.g(gVar.C);
            }
            r45.do5 do5Var = new r45.do5();
            r45.co5 co5Var = new r45.co5();
            co5Var.f453257d = 0;
            co5Var.f453258e = "";
            co5Var.f453259f = "";
            co5Var.f453260g = 4;
            co5Var.f453261h = 4;
            co5Var.f453262i = 2;
            co5Var.f453263m = new r45.c27();
            co5Var.f453264n = new r45.c27();
            if (gVar != null && (linkedList2 = gVar.B) != null && linkedList2.size() > 0) {
                co5Var.f453263m = t83.f.g(gVar.B);
            }
            if (gVar != null && (linkedList = gVar.C) != null && linkedList.size() > 0) {
                co5Var.f453264n = t83.f.g(gVar.C);
            }
            do5Var.f454158e.add(co5Var);
            do5Var.f454157d = 1;
            try {
                bArr = do5Var.mo14344x5f01b1f6();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallEngineManager", "conn info to byte array fail..");
                bArr = null;
            }
            if (bArr == null || (m72777xf4d2fd75 = Ni.f406250a.m72777xf4d2fd75(bArr, bArr.length, 1, false)) == 0) {
                return;
            }
            vq4.d0.b("MicroMsg.IPCallEngineManager", "redirect relay conns fail ret:" + m72777xf4d2fd75);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean i(int i17, java.lang.Object obj, int i18, int i19) {
        k83.g gVar = this.f224031u;
        if (gVar == null || obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "callInfo = null or result = null");
            return true;
        }
        switch (i17) {
            case 1:
                if (!(obj instanceof p83.i)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited result error");
                    return true;
                }
                p83.i iVar = (p83.i) obj;
                r45.ne5 ne5Var = iVar.f434288f;
                int i27 = gVar.f386434d;
                r45.me5 me5Var = iVar.f434287e;
                if (i27 != me5Var.f461954h) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(me5Var.f461954h));
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished invite id:%d", java.lang.Integer.valueOf(i27));
                m83.d Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                k83.g gVar2 = this.f224031u;
                if (Zi.f406266k == gVar2.f386434d) {
                    Zi.f406271p = i19;
                }
                if (i18 != 0 || i19 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invite failed");
                    if (ne5Var.f76492x92037252 != null) {
                        if (i19 == 433) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo account overdue");
                            this.f224031u.f386446p = true;
                        } else if (i19 == 434) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo restrict call");
                            this.f224031u.f386447q = true;
                        } else if (i19 == 435) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo phonenumber invalid");
                            this.f224031u.f386448r = true;
                        }
                        int i28 = ne5Var.f462855q;
                        if (i28 > 0) {
                            k83.g gVar3 = this.f224031u;
                            gVar3.f386449s = false;
                            gVar3.f386445o = i28;
                        } else {
                            k83.g gVar4 = this.f224031u;
                            gVar4.f386449s = true;
                            gVar4.f386445o = 0;
                        }
                        k83.g gVar5 = this.f224031u;
                        gVar5.f386440j = ne5Var.f462857s;
                        gVar5.f386439i = ne5Var.f462856r;
                        gVar5.f386437g = i19;
                        if (ne5Var.mo11484xe92ab0a8() != null) {
                            k83.g gVar6 = this.f224031u;
                            java.lang.String g17 = x51.j1.g(ne5Var.f76492x92037252.f458493e);
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            gVar6.f386438h = g17 != null ? g17 : "";
                            java.lang.String str = this.f224031u.f386438h;
                        }
                    } else {
                        k83.g gVar7 = this.f224031u;
                        gVar7.f386440j = "";
                        gVar7.f386439i = 2;
                        gVar7.f386438h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572306aq1);
                        this.f224031u.f386437g = i19;
                    }
                } else if (gVar2 != null) {
                    gVar2.f386431a = ne5Var.f462845d;
                    gVar2.f386432b = ne5Var.f462846e;
                    gVar2.f386433c = ne5Var.f462852n;
                    gVar2.f386441k = ne5Var.f462847f;
                    gVar2.f386444n = ne5Var.f462849h * 1000;
                    gVar2.f386451u = ne5Var.f462850i;
                    gVar2.f386452v = ne5Var.f462851m;
                    gVar2.B = ne5Var.f462848g;
                    gVar2.C = ne5Var.f462859u;
                    gVar2.K = ne5Var.f462861w;
                    int i29 = ne5Var.f462860v;
                    if (i29 > 0) {
                        gVar2.D = i29;
                    }
                    gVar2.f386453w = ne5Var.f462853o;
                    gVar2.f386454x = ne5Var.f462854p;
                    gVar2.f386450t = ne5Var.f462863y;
                    int i37 = ne5Var.f462858t;
                    if (i37 > 0) {
                        gVar2.f386456z = i37 - 1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got encryptStrategy[" + this.f224031u.f386456z + "] from Invite resp");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got no encryptStrategy from Invite resp");
                        this.f224031u.f386456z = 2;
                    }
                    this.f224031u.A = ne5Var.f462862x;
                    int i38 = ne5Var.f462855q;
                    if (i38 > 0) {
                        k83.g gVar8 = this.f224031u;
                        gVar8.f386449s = false;
                        gVar8.f386445o = i38;
                    } else {
                        k83.g gVar9 = this.f224031u;
                        gVar9.f386449s = true;
                        gVar9.f386445o = 0;
                    }
                    k83.g gVar10 = this.f224031u;
                    gVar10.f386440j = ne5Var.f462857s;
                    gVar10.f386439i = ne5Var.f462856r;
                    gVar10.f386437g = i19;
                    java.lang.String g18 = x51.j1.g(ne5Var.f76492x92037252.f458493e);
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    gVar10.f386438h = g18 != null ? g18 : "";
                }
                return false;
            case 2:
                if (!(obj instanceof p83.o)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync result error");
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished errType:%d,errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                p83.o oVar = (p83.o) obj;
                r45.we5 we5Var = oVar.f434306f;
                int i39 = this.f224031u.f386431a;
                r45.ve5 ve5Var = oVar.f434305e;
                if (i39 != ve5Var.f469700e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished but room id not the same, now room roomId:%d, before room roomId:%d", java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(ve5Var.f469700e));
                    return true;
                }
                if (i18 == 0 && i19 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync roomId: %d, status: %d, memberId: %d, syncKey: %d", java.lang.Integer.valueOf(we5Var.f470638d), java.lang.Integer.valueOf(we5Var.f470640f), java.lang.Integer.valueOf(we5Var.f470643i), java.lang.Integer.valueOf(we5Var.f470641g));
                    int i47 = we5Var.f470638d;
                    k83.g gVar11 = this.f224031u;
                    if (i47 == gVar11.f386431a && we5Var.f470639e == gVar11.f386432b) {
                        if (we5Var.f470643i == gVar11.f386441k) {
                            int i48 = we5Var.f470641g;
                            if (i48 > gVar11.f386442l) {
                                gVar11.f386442l = i48;
                                int i49 = we5Var.f470640f;
                                if (i49 != 0) {
                                    gVar11.f386443m = i49;
                                }
                            }
                        } else {
                            java.util.Iterator it = gVar11.E.iterator();
                            boolean z19 = false;
                            while (it.hasNext()) {
                                k83.h hVar = (k83.h) it.next();
                                if (hVar.f386459c == we5Var.f470643i) {
                                    int i57 = we5Var.f470641g;
                                    if (i57 > hVar.f386458b) {
                                        hVar.f386458b = i57;
                                        int i58 = we5Var.f470640f;
                                        if (i58 != 0) {
                                            hVar.f386457a = i58;
                                        }
                                    }
                                    z19 = true;
                                }
                            }
                            if (!z19) {
                                k83.h hVar2 = new k83.h();
                                hVar2.f386459c = we5Var.f470643i;
                                hVar2.f386457a = we5Var.f470640f;
                                hVar2.f386458b = we5Var.f470641g;
                                this.f224031u.E.add(hVar2);
                            }
                        }
                        int i59 = we5Var.f470644m;
                        if (i59 == 404 || i59 == 484) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync phonenumber invalid");
                            this.f224031u.f386448r = true;
                        }
                        k83.g gVar12 = this.f224031u;
                        gVar12.f386438h = we5Var.f470645n;
                        gVar12.f386437g = we5Var.f470644m;
                        gVar12.f386439i = we5Var.f470646o;
                        gVar12.f386440j = we5Var.f470647p;
                        gVar12.f386455y = we5Var.f470642h;
                    }
                }
                return false;
            case 3:
                if (!(obj instanceof p83.a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel result error");
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished errType:%d,errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                p83.a aVar = (p83.a) obj;
                int i66 = this.f224031u.f386434d;
                if (i66 != aVar.f434262e.f456706h) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", java.lang.Integer.valueOf(i66), java.lang.Integer.valueOf(aVar.f434262e.f456706h));
                    return true;
                }
                return false;
            case 4:
                if (!(obj instanceof p83.n)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown result error");
                    return true;
                }
                p83.n nVar = (p83.n) obj;
                int i67 = gVar.f386431a;
                if (i67 != nVar.f434302e.f467887e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", java.lang.Integer.valueOf(i67), java.lang.Integer.valueOf(nVar.f434302e.f467887e));
                    return true;
                }
                if (i18 == 0 && i19 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown success!");
                    this.f224031u.f386443m = 5;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown failed");
                }
                return false;
            case 5:
                if (!(obj instanceof p83.h)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat result error");
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished errType:%d,errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                p83.h hVar3 = (p83.h) obj;
                int i68 = this.f224031u.f386431a;
                if (i68 != hVar3.f434284e.f460158d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished but room id not the same, now room roomId:%d, before room roomId:%d", java.lang.Integer.valueOf(i68), java.lang.Integer.valueOf(hVar3.f434284e.f460158d));
                    return true;
                }
                return false;
            case 6:
                if (!(obj instanceof p83.k)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect result error");
                    return true;
                }
                p83.k kVar = (p83.k) obj;
                r45.qe5 qe5Var = kVar.f434295f;
                int i69 = gVar.f386431a;
                r45.pe5 pe5Var = kVar.f434294e;
                if (i69 != pe5Var.f464516d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect finished but room id not the same, now room roomId:%d, before room roomId:%d", java.lang.Integer.valueOf(i69), java.lang.Integer.valueOf(pe5Var.f464516d));
                    return true;
                }
                if (i18 == 0 && i19 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect success");
                    k83.g gVar13 = this.f224031u;
                    gVar13.B = qe5Var.f465447f;
                    gVar13.C = qe5Var.f465448g;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect failed");
                }
                return false;
            case 7:
            default:
                return false;
            case 8:
                if (!(obj instanceof r45.oe5)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify result error");
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify finished");
                r45.oe5 oe5Var = (r45.oe5) obj;
                k83.g gVar14 = this.f224031u;
                int i76 = gVar14.f386431a;
                if (i76 != oe5Var.f463733d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", java.lang.Integer.valueOf(i76), java.lang.Integer.valueOf(oe5Var.f463733d));
                    return true;
                }
                if (i18 == 0 && i19 == 0) {
                    gVar14.f386455y = oe5Var.f463736g;
                    java.util.LinkedList linkedList = oe5Var.f463735f;
                    linkedList.size();
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        r45.xe5 xe5Var = (r45.xe5) it6.next();
                        int i77 = this.f224031u.f386441k;
                        int i78 = xe5Var.f471549f;
                        if (i77 == i78) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update self userStatus, memberId: %d, status: %d, syncKey: %d", java.lang.Integer.valueOf(i77), java.lang.Integer.valueOf(xe5Var.f471547d), java.lang.Integer.valueOf(xe5Var.f471548e));
                            int i79 = xe5Var.f471548e;
                            k83.g gVar15 = this.f224031u;
                            if (i79 > gVar15.f386442l) {
                                gVar15.f386442l = i79;
                                int i86 = xe5Var.f471547d;
                                if (i86 != 0) {
                                    gVar15.f386443m = i86;
                                }
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update others userStatus, memberId: %d, status: %d, syncKey: %d", java.lang.Integer.valueOf(i78), java.lang.Integer.valueOf(xe5Var.f471547d), java.lang.Integer.valueOf(xe5Var.f471548e));
                            java.util.Iterator it7 = this.f224031u.E.iterator();
                            boolean z27 = false;
                            while (it7.hasNext()) {
                                k83.h hVar4 = (k83.h) it7.next();
                                if (hVar4.f386459c == xe5Var.f471549f) {
                                    int i87 = xe5Var.f471548e;
                                    if (i87 > hVar4.f386458b) {
                                        hVar4.f386458b = i87;
                                        int i88 = xe5Var.f471547d;
                                        if (i88 != 0) {
                                            hVar4.f386457a = i88;
                                        }
                                    }
                                    z27 = true;
                                }
                            }
                            if (!z27) {
                                k83.h hVar5 = new k83.h();
                                hVar5.f386459c = xe5Var.f471549f;
                                hVar5.f386457a = xe5Var.f471547d;
                                hVar5.f386458b = xe5Var.f471548e;
                                this.f224031u.E.add(hVar5);
                            }
                        }
                        int i89 = xe5Var.f471550g;
                        if (i89 == 404 || i89 == 484) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify phonenumber invalid");
                            this.f224031u.f386448r = true;
                        }
                        k83.g gVar16 = this.f224031u;
                        gVar16.f386438h = xe5Var.f471551h;
                        gVar16.f386437g = xe5Var.f471550g;
                        gVar16.f386439i = xe5Var.f471552i;
                        gVar16.f386440j = xe5Var.f471553m;
                    }
                }
                return false;
        }
    }

    public final void j(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleSync, success: %b", java.lang.Boolean.valueOf(z17));
        if (z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406253d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().b(this.f224031u.f386455y);
        }
        if (z17) {
            k83.g gVar = this.f224031u;
            if (gVar == null || !z17) {
                return;
            }
            k(gVar.a());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "sync failed!");
        this.f224024n.p();
        if (!(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a == 3) || (oVar = this.f224022i) == null) {
            return;
        }
        k83.g gVar2 = this.f224031u;
        int i17 = gVar2.f386437g;
        java.lang.String str = gVar2.f386438h;
        int i18 = gVar2.f386439i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar;
        jVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onSyncFailed");
        if (jVar.j(7, 35)) {
            jVar.i(7, null, str, i18);
        }
    }

    public final boolean k(int i17) {
        r83.c cVar = this.f224027q;
        r83.i iVar = this.f224024n;
        switch (i17) {
            case 1:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user ringing");
                if (!this.f224032v) {
                    this.f224032v = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar = this.f224022i;
                    if (oVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onStartRing, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f(4)) {
                            m83.d Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                            if (Zi.f406274s == 0) {
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                Zi.f406274s = currentTimeMillis;
                                Zi.f406261f = currentTimeMillis - Zi.f406273r;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().a();
                            m83.d Zi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                            Zi2.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallReportHelper", "startRing");
                            Zi2.f406256a = 1;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.l lVar = jVar.f223977d;
                            if (lVar != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) lVar;
                                if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().b()) {
                                    boolean a17 = l6Var.f224442h.a();
                                    j83.b Ai = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
                                    if (Ai != null) {
                                        Ai.f379698p = a17;
                                    }
                                    boolean a18 = l6Var.f224442h.a();
                                    j83.b Ai2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ai();
                                    if (Ai2 != null) {
                                        Ai2.f379699q = a18;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().b(l6Var.f224442h.a());
                                }
                            }
                        }
                    }
                }
                return true;
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user accept, isLaunchCancel: %b, isLaunchShutdown: %b", java.lang.Boolean.valueOf(this.f224020g), java.lang.Boolean.valueOf(this.f224021h));
                if (!this.f224020g && !this.f224021h) {
                    iVar.p();
                    if (!this.f224033w) {
                        this.f224033w = true;
                        k83.g gVar = this.f224031u;
                        if (gVar != null) {
                            gVar.M = true;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar2 = this.f224022i;
                        if (oVar2 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar2;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onAccept, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
                            if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f(5)) {
                                m83.d Zi3 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                                if (Zi3.f406275t == 0) {
                                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                                    Zi3.f406275t = currentTimeMillis2;
                                    Zi3.f406262g = currentTimeMillis2 - Zi3.f406273r;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().a();
                                m83.d Zi4 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                                Zi4.getClass();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallReportHelper", "userAccept");
                                Zi4.f406257b = 1;
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j.f223976u;
                                n3Var.mo50300x3fa464aa(jVar2.f223985o);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.aj().e();
                                n3Var.mo50300x3fa464aa(jVar2.f223986p);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().c();
                                if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406253d && !jVar2.f223979f) {
                                    m83.d Zi5 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                                    Zi5.getClass();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallReportHelper", "channelConnect");
                                    Zi5.f406263h = 1;
                                    m83.d Zi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                                    if (Zi6.f406276u == 0) {
                                        Zi6.f406276u = java.lang.System.currentTimeMillis();
                                    }
                                    jVar2.f223979f = true;
                                    jVar2.f223989s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                                    jVar2.n();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406250a.m72840x37bd608();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.l lVar2 = jVar2.f223977d;
                                    if (lVar2 != null) {
                                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) lVar2).f();
                                    }
                                    m83.d Zi7 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                                    if (Zi7.f406281z == 0) {
                                        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                                        Zi7.f406281z = currentTimeMillis3;
                                        Zi7.A = currentTimeMillis3 - Zi7.f406273r;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2.a().c();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2 a19 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2.a();
                                    a19.getClass();
                                    a19.f257861f = new java.lang.ref.WeakReference(jVar2);
                                }
                            }
                        }
                        cVar.j(this.f224031u);
                    }
                }
                return true;
            case 3:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user busy");
                iVar.p();
                cVar.p();
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar3 = this.f224022i;
                if (oVar3 != null) {
                    k83.g gVar2 = this.f224031u;
                    int i18 = gVar2.f386437g;
                    java.lang.String str = gVar2.f386438h;
                    int i19 = gVar2.f386439i;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar3;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onBusy, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
                    if (jVar3.j(1, 4)) {
                        jVar3.i(1, null, str, i19);
                    }
                }
                return true;
            case 4:
            case 7:
            case 8:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user unavailable");
                k83.g gVar3 = this.f224031u;
                if (gVar3.f386448r) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar4 = this.f224022i;
                    if (oVar4 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar4).f(gVar3.f386437g, gVar3.f386440j, gVar3.f386438h, gVar3.f386439i);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar5 = this.f224022i;
                    if (oVar5 != null) {
                        java.lang.String str2 = gVar3.f386438h;
                        int i27 = gVar3.f386439i;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar5;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onUnAvaliable, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
                        if (jVar4.j(3, 5)) {
                            jVar4.i(3, null, str2, i27);
                        }
                    }
                }
                return true;
            case 5:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, other side user shutdown");
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar6 = this.f224022i;
                if (oVar6 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onShutdownByOtherSide, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
                    if (jVar5.c(10, 0, 32)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.l lVar3 = jVar5.f223977d;
                        if (lVar3 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) lVar3;
                            l6Var2.b();
                            l6Var2.g(10);
                            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f(42);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k6 k6Var = l6Var2.f224460z;
                            if (k6Var != null) {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i5((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5) k6Var), 3000L);
                            }
                        } else {
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4y), 1).show();
                        }
                    }
                }
                return true;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, shutdown overdue");
                k83.g gVar4 = this.f224031u;
                gVar4.f386446p = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o oVar7 = this.f224022i;
                if (oVar7 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) oVar7).e(gVar4.f386437g, gVar4.f386440j, gVar4.f386438h, gVar4.f386439i);
                }
                return true;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, do nothing:%d", java.lang.Integer.valueOf(i17));
                return false;
        }
    }

    public final void l(boolean z17, int i17) {
        int i18;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        r83.h hVar = this.f224026p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleUserSelfShutdown, success: %b, isFromNotify: %b", valueOf, java.lang.Boolean.valueOf(hVar.f474849g));
        if (z17 || i17 >= 0 || (i18 = this.f224018e) >= 1) {
            return;
        }
        int i19 = i18 + 1;
        this.f224018e = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "shutdown failed, retry count: %d, isFromNotify: %b", java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(hVar.f474849g));
        hVar.j(this.f224031u);
    }

    public void m(int i17) {
        if (!this.f224031u.M) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrLogic", "shutdownIPCall, user not accept");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "shutdownIPCall, roomId: %d, inviteId: %d", java.lang.Integer.valueOf(this.f224031u.f386431a), java.lang.Integer.valueOf(this.f224031u.f386434d));
        this.f224021h = true;
        this.f224027q.p();
        this.f224024n.p();
        r83.h hVar = this.f224026p;
        hVar.f474849g = false;
        hVar.f474848f = i17;
        hVar.j(this.f224031u);
        this.f224029s.j(this.f224031u);
    }
}
