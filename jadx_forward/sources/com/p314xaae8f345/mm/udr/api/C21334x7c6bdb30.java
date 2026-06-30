package com.p314xaae8f345.mm.udr.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/udr/api/WxUdrResource;", "Landroid/os/Parcelable;", "udr-common_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.udr.api.WxUdrResource */
/* loaded from: classes15.dex */
public final class C21334x7c6bdb30 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.udr.api.C21334x7c6bdb30> f39260x681a0c0c = new ea5.n();
    public int A;
    public java.lang.String B;
    public int C;
    public long D;
    public java.lang.String E;
    public byte[] F;
    public byte[] G;
    public byte[] H;
    public byte[] I;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f277983d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f277984e;

    /* renamed from: f, reason: collision with root package name */
    public int f277985f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f277986g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f277987h;

    /* renamed from: i, reason: collision with root package name */
    public long f277988i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f277989m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f277990n;

    /* renamed from: o, reason: collision with root package name */
    public int f277991o;

    /* renamed from: p, reason: collision with root package name */
    public int f277992p;

    /* renamed from: q, reason: collision with root package name */
    public long f277993q;

    /* renamed from: r, reason: collision with root package name */
    public long f277994r;

    /* renamed from: s, reason: collision with root package name */
    public long f277995s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f277996t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f277997u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f277998v;

    /* renamed from: w, reason: collision with root package name */
    public long f277999w;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f278000x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f278001y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f278002z;

    public C21334x7c6bdb30() {
        this.C = 1;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f277998v;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("key");
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m78301x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WxUdrResource{projectId='");
        java.lang.String str = this.f277983d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("projectId");
            throw null;
        }
        sb6.append(str);
        sb6.append("', name='");
        java.lang.String str2 = this.f277984e;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            throw null;
        }
        sb6.append(str2);
        sb6.append("', version='");
        sb6.append(this.f277985f);
        sb6.append("', url='");
        sb6.append(this.f277986g);
        sb6.append("', md5='");
        java.lang.String str3 = this.f277987h;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("md5");
            throw null;
        }
        sb6.append(str3);
        sb6.append("', size='");
        sb6.append(this.f277988i);
        sb6.append("', path='");
        java.lang.String str4 = this.f277989m;
        if (str4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        sb6.append(str4);
        sb6.append("', postPath='");
        sb6.append(this.f277990n);
        sb6.append("', category='");
        sb6.append(this.f277991o);
        sb6.append("', type='");
        sb6.append(this.f277992p);
        sb6.append("', createTime=");
        sb6.append(this.f277993q);
        sb6.append(", updateTime=");
        sb6.append(this.f277994r);
        sb6.append(", extId=");
        sb6.append(this.f277995s);
        sb6.append(", signatureKey='");
        sb6.append(this.f277996t);
        sb6.append("', fileKey='");
        sb6.append(this.f277997u);
        sb6.append("', key='");
        sb6.append(a());
        sb6.append("', expireTime='");
        sb6.append(this.f277999w);
        sb6.append("', extInfo='");
        java.lang.String arrays = java.util.Arrays.toString(this.f278000x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append("', specifiedExtInfo='");
        sb6.append(this.f278001y);
        sb6.append("', virtualPath='");
        sb6.append(this.f278002z);
        sb6.append("', storageType='");
        sb6.append(this.A);
        sb6.append("', uinMd5='");
        sb6.append(this.B);
        sb6.append("', encryptFileSize='");
        sb6.append(this.D);
        sb6.append("', encryptMd5='");
        sb6.append(this.E);
        sb6.append("'}");
        return sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6 A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104 A[Catch: Exception -> 0x0108, TRY_LEAVE, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(android.os.Parcel r6, int r7) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.udr.api.C21334x7c6bdb30.writeToParcel(android.os.Parcel, int):void");
    }

    public C21334x7c6bdb30(android.os.Parcel source) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        boolean z17 = true;
        this.C = 1;
        this.f277983d = java.lang.String.valueOf(source.readString());
        this.f277984e = java.lang.String.valueOf(source.readString());
        this.f277985f = source.readInt();
        this.f277986g = source.readString();
        this.f277987h = java.lang.String.valueOf(source.readString());
        this.f277988i = source.readLong();
        this.f277989m = java.lang.String.valueOf(source.readString());
        this.f277990n = source.readString();
        this.f277991o = source.readInt();
        this.f277992p = source.readInt();
        this.f277993q = source.readLong();
        this.f277994r = source.readLong();
        this.f277995s = source.readLong();
        this.f277996t = source.readString();
        this.f277997u = source.readString();
        this.f277998v = java.lang.String.valueOf(source.readString());
        this.f277999w = source.readLong();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(source.readInt());
            byte[] bArr5 = null;
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                bArr = new byte[valueOf.intValue()];
                source.readByteArray(bArr);
            } else {
                bArr = null;
            }
            this.f278000x = bArr;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(source.readInt());
            if (!(valueOf2.intValue() > 0)) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                bArr2 = new byte[valueOf2.intValue()];
                source.readByteArray(bArr2);
            } else {
                bArr2 = null;
            }
            this.F = bArr2;
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(source.readInt());
            if (!(valueOf3.intValue() > 0)) {
                valueOf3 = null;
            }
            if (valueOf3 != null) {
                bArr3 = new byte[valueOf3.intValue()];
                source.readByteArray(bArr3);
            } else {
                bArr3 = null;
            }
            this.G = bArr3;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(source.readInt());
            if (!(valueOf4.intValue() > 0)) {
                valueOf4 = null;
            }
            if (valueOf4 != null) {
                bArr4 = new byte[valueOf4.intValue()];
                source.readByteArray(bArr4);
            } else {
                bArr4 = null;
            }
            this.H = bArr4;
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(source.readInt());
            if (valueOf5.intValue() <= 0) {
                z17 = false;
            }
            if (!z17) {
                valueOf5 = null;
            }
            if (valueOf5 != null) {
                bArr5 = new byte[valueOf5.intValue()];
                source.readByteArray(bArr5);
            }
            this.I = bArr5;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WxUdrResource", e17, "read ByteArray exception", new java.lang.Object[0]);
        }
        this.f278001y = source.readString();
        this.f278002z = source.readString();
        this.A = source.readInt();
        this.B = source.readString();
        this.C = source.readInt();
        this.D = source.readLong();
        this.E = source.readString();
    }
}
