package az0;

/* loaded from: classes5.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15735d = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.n3(this.f15735d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.n3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "new render view on thread: " + java.lang.Thread.currentThread().getName());
        az0.i5.f15557a.q().getClass();
        return new io.clipworks.displaysys.DSRenderView(this.f15735d);
    }
}
