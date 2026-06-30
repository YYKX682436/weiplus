package ah1;

/* loaded from: classes7.dex */
public final class f0 implements kk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ah1.i0 f4823a;

    public f0(ah1.i0 i0Var) {
        this.f4823a = i0Var;
    }

    @Override // kk1.c
    public final void a(java.lang.String str) {
        android.content.Context context = this.f4823a.getContext();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("forceHideShare", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
