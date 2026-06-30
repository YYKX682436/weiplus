package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.NativeFileSystem */
/* loaded from: classes12.dex */
public class C22758x1f6ac662 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22758x1f6ac662> f39820x681a0c0c = new com.p314xaae8f345.mm.vfs.y3();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294270e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.h4 f294271f;

    public C22758x1f6ac662(java.lang.String str) {
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, false);
        com.p314xaae8f345.mm.vfs.f1 f1Var = new com.p314xaae8f345.mm.vfs.f1(l17);
        this.f294270e = f1Var;
        if (l17.isEmpty()) {
            this.f294271f = new com.p314xaae8f345.mm.vfs.h4(this, l17);
        } else {
            this.f294271f = f1Var.f294455b != null ? null : new com.p314xaae8f345.mm.vfs.h4(this, l17);
        }
    }

    public static java.io.FileNotFoundException c(java.lang.Exception exc) {
        if (exc instanceof java.io.FileNotFoundException) {
            return (java.io.FileNotFoundException) exc;
        }
        if (exc instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) exc);
        }
        java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException(exc.getMessage());
        fileNotFoundException.initCause(exc);
        return fileNotFoundException;
    }

    public static int d(java.lang.String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new java.lang.IllegalArgumentException("Invalid mode: " + str);
    }

    public static boolean f(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        boolean z17 = true;
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                z17 &= file2.isDirectory() ? f(file2) : file2.delete();
            }
        }
        return file.delete() & z17;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.vfs.q2 b(java.util.Map map) {
        com.p314xaae8f345.mm.vfs.h4 h4Var = this.f294271f;
        if (h4Var != null) {
            return h4Var;
        }
        java.lang.String a17 = this.f294270e.a(map);
        return a17 == null ? com.p314xaae8f345.mm.vfs.C22759xc55eb7d2.f() : new com.p314xaae8f345.mm.vfs.h4(this, a17);
    }

    /* renamed from: equals */
    public boolean m82327xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.vfs.C22758x1f6ac662) {
            if (this.f294270e.m82387xb2c87fbf(((com.p314xaae8f345.mm.vfs.C22758x1f6ac662) obj).f294270e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m82328x8cdac1b() {
        return com.p314xaae8f345.mm.vfs.C22758x1f6ac662.class.hashCode() ^ this.f294270e.m82388x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m82329x9616526c() {
        return this.f294270e.m82389x9616526c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22758x1f6ac662.class, 2);
        parcel.writeString(this.f294270e.f294454a);
    }

    public C22758x1f6ac662(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22758x1f6ac662.class, 2);
        java.lang.String readString = parcel.readString();
        java.lang.String l17 = readString == null ? "" : com.p314xaae8f345.mm.vfs.e8.l(readString, true, false);
        com.p314xaae8f345.mm.vfs.f1 f1Var = new com.p314xaae8f345.mm.vfs.f1(l17);
        this.f294270e = f1Var;
        if (l17.isEmpty()) {
            this.f294271f = new com.p314xaae8f345.mm.vfs.h4(this, l17);
        } else {
            this.f294271f = f1Var.f294455b != null ? null : new com.p314xaae8f345.mm.vfs.h4(this, l17);
        }
    }
}
