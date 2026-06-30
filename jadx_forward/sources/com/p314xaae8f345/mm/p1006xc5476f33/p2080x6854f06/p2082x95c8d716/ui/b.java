package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6009xfdc53276 f243596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e f243597e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e eVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6009xfdc53276 c6009xfdc53276) {
        this.f243597e = eVar;
        this.f243596d = c6009xfdc53276;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardDialog", "doNetSceneAccept callback");
        am.fu fuVar = this.f243596d.f136304h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e eVar = this.f243597e;
        eVar.D = fuVar;
        if (fuVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardDialog", "doNetSceneAccept callback, mCardAcceptResult == null");
            return;
        }
        eVar.f243612o.setVisibility(8);
        am.fu fuVar2 = eVar.D;
        if (fuVar2 != null) {
            eVar.E = fuVar2.f88240a;
        }
        if (fuVar2 == null || !fuVar2.f88241b) {
            eVar.G = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTED_FAIL;
            eVar.h();
            eVar.f();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTED_SUCCES;
        eVar.G = cVar;
        eVar.h();
        eVar.e();
        if (eVar.G == cVar) {
            eVar.f243622y.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j1q);
            if (eVar.B == 1) {
                eVar.f243621x.setImageResource(com.p314xaae8f345.mm.R.raw.f81031x91c273ce);
            } else {
                eVar.f243621x.setImageResource(com.p314xaae8f345.mm.R.raw.f81032x2bd78cdc);
            }
        }
        eVar.f243623z = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.d dVar = eVar.H;
        if (dVar != null) {
            dVar.a();
        }
    }
}
