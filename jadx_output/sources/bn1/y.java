package bn1;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn1.c0 f22838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(bn1.c0 c0Var) {
        super(1);
        this.f22838d = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bn1.v it = (bn1.v) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bn1.c0 c0Var = this.f22838d;
        java.util.Iterator it6 = c0Var.f22797o.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it6.next()).b();
        }
        c0Var.f22797o.clear();
        return jz5.f0.f302826a;
    }
}
