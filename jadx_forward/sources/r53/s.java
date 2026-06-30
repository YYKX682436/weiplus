package r53;

/* loaded from: classes8.dex */
public class s implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f474222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f474223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f474224c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f474225d;

    public s(r53.y yVar, android.widget.ImageView imageView, int i17, int i18, int i19) {
        this.f474222a = imageView;
        this.f474223b = i17;
        this.f474224c = i18;
        this.f474225d = i19;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new r53.r(this, bitmap));
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
