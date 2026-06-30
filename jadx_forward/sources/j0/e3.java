package j0;

/* loaded from: classes14.dex */
public final class e3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f377804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(j0.j3 j3Var) {
        super(1);
        this.f377804d = j3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.i drawBehind = (g1.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawBehind, "$this$drawBehind");
        a2.k1 k1Var = this.f377804d.f377915d.f377825e;
        if (k1Var != null) {
            e1.u canvas = ((g1.b) drawBehind.p()).a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
            a2.l1.f82305a.a(canvas, k1Var);
        }
        return jz5.f0.f384359a;
    }
}
