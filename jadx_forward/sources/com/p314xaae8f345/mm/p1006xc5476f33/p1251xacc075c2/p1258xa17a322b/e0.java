package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes.dex */
public final class e0 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f174117a;

    public e0(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f174117a = qVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a1
    public final void a(int i17, java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[getAllBackupPackage] GetAllBackupPackages complete, error=" + i17 + ", pkgs.size=" + arrayList.size());
        p3325xe03a0797.p3326xc267989b.q qVar = this.f174117a;
        if (i17 == 0) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.x1(i17, "Fail to get all backup package"))));
        }
    }
}
