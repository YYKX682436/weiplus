package az0;

/* loaded from: classes5.dex */
public final class db extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f15415f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(az0.xb xbVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15414e = xbVar;
        this.f15415f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.db(this.f15414e, this.f15415f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.db) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15413d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.cb cbVar = new az0.cb(this.f15414e, this.f15415f);
            this.f15413d = 1;
            obj = az0.j.a("1042", cbVar, this);
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
