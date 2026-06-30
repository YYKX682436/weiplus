package az0;

/* loaded from: classes5.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(az0.f2 f2Var, boolean z17) {
        super(1);
        this.f15402d = f2Var;
        this.f15403e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        final yz5.p it = (yz5.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f15402d.f15460d.a0(this.f15403e, new com.tencent.maas.camstudio.j0(it) { // from class: az0.j1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.p f15597a;

            {
                kotlin.jvm.internal.o.g(it, "function");
                this.f15597a = it;
            }

            @Override // com.tencent.maas.camstudio.j0
            public final /* synthetic */ void a(com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo, com.tencent.maas.instamovie.base.MJError mJError) {
                this.f15597a.invoke(mJRecordingFinishInfo, mJError);
            }
        });
        return jz5.f0.f302826a;
    }
}
