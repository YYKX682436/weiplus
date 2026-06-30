package a84;

/* loaded from: classes4.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f2306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f2307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f2308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2310h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2311i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2312m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ za4.a f2313n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f2314o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f2315p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2316q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.view.View f2317r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.k4 f2318s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2319t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2320u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsns.SnsAdClick f2321v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w64.x f2322w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.ui.MMActivity mMActivity, long j17, int i17, java.lang.String str, java.lang.String str2, za4.a aVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, i64.b1 b1Var, int i18, android.view.View view, com.tencent.mm.plugin.sns.model.k4 k4Var, int i19, int i27, com.tencent.mm.modelsns.SnsAdClick snsAdClick, w64.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2307e = h0Var;
        this.f2308f = mMActivity;
        this.f2309g = j17;
        this.f2310h = i17;
        this.f2311i = str;
        this.f2312m = str2;
        this.f2313n = aVar;
        this.f2314o = snsInfo;
        this.f2315p = b1Var;
        this.f2316q = i18;
        this.f2317r = view;
        this.f2318s = k4Var;
        this.f2319t = i19;
        this.f2320u = i27;
        this.f2321v = snsAdClick;
        this.f2322w = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
        a84.j0 j0Var = new a84.j0(this.f2307e, this.f2308f, this.f2309g, this.f2310h, this.f2311i, this.f2312m, this.f2313n, this.f2314o, this.f2315p, this.f2316q, this.f2317r, this.f2318s, this.f2319t, this.f2320u, this.f2321v, this.f2322w, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
        return j0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
        java.lang.Object invokeSuspend = ((a84.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f2306d;
        kotlin.jvm.internal.h0 h0Var = this.f2307e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.MMActivity mMActivity = this.f2308f;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(mMActivity, "", mMActivity.getString(com.tencent.mm.R.string.f490468vx), false, false, null);
            h0Var.f310123d = Q;
            if (Q != null) {
                Q.show();
            }
            a84.o0 o0Var = a84.o0.f2344a;
            long j18 = this.f2309g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$toFromSource", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toFromSource", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            int i18 = this.f2310h;
            int i19 = i18 != 1 ? i18 != 2 ? 1 : 16 : 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toFromSource", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$toFromSource", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            java.lang.String str = this.f2311i;
            java.lang.String str2 = this.f2312m;
            za4.a aVar2 = this.f2313n;
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f2308f;
            this.f2306d = 1;
            j17 = o0Var.j(j18, 0, 0, i19, str, str2, aVar2, mMActivity2, this);
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
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
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        a84.o0.e(str3 == null ? "" : str3, this.f2310h, this.f2314o, this.f2315p, this.f2316q, this.f2308f, this.f2317r, this.f2318s, this.f2319t, this.f2320u, this.f2321v, this.f2322w);
        if (booleanValue) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1967, 4);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1967, 5);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
        return f0Var;
    }
}
