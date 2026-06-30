package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class t4 extends bm5.p1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f291407b;

    public t4(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb) {
        this.f291407b = c21357x5e7365bb;
    }

    @Override // bm5.p1
    public java.lang.Object a() {
        return new e75.a() { // from class: com.tencent.mm.ui.t4$$a
            @Override // e75.a
            /* renamed from: onChanged */
            public final void mo2231x7bb163d5(java.lang.Object obj) {
                final com.p314xaae8f345.mm.ui.t4 t4Var = com.p314xaae8f345.mm.ui.t4.this;
                t4Var.getClass();
                ((ug0.x) obj).b(tg0.i2.class, new j75.l() { // from class: com.tencent.mm.ui.t4$$b
                    @Override // j75.l
                    public final void a(j75.d dVar) {
                        final com.p314xaae8f345.mm.ui.t4 t4Var2 = com.p314xaae8f345.mm.ui.t4.this;
                        final tg0.i2 i2Var = (tg0.i2) dVar;
                        t4Var2.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, received a WebSearchRedDotControlAction.");
                        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.t4$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z17;
                                boolean z18;
                                r45.f03 f03Var;
                                r45.f03 f03Var2;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2;
                                r45.f03 f03Var3;
                                boolean z19;
                                com.p314xaae8f345.mm.ui.t4 t4Var3 = com.p314xaae8f345.mm.ui.t4.this;
                                com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a c22594xcb88ef3a = (com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a) t4Var3.f291407b.f278189w.h("find_friends_by_search");
                                if (c22594xcb88ef3a == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FindMoreFriendsUI", "webSearchObserver, searchPreference is null, skipped.");
                                    return;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = i2Var.f500615b;
                                boolean z27 = false;
                                java.lang.String str = null;
                                if (aVar == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDowResult is null, create an empty instance.");
                                    aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a(false, null, null, "");
                                }
                                zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
                                java.lang.String str2 = aVar.f186864e;
                                boolean equals = "Search.Entrance".equals(str2);
                                boolean z28 = aVar.f186860a;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 = aVar.f186862c;
                                if (equals) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDotPath: Entrance, getting ctrlInfo from action.");
                                    if (jbVar3 != null) {
                                        f03Var2 = jbVar3.I0("Search.Entrance");
                                        boolean z29 = f03Var2 != null && z28;
                                        jbVar2 = jbVar3;
                                        z18 = false;
                                        f03Var = null;
                                        z17 = z29;
                                        jbVar = null;
                                    } else {
                                        jbVar2 = jbVar3;
                                        z17 = false;
                                        z18 = false;
                                        f03Var = null;
                                        f03Var2 = null;
                                        jbVar = null;
                                    }
                                    str = "Search.Entrance";
                                } else if ("Search.MentionEntrance".equals(str2)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDotPath: MentionEntrance, getting ctrlInfo from action.");
                                    if (jbVar3 != null) {
                                        r45.f03 I0 = jbVar3.I0("Search.MentionEntrance");
                                        boolean z37 = I0 != null && I0.f455421e > 0 && z28;
                                        z17 = false;
                                        jbVar2 = null;
                                        z18 = z37;
                                        jbVar = jbVar3;
                                        f03Var = I0;
                                        f03Var2 = null;
                                    } else {
                                        jbVar = jbVar3;
                                        z17 = false;
                                        z18 = false;
                                        f03Var = null;
                                        f03Var2 = null;
                                        jbVar2 = null;
                                    }
                                    str = "Search.MentionEntrance";
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDotPath not supported.");
                                    z17 = false;
                                    z18 = false;
                                    f03Var = null;
                                    f03Var2 = null;
                                    jbVar = null;
                                    jbVar2 = null;
                                }
                                if (f03Var2 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, entranceShowInfo is null, finding showInfo by path.");
                                    jbVar2 = nk6.L0("Search.Entrance");
                                    if (jbVar2 != null) {
                                        f03Var2 = jbVar2.I0("Search.Entrance");
                                        z17 = f03Var2 != null;
                                    }
                                }
                                if (f03Var == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, mentionEntranceShowInfo is null, finding showInfo by path.");
                                    jbVar = nk6.L0("Search.MentionEntrance");
                                    if (jbVar != null) {
                                        r45.f03 I02 = jbVar.I0("Search.MentionEntrance");
                                        if (I02 != null && I02.f455421e > 0) {
                                            z27 = true;
                                        }
                                        f03Var3 = I02;
                                        z19 = z27;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDotPath: " + str + ", isEntranceShow: " + z17 + ", entranceCtrlInfo: " + jbVar2 + ", entranceShowInfo: " + f03Var2 + ", isMentionEntranceShow: " + z19 + ", mentionEntranceCtrlInfo: " + jbVar + ", mentionEntranceShowInfo: " + f03Var3);
                                        t4Var3.f291407b.B0(c22594xcb88ef3a, str, z17, jbVar2, f03Var2, z19, jbVar, f03Var3);
                                    }
                                }
                                f03Var3 = f03Var;
                                z19 = z18;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDotPath: " + str + ", isEntranceShow: " + z17 + ", entranceCtrlInfo: " + jbVar2 + ", entranceShowInfo: " + f03Var2 + ", isMentionEntranceShow: " + z19 + ", mentionEntranceCtrlInfo: " + jbVar + ", mentionEntranceShowInfo: " + f03Var3);
                                t4Var3.f291407b.B0(c22594xcb88ef3a, str, z17, jbVar2, f03Var2, z19, jbVar, f03Var3);
                            }
                        });
                    }
                });
            }
        };
    }
}
