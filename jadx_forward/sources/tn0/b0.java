package tn0;

/* loaded from: classes3.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(tn0.w0 w0Var) {
        super(2);
        this.f502184d = w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "startPreviewToRemote onViewSizeChanged");
        this.f502184d.f502304r.i(intValue, intValue2);
        return jz5.f0.f384359a;
    }
}
