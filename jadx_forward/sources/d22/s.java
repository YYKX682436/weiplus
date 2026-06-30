package d22;

/* loaded from: classes4.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f307406f;

    public s(java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f307404d = str;
        this.f307405e = str2;
        this.f307406f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadLiteApp: ");
        java.lang.String str = this.f307404d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", sb6.toString());
        q80.e0 e0Var = new q80.e0();
        e0Var.f442208a = str;
        e0Var.f442209b = this.f307405e;
        e0Var.f442211d = false;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Rj(this.f307406f, e0Var);
    }
}
