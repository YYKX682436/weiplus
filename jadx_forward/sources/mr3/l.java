package mr3;

/* loaded from: classes10.dex */
public final class l extends xm3.a {

    /* renamed from: n, reason: collision with root package name */
    public static final mr3.k f412407n = new mr3.k(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f412408d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f412409e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412410f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f412411g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f412412h;

    /* renamed from: i, reason: collision with root package name */
    public int f412413i;

    /* renamed from: m, reason: collision with root package name */
    public final int f412414m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ l(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, int r12, int r13, p3321xbce91901.jvm.p3324x21ffc6bd.i r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            java.lang.String r0 = ""
            if (r14 == 0) goto L8
            r14 = r0
            goto L9
        L8:
            r14 = r6
        L9:
            r6 = r13 & 2
            if (r6 == 0) goto Le
            goto Lf
        Le:
            r0 = r7
        Lf:
            r6 = r13 & 4
            r7 = 0
            if (r6 == 0) goto L16
            r1 = r7
            goto L17
        L16:
            r1 = r8
        L17:
            r6 = r13 & 8
            if (r6 == 0) goto L1d
            r2 = r7
            goto L1e
        L1d:
            r2 = r9
        L1e:
            r6 = r13 & 16
            if (r6 == 0) goto L2a
            i21.q r6 = i21.q.h()
            java.lang.String r10 = r6.d(r0, r1)
        L2a:
            r3 = r10
            r6 = r13 & 32
            r7 = 0
            if (r6 == 0) goto L32
            r4 = r7
            goto L33
        L32:
            r4 = r11
        L33:
            r6 = r13 & 64
            if (r6 == 0) goto L39
            r13 = r7
            goto L3a
        L39:
            r13 = r12
        L3a:
            r6 = r5
            r7 = r14
            r8 = r0
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mr3.l.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, kotlin.jvm.internal.i):void");
    }

    public static mr3.l n(mr3.l lVar, java.lang.String fileName, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            fileName = lVar.f412408d;
        }
        if ((i19 & 2) != 0) {
            str = lVar.f412409e;
        }
        java.lang.String username = str;
        if ((i19 & 4) != 0) {
            str2 = lVar.f412410f;
        }
        java.lang.String str5 = str2;
        if ((i19 & 8) != 0) {
            str3 = lVar.f412411g;
        }
        java.lang.String str6 = str3;
        if ((i19 & 16) != 0) {
            str4 = lVar.f412412h;
        }
        java.lang.String str7 = str4;
        if ((i19 & 32) != 0) {
            i17 = lVar.f412413i;
        }
        int i27 = i17;
        if ((i19 & 64) != 0) {
            i18 = lVar.f412414m;
        }
        lVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return new mr3.l(fileName, username, str5, str6, str7, i27, i18);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        mr3.l other = (mr3.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this, other) && o() == other.o();
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        mr3.l other = (mr3.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f412413i, other.f412413i);
    }

    @Override // xm3.a
    /* renamed from: equals */
    public boolean mo148314xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr3.l)) {
            return false;
        }
        mr3.l lVar = (mr3.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412408d, lVar.f412408d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412409e, lVar.f412409e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412410f, lVar.f412410f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412411g, lVar.f412411g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412412h, lVar.f412412h) && this.f412413i == lVar.f412413i && this.f412414m == lVar.f412414m;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f412413i;
    }

    @Override // xm3.a
    /* renamed from: hashCode */
    public int mo148315x8cdac1b() {
        int hashCode = ((this.f412408d.hashCode() * 31) + this.f412409e.hashCode()) * 31;
        java.lang.String str = this.f412410f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f412411g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f412412h;
        return ((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f412413i)) * 31) + java.lang.Integer.hashCode(this.f412414m);
    }

    public final boolean o() {
        java.lang.String str = this.f412412h;
        if (str == null) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m148316x9616526c() {
        return "DescImageData(fileName=" + this.f412408d + ", username=" + this.f412409e + ", url=" + this.f412410f + ", aesKey=" + this.f412411g + ", fullPath=" + this.f412412h + ", type=" + this.f412413i + ", addSource=" + this.f412414m + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f412408d;
    }

    public l(java.lang.String fileName, java.lang.String username, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f412408d = fileName;
        this.f412409e = username;
        this.f412410f = str;
        this.f412411g = str2;
        this.f412412h = str3;
        this.f412413i = i17;
        this.f412414m = i18;
    }
}
