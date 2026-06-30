package e23;

/* loaded from: classes12.dex */
public class g0 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f328386q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f328387r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View.OnClickListener f328388s;

    /* renamed from: t, reason: collision with root package name */
    public final e23.f0 f328389t;

    /* renamed from: u, reason: collision with root package name */
    public final e23.e0 f328390u;

    public g0(int i17) {
        super(0, i17);
        this.f328389t = new e23.f0(this);
        this.f328390u = new e23.e0(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.f(this.f505297g);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (f17 == null) {
            f17 = "";
        }
        this.f328386q = f17;
        if (this.f505296f == 2) {
            int i17 = this.f505297g != -4 ? 0 : com.p314xaae8f345.mm.R.C30867xcad56011.f572004w0;
            java.lang.String string = i17 == 0 ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(i17);
            this.f328387r = string != null ? string : "";
            this.f328388s = this.f505297g == -4 ? new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o3(i()) : null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSHeaderDataItem", "fillingDataItem: header=%s", this.f328386q);
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328389t;
    }

    public u13.e o() {
        return this.f328390u;
    }
}
