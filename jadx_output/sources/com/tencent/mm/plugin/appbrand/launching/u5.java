package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class u5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f85215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f85217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f85218g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f85219h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85220i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.y50 f85221m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f85222n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(java.lang.String str, yz5.l lVar, yz5.q qVar, java.util.LinkedList linkedList, int i17, r45.y50 y50Var, java.util.LinkedList linkedList2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f85216e = str;
        this.f85217f = lVar;
        this.f85218g = qVar;
        this.f85219h = linkedList;
        this.f85220i = i17;
        this.f85221m = y50Var;
        this.f85222n = linkedList2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launching.u5(this.f85216e, this.f85217f, this.f85218g, this.f85219h, this.f85220i, this.f85221m, this.f85222n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.launching.u5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f85215d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                r45.jf jfVar = new r45.jf();
                java.util.LinkedList linkedList = this.f85219h;
                int i18 = this.f85220i;
                r45.y50 y50Var = this.f85221m;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    jfVar.f377775d.addAll(com.tencent.mm.plugin.appbrand.launching.x5.f85410a.b((com.tencent.mm.plugin.appbrand.launching.z6) it.next()));
                }
                jfVar.f377776e = i18;
                jfVar.f377777f = y50Var;
                com.tencent.mm.plugin.appbrand.appcache.t tVar = new com.tencent.mm.plugin.appbrand.appcache.t(jfVar, this.f85216e);
                this.f85215d = 1;
                obj = rm0.h.a(tVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            ((r45.kf) obj).f378644d.addAll(this.f85222n);
            this.f85217f.invoke(obj);
        } catch (rm0.j e17) {
            this.f85218g.invoke(new java.lang.Integer(e17.f397424e), new java.lang.Integer(e17.f397425f), e17.f397426g);
        }
        return jz5.f0.f302826a;
    }
}
