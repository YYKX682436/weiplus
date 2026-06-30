package ri;

/* loaded from: classes3.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f477545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f477546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f477547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f477548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f477549h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f477550i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f477551m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        super(1);
        this.f477545d = j17;
        this.f477546e = j18;
        this.f477547f = j19;
        this.f477548g = j27;
        this.f477549h = j28;
        this.f477550i = j29;
        this.f477551m = j37;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map myDict = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(myDict, "myDict");
        float f17 = ((float) this.f477545d) * 100.0f;
        float f18 = (float) this.f477546e;
        myDict.put("top-ratio", java.lang.Long.valueOf(a06.d.c(f17 / f18)));
        myDict.put("fg-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f477547f) * 100.0f) / f18)));
        myDict.put("fgs-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f477548g) * 100.0f) / f18)));
        myDict.put("bg-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f477549h) * 100.0f) / f18)));
        myDict.put("sleep-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f477550i) * 100.0f) / f18)));
        myDict.put("cache-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f477551m) * 100.0f) / f18)));
        return jz5.f0.f384359a;
    }
}
