package zs5;

/* loaded from: classes9.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f556989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j0 f556990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f556991f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zs5.y yVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j0 j0Var, long j17) {
        super(0);
        this.f556989d = yVar;
        this.f556990e = j0Var;
        this.f556991f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = this.f556989d.f557051s;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j0 j0Var = this.f556990e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "notifyScanEventAsync sessionId: " + this.f556991f + ", eventType: " + j0Var.f298609d + ", bufferKey: " + j0Var.f298610e + ", remove: " + ((java.nio.ByteBuffer) hashMap.remove(java.lang.Long.valueOf(j0Var.f298610e))));
        return jz5.f0.f384359a;
    }
}
