package cr0;

/* loaded from: classes12.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f303230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f303231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f303232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(rh.o2 o2Var, java.util.Map map, long j17) {
        super(1);
        this.f303230d = o2Var;
        this.f303231e = map;
        this.f303232f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f303231e.put("pid-collect-ratio", java.lang.Long.valueOf(a06.d.c((((float) ((java.lang.Long) ((cr0.k0) this.f303230d.f477019c).f303320d.f477085a).longValue()) * 100.0f) / ((float) this.f303232f))));
        return jz5.f0.f384359a;
    }
}
