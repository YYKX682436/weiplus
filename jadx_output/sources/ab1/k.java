package ab1;

/* loaded from: classes.dex */
public final class k implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f2728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f2729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f2730f;

    public k(kotlin.jvm.internal.c0 c0Var, yz5.a aVar, kotlin.jvm.internal.h0 h0Var) {
        this.f2728d = c0Var;
        this.f2729e = aVar;
        this.f2730f = h0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        if (!this.f2728d.f310112d) {
            this.f2729e.invoke();
        }
        com.tencent.mm.ui.widget.dialog.g.b((android.app.Dialog) this.f2730f.f310123d);
    }
}
