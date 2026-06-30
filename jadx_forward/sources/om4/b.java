package om4;

/* loaded from: classes11.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ om4.c f427945d;

    public b(om4.c cVar) {
        this.f427945d = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        om4.c cVar = this.f427945d;
        cVar.f427946d.b(false, null);
        cVar.f427946d.c();
    }
}
