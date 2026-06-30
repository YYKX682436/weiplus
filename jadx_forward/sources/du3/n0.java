package du3;

/* loaded from: classes3.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t0 f325197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(du3.t0 t0Var) {
        super(2);
        this.f325197d = t0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoBrushPlugin", "click position >> " + intValue);
        hk0.e eVar = new hk0.e(hk0.h.f363273e, intValue2, intValue);
        du3.t0 t0Var = this.f325197d;
        t0Var.f325246n = eVar;
        t0Var.B().b7(t0Var.f325246n);
        return jz5.f0.f384359a;
    }
}
