package so5;

/* loaded from: classes14.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so5.y f492450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f492451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(so5.y yVar, int i17) {
        super(0);
        this.f492450d = yVar;
        this.f492451e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        so5.t tVar = this.f492450d.f492463q[this.f492451e];
        so5.r rVar = tVar instanceof so5.r ? (so5.r) tVar : null;
        if (rVar != null) {
            return rVar.f492440b;
        }
        return null;
    }
}
