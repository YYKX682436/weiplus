package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.AccessControlFileSystem */
/* loaded from: classes12.dex */
public class C22735xee348ee4 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22735xee348ee4> f39782x681a0c0c;

    /* renamed from: h, reason: collision with root package name */
    public static final short[] f294213h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f294214i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.ThreadLocal f294215m;

    /* renamed from: n, reason: collision with root package name */
    public static final char[] f294216n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f294217o;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294218e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f294219f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294220g;

    static {
        short[] sArr = {1, 2, Short.MAX_VALUE, 8, 16, 32, 584, 130, 258, 520};
        f294213h = sArr;
        int length = sArr.length;
        f294214i = length;
        f39782x681a0c0c = new com.p314xaae8f345.mm.vfs.b();
        f294215m = new java.lang.ThreadLocal();
        f294216n = new char[]{'-', 'l', 't', 'x'};
        f294217o = new byte[length];
    }

    public C22735xee348ee4(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, java.lang.String str) {
        this.f294218e = interfaceC22750xe27c22eb;
        com.p314xaae8f345.mm.vfs.f1 f1Var = new com.p314xaae8f345.mm.vfs.f1(str);
        java.lang.String a17 = f1Var.a(java.util.Collections.emptyMap());
        if (a17 != null) {
            byte[] d17 = d(a17);
            this.f294219f = d17;
            if (d17 != null) {
                this.f294220g = null;
                return;
            }
            throw new java.lang.IllegalArgumentException("Unrecognized access control list: ".concat(a17));
        }
        this.f294219f = new byte[f294214i];
        this.f294220g = f1Var;
    }

    public static void c(int i17, com.p314xaae8f345.mm.vfs.z7 z7Var) {
        java.lang.ThreadLocal threadLocal = f294215m;
        com.p314xaae8f345.mm.vfs.d dVar = (com.p314xaae8f345.mm.vfs.d) threadLocal.get();
        if (dVar == null) {
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
            threadLocal.set(new com.p314xaae8f345.mm.vfs.d(i17, m17.f294799a, m17.f294800b));
        } else {
            java.io.StringWriter stringWriter = new java.io.StringWriter(1024);
            dVar.f294424d.printStackTrace(new java.io.PrintWriter(stringWriter));
            throw new java.lang.AssertionError("Acquired token not released:\n" + stringWriter);
        }
    }

    public static byte[] d(java.lang.String str) {
        int i17 = f294214i;
        byte[] bArr = new byte[i17];
        for (int i18 = 0; i18 < java.lang.Math.min(str.length(), i17); i18++) {
            char charAt = str.charAt(i18);
            if (charAt != '-') {
                if (charAt != 'L') {
                    if (charAt != 'T') {
                        if (charAt != 'X') {
                            if (charAt != 'l') {
                                if (charAt != 't') {
                                    if (charAt != 'x') {
                                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("VFS.AccessControlFileSystem", "Unrecognized access policy: " + str.charAt(i18) + ", from " + str);
                                        return null;
                                    }
                                }
                            }
                        }
                        bArr[i18] = 3;
                    }
                    bArr[i18] = 2;
                }
                bArr[i18] = 1;
            } else {
                bArr[i18] = 0;
            }
        }
        return bArr;
    }

    public static void e(int i17) {
        java.lang.ThreadLocal threadLocal = f294215m;
        com.p314xaae8f345.mm.vfs.d dVar = (com.p314xaae8f345.mm.vfs.d) threadLocal.get();
        if (dVar == null) {
            throw new java.lang.AssertionError("Token not acquired.");
        }
        if (dVar.f294421a != i17) {
            throw new java.lang.AssertionError("Previous token access not matched.");
        }
        threadLocal.remove();
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        byte[] bArr;
        java.lang.String a17;
        com.p314xaae8f345.mm.vfs.f1 f1Var = this.f294220g;
        if (f1Var == null || (a17 = f1Var.a(map)) == null || (bArr = d(a17)) == null) {
            bArr = this.f294219f;
        }
        com.p314xaae8f345.mm.vfs.q2 q2Var = (com.p314xaae8f345.mm.vfs.q2) this.f294218e.b(map);
        return (q2Var == com.p314xaae8f345.mm.vfs.C22759xc55eb7d2.f() || java.util.Arrays.equals(bArr, f294217o)) ? q2Var : new com.p314xaae8f345.mm.vfs.c(this, q2Var, bArr, map);
    }

    /* renamed from: equals */
    public boolean m82276xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.C22735xee348ee4)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.C22735xee348ee4 c22735xee348ee4 = (com.p314xaae8f345.mm.vfs.C22735xee348ee4) obj;
        return this.f294218e.equals(c22735xee348ee4.f294218e) && java.util.Arrays.equals(this.f294219f, c22735xee348ee4.f294219f) && com.p314xaae8f345.mm.vfs.e8.f(this.f294220g, c22735xee348ee4.f294220g);
    }

    /* renamed from: hashCode */
    public int m82277x8cdac1b() {
        int hashCode = com.p314xaae8f345.mm.vfs.C22735xee348ee4.class.hashCode();
        java.lang.Object[] objArr = {this.f294218e, this.f294219f, this.f294220g};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    /* renamed from: toString */
    public java.lang.String m82278x9616526c() {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (this.f294220g == null) {
            int i17 = f294214i;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(i17);
            for (int i18 = 0; i18 < i17; i18++) {
                sb6.append(f294216n[this.f294219f[i18]]);
            }
            str = sb6.toString();
        } else {
            str = "...";
        }
        objArr[0] = str;
        objArr[1] = this.f294218e;
        return java.lang.String.format("ac(%s) <- %s", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22735xee348ee4.class, 1);
        parcel.writeParcelable(this.f294218e, i17);
        parcel.writeByteArray(this.f294219f);
        com.p314xaae8f345.mm.vfs.f1 f1Var = this.f294220g;
        parcel.writeString(f1Var == null ? null : f1Var.f294454a);
    }

    public C22735xee348ee4(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22735xee348ee4.class, 1);
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
        this.f294218e = interfaceC22750xe27c22eb;
        if (interfaceC22750xe27c22eb != null) {
            byte[] bArr = new byte[f294214i];
            this.f294219f = bArr;
            parcel.readByteArray(bArr);
            java.lang.String readString = parcel.readString();
            this.f294220g = readString == null ? null : new com.p314xaae8f345.mm.vfs.f1(readString);
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
