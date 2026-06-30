package lr;

/* loaded from: classes10.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f402093a;

    /* renamed from: b, reason: collision with root package name */
    public int f402094b;

    /* renamed from: c, reason: collision with root package name */
    public int f402095c;

    /* renamed from: d, reason: collision with root package name */
    public int f402096d;

    /* renamed from: e, reason: collision with root package name */
    public int f402097e;

    public o0() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        context.getResources();
        this.f402093a = i65.a.b(context, 400);
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public final void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PanelSizeResolver", "setParentWidth: " + i17);
        if (i17 <= 0) {
            return;
        }
        this.f402093a = i17;
        e();
    }

    public void e() {
        float f17 = 2;
        float a17 = this.f402093a - (a() * f17);
        if (a17 < b() * f17) {
            this.f402094b = 1;
            return;
        }
        int b17 = ((int) ((a17 - b()) / (b() + c()))) + 1;
        float f18 = b17;
        this.f402095c = (int) ((a17 - (b() * f18)) / (b17 - 1));
        float b18 = this.f402093a - (b() * f18);
        int i17 = this.f402095c;
        this.f402096d = (int) ((b18 - (i17 * b17)) / f17);
        this.f402097e = i17 / 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PanelSizeResolver", "updateSize: " + b() + ", " + a() + ", " + c() + ", " + this.f402094b + ", " + this.f402095c + ", " + this.f402096d + ", " + this.f402097e);
        this.f402094b = b17;
    }
}
