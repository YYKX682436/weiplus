package p12;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p12.w f432574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p12.w wVar) {
        super(2);
        this.f432574d = wVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoRenderViewController", "onVideoSizeChanged: " + longValue + " * " + longValue2);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f432574d.f432558d).k(new android.util.Size((int) longValue, (int) longValue2));
        return jz5.f0.f384359a;
    }
}
