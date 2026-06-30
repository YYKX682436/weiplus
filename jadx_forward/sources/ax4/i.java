package ax4;

/* loaded from: classes.dex */
public final class i implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f96667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f96668e;

    public i(nw4.k kVar, nw4.y2 y2Var) {
        this.f96667d = kVar;
        this.f96668e = y2Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        nw4.g gVar = this.f96667d.f422396d;
        nw4.y2 y2Var = this.f96668e;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
    }
}
