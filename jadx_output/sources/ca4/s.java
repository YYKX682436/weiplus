package ca4;

/* loaded from: classes15.dex */
public class s implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f40012d;

    public s(ca4.b0 b0Var) {
        this.f40012d = b0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        ca4.b0 b0Var = this.f40012d;
        kd0.p2 p2Var = b0Var.f39829c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).n();
        b0Var.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$2");
    }
}
