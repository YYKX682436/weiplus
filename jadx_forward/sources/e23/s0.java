package e23;

/* loaded from: classes12.dex */
public class s0 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f328489q;

    /* renamed from: r, reason: collision with root package name */
    public final e23.r0 f328490r;

    public s0(int i17) {
        super(8, i17);
        this.f328490r = new e23.r0(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.f(this.f505297g);
        if (f17 == null) {
            this.f328489q = "";
        } else {
            this.f328489q = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icl, f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMoreDataItem", "fillDataItem: tip=%s", this.f328489q);
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328490r;
    }
}
