package tc2;

/* loaded from: classes2.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc2.b f498669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tc2.b bVar) {
        super(0);
        this.f498669d = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tc2.b bVar = this.f498669d;
        java.util.Iterator it = new java.util.HashSet(bVar.f498673d.keySet()).iterator();
        while (it.hasNext()) {
            in5.s0 s0Var = (in5.s0) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var);
            bVar.b(s0Var);
        }
        bVar.f498673d.clear();
        return jz5.f0.f384359a;
    }
}
