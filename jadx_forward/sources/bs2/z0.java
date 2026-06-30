package bs2;

/* loaded from: classes2.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f105517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(bs2.n1 n1Var, java.lang.String str) {
        super(0);
        this.f105517d = n1Var;
        this.f105518e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bs2.n1 n1Var = this.f105517d;
        db2.c3 c3Var = n1Var.f105458s.f105339b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3Var != null ? c3Var.f309458p : null, this.f105518e)) {
            n1Var.d("preloadVideoWorker");
        }
        return jz5.f0.f384359a;
    }
}
