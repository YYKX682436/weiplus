package hw0;

/* loaded from: classes5.dex */
public final class j implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.g f366997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw0.n f366998e;

    public j(hw0.g gVar, hw0.n nVar) {
        this.f366997d = gVar;
        this.f366998e = nVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        kw0.e eVar = (kw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f366997d.m134217x68b9052(eVar);
        hw0.n nVar = this.f366998e;
        nVar.getClass();
        kw0.k kVar = eVar.f394336c;
        java.util.Objects.toString(kVar);
        if (kVar instanceof kw0.g) {
            kw0.a b17 = fv0.e.b(eVar);
            zu0.i iVar = b17 != null ? b17.f394322b : null;
            java.util.Objects.toString(iVar);
            if (iVar == zu0.i.f557208e) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = nVar.f367003o;
                if (!(u3Var2 != null && u3Var2.isShowing())) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = nVar.f367003o;
                    if (u3Var3 != null) {
                        u3Var3.show();
                    }
                }
            }
            if (iVar == zu0.i.f557209f) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var4 = nVar.f367003o;
                if ((u3Var4 != null && u3Var4.isShowing()) && (u3Var = nVar.f367003o) != null) {
                    u3Var.dismiss();
                }
            }
        }
        if ((kVar instanceof kw0.j) || (kVar instanceof kw0.h)) {
            kw0.a b18 = fv0.e.b(eVar);
            if (zu0.i.f557209f == (b18 != null ? b18.f394322b : null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ComposingStickerPanelUI", "addWhenWhereSticker2Timeline: stickerData " + b18);
                du0.v0 R6 = nVar.R6();
                java.lang.String str = b18.f394321a.f129757b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
                R6.getClass();
                yy0.m7 m7Var = (yy0.m7) R6.O6();
                m7Var.getClass();
                p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.i4(m7Var, str, null), 3, null);
                nVar.o7(b18);
            }
        }
    }
}
