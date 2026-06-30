package ad5;

/* loaded from: classes5.dex */
public final class r implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f3301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f3302e;

    public r(kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f3301d = c0Var;
        this.f3302e = h0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f3301d.f310112d = true;
        kotlin.jvm.internal.h0 h0Var = this.f3302e;
        yz5.a aVar = (yz5.a) h0Var.f310123d;
        if (aVar != null) {
            aVar.invoke();
        }
        h0Var.f310123d = null;
    }
}
