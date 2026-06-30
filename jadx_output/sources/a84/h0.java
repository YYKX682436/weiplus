package a84;

/* loaded from: classes4.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f2289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f2290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f2291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2292g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2293h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2294i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2295m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ za4.a f2296n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2297o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.l f2298p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f2299q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.ui.MMActivity mMActivity, long j17, int i17, java.lang.String str, java.lang.String str2, za4.a aVar, java.lang.String str3, yz5.l lVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2290e = h0Var;
        this.f2291f = mMActivity;
        this.f2292g = j17;
        this.f2293h = i17;
        this.f2294i = str;
        this.f2295m = str2;
        this.f2296n = aVar;
        this.f2297o = str3;
        this.f2298p = lVar;
        this.f2299q = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
        a84.h0 h0Var = new a84.h0(this.f2290e, this.f2291f, this.f2292g, this.f2293h, this.f2294i, this.f2295m, this.f2296n, this.f2297o, this.f2298p, this.f2299q, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
        return h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
        java.lang.Object invokeSuspend = ((a84.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f2289d;
        kotlin.jvm.internal.h0 h0Var = this.f2290e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.MMActivity mMActivity = this.f2291f;
            h0Var.f310123d = db5.e1.Q(mMActivity, "", mMActivity.getString(com.tencent.mm.R.string.f490468vx), false, false, null);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
            if (u3Var != null) {
                u3Var.show();
            }
            a84.o0 o0Var = a84.o0.f2344a;
            long j18 = this.f2292g;
            int i18 = this.f2293h;
            java.lang.String str = this.f2294i;
            java.lang.String str2 = this.f2295m;
            za4.a aVar2 = this.f2296n;
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f2291f;
            this.f2289d = 1;
            j17 = o0Var.j(j18, 0, 0, i18, str, str2, aVar2, mMActivity2, this);
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        jz5.l lVar = (jz5.l) j17;
        if (lVar == null) {
            lVar = new jz5.l(java.lang.Boolean.FALSE, "");
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        java.lang.String str3 = (java.lang.String) lVar.f302834e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestAdCanvasXml() end ");
        sb6.append(booleanValue);
        sb6.append(' ');
        sb6.append(str3 != null ? new java.lang.Integer(str3.length()) : null);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("OpenAdCanvasHelper", sb6.toString());
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var2 != null) {
            u3Var2.dismiss();
        }
        java.lang.String str4 = this.f2297o;
        java.lang.String h17 = a84.o0.h(str3, str4);
        if (h17 == null) {
            h17 = str4;
        }
        if (za4.z0.u(h17)) {
            this.f2298p.invoke(h17 != null ? h17 : "");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1967, 1);
        } else {
            this.f2299q.invoke(str4 != null ? str4 : "");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1967, 2);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
        return f0Var;
    }
}
