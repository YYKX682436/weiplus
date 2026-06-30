package du0;

/* loaded from: classes5.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev0.c f324899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f324900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ev0.c cVar, du0.p1 p1Var) {
        super(1);
        this.f324899d = cVar;
        this.f324900e = p1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f324899d.f338371p, "[bindVolumeAdjustChannel] bgmVolume=" + intValue);
        this.f324900e.W6(((float) intValue) / ((float) 200));
        return jz5.f0.f384359a;
    }
}
