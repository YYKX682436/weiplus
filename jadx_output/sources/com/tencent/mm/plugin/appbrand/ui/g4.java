package com.tencent.mm.plugin.appbrand.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class g4 extends com.tencent.mm.plugin.appbrand.ui.f6 {
    public g4(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo) {
        super(context, o6Var, wxaAttributes$WxaVersionInfo);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.f6
    public void L() {
        super.L();
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.it);
        int d17 = i65.a.d(getContext(), com.tencent.mm.R.color.f478512u);
        int d18 = i65.a.d(getContext(), com.tencent.mm.R.color.aaw);
        this.f89705y.setMainTitle(string);
        this.f89705y.setForegroundStyle("white");
        this.f89705y.setForegroundColor(d18);
        B(d17, false, true);
        setBackgroundResource(com.tencent.mm.R.color.f478512u);
    }
}
