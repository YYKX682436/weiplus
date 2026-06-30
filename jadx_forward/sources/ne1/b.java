package ne1;

/* loaded from: classes7.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f418046d;

    public b(ne1.d dVar, java.lang.Runnable runnable) {
        this.f418046d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f418046d.run();
    }
}
