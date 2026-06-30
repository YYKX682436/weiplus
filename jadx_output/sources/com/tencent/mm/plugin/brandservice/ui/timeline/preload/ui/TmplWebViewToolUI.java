package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

@db5.a(640)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI;", "Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class TmplWebViewToolUI extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI {
    public static final /* synthetic */ int G3 = 0;
    public ls1.e0 E3;
    public final java.lang.String A3 = "MicroMsg.TmplWebViewToolUI";
    public final long B3 = 800;
    public final jz5.g C3 = jz5.h.b(new ls1.m0(this));
    public final jz5.g D3 = jz5.h.b(new ls1.k0(this));
    public final ls1.n0 F3 = new ls1.n0(this);

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean S8() {
        return !m9();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public com.tencent.mm.ui.widget.MMWebView d7() {
        com.tencent.mm.ui.widget.MMWebView d76;
        if (this.M1) {
            d76 = super.d7();
        } else {
            ls1.e0 e0Var = this.E3;
            d76 = e0Var == null ? super.d7() : e0Var.f181916a;
        }
        if (d76 == null) {
            return null;
        }
        this.H1.a(d76, com.tencent.mm.ui.b4.c(this));
        return d76;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public com.tencent.mm.plugin.webview.core.e3 e7() {
        ls1.e0 e0Var = this.E3;
        return e0Var != null ? e0Var : super.e7();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean i9() {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean l7() {
        return true;
    }

    public final boolean m9() {
        return ((java.lang.Boolean) ((jz5.n) this.D3).getValue()).booleanValue();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean n7(java.lang.String str) {
        return com.tencent.mm.ui.b4.c(this) && this.G1.a();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ls1.e0 e0Var = this.E3;
        if (e0Var != null) {
            e0Var.L0(this.F3);
        }
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y8() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI.y8():void");
    }
}
