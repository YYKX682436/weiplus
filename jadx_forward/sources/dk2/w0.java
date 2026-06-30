package dk2;

/* loaded from: classes.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f315795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f315796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(dk2.r4 r4Var, android.view.View view, int i17) {
        super(0);
        this.f315794d = r4Var;
        this.f315795e = view;
        this.f315796f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.r4 r4Var = this.f315794d;
        java.util.ArrayList arrayList = r4Var.f315544f;
        int i17 = this.f315796f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.view.View view = this.f315795e;
        arrayList.add(new jz5.l(view, valueOf));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "cache view:" + view.getClass().getSimpleName() + " visibility:" + i17);
        return jz5.f0.f384359a;
    }
}
