package pz5;

/* loaded from: classes14.dex */
public final class b extends qz5.j {

    /* renamed from: d, reason: collision with root package name */
    public int f440723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f440724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, yz5.l lVar) {
        super(interfaceC29045xdcb5ca57);
        this.f440724e = lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC29045xdcb5ca57, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17 = this.f440723d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
            }
            this.f440723d = 2;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        this.f440723d = 1;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yz5.l lVar = this.f440724e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(lVar, 1);
        return lVar.mo146xb9724478(this);
    }
}
