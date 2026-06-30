package com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f135191a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.C5085x70cac3f1 f135192b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.C5084x29fe5b69 f135193c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f135194d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f135195e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f135196f = true;

    /* JADX WARN: Type inference failed for: r1v6, types: [com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$ExDeviceChattingUIStateEventListener] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$OpFromExDeviceEventListener] */
    public b(yb5.d dVar) {
        this.f135191a = dVar;
        if (this.f135192b == null) {
            this.f135192b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5815x4fc5ba6>() { // from class: com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$OpFromExDeviceEventListener
                {
                    super(com.p314xaae8f345.mm.app.a0.f134821d);
                    this.f39173x3fe91575 = 1739921302;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5815x4fc5ba6 c5815x4fc5ba6) {
                    java.util.Map map;
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5815x4fc5ba6 c5815x4fc5ba62 = c5815x4fc5ba6;
                    yb5.d dVar2 = com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.this.f135191a;
                    if (dVar2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context == null");
                    } else {
                        dVar2.b0();
                        if (com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.this.f135191a.f542250l.m78397x697ca065()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context isFinishing");
                        } else {
                            am.in inVar = c5815x4fc5ba62.f136122g;
                            int i17 = inVar.f88495a;
                            java.lang.String str = inVar.f88497c;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "opcode is %d, brand name is %s", java.lang.Integer.valueOf(i17), str);
                            if (!com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.this.f135191a.x().equals(str)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "not current brandname");
                            } else if (i17 == 1) {
                                com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b bVar = com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.this;
                                int i18 = c5815x4fc5ba62.f136122g.f88499e;
                                bVar.getClass();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "handleConnectFailedReason, reason : %d, brand name : %s", java.lang.Integer.valueOf(i18), str);
                                qk.o b17 = r01.z.b(str);
                                if (!com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.a(b17)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "It's not a biz, brandName(%s).", str);
                                } else if (b17.D0(false).e().f445633b == 1) {
                                    bVar.f135191a.f542250l.mo78691x3f86539a((java.lang.String) null);
                                }
                            } else if (i17 == 2) {
                                com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b bVar2 = com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.this;
                                am.in inVar2 = c5815x4fc5ba62.f136122g;
                                int i19 = inVar2.f88498d;
                                java.lang.String str2 = inVar2.f88496b;
                                synchronized (bVar2) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now connect state : %d", java.lang.Integer.valueOf(i19));
                                    if (bVar2.f135191a != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                        qk.o b18 = r01.z.b(str);
                                        if (com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.a(b18)) {
                                            if (bVar2.f135195e == null) {
                                                bVar2.f135195e = new java.util.HashMap();
                                            }
                                            java.util.Map map2 = bVar2.f135195e;
                                            if (!str.equals(bVar2.f135194d)) {
                                                bVar2.f135194d = str;
                                                ((java.util.HashMap) map2).clear();
                                            }
                                            if (b18.D0(false).e().f445633b == 1) {
                                                bVar2.f135191a.f542250l.mo78691x3f86539a((java.lang.String) null);
                                            } else if (i19 == -1) {
                                                bVar2.f135191a.f542250l.mo78691x3f86539a((java.lang.String) null);
                                            } else if (i19 != 0) {
                                                if (i19 != 1) {
                                                    if (i19 == 2) {
                                                        java.util.HashMap hashMap = (java.util.HashMap) map2;
                                                        hashMap.put(str2, java.lang.Boolean.TRUE);
                                                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = bVar2.f135191a.f542250l;
                                                        abstractC21611x7536149b.mo78691x3f86539a(abstractC21611x7536149b.m7468x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.c3b, java.lang.Integer.valueOf(hashMap.size())));
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now connected(deviceId : %s), set the tips gone", str2);
                                                    } else if (i19 == 4) {
                                                        java.util.HashMap hashMap2 = (java.util.HashMap) map2;
                                                        if (hashMap2.remove(str2) != null) {
                                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "disconnected(deviceId : %s) successfully.", str2);
                                                        }
                                                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b2 = bVar2.f135191a.f542250l;
                                                        abstractC21611x7536149b2.mo78691x3f86539a(abstractC21611x7536149b2.m7468x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.c3b, java.lang.Integer.valueOf(hashMap2.size())));
                                                    }
                                                } else if (((java.util.HashMap) map2).size() == 0) {
                                                    bVar2.f135191a.f542250l.mo78690x3f86539a(com.p314xaae8f345.mm.R.C30867xcad56011.c3c);
                                                }
                                            } else if (((java.util.HashMap) map2).size() == 0) {
                                                bVar2.f135191a.f542250l.mo78690x3f86539a(com.p314xaae8f345.mm.R.C30867xcad56011.c3d);
                                            }
                                        } else {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "It's not a biz, brandName(%s).", str);
                                        }
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context is null or brandName is null or nil.");
                                }
                            } else if (i17 == 3 && (map = com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.this.f135195e) != null) {
                                ((java.util.HashMap) map).clear();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "clear connected device ids successfully.");
                            }
                        }
                    }
                    return false;
                }
            };
        }
        mo48813x58998cd();
        if (this.f135193c == null) {
            this.f135193c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5334xb5332e2c>() { // from class: com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$ExDeviceChattingUIStateEventListener
                {
                    super(com.p314xaae8f345.mm.app.a0.f134821d);
                    this.f39173x3fe91575 = -1946755012;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5334xb5332e2c c5334xb5332e2c) {
                    c5334xb5332e2c.f135649g.f87868a = com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.this.f135196f;
                    return true;
                }
            };
        }
        mo48813x58998cd();
    }

    public static boolean a(qk.o oVar) {
        qk.n D0;
        return (oVar == null || (D0 = oVar.D0(false)) == null || D0.e() == null || !D0.e().a()) ? false : true;
    }

    public void b(int i17, qk.o oVar) {
        yb5.d dVar = this.f135191a;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "notifySwitchView, context is null, maybe has been released");
            return;
        }
        java.lang.String x17 = dVar.x();
        if (c01.e2.G(x17) && a(oVar)) {
            gm0.j1.e().j(new com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.a(this, i17, x17));
        }
    }
}
