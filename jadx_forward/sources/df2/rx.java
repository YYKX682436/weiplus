package df2;

/* loaded from: classes.dex */
public final class rx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f312806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f312807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(java.lang.String str, int i17, android.content.Context context) {
        super(0);
        this.f312805d = str;
        this.f312806e = i17;
        this.f312807f = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f312805d;
        if (str != null) {
            int i17 = this.f312806e;
            android.content.Context context = this.f312807f;
            if (i17 == 1) {
                db5.t7.m123883x26a183b(context, str, 1).show();
            } else if (i17 != 2) {
                db5.t7.m123883x26a183b(context, str, 1).show();
            } else {
                db5.t7.m(context, str);
            }
        }
        return jz5.f0.f384359a;
    }
}
