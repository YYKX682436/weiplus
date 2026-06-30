package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask */
/* loaded from: classes7.dex */
public final class C12330xa378a092 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11881x4d7e5e5e {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092> f35050x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n0();

    /* renamed from: f, reason: collision with root package name */
    public final transient com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0 f165897f;

    /* renamed from: g, reason: collision with root package name */
    public final transient android.content.Context f165898g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 f165899h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f165900i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc f165901m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f165902n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f165903o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f165904p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f165905q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f165906r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f165907s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f165908t;

    public /* synthetic */ C12330xa378a092(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k0 k0Var) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11881x4d7e5e5e
    public void E() {
        super.D();
        this.f165907s = true;
        c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11881x4d7e5e5e
    public void F() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s c17;
        final boolean[] zArr = {true};
        final java.lang.String[] strArr = {null};
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 c12330xa378a092 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = c12330xa378a092.f165901m;
                java.lang.String str = c12362x460991bc.f166435e;
                java.util.Objects.requireNonNull(str);
                boolean[] zArr2 = zArr;
                java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.f(c12362x460991bc, str, zArr2[0]);
                java.lang.String[] strArr2 = strArr;
                strArr2[0] = f17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreInitTask", "runInAccountScope for appId:%s, preferUseCached:%b, forceCreateNewInstance:%b, forceUseBackup:%b, <reportOpen> newInstance:%b, instanceId:%s", c12330xa378a092.f165901m.f166435e, java.lang.Boolean.valueOf(c12330xa378a092.f165904p), java.lang.Boolean.valueOf(c12330xa378a092.f165903o), java.lang.Boolean.valueOf(c12330xa378a092.f165902n), java.lang.Boolean.valueOf(zArr2[0]), strArr2[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.f169345a.d(c12330xa378a092.f165901m, strArr2[0]);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.a()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.f169906a.g(c12330xa378a092.f165901m.f166435e, strArr2[0]);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, c12330xa378a092.f165901m.f166435e);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, c12330xa378a092.f165901m.f166435e, java.lang.String.format("Network:%s", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
                }
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = this.f165901m;
        java.lang.String str = c12362x460991bc.f166435e;
        int i17 = c12362x460991bc.f166437g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l0(this, zArr, java.lang.System.currentTimeMillis(), i17, strArr, runnable, str);
        if (!android.text.TextUtils.isEmpty(str) && (c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().c(str, i17)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) c17.f129220d;
            if (c11809xbc286be4.f158814g == i17 && this.f165904p && !this.f165903o) {
                zArr[0] = false;
                strArr[0] = c17.f129224h;
                runnable.run();
                if (i17 != 2 || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a.c()) {
                    l0Var.b(c11809xbc286be4, this.f165901m.f166443o, 1);
                    return;
                } else {
                    new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w0(this.f165901m, strArr[0], this.f165902n, l0Var).run();
                    return;
                }
            }
        }
        zArr[0] = true;
        runnable.run();
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w0(this.f165901m, strArr[0], this.f165902n, l0Var).run();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 G(boolean z17) {
        this.f165903o = z17;
        return this;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 H(boolean z17) {
        this.f165904p = z17;
        return this;
    }

    public void I() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = this.f165901m;
        if (c12362x460991bc.f166448r <= 0) {
            c12362x460991bc.d();
        }
        d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f165900i = parcel.readString();
        this.f165901m = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc.class.getClassLoader());
        this.f165902n = parcel.readByte() > 0;
        this.f165903o = parcel.readByte() > 0;
        this.f165904p = parcel.readByte() > 0;
        this.f165905q = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4.class.getClassLoader());
        this.f165899h = (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41) parcel.readParcelable(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41.class.getClassLoader());
        this.f165906r = parcel.readByte() != 0;
        this.f165907s = parcel.readByte() > 0;
        this.f165908t = parcel.readByte() > 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f165900i);
        parcel.writeParcelable(this.f165901m, i17);
        parcel.writeByte(this.f165902n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f165903o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f165904p ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f165905q, i17);
        parcel.writeParcelable(this.f165899h, i17);
        parcel.writeByte(this.f165906r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f165907s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f165908t ? (byte) 1 : (byte) 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17;
        try {
            boolean z18 = this.f165907s;
            android.content.Context context = this.f165898g;
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreInitTask", "runInClientProcess for %s, account expired, context:%s", this.f165901m, context);
                if (context instanceof android.app.Activity) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.m8.f171399a.a((android.app.Activity) context);
                }
                if (z17) {
                    return;
                } else {
                    return;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0 o0Var = this.f165897f;
            if (o0Var != null) {
                if (this.f165906r) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.l.f166735a.b(context, this.f165905q, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k0(this));
                } else {
                    o0Var.a(this.f165905q, this.f165901m.f166443o);
                }
            }
            if (this.f165906r) {
                return;
            }
            x();
        } finally {
            if (!this.f165906r) {
                x();
            }
        }
    }

    public C12330xa378a092(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0 o0Var) {
        this(context, c12362x460991bc, false, o0Var);
    }

    public C12330xa378a092(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0 o0Var) {
        this.f165898g = context;
        this.f165900i = bm5.f1.a();
        this.f165901m = c12362x460991bc;
        this.f165902n = z17;
        this.f165903o = false;
        this.f165897f = o0Var;
        android.app.Activity a17 = q75.a.a(context);
        if (a17 != null) {
            this.f165899h = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41(a17);
        } else {
            this.f165899h = null;
        }
        this.f165901m.f166454x = this.f165899h;
    }

    private C12330xa378a092(android.os.Parcel parcel) {
        v(parcel);
    }
}
