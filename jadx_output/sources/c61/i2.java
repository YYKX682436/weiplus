package c61;

/* loaded from: classes2.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f39031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f39032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39033f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(yz5.p pVar, long j17, java.lang.String str) {
        super(1);
        this.f39031d = pVar;
        this.f39032e = j17;
        this.f39033f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String topic = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(topic, "topic");
        if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            this.f39031d.invoke(topic, new com.tencent.mm.plugin.finder.assist.q0(this.f39032e, this.f39033f, 0, null, null, 28, null));
        }
        return jz5.f0.f302826a;
    }
}
