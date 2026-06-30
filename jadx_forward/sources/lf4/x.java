package lf4;

/* loaded from: classes4.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if4.a f400031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f400032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(if4.a aVar, lf4.b0 b0Var) {
        super(0);
        this.f400031d = aVar;
        this.f400032e = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if4.a aVar = this.f400031d;
        aVar.f372770e = false;
        java.util.Iterator it = aVar.f372775j.iterator();
        while (it.hasNext()) {
            ((gf4.a) it.next()).f352868f = false;
        }
        ((sf4.a1) this.f400032e.f399888e).d();
        return jz5.f0.f384359a;
    }
}
