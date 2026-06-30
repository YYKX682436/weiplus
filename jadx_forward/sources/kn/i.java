package kn;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kn.j f390943d;

    public i(kn.j jVar) {
        this.f390943d = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        kn.j jVar = this.f390943d;
        jVar.f390944d.a(false, null, -1);
        jVar.f390944d.b();
    }
}
