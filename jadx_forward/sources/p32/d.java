package p32;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f432993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f432994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f432996g;

    public d(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, int i17) {
        this.f432993d = context;
        this.f432994e = imageView;
        this.f432995f = str;
        this.f432996g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        p32.g.b(this.f432993d, this.f432994e, this.f432995f, this.f432996g);
    }
}
