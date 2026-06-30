package lm4;

/* loaded from: classes14.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm4.i0 f401091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(lm4.i0 i0Var) {
        super(1);
        this.f401091d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        lm4.b0 it = (lm4.b0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        lm4.i0 i0Var = this.f401091d;
        java.util.Iterator it6 = i0Var.f401109o.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it6.next()).b();
        }
        i0Var.f401109o.clear();
        return jz5.f0.f384359a;
    }
}
