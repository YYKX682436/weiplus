package az2;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f16141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.k41 f16142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16143f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.app.Activity activity, r45.k41 k41Var, int i17) {
        super(1);
        this.f16141d = activity;
        this.f16142e = k41Var;
        this.f16143f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            java.lang.String string = this.f16142e.getString(3);
            android.app.Activity context = this.f16141d;
            kotlin.jvm.internal.o.g(context, "context");
            if (!(string == null || string.length() == 0)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", string);
                j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, this.f16143f);
            }
        }
        return jz5.f0.f302826a;
    }
}
