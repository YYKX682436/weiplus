package rh3;

/* loaded from: classes15.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh3.c f477193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f477194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f477195f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rh3.c cVar, long j17, long j18) {
        super(0);
        this.f477193d = cVar;
        this.f477194e = j17;
        this.f477195f = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rh3.c cVar = this.f477193d;
        rh3.j jVar = cVar.f477206q;
        if (jVar != null) {
            jVar.n(cVar, this.f477194e, this.f477195f);
        }
        return jz5.f0.f384359a;
    }
}
