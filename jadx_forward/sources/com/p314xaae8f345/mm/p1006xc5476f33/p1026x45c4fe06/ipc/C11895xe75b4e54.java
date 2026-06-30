package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent */
/* loaded from: classes7.dex */
public class C11895xe75b4e54 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: f, reason: collision with root package name */
    public int f159914f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f159915g;

    /* renamed from: h, reason: collision with root package name */
    public int f159916h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f159917i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f159918m;

    /* renamed from: n, reason: collision with root package name */
    public int f159919n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f159920o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f159921p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashMap f159912q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public static final ik1.x f159913r = new ik1.x();

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54> f33632x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.i0();

    public /* synthetic */ C11895xe75b4e54(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.h0 h0Var) {
        this(parcel);
    }

    public static void B(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 l0Var) {
        if (l0Var != null) {
            f159913r.e(str, l0Var);
        }
    }

    public static boolean C(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || f159912q.get(str) == null) ? false : true;
    }

    public static void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        if (lVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54 c11895xe75b4e54 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54();
        f159912q.put(lVar.mo48798x74292566(), c11895xe75b4e54);
        c11895xe75b4e54.f159914f = 1;
        c11895xe75b4e54.f159915g = lVar.mo48798x74292566();
        c11895xe75b4e54.f159918m = lVar;
        c11895xe75b4e54.d();
    }

    public static void E(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54 c11895xe75b4e54 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54();
        f159912q.put(str, c11895xe75b4e54);
        c11895xe75b4e54.f159914f = 1;
        c11895xe75b4e54.f159915g = str;
        c11895xe75b4e54.d();
    }

    public static void F(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 l0Var) {
        if (l0Var != null) {
            f159913r.f(str, l0Var);
        }
    }

    public static void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        if (lVar == null) {
            return;
        }
        H(lVar.mo48798x74292566());
    }

    public static void H(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54 c11895xe75b4e54;
        if (android.text.TextUtils.isEmpty(str) || (c11895xe75b4e54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54) f159912q.remove(str)) == null) {
            return;
        }
        f159913r.g(str);
        c11895xe75b4e54.f159914f = 2;
        c11895xe75b4e54.f159915g = str;
        c11895xe75b4e54.f159918m = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.m()) {
            try {
                c11895xe75b4e54.s();
            } catch (java.lang.SecurityException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMToClientEvent", "unregisterToMM(%s) get exception:%s", str, e17);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(android.os.Parcel r3) {
        /*
            r2 = this;
            int r0 = r3.readInt()
            r2.f159914f = r0
            java.lang.String r0 = r3.readString()
            r2.f159915g = r0
            int r0 = r3.readInt()
            r2.f159916h = r0
            java.lang.String r0 = r3.readString()
            r2.f159917i = r0
            int r0 = r3.readInt()
            r2.f159919n = r0
            r0 = 0
            java.lang.String r1 = r3.readString()     // Catch: java.lang.ClassNotFoundException -> L32
            r2.f159920o = r1     // Catch: java.lang.ClassNotFoundException -> L32
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)     // Catch: java.lang.ClassNotFoundException -> L32
            if (r1 != 0) goto L32
            java.lang.String r1 = r2.f159920o     // Catch: java.lang.ClassNotFoundException -> L32
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
            r2.f159921p = r3
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.v(android.os.Parcel):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f159914f);
        parcel.writeString(this.f159915g);
        parcel.writeInt(this.f159916h);
        parcel.writeString(this.f159917i);
        parcel.writeInt(this.f159919n);
        parcel.writeString(this.f159920o);
        parcel.writeParcelable((android.os.Parcelable) this.f159921p, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.String str;
        java.lang.Object obj;
        int i17 = this.f159914f;
        if (i17 == 3) {
            if (this.f159918m == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.j0();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", java.lang.Integer.valueOf(this.f159916h));
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f159917i);
            j0Var.u(this.f159918m);
            j0Var.t(hashMap);
            j0Var.m();
            return;
        }
        if (i17 != 4) {
            if (i17 != 5 || (str = this.f159915g) == null || (obj = this.f159921p) == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.h0(this, str, obj), "MicroMsg.MMToClientEvent");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.k0();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("count", java.lang.Integer.valueOf(this.f159919n));
        hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f159917i);
        k0Var.u(this.f159918m);
        k0Var.t(hashMap2);
        k0Var.m();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        int i17 = this.f159914f;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.f159954a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMToClientEventCenter", "unregister MMToClientEvent.appId:%s", this.f159915g);
            java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.f159954a;
            synchronized (hashMap2) {
                hashMap2.remove(this.f159915g);
            }
            return;
        }
        java.util.HashMap hashMap3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.f159954a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId:%s, MMToClientEvent.hash:%d", this.f159915g, java.lang.Integer.valueOf(hashCode()));
        if (this.f159915g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId is null!!!");
            return;
        }
        java.util.HashMap hashMap4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.f159954a;
        synchronized (hashMap4) {
            if (hashMap4.get(this.f159915g) == null) {
                hashMap4.put(this.f159915g, this);
            } else {
                hashMap4.remove(this.f159915g);
                hashMap4.put(this.f159915g, this);
            }
        }
    }

    private C11895xe75b4e54() {
    }

    private C11895xe75b4e54(android.os.Parcel parcel) {
        v(parcel);
    }
}
