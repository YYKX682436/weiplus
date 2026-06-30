package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class j5 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u26.w f10615a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(u26.w wVar, android.os.Handler handler) {
        super(handler);
        this.f10615a = wVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17, android.net.Uri uri) {
        this.f10615a.e(jz5.f0.f302826a);
    }
}
