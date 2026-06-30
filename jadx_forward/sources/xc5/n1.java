package xc5;

/* loaded from: classes3.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.p1 f535074d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(xc5.p1 p1Var) {
        super(0);
        this.f535074d = p1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xc5.p1 p1Var = this.f535074d;
        android.view.View findViewById = p1Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.tzq);
        if (findViewById != null) {
            lf3.j jVar = (lf3.j) p1Var.U6(lf3.j.class);
            if (jVar != null) {
                jVar.E2(findViewById);
            }
        } else {
            p1Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
