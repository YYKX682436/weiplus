package hr5;

/* loaded from: classes15.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.l f365836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hr5.l lVar) {
        super(0);
        this.f365836d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hr5.l lVar = this.f365836d;
        gr5.b bVar = lVar.f365925d;
        long d17 = lVar.d();
        long a17 = ((gr5.e) bVar).a((d17 > zq5.t.f556624b ? 1 : (d17 == zq5.t.f556624b ? 0 : -1)) != 0 ? zq5.h.a(a06.d.b(zq5.t.b(d17)), a06.d.b(zq5.t.a(d17))) : zq5.g.f556598b, lVar.f365922a, lVar.f365927f);
        return new zq5.l(zq5.m.a((int) (a17 >> 32), zq5.c.a(a17)));
    }
}
