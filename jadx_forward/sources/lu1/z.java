package lu1;

/* loaded from: classes5.dex */
public class z implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f402891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f402892f;

    public z(java.lang.String str, android.widget.ImageView imageView, boolean z17) {
        this.f402890d = str;
        this.f402891e = imageView;
        this.f402892f = z17;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.lang.String str2 = this.f402890d;
        if (str2 == null || bitmap == null || bitmap.isRecycled() || !str.equals(str2)) {
            return;
        }
        this.f402891e.post(new lu1.y(this, bitmap));
    }
}
