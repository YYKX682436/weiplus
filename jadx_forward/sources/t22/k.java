package t22;

/* loaded from: classes10.dex */
public final class k implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t22.l f496625d;

    public k(t22.l lVar) {
        this.f496625d = lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        t22.l lVar = this.f496625d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f496629d, "startStickerPreview: cancel loading");
        lVar.f496630e = true;
        lVar.a(false);
    }
}
