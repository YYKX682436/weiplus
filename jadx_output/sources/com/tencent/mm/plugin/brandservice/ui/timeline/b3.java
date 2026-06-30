package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes8.dex */
public final class b3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94106d;

    public b3(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        this.f94106d = bizTestUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = dialogInterface instanceof com.tencent.mm.ui.widget.dialog.j0 ? (com.tencent.mm.ui.widget.dialog.j0) dialogInterface : null;
        java.lang.String h17 = j0Var != null ? j0Var.h() : null;
        if (h17 == null) {
            h17 = "";
        }
        boolean N = r26.n0.N(h17);
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f94106d;
        if (!N) {
            bizTestUI.getClass();
            bizTestUI.g = h17;
            bizTestUI.e.D("HalfscreenWebViewTestUrl", bizTestUI.g);
        }
        androidx.appcompat.app.AppCompatActivity context = bizTestUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!r26.n0.B(h17, "http", false) && !r26.n0.B(h17, "www", false)) {
            h17 = bizTestUI.g;
        }
        bizTestUI.f = new com.tencent.mm.plugin.webview.ui.tools.widget.m1(context, h17, null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1(0.0f, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, true, true, null, false, 0, false, 0, false, false, false, 8364031, null), 4, null);
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.U6(bizTestUI);
        com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var = bizTestUI.f;
        if (m1Var != null) {
            m1Var.show();
        }
        pm0.v.V(2000L, new com.tencent.mm.plugin.brandservice.ui.timeline.a3(bizTestUI));
    }
}
