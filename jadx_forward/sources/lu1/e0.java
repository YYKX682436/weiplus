package lu1;

/* loaded from: classes5.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f402871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f402872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f402873f;

    public e0(android.widget.ImageView imageView, int i17, int i18) {
        this.f402871d = imageView;
        this.f402872e = i17;
        this.f402873f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f402872e;
        android.widget.ImageView imageView = this.f402871d;
        imageView.setImageResource(i17);
        imageView.setColorFilter(this.f402873f, android.graphics.PorterDuff.Mode.SRC_IN);
    }
}
