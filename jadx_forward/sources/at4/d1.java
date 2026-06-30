package at4;

/* loaded from: classes4.dex */
public class d1 extends dm.bc {

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f95355z = dm.bc.m124825x3593deb(at4.d1.class);

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f95356x = new java.util.ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public android.util.SparseArray f95357y;

    public d1() {
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f95357y = new android.util.SparseArray();
    }

    @Override // dm.bc, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        super.mo9015xbf5d97fd(cursor);
        java.lang.String str = this.f66014xf3aed220;
        java.lang.String str2 = this.f66016x6fd7cd82;
        java.lang.String str3 = this.f66013xfa13de0c;
        java.lang.String str4 = this.f66017xd12590f2;
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f95356x = bt4.d.h(new org.json.JSONArray(str));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletFunciontListInfo", e17, "", new java.lang.Object[0]);
        }
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                bt4.d.i(new org.json.JSONArray(str2));
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletFunciontListInfo", e18, "", new java.lang.Object[0]);
        }
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                bt4.d.g(new org.json.JSONArray(str3));
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletFunciontListInfo", e19, "", new java.lang.Object[0]);
        }
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                return;
            }
            this.f95357y = bt4.d.k(new org.json.JSONArray(str4));
        } catch (java.lang.Exception e27) {
            this.f95357y = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletFunciontListInfo", e27, "", new java.lang.Object[0]);
        }
    }

    @Override // dm.bc, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f95355z;
    }
}
