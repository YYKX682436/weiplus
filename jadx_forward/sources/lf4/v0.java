package lf4;

/* loaded from: classes4.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f400025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f400026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f400027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(lf4.j1 j1Var, int i17, java.util.List list) {
        super(0);
        this.f400025d = j1Var;
        this.f400026e = i17;
        this.f400027f = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lf4.j1 j1Var = this.f400025d;
        sf4.a1 a1Var = (sf4.a1) j1Var.f399952f;
        int i17 = this.f400026e;
        a1Var.h(i17, this.f400027f);
        lf4.h hVar = j1Var.f399952f;
        ((sf4.a1) hVar).c(i17);
        ((sf4.a1) hVar).d();
        return jz5.f0.f384359a;
    }
}
