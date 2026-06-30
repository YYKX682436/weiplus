package po0;

/* loaded from: classes5.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f438814e;

    public a(yz5.l lVar, android.graphics.Bitmap bitmap) {
        this.f438813d = lVar;
        this.f438814e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f438813d;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f438814e);
        }
    }
}
