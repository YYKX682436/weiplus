package fg1;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg1.b0 f343386d;

    public c0(fg1.b0 b0Var) {
        this.f343386d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = this.f343386d.f343376b;
        if (bVar == null || (m17 = bVar.m()) == null) {
            return;
        }
        android.app.Activity Z0 = m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) m17).Z0() : ((m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) && (m17.mo50352x76847179() instanceof android.app.Activity)) ? (android.app.Activity) m17.mo50352x76847179() : null;
        if (Z0 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "startKeepScreenOn");
            try {
                Z0.getWindow().addFlags(128);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "startKeepScreenOn exception", e17);
            }
        }
    }
}
