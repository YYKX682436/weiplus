package com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a;

/* loaded from: classes11.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5827xd72bd98b f273786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.C20961xa8f40fca f273787e;

    public d(com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.C20961xa8f40fca c20961xa8f40fca, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5827xd72bd98b c5827xd72bd98b) {
        this.f273787e = c20961xa8f40fca;
        this.f273786d = c5827xd72bd98b;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.C20961xa8f40fca c20961xa8f40fca = this.f273787e;
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.f fVar = c20961xa8f40fca.f273777d;
        if (fVar.f273795g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomCallbackFactory", "oplogServiceEvent callback already processed, skip");
            return;
        }
        fVar.f273795g = true;
        am.vn vnVar = this.f273786d.f136135g;
        java.lang.String str = vnVar.f89738b;
        java.lang.String str2 = vnVar.f89739c;
        int i17 = vnVar.f89737a;
        o65.b bVar = fVar.f273781d;
        if (bVar != null) {
            if (bVar instanceof o65.f) {
                o65.f fVar2 = (o65.f) bVar;
                fVar2.f424757b = str;
                fVar2.f424756a = i17;
                fVar2.f424758c = str2;
                bVar.a(0, i17, "", bVar);
            } else {
                bVar.a(0, i17, "", bVar);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = c20961xa8f40fca.f273777d.f273782e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
