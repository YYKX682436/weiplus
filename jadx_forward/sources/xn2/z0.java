package xn2;

/* loaded from: classes2.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f537124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(xn2.f1 f1Var) {
        super(0);
        this.f537124d = f1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xn2.f1 f1Var = this.f537124d;
        android.view.View findViewById = f1Var.h().findViewById(com.p314xaae8f345.mm.R.id.m2_);
        findViewById.setOnClickListener(new xn2.y0(f1Var, findViewById));
        return findViewById;
    }
}
