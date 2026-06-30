package hr3;

/* loaded from: classes11.dex */
public final class bg implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.gg f364964d;

    public bg(hr3.gg ggVar) {
        this.f364964d = ggVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        hr3.gg ggVar = this.f364964d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = ggVar.f365129f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ggVar.f365129f = null;
    }
}
