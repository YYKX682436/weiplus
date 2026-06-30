package ax4;

/* loaded from: classes.dex */
public final class i implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f15134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f15135e;

    public i(nw4.k kVar, nw4.y2 y2Var) {
        this.f15134d = kVar;
        this.f15135e = y2Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        nw4.g gVar = this.f15134d.f340863d;
        nw4.y2 y2Var = this.f15135e;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
    }
}
