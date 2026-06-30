package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class jb extends dm.a5 {
    public static final l75.e0 Q = dm.a5.initAutoDBInfo(com.tencent.mm.plugin.finder.extension.reddot.jb.class);
    public final java.util.concurrent.ConcurrentHashMap K = new java.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.ConcurrentHashMap L = new java.util.concurrent.ConcurrentHashMap();
    public final jz5.g M = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.xa.f106021d);
    public final r45.xs2 N = new r45.xs2();
    public final java.util.List P = kz5.c0.i(new jz5.l(com.tencent.mm.plugin.finder.extension.reddot.ab.f105405d, com.tencent.mm.plugin.finder.extension.reddot.bb.f105424d), new jz5.l(com.tencent.mm.plugin.finder.extension.reddot.cb.f105449d, com.tencent.mm.plugin.finder.extension.reddot.db.f105476d));

    public static /* synthetic */ boolean o1(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, zy2.ba baVar, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        return jbVar.n1(baVar, z17);
    }

    public static java.util.LinkedList q1(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, java.lang.String path, boolean z17, int i17, java.lang.String str, int i18, java.lang.Object obj) {
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
        kotlin.jvm.internal.o.g(path, "path");
        if (!jbVar.P0()) {
            return jbVar.j1(path, z17, i17, str);
        }
        synchronized (jbVar) {
            j17 = jbVar.j1(path, z17, i17, str);
        }
        return j17;
    }

    public final boolean A0(zy2.ba storage, boolean z17) {
        kotlin.jvm.internal.o.g(storage, "storage");
        com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfo", "delete");
        this.field_ctrInfo.f388489g.clear();
        this.K.clear();
        this.L.clear();
        return n1(storage, z17);
    }

    public final r45.ez2 D0() {
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.protobuf.g byteString = this.N.getByteString(7);
        if (byteString == null && (gVar = this.field_ctrInfo.f388488f) != null) {
            com.tencent.mm.protobuf.f parseFrom = new r45.xs2().parseFrom(gVar.g());
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderRedDotExtInfo");
            byteString = ((r45.xs2) parseFrom).getByteString(7);
        }
        if (byteString == null) {
            return null;
        }
        com.tencent.mm.protobuf.f parseFrom2 = new r45.ez2().parseFrom(byteString.g());
        kotlin.jvm.internal.o.e(parseFrom2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderTabTipsByPassInfo");
        return (r45.ez2) parseFrom2;
    }

    public final boolean F0(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        if (kotlin.jvm.internal.o.b(this.field_username, username)) {
            return true;
        }
        java.lang.String str = this.field_username;
        return str == null || str.length() == 0;
    }

    public final r45.h03 G0(java.lang.String str) {
        java.util.LinkedList linkedList;
        r45.g03 g03Var = this.field_exposeInfo;
        java.lang.Object obj = null;
        if (g03Var == null || (linkedList = g03Var.f374776d) == null) {
            return null;
        }
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((r45.h03) next).f375707d, str)) {
                    obj = next;
                    break;
                }
            }
        }
        return (r45.h03) obj;
    }

    public final r45.f03 I0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return (r45.f03) this.K.get(path);
    }

    public final java.util.List J0() {
        java.util.Enumeration keys = this.K.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        java.util.ArrayList list = java.util.Collections.list(keys);
        kotlin.jvm.internal.o.f(list, "list(...)");
        return list;
    }

    public final java.util.List L0() {
        java.util.Collection values = this.K.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        return kz5.n0.S0(values);
    }

    public final boolean P0() {
        return ((java.lang.Boolean) ((jz5.n) this.M).getValue()).booleanValue();
    }

    public final int Q0(boolean z17) {
        int i17 = this.field_businessType;
        if (i17 == 0 || z17) {
            int i18 = this.field_ctrType;
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
        return Q0(kotlin.jvm.internal.o.b(str, "Listen.Entrance"));
    }

    public final int T0() {
        if (I0("TLWxPrivateMsgBubble") != null || I0("TLWxBubble") != null) {
            return 4;
        }
        r45.f03 I0 = I0("TLFollow");
        r45.xs2 xs2Var = this.N;
        if (I0 != null) {
            return xs2Var.getInteger(9) != -1 ? xs2Var.getInteger(9) : com.tencent.mm.plugin.finder.extension.reddot.ba.b("TLFollow");
        }
        if (I0("TLRecommendTab") != null) {
            return xs2Var.getInteger(9) != -1 ? xs2Var.getInteger(9) : com.tencent.mm.plugin.finder.extension.reddot.ba.b("TLRecommendTab");
        }
        if (I0("finder_tl_hot_tab") != null) {
            return xs2Var.getInteger(9) != -1 ? xs2Var.getInteger(9) : com.tencent.mm.plugin.finder.extension.reddot.ba.b("finder_tl_hot_tab");
        }
        if (I0("finder_tl_nearby_tab") != null) {
            return com.tencent.mm.plugin.finder.extension.reddot.ba.b("finder_tl_nearby_tab");
        }
        if (I0("finder_tl_city_tab") != null) {
            return xs2Var.getInteger(9) != -1 ? xs2Var.getInteger(9) : com.tencent.mm.plugin.finder.extension.reddot.ba.b("finder_tl_city_tab");
        }
        if (I0("NearbyFeedTab") != null) {
            return com.tencent.mm.plugin.finder.extension.reddot.ba.b("NearbyFeedTab");
        }
        if (I0("NearbyLiveTab") != null) {
            return com.tencent.mm.plugin.finder.extension.reddot.ba.b("NearbyLiveTab");
        }
        if (I0("NearbyPeopleTab") != null) {
            return com.tencent.mm.plugin.finder.extension.reddot.ba.b("NearbyPeopleTab");
        }
        if (I0("NewLife.SquareTab") != null) {
            return com.tencent.mm.plugin.finder.extension.reddot.ba.b("NewLife.SquareTab");
        }
        if (I0("K1k.Tab1") != null) {
            return com.tencent.mm.plugin.finder.extension.reddot.ba.b("K1k.Tab1");
        }
        if (I0("K1k.Tab2") != null) {
            return com.tencent.mm.plugin.finder.extension.reddot.ba.b("K1k.Tab2");
        }
        if (I0("K1k.Tab3") != null) {
            return com.tencent.mm.plugin.finder.extension.reddot.ba.b("K1k.Tab3");
        }
        int integer = xs2Var.getInteger(9);
        if (integer != 0) {
            return integer;
        }
        return -1;
    }

    public final java.util.List U0(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : this.K.entrySet()) {
            if (d1((java.lang.String) entry.getKey(), source)) {
                linkedList.add(entry.getKey());
            }
        }
        return linkedList;
    }

    public final com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo W0() {
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = this.field_tipsShowEntranceExtInfo;
        return finderTipsShowEntranceExtInfo == null ? new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo() : finderTipsShowEntranceExtInfo;
    }

    public final boolean Y0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        r45.f03 I0 = I0(path);
        return I0 != null && I0.f373899s == 1;
    }

    public final int Z0(java.lang.String str) {
        r45.q40 q40Var;
        r45.q40 q40Var2;
        long e17 = c01.id.e();
        r45.f03 I0 = I0(str);
        if ((I0 != null ? I0.f373897q : null) == null) {
            if (I0 != null) {
                I0.f373897q = new r45.q40();
            }
            r45.q40 q40Var3 = I0 != null ? I0.f373897q : null;
            kotlin.jvm.internal.o.d(q40Var3);
            q40Var3.f383658f = c01.id.e();
        }
        int i17 = 0;
        if ((I0 == null || (q40Var2 = I0.f373897q) == null || q40Var2.f383658f != 0) ? false : true) {
            r45.q40 q40Var4 = I0 != null ? I0.f373897q : null;
            if (q40Var4 != null) {
                q40Var4.f383658f = e17;
            }
        }
        r45.q40 q40Var5 = I0 != null ? I0.f373897q : null;
        if (q40Var5 != null) {
            q40Var5.f383667r = e17;
        }
        r45.q40 q40Var6 = I0 != null ? I0.f373897q : null;
        if (q40Var6 != null) {
            q40Var6.f383661i = c01.id.c();
        }
        r45.q40 q40Var7 = I0 != null ? I0.f373897q : null;
        kotlin.jvm.internal.o.d(q40Var7);
        r45.q40 q40Var8 = I0 != null ? I0.f373897q : null;
        kotlin.jvm.internal.o.d(q40Var8);
        q40Var7.f383656d = q40Var8.f383656d + 1;
        if (I0 != null && (q40Var = I0.f373897q) != null) {
            i17 = q40Var.f383656d;
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfo", "increase reddot expose path = " + str + ", exposeCount = " + i17 + ", tipsId=[" + this.field_tipsId + ']');
        return i17;
    }

    public final boolean a1(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        r45.f03 I0 = I0(path);
        return I0 != null && I0.I;
    }

    public final boolean c1() {
        long j17 = this.field_expiredTime;
        return j17 > 0 && (j17 * 1000) + this.field_time <= c01.id.c();
    }

    public final boolean d1(java.lang.String path, java.lang.String source) {
        r45.f03 I0;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(source, "source");
        r45.h03 G0 = G0(path);
        if (G0 == null || (I0 = I0(path)) == null) {
            return false;
        }
        long j17 = G0.f375708e;
        int i17 = I0.G * 1000;
        if (j17 <= 0 || i17 <= 0) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                com.tencent.mars.xlog.Log.w("Finder.RedDotCtrInfo", "isExposeExpired " + source + ' ' + path + " exposeTimeMs=" + j17 + " exposeExpiredTimeMs=" + i17 + ':' + this);
            }
            return false;
        }
        boolean z17 = j17 + ((long) i17) <= c01.id.c();
        if (z17) {
            com.tencent.mars.xlog.Log.w("Finder.RedDotCtrInfo", "isExposeExpired " + source + ' ' + path + " expose expired:" + this);
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                com.tencent.mars.xlog.Log.w("Finder.RedDotCtrInfo", "isExposeExpired " + source + ' ' + path + " expose not expired:" + this);
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
    public l75.e0 getDBInfo() {
        return Q;
    }

    public final int getType() {
        r45.vs2 vs2Var = this.field_ctrInfo;
        if (vs2Var != null) {
            return vs2Var.f388487e;
        }
        return 0;
    }

    public final boolean h1() {
        java.util.LinkedList linkedList = this.field_ctrInfo.f388489g;
        return linkedList == null || linkedList.isEmpty();
    }

    public final void i1(java.lang.String str, java.lang.String str2) {
        java.util.List list;
        r45.f03 f03Var = (r45.f03) this.K.get(str);
        if (f03Var == null || f03Var.f373891h != 2 || (list = (java.util.List) this.L.get(str)) == null) {
            return;
        }
        pm0.v.G(list, new com.tencent.mm.plugin.finder.extension.reddot.eb(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fb, code lost:
    
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "是否移除clear_type为0的红点", e42.c0.clicfg_finder_need_handle_clear_type_none, java.lang.Boolean.TRUE, false, com.tencent.mm.plugin.finder.storage.ff0.f126773d, 8, null)).booleanValue() != false) goto L142;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.jb.j1(java.lang.String, boolean, int, java.lang.String):java.util.LinkedList");
    }

    public final boolean k1(java.lang.String str, long j17, int i17) {
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", "setExpose fail,path=" + str + " exposeTime=" + j17 + " exposeExpiredTime=" + i17);
            return false;
        }
        long c17 = c01.id.c();
        if (c17 >= i17 + j17) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", "setExpose time out,path=" + str + " exposeTime=" + j17 + " exposeExpiredTime=" + i17 + ",now=" + c17);
            return false;
        }
        r45.h03 G0 = G0(str);
        if (G0 != null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfo", "setExpose path=" + str + " modify exposeTime from " + G0.f375708e + " to " + j17 + " ,exposeExpiredTime=" + i17 + ",now=" + c17);
            G0.f375708e = j17;
            G0.f375707d = str;
            return true;
        }
        r45.h03 h03Var = new r45.h03();
        h03Var.f375708e = j17;
        h03Var.f375707d = str;
        this.field_exposeInfo.f374776d.add(h03Var);
        com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfo", "setExpose path=" + str + " exposeTime=" + j17 + " exposeExpiredTime=" + i17 + ",now=" + c17);
        return true;
    }

    public final boolean l1(java.lang.String path, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfo", "setExposeExpiredInfo path=" + path + " exposeTime=" + j17 + ' ' + this);
        if ((path.length() == 0) || j17 <= 0) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", "setExposeExpiredInfo but path=" + path + " exposeTime=" + j17);
            return false;
        }
        synchronized (this) {
            r45.f03 I0 = I0(path);
            if (I0 == null) {
                com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", "setExposeExpiredInfo path=" + path + " exposeTime=" + j17 + ", but showInfo is null!");
                return false;
            }
            int i17 = I0.G * 1000;
            if (i17 <= 0) {
                com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", "setExposeExpiredInfo path=" + path + " but exposeExpiredTime=" + i17 + '!');
                return false;
            }
            r45.h03 G0 = G0(path);
            long j18 = G0 != null ? G0.f375708e : 0L;
            if (j18 <= 0) {
                return k1(path, j17, i17);
            }
            if (z17) {
                return k1(path, j17, i17);
            }
            com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", "setExposeExpiredInfo path=" + path + " but have set exposeTime:" + j18);
            return false;
        }
    }

    public final boolean n1(zy2.ba storage, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.extension.reddot.jb w07;
        kotlin.jvm.internal.o.g(storage, "storage");
        java.lang.String str2 = this.field_ctrInfo.f388490h;
        if (!(!(str2 == null || str2.length() == 0))) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", this.field_tipsId + " is inValid");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[store](");
        sb6.append(java.lang.Thread.currentThread().getName());
        sb6.append(") ");
        sb6.append(this);
        sb6.append(" apiWithSync=");
        sb6.append(P0());
        sb6.append(' ');
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str = com.tencent.mm.sdk.platformtools.z3.b(true);
            kotlin.jvm.internal.o.d(str);
        } else {
            str = "";
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfo", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (P0()) {
            synchronized (this) {
                w07 = w0();
            }
        } else {
            w07 = w0();
        }
        com.tencent.mm.plugin.finder.extension.reddot.hb hbVar = new com.tencent.mm.plugin.finder.extension.reddot.hb(this, storage, w07, currentTimeMillis);
        if (z17) {
            pm0.v.O("Finder.RedDotCtrInfo", new com.tencent.mm.plugin.finder.extension.reddot.gb(hbVar));
        } else {
            hbVar.invoke();
        }
        return true;
    }

    public final void p1(java.lang.String str) {
        java.util.LinkedList linkedList;
        java.util.LinkedList show_infos = this.field_ctrInfo.f388489g;
        kotlin.jvm.internal.o.f(show_infos, "show_infos");
        kz5.h0.B(show_infos, new com.tencent.mm.plugin.finder.extension.reddot.ib(str));
        r45.g03 g03Var = this.field_exposeInfo;
        if (g03Var == null || (linkedList = g03Var.f374776d) == null) {
            return;
        }
        pm0.v.I(linkedList, new com.tencent.mm.plugin.finder.extension.reddot.fb(str));
    }

    public final bw5.e0 r1() {
        r45.vs2 vs2Var = this.field_ctrInfo;
        if (vs2Var == null) {
            return null;
        }
        byte[] byteArray = vs2Var.toByteArray();
        bw5.ev evVar = new bw5.ev();
        evVar.parseFrom(byteArray);
        bw5.e0 e0Var = new bw5.e0();
        e0Var.f26672d = evVar;
        boolean[] zArr = e0Var.f26674f;
        zArr[1] = true;
        e0Var.f26673e = this.field_time;
        zArr[2] = true;
        return e0Var;
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.jb t0(r45.vs2 proto) {
        boolean z17;
        r45.xs2 xs2Var = this.N;
        kotlin.jvm.internal.o.g(proto, "proto");
        this.field_ctrInfo = proto;
        this.field_ctrType = proto.f388487e;
        int Q0 = Q0(false);
        this.field_businessType = Q0;
        if (Q0 <= 0) {
            com.tencent.mars.xlog.Log.w("Finder.RedDotCtrInfo", "build fixBusinessType from " + this.field_businessType + " to " + proto.f388505z + '!');
            this.field_businessType = proto.f388505z;
        }
        this.field_expiredTime = proto.f388491i;
        this.field_tipsId = proto.f388490h;
        this.field_tips_uuid = proto.f388503x;
        if (this.field_time <= 0) {
            this.field_time = c01.id.c();
        }
        java.lang.String str = proto.f388496q;
        if (str == null) {
            str = "";
        }
        this.field_username = str;
        if (this.field_exposeInfo == null) {
            this.field_exposeInfo = new r45.g03();
        }
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo();
        java.util.LinkedList show_infos = proto.f388489g;
        kotlin.jvm.internal.o.f(show_infos, "show_infos");
        java.util.Iterator it = show_infos.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            r45.f03 f03Var = (r45.f03) it.next();
            if (f03Var.f373894n == 1) {
                com.tencent.mm.protobuf.g gVar = f03Var.f373895o;
                finderTipsShowEntranceExtInfo.parseFrom(gVar != null ? gVar.f192156a : null);
            }
        }
        this.field_tipsShowEntranceExtInfo = finderTipsShowEntranceExtInfo;
        try {
            com.tencent.mm.protobuf.g gVar2 = this.field_ctrInfo.f388488f;
            if (gVar2 != null) {
                xs2Var.parseFrom(gVar2.f192156a);
            }
            if (xs2Var.getInteger(9) == 0) {
                com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo2 = this.field_tipsShowEntranceExtInfo;
                xs2Var.set(7, finderTipsShowEntranceExtInfo2.getByteString(6));
                xs2Var.set(1, finderTipsShowEntranceExtInfo2.getString(3));
                xs2Var.set(9, java.lang.Integer.valueOf(finderTipsShowEntranceExtInfo2.getInteger(2) == 0 ? -1 : finderTipsShowEntranceExtInfo2.getInteger(2)));
                xs2Var.set(3, java.lang.Long.valueOf(finderTipsShowEntranceExtInfo2.getLong(0)));
                xs2Var.set(8, finderTipsShowEntranceExtInfo2.getString(1));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[parseRedDotExtInfo] use old logic username=");
                sb6.append(xs2Var.getString(1));
                sb6.append(" object_id=");
                sb6.append(xs2Var.getLong(3));
                sb6.append(" tabTipsByPassInfo=");
                if (xs2Var.getByteString(7) == null) {
                    z17 = false;
                }
                sb6.append(z17);
                sb6.append(" tipsId=");
                sb6.append(this.field_tipsId);
                com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfo", sb6.toString());
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[parseRedDotExtInfo] username=");
                sb7.append(xs2Var.getString(1));
                sb7.append(" object_id=");
                sb7.append(xs2Var.getLong(3));
                sb7.append(" tabTipsByPassInfo=");
                if (xs2Var.getByteString(7) == null) {
                    z17 = false;
                }
                sb7.append(z17);
                sb7.append(" tipsId=");
                sb7.append(this.field_tipsId);
                com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfo", sb7.toString());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("Finder.RedDotCtrInfo", "", e17);
        }
        this.field_revokeId = xs2Var.getString(0);
        proto.C = xs2Var.getLong(3);
        z1();
        return this;
    }

    public java.lang.String toString() {
        java.util.LinkedList<r45.h03> linkedList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{hash=");
        sb6.append(hashCode());
        sb6.append(" tipsId=");
        sb6.append(this.field_tipsId);
        sb6.append(" tips_uuid=");
        sb6.append(this.field_tips_uuid);
        sb6.append(" revokeId=");
        sb6.append(this.field_revokeId);
        sb6.append(" time=");
        sb6.append(this.field_time);
        sb6.append(" type=");
        r45.vs2 vs2Var = this.field_ctrInfo;
        java.util.ArrayList arrayList = null;
        sb6.append(vs2Var != null ? java.lang.Integer.valueOf(vs2Var.f388487e) : null);
        sb6.append(" businessType=");
        sb6.append(this.field_businessType);
        sb6.append(" priority=");
        r45.vs2 vs2Var2 = this.field_ctrInfo;
        sb6.append(vs2Var2 != null ? java.lang.Integer.valueOf(vs2Var2.f388486d) : null);
        sb6.append(" tab_type=");
        r45.xs2 xs2Var = this.N;
        sb6.append(xs2Var.getInteger(9));
        sb6.append(" object_id=");
        sb6.append(pm0.v.u(xs2Var.getLong(3)));
        sb6.append(" tab_tips_object_id=");
        r45.bz2 bz2Var = (r45.bz2) xs2Var.getCustom(23);
        sb6.append(pm0.v.u(bz2Var != null ? bz2Var.f371170g : 0L));
        sb6.append(" exposeInfo=");
        r45.g03 g03Var = this.field_exposeInfo;
        if (g03Var != null && (linkedList = g03Var.f374776d) != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.h03 h03Var : linkedList) {
                arrayList.add(h03Var.f375707d + ',' + h03Var.f375708e);
            }
        }
        sb6.append(arrayList);
        sb6.append(" username=");
        sb6.append(this.field_username);
        sb6.append('}');
        return sb6.toString();
    }

    public final boolean u0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        r45.f03 I0 = I0(path);
        if ((I0 != null ? I0.f373897q : null) != null && I0.f373902v > 0) {
            r45.q40 q40Var = I0.f373897q;
            kotlin.jvm.internal.o.d(q40Var);
            if (q40Var.f383666q == 0 && c01.id.e() - (this.field_time / 1000) > I0.f373902v) {
                r45.q40 q40Var2 = I0.f373897q;
                kotlin.jvm.internal.o.d(q40Var2);
                q40Var2.f383666q = 1;
                return true;
            }
        }
        return false;
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.jb u1() {
        try {
            return w0();
        } catch (java.lang.Exception e17) {
            pm0.z.b(xy2.b.f458155b, "copyCtrlInfoException", false, null, null, false, false, null, 124, null);
            com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", e17.getMessage());
            return this;
        }
    }

    public final org.json.JSONObject v0() {
        java.lang.String string = this.field_tipsShowEntranceExtInfo.getString(5);
        if (string == null || string.length() == 0) {
            string = this.field_ctrInfo.f388499t;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            try {
                byte[] decode = android.util.Base64.decode(string, 0);
                kotlin.jvm.internal.o.f(decode, "decode(...)");
                return new org.json.JSONObject(new java.lang.String(decode, r26.c.f368865a));
            } catch (java.lang.Exception unused) {
            }
        }
        return new org.json.JSONObject();
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.jb w0() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(convertTo());
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        android.content.ContentValues contentValues = (android.content.ContentValues) m521constructorimpl;
        if (contentValues == null) {
            contentValues = convertTo();
        }
        jbVar.convertFrom(contentValues, true);
        if ((jbVar.field_ctrInfo == null && this.field_ctrInfo != null) || (jbVar.field_tipsShowEntranceExtInfo == null && this.field_tipsShowEntranceExtInfo != null)) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", "[cloneInstance] error! " + this.field_tipsId);
            pm0.z.b(xy2.b.f458155b, "CtrInfoCloneInstance", false, null, null, false, false, new com.tencent.mm.plugin.finder.extension.reddot.ya(this), 60, null);
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.b6 b6Var = (zy2.b6) c17;
        if (this.field_ctrInfo == null || jbVar.field_ctrInfo == null) {
            boolean Fk = ((c61.l7) b6Var).Fk();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("this_tips_id", this.field_tipsId);
            jSONObject.put("this_tips_uuid", this.field_tips_uuid);
            jSONObject.put("is_this_field_ctrInfo_null", this.field_ctrInfo == null);
            r45.vs2 vs2Var = this.field_ctrInfo;
            jSONObject.put("this_field_ctrInfo_tips_id", vs2Var != null ? vs2Var.f388490h : null);
            r45.vs2 vs2Var2 = this.field_ctrInfo;
            jSONObject.put("this_field_ctrInfo_tips_uuid", vs2Var2 != null ? vs2Var2.f388503x : null);
            jSONObject.put("it_tips_id", jbVar.field_tipsId);
            jSONObject.put("it_tips_uuid", jbVar.field_tips_uuid);
            jSONObject.put("is_it_field_ctrInfo_null", jbVar.field_ctrInfo == null);
            r45.vs2 vs2Var3 = jbVar.field_ctrInfo;
            jSONObject.put("it_field_ctrInfo_tips_id", vs2Var3 != null ? vs2Var3.f388490h : null);
            r45.vs2 vs2Var4 = jbVar.field_ctrInfo;
            jSONObject.put("it_field_ctrInfo_tips_uuid", vs2Var4 != null ? vs2Var4.f388503x : null);
            jSONObject.put("paths", J0());
            jSONObject.put("stack", com.tencent.mm.sdk.platformtools.z3.b(true));
            pm0.z.b(xy2.b.f458155b, "CtrInfoCloneInstance_ctrInfo_null", false, pm0.w.f356806g, null, false, Fk, new com.tencent.mm.plugin.finder.extension.reddot.za(jSONObject), 24, null);
        }
        ((c61.l7) b6Var).nk();
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        com.tencent.mm.plugin.finder.storage.z70 z70Var = com.tencent.mm.plugin.finder.storage.z70.f128432a;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        e42.c0 c0Var = e42.c0.clicfg_finder_need_clone_ctrl_info_member_variable;
        kb2.b bVar = kb2.b.f306225a;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(z70Var, t70Var, "是否克隆ctrl_info中的成员变量", c0Var, java.lang.Boolean.FALSE, false, com.tencent.mm.plugin.finder.storage.ef0.f126710d, 8, null)).booleanValue()) {
            jbVar.z1();
            jbVar.N.fromProtobuf(this.N.toProtobuf());
        }
        return jbVar;
    }

    public final boolean y0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
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
                if (((java.lang.Boolean) ((yz5.l) ((jz5.l) obj).f302833d).invoke(this)).booleanValue()) {
                    break;
                }
            }
            jz5.l lVar2 = (jz5.l) obj;
            if (!((lVar2 == null || (lVar = (yz5.l) lVar2.f302834e) == null) ? true : ((java.lang.Boolean) lVar.invoke(this)).booleanValue())) {
                return false;
            }
            if (str == null) {
                str = "";
            }
            return F0(str);
        } catch (c01.c e17) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", "ctrlInfoAtPathFilter " + e17.getMessage());
            pm0.z.b(xy2.b.f458155b, "ctrlInfoAtPathErr_acc", false, null, null, false, false, null, 124, null);
            return false;
        } catch (java.lang.IllegalStateException e18) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfo", "ctrlInfoAtPathFilter " + e18.getMessage());
            pm0.z.b(xy2.b.f458155b, "ctrlInfoAtPathErr_state", false, null, null, false, false, null, 124, null);
            return false;
        }
    }

    public final void z1() {
        java.util.LinkedList<r45.f03> linkedList;
        java.util.List list;
        java.util.LinkedList<r45.f03> linkedList2;
        java.util.LinkedList<r45.f03> linkedList3 = new java.util.LinkedList();
        r45.vs2 vs2Var = this.field_ctrInfo;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.L;
        if (vs2Var != null && (linkedList2 = vs2Var.f388489g) != null) {
            for (r45.f03 f03Var : linkedList2) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(f03Var.f373906z)) {
                    f03Var.f373906z = this.field_username;
                }
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.K;
                java.lang.String str = f03Var.f373892i;
                if (str == null) {
                    str = "";
                }
                concurrentHashMap2.put(str, f03Var);
                if (f03Var.f373891h == 2) {
                    java.lang.String str2 = f03Var.f373892i;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.LinkedList());
                    kotlin.jvm.internal.o.f(synchronizedList, "synchronizedList(...)");
                    concurrentHashMap.put(str2, synchronizedList);
                    linkedList3.add(f03Var);
                }
            }
        }
        for (r45.f03 f03Var2 : linkedList3) {
            r45.vs2 vs2Var2 = this.field_ctrInfo;
            if (vs2Var2 != null && (linkedList = vs2Var2.f388489g) != null) {
                for (r45.f03 f03Var3 : linkedList) {
                    if (kotlin.jvm.internal.o.b(f03Var3.f373893m, f03Var2.f373892i) && (list = (java.util.List) concurrentHashMap.get(f03Var2.f373892i)) != null) {
                        java.lang.String str3 = f03Var3.f373892i;
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
