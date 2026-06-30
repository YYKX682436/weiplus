package az0;

/* loaded from: classes5.dex */
public final class ia extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f15588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(java.lang.Integer num, az0.xb xbVar) {
        super(1);
        this.f15588d = num;
        this.f15589e = xbVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession;
        jz5.f0 f0Var = jz5.f0.f302826a;
        az0.xb xbVar = this.f15589e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Integer num = this.f15588d;
            if (num != null && (mJCamoSession = xbVar.f16060i) != null) {
                mJCamoSession.k(num.intValue());
            }
            kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return f0Var;
    }
}
