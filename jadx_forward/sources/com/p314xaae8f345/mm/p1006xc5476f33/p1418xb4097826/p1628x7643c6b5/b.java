package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes8.dex */
public final class b implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249 {

    /* renamed from: a, reason: collision with root package name */
    public float f207536a;

    /* renamed from: b, reason: collision with root package name */
    public float f207537b;

    /* renamed from: c, reason: collision with root package name */
    public final i11.c f207538c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.a(this);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: curContextID */
    public java.lang.String mo58971x2e1fb4aa() {
        return "";
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: curTabSessionID */
    public java.lang.String mo58972x414bcc7c() {
        return "";
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderGetCGIBaseRequest */
    public bw5.sc mo58973x6c32229(int i17, int i18) {
        r45.kv0 a17 = db2.t4.f309704a.a(i17);
        a17.set(1, java.lang.Integer.valueOf(i18));
        bw5.sc scVar = new bw5.sc();
        scVar.mo11468x92b714fd(a17.mo14344x5f01b1f6());
        return scVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderGetCurrentUsername */
    public java.lang.String mo58974x5186a9ff() {
        return g92.b.f351302e.T0();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderRedDotDataChangedActionAsync */
    public void mo58975x35e7803a(long j17, int i17, int i18, bw5.e0 e0Var, bw5.e0 e0Var2, java.lang.String str) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotDataChangedActionAsync--- taskId:" + j17 + ",actionType:" + i17 + ",subReasonType:" + i18 + ",fromCtrlInfoData:" + hc2.a.a(e0Var) + ",toCtrlInfoData:" + hc2.a.a(e0Var2) + ",disposePath:" + str);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderRedDotDataChangedWithPathKey */
    public void mo58976xd81f2aa8(java.lang.String path) {
        zy2.ga e07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().e0();
        if (e07 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8 k8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8) e07;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotDataChangedWithPathKey--- " + path);
            if (path == null || path.length() == 0) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9 x9Var = k8Var.f187163a;
            x9Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(x9Var, path, g92.b.f351302e.T0(), false, false, 12, null);
            jz5.f0 f0Var = null;
            r45.f03 I0 = S0 != null ? S0.I0(path) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyRedDotChange] ");
            sb6.append(S0 != null ? S0.f65880x11c19d58 : null);
            sb6.append(" ,path:");
            sb6.append(I0 != null ? I0.f455425i : null);
            sb6.append('(');
            sb6.append(path);
            sb6.append(") businessType=");
            sb6.append(S0 != null ? java.lang.Integer.valueOf(S0.f65873xe412923f) : null);
            sb6.append(" count:");
            sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f455421e) : null);
            sb6.append(" clearType:");
            sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f455424h) : null);
            sb6.append(" parent:");
            sb6.append(I0 != null ? I0.f455426m : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", sb6.toString());
            if (S0 != null && I0 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a, "notifyRedDotChange", true, path, I0, S0, null, x9Var.p(path, S0), 32, null);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a, "notifyRedDotChange", false, path, I0, S0, null, x9Var.p(path, S0), 32, null);
            }
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderRedDotDataReceiveRedDotBindObjectPathKey */
    public void mo58977x6ae0e1ab(java.lang.String str) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotDataReceiveRedDotBindObjectPathKey--- " + str);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderRedDotDataReceiveWithPathKey */
    public void mo58978xa73b7719(java.lang.String str, boolean z17) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotDataReceiveWithPathKey--- path=" + str + " isAlreadExistRedDot=" + z17 + '!');
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderRedDotDataRevokedWithPathKey */
    public void mo58979xccf7947e(java.lang.String str) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotDataRevokedWithPathKey--- " + str);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderRedDotEnableUseCtrlInfoInNMStrategy */
    public boolean mo58980xc0dba96(java.lang.String str, boolean z17, bw5.e0 e0Var) {
        zy2.ga e07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().e0();
        if (e07 == null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8 k8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8) e07;
        if (!z17) {
            if (!(str == null || str.length() == 0) && e0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b17 = hc2.a.b(e0Var);
                if (b17 == null) {
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5 l5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) k8Var.f187164b;
                boolean z18 = !l5Var.C(str, b17);
                if (z18) {
                    z18 = !l5Var.E("finderRedDotEnableUseCtrlInfoInNMStrategy", str, b17, k8Var.y(kz5.b0.c(str)));
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotEnableUseCtrlInfoInNMStrategy--- redDotPath=" + str + " enableUse=" + z18 + '!');
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotEnableUseCtrlInfoInNMStrategy--- redDotPath=" + str + " enableUse=" + z18 + '!');
                }
                return z18;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---finderRedDotEnableUseCtrlInfoInNMStrategy--- redDotPath=");
        sb6.append(str);
        sb6.append(" ignoreNMFrequency=");
        sb6.append(z17);
        sb6.append(",maxPriorityCtrlInfoData=");
        sb6.append(e0Var != null ? hc2.a.a(e0Var) : null);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
        return true;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderRedDotHasAddActionAsync */
    public void mo58981x491064a1(long j17, bw5.e0 e0Var) {
        bw5.ev b17;
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---finderRedDotHasAddActionAsync--- ");
            sb6.append((e0Var == null || (b17 = e0Var.b()) == null) ? null : b17.m11860x5ec9c89());
            sb6.append(",taskId=");
            sb6.append(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderRedDotHasDisposeActionAsync */
    public void mo58982x14018e63(long j17, java.lang.String str, bw5.e0 e0Var) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---finderRedDotHasDisposeActionAsync--- taskId=");
            sb6.append(j17);
            sb6.append(",path=");
            sb6.append(str);
            sb6.append(",ctrlInfoData=");
            sb6.append(e0Var != null ? hc2.a.a(e0Var) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderRedDotWillAddAction */
    public boolean mo58983x2b6b6867(bw5.e0 e0Var) {
        bw5.ev b17;
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() == null) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---finderRedDotWillAddAction--- ");
        sb6.append((e0Var == null || (b17 = e0Var.b()) == null) ? null : b17.m11860x5ec9c89());
        sb6.append(",forbidAction=false");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
        return false;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: finderRedDotWillDisposeAction */
    public boolean mo58984x2adde765(java.lang.String str) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotWillDisposeAction--- " + str + ", forbidAction=false");
        return false;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: getCacheLocation */
    public bw5.tj mo58985xaacbcda1() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().f(this.f207538c);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        long j17 = i11.h.e().f368632h;
        bw5.tj tjVar = new bw5.tj();
        tjVar.f115000d = this.f207536a;
        boolean[] zArr = tjVar.f115003g;
        zArr[1] = true;
        tjVar.f115001e = this.f207537b;
        zArr[2] = true;
        tjVar.f115002f = (int) (j17 / 1000);
        zArr[3] = true;
        return tjVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: getContact */
    public java.util.ArrayList mo58986x76845fea(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ya2.b2 Ui = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ui(username);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i17 = Ui != null ? ya2.d.i(Ui) : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i17 != null) {
            bw5.ae aeVar = new bw5.ae();
            aeVar.mo11468x92b714fd(i17.m75962x8b6d8abc());
            arrayList.add(aeVar);
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: getCurFinderUnreadCountByUsername */
    public int mo58987xc0b7531d(java.lang.String str, boolean z17, int i17, int i18) {
        java.lang.String str2;
        zy2.ga e07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().e0();
        if (e07 == null) {
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8 k8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8) e07;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---getCurFinderUnreadCountByUsername--- finderUsername:" + str);
            str2 = g92.b.f351302e.T0();
        } else {
            str2 = str;
        }
        int A = k8Var.A("---getCurFinderUnreadCountByUsername---", str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---getCurFinderUnreadCountByUsername--- finderUsername:" + str + " fromRedDotPath:" + z17 + ",finderMsgCount=" + i17 + ",finderMembershipCount=" + i18 + ",privateMsgUnreadCount=" + A);
        return A + i17 + i18;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: getFeedSessionBuffer */
    public java.lang.String mo58988x2dd09cc2(java.lang.String str, bw5.os0 os0Var, java.lang.String str2) {
        java.lang.String str3;
        r45.fl2 fl2Var;
        java.lang.String m75945x2fec8307;
        if (str == null) {
            return "";
        }
        if (str2 == null || (str3 = "_".concat(str2)) == null) {
            str3 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        long Z = pm0.v.Z(str);
        int i17 = os0Var != null ? os0Var.f112918d : 0;
        o3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 e6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6) o3Var.f206744g.get(Z + "__" + i17 + str3);
        return (e6Var == null || (fl2Var = e6Var.f206545a) == null || (m75945x2fec8307 = fl2Var.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: getLocalFinderObject */
    public java.util.ArrayList mo58989x42b4c55a(java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        if (arrayList == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(pm0.v.Z((java.lang.String) it.next()));
            byte[] m75962x8b6d8abc = (h17 == null || (feedObject = h17.getFeedObject()) == null) ? null : feedObject.m75962x8b6d8abc();
            if (m75962x8b6d8abc != null) {
                arrayList2.add(new bw5.yr().mo11468x92b714fd(m75962x8b6d8abc));
            }
        }
        return arrayList2;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: getPrivateMsgTotalUnreadCountByUsername */
    public int mo58990x2333d23d(java.lang.String str) {
        zy2.ga e07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().e0();
        if (e07 == null) {
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8 k8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8) e07;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---getPrivateMsgTotalUnreadCountByUsername--- finderUsername:" + str);
            str = g92.b.f351302e.T0();
        }
        return k8Var.A("---getPrivateMsgTotalUnreadCountByUsername---", str);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: isRedDotMeetWithCondition */
    public boolean mo58991x328b4d4c(java.lang.String str, bw5.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b17;
        java.lang.ref.WeakReference weakReference;
        yz5.l lVar;
        zy2.ga e07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().e0();
        if (e07 == null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8 k8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8) e07;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---isRedDotMeetWithCondition--- conditionUniqueId:" + str + ",ctrlInfo:" + hc2.a.a(e0Var) + ",contain uniqueId:" + k8Var.C().containsKey(str));
        if (e0Var == null || (b17 = hc2.a.b(e0Var)) == null || (weakReference = (java.lang.ref.WeakReference) k8Var.C().get(str)) == null || (lVar = (yz5.l) weakReference.get()) == null) {
            sb6.append(" checkResult fail!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            return false;
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.mo146xb9724478(b17)).booleanValue();
        sb6.append(" checkResult=" + booleanValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
        return booleanValue;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: reddotPersonalExposeClearSwitch */
    public boolean mo58992x726db2e5() {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.r() == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---reddotPersonalExposeClearSwitch--- switchOn:" + r1);
        }
        return r1;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: reddotWillRevokeTipsUuidArray */
    public void mo58993xea0c3ab6(java.util.ArrayList arrayList) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "---reddotWillRevokeTipsUuidArray--- willRevokeTipsUuid:" + arrayList);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: saveFinderObject */
    public void mo58994xbc039522(java.util.ArrayList arrayList, bw5.os0 os0Var, java.lang.String str) {
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] m75962x8b6d8abc = ((bw5.yr) it.next()).m75962x8b6d8abc();
                if (m75962x8b6d8abc != null) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725.m76746xaf65a0fc().mo11468x92b714fd(m75962x8b6d8abc);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = mo11468x92b714fd instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) mo11468x92b714fd : null;
                    if (c19792x256d2725 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).rk(c19792x256d2725, os0Var != null ? os0Var.f112918d : 0, str);
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249
    /* renamed from: setCallback */
    public void mo58995x6c4ebec7(com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249.Callback callback) {
    }
}
