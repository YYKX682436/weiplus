package g2;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public g2.e0 f349224a;

    /* renamed from: b, reason: collision with root package name */
    public g2.f f349225b;

    public e() {
        a2.d dVar = a2.e.f82220a;
        int i17 = a2.m1.f82315c;
        g2.e0 e0Var = new g2.e0(dVar, a2.m1.f82314b, null, null);
        this.f349224a = e0Var;
        this.f349225b = new g2.f(dVar, e0Var.f349227b, null);
    }

    public final g2.e0 a(java.util.List editCommands) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editCommands, "editCommands");
        int size = editCommands.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((g2.d) editCommands.get(i17)).a(this.f349225b);
        }
        a2.d dVar = new a2.d(this.f349225b.m130688x9616526c(), null, null, 6, null);
        g2.f fVar = this.f349225b;
        long a17 = a2.n1.a(fVar.f349230b, fVar.f349231c);
        g2.f fVar2 = this.f349225b;
        int i18 = fVar2.f349232d;
        g2.e0 e0Var = new g2.e0(dVar, a17, i18 != -1 ? new a2.m1(a2.n1.a(i18, fVar2.f349233e)) : null, null);
        this.f349224a = e0Var;
        return e0Var;
    }
}
