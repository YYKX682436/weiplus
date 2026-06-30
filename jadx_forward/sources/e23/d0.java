package e23;

/* loaded from: classes12.dex */
public class d0 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f328342q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.CharSequence f328343r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f328344s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f328345t;

    /* renamed from: u, reason: collision with root package name */
    public int f328346u;

    /* renamed from: v, reason: collision with root package name */
    public p13.f f328347v;

    /* renamed from: w, reason: collision with root package name */
    public final e23.c0 f328348w;

    /* renamed from: x, reason: collision with root package name */
    public final e23.b0 f328349x;

    public d0(int i17) {
        super(3, i17);
        this.f328346u = -1;
        this.f328348w = new e23.c0(this);
        this.f328349x = new e23.b0(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        boolean z17;
        p13.f fVar = (p13.f) this.f328342q.f432730o;
        this.f328347v = fVar;
        if (fVar == null) {
            return;
        }
        this.f328343r = fVar.f68150x29dd02d3;
        this.f328345t = fVar.f68147xf1c539e3;
        if (fVar.f68145x818dc9ac == 88 && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi()) {
            this.f328346u = com.p314xaae8f345.mm.R.raw.f80846xcea509e5;
        }
        p13.f fVar2 = this.f328347v;
        java.lang.String str = fVar2.f68144xe43f00e5;
        int i17 = fVar2.f68143x2788aaf5;
        int i18 = this.f328342q.f432718c;
        boolean z18 = false;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 != 3) {
                    if (i18 == 4) {
                        java.lang.String str2 = fVar2.f68148x4b6e82d5;
                        this.f328344s = str2;
                        this.f328344s = o13.q.e(p13.i.b(str2, this.f505295e)).f432638a;
                    }
                    if (this.f505297g == -8 || this.f328342q.f432718c == 4) {
                    }
                    this.f328344s = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffu);
                    return;
                }
                z18 = true;
            }
            z17 = z18;
            z18 = true;
        } else {
            z17 = false;
        }
        this.f328343r = o13.q.e(p13.i.d(this.f328343r, this.f505295e, z18, z17)).f432638a;
        if (this.f505297g == -8) {
        }
    }

    @Override // u13.g
    public java.lang.String f() {
        return this.f328347v.f68150x29dd02d3;
    }

    @Override // u13.g
    public int j() {
        return this.f328342q.f432733r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328348w;
    }
}
