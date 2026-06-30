package b16;

/* loaded from: classes16.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.g f17160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b16.g gVar) {
        super(0);
        this.f17160d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b16.g gVar = this.f17160d;
        b16.i0 i0Var = gVar.f17176c;
        java.util.Collection values = ((java.util.Map) e26.b0.a(i0Var.f17188o, i0Var, b16.i0.f17185s[0])).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            y16.s a17 = gVar.f17175b.f649a.f618d.a(gVar.f17176c, (g16.q0) it.next());
            if (a17 != null) {
                arrayList.add(a17);
            }
        }
        return (y16.s[]) n26.a.b(arrayList).toArray(new y16.s[0]);
    }
}
