package k64;

/* loaded from: classes.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f386120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f386120d = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$1");
        k64.b r17 = (k64.b) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        yz5.l lVar = (yz5.l) this.f386120d.get();
        if (lVar != null) {
            lVar.mo146xb9724478(r17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiRequestHelper", "callback ref is invoke ".concat(lVar == null ? "null" : "func"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$1");
        return f0Var;
    }
}
