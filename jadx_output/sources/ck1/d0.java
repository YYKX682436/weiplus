package ck1;

/* loaded from: classes4.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f42313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.o f42314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck1.y0 f42315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ck1.o oVar, ck1.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42314e = oVar;
        this.f42315f = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ck1.d0(this.f42314e, this.f42315f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ck1.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f42313d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean C = com.tencent.mm.ui.bk.C();
            ck1.o oVar = this.f42314e;
            java.lang.String str = C ? ((ck1.n) oVar).f42353a.f42383c.f378983h : ((ck1.n) oVar).f42353a.f42383c.f378982g;
            if (str == null) {
                str = ((ck1.n) oVar).f42353a.f42383c.f378982g;
            }
            if (str != null) {
                android.widget.ImageView imageView = ((ck1.x0) this.f42315f).f42395d;
                this.f42313d = 1;
                if (com.tencent.mm.plugin.appbrand.utils.v2.a(str, imageView, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
