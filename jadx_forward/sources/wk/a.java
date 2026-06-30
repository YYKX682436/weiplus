package wk;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5391x7c978347 c5391x7c978347 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5391x7c978347) abstractC20979x809547d1;
        if (p94.w0.e() == null) {
            return true;
        }
        am.d8 d8Var = c5391x7c978347.f135728h;
        p94.l0 e17 = p94.w0.e();
        java.lang.String str2 = c5391x7c978347.f135727g.f87871a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2) e17;
        f2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        f2Var.o2();
        if (f2Var.b3(str2)) {
            str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 )  AND " + f2Var.p1(str2);
        } else {
            str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
        }
        android.database.Cursor B = f2Var.f247527d.B(str + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247515o, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        d8Var.f87969a = B;
        return true;
    }
}
