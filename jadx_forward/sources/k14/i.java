package k14;

/* loaded from: classes15.dex */
public class i implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.j f384873d;

    public i(k14.j jVar) {
        this.f384873d = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        k14.j jVar = this.f384873d;
        k14.k kVar = jVar.f384875d;
        k14.u uVar = kVar.f384876d;
        if (uVar != null) {
            uVar.a(kVar.f384877e, false, null);
        }
        jVar.f384875d.a();
    }
}
