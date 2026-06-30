package b92;

@j95.b
/* loaded from: classes3.dex */
public final class g1 extends i95.w implements c61.ac {
    public void Ai(java.lang.String path, long j17, org.json.JSONObject json) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(json, "json");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(path);
        if (L0 != null) {
            com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) ll2.e.f319133a.g(path).getValue();
            boolean z17 = false;
            if (aVar != null && aVar.f105327a) {
                z17 = true;
            }
            if (z17) {
                r45.vs2 vs2Var = L0.field_ctrInfo;
                if (vs2Var == null || (str = vs2Var.f388490h) == null) {
                    str = "";
                }
                json.put("reddot_id", str);
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.j5((zy2.zb) c17, j17, json.toString(), null, 4, null);
            }
        }
    }

    public void Bi() {
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "removeBattleEndDelayTimer");
        com.tencent.mm.sdk.platformtools.u3.l(dk2.ef.X);
    }

    public void Di() {
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "removeBattleStartDelayTimer");
        com.tencent.mm.sdk.platformtools.u3.l(dk2.ef.Y);
    }

    public void Ni(long j17, org.json.JSONObject json) {
        kotlin.jvm.internal.o.g(json, "json");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.j5((zy2.zb) c17, j17, json.toString(), null, 4, null);
    }

    public void Ri(long j17, java.lang.String str) {
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "startBattleEndDelayTimer delay:" + j17 + " battleId:" + str);
        com.tencent.mm.sdk.platformtools.u3.l(dk2.ef.X);
        dk2.tc tcVar = new dk2.tc(str);
        dk2.ef.X = tcVar;
        com.tencent.mm.sdk.platformtools.u3.i(tcVar, j17);
    }

    public void Ui(long j17, java.lang.String str) {
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "startBattleStartDelayTimer delay:" + j17 + " battleId:" + str);
        if (str != null) {
            com.tencent.mm.sdk.platformtools.u3.l(dk2.ef.Y);
            dk2.uc ucVar = new dk2.uc(str);
            dk2.ef.Y = ucVar;
            com.tencent.mm.sdk.platformtools.u3.i(ucVar, j17);
        }
    }

    public void Vi() {
        gk2.e eVar;
        kn0.p pVar;
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "trtc startLinkMic liveCore: " + dk2.ef.f233378d + " instance: " + (dk2.ef.f233378d instanceof co0.s));
        tn0.w0 w0Var = dk2.ef.f233378d;
        boolean z17 = w0Var instanceof co0.s;
        if (z17) {
            co0.s sVar = z17 ? (co0.s) w0Var : null;
            if (sVar != null) {
                kn0.p pVar2 = sVar.D;
                pVar2.getClass();
                pVar2.f309583c = kn0.j.f309563e;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreMic", "[sdk]start link mic");
                vn0.e eVar2 = sVar.f420764m;
                if (!(eVar2 != null && eVar2.f438185c == 20)) {
                    vn0.b.f438174a.a().getClass();
                    vn0.e eVar3 = sVar.f420764m;
                    if (eVar3 != null) {
                        eVar3.i(pVar2.e());
                    }
                    vn0.e eVar4 = sVar.f420764m;
                    if (eVar4 != null) {
                        int i17 = eVar4.f438185c == 20 ? 21 : 20;
                        com.tencent.trtc.TRTCCloud tRTCCloud = eVar4.f438183a;
                        if (tRTCCloud != null) {
                            tRTCCloud.switchRole(i17);
                        }
                        eVar4.f438185c = i17;
                    }
                    vn0.e eVar5 = sVar.f420764m;
                    if (eVar5 != null) {
                        eVar5.k();
                    }
                }
            }
            tn0.w0 w0Var2 = dk2.ef.f233378d;
            if (w0Var2 != null) {
                w0Var2.e0(false);
            }
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null) {
                c1Var.n9(false);
            }
        }
        dk2.ef.f233386h.getClass();
        tn0.w0 w0Var3 = dk2.ef.f233378d;
        if (((w0Var3 == null || (pVar = w0Var3.D) == null || pVar.f()) ? false : true) || (eVar = dk2.ef.I) == null) {
            return;
        }
        pm0.v.X(new em2.t(eVar));
    }

    public void wi(gk2.e liveData, int i17) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "checkAcceptMicType micType:" + i17);
        ((mm2.o4) liveData.a(mm2.o4.class)).Q7(i17 != 1 ? i17 != 2 ? 0 : 4 : 3);
    }
}
