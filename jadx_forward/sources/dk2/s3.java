package dk2;

/* loaded from: classes3.dex */
public final class s3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(dk2.r4 r4Var, java.lang.String str) {
        super(0);
        this.f315591d = r4Var;
        this.f315592e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.r4 r4Var = this.f315591d;
        java.lang.String str = r4Var.f315542d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCenterTextToast ");
        java.lang.String str2 = this.f315592e;
        sb6.append(str2);
        sb6.append(" context:");
        sb6.append(r4Var.M());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        android.content.Context M = r4Var.M();
        if (M != null) {
            db5.t7.m(M, str2);
        }
        return jz5.f0.f384359a;
    }
}
