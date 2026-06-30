package lf4;

/* loaded from: classes4.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if4.a f399913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f399914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(if4.a aVar, lf4.j1 j1Var) {
        super(0);
        this.f399913d = aVar;
        this.f399914e = j1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if4.a aVar = this.f399913d;
        aVar.f372770e = false;
        aVar.f372771f = false;
        aVar.f372769d = false;
        java.util.Iterator it = aVar.f372772g.iterator();
        while (it.hasNext()) {
            ((gf4.a) it.next()).f352868f = false;
        }
        ((sf4.a1) this.f399914e.f399952f).d();
        return jz5.f0.f384359a;
    }
}
