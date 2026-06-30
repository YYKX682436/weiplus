package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes15.dex */
public class z0 implements com.tencent.mm.modelbase.u0 {
    public final java.util.HashMap A;
    public final java.util.HashMap B;
    public com.tencent.mm.plugin.exdevice.model.b2 C;
    public com.tencent.mm.plugin.exdevice.model.b2 D;
    public com.tencent.mm.plugin.exdevice.model.b2 E;
    public com.tencent.mm.plugin.exdevice.model.b2 F;
    public final com.tencent.mm.plugin.exdevice.model.k G;
    public final java.lang.Runnable H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public r45.rf4 f99117J;
    public java.lang.String K;
    public java.lang.String L;
    public int M;
    public final dn.k N;
    public final java.util.HashMap P;

    /* renamed from: h, reason: collision with root package name */
    public long f99122h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f99123i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f99124m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f99125n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f99126o;

    /* renamed from: s, reason: collision with root package name */
    public r45.rf4 f99130s;

    /* renamed from: u, reason: collision with root package name */
    public long f99132u;

    /* renamed from: v, reason: collision with root package name */
    public long f99133v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f99134w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f99135x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f99136y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f99137z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f99118d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99119e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f99120f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99121g = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f99127p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f99128q = false;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f99129r = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f99131t = "";

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b3, code lost:
    
        r2.f382225e = r8.field_productType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x007c, code lost:
    
        if (r6.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007e, code lost:
    
        r8 = new v32.f();
        r8.convertFrom(r6);
        r1 = new r45.pf4();
        r1.f383003d = r8.field_deviceType;
        r1.f383004e = r8.field_deviceId;
        r1.f383006g = r8.field_iconUrl;
        r1.f383005f = r8.field_nickName;
        r1.f383007h = a42.i.i(r8.field_supportMsgTypeList);
        r2 = r1.f383008i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a5, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a7, code lost:
    
        r2 = new r45.of4();
        r2.f382225e = r8.field_productType;
        r1.f383008i = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b7, code lost:
    
        r7.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00be, code lost:
    
        if (r6.moveToNext() != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z0(long r6, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.model.z0.<init>(long, java.lang.String):void");
    }

    public static void a(com.tencent.mm.plugin.exdevice.model.z0 z0Var, java.util.List list) {
        z0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("deviceType", ((v32.b) list.get(i17)).field_deviceType);
            hashMap.put("deviceID", ((v32.b) list.get(i17)).field_deviceID);
            hashMap.put("displayName", com.tencent.mm.plugin.exdevice.model.p.c((v32.b) list.get(i17)));
            hashMap.put("iconUrl", ((v32.b) list.get(i17)).f237107z);
            hashMap.put("ability", ((v32.b) list.get(i17)).H);
            hashMap.put("abilityInf", ((v32.b) list.get(i17)).I);
            arrayList.add(hashMap);
        }
        com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent exDeviceScanNetworkDeviceResultEvent = new com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent();
        exDeviceScanNetworkDeviceResultEvent.f54158g.f7872a = arrayList;
        exDeviceScanNetworkDeviceResultEvent.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        if (r2 != 49) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(r45.rf4 r21, long r22, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.model.z0.b(r45.rf4, long, java.lang.String):boolean");
    }

    public final r45.jj4 c(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, java.lang.String str) {
        java.util.Iterator it = timeLineObject.ContentObj.f369840h.iterator();
        while (it.hasNext()) {
            r45.jj4 jj4Var = (r45.jj4) it.next();
            if (jj4Var.f377855d.equals(this.f99126o)) {
                return jj4Var;
            }
        }
        return null;
    }

    public final java.lang.String d(long j17, java.lang.String str) {
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (Li.getMsgId() == 0) {
            return "";
        }
        int type = Li.getType();
        java.lang.String j18 = Li.j();
        if (!Li.k2()) {
            if (type != 3) {
                if (type == 62) {
                    return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f22571s, Li.z0(), false);
                }
                if (type != 48) {
                    return "";
                }
                this.f99119e = true;
                return "";
            }
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(Li);
            if (S1 == null) {
                return "";
            }
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            java.lang.String o27 = m11.b1.Di().o2(Li, bm5.c0.f22550a.d(S1.l()), S1.f322637e);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(o27)) {
                return o27;
            }
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            return m11.b1.Di().o2(Li, bm5.f0.f22564i, S1.f322639g);
        }
        ot0.q v17 = ot0.q.v(j18);
        if (v17 != null) {
            if (((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f348666i)) || v17.f348666i == 2) {
                com.tencent.mm.pluginsdk.model.app.d D0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(v17.f348694p);
                if (D0 != null) {
                    return D0.field_fileFullPath;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "getFilePath attInfo is null");
                return "";
            }
        }
        if (v17 == null) {
            return "";
        }
        int i17 = v17.f348666i;
        if (i17 != 3 && i17 != 5) {
            return "";
        }
        this.f99119e = true;
        return "";
    }

