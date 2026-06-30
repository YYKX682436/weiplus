package ea2;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f332084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.iw2 f332085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, android.content.Context context, r45.iw2 iw2Var) {
        super(1);
        this.f332083d = str;
        this.f332084e = context;
        this.f332085f = iw2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = this.f332083d;
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "OpenLiteApp: " + str + " sucess");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "OpenLiteApp: " + str + " failed");
            java.lang.String m75945x2fec8307 = this.f332085f.m75945x2fec8307(2);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", m75945x2fec8307);
                j45.l.j(this.f332084e, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
