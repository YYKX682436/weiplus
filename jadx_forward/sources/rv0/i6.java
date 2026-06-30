package rv0;

/* loaded from: classes5.dex */
public final class i6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(rv0.z6 z6Var) {
        super(1);
        this.f481583d = z6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        rv0.z6 z6Var = this.f481583d;
        z6Var.x7();
        rv0.o5 o5Var = (rv0.o5) z6Var.f150773i;
        if (o5Var != null) {
            o5Var.D = false;
        }
        return java.lang.Boolean.TRUE;
    }
}
