package com.google.protobuf;

/* loaded from: classes16.dex */
public final class g2 extends com.google.protobuf.u5 {
    public static final com.google.protobuf.g2 E = new com.google.protobuf.g2();
    public static final com.google.protobuf.e9 F = new com.google.protobuf.d2();
    public volatile java.lang.Object A;
    public volatile java.lang.Object B;
    public java.util.List C;
    public byte D;

    /* renamed from: e, reason: collision with root package name */
    public int f45102e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f45103f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.Object f45104g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45105h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45106i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f45107m;

    /* renamed from: n, reason: collision with root package name */
    public int f45108n;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.lang.Object f45109o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f45110p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f45111q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f45112r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f45113s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f45114t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f45115u;

    /* renamed from: v, reason: collision with root package name */
    public volatile java.lang.Object f45116v;

    /* renamed from: w, reason: collision with root package name */
    public volatile java.lang.Object f45117w;

    /* renamed from: x, reason: collision with root package name */
    public volatile java.lang.Object f45118x;

    /* renamed from: y, reason: collision with root package name */
    public volatile java.lang.Object f45119y;

    /* renamed from: z, reason: collision with root package name */
    public volatile java.lang.Object f45120z;

    public g2(com.google.protobuf.s5 s5Var, com.google.protobuf.o0 o0Var) {
        super(s5Var);
        this.D = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.g2)) {
            return super.equals(obj);
        }
        com.google.protobuf.g2 g2Var = (com.google.protobuf.g2) obj;
        int i17 = this.f45102e;
        if (((i17 & 1) != 0) != ((g2Var.f45102e & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !n().equals(g2Var.n())) {
            return false;
        }
        int i18 = this.f45102e;
        if (((i18 & 2) != 0) != ((g2Var.f45102e & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && !m().equals(g2Var.m())) {
            return false;
        }
        int i19 = this.f45102e;
        boolean z17 = (i19 & 4) != 0;
        int i27 = g2Var.f45102e;
        if (z17 != ((i27 & 4) != 0)) {
            return false;
        }
        if (((i19 & 4) != 0) && this.f45105h != g2Var.f45105h) {
            return false;
        }
        if (((i19 & 8) != 0) != ((i27 & 8) != 0)) {
            return false;
        }
        if (((i19 & 8) != 0) && this.f45106i != g2Var.f45106i) {
            return false;
        }
        if (((i19 & 16) != 0) != ((i27 & 16) != 0)) {
            return false;
        }
        if (((i19 & 16) != 0) && this.f45107m != g2Var.f45107m) {
            return false;
        }
        if (((i19 & 32) != 0) != ((i27 & 32) != 0)) {
            return false;
        }
        if (((i19 & 32) != 0) && this.f45108n != g2Var.f45108n) {
            return false;
        }
        if (((i19 & 64) != 0) != ((i27 & 64) != 0)) {
            return false;
        }
        if (((i19 & 64) != 0) && !l().equals(g2Var.l())) {
            return false;
        }
        int i28 = this.f45102e;
        boolean z18 = (i28 & 128) != 0;
        int i29 = g2Var.f45102e;
        if (z18 != ((i29 & 128) != 0)) {
            return false;
        }
        if (((i28 & 128) != 0) && this.f45110p != g2Var.f45110p) {
            return false;
        }
        if (((i28 & 256) != 0) != ((i29 & 256) != 0)) {
            return false;
        }
        if (((i28 & 256) != 0) && this.f45111q != g2Var.f45111q) {
            return false;
        }
        if (((i28 & 512) != 0) != ((i29 & 512) != 0)) {
            return false;
        }
        if (((i28 & 512) != 0) && this.f45112r != g2Var.f45112r) {
            return false;
        }
        if (((i28 & 1024) != 0) != ((i29 & 1024) != 0)) {
            return false;
        }
        if (((i28 & 1024) != 0) && this.f45113s != g2Var.f45113s) {
            return false;
        }
        if (((i28 & 2048) != 0) != ((i29 & 2048) != 0)) {
            return false;
        }
        if (((i28 & 2048) != 0) && this.f45114t != g2Var.f45114t) {
            return false;
        }
        if (((i28 & 4096) != 0) != ((i29 & 4096) != 0)) {
            return false;
        }
        if (((i28 & 4096) != 0) && this.f45115u != g2Var.f45115u) {
            return false;
        }
        if (((i28 & 8192) != 0) != ((i29 & 8192) != 0)) {
            return false;
        }
        if (((i28 & 8192) != 0) && !o().equals(g2Var.o())) {
            return false;
        }
        int i37 = this.f45102e;
        if (((i37 & 16384) != 0) != ((g2Var.f45102e & 16384) != 0)) {
            return false;
        }
        if ((((i37 & 16384) != 0) && !k().equals(g2Var.k())) || y() != g2Var.y()) {
            return false;
        }
        if ((y() && !t().equals(g2Var.t())) || u() != g2Var.u()) {
            return false;
        }
        if ((u() && !p().equals(g2Var.p())) || w() != g2Var.w()) {
            return false;
        }
        if ((w() && !r().equals(g2Var.r())) || v() != g2Var.v()) {
            return false;
        }
        if ((!v() || q().equals(g2Var.q())) && x() == g2Var.x()) {
            return (!x() || s().equals(g2Var.s())) && this.C.equals(g2Var.C) && this.unknownFields.equals(g2Var.unknownFields) && h().equals(g2Var.h());
        }
        return false;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return E;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f45102e & 1) != 0 ? com.google.protobuf.l6.computeStringSize(1, this.f45103f) + 0 : 0;
        if ((this.f45102e & 2) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(8, this.f45104g);
        }
        if ((this.f45102e & 32) != 0) {
            computeStringSize += com.google.protobuf.k0.f(9, this.f45108n);
        }
        if ((this.f45102e & 4) != 0) {
            computeStringSize += com.google.protobuf.k0.b(10, this.f45105h);
        }
        if ((this.f45102e & 64) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(11, this.f45109o);
        }
        if ((this.f45102e & 128) != 0) {
            computeStringSize += com.google.protobuf.k0.b(16, this.f45110p);
        }
        if ((this.f45102e & 256) != 0) {
            computeStringSize += com.google.protobuf.k0.b(17, this.f45111q);
        }
        if ((this.f45102e & 512) != 0) {
            computeStringSize += com.google.protobuf.k0.b(18, this.f45112r);
        }
        if ((this.f45102e & 8) != 0) {
            computeStringSize += com.google.protobuf.k0.b(20, this.f45106i);
        }
        if ((this.f45102e & 2048) != 0) {
            computeStringSize += com.google.protobuf.k0.b(23, this.f45114t);
        }
        if ((this.f45102e & 16) != 0) {
            computeStringSize += com.google.protobuf.k0.b(27, this.f45107m);
        }
        if ((this.f45102e & 4096) != 0) {
            computeStringSize += com.google.protobuf.k0.b(31, this.f45115u);
        }
        if ((this.f45102e & 8192) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(36, this.f45116v);
        }
        if ((this.f45102e & 16384) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(37, this.f45117w);
        }
        if ((this.f45102e & 32768) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(39, this.f45118x);
        }
        if ((this.f45102e & 65536) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(40, this.f45119y);
        }
        if ((this.f45102e & 131072) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(41, this.f45120z);
        }
        if ((this.f45102e & 1024) != 0) {
            computeStringSize += com.google.protobuf.k0.b(42, this.f45113s);
        }
        if ((this.f45102e & 262144) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(44, this.A);
        }
        if ((this.f45102e & 524288) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(45, this.B);
        }
        for (int i18 = 0; i18 < this.C.size(); i18++) {
            computeStringSize += com.google.protobuf.k0.n(999, (com.google.protobuf.o8) this.C.get(i18));
        }
        int g17 = computeStringSize + g() + this.unknownFields.getSerializedSize();
        this.memoizedSize = g17;
        return g17;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45406y.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45102e & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + n().hashCode();
        }
        if ((this.f45102e & 2) != 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + m().hashCode();
        }
        if ((this.f45102e & 4) != 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + com.google.protobuf.w6.a(this.f45105h);
        }
        if ((this.f45102e & 8) != 0) {
            hashCode = (((hashCode * 37) + 20) * 53) + com.google.protobuf.w6.a(this.f45106i);
        }
        if ((this.f45102e & 16) != 0) {
            hashCode = (((hashCode * 37) + 27) * 53) + com.google.protobuf.w6.a(this.f45107m);
        }
        int i18 = this.f45102e;
        if ((i18 & 32) != 0) {
            hashCode = (((hashCode * 37) + 9) * 53) + this.f45108n;
        }
        if ((i18 & 64) != 0) {
            hashCode = (((hashCode * 37) + 11) * 53) + l().hashCode();
        }
        if ((this.f45102e & 128) != 0) {
            hashCode = (((hashCode * 37) + 16) * 53) + com.google.protobuf.w6.a(this.f45110p);
        }
        if ((this.f45102e & 256) != 0) {
            hashCode = (((hashCode * 37) + 17) * 53) + com.google.protobuf.w6.a(this.f45111q);
        }
        if ((this.f45102e & 512) != 0) {
            hashCode = (((hashCode * 37) + 18) * 53) + com.google.protobuf.w6.a(this.f45112r);
        }
        if ((this.f45102e & 1024) != 0) {
            hashCode = (((hashCode * 37) + 42) * 53) + com.google.protobuf.w6.a(this.f45113s);
        }
        if ((this.f45102e & 2048) != 0) {
            hashCode = (((hashCode * 37) + 23) * 53) + com.google.protobuf.w6.a(this.f45114t);
        }
        if ((this.f45102e & 4096) != 0) {
            hashCode = (((hashCode * 37) + 31) * 53) + com.google.protobuf.w6.a(this.f45115u);
        }
        if ((this.f45102e & 8192) != 0) {
            hashCode = (((hashCode * 37) + 36) * 53) + o().hashCode();
        }
        if ((this.f45102e & 16384) != 0) {
            hashCode = (((hashCode * 37) + 37) * 53) + k().hashCode();
        }
        if (y()) {
            hashCode = (((hashCode * 37) + 39) * 53) + t().hashCode();
        }
        if (u()) {
            hashCode = (((hashCode * 37) + 40) * 53) + p().hashCode();
        }
        if (w()) {
            hashCode = (((hashCode * 37) + 41) * 53) + r().hashCode();
        }
        if (v()) {
            hashCode = (((hashCode * 37) + 44) * 53) + q().hashCode();
        }
        if (x()) {
            hashCode = (((hashCode * 37) + 45) * 53) + s().hashCode();
        }
        if (this.C.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.C.hashCode();
        }
        int hashFields = (com.google.protobuf.c.hashFields(hashCode, h()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45407z;
        j6Var.c(com.google.protobuf.g2.class, com.google.protobuf.e2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.D;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.C.size(); i17++) {
            if (!((com.google.protobuf.o3) this.C.get(i17)).isInitialized()) {
                this.D = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.D = (byte) 1;
            return true;
        }
        this.D = (byte) 0;
        return false;
    }

    public java.lang.String k() {
        java.lang.Object obj = this.f45117w;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45117w = r17;
        }
        return r17;
    }

    public java.lang.String l() {
        java.lang.Object obj = this.f45109o;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45109o = r17;
        }
        return r17;
    }

    public java.lang.String m() {
        java.lang.Object obj = this.f45104g;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45104g = r17;
        }
        return r17;
    }

    public java.lang.String n() {
        java.lang.Object obj = this.f45103f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45103f = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return E.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.g2();
    }

    public java.lang.String o() {
        java.lang.Object obj = this.f45116v;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45116v = r17;
        }
        return r17;
    }

    public java.lang.String p() {
        java.lang.Object obj = this.f45119y;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45119y = r17;
        }
        return r17;
    }

    public java.lang.String q() {
        java.lang.Object obj = this.A;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.A = r17;
        }
        return r17;
    }

    public java.lang.String r() {
        java.lang.Object obj = this.f45120z;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45120z = r17;
        }
        return r17;
    }

    public java.lang.String s() {
        java.lang.Object obj = this.B;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.B = r17;
        }
        return r17;
    }

    public java.lang.String t() {
        java.lang.Object obj = this.f45118x;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45118x = r17;
        }
        return r17;
    }

    public boolean u() {
        return (this.f45102e & 65536) != 0;
    }

    public boolean v() {
        return (this.f45102e & 262144) != 0;
    }

    public boolean w() {
        return (this.f45102e & 131072) != 0;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.t5 i17 = i();
        if ((this.f45102e & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f45103f);
        }
        if ((this.f45102e & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 8, this.f45104g);
        }
        if ((this.f45102e & 32) != 0) {
            k0Var.H(9, this.f45108n);
        }
        if ((this.f45102e & 4) != 0) {
            k0Var.x(10, this.f45105h);
        }
        if ((this.f45102e & 64) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 11, this.f45109o);
        }
        if ((this.f45102e & 128) != 0) {
            k0Var.x(16, this.f45110p);
        }
        if ((this.f45102e & 256) != 0) {
            k0Var.x(17, this.f45111q);
        }
        if ((this.f45102e & 512) != 0) {
            k0Var.x(18, this.f45112r);
        }
        if ((this.f45102e & 8) != 0) {
            k0Var.x(20, this.f45106i);
        }
        if ((this.f45102e & 2048) != 0) {
            k0Var.x(23, this.f45114t);
        }
        if ((this.f45102e & 16) != 0) {
            k0Var.x(27, this.f45107m);
        }
        if ((this.f45102e & 4096) != 0) {
            k0Var.x(31, this.f45115u);
        }
        if ((this.f45102e & 8192) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 36, this.f45116v);
        }
        if ((this.f45102e & 16384) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 37, this.f45117w);
        }
        if ((this.f45102e & 32768) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 39, this.f45118x);
        }
        if ((this.f45102e & 65536) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 40, this.f45119y);
        }
        if ((this.f45102e & 131072) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 41, this.f45120z);
        }
        if ((this.f45102e & 1024) != 0) {
            k0Var.x(42, this.f45113s);
        }
        if ((this.f45102e & 262144) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 44, this.A);
        }
        if ((this.f45102e & 524288) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 45, this.B);
        }
        for (int i18 = 0; i18 < this.C.size(); i18++) {
            k0Var.J(999, (com.google.protobuf.o8) this.C.get(i18));
        }
        i17.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, k0Var);
        this.unknownFields.writeTo(k0Var);
    }

    public boolean x() {
        return (this.f45102e & 524288) != 0;
    }

    public boolean y() {
        return (this.f45102e & 32768) != 0;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.e2 toBuilder() {
        if (this == E) {
            return new com.google.protobuf.e2(null);
        }
        com.google.protobuf.e2 e2Var = new com.google.protobuf.e2(null);
        e2Var.l(this);
        return e2Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return E;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return E.toBuilder();
    }

    public g2() {
        this.D = (byte) -1;
        this.f45103f = "";
        this.f45104g = "";
        this.f45108n = 1;
        this.f45109o = "";
        this.f45115u = true;
        this.f45116v = "";
        this.f45117w = "";
        this.f45118x = "";
        this.f45119y = "";
        this.f45120z = "";
        this.A = "";
        this.B = "";
        this.C = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.e2(r5Var, null);
    }
}
