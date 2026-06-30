package d55;

/* loaded from: classes12.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    public static final long f308157e = java.util.concurrent.TimeUnit.DAYS.toMillis(1) / 2;

    /* renamed from: a, reason: collision with root package name */
    public long f308158a;

    /* renamed from: b, reason: collision with root package name */
    public final long f308159b;

    /* renamed from: c, reason: collision with root package name */
    public final long f308160c;

    /* renamed from: d, reason: collision with root package name */
    public final d55.x f308161d;

    public y(android.content.Context context) {
        d55.w wVar = new d55.w(context, "recovery_internal");
        wVar.e();
        this.f308161d = wVar;
        this.f308160c = wVar.mo123526xfb822ef2("internal_overheat_enable", 1L);
        this.f308158a = wVar.mo123526xfb822ef2("internal_last_ui_launched", 0L);
        this.f308159b = wVar.mo123526xfb822ef2("internal_ui_launch_interval", f308157e);
    }

    public void a() {
        d55.w wVar = (d55.w) this.f308161d;
        wVar.g("internal_overheat_enable", this.f308160c);
        wVar.g("internal_last_ui_launched", this.f308158a);
        wVar.g("internal_ui_launch_interval", this.f308159b);
        wVar.h();
    }
}
