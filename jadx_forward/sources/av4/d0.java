package av4;

/* loaded from: classes.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f95812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f95812d = c22633x83752a59;
        this.f95813e = str;
        this.f95814f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            this.f95812d.mo14660x738236e6(this.f95813e, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.OpenWeAppForWebSearchJSApi", e17, "notifyWebView fail, event=" + this.f95814f, new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
