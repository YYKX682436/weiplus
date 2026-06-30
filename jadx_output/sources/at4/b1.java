package at4;

/* loaded from: classes9.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public android.util.SparseArray f13810a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f13811b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f13812c;

    public com.tencent.mm.plugin.wallet_core.model.ElementQuery a(java.lang.String str) {
        java.util.List list = this.f13811b;
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletBankElementManager", "hy: no element from given banktype");
            return null;
        }
        for (com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery : this.f13811b) {
            java.lang.String str2 = elementQuery.f179659s;
            if (str2 != null && str2.equals(str)) {
                return elementQuery;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WalletBankElementManager", "hy: not found given banktype: %s", str);
        return null;
    }

    public java.lang.String b(android.content.Context context, int i17) {
        android.util.SparseArray sparseArray = this.f13810a;
        if (sparseArray != null) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return str;
            }
        }
        return context.getString(com.tencent.mm.R.string.khl);
    }
}
