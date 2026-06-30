package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class g0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f67154b;

    public g0(com.tencent.mm.feature.lite.i iVar, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, q80.f0 f0Var) {
        this.f67153a = wxaLiteAppStartReport;
        this.f67154b = f0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f67153a.I;
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.STRICT_MODE_CANCEL);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.lite.f0(this));
    }
}
