package ai0;

/* loaded from: classes14.dex */
public final class k implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai0.m f5073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.q3 f5074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f5075c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5076d;

    public k(ai0.m mVar, com.tencent.mm.ui.widget.dialog.q3 q3Var, kotlinx.coroutines.q qVar, java.lang.Object obj) {
        this.f5073a = mVar;
        this.f5074b = q3Var;
        this.f5075c = qVar;
        this.f5076d = obj;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        if (this.f5073a.f5079b) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.q3 q3Var = this.f5074b;
        if (q3Var != null) {
            q3Var.dismiss();
        }
        try {
            kotlinx.coroutines.q qVar = this.f5075c;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(this.f5076d));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotHalfScreenDialog", th6, "[-] fail to resume cont.", new java.lang.Object[0]);
        }
    }
}
