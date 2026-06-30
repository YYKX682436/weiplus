package i22;

/* loaded from: classes15.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public int f369592a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().widthPixels;

    /* renamed from: b, reason: collision with root package name */
    public int f369593b;

    /* renamed from: c, reason: collision with root package name */
    public int f369594c;

    /* renamed from: d, reason: collision with root package name */
    public int f369595d;

    /* renamed from: e, reason: collision with root package name */
    public int f369596e;

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public void d() {
        float f17 = 2;
        float a17 = this.f369592a - (a() * f17);
        if (a17 < b() * f17) {
            this.f369593b = 1;
            return;
        }
        int c17 = (int) ((c() + a17) / (b() + c()));
        float f18 = c17;
        this.f369594c = (int) ((a17 - (b() * f18)) / (c17 - 1));
        this.f369595d = (int) (((this.f369592a - (b() * f18)) - (this.f369594c * c17)) / f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3ItemSizeResolver", "updateSize: " + b() + ", " + a() + ", " + c() + ", " + this.f369593b + ", " + this.f369594c + ", " + this.f369595d);
        this.f369593b = c17;
    }
}
