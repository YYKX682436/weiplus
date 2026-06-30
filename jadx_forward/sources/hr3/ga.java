package hr3;

/* loaded from: classes11.dex */
public class ga implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f365117d;

    public ga(hr3.va vaVar) {
        this.f365117d = vaVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f365117d.f365641d = true;
    }
}
