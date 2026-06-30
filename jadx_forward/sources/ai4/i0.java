package ai4;

/* loaded from: classes11.dex */
public final class i0 implements ai4.b {

    /* renamed from: a, reason: collision with root package name */
    public final ai4.s0 f86683a;

    /* renamed from: b, reason: collision with root package name */
    public long f86684b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f86685c = jz5.h.b(ai4.h0.f86682d);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f86686d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f86687e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f86688f = jz5.h.b(ai4.d0.f86666d);

    public i0(ai4.s0 s0Var) {
        this.f86683a = s0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initManager: ");
        sb6.append(Q().hashCode());
        sb6.append(", nativeLogicManager=");
        sb6.append(s0Var != null ? java.lang.Integer.valueOf(s0Var.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", sb6.toString());
    }

    public static java.util.List R(ai4.i0 i0Var, bw5.rl0 rl0Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        i0Var.getClass();
        bw5.sl0 m117393x6d05c73a = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117393x6d05c73a(rl0Var);
        java.util.LinkedList<bw5.pl0> linkedList = m117393x6d05c73a != null ? m117393x6d05c73a.f114576g : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList != null) {
            for (bw5.pl0 pl0Var : linkedList) {
                ai4.f fVar = ai4.f.f86672a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pl0Var);
                mj4.l j17 = fVar.j(pl0Var);
                java.lang.String m147400x6bf53a6c = j17.m147400x6bf53a6c();
                if ((z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m147400x6bf53a6c, bk4.k1.a())) ? false : m147400x6bf53a6c.length() > 0) {
                    arrayList.add(j17);
                }
            }
        }
        return arrayList;
    }

    @Override // ai4.b
    public boolean A(mj4.e eVar) {
        if (eVar == null) {
            return false;
        }
        java.lang.Boolean bool = null;
        r1 = null;
        mj4.e eVar2 = null;
        ai4.s0 s0Var = this.f86683a;
        if (s0Var != null) {
            java.lang.String field_CommentId = eVar.f76554xb8f426b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_CommentId, "field_CommentId");
            java.lang.String field_FromUserName = eVar.f76558x75873205;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_FromUserName, "field_FromUserName");
            ri4.d dVar = (ri4.d) s0Var.O();
            dVar.getClass();
            mj4.f y17 = dVar.y();
            y17.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(field_CommentId);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(field_FromUserName);
            android.database.Cursor B = y17.f408593d.B("select rowid, * from TextStatusComment where CommentId = ? and FromUserName = ? ", new java.lang.String[]{field_CommentId, field_FromUserName});
            if (B != null) {
                if (B.moveToFirst()) {
                    eVar2 = new mj4.e();
                    eVar2.mo9015xbf5d97fd(B);
                }
                B.close();
            }
            bool = java.lang.Boolean.valueOf(s0Var.A(eVar2));
        }
        bw5.sl0 m117397x9d16e6a7 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117397x9d16e6a7(ai4.f.f86672a.f(eVar));
        boolean z17 = m117397x9d16e6a7 != null ? m117397x9d16e6a7.f114573d : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "updateComment: " + eVar.f76554xb8f426b5 + ", " + bool + ", " + z17);
        O(eVar.f76558x75873205, eVar.f76563x5493d43f);
        return z17;
    }

    @Override // ai4.b
    public java.util.List B() {
        bw5.rl0 rl0Var = new bw5.rl0();
        rl0Var.b(bw5.ni0.NotUseReadType);
        return R(this, rl0Var, false, 2, null);
    }

    @Override // ai4.b
    public boolean C(mj4.l item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ai4.s0 s0Var = this.f86683a;
        java.lang.Boolean valueOf = s0Var != null ? java.lang.Boolean.valueOf(s0Var.C(item)) : null;
        java.lang.String str = item.f76607xcd7d4a17;
        if (str == null) {
            str = "";
        }
        bw5.sl0 m117386xc7557eac = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117386xc7557eac(str, item.f76614xecc06273);
        boolean z17 = m117386xc7557eac != null ? m117386xc7557eac.f114573d : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "deleteLike: " + valueOf + ", " + z17 + ", " + item.f76611x5493d43f + ", " + str);
        P(item.m147400x6bf53a6c(), item.f76611x5493d43f);
        return z17;
    }

    @Override // ai4.b
    public java.util.List D() {
        bw5.rl0 rl0Var = new bw5.rl0();
        rl0Var.b(bw5.ni0.Unread);
        return R(this, rl0Var, false, 2, null);
    }

    @Override // ai4.b
    public mj4.h E() {
        return Q().b(bk4.k1.a());
    }

    @Override // ai4.b
    public void F(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "[markLikeTabShown]");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_LIKE_TAB_SHOWN_INT, java.lang.Integer.valueOf(i17));
    }

    @Override // ai4.b
    public si4.a G() {
        return Q();
    }

    @Override // ai4.b
    public boolean H(int i17, java.lang.String str, int i18) {
        mj4.h i19 = Q().i(str, i18);
        if (i19 == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "updateState: " + i17 + ", " + str + ", " + i18);
        mj4.j jVar = new mj4.j((mj4.k) i19);
        jVar.f(i17);
        Q().s(jVar.a());
        return true;
    }

    @Override // ai4.b
    public void I(java.lang.String str) {
        jz5.f0 f0Var;
        if (str == null || str.length() == 0) {
            return;
        }
        ai4.s0 s0Var = this.f86683a;
        if (s0Var != null) {
            s0Var.I(str);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        bw5.sl0 m117385x2c715a34 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117385x2c715a34(str, 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "markCommentServerDelete: " + str + ", " + f0Var + ", " + (m117385x2c715a34 != null ? m117385x2c715a34.f114573d : false));
    }

    @Override // ai4.b
    public void J(qi4.b bVar, qi4.b bVar2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeLikeAndCommentStorage: ");
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.hashCode()) : null);
        sb6.append(", ");
        sb6.append(bVar2 != null ? java.lang.Integer.valueOf(bVar2.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", sb6.toString());
        if (bVar != null) {
            this.f86686d.put(bVar, new ai4.c(bVar));
        }
        if (bVar2 != null) {
            this.f86687e.put(bVar2, new ai4.c(bVar2));
        }
    }

    @Override // ai4.b
    public java.util.List K() {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        bw5.sl0 m117394xfd3501f3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117394xfd3501f3(3, true, java.lang.System.currentTimeMillis());
        java.lang.Iterable<bw5.pl0> iterable = m117394xfd3501f3 != null ? m117394xfd3501f3.f114576g : null;
        if (iterable == null) {
            iterable = kz5.p0.f395529d;
        }
        for (bw5.pl0 pl0Var : iterable) {
            qi4.p pVar = qi4.p.f445309a;
            long j17 = pl0Var.f113263g;
            pVar.getClass();
            java.lang.String c17 = pl0Var.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getCommenterUsername(...)");
            arrayList2.add(new ai4.c0((int) (j17 / 1000), c17));
        }
        for (ai4.c0 c0Var : kz5.n0.F0(arrayList2, new ai4.g0())) {
            if (arrayList.size() < 3 && !hashSet.contains(c0Var.f86665b)) {
                java.lang.String str = c0Var.f86665b;
                arrayList.add(str);
                hashSet.add(str);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "getUnreadNotifyUserNameList: ");
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    @Override // ai4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long L(java.lang.String r25, java.lang.String r26, pj4.b0 r27, int r28, java.lang.String r29, long r30, float r32, pj4.s r33, pj4.r r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai4.i0.L(java.lang.String, java.lang.String, pj4.b0, int, java.lang.String, long, float, pj4.s, pj4.r, boolean):long");
    }

    @Override // ai4.b
    public mj4.h M(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "[getStatus] userName null or blank");
            return null;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(str) ? ki4.l0.f389677a.a(str) : Q().b(str);
    }

    @Override // ai4.b
    public java.util.List N() {
        return Q().q(bk4.k1.a());
    }

    public final void O(java.lang.String str, java.lang.String str2) {
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f86687e).values().iterator();
        while (it.hasNext()) {
            ((android.os.Handler) ((jz5.n) this.f86688f).mo141623x754a37bb()).post(new ai4.e0((l75.q0) it.next(), str, str2));
        }
    }

    public final void P(java.lang.String str, java.lang.String str2) {
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f86686d).values().iterator();
        while (it.hasNext()) {
            ((android.os.Handler) ((jz5.n) this.f86688f).mo141623x754a37bb()).post(new ai4.f0((l75.q0) it.next(), str, str2));
        }
    }

    public final si4.a Q() {
        return (si4.a) this.f86685c.mo141623x754a37bb();
    }

    @Override // ai4.b
    public d95.b0 a() {
        return qi4.p.f445309a.c();
    }

    public final int b(int i17) {
        bw5.rl0 rl0Var = new bw5.rl0();
        rl0Var.b(bw5.ni0.Unread);
        qi4.p pVar = qi4.p.f445309a;
        rl0Var.f114105h = i17 * 1000;
        rl0Var.f114113s[5] = true;
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117395x12bddfbe(rl0Var);
    }

    @Override // ai4.b
    public int c() {
        bw5.rl0 rl0Var = new bw5.rl0();
        rl0Var.f114102e = bw5.b4.NotUseCommentType;
        rl0Var.f114113s[2] = true;
        rl0Var.b(bw5.ni0.Unread);
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117395x12bddfbe(rl0Var);
    }

    @Override // ai4.b
    public java.util.List d() {
        bw5.rl0 rl0Var = new bw5.rl0();
        rl0Var.b(bw5.ni0.Unread);
        bw5.sl0 m117390x22bd5d9e = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117390x22bd5d9e(rl0Var);
        java.util.ArrayList arrayList = null;
        java.util.LinkedList<bw5.pl0> linkedList = m117390x22bd5d9e != null ? m117390x22bd5d9e.f114576g : null;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (bw5.pl0 pl0Var : linkedList) {
                ai4.f fVar = ai4.f.f86672a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pl0Var);
                arrayList.add(fVar.i(pl0Var));
            }
        }
        return arrayList == null ? kz5.p0.f395529d : arrayList;
    }

    @Override // ai4.b
    public void e() {
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LAST_MARK_READ_TIME_LONG_SYNC, 0L);
        boolean z17 = false;
        boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k2.f255559d > 0;
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - t17);
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
        if (abs > 0 && !z18) {
            z17 = true;
        }
        if (z17) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().p(352280, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "updateRed: " + z17 + ", " + t17 + ", " + z18);
    }

    @Override // ai4.b
    public void f() {
        ai4.s0 s0Var = this.f86683a;
        if (s0Var != null) {
            s0Var.f();
        }
        bw5.sl0 m117384x5deb0d53 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117384x5deb0d53();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "deleteAllInMsgList: affResult=" + (m117384x5deb0d53 != null ? m117384x5deb0d53.f114573d : false));
    }

    @Override // ai4.b
    public int h(int i17) {
        bw5.rl0 rl0Var = new bw5.rl0();
        rl0Var.f114102e = bw5.b4.Comment;
        boolean[] zArr = rl0Var.f114113s;
        zArr[2] = true;
        rl0Var.b(bw5.ni0.Unread);
        qi4.p pVar = qi4.p.f445309a;
        rl0Var.f114105h = i17 * 1000;
        zArr[5] = true;
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117395x12bddfbe(rl0Var);
    }

    @Override // ai4.b
    public hj4.b i() {
        hj4.b bVar = new hj4.b(null, 0, null, 7, null);
        int b17 = b(0);
        bVar.f363194b = b17;
        if (b17 > 0) {
            java.util.LinkedList linkedList = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117394xfd3501f3(1, true, java.lang.System.currentTimeMillis()).f114576g;
            bw5.pl0 pl0Var = linkedList != null ? (bw5.pl0) kz5.n0.a0(linkedList, 0) : null;
            if (pl0Var != null) {
                pl0Var.c();
            }
            bVar.f363195c = pl0Var != null ? pl0Var.c() : null;
        }
        return bVar;
    }

    @Override // ai4.b
    public int j() {
        bw5.rl0 rl0Var = new bw5.rl0();
        rl0Var.f114102e = bw5.b4.Like;
        rl0Var.f114113s[2] = true;
        rl0Var.b(bw5.ni0.Unread);
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117395x12bddfbe(rl0Var);
    }

    @Override // ai4.b
    public java.util.List k() {
        bw5.rl0 rl0Var = new bw5.rl0();
        rl0Var.b(bw5.ni0.Read);
        return R(this, rl0Var, false, 2, null);
    }

    @Override // ai4.b
    public java.util.List l() {
        bw5.rl0 rl0Var = new bw5.rl0();
        rl0Var.b(bw5.ni0.Read);
        bw5.sl0 m117390x22bd5d9e = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117390x22bd5d9e(rl0Var);
        java.util.ArrayList arrayList = null;
        java.util.LinkedList<bw5.pl0> linkedList = m117390x22bd5d9e != null ? m117390x22bd5d9e.f114576g : null;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (bw5.pl0 pl0Var : linkedList) {
                ai4.f fVar = ai4.f.f86672a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pl0Var);
                arrayList.add(fVar.i(pl0Var));
            }
        }
        return arrayList == null ? kz5.p0.f395529d : arrayList;
    }

    @Override // ai4.b
    public void m(boolean z17) {
        long c17 = c01.id.c();
        if (z17 || java.lang.Math.abs(c17 - this.f86684b) > 600000) {
            mj4.h M = M(bk4.k1.a());
            java.lang.String l17 = M != null ? ((mj4.k) M).l() : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "[reqGetSelfInfo] forceRequest = " + z17 + " selfStatusId = " + l17);
            if (l17 == null || r26.n0.N(l17)) {
                return;
            }
            gm0.j1.d().g(new ej4.h(l17));
            this.f86684b = c17;
        }
    }

    @Override // ai4.b
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "[markNotifyRedDotClick]");
        int e17 = c01.id.e();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_RED_DOT_CLICK_INT, java.lang.Integer.valueOf(e17));
        F(e17);
    }

    @Override // ai4.b
    public boolean o(java.lang.String str) {
        bw5.sl0 m117399x9ea06e40 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117399x9ea06e40(str);
        if (m117399x9ea06e40 != null) {
            return m117399x9ea06e40.f114573d;
        }
        return false;
    }

    @Override // ai4.b
    public void p(qi4.b bVar, qi4.b bVar2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unObserveLikeAndCommentStorage: ");
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.hashCode()) : null);
        sb6.append(", ");
        sb6.append(bVar2 != null ? java.lang.Integer.valueOf(bVar2.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", sb6.toString());
        if (bVar != null) {
        }
        if (bVar2 != null) {
        }
    }

    @Override // ai4.b
    public boolean q(mj4.e eVar) {
        if (eVar == null) {
            return false;
        }
        ai4.s0 s0Var = this.f86683a;
        java.lang.Boolean valueOf = s0Var != null ? java.lang.Boolean.valueOf(s0Var.q(eVar)) : null;
        si4.a d17 = qi4.p.f445309a.d(ai4.b0.f86659d);
        java.lang.String field_TextStatusId = eVar.f76563x5493d43f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_TextStatusId, "field_TextStatusId");
        mj4.h t17 = d17.t(field_TextStatusId);
        if (t17 != null) {
            eVar.f76565x2931c158 = ((mj4.k) t17).n();
        }
        bw5.sl0 m117397x9d16e6a7 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117397x9d16e6a7(ai4.f.f86672a.f(eVar));
        boolean z17 = m117397x9d16e6a7 != null ? m117397x9d16e6a7.f114573d : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "insertComment: " + eVar.f76554xb8f426b5 + ", " + valueOf + ", " + z17);
        O(eVar.f76558x75873205, eVar.f76563x5493d43f);
        return z17;
    }

    @Override // ai4.b
    public boolean r() {
        java.lang.Boolean bool;
        ai4.s0 s0Var = this.f86683a;
        if (s0Var != null) {
            s0Var.r();
            bool = java.lang.Boolean.TRUE;
        } else {
            bool = null;
        }
        bw5.sl0 m117400xab0b6a09 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117400xab0b6a09();
        boolean z17 = m117400xab0b6a09 != null ? m117400xab0b6a09.f114573d : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "markAllMsgRead: " + bool + ", " + z17);
        return z17;
    }

    @Override // ai4.b
    public boolean t(mj4.l item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ai4.s0 s0Var = this.f86683a;
        java.lang.Boolean valueOf = s0Var != null ? java.lang.Boolean.valueOf(s0Var.t(item)) : null;
        bw5.sl0 m117398x6b618099 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117398x6b618099(ai4.f.f86672a.g(item, ""));
        boolean z17 = m117398x6b618099 != null ? m117398x6b618099.f114573d : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "insertLike: " + valueOf + ", " + z17 + ", " + item.f76611x5493d43f + ", " + item.m147400x6bf53a6c() + ", " + item.f76607xcd7d4a17);
        P(item.m147400x6bf53a6c(), item.f76611x5493d43f);
        return z17;
    }

    @Override // ai4.b
    public boolean u(mj4.l item) {
        java.lang.Boolean bool;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ai4.s0 s0Var = this.f86683a;
        if (s0Var != null) {
            java.lang.String field_LikeId = item.f76607xcd7d4a17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_LikeId, "field_LikeId");
            java.lang.String field_TextStatusId = item.f76611x5493d43f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_TextStatusId, "field_TextStatusId");
            ti4.d dVar = (ti4.d) s0Var.R();
            dVar.getClass();
            mj4.n z17 = dVar.z();
            z17.getClass();
            p75.n0 n0Var = rj4.e.f477823v;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            p75.m c17 = rj4.e.f477824w.j(field_TextStatusId).c(rj4.e.A.j(field_LikeId));
            p75.i0 g17 = rj4.e.f477823v.g(linkedList);
            g17.f434190d = c17;
            g17.d(linkedList2);
            g17.b(linkedList3);
            mj4.l lVar = (mj4.l) g17.a().o(z17.f408610d, mj4.l.class);
            bool = java.lang.Boolean.valueOf(lVar == null ? false : s0Var.u(lVar));
        } else {
            bool = null;
        }
        bw5.sl0 m117398x6b618099 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117398x6b618099(ai4.f.f86672a.g(item, ""));
        boolean z18 = m117398x6b618099 != null ? m117398x6b618099.f114573d : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "updateLike: " + bool + ", " + z18 + ", " + item.f76611x5493d43f + ", " + item.f76607xcd7d4a17);
        P(item.m147400x6bf53a6c(), item.f76611x5493d43f);
        return z18;
    }

    @Override // ai4.b
    public boolean v(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        ai4.s0 s0Var = this.f86683a;
        java.lang.Boolean valueOf = s0Var != null ? java.lang.Boolean.valueOf(s0Var.v(str, z17)) : null;
        bw5.sl0 m117402x9c10c36f = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117402x9c10c36f(str, z17);
        boolean z18 = m117402x9c10c36f != null ? m117402x9c10c36f.f114573d : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "doLikeFriend: " + valueOf + ", " + z18 + ", statusId=" + str + ", isLike=" + z17);
        P("", "");
        return z18;
    }

    @Override // ai4.b
    public java.util.List w() {
        bw5.rl0 rl0Var = new bw5.rl0();
        rl0Var.b(bw5.ni0.NotUseReadType);
        bw5.sl0 m117390x22bd5d9e = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117390x22bd5d9e(rl0Var);
        java.util.LinkedList<bw5.pl0> linkedList = m117390x22bd5d9e != null ? m117390x22bd5d9e.f114576g : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList != null) {
            for (bw5.pl0 pl0Var : linkedList) {
                ai4.f fVar = ai4.f.f86672a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pl0Var);
                arrayList.add(fVar.i(pl0Var));
            }
        }
        return arrayList;
    }

    @Override // ai4.b
    public boolean x() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_RED_DOT_CLICK_INT, null);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        return b(num != null ? num.intValue() : 0) > 0;
    }

    @Override // ai4.b
    public mj4.l y(java.lang.String hashUserName, java.lang.String statusId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashUserName, "hashUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hashUserName, bk4.k1.a())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 wi6 = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).wi(hashUserName, 1);
            hashUserName = wi6 != null ? wi6.d1() : null;
        }
        if (hashUserName == null || hashUserName.length() == 0) {
            return null;
        }
        if (statusId.length() == 0) {
            return null;
        }
        bw5.sl0 m117392xeb4c208e = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117392xeb4c208e(statusId, hashUserName);
        java.util.List list = m117392xeb4c208e != null ? m117392xeb4c208e.f114576g : null;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "getLike size = " + list.size() + ", userName=" + hashUserName + ", statusId=" + statusId);
        if (!(!list.isEmpty())) {
            return null;
        }
        ai4.f fVar = ai4.f.f86672a;
        java.lang.Object obj = list.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return fVar.j((bw5.pl0) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00d7, code lost:
    
        if (r8 == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // ai4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai4.i0.z(java.util.Map):void");
    }

    @Override // ai4.b
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffLogicManager", "[markNotifyShown]");
        int e17 = c01.id.e();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_SHOWN_INT, java.lang.Integer.valueOf(e17));
        F(e17);
    }
}
