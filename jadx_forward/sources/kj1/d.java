package kj1;

/* loaded from: classes5.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj1.m f389832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f389833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f389835g;

    public d(kj1.m mVar, android.app.Activity activity, java.lang.String str, yz5.l lVar) {
        this.f389832d = mVar;
        this.f389833e = activity;
        this.f389834f = str;
        this.f389835g = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f389832d.e(this.f389833e, this.f389834f);
        yz5.l lVar = this.f389835g;
        if (lVar != null) {
            lVar.mo146xb9724478(kj1.g0.f389862g);
        }
    }
}
