package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class p7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t7 f154305d;

    public p7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t7 t7Var) {
        this.f154305d = t7Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        r45.h hVar;
        g4Var.add(0, 1, 1, com.p314xaae8f345.mm.R.C30867xcad56011.hh7);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t7 t7Var = this.f154305d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t7Var.f154350e.f154077J) && t7Var.f154350e.f154077J.equals(c01.z1.r())) {
            r45.d0 d0Var = t7Var.f154349d;
            if (d0Var.f453498q == 1 && d0Var.f453496o < d0Var.f453494m) {
                g4Var.d(2, t7Var.f154350e.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), t7Var.f154350e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571257x));
            }
        }
        int i17 = 4;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t7Var.f154350e.f154077J) && t7Var.f154350e.f154077J.equals(c01.z1.r())) {
            r45.d0 d0Var2 = t7Var.f154349d;
            if (d0Var2.f453498q == 1 && d0Var2.f453492h == 4) {
                g4Var.d(2, t7Var.f154350e.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), t7Var.f154350e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571257x));
            }
        }
        java.util.LinkedList linkedList = t7Var.f154349d.I;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        for (r45.h0 h0Var : t7Var.f154349d.I) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h0Var.f457231d) && (hVar = h0Var.f457232e) != null && hVar.f457227d != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "add option :%s", h0Var.f457231d);
                g4Var.f(i17, h0Var.f457231d);
            }
            i17++;
        }
    }
}
