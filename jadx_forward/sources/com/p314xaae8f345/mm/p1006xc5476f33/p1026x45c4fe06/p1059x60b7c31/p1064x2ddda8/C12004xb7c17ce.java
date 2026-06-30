package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask */
/* loaded from: classes7.dex */
public class C12004xb7c17ce extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb implements im5.a {
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
    public java.lang.String f160908J;
    public java.lang.String K;
    public boolean L;
    public java.lang.String M;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992 N;
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
    public transient com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 f160909f;

    /* renamed from: g, reason: collision with root package name */
    public transient com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f160910g;

    /* renamed from: h, reason: collision with root package name */
    public transient com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o f160911h;

    /* renamed from: i, reason: collision with root package name */
    public int f160912i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160914m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160915n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160916o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160917p;

    /* renamed from: p0, reason: collision with root package name */
    public transient long f160918p0;

    /* renamed from: q, reason: collision with root package name */
    public int f160920q;

    /* renamed from: r, reason: collision with root package name */
    public int f160921r;

    /* renamed from: s, reason: collision with root package name */
    public int f160922s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f160923t;

    /* renamed from: x0, reason: collision with root package name */
    public long f160928x0;

    /* renamed from: x1, reason: collision with root package name */
    public r45.xw f160929x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f160930y;

    /* renamed from: y0, reason: collision with root package name */
    public long f160931y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.util.Map f160932y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f160933z;

    /* renamed from: z1, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f160907z1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.AppBrand.JsApiOperateWXData");

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce> f33847x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h3();

    /* renamed from: u, reason: collision with root package name */
    public int f160924u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f160925v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f160926w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f160927x = "";
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12008x61435860 P = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12008x61435860.f161012f;
    public boolean X = false;

    /* renamed from: l1, reason: collision with root package name */
    public long f160913l1 = -1;

    /* renamed from: p1, reason: collision with root package name */
    public long f160919p1 = -1;

    public C12004xb7c17ce() {
    }

