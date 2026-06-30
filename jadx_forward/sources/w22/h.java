package w22;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.i f524076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w22.i iVar) {
        super(2);
        this.f524076d = iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        w22.i iVar = this.f524076d;
        iVar.f524078b.f106450g.set(m17);
        java.lang.Object obj3 = iVar.f524077a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) obj3).invalidate();
        return jz5.f0.f384359a;
    }
}
