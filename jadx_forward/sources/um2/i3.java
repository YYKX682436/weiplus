package um2;

/* loaded from: classes3.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f510362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f510361d = x5Var;
        this.f510362e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        il2.r rVar = this.f510361d.C;
        if (rVar != null) {
            return rVar;
        }
        fm2.c cVar = this.f510362e;
        return new il2.r(cVar, cVar);
    }
}
