package dk2;

/* loaded from: classes3.dex */
public final class r3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f315537f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(dk2.r4 r4Var, java.lang.String str, int i17) {
        super(0);
        this.f315535d = r4Var;
        this.f315536e = str;
        this.f315537f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.r4 r4Var = this.f315535d;
        java.lang.String str = r4Var.f315542d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCenterCustomizeToast ");
        java.lang.String str2 = this.f315536e;
        sb6.append(str2);
        sb6.append(" context:");
        sb6.append(r4Var.M());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        android.content.Context M = r4Var.M();
        if (M != null) {
            db5.t7.f(M, str2, new dk2.q3(this.f315537f));
        }
        return jz5.f0.f384359a;
    }
}
