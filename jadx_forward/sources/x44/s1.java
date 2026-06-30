package x44;

/* loaded from: classes4.dex */
public final class s1 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q64.b f533419a;

    public s1(q64.b bVar) {
        this.f533419a = bVar;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState$onServerRun$2");
        boolean b17 = obj instanceof java.lang.Integer ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 513) : false;
        q64.b bVar = this.f533419a;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("error", i18);
            bundle.putBoolean("noticed", b17);
            ((r64.b) bVar).e(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState$onServerRun$2");
    }
}
