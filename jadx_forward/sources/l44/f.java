package l44;

/* loaded from: classes4.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final l44.f f397658d = new l44.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v0 item = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w0 Ui = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ui();
        Ui.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteByItem", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
        java.lang.String str = "DELETE FROM AdPullRecordsInfo  where rowid = " + item.f72763xa3c65b86 + "  and snsid = '" + item.f66813x29d12d0e + "' ";
        l75.k0 k0Var = Ui.f247687d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRecordsInfoStorage", "deleteByItem " + (k0Var != null ? k0Var.A("AdPullRecordsInfo", str) : false) + ' ' + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteByItem", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
        return f0Var;
    }
}
