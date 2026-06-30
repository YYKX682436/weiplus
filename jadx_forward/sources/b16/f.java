package b16;

/* loaded from: classes16.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.g f98693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b16.g gVar) {
        super(0);
        this.f98693d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b16.g gVar = this.f98693d;
        b16.i0 i0Var = gVar.f98709c;
        java.util.Collection values = ((java.util.Map) e26.b0.a(i0Var.f98721o, i0Var, b16.i0.f98718s[0])).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            y16.s a17 = gVar.f98708b.f82182a.f82151d.a(gVar.f98709c, (g16.q0) it.next());
            if (a17 != null) {
                arrayList.add(a17);
            }
        }
        return (y16.s[]) n26.a.b(arrayList).toArray(new y16.s[0]);
    }
}
