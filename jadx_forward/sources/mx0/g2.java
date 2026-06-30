package mx0;

/* loaded from: classes5.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.k3 f413521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f413522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(mx0.k3 k3Var, mx0.q2 q2Var) {
        super(1);
        this.f413521d = k3Var;
        this.f413522e = q2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f413521d.f413628p, "[bindVolumeAdjustChannel] bgmVolume=" + intValue);
        yx0.b8 b8Var = this.f413522e.f413769g;
        p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.n5(b8Var, ((float) intValue) / ((float) 200), null), 3, null);
        return jz5.f0.f384359a;
    }
}