    public java.util.List e(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f99122h = j17;
        this.f99123i = str4;
        this.f99124m = str;
        this.f99125n = str2;
        this.f99126o = str3;
        java.util.List list = this.f99135x;
        int size = ((java.util.ArrayList) list).size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("deviceType", ((v32.b) ((java.util.ArrayList) list).get(i17)).field_deviceType);
            hashMap.put("deviceID", ((v32.b) ((java.util.ArrayList) list).get(i17)).field_deviceID);
            hashMap.put("displayName", com.tencent.mm.plugin.exdevice.model.p.c((v32.b) ((java.util.ArrayList) list).get(i17)));
            hashMap.put("iconUrl", ((v32.b) ((java.util.ArrayList) list).get(i17)).f237107z);
            hashMap.put("ability", ((v32.b) ((java.util.ArrayList) list).get(i17)).H);
            hashMap.put("abilityInf", ((v32.b) ((java.util.ArrayList) list).get(i17)).I);
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject f() {
        com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent getSnsTimeLineObjectEvent = new com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent();
        getSnsTimeLineObjectEvent.f54414g.f7619a = this.f99124m;
        getSnsTimeLineObjectEvent.e();
        return getSnsTimeLineObjectEvent.f54415h.f7711a;
    }

    public void g(android.graphics.Bitmap bitmap, java.lang.String str) {
        java.io.OutputStream outputStream = null;
        try {
            try {
                outputStream = com.tencent.mm.vfs.w6.K(str, false);
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, outputStream);
                outputStream.flush();
                try {
                    outputStream.close();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e17, "", new java.lang.Object[0]);
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "Exception in saveImageToFile !");
                com.tencent.mm.plugin.exdevice.model.p.l(this.L, "send_data_failed");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e18, "", new java.lang.Object[0]);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e19, "", new java.lang.Object[0]);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.io.IOException e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e27, "", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }

    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "startScanWCLanDevice...");
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.startScanWCLanDeviceV2(new byte[0], 1000);
        this.f99118d = false;
        new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.exdevice.model.x0(this), false).c(3000L, 3000L);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "scene is null.");
            return;
        }
        if (m1Var instanceof com.tencent.mm.plugin.exdevice.model.g2) {
            com.tencent.mm.plugin.exdevice.model.g2 g2Var = (com.tencent.mm.plugin.exdevice.model.g2) m1Var;
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "NetSceneGetAppMsgInfo onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                com.tencent.mm.plugin.exdevice.model.p.l(g2Var.f98910f, "send_data_failed");
                return;
            }
            com.tencent.mm.modelbase.o oVar = g2Var.f98909e;
            java.lang.String str2 = ((oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.xo6) fVar).f390297d;
            int i19 = g2Var.f98911g;
            java.lang.String str3 = g2Var.f98910f;
            if (1 == i19) {
                com.tencent.mm.plugin.exdevice.model.p.l(str3, "send_data_sucess");
                return;
            }
            java.lang.String str4 = (java.lang.String) this.f99137z.get(str3);
            com.tencent.mm.plugin.exdevice.model.p.l(str3, "send_data_sending");
            java.lang.String d17 = (!this.f99120f || this.f99124m == null) ? d(this.f99122h, this.f99123i) : this.f99125n;
            if (str4 == null || str4.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "mDeviceInfo error");
                com.tencent.mm.plugin.exdevice.model.p.l(str3, "send_data_failed");
                return;
            }
            if (!this.f99118d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "onItemClick stop scan...");
                com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.stopScanWCLanDeviceV2();
                this.f99118d = true;
            }
            java.util.HashMap hashMap = this.B;
            if (!hashMap.containsKey(str3) || !((java.lang.Boolean) hashMap.get(str3)).booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "connectWCLanDevice mDeviceInfo: ".concat(str4));
                if (com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.connectWCLanDeviceV2(str4.getBytes(), true) != 0) {
                    com.tencent.mm.plugin.exdevice.model.p.l(str3, "send_data_failed");
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "connectWCLanDevice error!");
                }
            }
            boolean z17 = this.f99119e;
            java.util.HashMap hashMap2 = this.A;
            java.util.HashMap hashMap3 = this.P;
            if (z17) {
                int useWCLanDeviceServiceV2 = com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.useWCLanDeviceServiceV2(str4.getBytes(), str2.getBytes());
                if (useWCLanDeviceServiceV2 == 0) {
                    com.tencent.mm.plugin.exdevice.model.p.l(str3, "send_data_failed");
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "useWCLanDeviceService error!");
                    return;
                }
                hashMap3.put(java.lang.Integer.valueOf(useWCLanDeviceServiceV2), str3);
                hashMap2.put(str3, java.lang.Integer.valueOf(useWCLanDeviceServiceV2));
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get useWCLanDeviceService mCallBackCmdId: " + useWCLanDeviceServiceV2);
                return;
            }
            if (d17 == null || d17.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "file path is error");
                com.tencent.mm.plugin.exdevice.model.p.l(str3, "send_data_failed");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "sendDataToNearFieldDevice %s", d17);
            int sendFileToWCLanDeviceV2 = com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.sendFileToWCLanDeviceV2(str4.getBytes(), str2.getBytes(), kk.w.a(d17, false).getBytes());
            if (sendFileToWCLanDeviceV2 != 0) {
                hashMap3.put(java.lang.Integer.valueOf(sendFileToWCLanDeviceV2), str3);
                hashMap2.put(str3, java.lang.Integer.valueOf(sendFileToWCLanDeviceV2));
            } else {
                com.tencent.mm.plugin.exdevice.model.p.l(str3, "send_data_failed");
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "sendFileToWCLanDevice error!");
            }
        }
    }
}
