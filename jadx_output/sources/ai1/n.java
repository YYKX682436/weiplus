package ai1;

/* loaded from: classes8.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.a1 f5097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ji3 f5098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel f5100g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zh1.a1 a1Var, r45.ji3 ji3Var, long j17, com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel) {
        super(0);
        this.f5097d = a1Var;
        this.f5098e = ji3Var;
        this.f5099f = j17;
        this.f5100g = materialModel;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f5097d.a(true, ai1.p.f5102b.d(this.f5098e, this.f5099f, this.f5100g));
        return jz5.f0.f302826a;
    }
}
