package at4;

/* loaded from: classes9.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public android.util.SparseArray f95343a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f95344b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f95345c;

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c a(java.lang.String str) {
        java.util.List list = this.f95344b;
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBankElementManager", "hy: no element from given banktype");
            return null;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c : this.f95344b) {
            java.lang.String str2 = c19097xe6dc5b4c.f261192s;
            if (str2 != null && str2.equals(str)) {
                return c19097xe6dc5b4c;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBankElementManager", "hy: not found given banktype: %s", str);
        return null;
    }

    public java.lang.String b(android.content.Context context, int i17) {
        android.util.SparseArray sparseArray = this.f95343a;
        if (sparseArray != null) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return str;
            }
        }
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.khl);
    }
}
