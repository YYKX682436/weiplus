package vn0;

/* loaded from: classes3.dex */
public class d extends com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f519715a;

    public d(vn0.f fVar) {
        this.f519715a = new java.lang.ref.WeakReference(fVar);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onAudioEffectFinished */
    public void mo105565x45380e3a(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onAudioRouteChanged */
    public void mo105566xc4967f02(int i17, int i18) {
        om2.i iVar;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCCloudListenerImpl", "onAudioRouteChanged: newRoute = " + i17 + " oldRoute = " + i18);
        if (((vn0.f) this.f519715a.get()) == null || fn0.g.f345729b == null) {
            return;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        om2.g gVar = (om2.g) efVar.i(om2.g.class);
        if (gVar != null && gVar.S6()) {
            om2.e eVar = (om2.e) efVar.i(om2.e.class);
            om2.e eVar2 = eVar != null ? (om2.e) eVar.m147920xbba4bfc0(om2.e.class) : null;
            if (eVar2 != null) {
                eVar2.f427829o = false;
            }
            om2.e eVar3 = (om2.e) efVar.i(om2.e.class);
            if (eVar3 != null && (j2Var = eVar3.f427831q) != null) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(java.lang.Integer.valueOf(i17));
            }
            om2.g gVar2 = (om2.g) efVar.i(om2.g.class);
            if (gVar2 == null || (iVar = gVar2.f427840n) == null) {
                return;
            }
            mm2.a aVar = iVar.f427868o;
            mm2.a aVar2 = iVar.f427867n;
            mm2.a aVar3 = iVar.f427865l;
            mm2.a aVar4 = iVar.f427869p;
            mm2.a aVar5 = iVar.f427866m;
            if (i17 == 0) {
                aVar.c();
                mm2.a.b(aVar4, false, 1, null);
                mm2.a.b(aVar5, false, 1, null);
                mm2.a.b(aVar3, false, 1, null);
                mm2.a.b(aVar2, false, 1, null);
                return;
            }
            if (i17 == 1) {
                aVar4.c();
                mm2.a.b(aVar, false, 1, null);
                mm2.a.b(aVar5, false, 1, null);
                mm2.a.b(aVar3, false, 1, null);
                mm2.a.b(aVar2, false, 1, null);
                return;
            }
            if (i17 == 2) {
                aVar5.c();
                mm2.a.b(aVar4, false, 1, null);
                mm2.a.b(aVar5, false, 1, null);
                mm2.a.b(aVar3, false, 1, null);
                mm2.a.b(aVar2, false, 1, null);
                return;
            }
            if (i17 == 3) {
                aVar3.c();
                mm2.a.b(aVar4, false, 1, null);
                mm2.a.b(aVar5, false, 1, null);
                mm2.a.b(aVar, false, 1, null);
                mm2.a.b(aVar2, false, 1, null);
                return;
            }
            if (i17 != 4) {
                return;
            }
            aVar2.c();
            mm2.a.b(aVar4, false, 1, null);
            mm2.a.b(aVar5, false, 1, null);
            mm2.a.b(aVar3, false, 1, null);
            mm2.a.b(aVar, false, 1, null);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onConnectOtherRoom */
    public void mo105569xbf6c2e40(java.lang.String str, int i17, java.lang.String str2) {
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "onConnectOtherRoom, userID:" + str + ", err:" + i17 + ", errMsg:$" + str2);
            if (i17 == 0) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("KEY_USERID", str);
                hn0.i iVar = w0Var.A;
                if (iVar != null) {
                    iVar.mo57125xf5bc2045(8, bundle);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onConnectionLost */
    public void mo105570x7a7fc2e1() {
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveCore", "onConnectionLost");
            hn0.i iVar = ((tn0.w0) fVar).A;
            if (iVar != null) {
                iVar.mo57125xf5bc2045(31, null);
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onConnectionRecovery */
    public void mo105571x201d54d2() {
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "onConnectionRecovery");
            hn0.i iVar = w0Var.A;
            if (iVar != null) {
                iVar.mo57125xf5bc2045(32, null);
            }
            zn0.a0 U = w0Var.U();
            U.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "onConnectionRecovery");
            zn0.s sVar = U.f555854y;
            if (sVar != null) {
                pm0.v.X(new zn0.n(sVar));
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onDisConnectOtherRoom */
    public void mo105572x5670be90(int i17, java.lang.String str) {
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "onDisConnectOtherRoom, err:" + i17 + ", errMsg:" + str);
            if (i17 == 0) {
                android.os.Bundle bundle = new android.os.Bundle();
                hn0.i iVar = w0Var.A;
                if (iVar != null) {
                    iVar.mo57125xf5bc2045(9, bundle);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onEnterRoom */
    public void mo105573xcb050cb4(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCCloudListenerImpl", "onEnterRoom: elapsed = " + j17);
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            fVar.e(j17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onError */
    public void mo105574xaf8aa769(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCCloudListenerImpl", "onError: errCode = " + i17 + " errMsg = " + str);
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            fVar.p(i17, str, bundle);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onExitRoom */
    public void mo105575x26931218(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCCloudListenerImpl", "onExitRoom: reason = " + i17);
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            fVar.a(i17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onFirstVideoFrame */
    public void mo105577x54149ca3(java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCCloudListenerImpl", "onFirstVideoFrame: userId = " + str + " streamType = " + i17 + " width = " + i18 + " height = " + i19);
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            fVar.c(str, i17, i18, i19);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onNetworkQuality */
    public void mo105584xf01276b0(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCQuality tRTCQuality, java.util.ArrayList arrayList) {
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            int i17 = tRTCQuality != null ? tRTCQuality.f57096x26d0c0ff : 0;
            if (i17 != 0) {
                i17 = i17 <= 2 ? 0 : i17 <= 4 ? 1 : i17 < 6 ? 2 : 3;
            }
            w0Var.R = tRTCQuality != null ? tRTCQuality.f57096x26d0c0ff : 0;
            kn0.p pVar = w0Var.D;
            int i18 = pVar.f391123j;
            if (i18 != 3 && i17 == 3) {
                w0Var.y(1);
            } else if (i18 == 3 && i17 != 3) {
                w0Var.n0(1);
            }
            if (pVar.f391123j != i17) {
                pVar.f391123j = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "onNetworkQuality, local:" + i17);
            }
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (pVar.f391124k != m40067xab9ed241) {
                pVar.f391124k = m40067xab9ed241;
            }
            hn0.i iVar = w0Var.A;
            if (iVar != null) {
                hn0.i.a(iVar, 3, null, 2, null);
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onRecvCustomCmdMsg */
    public void mo105585xe6e383bd(java.lang.String str, int i17, int i18, byte[] bArr) {
        if (((vn0.f) this.f519715a.get()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "onRecvCustomCmdMsg userId:" + str);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onRecvSEIMsg */
    public void mo105586x2e96246f(java.lang.String str, byte[] bArr) {
        kn0.g gVar;
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            kn0.i iVar = w0Var.C;
            int i17 = (iVar == null || (gVar = iVar.f391091b) == null) ? 0 : gVar.f391080n;
            if (i17 > 0) {
                p3325xe03a0797.p3326xc267989b.l.d(w0Var.Y, null, null, new tn0.g(i17, bArr, w0Var, null), 3, null);
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onRemoteUserEnterRoom */
    public void mo105588xd807c943(java.lang.String str) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCCloudListenerImpl", "onRemoteUserEnterRoom: userId = " + str);
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            zn0.a0 U = w0Var.U();
            U.getClass();
            if (str == null || str.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TRTCRemoteUserManager", "addRemoteUserInRoom: userId is null or empty");
            } else {
                java.util.concurrent.ConcurrentHashMap.KeySetView keySetView = (java.util.concurrent.ConcurrentHashMap.KeySetView) U.F;
                keySetView.add(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "addRemoteUserInRoom: userId=" + str + ", size=" + keySetView.size());
            }
            java.lang.String debugText = "[sdk]onRemoteUserEnterRoom:" + str;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugText, "debugText");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", debugText);
            if (fn0.g.f345729b != null && zl2.r4.f555483a.x1()) {
                fj2.s sVar = fj2.s.f344716a;
                java.lang.String str2 = str == null ? "" : str;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                sVar.f(6, str2, r26.i0.t(jSONObject2, ",", ";", false));
                mm2.y2 y2Var = (mm2.y2) dk2.ef.f314905a.i(mm2.y2.class);
                if (y2Var != null) {
                    java.util.List list = y2Var.f411102v;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-reportAudienceMicUserList>(...)");
                    synchronized (list) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            obj = null;
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            } else {
                                obj2 = it.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj2).f390703a, str)) {
                                    break;
                                }
                            }
                        }
                    }
                    if (((km2.q) obj2) != null) {
                        fj2.s.f344716a.f(4, str == null ? "" : str, "");
                    }
                    java.util.List list2 = y2Var.f411103w;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-reportAnchorMicUserList>(...)");
                    synchronized (list2) {
                        java.util.Iterator it6 = list2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it6.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) next).f390703a, str)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    if (((km2.q) obj) != null) {
                        fj2.s.f344716a.f(2, str == null ? "" : str, "");
                    }
                }
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("live_user_id", str);
            hn0.i iVar = w0Var.A;
            if (iVar != null) {
                iVar.mo57125xf5bc2045(36, bundle);
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onRemoteUserLeaveRoom */
    public void mo105589x6e3109a2(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCCloudListenerImpl", "onRemoteUserLeaveRoom: userId = " + str + " reason = " + i17);
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            fVar.l(str, i17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onStatistics */
    public void mo105602xc17a1062(com.p314xaae8f345.p3109x36756d.C26789x7211d670 c26789x7211d670) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics> arrayList;
        com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics tRTCLocalStatistics;
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics> arrayList2;
        com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics tRTCLocalStatistics2;
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics> arrayList3;
        com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics tRTCLocalStatistics3;
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics> arrayList4;
        com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics tRTCLocalStatistics4;
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics> arrayList5;
        com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics tRTCLocalStatistics5;
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics> arrayList6;
        com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics tRTCLocalStatistics6;
        kn0.g gVar;
        kn0.g gVar2;
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            android.os.Bundle bundle = new android.os.Bundle();
            jz5.g gVar3 = ko0.p0.f391429a;
            if (c26789x7211d670 != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appCpu", c26789x7211d670.f57193xabe44fc7);
                jSONObject.put("systemCpu", c26789x7211d670.f57200x434cb4f9);
                jSONObject.put("rtt", c26789x7211d670.rtt);
                jSONObject.put("upLoss", c26789x7211d670.f57201xcdf5845e);
                jSONObject.put("downLoss", c26789x7211d670.f57194x550c3ee5);
                jSONObject.put("sendBytes", c26789x7211d670.f57199x175c3);
                jSONObject.put("receiveBytes", c26789x7211d670.f57197xd06bb348);
                java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics> arrayList7 = c26789x7211d670.f57196x4c0d8dae;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                if (arrayList7 != null) {
                    for (com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics tRTCLocalStatistics7 : arrayList7) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("width", tRTCLocalStatistics7.f57209x6be2dc6);
                        jSONObject2.put("height", tRTCLocalStatistics7.f57206xb7389127);
                        jSONObject2.put("frameRate", tRTCLocalStatistics7.f57205x207cebed);
                        jSONObject2.put("videoBitrate", tRTCLocalStatistics7.f57208xf1220e72);
                        jSONObject2.put("audioSampleRate", tRTCLocalStatistics7.f57204xa80e7620);
                        jSONObject2.put("audioBitrate", tRTCLocalStatistics7.f57202x9b599ab7);
                        jSONObject2.put("streamType", tRTCLocalStatistics7.f57207xb8c992da);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("LocalStatistics", jSONArray);
                java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCRemoteStatistics> arrayList8 = c26789x7211d670.f57198x830cc5b3;
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                if (arrayList8 != null) {
                    for (java.util.Iterator it = arrayList8.iterator(); it.hasNext(); it = it) {
                        com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCRemoteStatistics tRTCRemoteStatistics = (com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCRemoteStatistics) it.next();
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("userId", tRTCRemoteStatistics.f57223xce2b2e46);
                        jSONObject3.put("finalLoss", tRTCRemoteStatistics.f57215x152951b9);
                        jSONObject3.put("width", tRTCRemoteStatistics.f57228x6be2dc6);
                        jSONObject3.put("height", tRTCRemoteStatistics.f57217xb7389127);
                        jSONObject3.put("frameRate", tRTCRemoteStatistics.f57216x207cebed);
                        jSONObject3.put("videoBitrate", tRTCRemoteStatistics.f57224xf1220e72);
                        jSONObject3.put("audioSampleRate", tRTCRemoteStatistics.f57213xa80e7620);
                        jSONObject3.put("audioBitrate", tRTCRemoteStatistics.f57210x9b599ab7);
                        jSONObject3.put("streamType", tRTCRemoteStatistics.f57222xb8c992da);
                        jSONArray2.put(jSONObject3);
                    }
                }
                jSONObject.put("remoteStatistics", jSONArray2);
                str = jSONObject.toString();
            } else {
                str = null;
            }
            bundle.putString("DUMP_STATISTIC", str);
            kn0.i iVar = w0Var.C;
            bundle.putLong("NET_STATUS_LIVE_ID", (iVar == null || (gVar2 = iVar.f391091b) == null) ? 0L : gVar2.f391068b);
            bundle.putInt("NET_STATUS_ROLE", 0);
            bundle.putInt("NET_STATUS_MODE", 0);
            bundle.putLong("NET_STATUS_TIMESTAMP", java.lang.System.currentTimeMillis());
            kn0.i iVar2 = w0Var.C;
            bundle.putLong("NET_STATUS_START_TIME", (iVar2 == null || (gVar = iVar2.f391091b) == null) ? 0L : gVar.f391079m);
            if (c26789x7211d670 == null || (str2 = java.lang.Integer.valueOf(c26789x7211d670.f57193xabe44fc7).toString()) == null) {
                str2 = "";
            }
            bundle.putString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46320xa2c7de7f, str2);
            bundle.putInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46336xe22331f7, (c26789x7211d670 == null || (arrayList6 = c26789x7211d670.f57196x4c0d8dae) == null || (tRTCLocalStatistics6 = (com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics) kz5.n0.Z(arrayList6)) == null) ? 0 : tRTCLocalStatistics6.f57209x6be2dc6);
            bundle.putInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46332x487412f6, (c26789x7211d670 == null || (arrayList5 = c26789x7211d670.f57196x4c0d8dae) == null || (tRTCLocalStatistics5 = (com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics) kz5.n0.Z(arrayList5)) == null) ? 0 : tRTCLocalStatistics5.f57206xb7389127);
            bundle.putInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46325x901c335e, (c26789x7211d670 == null || (arrayList4 = c26789x7211d670.f57196x4c0d8dae) == null || (tRTCLocalStatistics4 = (com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics) kz5.n0.Z(arrayList4)) == null) ? 0 : tRTCLocalStatistics4.f57208xf1220e72);
            bundle.putInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46312x2cd62fb9, (c26789x7211d670 == null || (arrayList3 = c26789x7211d670.f57196x4c0d8dae) == null || (tRTCLocalStatistics3 = (com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics) kz5.n0.Z(arrayList3)) == null) ? 0 : tRTCLocalStatistics3.f57202x9b599ab7);
            bundle.putInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46330x1cbced5a, (c26789x7211d670 == null || (arrayList2 = c26789x7211d670.f57196x4c0d8dae) == null || (tRTCLocalStatistics2 = (com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics) kz5.n0.Z(arrayList2)) == null) ? 0 : tRTCLocalStatistics2.f57205x207cebed);
            bundle.putInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46322x5607fd5a, ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37745x9208c81b(2));
            bundle.putInt("NET_STATUS_AUDIO_STATE", (c26789x7211d670 == null || (arrayList = c26789x7211d670.f57196x4c0d8dae) == null || (tRTCLocalStatistics = (com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics) kz5.n0.Z(arrayList)) == null) ? 0 : tRTCLocalStatistics.f57203x75f87e1);
            bundle.putInt("NET_STATUS_RTT", c26789x7211d670 != null ? c26789x7211d670.rtt : 0);
            bundle.putInt("NET_STATUS_UP_LOSS", c26789x7211d670 != null ? c26789x7211d670.f57201xcdf5845e : 0);
            bundle.putInt("NET_STATUS_DOWN_LOSS", c26789x7211d670 != null ? c26789x7211d670.f57194x550c3ee5 : 0);
            bundle.putLong("NET_STATUS_SEND_BYTES", c26789x7211d670 != null ? c26789x7211d670.f57199x175c3 : 0L);
            bundle.putLong("NET_STATUS_RECEIVE_BYTES", c26789x7211d670 != null ? c26789x7211d670.f57197xd06bb348 : 0L);
            bundle.putInt("NET_STATUS_NET_TYPE", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            bundle.putInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46323x28b0e3f9, w0Var.R);
            hn0.i iVar3 = w0Var.A;
            if (iVar3 != null) {
                iVar3.mo57125xf5bc2045(12, bundle);
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onSwitchRole */
    public void mo105606xb2695109(int i17, java.lang.String str) {
        super.mo105606xb2695109(i17, str);
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "onSwitchRole, errCode:" + i17 + ", errCode:" + str);
            tn0.x0 x0Var = w0Var.f502296l1;
            if (x0Var != null) {
                vn0.e eVar = w0Var.f502297m;
                x0Var.q1(eVar != null ? eVar.f519718c : 0, i17, str);
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onTryToReconnect */
    public void mo105608xd9f68220() {
        if (((vn0.f) this.f519715a.get()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveCore", "onTryToReconnect");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onUserAudioAvailable */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo105611xf752687d(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn0.d.mo105611xf752687d(java.lang.String, boolean):void");
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onUserSubStreamAvailable */
    public void mo105614xd84b60b3(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCCloudListenerImpl", "onUserSubStreamAvailable: userId = " + str + " available = " + z17);
        if (((vn0.f) this.f519715a.get()) != null) {
            java.lang.String debugText = "onUserSubStreamAvailable:" + str + ", available:" + z17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugText, "debugText");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", debugText);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onUserVideoAvailable */
    public void mo105615xfcccd978(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCCloudListenerImpl", "onUserVideoAvailable: userId = " + str + " available = " + z17);
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            if (z17) {
                zn0.a0 U = w0Var.U();
                U.getClass();
                if (!((str == null || str.isEmpty()) ? false : ((java.util.concurrent.ConcurrentHashMap.KeySetView) U.F).contains(str))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveCore", "onUserVideoAvailable but not in room，userId:" + str);
                    return;
                }
            }
            fn0.g gVar = fn0.g.f345728a;
            if (fn0.g.f345729b != null) {
                fj2.s sVar = fj2.s.f344716a;
                java.lang.String str2 = str == null ? "" : str;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", z17 ? 5 : 6);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                sVar.f(6, str2, r26.i0.t(jSONObject2, ",", ";", false));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserVideoAvailable uid:");
            sb6.append(str);
            sb6.append(" available:");
            sb6.append(z17);
            sb6.append(", isAnchor:");
            boolean z18 = w0Var.f502290d;
            sb6.append(z18);
            java.lang.String debugText = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugText, "debugText");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", debugText);
            if (!z17 || android.text.TextUtils.isEmpty(str)) {
                zn0.a0 U2 = w0Var.U();
                U2.getClass();
                zn0.v d17 = zn0.x.f555947a.d(str);
                if (d17 != null) {
                    d17.f555941f = false;
                }
                if (gVar.f()) {
                    if (U2.f555832c) {
                        U2.r(str);
                    } else if (!str.equals(U2.f555835f)) {
                        U2.f555831b.mo30411xb8f95dad(str);
                    }
                    U2.q(str, 0);
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("live_user_id", str);
                hn0.i iVar = w0Var.A;
                if (iVar != null) {
                    iVar.mo57125xf5bc2045(5, bundle);
                }
            } else {
                zn0.a0 U3 = w0Var.U();
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = w0Var.f502307u;
                U3.n(str, 0, c10849x610a91e1 != null ? c10849x610a91e1.c(str, 0) : null);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("live_user_id", str);
                hn0.i iVar2 = w0Var.A;
                if (iVar2 != null) {
                    iVar2.mo57125xf5bc2045(0, bundle2);
                }
            }
            if (!z18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(w0Var.D.f391119f, str);
            }
            if (z18) {
                boolean z19 = z17 || gVar.f();
                int i17 = w0Var.U;
                if (i17 == 0) {
                    w0Var.U().s();
                    return;
                }
                if (i17 == 1 && z19) {
                    w0Var.M0(false);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveCore", "invalid live scene: " + w0Var.U);
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onUserVoiceVolume */
    public void mo105617x1e54d642(java.util.ArrayList arrayList, int i17) {
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            fVar.q(arrayList, i17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onWarning */
    public void mo105618x92abb0bd(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCCloudListenerImpl", "onWarning: %d, warningMsg: %s", java.lang.Integer.valueOf(i17), str);
        vn0.f fVar = (vn0.f) this.f519715a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            if (i17 == 1104) {
                if (bundle != null) {
                    bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760);
                }
                int i18 = bundle != null ? bundle.getInt("type") : 0;
                boolean z17 = i18 == 1;
                java.lang.String debugText = "TRTC codec change! type:[1104], enctype:" + i18 + ", msg:" + str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugText, "debugText");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreError", debugText);
                if (w0Var.f502290d) {
                    vn0.c cVar = vn0.b.f519707a;
                    boolean z18 = cVar.d().f536977t;
                    boolean z19 = cVar.d().f536978u;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "TRTC codec change! hevcenable:" + z18 + ", force265Mixing:" + z19);
                    jz5.g gVar = ko0.p0.f391429a;
                    java.lang.String id6 = java.lang.String.valueOf(w0Var.hashCode());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
                    ko0.t tVar = ko0.t.f391436a;
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    if (!z18 || z17 == z18) {
                        return;
                    }
                    cVar.d().f536977t = z17;
                    w0Var.Q0();
                    if (z19) {
                        w0Var.U().s();
                    }
                }
            }
        }
    }
}
