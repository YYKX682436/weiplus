package ch2;

/* loaded from: classes10.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f41358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f41359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f41361h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f41362i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(kotlin.jvm.internal.h0 h0Var, boolean z17, ch2.o2 o2Var, r45.yx1 yx1Var, kotlin.jvm.internal.h0 h0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41358e = h0Var;
        this.f41359f = z17;
        this.f41360g = o2Var;
        this.f41361h = yx1Var;
        this.f41362i = h0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.g2(this.f41358e, this.f41359f, this.f41360g, this.f41361h, this.f41362i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.g2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41357d;
        r45.yx1 yx1Var = this.f41361h;
        ch2.o2 o2Var = this.f41360g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f41357d = 1;
            if (kotlinx.coroutines.k1.b(60000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                ch2.o2 o2Var2 = this.f41360g;
                kotlin.jvm.internal.h0 h0Var = this.f41362i;
                ch2.o2.Z6(o2Var2, false, (org.json.JSONObject) h0Var.f310123d, 60000L, this.f41361h);
                gh2.f l76 = o2Var.l7();
                java.lang.String unique_id = yx1Var.f391459e;
                kotlin.jvm.internal.o.f(unique_id, "unique_id");
                l76.O6(unique_id, gh2.b.f271863p, new ch2.f2(h0Var));
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) this.f41358e.f310123d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timeout, mainSinger: ");
        boolean z17 = this.f41359f;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", sb6.toString());
        if (!z17) {
            java.util.List list = (java.util.List) ((kotlinx.coroutines.flow.h3) o2Var.q7().A).getValue();
            if (list != null) {
                o2Var.v7(list, false);
            }
            return jz5.f0.f302826a;
        }
        java.lang.String string = o2Var.O6().getResources().getString(com.tencent.mm.R.string.f491580mj3);
        this.f41357d = 2;
        if (o2Var.s7(yx1Var, string, this) == aVar) {
            return aVar;
        }
        ch2.o2 o2Var22 = this.f41360g;
        kotlin.jvm.internal.h0 h0Var2 = this.f41362i;
        ch2.o2.Z6(o2Var22, false, (org.json.JSONObject) h0Var2.f310123d, 60000L, this.f41361h);
        gh2.f l762 = o2Var.l7();
        java.lang.String unique_id2 = yx1Var.f391459e;
        kotlin.jvm.internal.o.f(unique_id2, "unique_id");
        l762.O6(unique_id2, gh2.b.f271863p, new ch2.f2(h0Var2));
        return jz5.f0.f302826a;
    }
}
