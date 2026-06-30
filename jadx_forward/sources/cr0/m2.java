package cr0;

/* loaded from: classes12.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f303218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f303219e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(java.lang.Long l17, long j17) {
        super(1);
        this.f303218d = l17;
        this.f303219e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.put("enable", java.lang.Integer.valueOf(cr0.w3.f303333a.b() ? 1 : 0));
        it.put("uid-collect-min", java.lang.Long.valueOf(this.f303218d.longValue() / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8));
        it.put("uid-collect-ratio", java.lang.Long.valueOf(this.f303219e > 0 ? a06.d.c((((float) r0.longValue()) * 100.0f) / ((float) r1)) : -1L));
        return jz5.f0.f384359a;
    }
}
