package dz4;

/* loaded from: classes12.dex */
public final class f3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.s f326774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iz4.k f326775e;

    public f3(mz4.s sVar, iz4.k kVar) {
        this.f326774d = sVar;
        this.f326775e = kVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        mz4.s sVar = this.f326774d;
        sVar.f414881p = true;
        sVar.interrupt();
        this.f326775e.f377653w = true;
    }
}
