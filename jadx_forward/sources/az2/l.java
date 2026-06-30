package az2;

/* loaded from: classes.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f97674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.k41 f97675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f97676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.app.Activity activity, r45.k41 k41Var, int i17) {
        super(1);
        this.f97674d = activity;
        this.f97675e = k41Var;
        this.f97676f = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            java.lang.String m75945x2fec8307 = this.f97675e.m75945x2fec8307(3);
            android.app.Activity context = this.f97674d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", m75945x2fec8307);
                j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, this.f97676f);
            }
        }
        return jz5.f0.f384359a;
    }
}
