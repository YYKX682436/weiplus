package vt3;

/* loaded from: classes5.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f521524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.nio.ByteBuffer byteBuffer) {
        super(0);
        this.f521524d = byteBuffer;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p457x3304c6.p458x9b169b86.C3970x2c87daa4 c3970x2c87daa4 = vt3.l.f521539b;
        if (c3970x2c87daa4 != null) {
            c3970x2c87daa4.b(this.f521524d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jsonString: ");
        com.p314xaae8f345.p457x3304c6.p458x9b169b86.C3970x2c87daa4 c3970x2c87daa42 = vt3.l.f521539b;
        sb6.append(c3970x2c87daa42 != null ? c3970x2c87daa42.g() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AssetInfoStatistics", sb6.toString());
        return jz5.f0.f384359a;
    }
}
