package ch0;

/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41212a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI f41213b;

    public g0(boolean z17, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI) {
        this.f41212a = z17;
        this.f41213b = preLoadWebViewUI;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch0.g0)) {
            return false;
        }
        ch0.g0 g0Var = (ch0.g0) obj;
        return this.f41212a == g0Var.f41212a && kotlin.jvm.internal.o.b(this.f41213b, g0Var.f41213b);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f41212a) * 31;
        com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI = this.f41213b;
        return hashCode + (preLoadWebViewUI == null ? 0 : preLoadWebViewUI.hashCode());
    }

    public java.lang.String toString() {
        return "ValidationResult(isValid=" + this.f41212a + ", activity=" + this.f41213b + ')';
    }

    public /* synthetic */ g0(boolean z17, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : preLoadWebViewUI);
    }
}
