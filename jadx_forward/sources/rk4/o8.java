package rk4;

/* loaded from: classes11.dex */
public final class o8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f478419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il4.e f478420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.z8 f478421f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(java.util.List list, il4.e eVar, rk4.z8 z8Var) {
        super(0);
        this.f478419d = list;
        this.f478420e = eVar;
        this.f478421f = z8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zk4.l lVar = zk4.l.f555071a;
        java.util.List list = this.f478419d;
        il4.e eVar = this.f478420e;
        rk4.z8.wi(this.f478421f, (jm4.m3) lVar.a(list, null, null, eVar), eVar.f373638b);
        return jz5.f0.f384359a;
    }
}
