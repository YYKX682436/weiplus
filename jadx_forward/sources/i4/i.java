package i4;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f369879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f369880b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369881c;

    /* renamed from: d, reason: collision with root package name */
    public final int f369882d;

    /* renamed from: e, reason: collision with root package name */
    public final int f369883e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f369884f;

    /* renamed from: g, reason: collision with root package name */
    public int f369885g;

    /* renamed from: h, reason: collision with root package name */
    public int f369886h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f369887i;

    public i(int i17, int i18) {
        this.f369879a = android.graphics.Color.red(i17);
        this.f369880b = android.graphics.Color.green(i17);
        this.f369881c = android.graphics.Color.blue(i17);
        this.f369882d = i17;
        this.f369883e = i18;
    }

    public final void a() {
        if (this.f369884f) {
            return;
        }
        int i17 = this.f369882d;
        int f17 = e3.b.f(-1, i17, 4.5f);
        int f18 = e3.b.f(-1, i17, 3.0f);
        if (f17 != -1 && f18 != -1) {
            this.f369886h = e3.b.i(-1, f17);
            this.f369885g = e3.b.i(-1, f18);
            this.f369884f = true;
            return;
        }
        int f19 = e3.b.f(-16777216, i17, 4.5f);
        int f27 = e3.b.f(-16777216, i17, 3.0f);
        if (f19 == -1 || f27 == -1) {
            this.f369886h = f17 != -1 ? e3.b.i(-1, f17) : e3.b.i(-16777216, f19);
            this.f369885g = f18 != -1 ? e3.b.i(-1, f18) : e3.b.i(-16777216, f27);
            this.f369884f = true;
        } else {
            this.f369886h = e3.b.i(-16777216, f19);
            this.f369885g = e3.b.i(-16777216, f27);
            this.f369884f = true;
        }
    }

    public float[] b() {
        if (this.f369887i == null) {
            this.f369887i = new float[3];
        }
        e3.b.a(this.f369879a, this.f369880b, this.f369881c, this.f369887i);
        return this.f369887i;
    }

    /* renamed from: equals */
    public boolean m134697xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i4.i.class != obj.getClass()) {
            return false;
        }
        i4.i iVar = (i4.i) obj;
        return this.f369883e == iVar.f369883e && this.f369882d == iVar.f369882d;
    }

    /* renamed from: hashCode */
    public int m134698x8cdac1b() {
        return (this.f369882d * 31) + this.f369883e;
    }

    /* renamed from: toString */
    public java.lang.String m134699x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(i4.i.class.getSimpleName());
        sb6.append(" [RGB: #");
        sb6.append(java.lang.Integer.toHexString(this.f369882d));
        sb6.append("] [HSL: ");
        sb6.append(java.util.Arrays.toString(b()));
        sb6.append("] [Population: ");
        sb6.append(this.f369883e);
        sb6.append("] [Title Text: #");
        a();
        sb6.append(java.lang.Integer.toHexString(this.f369885g));
        sb6.append("] [Body Text: #");
        a();
        sb6.append(java.lang.Integer.toHexString(this.f369886h));
        sb6.append(']');
        return sb6.toString();
    }
}
