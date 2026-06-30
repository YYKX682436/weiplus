package e04;

/* loaded from: classes15.dex */
public class f0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bi4.t0 f327448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.p f327449e;

    public f0(e04.p pVar, bi4.t0 t0Var) {
        this.f327449e = pVar;
        this.f327448d = t0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f327448d.mo10635xae7a2e7a();
        rz3.e eVar = this.f327449e.f327592w;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }
}
