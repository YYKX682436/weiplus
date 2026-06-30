package y22;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.g f540605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y22.g gVar) {
        super(1);
        this.f540605d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        y22.g gVar = this.f540605d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f540618e, "onFrameAvailable: " + it);
        gVar.b(new y22.e(gVar, it.getTimestamp()));
        return jz5.f0.f384359a;
    }
}
