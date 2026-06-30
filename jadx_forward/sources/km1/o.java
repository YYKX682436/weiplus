package km1;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f390553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(km1.s sVar) {
        super(1);
        this.f390553d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f390553d.onFrameAvailable(it);
        return jz5.f0.f384359a;
    }
}
