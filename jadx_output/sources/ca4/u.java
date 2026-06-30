package ca4;

/* loaded from: classes15.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f40028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ca4.v f40030f;

    public u(ca4.v vVar, java.lang.Object obj, int i17) {
        this.f40030f = vVar;
        this.f40028d = obj;
        this.f40029e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ca4.v vVar = this.f40030f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1$1");
        try {
            byte[] bArr = (byte[]) this.f40028d;
            ca4.b0 b0Var = vVar.f40031a.f40058c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            kd0.p2 p2Var = b0Var.f39829c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            ca4.x xVar = vVar.f40031a;
            if (p2Var != null) {
                ca4.b0 b0Var2 = xVar.f40058c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                kd0.p2 p2Var2 = b0Var2.f39829c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var2).o(this.f40029e, bArr);
            }
            if (ca4.b0.a(xVar.f40058c) != null) {
                ca4.b0.a(xVar.f40058c).v();
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "there is something wrong in AdLandingPagesProxy call back");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1$1");
    }
}
