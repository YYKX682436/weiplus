package t03;

/* loaded from: classes11.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f495987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f495988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f495989f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk4.a f495990g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(long j17, long j18, t03.k0 k0Var, dk4.a aVar) {
        super(0);
        this.f495987d = j17;
        this.f495988e = j18;
        this.f495989f = k0Var;
        this.f495990g = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        s03.f fVar;
        kk4.h hVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onProgress");
        hashMap.put("playerId", java.lang.Long.valueOf(this.f495987d));
        hashMap.put("progress", java.lang.Long.valueOf(this.f495988e));
        t03.k0 k0Var = this.f495989f;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = ((v03.b) k0Var.f495996e).f513836h;
        if (eventSink != null) {
            eventSink.mo138418x90b54003(hashMap);
        }
        t03.r0 r0Var = k0Var.f496001m;
        dk4.a aVar = this.f495990g;
        if (r0Var == null || (hVar = r0Var.f390113e) == null || (str = hVar.f390078d) == null) {
            str = aVar != null ? aVar.f316015s : null;
        }
        java.lang.String str2 = str;
        if (str2 != null && (fVar = k0Var.f495997f) != null) {
            fVar.L(str2, this.f495987d, this.f495988e, aVar != null ? aVar.f316003g : 0L);
        }
        return jz5.f0.f384359a;
    }
}
