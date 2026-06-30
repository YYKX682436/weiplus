package qj3;

/* loaded from: classes10.dex */
public final class a implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qj3.g f445403a;

    public a(qj3.g gVar) {
        this.f445403a = gVar;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        if (bitmap != null) {
            this.f445403a.getClass();
        }
    }

    @Override // qk.p7
    /* renamed from: onError */
    public void mo9160xaf8aa769(java.lang.Exception exc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkEditPhotoContainerPlugin", "photoEditor onError: %s", exc);
        this.f445403a.f445418p = false;
    }
}
