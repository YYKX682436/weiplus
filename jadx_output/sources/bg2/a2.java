package bg2;

/* loaded from: classes3.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f19913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f19914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(bg2.d2 d2Var, r45.hc1 hc1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f19913d = d2Var;
        this.f19914e = hc1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.a2(this.f19913d, this.f19914e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.a2 a2Var = (bg2.a2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.hc1 hc1Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bg2.d2 d2Var = this.f19913d;
        java.util.Iterator it = d2Var.f417141d.f417144d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hc1Var = this.f19914e;
            if (!hasNext) {
                break;
            }
            java.lang.Object obj2 = (tc2.c) it.next();
            tc2.h hVar = obj2 instanceof tc2.h ? (tc2.h) obj2 : null;
            if (hVar != null) {
                hVar.d4(hc1Var);
            }
        }
        for (java.lang.Object obj3 : d2Var.f417141d.f417144d) {
            tc2.h hVar2 = obj3 instanceof tc2.h ? (tc2.h) obj3 : null;
            if (hVar2 != null) {
                hVar2.onLiveStart(hc1Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
