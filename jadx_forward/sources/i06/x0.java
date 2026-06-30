package i06;

/* loaded from: classes15.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f368319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f368320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(i06.f1 f1Var, i06.k1 k1Var) {
        super(0);
        this.f368319d = f1Var;
        this.f368320e = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.lang.Object mo152xb9724478() {
        o06.g a17 = this.f368319d.a();
        if (a17.j() != o06.h.f423498i) {
            return null;
        }
        boolean g07 = a17.g0();
        i06.k1 k1Var = this.f368320e;
        java.lang.Object obj = ((!g07 || l06.f.a(l06.e.f396412a, a17)) ? k1Var.f368213e.getDeclaredField("INSTANCE") : k1Var.f368213e.getEnclosingClass().getDeclaredField(a17.mo132800xfb82e301().h())).get(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
        return obj;
    }
}
