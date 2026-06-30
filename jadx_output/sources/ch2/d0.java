package ch2;

/* loaded from: classes10.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f41304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f41307g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, java.lang.String str2, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f41304d = hVar;
        this.f41305e = str;
        this.f41306f = str2;
        this.f41307g = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.d0(this.f41304d, continuation, this.f41305e, this.f41306f, this.f41307g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch2.d0 d0Var = (ch2.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.ix1 ix1Var = (r45.ix1) ((xg2.i) this.f41304d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSongPlayDetailInfo success sdkUserId: ");
        sb6.append(this.f41305e);
        sb6.append(" songUniqueId: ");
        sb6.append(this.f41306f);
        sb6.append(" it.play_info: ");
        sb6.append(ix1Var.f377386d);
        sb6.append(" res: ");
        r45.by1 by1Var = ix1Var.f377386d;
        sb6.append(by1Var != null ? by1Var.f371144e : null);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", sb6.toString());
        this.f41307g.f310123d = ix1Var.f377386d;
        return jz5.f0.f302826a;
    }
}
