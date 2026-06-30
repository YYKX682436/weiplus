package if1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f372599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f372600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl1.a f372601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f372602g;

    public f(if1.g gVar, boolean z17, android.graphics.Bitmap bitmap, gl1.a aVar, android.graphics.Bitmap bitmap2) {
        this.f372599d = z17;
        this.f372600e = bitmap;
        this.f372601f = aVar;
        this.f372602g = bitmap2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        boolean z17 = this.f372599d;
        gl1.a aVar = this.f372601f;
        if (!z17 || (bitmap = this.f372600e) == null) {
            aVar.mo51885xd44890a8(this.f372602g);
        } else {
            aVar.mo51885xd44890a8(bitmap);
        }
    }
}
