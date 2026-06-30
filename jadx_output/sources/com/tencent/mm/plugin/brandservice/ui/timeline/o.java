package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class o implements com.tencent.mm.plugin.webview.ui.tools.widget.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94169a;

    public o(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        this.f94169a = bizTestUI;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.n
    public boolean a(java.lang.String str) {
        db5.t7.makeText(this.f94169a.getContext(), "menu click", 0).show();
        return false;
    }
}
