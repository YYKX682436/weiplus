package jz0;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz0.k f384110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f384111e;

    public g(jz0.k kVar, boolean z17) {
        this.f384110d = kVar;
        this.f384111e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz0.k kVar = this.f384110d;
        if (kVar.f384125p) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_update_preview_video_del", this.f384111e);
            kVar.m158354x19263085().setResult(-1, intent);
        }
        kVar.m158354x19263085().finish();
        kVar.m158354x19263085().overridePendingTransition(0, 0);
    }
}
