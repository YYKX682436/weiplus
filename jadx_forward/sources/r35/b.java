package r35;

/* loaded from: classes11.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.a f450575d;

    public b(r35.a aVar) {
        this.f450575d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        r35.a aVar = this.f450575d;
        aVar.f(false, false, aVar.f450550r, aVar.f450557y);
    }
}
