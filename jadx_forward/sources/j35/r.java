package j35;

/* loaded from: classes3.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f379052d;

    public r(android.content.Context context) {
        this.f379052d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        j35.u.g(this.f379052d);
    }
}
