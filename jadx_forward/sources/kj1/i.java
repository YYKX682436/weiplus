package kj1;

/* loaded from: classes5.dex */
public final class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj1.m f389869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f389870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f389872g;

    public i(kj1.m mVar, android.app.Activity activity, java.lang.String str, yz5.l lVar) {
        this.f389869d = mVar;
        this.f389870e = activity;
        this.f389871f = str;
        this.f389872g = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f389869d.e(this.f389870e, this.f389871f);
        yz5.l lVar = this.f389872g;
        if (lVar != null) {
            lVar.mo146xb9724478(kj1.g0.f389862g);
        }
    }
}
