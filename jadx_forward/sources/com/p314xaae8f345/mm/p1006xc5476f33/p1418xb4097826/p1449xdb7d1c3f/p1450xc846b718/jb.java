package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class jb extends dm.a5 {
    public static final l75.e0 Q = dm.a5.m124787x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb.class);
    public final java.util.concurrent.ConcurrentHashMap K = new java.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.ConcurrentHashMap L = new java.util.concurrent.ConcurrentHashMap();
    public final jz5.g M = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.xa.f187554d);
    public final r45.xs2 N = new r45.xs2();
    public final java.util.List P = kz5.c0.i(new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ab.f186938d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.bb.f186957d), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.cb.f186982d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.db.f187009d));

    public static /* synthetic */ boolean o1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, zy2.ba baVar, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        return jbVar.n1(baVar, z17);
    }

    public static java.util.LinkedList q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, java.lang.String path, boolean z17, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        java.util.LinkedList j17;
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            str = "";
        }
        jbVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (!jbVar.P0()) {
            return jbVar.j1(path, z17, i17, str);
        }
        synchronized (jbVar) {
            j17 = jbVar.j1(path, z17, i17, str);
        }
        return j17;
    }

    public final boolean A0(zy2.ba storage, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotCtrInfo", "delete");
        this.f65874xb5f7102a.f470022g.clear();
        this.K.clear();
        this.L.clear();
        return n1(storage, z17);
    }

    public final r45.ez2 D0() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.N.m75934xbce7f2f(7);
        if (m75934xbce7f2f == null && (gVar = this.f65874xb5f7102a.f470021f) != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.xs2().mo11468x92b714fd(gVar.g());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderRedDotExtInfo");
            m75934xbce7f2f = ((r45.xs2) mo11468x92b714fd).m75934xbce7f2f(7);
        }
        if (m75934xbce7f2f == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd2 = new r45.ez2().mo11468x92b714fd(m75934xbce7f2f.g());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderTabTipsByPassInfo");
        return (r45.ez2) mo11468x92b714fd2;
    }

    public final boolean F0(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f65883xdec927b, username)) {
            return true;
        }
        java.lang.String str = this.f65883xdec927b;
        return str == null || str.length() == 0;
    }

    public final r45.h03 G0(java.lang.String str) {
        java.util.LinkedList linkedList;
        r45.g03 g03Var = this.f65877xc67b9ef7;
        java.lang.Object obj = null;
        if (g03Var == null || (linkedList = g03Var.f456309d) == null) {
            return null;
        }
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.h03) next).f457240d, str)) {
                    obj = next;
                    break;
                }
            }
        }
        return (r45.h03) obj;
    }

    public final r45.f03 I0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return (r45.f03) this.K.get(path);
    }

    public final java.util.List J0() {
        java.util.Enumeration keys = this.K.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        java.util.ArrayList list = java.util.Collections.list(keys);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list(...)");
        return list;
    }

    public final java.util.List L0() {
        java.util.Collection values = this.K.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        return kz5.n0.S0(values);
    }

    public final boolean P0() {
        return ((java.lang.Boolean) ((jz5.n) this.M).mo141623x754a37bb()).booleanValue();
    }

    public final int Q0(boolean z17) {
        int i17 = this.f65873xe412923f;
        if (i17 == 0 || z17) {
            int i18 = this.f65875xb5fc3ab6;
            if (i18 >= 100001 && i18 < 199999) {
                return 4;
            }
            if (i18 >= 400000 && i18 < 499999) {
                return 8;
            }
            if (i18 >= 300000 && i18 < 399999) {
                return 6;
            }
            if (i18 >= 500000 && i18 < 599999) {
                return 9;
            }
            if (i18 >= 600000 && i18 < 699999) {
                return (!z17 || i18 < 630000 || i18 >= 659999) ? 10 : 14;
            }
        }
        return i17;
    }

    public final int R0(java.lang.String str) {
        return Q0(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Listen.Entrance"));
    }

    public final int T0() {
        if (I0("TLWxPrivateMsgBubble") != null || I0("TLWxBubble") != null) {
            return 4;
        }
        r45.f03 I0 = I0("TLFollow");
        r45.xs2 xs2Var = this.N;
        if (I0 != null) {
            return xs2Var.m75939xb282bd08(9) != -1 ? xs2Var.m75939xb282bd08(9) : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("TLFollow");
        }
        if (I0("TLRecommendTab") != null) {
            return xs2Var.m75939xb282bd08(9) != -1 ? xs2Var.m75939xb282bd08(9) : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("TLRecommendTab");
        }
        if (I0("finder_tl_hot_tab") != null) {
            return xs2Var.m75939xb282bd08(9) != -1 ? xs2Var.m75939xb282bd08(9) : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("finder_tl_hot_tab");
        }
        if (I0("finder_tl_nearby_tab") != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("finder_tl_nearby_tab");
        }
        if (I0("finder_tl_city_tab") != null) {
            return xs2Var.m75939xb282bd08(9) != -1 ? xs2Var.m75939xb282bd08(9) : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("finder_tl_city_tab");
        }
        if (I0("NearbyFeedTab") != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("NearbyFeedTab");
        }
        if (I0("NearbyLiveTab") != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("NearbyLiveTab");
        }
        if (I0("NearbyPeopleTab") != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("NearbyPeopleTab");
        }
        if (I0("NewLife.SquareTab") != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("NewLife.SquareTab");
        }
        if (I0("K1k.Tab1") != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("K1k.Tab1");
        }
        if (I0("K1k.Tab2") != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("K1k.Tab2");
        }
        if (I0("K1k.Tab3") != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b("K1k.Tab3");
        }
        int m75939xb282bd08 = xs2Var.m75939xb282bd08(9);
        if (m75939xb282bd08 != 0) {
            return m75939xb282bd08;
        }
        return -1;
    }

    public final java.util.List U0(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : this.K.entrySet()) {
            if (d1((java.lang.String) entry.getKey(), source)) {
                linkedList.add(entry.getKey());
            }
        }
        return linkedList;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e W0() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e = this.f65881x115e537f;
        return c19795xce8b809e == null ? new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e() : c19795xce8b809e;
    }

    public final boolean Y0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        r45.f03 I0 = I0(path);
        return I0 != null && I0.f455432s == 1;
    }

    public final int Z0(java.lang.String str) {
        r45.q40 q40Var;
        r45.q40 q40Var2;
        long e17 = c01.id.e();
        r45.f03 I0 = I0(str);
        if ((I0 != null ? I0.f455430q : null) == null) {
            if (I0 != null) {
                I0.f455430q = new r45.q40();
            }
            r45.q40 q40Var3 = I0 != null ? I0.f455430q : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q40Var3);
            q40Var3.f465191f = c01.id.e();
        }
        int i17 = 0;
        if ((I0 == null || (q40Var2 = I0.f455430q) == null || q40Var2.f465191f != 0) ? false : true) {
            r45.q40 q40Var4 = I0 != null ? I0.f455430q : null;
            if (q40Var4 != null) {
                q40Var4.f465191f = e17;
            }
        }
        r45.q40 q40Var5 = I0 != null ? I0.f455430q : null;
        if (q40Var5 != null) {
            q40Var5.f465200r = e17;
        }
        r45.q40 q40Var6 = I0 != null ? I0.f455430q : null;
        if (q40Var6 != null) {
            q40Var6.f465194i = c01.id.c();
        }
        r45.q40 q40Var7 = I0 != null ? I0.f455430q : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q40Var7);
        r45.q40 q40Var8 = I0 != null ? I0.f455430q : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q40Var8);
        q40Var7.f465189d = q40Var8.f465189d + 1;
        if (I0 != null && (q40Var = I0.f455430q) != null) {
            i17 = q40Var.f465189d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotCtrInfo", "increase reddot expose path = " + str + ", exposeCount = " + i17 + ", tipsId=[" + this.f65880x11c19d58 + ']');
        return i17;
    }

    public final boolean a1(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        r45.f03 I0 = I0(path);
        return I0 != null && I0.I;
    }

    public final boolean c1() {
        long j17 = this.f65876x663babcd;
        return j17 > 0 && (j17 * 1000) + this.f65879x2261f6f2 <= c01.id.c();
    }

    public final boolean d1(java.lang.String path, java.lang.String source) {
        r45.f03 I0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        r45.h03 G0 = G0(path);
        if (G0 == null || (I0 = I0(path)) == null) {
            return false;
        }
        long j17 = G0.f457241e;
        int i17 = I0.G * 1000;
        if (j17 <= 0 || i17 <= 0) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotCtrInfo", "isExposeExpired " + source + ' ' + path + " exposeTimeMs=" + j17 + " exposeExpiredTimeMs=" + i17 + ':' + this);
            }
            return false;
        }
        boolean z17 = j17 + ((long) i17) <= c01.id.c();
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotCtrInfo", "isExposeExpired " + source + ' ' + path + " expose expired:" + this);
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotCtrInfo", "isExposeExpired " + source + ' ' + path + " expose not expired:" + this);
            }
        }
        return z17;
    }

    public final boolean e1() {
        return Q0(false) == 6;
    }

    public final boolean f1() {
        return Q0(false) == 8;
    }

    @Override // dm.a5, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return Q;
    }

    /* renamed from: getType */
    public final int m55856xfb85f7b0() {
        r45.vs2 vs2Var = this.f65874xb5f7102a;
        if (vs2Var != null) {
            return vs2Var.f470020e;
        }
        return 0;
    }

    public final boolean h1() {
        java.util.LinkedList linkedList = this.f65874xb5f7102a.f470022g;
        return linkedList == null || linkedList.isEmpty();
    }

    public final void i1(java.lang.String str, java.lang.String str2) {
        java.util.List list;
        r45.f03 f03Var = (r45.f03) this.K.get(str);
        if (f03Var == null || f03Var.f455424h != 2 || (list = (java.util.List) this.L.get(str)) == null) {
            return;
        }
        pm0.v.G(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.eb(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fb, code lost:
    
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "是否移除clear_type为0的红点", e42.c0.clicfg_finder_need_handle_clear_type_none, java.lang.Boolean.TRUE, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ff0.f208306d, 8, null)).booleanValue() != false) goto L142;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedList j1(java.lang.String r21, boolean r22, int r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb.j1(java.lang.String, boolean, int, java.lang.String):java.util.LinkedList");
    }

    public final boolean k1(java.lang.String str, long j17, int i17) {
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", "setExpose fail,path=" + str + " exposeTime=" + j17 + " exposeExpiredTime=" + i17);
            return false;
        }
        long c17 = c01.id.c();
        if (c17 >= i17 + j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", "setExpose time out,path=" + str + " exposeTime=" + j17 + " exposeExpiredTime=" + i17 + ",now=" + c17);
            return false;
        }
        r45.h03 G0 = G0(str);
        if (G0 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotCtrInfo", "setExpose path=" + str + " modify exposeTime from " + G0.f457241e + " to " + j17 + " ,exposeExpiredTime=" + i17 + ",now=" + c17);
            G0.f457241e = j17;
            G0.f457240d = str;
            return true;
        }
        r45.h03 h03Var = new r45.h03();
        h03Var.f457241e = j17;
        h03Var.f457240d = str;
        this.f65877xc67b9ef7.f456309d.add(h03Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotCtrInfo", "setExpose path=" + str + " exposeTime=" + j17 + " exposeExpiredTime=" + i17 + ",now=" + c17);
        return true;
    }

    public final boolean l1(java.lang.String path, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotCtrInfo", "setExposeExpiredInfo path=" + path + " exposeTime=" + j17 + ' ' + this);
        if ((path.length() == 0) || j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", "setExposeExpiredInfo but path=" + path + " exposeTime=" + j17);
            return false;
        }
        synchronized (this) {
            r45.f03 I0 = I0(path);
            if (I0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", "setExposeExpiredInfo path=" + path + " exposeTime=" + j17 + ", but showInfo is null!");
                return false;
            }
            int i17 = I0.G * 1000;
            if (i17 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", "setExposeExpiredInfo path=" + path + " but exposeExpiredTime=" + i17 + '!');
                return false;
            }
            r45.h03 G0 = G0(path);
            long j18 = G0 != null ? G0.f457241e : 0L;
            if (j18 <= 0) {
                return k1(path, j17, i17);
            }
            if (z17) {
                return k1(path, j17, i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", "setExposeExpiredInfo path=" + path + " but have set exposeTime:" + j18);
            return false;
        }
    }

    public final boolean n1(zy2.ba storage, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb w07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        java.lang.String str2 = this.f65874xb5f7102a.f470023h;
        if (!(!(str2 == null || str2.length() == 0))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", this.f65880x11c19d58 + " is inValid");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[store](");
        sb6.append(java.lang.Thread.currentThread().getName());
        sb6.append(") ");
        sb6.append(this);
        sb6.append(" apiWithSync=");
        sb6.append(P0());
        sb6.append(' ');
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        } else {
            str = "";
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotCtrInfo", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (P0()) {
            synchronized (this) {
                w07 = w0();
            }
        } else {
            w07 = w0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.hb hbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.hb(this, storage, w07, currentTimeMillis);
        if (z17) {
            pm0.v.O("Finder.RedDotCtrInfo", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.gb(hbVar));
        } else {
            hbVar.mo152xb9724478();
        }
        return true;
    }

    public final void p1(java.lang.String str) {
        java.util.LinkedList linkedList;
        java.util.LinkedList show_infos = this.f65874xb5f7102a.f470022g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
        kz5.h0.B(show_infos, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ib(str));
        r45.g03 g03Var = this.f65877xc67b9ef7;
        if (g03Var == null || (linkedList = g03Var.f456309d) == null) {
            return;
        }
        pm0.v.I(linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.fb(str));
    }

    public final bw5.e0 r1() {
        r45.vs2 vs2Var = this.f65874xb5f7102a;
        if (vs2Var == null) {
            return null;
        }
        byte[] mo14344x5f01b1f6 = vs2Var.mo14344x5f01b1f6();
        bw5.ev evVar = new bw5.ev();
        evVar.mo11468x92b714fd(mo14344x5f01b1f6);
        bw5.e0 e0Var = new bw5.e0();
        e0Var.f108205d = evVar;
        boolean[] zArr = e0Var.f108207f;
        zArr[1] = true;
        e0Var.f108206e = this.f65879x2261f6f2;
        zArr[2] = true;
        return e0Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb t0(r45.vs2 proto) {
        boolean z17;
        r45.xs2 xs2Var = this.N;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        this.f65874xb5f7102a = proto;
        this.f65875xb5fc3ab6 = proto.f470020e;
        int Q0 = Q0(false);
        this.f65873xe412923f = Q0;
        if (Q0 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotCtrInfo", "build fixBusinessType from " + this.f65873xe412923f + " to " + proto.f470038z + '!');
            this.f65873xe412923f = proto.f470038z;
        }
        this.f65876x663babcd = proto.f470024i;
        this.f65880x11c19d58 = proto.f470023h;
        this.f65882x5364c75d = proto.f470036x;
        if (this.f65879x2261f6f2 <= 0) {
            this.f65879x2261f6f2 = c01.id.c();
        }
        java.lang.String str = proto.f470029q;
        if (str == null) {
            str = "";
        }
        this.f65883xdec927b = str;
        if (this.f65877xc67b9ef7 == null) {
            this.f65877xc67b9ef7 = new r45.g03();
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e();
        java.util.LinkedList show_infos = proto.f470022g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
        java.util.Iterator it = show_infos.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            r45.f03 f03Var = (r45.f03) it.next();
            if (f03Var.f455427n == 1) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = f03Var.f455428o;
                c19795xce8b809e.mo11468x92b714fd(gVar != null ? gVar.f273689a : null);
            }
        }
        this.f65881x115e537f = c19795xce8b809e;
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f65874xb5f7102a.f470021f;
            if (gVar2 != null) {
                xs2Var.mo11468x92b714fd(gVar2.f273689a);
            }
            if (xs2Var.m75939xb282bd08(9) == 0) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e2 = this.f65881x115e537f;
                xs2Var.set(7, c19795xce8b809e2.m75934xbce7f2f(6));
                xs2Var.set(1, c19795xce8b809e2.m75945x2fec8307(3));
                xs2Var.set(9, java.lang.Integer.valueOf(c19795xce8b809e2.m75939xb282bd08(2) == 0 ? -1 : c19795xce8b809e2.m75939xb282bd08(2)));
                xs2Var.set(3, java.lang.Long.valueOf(c19795xce8b809e2.m75942xfb822ef2(0)));
                xs2Var.set(8, c19795xce8b809e2.m75945x2fec8307(1));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[parseRedDotExtInfo] use old logic username=");
                sb6.append(xs2Var.m75945x2fec8307(1));
                sb6.append(" object_id=");
                sb6.append(xs2Var.m75942xfb822ef2(3));
                sb6.append(" tabTipsByPassInfo=");
                if (xs2Var.m75934xbce7f2f(7) == null) {
                    z17 = false;
                }
                sb6.append(z17);
                sb6.append(" tipsId=");
                sb6.append(this.f65880x11c19d58);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotCtrInfo", sb6.toString());
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[parseRedDotExtInfo] username=");
                sb7.append(xs2Var.m75945x2fec8307(1));
                sb7.append(" object_id=");
                sb7.append(xs2Var.m75942xfb822ef2(3));
                sb7.append(" tabTipsByPassInfo=");
                if (xs2Var.m75934xbce7f2f(7) == null) {
                    z17 = false;
                }
                sb7.append(z17);
                sb7.append(" tipsId=");
                sb7.append(this.f65880x11c19d58);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotCtrInfo", sb7.toString());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("Finder.RedDotCtrInfo", "", e17);
        }
        this.f65878xe8897e6 = xs2Var.m75945x2fec8307(0);
        proto.C = xs2Var.m75942xfb822ef2(3);
        z1();
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m55857x9616526c() {
        java.util.LinkedList<r45.h03> linkedList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{hash=");
        sb6.append(hashCode());
        sb6.append(" tipsId=");
        sb6.append(this.f65880x11c19d58);
        sb6.append(" tips_uuid=");
        sb6.append(this.f65882x5364c75d);
        sb6.append(" revokeId=");
        sb6.append(this.f65878xe8897e6);
        sb6.append(" time=");
        sb6.append(this.f65879x2261f6f2);
        sb6.append(" type=");
        r45.vs2 vs2Var = this.f65874xb5f7102a;
        java.util.ArrayList arrayList = null;
        sb6.append(vs2Var != null ? java.lang.Integer.valueOf(vs2Var.f470020e) : null);
        sb6.append(" businessType=");
        sb6.append(this.f65873xe412923f);
        sb6.append(" priority=");
        r45.vs2 vs2Var2 = this.f65874xb5f7102a;
        sb6.append(vs2Var2 != null ? java.lang.Integer.valueOf(vs2Var2.f470019d) : null);
        sb6.append(" tab_type=");
        r45.xs2 xs2Var = this.N;
        sb6.append(xs2Var.m75939xb282bd08(9));
        sb6.append(" object_id=");
        sb6.append(pm0.v.u(xs2Var.m75942xfb822ef2(3)));
        sb6.append(" tab_tips_object_id=");
        r45.bz2 bz2Var = (r45.bz2) xs2Var.m75936x14adae67(23);
        sb6.append(pm0.v.u(bz2Var != null ? bz2Var.f452703g : 0L));
        sb6.append(" exposeInfo=");
        r45.g03 g03Var = this.f65877xc67b9ef7;
        if (g03Var != null && (linkedList = g03Var.f456309d) != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.h03 h03Var : linkedList) {
                arrayList.add(h03Var.f457240d + ',' + h03Var.f457241e);
            }
        }
        sb6.append(arrayList);
        sb6.append(" username=");
        sb6.append(this.f65883xdec927b);
        sb6.append('}');
        return sb6.toString();
    }

    public final boolean u0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        r45.f03 I0 = I0(path);
        if ((I0 != null ? I0.f455430q : null) != null && I0.f455435v > 0) {
            r45.q40 q40Var = I0.f455430q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q40Var);
            if (q40Var.f465199q == 0 && c01.id.e() - (this.f65879x2261f6f2 / 1000) > I0.f455435v) {
                r45.q40 q40Var2 = I0.f455430q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q40Var2);
                q40Var2.f465199q = 1;
                return true;
            }
        }
        return false;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb u1() {
        try {
            return w0();
        } catch (java.lang.Exception e17) {
            pm0.z.b(xy2.b.f539688b, "copyCtrlInfoException", false, null, null, false, false, null, 124, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", e17.getMessage());
            return this;
        }
    }

    public final org.json.JSONObject v0() {
        java.lang.String m75945x2fec8307 = this.f65881x115e537f.m75945x2fec8307(5);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            m75945x2fec8307 = this.f65874xb5f7102a.f470032t;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
            try {
                byte[] decode = android.util.Base64.decode(m75945x2fec8307, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                return new org.json.JSONObject(new java.lang.String(decode, r26.c.f450398a));
            } catch (java.lang.Exception unused) {
            }
        }
        return new org.json.JSONObject();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb w0() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(mo9763xeb27878e());
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        android.content.ContentValues contentValues = (android.content.ContentValues) m143895xf1229813;
        if (contentValues == null) {
            contentValues = mo9763xeb27878e();
        }
        jbVar.mo9762xbf5d97fd(contentValues, true);
        if ((jbVar.f65874xb5f7102a == null && this.f65874xb5f7102a != null) || (jbVar.f65881x115e537f == null && this.f65881x115e537f != null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", "[cloneInstance] error! " + this.f65880x11c19d58);
            pm0.z.b(xy2.b.f539688b, "CtrInfoCloneInstance", false, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ya(this), 60, null);
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.b6 b6Var = (zy2.b6) c17;
        if (this.f65874xb5f7102a == null || jbVar.f65874xb5f7102a == null) {
            boolean Fk = ((c61.l7) b6Var).Fk();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("this_tips_id", this.f65880x11c19d58);
            jSONObject.put("this_tips_uuid", this.f65882x5364c75d);
            jSONObject.put("is_this_field_ctrInfo_null", this.f65874xb5f7102a == null);
            r45.vs2 vs2Var = this.f65874xb5f7102a;
            jSONObject.put("this_field_ctrInfo_tips_id", vs2Var != null ? vs2Var.f470023h : null);
            r45.vs2 vs2Var2 = this.f65874xb5f7102a;
            jSONObject.put("this_field_ctrInfo_tips_uuid", vs2Var2 != null ? vs2Var2.f470036x : null);
            jSONObject.put("it_tips_id", jbVar.f65880x11c19d58);
            jSONObject.put("it_tips_uuid", jbVar.f65882x5364c75d);
            jSONObject.put("is_it_field_ctrInfo_null", jbVar.f65874xb5f7102a == null);
            r45.vs2 vs2Var3 = jbVar.f65874xb5f7102a;
            jSONObject.put("it_field_ctrInfo_tips_id", vs2Var3 != null ? vs2Var3.f470023h : null);
            r45.vs2 vs2Var4 = jbVar.f65874xb5f7102a;
            jSONObject.put("it_field_ctrInfo_tips_uuid", vs2Var4 != null ? vs2Var4.f470036x : null);
            jSONObject.put("paths", J0());
            jSONObject.put("stack", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            pm0.z.b(xy2.b.f539688b, "CtrInfoCloneInstance_ctrInfo_null", false, pm0.w.f438339g, null, false, Fk, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.za(jSONObject), 24, null);
        }
        ((c61.l7) b6Var).nk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70 z70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        e42.c0 c0Var = e42.c0.clicfg_finder_need_clone_ctrl_info_member_variable;
        kb2.b bVar = kb2.b.f387758a;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(z70Var, t70Var, "是否克隆ctrl_info中的成员变量", c0Var, java.lang.Boolean.FALSE, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ef0.f208243d, 8, null)).booleanValue()) {
            jbVar.z1();
            jbVar.N.m75932x347fbd55(this.N.m75954xc3d85326());
        }
        return jbVar;
    }

    public final boolean y0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return this.K.get(path) != null;
    }

    public final boolean z0(java.lang.String str) {
        java.lang.Object obj;
        yz5.l lVar;
        try {
            java.util.Iterator it = this.P.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((java.lang.Boolean) ((yz5.l) ((jz5.l) obj).f384366d).mo146xb9724478(this)).booleanValue()) {
                    break;
                }
            }
            jz5.l lVar2 = (jz5.l) obj;
            if (!((lVar2 == null || (lVar = (yz5.l) lVar2.f384367e) == null) ? true : ((java.lang.Boolean) lVar.mo146xb9724478(this)).booleanValue())) {
                return false;
            }
            if (str == null) {
                str = "";
            }
            return F0(str);
        } catch (c01.c e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", "ctrlInfoAtPathFilter " + e17.getMessage());
            pm0.z.b(xy2.b.f539688b, "ctrlInfoAtPathErr_acc", false, null, null, false, false, null, 124, null);
            return false;
        } catch (java.lang.IllegalStateException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotCtrInfo", "ctrlInfoAtPathFilter " + e18.getMessage());
            pm0.z.b(xy2.b.f539688b, "ctrlInfoAtPathErr_state", false, null, null, false, false, null, 124, null);
            return false;
        }
    }

    public final void z1() {
        java.util.LinkedList<r45.f03> linkedList;
        java.util.List list;
        java.util.LinkedList<r45.f03> linkedList2;
        java.util.LinkedList<r45.f03> linkedList3 = new java.util.LinkedList();
        r45.vs2 vs2Var = this.f65874xb5f7102a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.L;
        if (vs2Var != null && (linkedList2 = vs2Var.f470022g) != null) {
            for (r45.f03 f03Var : linkedList2) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f03Var.f455439z)) {
                    f03Var.f455439z = this.f65883xdec927b;
                }
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.K;
                java.lang.String str = f03Var.f455425i;
                if (str == null) {
                    str = "";
                }
                concurrentHashMap2.put(str, f03Var);
                if (f03Var.f455424h == 2) {
                    java.lang.String str2 = f03Var.f455425i;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.LinkedList());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedList, "synchronizedList(...)");
                    concurrentHashMap.put(str2, synchronizedList);
                    linkedList3.add(f03Var);
                }
            }
        }
        for (r45.f03 f03Var2 : linkedList3) {
            r45.vs2 vs2Var2 = this.f65874xb5f7102a;
            if (vs2Var2 != null && (linkedList = vs2Var2.f470022g) != null) {
                for (r45.f03 f03Var3 : linkedList) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var3.f455426m, f03Var2.f455425i) && (list = (java.util.List) concurrentHashMap.get(f03Var2.f455425i)) != null) {
                        java.lang.String str3 = f03Var3.f455425i;
                        if (str3 == null) {
                            str3 = "";
                        }
                        list.add(str3);
                    }
                }
            }
        }
    }
}
