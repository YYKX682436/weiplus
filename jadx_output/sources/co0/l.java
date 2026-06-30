package co0;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.s f43723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(co0.s sVar) {
        super(1);
        this.f43723d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        go0.i0.b(this.f43723d.f420771r, surfaceTexture, false, 2, null);
        return jz5.f0.f302826a;
    }
}
