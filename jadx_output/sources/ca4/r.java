package ca4;

/* loaded from: classes15.dex */
public class r implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f40008d;

    public r(ca4.b0 b0Var) {
        this.f40008d = b0Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$1");
        try {
            ca4.b0 b0Var = this.f40008d;
            b0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createQRCodeMenuItem", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            android.view.View b17 = ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) b0Var.f39829c).b(new ca4.t(b0Var), b0Var.f39830d, b0Var.f39832f, 9);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createQRCodeMenuItem", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            if (b17 instanceof com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) {
                ((com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) b17).setTopPaddingVisibility(8);
            }
            ca4.b0.a(this.f40008d).o(b17);
            android.view.View view = new android.view.View(ca4.b0.b(this.f40008d));
            view.setMinimumHeight(i65.a.b(ca4.b0.b(this.f40008d), 2));
            ca4.b0.a(this.f40008d).s(view, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "onCreateMMMenu exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$1");
    }
}
