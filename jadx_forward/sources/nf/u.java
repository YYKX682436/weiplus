package nf;

/* loaded from: classes.dex */
public class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f418144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f418146f;

    public u(android.app.Activity activity, java.lang.String str, int i17) {
        this.f418144d = activity;
        this.f418145e = str;
        this.f418146f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        z2.h.a(this.f418144d, new java.lang.String[]{this.f418145e}, this.f418146f);
    }
}
