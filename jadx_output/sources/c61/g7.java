package c61;

/* loaded from: classes2.dex */
public final class g7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f38999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f39000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f39001f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(xg2.h hVar, kotlin.coroutines.Continuation continuation, long j17, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f38999d = hVar;
        this.f39000e = j17;
        this.f39001f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.g7(this.f38999d, continuation, this.f39000e, this.f39001f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        c61.g7 g7Var = (c61.g7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) ((xg2.i) this.f38999d).f454393b).getCustom(2);
        if (finderObject != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
            bu2.j jVar = bu2.j.f24534a;
            bu2.i iVar = bu2.i.f24521b;
            jVar.n(a17, bu2.i.f24531l);
            this.f39001f.f310123d = finderObject;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + this.f39000e + ", finish");
        return jz5.f0.f302826a;
    }
}
