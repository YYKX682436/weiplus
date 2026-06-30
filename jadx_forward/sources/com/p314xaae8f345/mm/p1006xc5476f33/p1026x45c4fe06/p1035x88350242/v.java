package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class v implements fb1.g {

    /* renamed from: d, reason: collision with root package name */
    public final fb1.d[] f158275d;

    /* renamed from: e, reason: collision with root package name */
    public final fb1.d[] f158276e;

    public v(fb1.d[] scenesCheckBefore, fb1.d[] scenesCheckUsing) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scenesCheckBefore, "scenesCheckBefore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scenesCheckUsing, "scenesCheckUsing");
        this.f158275d = scenesCheckBefore;
        this.f158276e = scenesCheckUsing;
    }

    @Override // fb1.g
    public void F3(fb1.d scene, boolean z17, java.lang.String token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
    }

    @Override // fb1.g
    public boolean R() {
        return true;
    }

    @Override // fb1.g
    public fb1.c ec(fb1.d scene, boolean z17, fb1.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        fb1.d[] dVarArr = this.f158275d;
        int i17 = 0;
        for (fb1.d dVar : dVarArr) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o.f158248a.a(dVar).a()) {
                fb1.a aVar = new fb1.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.s.a(dVar));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageMainService", "canIUse, scene: " + scene + ", status: " + aVar);
                if (z17 && hVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.u(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.r(hVar));
                    int length = dVarArr.length;
                    while (i17 < length) {
                        fb1.d dVar2 = dVarArr[i17];
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o.f158248a.a(dVar2);
                        if (a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.i) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageMainService", "canIUse false, observe " + dVar2);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.i observable = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.i) a17;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observable, "observable");
                            uVar.f158273e.add(observable);
                            nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.t(observable, uVar));
                        }
                        i17++;
                    }
                }
                return aVar;
            }
        }
        fb1.b bVar = fb1.b.f342361a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageMainService", "canIUse, scene: " + scene + ", status: " + bVar);
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.u uVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.u(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.r(hVar));
            fb1.d[] dVarArr2 = this.f158276e;
            int length2 = dVarArr2.length;
            while (i17 < length2) {
                fb1.d dVar3 = dVarArr2[i17];
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.j a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o.f158248a.a(dVar3);
                if (a18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageMainService", "canIUse, observe " + dVar3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.i observable2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.i) a18;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observable2, "observable");
                    uVar2.f158273e.add(observable2);
                    nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.t(observable2, uVar2));
                }
                i17++;
            }
        }
        return bVar;
    }
}
