package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class eu implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu f215835d;

    public eu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu nuVar) {
        this.f215835d = nuVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void G3(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu nuVar = this.f215835d;
        android.util.SparseArray sparseArray = nuVar.f216886d;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i28 = 0; i28 < size; i28++) {
                int keyAt = sparseArray.keyAt(i28);
                so2.o4 o4Var = (so2.o4) sparseArray.valueAt(i28);
                if (i19 == keyAt) {
                    so2.a2 a2Var = o4Var.f492057a;
                    r45.qt2 qt2Var = null;
                    so2.s4 s4Var = a2Var != null ? a2Var.f491784h : null;
                    if (s4Var != null) {
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = nuVar.m158354x19263085();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                        if (nyVar != null) {
                            qt2Var = nyVar.W6(keyAt);
                            qt2Var.set(14, java.lang.Integer.valueOf(keyAt));
                        }
                        s4Var.f492128d = qt2Var;
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void l(int i17, int i18, int i19, int i27) {
        so2.s4 s4Var;
        r45.gp2 gp2Var;
        r45.gz2 gz2Var;
        r45.vs2 vs2Var;
        so2.s4 s4Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu nuVar = this.f215835d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = nuVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopupUIC", "onFragmentChange from=" + i17 + " to=" + i18 + ",fromType=" + i19 + " toType=" + i27 + ",curTabType=" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).S6());
        android.util.SparseArray sparseArray = nuVar.f216886d;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i28 = 0; i28 < size; i28++) {
                sparseArray.keyAt(i28);
                so2.a2 a2Var = ((so2.o4) sparseArray.valueAt(i28)).f492057a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = null;
                if (((a2Var == null || (s4Var2 = a2Var.f491784h) == null) ? null : s4Var2.f492125a) == so2.r4.f492107d) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ag agVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ag.f213173h;
                    if (a2Var != null && (s4Var = a2Var.f491784h) != null && (gp2Var = s4Var.f492126b) != null && (gz2Var = (r45.gz2) gp2Var.m75936x14adae67(0)) != null && (vs2Var = (r45.vs2) gz2Var.m75936x14adae67(0)) != null) {
                        jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
                        jbVar.t0(vs2Var);
                    }
                    nuVar.U6(agVar, jbVar);
                    return;
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    /* renamed from: onPageScrolled */
    public void mo55649xf210c75a(int i17, float f17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void z(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
