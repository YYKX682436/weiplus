package ia2;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371506e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, java.lang.String str2) {
        super(2);
        this.f371505d = str;
        this.f371506e = str2;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).floatValue();
        ((java.lang.Number) obj2).floatValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "Succeed to prefetch poi stream. poiID:" + this.f371505d + ", poiName:" + this.f371506e);
        return jz5.f0.f384359a;
    }
}
