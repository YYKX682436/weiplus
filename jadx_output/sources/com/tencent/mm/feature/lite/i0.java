package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class i0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f67192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f67194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f67195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData f67197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67198h;

    public i0(com.tencent.mm.feature.lite.i iVar, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, q80.f0 f0Var, android.content.Context context, android.os.Bundle bundle, boolean z17, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport2, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData) {
        this.f67198h = iVar;
        this.f67191a = wxaLiteAppStartReport;
        this.f67192b = f0Var;
        this.f67193c = context;
        this.f67194d = bundle;
        this.f67195e = z17;
        this.f67196f = wxaLiteAppStartReport2;
        this.f67197g = openExtraData;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f67191a.I;
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.STRICT_MODE_RETRY);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.lite.h0(this));
    }
}
