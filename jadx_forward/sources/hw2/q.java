package hw2;

/* loaded from: classes5.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.t f367082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hw2.t tVar) {
        super(2);
        this.f367082d = tVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        hw2.h hVar = hw2.t.f367087v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderRecordBeautifyPlugin", "onSeekChanging key=" + intValue + " seek=" + intValue2);
        hw2.t tVar = this.f367082d;
        tVar.g(intValue, intValue2);
        tVar.f();
        tVar.b().putInt(tVar.d(tVar.f367102q, intValue), intValue2);
        if (intValue2 == tVar.c(tVar.f367102q, intValue)) {
            tVar.f367106u.vibrate(10L);
        }
        return jz5.f0.f384359a;
    }
}
