package az0;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f15905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f15906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f15907g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f15908h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15909i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(az0.a0 a0Var, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, boolean z17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15905e = a0Var;
        this.f15906f = mJTime;
        this.f15907g = mJTimeRange;
        this.f15908h = z17;
        this.f15909i = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.t(this.f15905e, this.f15906f, this.f15907g, this.f15908h, this.f15909i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15904d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.model.time.MJTime mJTime = this.f15906f;
            com.tencent.maas.model.time.MJTimeRange mJTimeRange = this.f15907g;
            boolean z17 = this.f15908h;
            int i18 = this.f15909i;
            this.f15904d = 1;
            az0.a0 a0Var = this.f15905e;
            a0Var.getClass();
            obj = az0.rc.f("2005", new az0.k(a0Var, mJTimeRange, mJTime, i18, z17), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
