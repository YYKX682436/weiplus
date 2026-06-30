package aj4;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f5366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.ComponentActivity f5367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f5368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f5369g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.activity.ComponentActivity componentActivity, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5367e = componentActivity;
        this.f5368f = recordConfigProvider;
        this.f5369g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aj4.s(this.f5367e, this.f5368f, this.f5369g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aj4.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5366d;
        kz5.p0 p0Var = kz5.p0.f313996d;
        yz5.l lVar = this.f5369g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
                androidx.activity.ComponentActivity componentActivity = this.f5367e;
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider provider = this.f5368f;
                kotlin.jvm.internal.o.f(provider, "$provider");
                this.f5366d = 1;
                obj = ((pc0.e2) c1Var).wi(componentActivity, provider, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            qc0.m1 m1Var = (qc0.m1) obj;
            int i18 = m1Var.f361411b;
            if (i18 == -1 && m1Var.f361412c == 0) {
                qc0.l1 a17 = m1Var.a();
                bw5.sb sbVar = null;
                if (a17 != null) {
                    aj4.v vVar = aj4.v.f5377a;
                    boolean b17 = a17.b();
                    java.lang.String str = a17.f361396b;
                    sbVar = b17 ? vVar.c(str, a17.f361397c, null) : vVar.b(str);
                }
                if (sbVar != null) {
                    lVar.invoke(new aj4.n(kz5.b0.c(sbVar), 0L, null, 6, null));
                } else {
                    lVar.invoke(new aj4.n(p0Var, -1L, "capture result empty"));
                }
            } else {
                lVar.invoke(new aj4.n(p0Var, i18, "capture cancelled"));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatusFlutterMediaProvider", th6, "pickFromCapture failed", new java.lang.Object[0]);
            java.lang.String message = th6.getMessage();
            if (message == null) {
                message = "capture failed";
            }
            lVar.invoke(new aj4.n(p0Var, -1L, message));
        }
        return jz5.f0.f302826a;
    }
}
