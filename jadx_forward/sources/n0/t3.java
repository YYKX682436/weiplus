package n0;

/* loaded from: classes14.dex */
public final class t3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0.d f415238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.p1 f415239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(o0.d dVar, n0.p1 p1Var) {
        super(0);
        this.f415238d = dVar;
        this.f415239e = p1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = this.f415238d.iterator();
        while (true) {
            o0.c cVar = (o0.c) it;
            if (!cVar.hasNext()) {
                return jz5.f0.f384359a;
            }
            ((n0.j1) this.f415239e).r(cVar.next());
        }
    }
}
