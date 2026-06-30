package rn;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f479128e = {l75.n0.m145250x3fdc6f77(rn.a.f479127p, "GroupBindApp")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f479129f = {"CREATE INDEX IF NOT EXISTS GroupBindAppUserNameIndex ON GroupBindApp ( chatRoomName )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f479130d;

    public b(l75.k0 k0Var) {
        super(k0Var, rn.a.f479127p, "GroupBindApp", f479129f);
        this.f479130d = k0Var;
    }

    public r45.kt5 y0(java.lang.String str) {
        android.database.Cursor E = this.f479130d.E("GroupBindApp", null, "chatRoomName =?", new java.lang.String[]{str}, null, null, null);
        try {
            if (E == null) {
                return null;
            }
            try {
                if (E.moveToNext()) {
                    rn.a aVar = new rn.a();
                    aVar.mo9015xbf5d97fd(E);
                    byte[] bArr = aVar.f65988x7e108a89;
                    if (bArr != null && bArr.length <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupBindAppStorage", "BindAppData is null");
                        return null;
                    }
                    r45.kt5 kt5Var = new r45.kt5();
                    kt5Var.mo11468x92b714fd(aVar.f65988x7e108a89);
                    return kt5Var;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupBindAppStorage", e17.getMessage());
            }
            return null;
        } finally {
            E.close();
        }
    }
}
