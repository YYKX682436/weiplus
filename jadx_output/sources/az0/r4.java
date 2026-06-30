package az0;

/* loaded from: classes5.dex */
public final class r4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15857d = z17;
        this.f15858e = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.r4(this.f15857d, this.f15858e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.r4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int ordinal = az0.i5.f15560d.ordinal();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "release - already uninitialized");
            az0.i5 i5Var = az0.i5.f15557a;
            return f0Var;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                az0.i5.b(az0.i5.f15557a, this.f15857d, this.f15858e);
            } else if (ordinal == 3) {
                az0.i5.d(az0.i5.f15557a);
                if (az0.i5.f15560d != az0.x2.f16037d) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MaasManager", "Unexpected state: " + az0.i5.f15560d + " after TEARDOWNING");
                }
            }
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "release - wait for INITIALIZED");
        az0.i5 i5Var2 = az0.i5.f15557a;
        az0.i5.d(i5Var2);
        if (az0.i5.f15560d != az0.x2.f16039f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MaasManager", "Unexpected state: " + az0.i5.f15560d + " after INITIALIZING");
            az0.i5.b(i5Var2, this.f15857d, this.f15858e);
        }
        return f0Var;
    }
}
