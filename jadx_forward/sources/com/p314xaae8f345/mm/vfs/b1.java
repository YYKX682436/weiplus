package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f294329a;

    /* renamed from: b, reason: collision with root package name */
    public final int f294330b;

    /* renamed from: c, reason: collision with root package name */
    public final int f294331c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f294332d;

    /* renamed from: e, reason: collision with root package name */
    public long f294333e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f294334f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f294335g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f294336h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f294337i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f294338j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f294339k = false;

    public b1(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f294329a = str;
        this.f294330b = i17;
        this.f294331c = i18;
        this.f294332d = str2;
    }

    public abstract boolean a(com.p314xaae8f345.mm.vfs.a1 a1Var);

    public com.p314xaae8f345.mm.vfs.a1 b() {
        if (this.f294339k) {
            return new com.p314xaae8f345.mm.vfs.a1(this.f294329a, this.f294330b, this.f294331c, this.f294332d, this.f294333e, this.f294334f, this.f294335g, this.f294336h, this.f294337i, this.f294338j, 0L, 0L);
        }
        return null;
    }

    public boolean c(com.p314xaae8f345.mm.vfs.a1 a1Var) {
        if (!a(a1Var)) {
            return false;
        }
        int i17 = this.f294334f;
        if (i17 == 0) {
            this.f294338j = a1Var.f294307j;
        } else {
            this.f294338j = (((this.f294338j * i17) + a1Var.f294307j) + a1Var.f294303f) / (r3 + i17);
        }
        this.f294333e += a1Var.f294302e;
        this.f294334f = i17 + a1Var.f294303f;
        this.f294335g += a1Var.f294304g;
        int i18 = this.f294336h;
        int i19 = a1Var.f294305h;
        if (i19 > i18) {
            this.f294336h = i19;
        }
        long j17 = this.f294337i;
        long j18 = a1Var.f294306i;
        if (j18 > j17) {
            this.f294337i = j18;
        }
        this.f294339k = true;
        return true;
    }

    /* renamed from: equals */
    public boolean m82367xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.b1)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.b1 b1Var = (com.p314xaae8f345.mm.vfs.b1) obj;
        return java.util.Objects.equals(this.f294329a, b1Var.f294329a) && java.util.Objects.equals(this.f294332d, b1Var.f294332d) && this.f294330b == b1Var.f294330b && this.f294331c == b1Var.f294331c;
    }

    /* renamed from: hashCode */
    public int m82368x8cdac1b() {
        return ((this.f294329a.hashCode() ^ this.f294332d.hashCode()) ^ (this.f294330b << 16)) ^ this.f294331c;
    }
}
