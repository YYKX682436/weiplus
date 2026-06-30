package at4;

/* loaded from: classes4.dex */
public class d1 extends dm.bc {

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f13822z = dm.bc.initAutoDBInfo(at4.d1.class);

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f13823x = new java.util.ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public android.util.SparseArray f13824y;

    public d1() {
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f13824y = new android.util.SparseArray();
    }

    @Override // dm.bc, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
        java.lang.String str = this.field_function_list;
        java.lang.String str2 = this.field_new_list;
        java.lang.String str3 = this.field_banner_list;
        java.lang.String str4 = this.field_type_name_list;
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f13823x = bt4.d.h(new org.json.JSONArray(str));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletFunciontListInfo", e17, "", new java.lang.Object[0]);
        }
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                bt4.d.i(new org.json.JSONArray(str2));
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletFunciontListInfo", e18, "", new java.lang.Object[0]);
        }
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                bt4.d.g(new org.json.JSONArray(str3));
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletFunciontListInfo", e19, "", new java.lang.Object[0]);
        }
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                return;
            }
            this.f13824y = bt4.d.k(new org.json.JSONArray(str4));
        } catch (java.lang.Exception e27) {
            this.f13824y = null;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletFunciontListInfo", e27, "", new java.lang.Object[0]);
        }
    }

    @Override // dm.bc, l75.f0
    public l75.e0 getDBInfo() {
        return f13822z;
    }
}
