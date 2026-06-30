package az0;

/* loaded from: classes5.dex */
public final class c5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f15384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(java.lang.String str, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15383d = str;
        this.f15384e = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.c5(this.f15383d, this.f15384e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.c5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", this.f15383d + " - state: " + az0.i5.f15560d);
        int ordinal = az0.i5.f15560d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                az0.i5.d(az0.i5.f15557a);
                if (az0.i5.f15560d == az0.x2.f16039f) {
                    return kotlinx.coroutines.l.f(null, new az0.a5(this.f15384e, null), 1, null);
                }
                return null;
            }
            if (ordinal == 2) {
                return kotlinx.coroutines.l.f(null, new az0.b5(this.f15384e, null), 1, null);
            }
            if (ordinal != 3) {
                throw new jz5.j();
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MaasManager", this.f15383d + " - invalid state: " + az0.i5.f15560d);
        return null;
    }
}
