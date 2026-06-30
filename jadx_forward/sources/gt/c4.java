package gt;

/* loaded from: classes4.dex */
public class c4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (!gm0.j1.a()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonKVDataStorage", "sql:%s, updateRet : %b", "update AppBrandCommonKVData set value = '0' where key like '%_unreadCount'", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().f387321d.A("AppBrandCommonKVData", "update AppBrandCommonKVData set value = '0' where key like '%_unreadCount'")));
        return true;
    }
}
