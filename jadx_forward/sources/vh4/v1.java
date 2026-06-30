package vh4;

/* loaded from: classes.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f518692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518695g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f518696h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f518697i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vh4.t1 f518698m;

    public v1(vh4.t1 t1Var, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        this.f518698m = t1Var;
        this.f518692d = context;
        this.f518693e = str;
        this.f518694f = str2;
        this.f518695g = str3;
        this.f518696h = j17;
        this.f518697i = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f518698m.Di(this.f518692d, this.f518693e, this.f518694f, this.f518695g, this.f518696h, this.f518697i);
    }
}
