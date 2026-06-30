package bs2;

/* loaded from: classes2.dex */
public final class k1 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f23877b;

    public k1(java.lang.String str, com.tencent.mm.ui.widget.dialog.u1 u1Var) {
        this.f23876a = str;
        this.f23877b = u1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("clipboard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((android.content.ClipboardManager) systemService).setText(this.f23876a);
        this.f23877b.e(bs2.j1.f23872d);
    }
}
