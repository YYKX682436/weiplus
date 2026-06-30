package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class x0 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f92340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z0 f92341b;

    public x0(android.content.Context context, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z0 z0Var) {
        this.f92340a = context;
        this.f92341b = z0Var;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        this.f92340a.getApplicationContext().unregisterComponentCallbacks(this.f92341b);
    }
}
