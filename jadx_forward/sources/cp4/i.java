package cp4;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f302568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(cp4.r rVar) {
        super(1);
        this.f302568d = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", (int) longValue);
        cp4.r rVar = this.f302568d;
        rVar.f546865d.w(ju3.c0.H, bundle);
        ju3.d0.k(rVar.f546865d, ju3.c0.f383446x1, null, 2, null);
        return jz5.f0.f384359a;
    }
}
