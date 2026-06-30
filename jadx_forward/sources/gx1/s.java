package gx1;

/* loaded from: classes12.dex */
public class s extends gx1.a {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a f358859e;

    public s(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.m8b);
        this.f358859e = c13158x154ec45a;
        c13158x154ec45a.E = this;
        c13158x154ec45a.m54596xf2d19fb3(0);
        this.f358824d.f(c13158x154ec45a);
        c13158x154ec45a.getViewTreeObserver().addOnGlobalLayoutListener(new gx1.p(this));
    }

    @Override // gx1.a
    public int i() {
        return 1;
    }

    @Override // gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(m8186xceeefb69());
        nx1.z zVar = this.f358824d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.EditorTextItemHolder", "TextItemHolder position is %d, editable:%b", valueOf, java.lang.Boolean.valueOf(zVar.f422867d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = this.f358859e;
        c13158x154ec45a.m54598xaf1e83df(i17);
        ix1.l lVar = (ix1.l) aVar;
        lVar.f376849f = c13158x154ec45a;
        lVar.f376847d = null;
        lVar.f376848e = null;
        ix1.a l17 = nx1.d.q().l(i17 - 1);
        if (l17 != null && l17.b() == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) c13158x154ec45a.getLayoutParams();
            layoutParams.topMargin = 0;
            c13158x154ec45a.setLayoutParams(layoutParams);
        }
        ix1.a l18 = nx1.d.q().l(i17 + 1);
        if (l18 != null && l18.b() == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) c13158x154ec45a.getLayoutParams();
            layoutParams2.bottomMargin = 0;
            c13158x154ec45a.setLayoutParams(layoutParams2);
        }
        if (zVar.f422867d) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gx1.r(this, lVar));
        } else {
            c13158x154ec45a.m54599xe08d546d(lVar.f376871s);
            zVar.f422865b.f3(c13158x154ec45a);
        }
    }
}
