package g0;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0.f f348885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0.l f348886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g0.f fVar, g0.l lVar) {
        super(1);
        this.f348885d = fVar;
        this.f348886e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        g0.f fVar = this.f348885d;
        o0.i iVar = ((g0.h) fVar).f348882a;
        g0.l lVar = this.f348886e;
        iVar.b(lVar);
        return new g0.i(fVar, lVar);
    }
}
