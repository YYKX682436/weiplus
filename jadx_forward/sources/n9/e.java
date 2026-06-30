package n9;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f417291a;

    /* renamed from: b, reason: collision with root package name */
    public int f417292b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f417293c;

    /* renamed from: d, reason: collision with root package name */
    public int f417294d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f417295e;

    /* renamed from: f, reason: collision with root package name */
    public int f417296f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f417297g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f417298h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f417299i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f417300j = -1;

    /* renamed from: k, reason: collision with root package name */
    public float f417301k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f417302l;

    /* renamed from: m, reason: collision with root package name */
    public android.text.Layout.Alignment f417303m;

    public n9.e a(n9.e eVar) {
        if (eVar != null) {
            if (!this.f417293c && eVar.f417293c) {
                this.f417292b = eVar.f417292b;
                this.f417293c = true;
            }
            if (this.f417298h == -1) {
                this.f417298h = eVar.f417298h;
            }
            if (this.f417299i == -1) {
                this.f417299i = eVar.f417299i;
            }
            if (this.f417291a == null) {
                this.f417291a = eVar.f417291a;
            }
            if (this.f417296f == -1) {
                this.f417296f = eVar.f417296f;
            }
            if (this.f417297g == -1) {
                this.f417297g = eVar.f417297g;
            }
            if (this.f417303m == null) {
                this.f417303m = eVar.f417303m;
            }
            if (this.f417300j == -1) {
                this.f417300j = eVar.f417300j;
                this.f417301k = eVar.f417301k;
            }
            if (!this.f417295e && eVar.f417295e) {
                this.f417294d = eVar.f417294d;
                this.f417295e = true;
            }
        }
        return this;
    }
}
