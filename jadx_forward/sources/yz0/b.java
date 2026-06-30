package yz0;

/* loaded from: classes15.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f550021e = {l75.n0.m145250x3fdc6f77(yz0.a.Y, "MMPlayerMediaInfoDbCache")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f550022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, yz0.a.Y, "MMPlayerMediaInfoDbCache", dm.x7.A);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = yz0.a.Y;
        this.f550022d = db6;
    }

    public final boolean D0(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        android.database.Cursor B = this.f550022d.B("select *, rowid from MMPlayerMediaInfoDbCache  where mediaId = '" + mediaId + "' ", null);
        if (B != null) {
            try {
                r0 = B.getCount() > 0;
                vz5.b.a(B, null);
            } finally {
            }
        }
        return r0;
    }

    public final boolean J0(yz0.a item) {
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
        boolean z18 = this.f550022d.p(mo145255x88e404c3, mo9763xeb27878e, "mediaId = ?", strArr) > 0;
        if (z18) {
            m145262xf35bbb4();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMediaCacheStorage", "[update] failure. " + item.f69132xaca5bdda);
        }
        return z18;
    }

    public final yz0.a y0(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        yz0.a aVar = new yz0.a();
        aVar.f69132xaca5bdda = mediaId;
        jz5.f0 f0Var = null;
        android.database.Cursor B = this.f550022d.B("select *, rowid from MMPlayerMediaInfoDbCache  where mediaId = '" + mediaId + "' ", null);
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    aVar.mo9015xbf5d97fd(B);
                }
                vz5.b.a(B, null);
                f0Var = jz5.f0.f384359a;
            } finally {
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderMediaCacheStorage", "getByMediaId mediaId:" + mediaId + ", cursor is null.");
        }
        return aVar;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(yz0.a item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return super.mo880xb970c2b9(item);
    }
}
