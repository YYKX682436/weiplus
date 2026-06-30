package a84;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f2343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f2343d = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt$enableAdTextClickableByTemplate$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt$enableAdTextClickableByTemplate$1");
        if (obj instanceof org.json.JSONObject) {
            int optInt = ((org.json.JSONObject) obj).optInt("area-type");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAREA_TYPE_TEXT", "com.tencent.mm.plugin.sns.ad.utils.AdClickableAreas");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAREA_TYPE_TEXT", "com.tencent.mm.plugin.sns.ad.utils.AdClickableAreas");
            if (optInt == 1) {
                this.f2343d.f310112d = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt$enableAdTextClickableByTemplate$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt$enableAdTextClickableByTemplate$1");
        return f0Var;
    }
}
