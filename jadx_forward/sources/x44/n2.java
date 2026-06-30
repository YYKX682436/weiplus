package x44;

/* loaded from: classes4.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.t2 f533401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f533402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(x44.t2 t2Var, ca4.b0 b0Var, java.lang.String str) {
        super(2);
        this.f533401d = t2Var;
        this.f533402e = b0Var;
        this.f533403f = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$doAction$2");
        ((java.lang.Number) obj).intValue();
        java.lang.String newQrl = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$doAction$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newQrl, "newQrl");
        if (newQrl.length() == 0) {
            newQrl = this.f533403f;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$work", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
        this.f533401d.p(newQrl, this.f533402e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$work", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$doAction$2");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$doAction$2");
        return f0Var;
    }
}
