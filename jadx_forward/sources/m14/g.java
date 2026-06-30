package m14;

/* loaded from: classes11.dex */
public class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.j f404407d;

    public g(m14.j jVar) {
        this.f404407d = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        m14.f fVar = this.f404407d.f404411d;
        fVar.f404404c = true;
        fVar.f404405d.m108007xae7a2e7a();
    }
}
