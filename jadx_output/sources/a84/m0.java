package a84;

/* loaded from: classes.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2330d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f2331e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f2332f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f2333g;

    /* renamed from: h, reason: collision with root package name */
    public int f2334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f2335i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2336m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2337n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2338o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2339p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2340q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ za4.a f2341r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ im5.b f2342s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(long j17, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, za4.a aVar, im5.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2335i = j17;
        this.f2336m = i17;
        this.f2337n = i18;
        this.f2338o = i19;
        this.f2339p = str;
        this.f2340q = str2;
        this.f2341r = aVar;
        this.f2342s = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
        a84.m0 m0Var = new a84.m0(this.f2335i, this.f2336m, this.f2337n, this.f2338o, this.f2339p, this.f2340q, this.f2341r, this.f2342s, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
        return m0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
        java.lang.Object invokeSuspend = ((a84.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f2334h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j18 = this.f2335i;
            int i18 = this.f2336m;
            int i19 = this.f2337n;
            int i27 = this.f2338o;
            java.lang.String str = this.f2339p;
            java.lang.String str2 = this.f2340q;
            za4.a aVar2 = this.f2341r;
            im5.b bVar = this.f2342s;
            this.f2330d = str;
            this.f2331e = str2;
            this.f2332f = aVar2;
            this.f2333g = bVar;
            this.f2334h = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            za4.s1.f(j18, i18, i19, i27, str, str2, aVar2, new a84.l0(rVar), bVar);
            j17 = rVar.j();
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
        return j17;
    }
}
