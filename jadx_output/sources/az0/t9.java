package az0;

/* loaded from: classes5.dex */
public final class t9 implements com.tencent.maas.camstudio.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f15920a;

    public t9(yz5.p pVar) {
        this.f15920a = pVar;
    }

    @Override // com.tencent.maas.camstudio.b0
    public final void a(com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc, android.graphics.Bitmap bitmap, com.tencent.maas.instamovie.base.MJError mJError) {
        yz5.p pVar = this.f15920a;
        if (mJCamSpatialDesc == null || bitmap == null) {
            pVar.invoke(null, mJError);
        } else {
            pVar.invoke(new jz5.l(mJCamSpatialDesc, bitmap), mJError);
        }
    }
}
