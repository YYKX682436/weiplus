package ai4;

/* loaded from: classes11.dex */
public final class s0 implements ai4.b {

    /* renamed from: a, reason: collision with root package name */
    public final ai4.i0 f86727a;

    /* renamed from: b, reason: collision with root package name */
    public long f86728b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f86729c = jz5.h.b(ai4.q0.f86723d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f86730d = jz5.h.b(ai4.r0.f86725d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f86731e = jz5.h.b(ai4.o0.f86717d);

    public s0(ai4.i0 i0Var) {
        this.f86727a = i0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initManager: ");
        sb6.append(P().hashCode());
        sb6.append(", affLogicManager=");
        sb6.append(i0Var != null ? java.lang.Integer.valueOf(i0Var.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNativeLogicManager", sb6.toString());
    }

    @Override // ai4.b
    public boolean A(mj4.e eVar) {
        if (eVar == null) {
            return false;
        }
        ai4.i0 i0Var = this.f86727a;
        if (i0Var != null) {
            i0Var.A(eVar);
        }
        ri4.d dVar = (ri4.d) O();
        dVar.getClass();
        return dVar.y().mo9952xce0038c9(eVar, new java.lang.String[0]);
    }

    @Override // ai4.b
    public java.util.List B() {
        return ((ti4.d) R()).x();
    }

    @Override // ai4.b
    public boolean C(mj4.l item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ai4.i0 i0Var = this.f86727a;
        if (i0Var != null) {
            i0Var.C(item);
        }
        ti4.d dVar = (ti4.d) R();
        dVar.getClass();
        return dVar.z().mo9951xb06685ab(item, new java.lang.String[0]);
    }

    @Override // ai4.b
    public java.util.List D() {
        mj4.n z17 = ((ti4.d) R()).z();
        z17.getClass();
        java.util.LinkedList<mj4.l> linkedList = new java.util.LinkedList();
        java.lang.String a17 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
        android.database.Cursor B = z17.f408610d.B("select rowid, * from TextStatusLike where Read != 1 and HashUserName != ? and DeleteInMsgList != 1 order by CreateTime DESC ", new java.lang.String[]{a17});
        if (B != null) {
            while (B.moveToNext()) {
                mj4.l lVar = new mj4.l();
                lVar.mo9015xbf5d97fd(B);
                linkedList.add(lVar);
            }
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getUnreadInfos: size=" + linkedList.size());
        if (!linkedList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (mj4.l lVar2 : linkedList) {
                arrayList.add(lVar2.f76611x5493d43f + '_' + lVar2.f76601x81959a6e + '_' + lVar2.f76604x3554d688);
            }
            arrayList.toString();
        }
        return linkedList;
    }

    @Override // ai4.b
    public mj4.h E() {
        return P().b(en1.a.a());
    }

    @Override // ai4.b
    public void F(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNativeLogicManager", "[markLikeTabShown]");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_LIKE_TAB_SHOWN_INT, java.lang.Integer.valueOf(i17));
    }

    @Override // ai4.b
    public si4.a G() {
        return P();
    }

    @Override // ai4.b
    public boolean H(int i17, java.lang.String str, int i18) {
        mj4.h i19 = P().i(str, i18);
        if (i19 == null) {
            return false;
        }
        mj4.j jVar = new mj4.j((mj4.k) i19);
        jVar.f(i17);
        P().s(jVar.a());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r26.n0.N(r5) != false) goto L17;
     */
    @Override // ai4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto Ld
            int r2 = r5.length()
            if (r2 != 0) goto Lb
            goto Ld
        Lb:
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 != 0) goto L6d
            ai4.i0 r2 = r4.f86727a
            if (r2 == 0) goto L17
            r2.I(r5)
        L17:
            ri4.a r2 = r4.O()
            ri4.d r2 = (ri4.d) r2
            mj4.f r2 = r2.y()
            if (r5 == 0) goto L2c
            r2.getClass()
            boolean r3 = r26.n0.N(r5)
            if (r3 == 0) goto L2d
        L2c:
            r0 = r1
        L2d:
            l75.k0 r1 = r2.f408593d
            java.lang.String r2 = "TextStatusComment"
            if (r0 == 0) goto L3a
            java.lang.String r0 = "update TextStatusComment set HasBeenDeleted = 1 where HasBeenDeleted != 1 "
            r1.A(r2, r0)
            goto L59
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "update TextStatusComment set HasBeenDeleted = 1 where HasBeenDeleted != 1 and (CommentId = '"
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r3 = "' or RootCommentId = '"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "' )"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1.A(r2, r0)
        L59:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "markDelete: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "MicroMsg.TextStatus.TextStatusCommentStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai4.s0.I(java.lang.String):void");
    }

    @Override // ai4.b
    public void J(qi4.b bVar, qi4.b bVar2) {
        if (bVar != null) {
            ((ti4.d) R()).d(bVar);
        }
        if (bVar2 != null) {
            ((ri4.d) O()).d(bVar2);
        }
    }

    @Override // ai4.b
    public java.util.List K() {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        mj4.n z17 = ((ti4.d) R()).z();
        z17.getClass();
        java.util.LinkedList<mj4.l> linkedList = new java.util.LinkedList();
        android.database.Cursor B = z17.f408610d.B("select rowid,* from TextStatusLike where Read != 1 and DeleteInMsgList != 1", null);
        if (B != null) {
            while (B.moveToNext()) {
                mj4.l lVar = new mj4.l();
                lVar.mo9015xbf5d97fd(B);
                linkedList.add(lVar);
            }
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getAllUnreadInfos: size=" + linkedList.size());
        if (!linkedList.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (mj4.l lVar2 : linkedList) {
                arrayList3.add(lVar2.f76611x5493d43f + '_' + lVar2.f76604x3554d688 + '_' + lVar2.f76601x81959a6e + '_' + lVar2.f76607xcd7d4a17);
            }
            arrayList3.toString();
        }
        for (mj4.l lVar3 : linkedList) {
            arrayList2.add(new ai4.n0(lVar3.f76601x81959a6e, lVar3.m147400x6bf53a6c()));
        }
        for (mj4.e eVar : ((ri4.d) O()).z()) {
            int i17 = eVar.f76555x81959a6e;
            java.lang.String field_FromUserName = eVar.f76558x75873205;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_FromUserName, "field_FromUserName");
            arrayList2.add(new ai4.n0(i17, field_FromUserName));
        }
        for (ai4.n0 n0Var : kz5.n0.F0(arrayList2, new ai4.p0())) {
            if (arrayList.size() < 3 && !hashSet.contains(n0Var.f86710b)) {
                java.lang.String str = n0Var.f86710b;
                arrayList.add(str);
                hashSet.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023e  */
    @Override // ai4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long L(java.lang.String r26, java.lang.String r27, pj4.b0 r28, int r29, java.lang.String r30, long r31, float r33, pj4.s r34, pj4.r r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai4.s0.L(java.lang.String, java.lang.String, pj4.b0, int, java.lang.String, long, float, pj4.s, pj4.r, boolean):long");
    }

    @Override // ai4.b
    public mj4.h M(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNativeLogicManager", "[getStatus] userName null or blank");
            return null;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(str) ? ki4.l0.f389677a.a(str) : P().b(str);
    }

    @Override // ai4.b
    public java.util.List N() {
        return P().q(en1.a.a());
    }

    public final ri4.a O() {
        return (ri4.a) ((jz5.n) this.f86731e).mo141623x754a37bb();
    }

    public final si4.a P() {
        return (si4.a) this.f86729c.mo141623x754a37bb();
    }

    public final int Q() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_SHOWN_INT, null);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final ti4.a R() {
        return (ti4.a) ((jz5.n) this.f86730d).mo141623x754a37bb();
    }

    public final int S(int i17) {
        int A = ((ti4.d) R()).A(i17);
        int A2 = ((ri4.d) O()).A(i17);
        int i18 = A + A2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNativeLogicManager", "[getUnreadCnt] handleNotify, afterTime:" + i17 + " unreadCnt:" + i18 + " likeUnreadCnt:" + A + " commentUnreadCnt:" + A2);
        return i18;
    }

    @Override // ai4.b
    public d95.b0 a() {
        return qi4.p.f445309a.c();
    }

    @Override // ai4.b
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNativeLogicManager", "[markNotifyShown]");
        int e17 = c01.id.e();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_SHOWN_INT, java.lang.Integer.valueOf(e17));
        F(e17);
    }

    @Override // ai4.b
    public int c() {
        return S(-1);
    }

    @Override // ai4.b
    public java.util.List d() {
        return ((ri4.d) O()).z();
    }

    @Override // ai4.b
    public void e() {
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LAST_MARK_READ_TIME_LONG_SYNC, 0L);
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k2.f255559d > 0;
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - t17);
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
        if (abs <= 0 || z17) {
            return;
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().p(352280, true);
    }

    @Override // ai4.b
    public void f() {
        ai4.i0 i0Var = this.f86727a;
        if (i0Var != null) {
            i0Var.f();
        }
        ((ri4.d) O()).y().f408593d.A("TextStatusComment", "update TextStatusComment set DeleteInMsgList = 1 where DeleteInMsgList != 1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentStorage", "markDeleteInMsgList: ");
        ((ti4.d) R()).z().f408610d.A("TextStatusLike", "update TextStatusLike set DeleteInMsgList = 1 where DeleteInMsgList != 1");
    }

    @Override // ai4.b
    public int h(int i17) {
        return ((ri4.d) O()).A(i17);
    }

    @Override // ai4.b
    public hj4.b i() {
        mj4.l lVar;
        int Q = Q();
        hj4.b bVar = new hj4.b(null, 0, null, 7, null);
        int S = S(Q);
        bVar.f363194b = S;
        if (S > 0) {
            android.database.Cursor B = ((ti4.d) R()).z().f408610d.B("select rowid, * from TextStatusLike order by CreateTime DESC LIMIT 1", null);
            if (B != null) {
                lVar = new mj4.l();
                if (B.moveToNext()) {
                    lVar.mo9015xbf5d97fd(B);
                }
                B.close();
            } else {
                lVar = null;
            }
            bVar.f363195c = lVar != null ? lVar.m147400x6bf53a6c() : null;
        }
        return bVar;
    }

    @Override // ai4.b
    public int j() {
        return ((ti4.d) R()).A(Q());
    }

    @Override // ai4.b
    public java.util.List k() {
        mj4.n z17 = ((ti4.d) R()).z();
        z17.getClass();
        java.util.LinkedList<mj4.l> linkedList = new java.util.LinkedList();
        java.lang.String a17 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
        android.database.Cursor B = z17.f408610d.B("select rowid, * from TextStatusLike where Read = 1 and HashUserName != ? and DeleteInMsgList != 1 order by CreateTime DESC ", new java.lang.String[]{a17});
        if (B != null) {
            while (B.moveToNext()) {
                mj4.l lVar = new mj4.l();
                lVar.mo9015xbf5d97fd(B);
                linkedList.add(lVar);
            }
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getReadInfos: size=" + linkedList.size());
        if (!linkedList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (mj4.l lVar2 : linkedList) {
                arrayList.add(lVar2.f76611x5493d43f + '_' + lVar2.f76604x3554d688);
            }
            arrayList.toString();
        }
        return linkedList;
    }

    @Override // ai4.b
    public java.util.List l() {
        mj4.f y17 = ((ri4.d) O()).y();
        y17.getClass();
        java.util.LinkedList<mj4.e> linkedList = new java.util.LinkedList();
        android.database.Cursor B = y17.f408593d.B("select rowid, * from TextStatusComment where Read = 1 and DeleteInMsgList != 1 order by CreateTime DESC ", null);
        if (B != null) {
            while (B.moveToNext()) {
                mj4.e eVar = new mj4.e();
                eVar.mo9015xbf5d97fd(B);
                linkedList.add(eVar);
            }
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentStorage", "getReadInfos: size=" + linkedList.size());
        if (!linkedList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (mj4.e eVar2 : linkedList) {
                arrayList.add(eVar2.f76554xb8f426b5 + '_' + eVar2.f76552xa8350b1f);
            }
            arrayList.toString();
        }
        return linkedList;
    }

    @Override // ai4.b
    public void m(boolean z17) {
        long c17 = c01.id.c();
        if (z17 || java.lang.Math.abs(c17 - this.f86728b) > 600000) {
            mj4.h M = M(en1.a.a());
            java.lang.String l17 = M != null ? ((mj4.k) M).l() : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNativeLogicManager", "[reqGetSelfInfo] forceRequest = " + z17 + " selfStatusId = " + l17);
            if (l17 == null || r26.n0.N(l17)) {
                return;
            }
            gm0.j1.d().g(new ej4.h(l17));
            this.f86728b = c17;
        }
    }

    @Override // ai4.b
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNativeLogicManager", "[markNotifyRedDotClick]");
        int e17 = c01.id.e();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_RED_DOT_CLICK_INT, java.lang.Integer.valueOf(e17));
        F(e17);
    }

    @Override // ai4.b
    public boolean o(java.lang.String str) {
        int i17;
        mj4.n z17 = ((ti4.d) R()).z();
        z17.getClass();
        if (str == null || r26.n0.N(str)) {
            return false;
        }
        java.lang.String a17 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
        android.database.Cursor B = z17.f408610d.B("select count(rowid) from TextStatusLike where TextStatusId = ? and HashUserName = ?", new java.lang.String[]{str, a17});
        if (B != null) {
            i17 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
        } else {
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "[getIsLikeOther]statusId:%s result:%s", str, java.lang.Integer.valueOf(i17));
        return i17 > 0;
    }

    @Override // ai4.b
    public void p(qi4.b bVar, qi4.b bVar2) {
        if (bVar != null) {
            ti4.d dVar = (ti4.d) R();
            dVar.getClass();
            java.util.HashMap hashMap = dVar.f501184c;
            l75.q0 q0Var = (l75.q0) hashMap.get(bVar);
            if (q0Var != null) {
                hashMap.remove(bVar);
                dVar.z().mo49775xc84af884(q0Var);
            }
        }
        if (bVar2 != null) {
            ri4.d dVar2 = (ri4.d) O();
            dVar2.getClass();
            java.util.HashMap hashMap2 = dVar2.f477629c;
            l75.q0 q0Var2 = (l75.q0) hashMap2.get(bVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusCommentNativeStorage", "unObserve: " + bVar2.hashCode());
            if (q0Var2 != null) {
                hashMap2.remove(bVar2);
                dVar2.y().mo49775xc84af884(q0Var2);
            }
        }
    }

    @Override // ai4.b
    public boolean q(mj4.e eVar) {
        if (eVar == null) {
            return false;
        }
        ai4.i0 i0Var = this.f86727a;
        if (i0Var != null) {
            i0Var.q(eVar);
        }
        ri4.d dVar = (ri4.d) O();
        dVar.getClass();
        return dVar.y().mo880xb970c2b9(eVar);
    }

    @Override // ai4.b
    public boolean r() {
        ai4.i0 i0Var = this.f86727a;
        if (i0Var != null) {
            i0Var.r();
        }
        java.util.List D = D();
        java.util.List<mj4.e> d17 = d();
        java.util.Iterator it = D.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            mj4.l lVar = (mj4.l) it.next();
            java.lang.String str = lVar.f76611x5493d43f;
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = lVar.f76605x8d8a3769;
                if (!(str2 == null || str2.length() == 0)) {
                    ti4.a R = R();
                    java.lang.String field_TextStatusId = lVar.f76611x5493d43f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_TextStatusId, "field_TextStatusId");
                    java.lang.String field_HashUserName = lVar.f76605x8d8a3769;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_HashUserName, "field_HashUserName");
                    ti4.d dVar = (ti4.d) R;
                    dVar.getClass();
                    mj4.n z17 = dVar.z();
                    z17.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "markRead() called with: statusId = " + field_TextStatusId + ", hashUserName:" + field_HashUserName + ' ');
                    p75.n0 n0Var = rj4.e.f477823v;
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("Read", (java.lang.Integer) 1);
                    p75.m c17 = rj4.e.f477824w.j(field_TextStatusId).c(rj4.e.f477825x.j(field_HashUserName));
                    p75.h1 j17 = rj4.e.f477823v.j(contentValues);
                    j17.b(c17);
                    j17.a().f(z17.f408610d);
                }
            }
        }
        for (mj4.e eVar : d17) {
            java.lang.String str3 = eVar.f76554xb8f426b5;
            if (!(str3 == null || str3.length() == 0)) {
                ri4.a O = O();
                java.lang.String field_CommentId = eVar.f76554xb8f426b5;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_CommentId, "field_CommentId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(en1.a.a(), "username(...)");
                ri4.d dVar2 = (ri4.d) O;
                dVar2.getClass();
                mj4.f y17 = dVar2.y();
                y17.getClass();
                boolean N = r26.n0.N(field_CommentId);
                l75.k0 k0Var = y17.f408593d;
                if (N) {
                    k0Var.A("TextStatusComment", "update TextStatusComment set Read = 1 where Read != 1 ");
                } else {
                    k0Var.A("TextStatusComment", "update TextStatusComment set Read = 1 where Read != 1 and CommentId = '" + field_CommentId + '\'');
                }
            }
        }
        return true;
    }

    @Override // ai4.b
    public boolean t(mj4.l item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ai4.i0 i0Var = this.f86727a;
        if (i0Var != null) {
            i0Var.t(item);
        }
        ti4.d dVar = (ti4.d) R();
        dVar.getClass();
        return dVar.z().mo880xb970c2b9(item);
    }

    @Override // ai4.b
    public boolean u(mj4.l item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ai4.i0 i0Var = this.f86727a;
        if (i0Var != null) {
            i0Var.u(item);
        }
        ti4.d dVar = (ti4.d) R();
        dVar.getClass();
        return dVar.z().mo9952xce0038c9(item, new java.lang.String[0]);
    }

    @Override // ai4.b
    public boolean v(java.lang.String str, boolean z17) {
        boolean z18 = false;
        if (str == null) {
            return false;
        }
        ai4.i0 i0Var = this.f86727a;
        if (i0Var != null) {
            i0Var.v(str, z17);
        }
        java.lang.String a17 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
        mj4.l y17 = y(a17, str);
        if (!z17 && y17 != null) {
            z18 = C(y17);
        } else if (z17) {
            if (y17 == null) {
                y17 = new mj4.l();
            }
            y17.f76605x8d8a3769 = en1.a.a();
            y17.f76611x5493d43f = str;
            y17.f76610x225271db = 1;
            y17.f76601x81959a6e = c01.id.e();
            y17.f76607xcd7d4a17 = mj4.m.a(y17);
            z18 = ((int) y17.f72763xa3c65b86) == -1 ? t(y17) : u(y17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNativeLogicManager", "doLikeFriend: " + z18 + ", statusId=" + str + " isLike=" + z17);
        return z18;
    }

    @Override // ai4.b
    public java.util.List w() {
        return ((ri4.d) O()).x();
    }

    @Override // ai4.b
    public boolean x() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_RED_DOT_CLICK_INT, null);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        return S(num != null ? num.intValue() : 0) > 0;
    }

    @Override // ai4.b
    public mj4.l y(java.lang.String hashUserName, java.lang.String statusId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashUserName, "hashUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        ti4.d dVar = (ti4.d) R();
        dVar.getClass();
        mj4.n z17 = dVar.z();
        z17.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(statusId);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(hashUserName);
        android.database.Cursor B = z17.f408610d.B("select rowid, * from TextStatusLike where TextStatusId = ? and HashUserName = ? ", new java.lang.String[]{statusId, hashUserName});
        mj4.l lVar = null;
        if (B != null) {
            if (B.moveToFirst()) {
                lVar = new mj4.l();
                lVar.mo9015xbf5d97fd(B);
            }
            B.close();
        }
        return lVar;
    }

    @Override // ai4.b
    public void z(java.util.Map values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        java.lang.String str = (java.lang.String) values.get(".sysmsg.textstatuslike.HashUserName");
        java.lang.String str2 = (java.lang.String) values.get(".sysmsg.textstatuslike.TextStatusID");
        java.lang.String str3 = (java.lang.String) values.get(".sysmsg.textstatuslike.LikeID");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) values.get(".sysmsg.textstatuslike.Version");
        int parseInt = str4 != null ? java.lang.Integer.parseInt(str4) : 0;
        java.lang.String str5 = (java.lang.String) values.get(".sysmsg.textstatuslike.LikeCountVersion");
        int parseInt2 = str5 != null ? java.lang.Integer.parseInt(str5) : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNativeLogicManager", "dealTextStatusLike:textStatusId:%s version:%s likeCountVersion:%s likeId:%s hashUserName:%s", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(parseInt2), str2, str3, str);
        boolean z17 = true;
        if (!(str2 == null || str2.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                java.lang.String str6 = (java.lang.String) values.get(".sysmsg.textstatuslike.DeleteFlag");
                int parseInt3 = str6 != null ? java.lang.Integer.parseInt(str6) : 0;
                mj4.l y17 = y(str, str2);
                mj4.h t17 = P().t(str2);
                if (parseInt3 != 1 || y17 == null) {
                    if (parseInt3 != 1 && t17 != null) {
                        if (y17 == null) {
                            y17 = new mj4.l();
                        }
                        y17.f76605x8d8a3769 = str;
                        y17.f76611x5493d43f = str2;
                        java.lang.String str7 = (java.lang.String) values.get(".sysmsg.textstatuslike.Type");
                        y17.f76613x2253a77f = str7 != null ? java.lang.Integer.parseInt(str7) : 0;
                        y17.f76607xcd7d4a17 = str3;
                        java.lang.String str8 = (java.lang.String) values.get(".sysmsg.textstatuslike.Notify");
                        y17.f76608xd13fb24e = str8 != null ? java.lang.Integer.parseInt(str8) : 0;
                        java.lang.String str9 = (java.lang.String) values.get(".sysmsg.textstatuslike.CreateTime");
                        y17.f76601x81959a6e = str9 != null ? java.lang.Integer.parseInt(str9) : 0;
                        y17.f76604x3554d688 = (java.lang.String) values.get(".sysmsg.textstatuslike.NickName");
                        y17.f76606x75d1dd31 = (java.lang.String) values.get(".sysmsg.textstatuslike.HeadImgUrl");
                        mj4.k kVar = (mj4.k) t17;
                        y17.f76603x685e8417 = kVar.g();
                        y17.f76615x7b284d5e = kVar.i();
                        y17.f76609xd302a37a = kVar.q();
                        y17.f76612x2931c158 = kVar.n();
                        if (((int) y17.f72763xa3c65b86) == -1) {
                            t(y17);
                            if (y17.f76608xd13fb24e == 1) {
                                e();
                            }
                        } else if (parseInt == 0 || parseInt > y17.f76614xecc06273) {
                            y17.f76614xecc06273 = parseInt;
                            u(y17);
                            if (y17.f76608xd13fb24e == 1) {
                                e();
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusNativeLogicManager", "doReceiveLikeMsg: update. version:%s field_Version:%s", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(y17.f76614xecc06273));
                        }
                        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                        qj4.s.l(qj4.s.f445491a, bk0.a.g().l(352280) ? 5L : 6L, null, null, 0L, null, 0L, 62, null);
                    }
                } else if (parseInt == 0 || parseInt > y17.f76614xecc06273) {
                    y17.f76614xecc06273 = parseInt;
                    C(y17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusNativeLogicManager", "dealTextStatusLike: likeMsg delete. version:%s field_Version:%s", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(y17.f76614xecc06273));
                }
                if (t17 != null) {
                    if (parseInt2 != 0 && parseInt2 <= ((mj4.k) t17).f408600b.f76520x6e4d16c5) {
                        z17 = false;
                    }
                    if (z17) {
                        mj4.j jVar = new mj4.j((mj4.k) t17);
                        jVar.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) values.get(".sysmsg.textstatuslike.LikeCount"), 0));
                        jVar.f408599b.put("field_LikeCountVersion", java.lang.Integer.valueOf(parseInt2));
                        P().s(jVar.a());
                    }
                }
            }
        }
        ai4.i0 i0Var = this.f86727a;
        if (i0Var != null) {
            i0Var.z(values);
        }
    }
}
