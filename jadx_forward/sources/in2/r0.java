package in2;

/* loaded from: classes10.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.v0 f374419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.q0 f374420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(in2.v0 v0Var, in2.q0 q0Var) {
        super(3);
        this.f374419d = v0Var;
        this.f374420e = q0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        android.view.View view = (android.view.View) obj;
        ((java.lang.Number) obj2).intValue();
        dk2.yg musicItem = (dk2.yg) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        java.util.Iterator it = this.f374420e.f374413f.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((dk2.yg) it.next()).f315929d) {
                z17 = true;
                break;
            }
        }
        this.f374419d.f0(z17);
        return jz5.f0.f384359a;
    }
}
