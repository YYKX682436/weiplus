package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f109960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f109961e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.e(this.f109961e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object x17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f109960d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g92.b bVar = g92.b.f269769e;
            this.f109960d = 1;
            x17 = bVar.x1(2, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            x17 = ((kotlin.Result) obj).getValue();
        }
        if (kotlin.Result.m528isSuccessimpl(x17)) {
            g92.b bVar2 = g92.b.f269769e;
            java.lang.String str = this.f109961e;
            m92.b j37 = g92.a.j3(bVar2, str, false, 2, null);
            r45.d1 d1Var = j37 != null ? (r45.d1) j37.u0().getCustom(9) : null;
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            if (b6Var != null) {
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.d(((c61.l7) b6Var).ll(), str, d1Var));
            }
        }
        if (kotlin.Result.m524exceptionOrNullimpl(x17) != null) {
            com.tencent.mars.xlog.Log.e("Finder.AccountManagementUI", "openFromJsApi awaitCgiFinderUsersPrepare failed");
        }
        return jz5.f0.f302826a;
    }
}
