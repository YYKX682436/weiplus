package bg2;

/* loaded from: classes3.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f20681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r71 f20682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(bg2.d2 d2Var, r45.r71 r71Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20681d = d2Var;
        this.f20682e = r71Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.z1(this.f20681d, this.f20682e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.z1 z1Var = (bg2.z1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.r71 r71Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bg2.d2 d2Var = this.f20681d;
        java.util.Iterator it = d2Var.f417141d.f417144d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            r71Var = this.f20682e;
            if (!hasNext) {
                break;
            }
            java.lang.Object obj2 = (tc2.c) it.next();
            tc2.h hVar = obj2 instanceof tc2.h ? (tc2.h) obj2 : null;
            if (hVar != null) {
                hVar.H0(r71Var);
            }
        }
        for (java.lang.Object obj3 : d2Var.f417141d.f417144d) {
            tc2.h hVar2 = obj3 instanceof tc2.h ? (tc2.h) obj3 : null;
            if (hVar2 != null) {
                hVar2.onLiveMsg(r71Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
