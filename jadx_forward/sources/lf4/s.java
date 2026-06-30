package lf4;

/* loaded from: classes4.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if4.a f400012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f400013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(if4.a aVar, lf4.b0 b0Var) {
        super(0);
        this.f400012d = aVar;
        this.f400013e = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if4.a aVar = this.f400012d;
        aVar.f372771f = false;
        java.util.Iterator it = aVar.f372773h.iterator();
        while (it.hasNext()) {
            ((gf4.a) it.next()).f352868f = false;
        }
        ((sf4.a1) this.f400013e.f399888e).d();
        return jz5.f0.f384359a;
    }
}
