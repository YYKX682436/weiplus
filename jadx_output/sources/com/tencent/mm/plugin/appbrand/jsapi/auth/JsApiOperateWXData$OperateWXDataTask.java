package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiOperateWXData$OperateWXDataTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask implements im5.a {
    public java.lang.String A;
    public int B;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public int G;
    public java.util.Map H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f79375J;
    public java.lang.String K;
    public boolean L;
    public java.lang.String M;
    public com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo N;
    public java.lang.String Q;
    public int R;
    public boolean S;
    public int T;
    public int U;
    public th1.c V;
    public boolean W;
    public transient int Y;
    public transient long Z;

    /* renamed from: f, reason: collision with root package name */
    public transient com.tencent.mm.plugin.appbrand.jsapi.auth.n0 f79376f;

    /* renamed from: g, reason: collision with root package name */
    public transient com.tencent.mm.plugin.appbrand.y f79377g;

    /* renamed from: h, reason: collision with root package name */
    public transient com.tencent.mm.plugin.appbrand.jsapi.auth.o f79378h;

    /* renamed from: i, reason: collision with root package name */
    public int f79379i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f79381m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f79382n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f79383o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f79384p;

    /* renamed from: p0, reason: collision with root package name */
    public transient long f79385p0;

    /* renamed from: q, reason: collision with root package name */
    public int f79387q;

    /* renamed from: r, reason: collision with root package name */
    public int f79388r;

    /* renamed from: s, reason: collision with root package name */
    public int f79389s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f79390t;

    /* renamed from: x0, reason: collision with root package name */
    public long f79395x0;

    /* renamed from: x1, reason: collision with root package name */
    public r45.xw f79396x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f79397y;

    /* renamed from: y0, reason: collision with root package name */
    public long f79398y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.util.Map f79399y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f79400z;

    /* renamed from: z1, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f79374z1 = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.AppBrand.JsApiOperateWXData");
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.auth.h3();

    /* renamed from: u, reason: collision with root package name */
    public int f79391u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f79392v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f79393w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f79394x = "";
    public com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo P = com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo.f79479f;
    public boolean X = false;

    /* renamed from: l1, reason: collision with root package name */
    public long f79380l1 = -1;

    /* renamed from: p1, reason: collision with root package name */
    public long f79386p1 = -1;

    public JsApiOperateWXData$OperateWXDataTask() {
    }

    public void B(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, int i27, com.tencent.mm.plugin.appbrand.jsapi.auth.j3 j3Var, th1.c cVar, boolean z17, boolean z18) {
        th1.g gVar = new th1.g(i17, str, str2, str3, str4, i18, i27, i19, this.T, cVar, this.f79392v, this.f79391u, z17, z18, new com.tencent.mm.plugin.appbrand.jsapi.auth.i3(this, str3, j3Var));
        int i28 = this.U;
        r45.m24 m24Var = (r45.m24) gVar.f419320d.f70710a.f70684a;
        if (m24Var.f380094i == null) {
            m24Var.f380094i = new r45.nd7();
        }
        m24Var.f380094i.f381297f = i28;
        gm0.j1.d().g(gVar);
    }

    @Override // im5.a
    public void dead() {
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        th1.c cVar;
        r45.xw xwVar;
        this.f79397y = parcel.readString();
        this.f79400z = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.f79382n = parcel.readString();
        this.f79383o = parcel.readString();
        this.f79384p = parcel.readString();
        this.f79379i = parcel.readInt();
        this.f79381m = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readInt();
        this.H = parcel.readHashMap(java.util.HashMap.class.getClassLoader());
        this.f79387q = parcel.readInt();
        this.f79388r = parcel.readInt();
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.f79393w = parcel.readString();
        this.f79394x = parcel.readString();
        this.K = parcel.readString();
        this.f79375J = parcel.readString();
        this.I = parcel.readString();
        this.N = (com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo.class.getClassLoader());
        this.R = parcel.readInt();
        this.S = parcel.readInt() == 1;
        this.f79389s = parcel.readInt();
        this.f79391u = parcel.readInt();
        this.f79392v = parcel.readString();
        this.L = parcel.readInt() == 1;
        this.M = parcel.readString();
        this.Q = parcel.readString();
        this.C = parcel.readInt();
        this.f79395x0 = parcel.readLong();
        this.f79398y0 = parcel.readLong();
        this.f79380l1 = parcel.readLong();
        this.f79386p1 = parcel.readLong();
        this.X = parcel.readInt() == 1;
        this.P = (com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo.class.getClassLoader());
        this.f79390t = parcel.readInt() == 1;
        this.W = parcel.readInt() == 1;
        th1.c.f419309g.getClass();
        if (parcel.dataAvail() > 0) {
            int readInt = parcel.readInt();
            java.util.Iterator it = ((kz5.h) th1.c.f419313n).iterator();
            while (it.hasNext()) {
                cVar = (th1.c) it.next();
                if (cVar.ordinal() == readInt) {
                    break;
                }
            }
        }
        cVar = th1.c.f419310h;
        this.V = cVar;
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            xwVar = null;
        } else {
            try {
                xwVar = (r45.xw) new r45.xw().parseFrom(createByteArray);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "parse cgiProfile IOException %s", e17.getMessage());
                xwVar = new r45.xw();
            }
        }
        this.f79396x1 = xwVar;
        this.f79399y1 = parcel.readHashMap(java.util.HashMap.class.getClassLoader());
        if (parcel.dataAvail() > 0) {
            this.A = parcel.readString();
            this.B = parcel.readInt();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f79397y);
        parcel.writeString(this.f79400z);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.f79382n);
        parcel.writeString(this.f79383o);
        parcel.writeString(this.f79384p);
        parcel.writeInt(this.f79379i);
        parcel.writeString(this.f79381m);
        parcel.writeString(this.F);
        parcel.writeInt(this.G);
        parcel.writeMap(this.H);
        parcel.writeInt(this.f79387q);
        parcel.writeInt(this.f79388r);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeString(this.f79393w);
        parcel.writeString(this.f79394x);
        parcel.writeString(this.K);
        parcel.writeString(this.f79375J);
        parcel.writeString(this.I);
        parcel.writeParcelable(this.N, i17);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S ? 1 : 0);
        parcel.writeInt(this.f79389s);
        parcel.writeInt(this.f79391u);
        parcel.writeString(this.f79392v);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeString(this.M);
        parcel.writeString(this.Q);
        parcel.writeInt(this.C);
        parcel.writeLong(this.f79395x0);
        parcel.writeLong(this.f79398y0);
        parcel.writeLong(this.f79380l1);
        parcel.writeLong(this.f79386p1);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeParcelable(this.P, i17);
        parcel.writeInt(this.f79390t ? 1 : 0);
        parcel.writeInt(this.W ? 1 : 0);
        th1.c cVar = this.V;
        th1.c.f419309g.getClass();
        kotlin.jvm.internal.o.g(cVar, "<this>");
        parcel.writeInt(cVar.ordinal());
        r45.xw xwVar = this.f79396x1;
        if (xwVar == null) {
            parcel.writeByteArray(null);
        } else {
            try {
                parcel.writeByteArray(xwVar.toByteArray());
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "write cgiProfile IOException %s", e17.getMessage());
            }
        }
        parcel.writeMap(this.f79399y1);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        if (!this.f79377g.isRunning()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.x2) this.f79378h).a();
            return;
        }
        if (!this.f79400z.equals("ok")) {
            if (this.f79400z.contains("fail")) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("err_code", java.lang.String.valueOf(this.C));
                this.f79377g.a(this.f79379i, this.f79376f.p(this.f79400z, hashMap));
                ((com.tencent.mm.plugin.appbrand.jsapi.auth.x2) this.f79378h).a();
                return;
            }
            if (this.f79400z.equals("needConfirm")) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (int i17 = 0; i17 < this.G; i17++) {
                    byte[] bArr = (byte[]) this.H.get(i17 + "");
                    r45.jv5 jv5Var = new r45.jv5();
                    try {
                        jv5Var.parseFrom(bArr);
                        linkedList.add(new ui1.b0(jv5Var.f378131d, jv5Var.f378132e, jv5Var.f378133f, jv5Var.f378134g, jv5Var.f378135h, jv5Var.f378136i, jv5Var.f378137m));
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "IOException %s", e17.getMessage());
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiOperateWXData", e17, "", new java.lang.Object[0]);
                        this.f79377g.a(this.f79379i, this.f79376f.o("fail"));
                        ((com.tencent.mm.plugin.appbrand.jsapi.auth.x2) this.f79378h).a();
                        return;
                    }
                }
                if (linkedList.size() > 0) {
                    this.f79377g.m(new com.tencent.mm.plugin.appbrand.jsapi.auth.f3(this, linkedList));
                    return;
                }
                this.f79377g.a(this.f79379i, this.f79376f.o("fail"));
                ((com.tencent.mm.plugin.appbrand.jsapi.auth.x2) this.f79378h).a();
                return;
            }
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String str = this.f79383o;
        if (!android.text.TextUtils.isEmpty(this.f79384p)) {
            try {
                com.tencent.mm.sdk.platformtools.o4 o4Var = f79374z1;
                str = o4Var.getString(this.f79384p, "");
                o4Var.remove(this.f79384p);
                jx3.f.INSTANCE.idkeyStat(1063L, 2L, 1L, false);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "runInClientProcess loginResult ok, get data from XProcessStore failed, appId[%s], callbackId[%d], e=%s", this.f79397y, java.lang.Integer.valueOf(this.f79379i), th6);
                jx3.f.INSTANCE.idkeyStat(1063L, 3L, 1L, false);
            }
        }
        hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("isConfirm", java.lang.Boolean.valueOf(this.X));
        hashMap3.put("queueLength", java.lang.Integer.valueOf(this.Y));
        hashMap3.put("wxdataQueueTimestamp", java.lang.Long.valueOf(this.Z));
        hashMap3.put("wxdataDequeueTimestamp", java.lang.Long.valueOf(this.f79385p0));
        hashMap3.put("beginCGITimestamp", java.lang.Long.valueOf(this.f79395x0));
        hashMap3.put("CGICallbackTimestamp", java.lang.Long.valueOf(this.f79398y0));
        hashMap3.put("beginCGITimestampAfterConfirm", java.lang.Long.valueOf(this.f79380l1));
        hashMap3.put("CGICallbackTimestampAfterConfirm", java.lang.Long.valueOf(this.f79386p1));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hashMap3.put("wxlibCallbackTimestamp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        r45.xw xwVar = this.f79396x1;
        if (xwVar != null) {
            hashMap3.put("taskStartTime", java.lang.Long.valueOf(xwVar.f390547q));
            hashMap3.put("startConnectTime", java.lang.Long.valueOf(this.f79396x1.f390537d));
            hashMap3.put("connectSuccessfulTime", java.lang.Long.valueOf(this.f79396x1.f390538e));
            hashMap3.put("startHandshakeTime", java.lang.Long.valueOf(this.f79396x1.f390539f));
            hashMap3.put("handshakeSuccessfulTime", java.lang.Long.valueOf(this.f79396x1.f390540g));
            hashMap3.put("startSendPacketTime", java.lang.Long.valueOf(this.f79396x1.f390541h));
            hashMap3.put("startReadPacketTime", java.lang.Long.valueOf(this.f79396x1.f390543m));
            hashMap3.put("readPacketFinishedTime", java.lang.Long.valueOf(this.f79396x1.f390544n));
            hashMap3.put("rtt", java.lang.Long.valueOf(this.f79396x1.f390548r));
            hashMap3.put("channelType", java.lang.Long.valueOf(this.f79396x1.f390549s));
            hashMap3.put("protocolType", java.lang.Long.valueOf(this.f79396x1.f390550t));
            hashMap3.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, this.f79396x1.f390551u);
        }
        java.util.Map map = this.f79399y1;
        if (map != null) {
            hashMap3.put("MMNetStartTaskBegin", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get("startTaskBegin"))));
            hashMap3.put("MMNetMarsStartTaskBegin", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) this.f79399y1.get("marsStartTaskBegin"))));
            hashMap3.put("MMNetStartTaskEnd", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) this.f79399y1.get("startTaskEnd"))));
            hashMap3.put("MMNetReq2BufBegin", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) this.f79399y1.get("req2BufBegin"))));
            hashMap3.put("MMNetReq2BufEnd", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) this.f79399y1.get("req2BufEnd"))));
            hashMap3.put("MMNetBuf2RespBegin", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) this.f79399y1.get("buf2RespBegin"))));
            hashMap3.put("MMNetBuf2RespEnd", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) this.f79399y1.get("buf2RespEnd"))));
            hashMap3.put("MMNetOnTaskEndBegin", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) this.f79399y1.get("onTaskEndBegin"))));
            hashMap3.put("MMNetOnTaskEndEnd", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) this.f79399y1.get("onTaskEndEnd"))));
        }
        hashMap2.put("clientInfo", hashMap3);
        this.f79377g.a(this.f79379i, this.f79376f.p("ok", hashMap2));
        ((com.tencent.mm.plugin.appbrand.jsapi.auth.x2) this.f79378h).a();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (this.X) {
            this.f79380l1 = java.lang.System.currentTimeMillis();
        } else {
            this.f79395x0 = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.z2 z2Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.z2(this);
        if (this.f79381m.equals("operateWXData")) {
            B(this.B, this.A, this.f79397y, this.f79382n, "", this.f79387q, this.f79388r, 0, z2Var, this.V, this.f79390t, this.W);
        } else if (this.f79381m.equals("operateWXDataConfirm")) {
            B(this.B, this.A, this.f79397y, this.f79382n, this.F, this.f79387q, this.f79388r, this.f79389s, z2Var, this.V, this.f79390t, this.W);
        }
    }

    public JsApiOperateWXData$OperateWXDataTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
