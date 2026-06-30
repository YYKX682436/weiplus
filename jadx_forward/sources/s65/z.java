package s65;

/* loaded from: classes11.dex */
public class z extends com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l {

    /* renamed from: g, reason: collision with root package name */
    public int f485093g;

    /* renamed from: h, reason: collision with root package name */
    public int f485094h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String[] f485095i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f485096j;

    /* renamed from: k, reason: collision with root package name */
    public final int f485097k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f485098l;

    /* renamed from: m, reason: collision with root package name */
    public q65.b f485099m;

    /* renamed from: n, reason: collision with root package name */
    public s65.y f485100n;

    /* renamed from: o, reason: collision with root package name */
    public final q65.b f485101o;

    public z(int i17, java.lang.String str, int i18, int i19, byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.String[] strArr, boolean z17) {
        super(i17, str, i18, z17);
        this.f485093g = 0;
        this.f485094h = 0;
        this.f485100n = null;
        this.f485101o = new s65.x(this);
        this.f485095i = strArr;
        if (strArr == null || strArr.length == 0) {
            this.f485095i = new java.lang.String[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyk)};
        }
        this.f485097k = i19;
        this.f485096j = bArr;
        this.f485098l = bArr2;
    }

    @Override // q65.c
    public void a(q65.b bVar) {
        this.f485099m = bVar;
        int i17 = this.f485093g + 1;
        this.f485093g = i17;
        if (i17 > 1000) {
            bVar.d(-1, -1, null);
            return;
        }
        if (!fp.i.c(this.f273831b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUpdatePack", "SDCard full, packSize=[%s]", java.lang.Integer.valueOf(this.f273831b));
            bVar.d(-1, -1, null);
            return;
        }
        r45.xp3 xp3Var = new r45.xp3();
        r45.he heVar = new r45.he();
        heVar.f457613g = o45.wf.f424562g;
        heVar.f457615i = 0;
        heVar.f457611e = this.f485097k;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(wo.w0.k().getBytes());
        heVar.f457612f = b17;
        if (b17.f273689a.length >= 16) {
            b17.f(16);
            heVar.f457612f = b17;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b18 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(wo.q.f529313a.getBytes());
        heVar.f457614h = b18;
        if (b18.f273689a.length >= 132) {
            b18.f(132);
            heVar.f457614h = b18;
        }
        try {
            heVar.f457610d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.a(new java.lang.String("\u0000"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUpdatePack", e17.getLocalizedMessage());
        }
        xp3Var.mo11509x3ab820bc(heVar);
        xp3Var.f471841d = this.f273830a;
        xp3Var.f471843f = this.f273832c;
        xp3Var.f471842e = this.f273831b;
        s65.y yVar = new s65.y(this, this.f485095i[this.f485094h / 5], this.f485101o);
        this.f485100n = yVar;
        yVar.execute(xp3Var);
    }

    @Override // q65.c
    /* renamed from: cancel */
    public void mo159547xae7a2e7a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUpdatePack", "do cancel, updateType = " + this.f273830a);
        s65.y yVar = this.f485100n;
        if (yVar == null || yVar.isCancelled()) {
            return;
        }
        this.f485100n.cancel(true);
    }
}
