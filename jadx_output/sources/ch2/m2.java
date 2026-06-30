package ch2;

/* loaded from: classes10.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41409e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.m2(this.f41409e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41408d;
        ch2.o2 o2Var = this.f41409e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sf2.d3 d3Var = (sf2.d3) o2Var.controller(sf2.d3.class);
            if (d3Var != null) {
                this.f41408d = 1;
                obj = d3Var.k7(2, 0, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        r45.gx1 gx1Var = (r45.gx1) obj;
        if (gx1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLocalSingInfo success, version: ");
            sb6.append(gx1Var.f375594e);
            sb6.append(" listInfo: ");
            r45.zx1 zx1Var = gx1Var.f375593d;
            sb6.append((zx1Var == null || (linkedList = zx1Var.f392452d) == null) ? null : new java.lang.Integer(linkedList.size()));
            com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", sb6.toString());
            if (gx1Var.f375593d != null && gx1Var.f375594e > 0) {
                om2.g q76 = o2Var.q7();
                java.util.LinkedList to_sing_list = gx1Var.f375593d.f392452d;
                kotlin.jvm.internal.o.f(to_sing_list, "to_sing_list");
                q76.V6("updateLocalSingInfo", to_sing_list, gx1Var.f375594e);
            }
        }
        return jz5.f0.f302826a;
    }
}
