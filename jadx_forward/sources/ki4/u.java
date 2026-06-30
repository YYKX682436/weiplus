package ki4;

/* loaded from: classes9.dex */
public final class u implements bi4.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ki4.x f389687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f389689c;

    public u(ki4.x xVar, java.lang.String str, android.content.Context context) {
        this.f389687a = xVar;
        this.f389688b = str;
        this.f389689c = context;
    }

    @Override // bi4.v0
    public final void a(boolean z17, java.util.List list) {
        android.content.Context context = this.f389689c;
        if (z17) {
            this.f389687a.Bi(this.f389688b, context);
        } else {
            db5.e1.s(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8), "");
        }
    }
}
