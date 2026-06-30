package b92;

@j95.b
/* loaded from: classes3.dex */
public final class g1 extends i95.w implements c61.ac {
    public void Ai(java.lang.String path, long j17, org.json.JSONObject json) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(path);
        if (L0 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) ll2.e.f400666a.g(path).mo3195x754a37bb();
            boolean z17 = false;
            if (aVar != null && aVar.f186860a) {
                z17 = true;
            }
            if (z17) {
                r45.vs2 vs2Var = L0.f65874xb5f7102a;
                if (vs2Var == null || (str = vs2Var.f470023h) == null) {
                    str = "";
                }
                json.put("reddot_id", str);
                i95.m c17 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.j5((zy2.zb) c17, j17, json.toString(), null, 4, null);
            }
        }
    }

    public void Bi() {
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "removeBattleEndDelayTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(dk2.ef.X);
    }

    public void Di() {
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "removeBattleStartDelayTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(dk2.ef.Y);
    }

    public void Ni(long j17, org.json.JSONObject json) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.j5((zy2.zb) c17, j17, json.toString(), null, 4, null);
    }

    public void Ri(long j17, java.lang.String str) {
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "startBattleEndDelayTimer delay:" + j17 + " battleId:" + str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(dk2.ef.X);
        dk2.tc tcVar = new dk2.tc(str);
        dk2.ef.X = tcVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(tcVar, j17);
    }

    public void Ui(long j17, java.lang.String str) {
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "startBattleStartDelayTimer delay:" + j17 + " battleId:" + str);
        if (str != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(dk2.ef.Y);
            dk2.uc ucVar = new dk2.uc(str);
            dk2.ef.Y = ucVar;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(ucVar, j17);
        }
    }

    public void Vi() {
        gk2.e eVar;
        kn0.p pVar;
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "trtc startLinkMic liveCore: " + dk2.ef.f314911d + " instance: " + (dk2.ef.f314911d instanceof co0.s));
        tn0.w0 w0Var = dk2.ef.f314911d;
        boolean z17 = w0Var instanceof co0.s;
        if (z17) {
            co0.s sVar = z17 ? (co0.s) w0Var : null;
            if (sVar != null) {
                kn0.p pVar2 = sVar.D;
                pVar2.getClass();
                pVar2.f391116c = kn0.j.f391096e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreMic", "[sdk]start link mic");
                vn0.e eVar2 = sVar.f502297m;
                if (!(eVar2 != null && eVar2.f519718c == 20)) {
                    vn0.b.f519707a.a().getClass();
                    vn0.e eVar3 = sVar.f502297m;
                    if (eVar3 != null) {
                        eVar3.i(pVar2.e());
                    }
                    vn0.e eVar4 = sVar.f502297m;
                    if (eVar4 != null) {
                        int i17 = eVar4.f519718c == 20 ? 21 : 20;
                        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8 = eVar4.f519716a;
                        if (abstractC26786xbe57dcc8 != null) {
                            abstractC26786xbe57dcc8.mo30417xeb4bf1ca(i17);
                        }
                        eVar4.f519718c = i17;
                    }
                    vn0.e eVar5 = sVar.f502297m;
                    if (eVar5 != null) {
                        eVar5.k();
                    }
                }
            }
            tn0.w0 w0Var2 = dk2.ef.f314911d;
            if (w0Var2 != null) {
                w0Var2.e0(false);
            }
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null) {
                c1Var.n9(false);
            }
        }
        dk2.ef.f314919h.getClass();
        tn0.w0 w0Var3 = dk2.ef.f314911d;
        if (((w0Var3 == null || (pVar = w0Var3.D) == null || pVar.f()) ? false : true) || (eVar = dk2.ef.I) == null) {
            return;
        }
        pm0.v.X(new em2.t(eVar));
    }

    public void wi(gk2.e liveData, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "checkAcceptMicType micType:" + i17);
        ((mm2.o4) liveData.a(mm2.o4.class)).Q7(i17 != 1 ? i17 != 2 ? 0 : 4 : 3);
    }
}
