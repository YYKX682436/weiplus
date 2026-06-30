package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public class MMToClientEvent extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {

    /* renamed from: f, reason: collision with root package name */
    public int f78381f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f78382g;

    /* renamed from: h, reason: collision with root package name */
    public int f78383h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f78384i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f78385m;

    /* renamed from: n, reason: collision with root package name */
    public int f78386n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78387o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f78388p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashMap f78379q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public static final ik1.x f78380r = new ik1.x();
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent> CREATOR = new com.tencent.mm.plugin.appbrand.ipc.i0();

    public /* synthetic */ MMToClientEvent(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.ipc.h0 h0Var) {
        this(parcel);
    }

    public static void B(java.lang.String str, com.tencent.mm.plugin.appbrand.ipc.l0 l0Var) {
        if (l0Var != null) {
            f78380r.e(str, l0Var);
        }
    }

    public static boolean C(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || f78379q.get(str) == null) ? false : true;
    }

    public static void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (lVar == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent mMToClientEvent = new com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent();
        f78379q.put(lVar.getAppId(), mMToClientEvent);
        mMToClientEvent.f78381f = 1;
        mMToClientEvent.f78382g = lVar.getAppId();
        mMToClientEvent.f78385m = lVar;
        mMToClientEvent.d();
    }

    public static void E(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent mMToClientEvent = new com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent();
        f78379q.put(str, mMToClientEvent);
        mMToClientEvent.f78381f = 1;
        mMToClientEvent.f78382g = str;
        mMToClientEvent.d();
    }

    public static void F(java.lang.String str, com.tencent.mm.plugin.appbrand.ipc.l0 l0Var) {
        if (l0Var != null) {
            f78380r.f(str, l0Var);
        }
    }

    public static void G(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (lVar == null) {
            return;
        }
        H(lVar.getAppId());
    }

    public static void H(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent mMToClientEvent;
        if (android.text.TextUtils.isEmpty(str) || (mMToClientEvent = (com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent) f78379q.remove(str)) == null) {
            return;
        }
        f78380r.g(str);
        mMToClientEvent.f78381f = 2;
        mMToClientEvent.f78382g = str;
        mMToClientEvent.f78385m = null;
        if (com.tencent.mm.sdk.platformtools.x2.m()) {
            try {
                mMToClientEvent.s();
            } catch (java.lang.SecurityException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMToClientEvent", "unregisterToMM(%s) get exception:%s", str, e17);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(android.os.Parcel r3) {
        /*
            r2 = this;
            int r0 = r3.readInt()
            r2.f78381f = r0
            java.lang.String r0 = r3.readString()
            r2.f78382g = r0
            int r0 = r3.readInt()
            r2.f78383h = r0
            java.lang.String r0 = r3.readString()
            r2.f78384i = r0
            int r0 = r3.readInt()
            r2.f78386n = r0
            r0 = 0
            java.lang.String r1 = r3.readString()     // Catch: java.lang.ClassNotFoundException -> L32
            r2.f78387o = r1     // Catch: java.lang.ClassNotFoundException -> L32
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)     // Catch: java.lang.ClassNotFoundException -> L32
            if (r1 != 0) goto L32
            java.lang.String r1 = r2.f78387o     // Catch: java.lang.ClassNotFoundException -> L32
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L32
            goto L33
        L32:
            r1 = r0
        L33:
            if (r1 != 0) goto L39
            r3.readParcelable(r0)
            goto L43
        L39:
            java.lang.ClassLoader r0 = r1.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            r2.f78388p = r3
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.v(android.os.Parcel):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78381f);
        parcel.writeString(this.f78382g);
        parcel.writeInt(this.f78383h);
        parcel.writeString(this.f78384i);
        parcel.writeInt(this.f78386n);
        parcel.writeString(this.f78387o);
        parcel.writeParcelable((android.os.Parcelable) this.f78388p, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.String str;
        java.lang.Object obj;
        int i17 = this.f78381f;
        if (i17 == 3) {
            if (this.f78385m == null) {
                return;
            }
            com.tencent.mm.plugin.appbrand.ipc.j0 j0Var = new com.tencent.mm.plugin.appbrand.ipc.j0();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", java.lang.Integer.valueOf(this.f78383h));
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f78384i);
            j0Var.u(this.f78385m);
            j0Var.t(hashMap);
            j0Var.m();
            return;
        }
        if (i17 != 4) {
            if (i17 != 5 || (str = this.f78382g) == null || (obj = this.f78388p) == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.ipc.h0(this, str, obj), "MicroMsg.MMToClientEvent");
            return;
        }
        com.tencent.mm.plugin.appbrand.ipc.k0 k0Var = new com.tencent.mm.plugin.appbrand.ipc.k0();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("count", java.lang.Integer.valueOf(this.f78386n));
        hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f78384i);
        k0Var.u(this.f78385m);
        k0Var.t(hashMap2);
        k0Var.m();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        int i17 = this.f78381f;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.ipc.m0.f78421a;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMToClientEventCenter", "unregister MMToClientEvent.appId:%s", this.f78382g);
            java.util.HashMap hashMap2 = com.tencent.mm.plugin.appbrand.ipc.m0.f78421a;
            synchronized (hashMap2) {
                hashMap2.remove(this.f78382g);
            }
            return;
        }
        java.util.HashMap hashMap3 = com.tencent.mm.plugin.appbrand.ipc.m0.f78421a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId:%s, MMToClientEvent.hash:%d", this.f78382g, java.lang.Integer.valueOf(hashCode()));
        if (this.f78382g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId is null!!!");
            return;
        }
        java.util.HashMap hashMap4 = com.tencent.mm.plugin.appbrand.ipc.m0.f78421a;
        synchronized (hashMap4) {
            if (hashMap4.get(this.f78382g) == null) {
                hashMap4.put(this.f78382g, this);
            } else {
                hashMap4.remove(this.f78382g);
                hashMap4.put(this.f78382g, this);
            }
        }
    }

    private MMToClientEvent() {
    }

    private MMToClientEvent(android.os.Parcel parcel) {
        v(parcel);
    }
}
