package com.tencent.mm.app.plugin.exdevice;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f53658a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$OpFromExDeviceEventListener f53659b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$ExDeviceChattingUIStateEventListener f53660c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f53661d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f53662e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f53663f = true;

    /* JADX WARN: Type inference failed for: r1v6, types: [com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$ExDeviceChattingUIStateEventListener] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$OpFromExDeviceEventListener] */
    public b(yb5.d dVar) {
        this.f53658a = dVar;
        if (this.f53659b == null) {
            this.f53659b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OpFromExDeviceEvent>() { // from class: com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$OpFromExDeviceEventListener
                {
                    super(com.tencent.mm.app.a0.f53288d);
                    this.__eventId = 1739921302;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.OpFromExDeviceEvent opFromExDeviceEvent) {
                    java.util.Map map;
                    com.tencent.mm.autogen.events.OpFromExDeviceEvent opFromExDeviceEvent2 = opFromExDeviceEvent;
                    yb5.d dVar2 = com.tencent.mm.app.plugin.exdevice.b.this.f53658a;
                    if (dVar2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context == null");
                    } else {
                        dVar2.b0();
                        if (com.tencent.mm.app.plugin.exdevice.b.this.f53658a.f460717l.isFinishing()) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context isFinishing");
                        } else {
                            am.in inVar = opFromExDeviceEvent2.f54589g;
                            int i17 = inVar.f6962a;
                            java.lang.String str = inVar.f6964c;
                            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "opcode is %d, brand name is %s", java.lang.Integer.valueOf(i17), str);
                            if (!com.tencent.mm.app.plugin.exdevice.b.this.f53658a.x().equals(str)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "not current brandname");
                            } else if (i17 == 1) {
                                com.tencent.mm.app.plugin.exdevice.b bVar = com.tencent.mm.app.plugin.exdevice.b.this;
                                int i18 = opFromExDeviceEvent2.f54589g.f6966e;
                                bVar.getClass();
                                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "handleConnectFailedReason, reason : %d, brand name : %s", java.lang.Integer.valueOf(i18), str);
                                qk.o b17 = r01.z.b(str);
                                if (!com.tencent.mm.app.plugin.exdevice.b.a(b17)) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "It's not a biz, brandName(%s).", str);
                                } else if (b17.D0(false).e().f364100b == 1) {
                                    bVar.f53658a.f460717l.setMMSubTitle((java.lang.String) null);
                                }
                            } else if (i17 == 2) {
                                com.tencent.mm.app.plugin.exdevice.b bVar2 = com.tencent.mm.app.plugin.exdevice.b.this;
                                am.in inVar2 = opFromExDeviceEvent2.f54589g;
                                int i19 = inVar2.f6965d;
                                java.lang.String str2 = inVar2.f6963b;
                                synchronized (bVar2) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now connect state : %d", java.lang.Integer.valueOf(i19));
                                    if (bVar2.f53658a != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                        qk.o b18 = r01.z.b(str);
                                        if (com.tencent.mm.app.plugin.exdevice.b.a(b18)) {
                                            if (bVar2.f53662e == null) {
                                                bVar2.f53662e = new java.util.HashMap();
                                            }
                                            java.util.Map map2 = bVar2.f53662e;
                                            if (!str.equals(bVar2.f53661d)) {
                                                bVar2.f53661d = str;
                                                ((java.util.HashMap) map2).clear();
                                            }
                                            if (b18.D0(false).e().f364100b == 1) {
                                                bVar2.f53658a.f460717l.setMMSubTitle((java.lang.String) null);
                                            } else if (i19 == -1) {
                                                bVar2.f53658a.f460717l.setMMSubTitle((java.lang.String) null);
                                            } else if (i19 != 0) {
                                                if (i19 != 1) {
                                                    if (i19 == 2) {
                                                        java.util.HashMap hashMap = (java.util.HashMap) map2;
                                                        hashMap.put(str2, java.lang.Boolean.TRUE);
                                                        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = bVar2.f53658a.f460717l;
                                                        baseChattingUIFragment.setMMSubTitle(baseChattingUIFragment.getString(com.tencent.mm.R.string.c3b, java.lang.Integer.valueOf(hashMap.size())));
                                                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now connected(deviceId : %s), set the tips gone", str2);
                                                    } else if (i19 == 4) {
                                                        java.util.HashMap hashMap2 = (java.util.HashMap) map2;
                                                        if (hashMap2.remove(str2) != null) {
                                                            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "disconnected(deviceId : %s) successfully.", str2);
                                                        }
                                                        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment2 = bVar2.f53658a.f460717l;
                                                        baseChattingUIFragment2.setMMSubTitle(baseChattingUIFragment2.getString(com.tencent.mm.R.string.c3b, java.lang.Integer.valueOf(hashMap2.size())));
                                                    }
                                                } else if (((java.util.HashMap) map2).size() == 0) {
                                                    bVar2.f53658a.f460717l.setMMSubTitle(com.tencent.mm.R.string.c3c);
                                                }
                                            } else if (((java.util.HashMap) map2).size() == 0) {
                                                bVar2.f53658a.f460717l.setMMSubTitle(com.tencent.mm.R.string.c3d);
                                            }
                                        } else {
                                            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "It's not a biz, brandName(%s).", str);
                                        }
                                    }
                                    com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context is null or brandName is null or nil.");
                                }
                            } else if (i17 == 3 && (map = com.tencent.mm.app.plugin.exdevice.b.this.f53662e) != null) {
                                ((java.util.HashMap) map).clear();
                                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "clear connected device ids successfully.");
                            }
                        }
                    }
                    return false;
                }
            };
        }
        alive();
        if (this.f53660c == null) {
            this.f53660c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceChattingUIStateEvent>() { // from class: com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$ExDeviceChattingUIStateEventListener
                {
                    super(com.tencent.mm.app.a0.f53288d);
                    this.__eventId = -1946755012;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.ExDeviceChattingUIStateEvent exDeviceChattingUIStateEvent) {
                    exDeviceChattingUIStateEvent.f54116g.f6335a = com.tencent.mm.app.plugin.exdevice.b.this.f53663f;
                    return true;
                }
            };
        }
        alive();
    }

    public static boolean a(qk.o oVar) {
        qk.n D0;
        return (oVar == null || (D0 = oVar.D0(false)) == null || D0.e() == null || !D0.e().a()) ? false : true;
    }

    public void b(int i17, qk.o oVar) {
        yb5.d dVar = this.f53658a;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "notifySwitchView, context is null, maybe has been released");
            return;
        }
        java.lang.String x17 = dVar.x();
        if (c01.e2.G(x17) && a(oVar)) {
            gm0.j1.e().j(new com.tencent.mm.app.plugin.exdevice.a(this, i17, x17));
        }
    }
}
