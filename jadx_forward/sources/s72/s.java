package s72;

/* loaded from: classes12.dex */
public final class s implements o72.j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f485678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f485679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f485680c;

    public s(java.util.LinkedList linkedList, s72.j0 j0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        this.f485678a = linkedList;
        this.f485679b = j0Var;
        this.f485680c = g0Var;
    }

    public final boolean a() {
        byte[] d17;
        boolean z17;
        boolean z18;
        boolean mo9952xce0038c9;
        long j17;
        while (true) {
            java.util.LinkedList linkedList = this.f485678a;
            if (linkedList.isEmpty()) {
                return true;
            }
            r45.b50 b50Var = (r45.b50) linkedList.getFirst();
            linkedList.removeFirst();
            int i17 = b50Var.f452063d;
            s72.j0 j0Var = this.f485679b;
            if (i17 == 200) {
                byte[] d18 = x51.j1.d(b50Var.f452064e);
                if (d18 == null) {
                    continue;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDB] cmd id = " + b50Var.f452063d + ", buffer size = " + d18.length);
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.d4().mo11468x92b714fd(d18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AddFavItem");
                    r45.d4 d4Var = (r45.d4) mo11468x92b714fd;
                    java.util.HashSet hashSet = s72.j0.f485602i;
                    j0Var.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[updateFavItemInfoDB] favId = " + d4Var.f453593d + ", flag = " + d4Var.f453595f + ", update time = " + d4Var.f453596g);
                    if ((d4Var.f453595f & 1) != 0) {
                        o72.x1.l(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(d4Var.f453593d), false, null, 2, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[updateFavItemInfoDB] delete fav, favId = " + d4Var.f453593d);
                        j17 = -1;
                    } else {
                        o72.r2 re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(d4Var.f453593d);
                        if (re6 == null) {
                            re6 = new o72.r2();
                            re6.f67659xa783a79b = d4Var.f453596g * 1000;
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        re6.f67643xc8a07680 = d4Var.f453593d;
                        int i18 = d4Var.f453597h;
                        re6.f67658x266f95d1 = i18;
                        if (re6.f67646x8f0eb299 == i18) {
                            z18 = z17;
                            re6.f67659xa783a79b = d4Var.f453596g * 1000;
                        } else {
                            z18 = z17;
                        }
                        re6.f67641x225ba391 = d4Var.f453595f;
                        re6.f67657x2262335f = d4Var.f453594e;
                        if (z18) {
                            re6.f67645x88be67a1 = java.lang.System.currentTimeMillis() + j0Var.f485605h;
                            mo9952xce0038c9 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo880xb970c2b9(re6);
                            if (!mo9952xce0038c9) {
                                java.lang.Long Y6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Y6();
                                j0Var.f485605h = (Y6.longValue() - re6.f67645x88be67a1) + 1;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[updateFavItemInfoDB] insert new failed, try fix localid { old:" + re6.f67645x88be67a1 + ", max:" + Y6 + " } and insert again");
                                re6.f67645x88be67a1 = Y6.longValue() + 1;
                                mo9952xce0038c9 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo880xb970c2b9(re6);
                            }
                            if (mo9952xce0038c9) {
                                o72.d2.i(true, true);
                            } else {
                                o72.d2.i(false, false);
                            }
                            j0Var.f485605h++;
                        } else {
                            mo9952xce0038c9 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(re6, dm.i4.f66867x2a5c95c7);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[updateFavItemInfoDB] finish favId = " + d4Var.f453593d + ", need insert = " + z18 + ", dbRet = " + mo9952xce0038c9);
                        j17 = mo9952xce0038c9 ? d4Var.f453596g : -20240306L;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f485680c;
                    if (j17 == -20240306) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDB] update db failed, ignore cur sync resp");
                        g0Var.f391654d = -20240306L;
                        return false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDB] update time = " + j17 + ", minUpdateTime = " + g0Var.f391654d);
                    long j18 = g0Var.f391654d;
                    if (j18 < 0 || (j17 > 0 && j17 < j18)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDB] min update time change, last min update time = " + g0Var.f391654d + ", new min update time = " + j17);
                        g0Var.f391654d = j17;
                    }
                }
            }
            if (b50Var.f452063d == 229 && (d17 = x51.j1.d(b50Var.f452064e)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDB] cmd id = " + b50Var.f452063d + ", buffer size = " + d17.length);
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd2 = new r45.nq0().mo11468x92b714fd(d17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FavTag");
                s72.j0.T6(j0Var, (r45.nq0) mo11468x92b714fd2);
            }
        }
    }
}
