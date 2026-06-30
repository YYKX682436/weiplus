package aq;

/* loaded from: classes4.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.QueryImageData f12893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.nio.Buffer f12894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f12895g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.api.QueryImageData queryImageData, java.nio.Buffer buffer, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12893e = queryImageData;
        this.f12894f = buffer;
        this.f12895g = bitmap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        aq.k0 k0Var = new aq.k0(this.f12893e, this.f12894f, this.f12895g, continuation);
        k0Var.f12892d = obj;
        return k0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        aq.k0 k0Var = (aq.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f12892d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new aq.h0(null), 2, null);
        com.tencent.mm.api.QueryImageData queryImageData = this.f12893e;
        java.nio.Buffer buffer = this.f12894f;
        android.graphics.Bitmap bitmap = this.f12895g;
        kotlinx.coroutines.l.d(y0Var, null, null, new aq.i0(queryImageData, buffer, bitmap, null), 3, null);
        kotlinx.coroutines.l.d(y0Var, null, null, new aq.j0(queryImageData, buffer, bitmap, null), 3, null);
        return jz5.f0.f302826a;
    }
}