    public void B(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, int i27, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j3 j3Var, th1.c cVar, boolean z17, boolean z18) {
        th1.g gVar = new th1.g(i17, str, str2, str3, str4, i18, i27, i19, this.T, cVar, this.f160925v, this.f160924u, z17, z18, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.i3(this, str3, j3Var));
        int i28 = this.U;
        r45.m24 m24Var = (r45.m24) gVar.f500853d.f152243a.f152217a;
        if (m24Var.f461627i == null) {
            m24Var.f461627i = new r45.nd7();
        }
        m24Var.f461627i.f462830f = i28;
        gm0.j1.d().g(gVar);
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        th1.c cVar;
        r45.xw xwVar;
        this.f160930y = parcel.readString();
        this.f160933z = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.f160915n = parcel.readString();
        this.f160916o = parcel.readString();
        this.f160917p = parcel.readString();
        this.f160912i = parcel.readInt();
        this.f160914m = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readInt();
        this.H = parcel.readHashMap(java.util.HashMap.class.getClassLoader());
        this.f160920q = parcel.readInt();
        this.f160921r = parcel.readInt();
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.f160926w = parcel.readString();
        this.f160927x = parcel.readString();
        this.K = parcel.readString();
        this.f160908J = parcel.readString();
        this.I = parcel.readString();
        this.N = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992.class.getClassLoader());
        this.R = parcel.readInt();
        this.S = parcel.readInt() == 1;
        this.f160922s = parcel.readInt();
        this.f160924u = parcel.readInt();
        this.f160925v = parcel.readString();
        this.L = parcel.readInt() == 1;
        this.M = parcel.readString();
        this.Q = parcel.readString();
        this.C = parcel.readInt();
        this.f160928x0 = parcel.readLong();
        this.f160931y0 = parcel.readLong();
        this.f160913l1 = parcel.readLong();
        this.f160919p1 = parcel.readLong();
        this.X = parcel.readInt() == 1;
        this.P = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12008x61435860) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12008x61435860.class.getClassLoader());
        this.f160923t = parcel.readInt() == 1;
        this.W = parcel.readInt() == 1;
        th1.c.f500842g.getClass();
        if (parcel.dataAvail() > 0) {
            int readInt = parcel.readInt();
            java.util.Iterator it = ((kz5.h) th1.c.f500846n).iterator();
            while (it.hasNext()) {
                cVar = (th1.c) it.next();
                if (cVar.ordinal() == readInt) {
                    break;
                }
            }
        }
        cVar = th1.c.f500843h;
        this.V = cVar;
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            xwVar = null;
        } else {
            try {
                xwVar = (r45.xw) new r45.xw().mo11468x92b714fd(createByteArray);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "parse cgiProfile IOException %s", e17.getMessage());
                xwVar = new r45.xw();
            }
        }
        this.f160929x1 = xwVar;
        this.f160932y1 = parcel.readHashMap(java.util.HashMap.class.getClassLoader());
        if (parcel.dataAvail() > 0) {
            this.A = parcel.readString();
            this.B = parcel.readInt();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160930y);
        parcel.writeString(this.f160933z);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.f160915n);
        parcel.writeString(this.f160916o);
        parcel.writeString(this.f160917p);
        parcel.writeInt(this.f160912i);
        parcel.writeString(this.f160914m);
        parcel.writeString(this.F);
        parcel.writeInt(this.G);
        parcel.writeMap(this.H);
        parcel.writeInt(this.f160920q);
        parcel.writeInt(this.f160921r);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeString(this.f160926w);
        parcel.writeString(this.f160927x);
        parcel.writeString(this.K);
        parcel.writeString(this.f160908J);
        parcel.writeString(this.I);
        parcel.writeParcelable(this.N, i17);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S ? 1 : 0);
        parcel.writeInt(this.f160922s);
        parcel.writeInt(this.f160924u);
        parcel.writeString(this.f160925v);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeString(this.M);
        parcel.writeString(this.Q);
        parcel.writeInt(this.C);
        parcel.writeLong(this.f160928x0);
        parcel.writeLong(this.f160931y0);
        parcel.writeLong(this.f160913l1);
        parcel.writeLong(this.f160919p1);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeParcelable(this.P, i17);
        parcel.writeInt(this.f160923t ? 1 : 0);
        parcel.writeInt(this.W ? 1 : 0);
        th1.c cVar = this.V;
        th1.c.f500842g.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
        parcel.writeInt(cVar.ordinal());
        r45.xw xwVar = this.f160929x1;
        if (xwVar == null) {
            parcel.writeByteArray(null);
        } else {
            try {
                parcel.writeByteArray(xwVar.mo14344x5f01b1f6());
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "write cgiProfile IOException %s", e17.getMessage());
            }
        }
        parcel.writeMap(this.f160932y1);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        if (!this.f160910g.mo50262x39e05d35()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x2) this.f160911h).a();
            return;
        }
        if (!this.f160933z.equals("ok")) {
            if (this.f160933z.contains("fail")) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("err_code", java.lang.String.valueOf(this.C));
                this.f160910g.a(this.f160912i, this.f160909f.p(this.f160933z, hashMap));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x2) this.f160911h).a();
                return;
            }
            if (this.f160933z.equals("needConfirm")) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (int i17 = 0; i17 < this.G; i17++) {
                    byte[] bArr = (byte[]) this.H.get(i17 + "");
                    r45.jv5 jv5Var = new r45.jv5();
                    try {
                        jv5Var.mo11468x92b714fd(bArr);
                        linkedList.add(new ui1.b0(jv5Var.f459664d, jv5Var.f459665e, jv5Var.f459666f, jv5Var.f459667g, jv5Var.f459668h, jv5Var.f459669i, jv5Var.f459670m));
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "IOException %s", e17.getMessage());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiOperateWXData", e17, "", new java.lang.Object[0]);
                        this.f160910g.a(this.f160912i, this.f160909f.o("fail"));
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x2) this.f160911h).a();
                        return;
                    }
                }
                if (linkedList.size() > 0) {
                    this.f160910g.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f3(this, linkedList));
                    return;
                }
                this.f160910g.a(this.f160912i, this.f160909f.o("fail"));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x2) this.f160911h).a();
                return;
            }
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String str = this.f160916o;
        if (!android.text.TextUtils.isEmpty(this.f160917p)) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f160907z1;
                str = o4Var.getString(this.f160917p, "");
                o4Var.remove(this.f160917p);
                jx3.f.INSTANCE.mo68477x336bdfd8(1063L, 2L, 1L, false);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "runInClientProcess loginResult ok, get data from XProcessStore failed, appId[%s], callbackId[%d], e=%s", this.f160930y, java.lang.Integer.valueOf(this.f160912i), th6);
                jx3.f.INSTANCE.mo68477x336bdfd8(1063L, 3L, 1L, false);
            }
        }
        hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("isConfirm", java.lang.Boolean.valueOf(this.X));
        hashMap3.put("queueLength", java.lang.Integer.valueOf(this.Y));
        hashMap3.put("wxdataQueueTimestamp", java.lang.Long.valueOf(this.Z));
        hashMap3.put("wxdataDequeueTimestamp", java.lang.Long.valueOf(this.f160918p0));
        hashMap3.put("beginCGITimestamp", java.lang.Long.valueOf(this.f160928x0));
        hashMap3.put("CGICallbackTimestamp", java.lang.Long.valueOf(this.f160931y0));
        hashMap3.put("beginCGITimestampAfterConfirm", java.lang.Long.valueOf(this.f160913l1));
        hashMap3.put("CGICallbackTimestampAfterConfirm", java.lang.Long.valueOf(this.f160919p1));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hashMap3.put("wxlibCallbackTimestamp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        r45.xw xwVar = this.f160929x1;
        if (xwVar != null) {
            hashMap3.put("taskStartTime", java.lang.Long.valueOf(xwVar.f472080q));
            hashMap3.put("startConnectTime", java.lang.Long.valueOf(this.f160929x1.f472070d));
            hashMap3.put("connectSuccessfulTime", java.lang.Long.valueOf(this.f160929x1.f472071e));
            hashMap3.put("startHandshakeTime", java.lang.Long.valueOf(this.f160929x1.f472072f));
            hashMap3.put("handshakeSuccessfulTime", java.lang.Long.valueOf(this.f160929x1.f472073g));
            hashMap3.put("startSendPacketTime", java.lang.Long.valueOf(this.f160929x1.f472074h));
            hashMap3.put("startReadPacketTime", java.lang.Long.valueOf(this.f160929x1.f472076m));
            hashMap3.put("readPacketFinishedTime", java.lang.Long.valueOf(this.f160929x1.f472077n));
            hashMap3.put("rtt", java.lang.Long.valueOf(this.f160929x1.f472081r));
            hashMap3.put("channelType", java.lang.Long.valueOf(this.f160929x1.f472082s));
            hashMap3.put("protocolType", java.lang.Long.valueOf(this.f160929x1.f472083t));
            hashMap3.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, this.f160929x1.f472084u);
        }
        java.util.Map map = this.f160932y1;
        if (map != null) {
            hashMap3.put("MMNetStartTaskBegin", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get("startTaskBegin"))));
            hashMap3.put("MMNetMarsStartTaskBegin", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) this.f160932y1.get("marsStartTaskBegin"))));
            hashMap3.put("MMNetStartTaskEnd", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) this.f160932y1.get("startTaskEnd"))));
            hashMap3.put("MMNetReq2BufBegin", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) this.f160932y1.get("req2BufBegin"))));
            hashMap3.put("MMNetReq2BufEnd", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) this.f160932y1.get("req2BufEnd"))));
            hashMap3.put("MMNetBuf2RespBegin", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) this.f160932y1.get("buf2RespBegin"))));
            hashMap3.put("MMNetBuf2RespEnd", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) this.f160932y1.get("buf2RespEnd"))));
            hashMap3.put("MMNetOnTaskEndBegin", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) this.f160932y1.get("onTaskEndBegin"))));
            hashMap3.put("MMNetOnTaskEndEnd", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) this.f160932y1.get("onTaskEndEnd"))));
        }
        hashMap2.put("clientInfo", hashMap3);
        this.f160910g.a(this.f160912i, this.f160909f.p("ok", hashMap2));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x2) this.f160911h).a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (this.X) {
            this.f160913l1 = java.lang.System.currentTimeMillis();
        } else {
            this.f160928x0 = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z2 z2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z2(this);
        if (this.f160914m.equals("operateWXData")) {
            B(this.B, this.A, this.f160930y, this.f160915n, "", this.f160920q, this.f160921r, 0, z2Var, this.V, this.f160923t, this.W);
        } else if (this.f160914m.equals("operateWXDataConfirm")) {
            B(this.B, this.A, this.f160930y, this.f160915n, this.F, this.f160920q, this.f160921r, this.f160922s, z2Var, this.V, this.f160923t, this.W);
        }
    }

    public C12004xb7c17ce(android.os.Parcel parcel) {
        v(parcel);
    }
}
