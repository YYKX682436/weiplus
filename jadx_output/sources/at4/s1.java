package at4;

/* loaded from: classes8.dex */
public class s1 extends dm.hc {

    /* renamed from: y, reason: collision with root package name */
    public static final l75.e0 f13952y = dm.hc.initAutoDBInfo(at4.s1.class);

    /* renamed from: q, reason: collision with root package name */
    public r45.p67 f13954q;

    /* renamed from: r, reason: collision with root package name */
    public r45.z67 f13955r;

    /* renamed from: p, reason: collision with root package name */
    public r45.k65 f13953p = new r45.k65();

    /* renamed from: s, reason: collision with root package name */
    public boolean f13956s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f13957t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f13958u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f13959v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f13960w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f13961x = "";

    public s1() {
        this.f13954q = null;
        this.f13955r = null;
        this.f13954q = new r45.p67();
        if (this.f13955r == null) {
            this.f13955r = new r45.z67();
        }
    }

    @Override // dm.hc, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
        r45.k65 k65Var = new r45.k65();
        this.f13953p = k65Var;
        try {
            r45.k65 k65Var2 = (r45.k65) k65Var.parseFrom(this.field_wallet_grey_item_buf);
            this.f13953p = k65Var2;
            this.f13954q = k65Var2.f378442h;
            this.f13955r = k65Var2.f378443i;
            this.f13956s = k65Var2.f378445n;
            this.f13961x = "";
            java.util.Iterator it = k65Var2.f378447p.iterator();
            while (it.hasNext()) {
                this.f13961x += ((java.lang.String) it.next()) + "\n";
            }
            r45.b77 b77Var = this.f13953p.f378440f;
            if (b77Var != null) {
                this.f13957t = x51.j1.b(b77Var.f370620d);
                this.f13958u = x51.j1.b(this.f13953p.f378440f.f370621e);
            }
            r45.w67 w67Var = this.f13953p.f378441g;
            if (w67Var != null) {
                this.f13959v = x51.j1.b(w67Var.f388916d);
                this.f13960w = x51.j1.b(this.f13953p.f378441g.f388917e);
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("WalletRegionGreyItem", "parser PayIBGGetOverseaWalletRsp error");
        }
        if (this.f13954q == null) {
            this.f13954q = new r45.p67();
        }
        if (this.f13955r == null) {
            this.f13955r = new r45.z67();
        }
    }

    @Override // dm.hc, l75.f0
    public l75.e0 getDBInfo() {
        return f13952y;
    }
}
