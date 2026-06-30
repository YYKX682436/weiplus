package yx3;

/* loaded from: classes15.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.j f549420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vx3.c f549421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yx3.j jVar, vx3.c cVar) {
        super(0);
        this.f549420d = jVar;
        this.f549421e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yx3.j jVar = this.f549420d;
        m8.i0 i0Var = new m8.i0(jVar.f549441c, jVar.f549442d, new m8.c(new r9.o(true, 65536), 15000, 30000, 2500L, 5000L));
        jVar.f549444f = i0Var;
        i0Var.j(this.f549421e.f522804b);
        return jz5.f0.f384359a;
    }
}
