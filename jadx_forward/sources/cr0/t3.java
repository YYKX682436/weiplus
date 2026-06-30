package cr0;

/* loaded from: classes3.dex */
public final class t3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f303285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f303286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f303287f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(java.util.Map map, java.lang.Long l17, long j17) {
        super(1);
        this.f303285d = map;
        this.f303286e = l17;
        this.f303287f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f303285d.put("pid-collect-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f303286e.longValue()) * 100.0f) / ((float) this.f303287f))));
        return jz5.f0.f384359a;
    }
}
