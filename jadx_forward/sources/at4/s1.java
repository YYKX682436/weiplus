package at4;

/* loaded from: classes8.dex */
public class s1 extends dm.hc {

    /* renamed from: y, reason: collision with root package name */
    public static final l75.e0 f95485y = dm.hc.m125042x3593deb(at4.s1.class);

    /* renamed from: q, reason: collision with root package name */
    public r45.p67 f95487q;

    /* renamed from: r, reason: collision with root package name */
    public r45.z67 f95488r;

    /* renamed from: p, reason: collision with root package name */
    public r45.k65 f95486p = new r45.k65();

    /* renamed from: s, reason: collision with root package name */
    public boolean f95489s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f95490t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f95491u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f95492v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f95493w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f95494x = "";

    public s1() {
        this.f95487q = null;
        this.f95488r = null;
        this.f95487q = new r45.p67();
        if (this.f95488r == null) {
            this.f95488r = new r45.z67();
        }
    }

    @Override // dm.hc, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        super.mo9015xbf5d97fd(cursor);
        r45.k65 k65Var = new r45.k65();
        this.f95486p = k65Var;
        try {
            r45.k65 k65Var2 = (r45.k65) k65Var.mo11468x92b714fd(this.f66806xe193d106);
            this.f95486p = k65Var2;
            this.f95487q = k65Var2.f459975h;
            this.f95488r = k65Var2.f459976i;
            this.f95489s = k65Var2.f459978n;
            this.f95494x = "";
            java.util.Iterator it = k65Var2.f459980p.iterator();
            while (it.hasNext()) {
                this.f95494x += ((java.lang.String) it.next()) + "\n";
            }
            r45.b77 b77Var = this.f95486p.f459973f;
            if (b77Var != null) {
                this.f95490t = x51.j1.b(b77Var.f452153d);
                this.f95491u = x51.j1.b(this.f95486p.f459973f.f452154e);
            }
            r45.w67 w67Var = this.f95486p.f459974g;
            if (w67Var != null) {
                this.f95492v = x51.j1.b(w67Var.f470449d);
                this.f95493w = x51.j1.b(this.f95486p.f459974g.f470450e);
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WalletRegionGreyItem", "parser PayIBGGetOverseaWalletRsp error");
        }
        if (this.f95487q == null) {
            this.f95487q = new r45.p67();
        }
        if (this.f95488r == null) {
            this.f95488r = new r45.z67();
        }
    }

    @Override // dm.hc, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f95485y;
    }
}
