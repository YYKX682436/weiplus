package c61;

/* loaded from: classes2.dex */
public final class u5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f39319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f39320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f39321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(xg2.h hVar, kotlin.coroutines.Continuation continuation, long j17, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f39319d = hVar;
        this.f39320e = j17;
        this.f39321f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.u5(this.f39319d, continuation, this.f39320e, this.f39321f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        c61.u5 u5Var = (c61.u5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f39319d).f454381b;
        rm0.j jVar = aVar2.f454379a;
        kotlin.jvm.internal.h0 h0Var = this.f39321f;
        rm0.j jVar2 = aVar2.f454379a;
        if (jVar != null) {
            if (hc2.p.b(jVar != null ? jVar.f397424e : 0, jVar != null ? jVar.f397425f : 0)) {
                java.lang.Object obj2 = jVar2 != null ? jVar2.f397427h : null;
                r45.h51 h51Var = obj2 instanceof r45.h51 ? (r45.h51) obj2 : null;
                if (h51Var != null && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) h51Var.getCustom(2)) != null) {
                    com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
                    bu2.j jVar3 = bu2.j.f24534a;
                    bu2.i iVar = bu2.i.f24521b;
                    jVar3.n(a17, bu2.i.f24531l);
                    h0Var.f310123d = a17;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("generateFinderVideoPlayer: fetch feed fail, errType=");
        sb6.append(jVar2 != null ? jVar2.f397424e : 0);
        sb6.append(", errCode=");
        sb6.append(jVar2 != null ? jVar2.f397425f : 0);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(this.f39320e));
        sb6.append(", feed=");
        sb6.append(h0Var.f310123d);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", sb6.toString());
        return jz5.f0.f302826a;
    }
}
