package c61;

/* loaded from: classes2.dex */
public final class v5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f39342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f39343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f39344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var, long j17) {
        super(2, continuation);
        this.f39342d = hVar;
        this.f39343e = h0Var;
        this.f39344f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.v5(this.f39342d, continuation, this.f39343e, this.f39344f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        c61.v5 v5Var = (c61.v5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) ((xg2.i) this.f39342d).f454393b).getCustom(2);
        if (finderObject != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
            bu2.j jVar = bu2.j.f24534a;
            bu2.i iVar = bu2.i.f24521b;
            jVar.n(a17, bu2.i.f24531l);
            kotlin.jvm.internal.h0 h0Var = this.f39343e;
            h0Var.f310123d = a17;
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "generateFinderVideoPlayer: fetch feed success, feedId=" + pm0.v.u(this.f39344f) + ", feed=" + h0Var.f310123d);
        }
        return jz5.f0.f302826a;
    }
}
