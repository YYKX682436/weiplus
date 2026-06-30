package x44;

/* loaded from: classes4.dex */
public final class p2 extends k64.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f533409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(yz5.p pVar) {
        super(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74);
        this.f533409e = pVar;
    }

    @Override // k64.s
    public void b(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$request$1");
        yz5.p pVar = this.f533409e;
        if (i17 == 0 && (m1Var instanceof ib4.m)) {
            java.lang.Object obj = null;
            try {
                java.lang.Object a17 = k64.t.a(m1Var);
                if (a17 instanceof r45.fm3) {
                    obj = a17;
                }
            } catch (java.lang.Throwable unused) {
            }
            r45.fm3 fm3Var = (r45.fm3) obj;
            if (fm3Var != null) {
                java.lang.String str = fm3Var.f455974d;
                if (!(str == null || str.length() == 0)) {
                    java.lang.String url = fm3Var.f455974d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
                    pVar.mo149xb9724478(0, url);
                }
            }
            pVar.mo149xb9724478(-1, "");
        } else {
            pVar.mo149xb9724478(-2, "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$request$1");
    }
}
