package w64;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f524832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f524833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w64.i f524834f;

    public g(w64.i iVar, int i17, int i18) {
        this.f524834f = iVar;
        this.f524832d = i17;
        this.f524833e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$4$1");
        w64.i iVar = this.f524834f;
        w64.n nVar = iVar.f524837b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        n74.d dVar = nVar.f524859s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        w64.n nVar2 = iVar.f524837b;
        if (dVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            android.content.Context context = nVar2.f524845e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            int i17 = nVar2.f524842b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            w64.k kVar = nVar2.f524858r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            n74.d dVar2 = new n74.d(context, i17, kVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            nVar2.f524859s = dVar2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        n74.d dVar3 = nVar2.f524859s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a17 = w64.n.a(nVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = w64.n.b(nVar2);
        dVar3.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showBottomSheet, followNum=");
        int i18 = this.f524832d;
        sb6.append(i18);
        sb6.append(", feedNum=");
        int i19 = this.f524833e;
        sb6.append(i19);
        sb6.append(", userName=");
        sb6.append(a17.f38004xa53ddf1c);
        sb6.append(", snsId=");
        sb6.append(ca4.z0.t0(b17.f68891x29d1292e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ActionBtnFollowFinderHelper", sb6.toString());
        dVar3.f416861e = a17;
        dVar3.f416860d = b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
        s34.y yVar = new s34.y();
        java.lang.String str = a17.f38004xa53ddf1c;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        yVar.f484362a = str;
        java.lang.String str2 = a17.Y;
        if (str2 == null) {
            str2 = "";
        }
        yVar.f484363b = str2;
        java.lang.String str3 = a17.Z;
        if (str3 == null) {
            str3 = "";
        }
        yVar.f484364c = str3;
        java.lang.String str4 = a17.f244105b0;
        if (str4 == null) {
            str4 = "";
        }
        yVar.f484365d = str4;
        java.lang.String str5 = a17.f244121j0;
        if (str5 == null) {
            str5 = "";
        }
        yVar.f484366e = str5;
        java.lang.String str6 = a17.f244119i0;
        if (str6 == null) {
            str6 = "";
        }
        yVar.f484367f = str6;
        java.lang.String str7 = a17.f244117h0;
        yVar.f484368g = str7 != null ? str7 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
        dVar3.f416862f = yVar;
        dVar3.d(yVar, i18, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$4$1");
    }
}
