package tn4;

/* loaded from: classes11.dex */
public class h implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb f502363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f502364b;

    public h(tn4.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb, boolean z17) {
        this.f502363a = c16114x800e8cdb;
        this.f502364b = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "onDialogClick HdiffApk %s", java.lang.Boolean.valueOf(z17));
        boolean z18 = this.f502364b;
        if (!z17) {
            w73.f.k(z18 ? 109 : com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54463x110bac93);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, z18 ? 109L : 309L, 1L, false);
        } else {
            wn4.x.f529104a.g(this.f502363a);
            w73.f.k(z18 ? 110 : 310);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, z18 ? 110L : 310L, 1L, false);
        }
    }
}
