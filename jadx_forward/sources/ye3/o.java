package ye3;

/* loaded from: classes15.dex */
public final class o extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f542763e = {l75.n0.m145250x3fdc6f77(ye3.n.Q, "MBThumbPlayerMediaInfoDbCache")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f542764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l75.k0 db6) {
        super(db6, ye3.n.Q, "MBThumbPlayerMediaInfoDbCache", dm.w7.f322361w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = ye3.n.Q;
        this.f542764d = db6;
    }

    public final boolean D0(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (r26.n0.N(mediaId)) {
            return false;
        }
        try {
            android.database.Cursor B = this.f542764d.B("SELECT 1 FROM MBThumbPlayerMediaInfoDbCache WHERE mediaId = ? LIMIT 1", new java.lang.String[]{mediaId});
            if (B == null) {
                return false;
            }
            try {
                boolean z17 = B.getCount() > 0;
                vz5.b.a(B, null);
                return z17;
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "[isExist] query failed. mediaId=".concat(mediaId), e17);
            return false;
        }
    }

    public final boolean J0(ye3.n item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = item.f69010xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MB_External_surface_DB", "[update] mediaId is blank, skip");
            return false;
        }
        android.content.ContentValues mo9763xeb27878e = item.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        boolean z17 = this.f542764d.p("MBThumbPlayerMediaInfoDbCache", mo9763xeb27878e, "mediaId = ?", new java.lang.String[]{str}) > 0;
        if (z17) {
            m145262xf35bbb4();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[update] success. mediaId=" + str + " state=" + item.f69013x29d3a50c);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "[update] failed. mediaId=" + str + " item=" + item);
        }
        return z17;
    }

    public final ye3.n y0(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (r26.n0.N(mediaId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MB_External_surface_DB", "[getByMediaId] mediaId is blank, return empty entity");
            return new ye3.n();
        }
        ye3.n nVar = new ye3.n();
        try {
            android.database.Cursor B = this.f542764d.B("SELECT *, rowid FROM MBThumbPlayerMediaInfoDbCache WHERE mediaId = ?", new java.lang.String[]{mediaId});
            jz5.f0 f0Var = null;
            if (B != null) {
                try {
                    if (B.moveToFirst()) {
                        nVar.mo9015xbf5d97fd(B);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[getByMediaId] found. mediaId=".concat(mediaId));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[getByMediaId] not found. mediaId=".concat(mediaId));
                    }
                    vz5.b.a(B, null);
                    f0Var = jz5.f0.f384359a;
                } finally {
                }
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MB_External_surface_DB", "[getByMediaId] cursor is null. mediaId=".concat(mediaId));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "[getByMediaId] query failed. mediaId=".concat(mediaId), e17);
        }
        return nVar;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(ye3.n item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo880xb970c2b9 = super.mo880xb970c2b9(item);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[insert] mediaId=" + item.f69010xaca5bdda + " ret=" + mo880xb970c2b9);
        return mo880xb970c2b9;
    }
}
