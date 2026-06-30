package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes10.dex */
public final class x90 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f209828e = {l75.n0.m145250x3fdc6f77(so2.i3.L1, "FinderMediaCacheInfoV4")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f209829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(l75.k0 db6) {
        super(db6, so2.i3.L1, "FinderMediaCacheInfoV4", dm.w4.L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = so2.i3.L1;
        this.f209829d = db6;
    }

    public final java.util.LinkedList D0(java.lang.String originMediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originMediaId, "originMediaId");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor B = this.f209829d.B("select *, rowid from FinderMediaCacheInfoV4  where originMediaId = '" + originMediaId + "' ", null);
        if (B != null) {
            try {
                B.moveToFirst();
                while (!B.isAfterLast()) {
                    so2.i3 i3Var = new so2.i3();
                    i3Var.mo9015xbf5d97fd(B);
                    linkedList.add(i3Var);
                    B.moveToNext();
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return linkedList;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(so2.i3 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return super.mo880xb970c2b9(item);
    }

    public final boolean L0(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        android.database.Cursor B = this.f209829d.B("select *, rowid from FinderMediaCacheInfoV4  where mediaId = '" + mediaId + "' ", null);
        if (B != null) {
            try {
                r0 = B.getCount() > 0;
                vz5.b.a(B, null);
            } finally {
            }
        }
        return r0;
    }

    public final boolean P0(so2.i3 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.ContentValues mo9763xeb27878e = item.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        java.lang.String mo145255x88e404c3 = mo145255x88e404c3();
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.String asString = mo9763xeb27878e.getAsString("mediaId");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (asString == null) {
            asString = "";
        }
        strArr[0] = asString;
        boolean z18 = this.f209829d.p(mo145255x88e404c3, mo9763xeb27878e, "mediaId = ?", strArr) > 0;
        if (z18) {
            m145262xf35bbb4();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMediaCacheStorage", "[update] failure. " + item.f68981xaca5bdda);
        }
        return z18;
    }

    public final java.util.LinkedList y0(long j17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor B = this.f209829d.B("select *, rowid from FinderMediaCacheInfoV4  where feedId = '" + j17 + "' ", null);
        if (B != null) {
            try {
                B.moveToFirst();
                while (!B.isAfterLast()) {
                    so2.i3 i3Var = new so2.i3();
                    i3Var.mo9015xbf5d97fd(B);
                    linkedList.add(i3Var);
                    B.moveToNext();
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return linkedList;
    }

    public final so2.i3 z0(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        so2.i3 i3Var = new so2.i3();
        i3Var.f68981xaca5bdda = mediaId;
        jz5.f0 f0Var = null;
        android.database.Cursor B = this.f209829d.B("select *, rowid from FinderMediaCacheInfoV4  where mediaId = '" + mediaId + "' ", null);
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    i3Var.mo9015xbf5d97fd(B);
                }
                vz5.b.a(B, null);
                f0Var = jz5.f0.f384359a;
            } finally {
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderMediaCacheStorage", "getByMediaId mediaId:" + mediaId + ", cursor is null.");
        }
        return i3Var;
    }
}
