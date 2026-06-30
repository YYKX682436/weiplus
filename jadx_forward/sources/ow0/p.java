package ow0;

/* loaded from: classes5.dex */
public final class p implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.a0 f430876d;

    public p(ow0.a0 a0Var) {
        this.f430876d = a0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        kw0.e eVar = (kw0.e) obj;
        ow0.a0 a0Var = this.f430876d;
        a0Var.A.mo523x53d8522f(eVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        kw0.k kVar = eVar.f394336c;
        if (kVar instanceof kw0.g) {
            kw0.a b17 = fv0.e.b(eVar);
            zu0.i iVar = b17 != null ? b17.f394322b : null;
            if (iVar == zu0.i.f557208e) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = a0Var.f430813n;
                if (!(u3Var2 != null && u3Var2.isShowing())) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = a0Var.f430813n;
                    if (u3Var3 != null) {
                        u3Var3.show();
                    }
                }
            }
            if (iVar == zu0.i.f557209f) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var4 = a0Var.f430813n;
                if ((u3Var4 != null && u3Var4.isShowing()) && (u3Var = a0Var.f430813n) != null) {
                    u3Var.dismiss();
                }
            }
        }
        if (!(kVar instanceof kw0.j) && !(kVar instanceof kw0.h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ComposingTextPanelUIC", "addFancyTextSticker2Timeline: updateState " + kVar);
            return;
        }
        kw0.a b18 = fv0.e.b(eVar);
        if (zu0.i.f557209f == (b18 != null ? b18.f394322b : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ComposingTextPanelUIC", "addFancyTextSticker2Timeline: stickerData " + b18);
            a0Var.k7(b18);
            du0.v0 R6 = a0Var.R6();
            java.lang.String str = b18.f394321a.f129757b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.d4(m7Var, str, null), 3, null);
        }
    }
}
