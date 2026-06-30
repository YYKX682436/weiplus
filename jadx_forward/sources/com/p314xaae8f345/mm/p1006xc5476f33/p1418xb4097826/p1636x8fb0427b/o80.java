package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes10.dex */
public final class o80 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f208827e = {l75.n0.m145250x3fdc6f77(ya2.b2.O2, "FinderContact")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f208828f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f208829d;

    static {
        java.lang.String[] INDEX_CREATE = dm.z3.B1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INDEX_CREATE, "INDEX_CREATE");
        java.util.ArrayList arrayList = (java.util.ArrayList) kz5.z.C0(INDEX_CREATE);
        arrayList.add(0, "DROP INDEX username_index");
        f208828f = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(l75.k0 storage) {
        super(storage, ya2.b2.O2, "FinderContact", f208828f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        l75.e0 e0Var = ya2.b2.O2;
        this.f208829d = storage;
    }

    public ya2.b2 y0(java.lang.String username) {
        ya2.b2 b2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String sql = "SELECT *, rowid FROM FinderContact WHERE username = " + d95.b0.O(username);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.database.Cursor f17 = this.f208829d.f(sql, null, 2);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        new qb2.r("FinderContactStorage.getContact", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        boolean z17 = false;
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    z17 = true;
                }
            } finally {
            }
        }
        if (z17) {
            b2Var = new ya2.b2();
            b2Var.mo9015xbf5d97fd(f17);
        } else {
            b2Var = null;
        }
        vz5.b.a(f17, null);
        return b2Var;
    }
}
