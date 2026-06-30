package pz5;

/* loaded from: classes14.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f440730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f440731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f440732f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, oz5.l lVar, yz5.p pVar, java.lang.Object obj) {
        super(interfaceC29045xdcb5ca57, lVar);
        this.f440731e = pVar;
        this.f440732f = obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC29045xdcb5ca57, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17 = this.f440730d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
            }
            this.f440730d = 2;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        this.f440730d = 1;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yz5.p pVar = this.f440731e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(pVar, 2);
        return pVar.mo149xb9724478(this.f440732f, this);
    }
}
