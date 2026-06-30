package a01;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a01.d f364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a01.d dVar) {
        super(0);
        this.f364d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        a01.d dVar = this.f364d;
        com.tencent.mars.xlog.Log.w(dVar.b(), "dismissCoverBitmapInternal captureBitmap:" + dVar.f373e + '.');
        dVar.f369a.removeView(dVar.f371c);
        return jz5.f0.f302826a;
    }
}
