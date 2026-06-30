package t03;

/* loaded from: classes11.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f496054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f496055e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j17, t03.k0 k0Var) {
        super(0);
        this.f496054d = j17;
        this.f496055e = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kk4.c cVar;
        kk4.c cVar2;
        kk4.c cVar3;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onPrepared");
        hashMap.put("playerId", java.lang.Long.valueOf(this.f496054d));
        t03.k0 k0Var = this.f496055e;
        t03.r0 r0Var = k0Var.f496001m;
        int i17 = 0;
        hashMap.put("width", java.lang.Integer.valueOf((r0Var == null || (cVar3 = r0Var.f390110b) == null) ? 0 : ((kk4.f0) cVar3).mo100929x8d5c7601()));
        t03.r0 r0Var2 = k0Var.f496001m;
        if (r0Var2 != null && (cVar2 = r0Var2.f390110b) != null) {
            i17 = ((kk4.f0) cVar2).mo100928x463504c();
        }
        hashMap.put("height", java.lang.Integer.valueOf(i17));
        t03.r0 r0Var3 = k0Var.f496001m;
        hashMap.put("duration", java.lang.Long.valueOf((r0Var3 == null || (cVar = r0Var3.f390110b) == null) ? 0L : ((kk4.f0) cVar).mo100917x37a7fa50()));
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = ((v03.b) k0Var.f495996e).f513836h;
        if (eventSink != null) {
            eventSink.mo138418x90b54003(hashMap);
        }
        return jz5.f0.f384359a;
    }
}
