package ca4;

/* loaded from: classes15.dex */
public class v implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.x f40031a;

    public v(ca4.x xVar) {
        this.f40031a = xVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchQRCodeInfo, errType=");
        sb6.append(i17);
        sb6.append(", data==null?");
        sb6.append(obj == null);
        com.tencent.mars.xlog.Log.i("SnsAdQRHelper", sb6.toString());
        ca4.x xVar = this.f40031a;
        if (android.text.TextUtils.isEmpty(ca4.b0.c(xVar.f40058c))) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "the qr code string is empty in AdLandingPagesProxy call back");
            ca4.a0 a0Var = xVar.f40056a;
            if (a0Var != null) {
                a0Var.a(xVar.f40057b, false, "fetchQRCodeInfo empty", ca4.b0.f(xVar.f40058c));
            }
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new ca4.u(this, obj, i17));
            ca4.a0 a0Var2 = xVar.f40056a;
            if (a0Var2 == null || i17 != 0) {
                a0Var2.a(xVar.f40057b, false, " errType!=MM_OK", ca4.b0.f(xVar.f40058c));
            } else {
                a0Var2.a(xVar.f40057b, true, "", ca4.b0.f(xVar.f40058c));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
    }
}
