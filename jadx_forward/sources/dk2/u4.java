package dk2;

/* loaded from: classes10.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f315687a;

    /* renamed from: b, reason: collision with root package name */
    public final long f315688b;

    /* renamed from: c, reason: collision with root package name */
    public int f315689c;

    /* renamed from: d, reason: collision with root package name */
    public int f315690d;

    /* renamed from: e, reason: collision with root package name */
    public int f315691e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f315692f;

    /* renamed from: g, reason: collision with root package name */
    public int f315693g;

    /* renamed from: h, reason: collision with root package name */
    public int f315694h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f315695i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f315696j;

    /* renamed from: k, reason: collision with root package name */
    public r45.gd2 f315697k;

    /* renamed from: l, reason: collision with root package name */
    public r45.hm1 f315698l;

    /* renamed from: m, reason: collision with root package name */
    public int f315699m;

    /* renamed from: n, reason: collision with root package name */
    public int f315700n;

    /* renamed from: o, reason: collision with root package name */
    public int f315701o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f315702p;

    public u4(java.lang.String str, long j17, int i17, int i18, int i19, java.util.List list, int i27, int i28, java.lang.String str2, java.util.List list2, r45.gd2 gd2Var, r45.hm1 hm1Var, int i29, int i37, int i38, int i39, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.util.List playerInfo;
        java.util.List battleTeams;
        java.lang.String str3 = (i39 & 1) != 0 ? null : str;
        long j18 = (i39 & 2) != 0 ? 0L : j17;
        int i47 = (i39 & 4) != 0 ? 0 : i17;
        int i48 = (i39 & 8) != 0 ? 0 : i18;
        int i49 = (i39 & 16) != 0 ? 0 : i19;
        if ((i39 & 32) != 0) {
            playerInfo = java.util.Collections.synchronizedList(new java.util.ArrayList());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(playerInfo, "synchronizedList(...)");
        } else {
            playerInfo = list;
        }
        int i57 = (i39 & 64) != 0 ? 1 : i27;
        int i58 = (i39 & 128) != 0 ? 0 : i28;
        java.lang.String str4 = (i39 & 256) != 0 ? null : str2;
        if ((i39 & 512) != 0) {
            battleTeams = java.util.Collections.synchronizedList(new java.util.ArrayList());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(battleTeams, "synchronizedList(...)");
        } else {
            battleTeams = list2;
        }
        r45.gd2 gd2Var2 = (i39 & 1024) != 0 ? null : gd2Var;
        r45.hm1 hm1Var2 = (i39 & 2048) != 0 ? null : hm1Var;
        int i59 = (i39 & 4096) != 0 ? 0 : i29;
        int i66 = (i39 & 8192) != 0 ? 0 : i37;
        int i67 = (i39 & 16384) != 0 ? 0 : i38;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playerInfo, "playerInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleTeams, "battleTeams");
        this.f315687a = str3;
        this.f315688b = j18;
        this.f315689c = i47;
        this.f315690d = i48;
        this.f315691e = i49;
        this.f315692f = playerInfo;
        this.f315693g = i57;
        this.f315694h = i58;
        this.f315695i = str4;
        this.f315696j = battleTeams;
        this.f315697k = gd2Var2;
        this.f315698l = hm1Var2;
        this.f315699m = i59;
        this.f315700n = i66;
        this.f315701o = i67;
        this.f315702p = "Finder.FinderLiveBattleData";
    }

    public final km2.k a() {
        java.util.List<km2.k> list = this.f315692f;
        synchronized (list) {
            for (km2.k kVar : list) {
                if (kVar.f390654h) {
                    return kVar;
                }
            }
            return null;
        }
    }

    public final java.lang.String b(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        if (i17 != 1) {
            return "";
        }
        r45.km1 km1Var = new r45.km1();
        if (gVar != null) {
            try {
                km1Var.mo11468x92b714fd(gVar.f273689a);
            } catch (java.io.IOException unused) {
            }
        }
        java.lang.String m75945x2fec8307 = km1Var.m75945x2fec8307(0);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    public final km2.k c(java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315702p, "getOtherBattleUser userName:" + str);
        java.util.List list = this.f315692f;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.k) obj).f390647a, str)) {
                    break;
                }
            }
        }
        return (km2.k) obj;
    }

    public final km2.k d(km2.q user) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(user, "user");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.List<km2.k> list = this.f315692f;
        synchronized (list) {
            for (km2.k kVar : list) {
                java.lang.String str = kVar.f390647a;
                if (str == null) {
                    str = "";
                }
                hashMap.put(str, kVar);
                java.lang.String str2 = kVar.f390648b;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap2.put(str2, kVar);
            }
        }
        java.lang.String str3 = user.f390703a;
        if (str3 == null) {
            str3 = "";
        }
        if (hashMap2.get(str3) != null) {
            java.lang.String str4 = user.f390703a;
            if (str4 == null) {
                str4 = "";
            }
            return (km2.k) hashMap2.get(str4);
        }
        java.lang.String str5 = user.f390705c;
        if (str5 == null) {
            str5 = "";
        }
        if (hashMap.get(str5) != null) {
            java.lang.String str6 = user.f390705c;
            if (str6 == null) {
                str6 = "";
            }
            return (km2.k) hashMap.get(str6);
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.Iterator it = this.f315696j.iterator();
        while (it.hasNext()) {
            java.util.LinkedList<r45.wk6> m75941xfb821914 = ((r45.r22) it.next()).m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
            for (r45.wk6 wk6Var : m75941xfb821914) {
                java.lang.String m75945x2fec8307 = wk6Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                java.lang.String m75945x2fec83072 = wk6Var.m75945x2fec8307(0);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                hashMap3.put(m75945x2fec8307, m75945x2fec83072);
            }
        }
        java.lang.String str7 = (java.lang.String) hashMap3.get(user.f390703a);
        if (str7 == null) {
            str7 = "";
        }
        return (km2.k) hashMap.get(str7);
    }

    public final km2.k e(java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315702p, "getSelfBattleUser anchorUsername:" + str);
        java.util.List list = this.f315692f;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.k) obj).f390647a, str)) {
                    break;
                }
            }
        }
        return (km2.k) obj;
    }

    /* renamed from: equals */
    public boolean m124665xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.u4)) {
            return false;
        }
        dk2.u4 u4Var = (dk2.u4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315687a, u4Var.f315687a) && this.f315688b == u4Var.f315688b && this.f315689c == u4Var.f315689c && this.f315690d == u4Var.f315690d && this.f315691e == u4Var.f315691e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315692f, u4Var.f315692f) && this.f315693g == u4Var.f315693g && this.f315694h == u4Var.f315694h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315695i, u4Var.f315695i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315696j, u4Var.f315696j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315697k, u4Var.f315697k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315698l, u4Var.f315698l) && this.f315699m == u4Var.f315699m && this.f315700n == u4Var.f315700n && this.f315701o == u4Var.f315701o;
    }

    public final boolean f() {
        return this.f315699m == 0;
    }

    public final boolean g() {
        return this.f315699m == 3;
    }

    public final boolean h() {
        return this.f315691e == 2;
    }

    /* renamed from: hashCode */
    public int m124666x8cdac1b() {
        java.lang.String str = this.f315687a;
        int hashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Long.hashCode(this.f315688b)) * 31) + java.lang.Integer.hashCode(this.f315689c)) * 31) + java.lang.Integer.hashCode(this.f315690d)) * 31) + java.lang.Integer.hashCode(this.f315691e)) * 31) + this.f315692f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f315693g)) * 31) + java.lang.Integer.hashCode(this.f315694h)) * 31;
        java.lang.String str2 = this.f315695i;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f315696j.hashCode()) * 31;
        r45.gd2 gd2Var = this.f315697k;
        int hashCode3 = (hashCode2 + (gd2Var == null ? 0 : gd2Var.hashCode())) * 31;
        r45.hm1 hm1Var = this.f315698l;
        return ((((((hashCode3 + (hm1Var != null ? hm1Var.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f315699m)) * 31) + java.lang.Integer.hashCode(this.f315700n)) * 31) + java.lang.Integer.hashCode(this.f315701o);
    }

    public final boolean i() {
        return this.f315691e == 3;
    }

    public final boolean j() {
        java.util.List list = this.f315692f;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((km2.k) it.next()).f390655i > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean k() {
        int i17 = this.f315699m;
        return i17 == 1 || i17 == 2;
    }

    public final void l(int i17) {
        this.f315691e = 3;
        this.f315690d = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315702p, "transEnd endResult: " + i17);
    }

    public final void m(java.util.List remotePlayerInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePlayerInfo, "remotePlayerInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = remotePlayerInfo.iterator();
        while (it.hasNext()) {
            r45.s85 s85Var = (r45.s85) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315702p, "updatePlayerInfo remotePlayerInfo:[" + s85Var.m75945x2fec8307(0) + ", " + s85Var.m75942xfb822ef2(1) + ", " + s85Var.m75939xb282bd08(2) + ", count: " + s85Var.m75942xfb822ef2(7) + " userId: " + s85Var.m75945x2fec8307(10) + " username: " + s85Var.m75945x2fec8307(0) + " boardKey: " + s85Var.m75945x2fec8307(8) + "] boardType: " + s85Var.m75939xb282bd08(9));
            arrayList.add(new km2.k(s85Var.m75945x2fec8307(0), s85Var.m75945x2fec8307(10), s85Var.m75942xfb822ef2(1), s85Var.m75939xb282bd08(2), s85Var.m75933x41a8a7f2(3), (r45.ja0) s85Var.m75936x14adae67(4), s85Var.m75942xfb822ef2(5), s85Var.m75933x41a8a7f2(6), s85Var.m75942xfb822ef2(7), s85Var.m75945x2fec8307(8), s85Var.m75939xb282bd08(9)));
        }
        java.util.List list = this.f315692f;
        list.clear();
        list.addAll(arrayList);
    }

    /* renamed from: toString */
    public java.lang.String m124667x9616526c() {
        return "FinderLiveBattleData(battleId=" + this.f315687a + ", battleSeq=" + this.f315688b + ", leftTime=" + this.f315689c + ", battleResult=" + this.f315690d + ", battleStatus=" + this.f315691e + ", playerInfo=" + this.f315692f + ", battleMode=" + this.f315693g + ", battleWinWay=" + this.f315694h + ", battleSelectGift=" + this.f315695i + ", battleTeams=" + this.f315696j + ", templateInfo=" + this.f315697k + ", extraInfo=" + this.f315698l + ", battleScope=" + this.f315699m + ", battleDuration=" + this.f315700n + ", battleLayout=" + this.f315701o + ')';
    }
}
