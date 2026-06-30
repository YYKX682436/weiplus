package o51;

/* loaded from: classes15.dex */
public class d implements p51.b {

    /* renamed from: a, reason: collision with root package name */
    public int f424620a;

    /* renamed from: b, reason: collision with root package name */
    public int f424621b;

    /* renamed from: c, reason: collision with root package name */
    public p51.a f424622c;

    public d(int i17, int i18, p51.a aVar) {
        this.f424622c = aVar;
        if (aVar == null) {
            this.f424622c = new o51.c(this);
        }
        this.f424620a = i17;
        this.f424621b = i18;
    }

    @Override // p51.b
    public java.lang.String a(int i17) {
        java.lang.Integer mo145523xfb80e389 = mo145523xfb80e389(i17);
        return this.f424622c.a(mo145523xfb80e389 == null ? "" : mo145523xfb80e389.toString());
    }

    @Override // p51.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer mo145523xfb80e389(int i17) {
        if (i17 < 0 || i17 >= mo145524x99620925()) {
            return null;
        }
        return java.lang.Integer.valueOf(this.f424620a + i17);
    }

    public int c() {
        return this.f424621b;
    }

    public int d() {
        return this.f424620a;
    }

    @Override // p51.b
    /* renamed from: getItemsCount */
    public int mo145524x99620925() {
        return (this.f424621b - this.f424620a) + 1;
    }

    public d(int i17, int i18) {
        this.f424622c = new o51.c(this);
        this.f424620a = i17;
        this.f424621b = i18;
    }
}
