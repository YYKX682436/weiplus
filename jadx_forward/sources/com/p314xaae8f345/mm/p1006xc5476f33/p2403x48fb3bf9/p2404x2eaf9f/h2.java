package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class h2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f263375e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f263376f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f263377g;

    public h2(java.lang.ref.WeakReference controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f263375e = controller;
        this.f263376f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.g2(this));
        this.f263377g = "MicroMsg.WebViewController.SceneEndCallbacker:" + e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean Cg(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.h hVar) {
        java.lang.String str = "onSceneEnd, instance hashcode = " + hashCode();
        java.lang.String str2 = this.f263377g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (hVar == null) {
            return true;
        }
        int i17 = hVar.mo74362xfb7e5820().getInt("scene_end_listener_hash_code");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "get hash code = %d, self hash code = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "edw onSceneEnd, type = " + hVar.mo74365xfb85f7b0() + ", errCode = " + hVar.mo74363xe591acbc() + ", errType = " + hVar.Pg());
        if (i17 != e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "hash code not equal");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) this.f263375e.get();
        if (e3Var == null) {
            return true;
        }
        int mo74365xfb85f7b0 = hVar.mo74365xfb85f7b0();
        if (mo74365xfb85f7b0 == 106) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3.e1(e3Var, 106);
            e3Var.E0();
            return true;
        }
        if (mo74365xfb85f7b0 != 666) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3.e1(e3Var, ma1.i.f72803x366c91de);
        e3Var.E0();
        return true;
    }

    public final int e() {
        return ((java.lang.Number) this.f263376f.mo141623x754a37bb()).intValue();
    }
}
