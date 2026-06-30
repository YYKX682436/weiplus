package com.tencent.mm.feature.finder.live;

@j95.b
/* loaded from: classes3.dex */
public final class i1 extends i95.w implements s40.q0 {
    public void wi(long j17, long j18, long j19, java.lang.String anchorUsername, int i17) {
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        ml2.x1 x1Var = ml2.x1.f328201e;
        if (j17 != 1) {
            x1Var = ml2.x1.f328202f;
            if (j17 != 2) {
                x1Var = ml2.x1.f328203g;
                if (j17 != 3) {
                    x1Var = ml2.x1.f328204h;
                    if (j17 != 4) {
                        x1Var = ml2.x1.f328205i;
                        if (j17 != 5) {
                            x1Var = ml2.x1.f328206m;
                            if (j17 != 6) {
                                x1Var = ml2.x1.f328207n;
                                if (j17 != 7) {
                                    x1Var = ml2.x1.f328208o;
                                    if (j17 != 8) {
                                        x1Var = ml2.x1.f328209p;
                                        if (j17 != 9) {
                                            x1Var = ml2.x1.f328210q;
                                            if (j17 != 10) {
                                                x1Var = ml2.x1.f328211r;
                                                if (j17 != 11) {
                                                    x1Var = ml2.x1.f328212s;
                                                    if (j17 != 23) {
                                                        x1Var = ml2.x1.f328213t;
                                                        if (j17 != 12) {
                                                            x1Var = ml2.x1.f328214u;
                                                            if (j17 != 13) {
                                                                throw new java.lang.IllegalArgumentException("Unknown exploreType " + j17);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        long j27 = i17;
        ml2.q1 q1Var = ml2.q1.f327812e;
        j0Var.Ui(j27, "temp_6");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4.o(ml2.j0.f327583i, x1Var, 0, null, 6, null);
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vi(finderLiveEntranceLogStruct, anchorUsername);
        finderLiveEntranceLogStruct.t(pm0.v.u(j18));
        finderLiveEntranceLogStruct.f57122e = j19;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveEntranceLogStruct.u(b52.b.q(j19));
        finderLiveEntranceLogStruct.f57126i = x1Var.f328220d;
        finderLiveEntranceLogStruct.r("temp_6");
        finderLiveEntranceLogStruct.f57128k = j27;
        finderLiveEntranceLogStruct.f57129l = 0L;
        ml2.v3[] v3VarArr = ml2.v3.f328148d;
        finderLiveEntranceLogStruct.f57130m = 2;
        finderLiveEntranceLogStruct.w("");
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveEntranceLogStruct.s(b52.b.b());
        finderLiveEntranceLogStruct.f57133p = -1L;
        finderLiveEntranceLogStruct.f57140w = 0L;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveEntranceLogStruct.q(b52.b.c());
        finderLiveEntranceLogStruct.f57143z = finderLiveEntranceLogStruct.b("ClickSubTabContextId", "", true);
        finderLiveEntranceLogStruct.p("");
        finderLiveEntranceLogStruct.v("temp_6");
        finderLiveEntranceLogStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderChatRoomLiveReporter", "reportTipsBar action:" + finderLiveEntranceLogStruct.f57126i + ", feedId:" + finderLiveEntranceLogStruct.f57123f + ", liveId:" + finderLiveEntranceLogStruct.f57137t);
    }
}
