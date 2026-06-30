package pz0;

/* loaded from: classes10.dex */
public final class p implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pz0.r f440690d;

    public p(pz0.r rVar) {
        this.f440690d = rVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public final boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener activityResultListener = this.f440690d.f440696g;
        if (activityResultListener != null) {
            return activityResultListener.mo63506x9d4787cb(i17, i18, intent);
        }
        return false;
    }
}
