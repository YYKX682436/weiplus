package dr4;

/* loaded from: classes14.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f324177e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(dr4.p1 p1Var, yz5.l lVar) {
        super(1);
        this.f324176d = p1Var;
        this.f324177e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.util.Size size;
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        if (surfaceTexture == null) {
            return null;
        }
        dr4.p1 p1Var = this.f324176d;
        xq4.a aVar = p1Var.f324237c;
        if (aVar != null) {
            ((zq4.b) aVar).f556587n = surfaceTexture;
        }
        if (aVar != null) {
            aVar.a();
        }
        xq4.a aVar2 = p1Var.f324237c;
        if (aVar2 == null || (size = ((zq4.b) aVar2).f556579f) == null) {
            return null;
        }
        p1Var.p(size);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        p1Var.I = java.lang.System.currentTimeMillis();
        p1Var.o(gq4.v.wi().f447500a);
        yz5.l lVar = this.f324177e;
        if (lVar == null) {
            return null;
        }
        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        return null;
    }
}
