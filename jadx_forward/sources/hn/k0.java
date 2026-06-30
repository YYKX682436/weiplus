package hn;

@j95.b
/* loaded from: classes11.dex */
public class k0 extends i95.w implements vg3.i4 {
    public void Ai() {
        java.util.ArrayList<rn.h> arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.RoomToolsHelp", "resetAllGroupToolsRecentUse");
        android.database.Cursor E = ((nn.j) i95.n0.c(nn.j.class)).Di().f479141d.E("GroupTools", rn.h.f479136v.f398487c, null, null, null, null, null);
        if (E == null) {
            arrayList = null;
        } else {
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (E.moveToNext()) {
                    rn.h hVar = new rn.h();
                    hVar.mo9015xbf5d97fd(E);
                    arrayList2.add(hVar);
                }
                E.close();
                arrayList = arrayList2;
            } catch (java.lang.Throwable th6) {
                E.close();
                throw th6;
            }
        }
        if (arrayList != null) {
            for (rn.h hVar2 : arrayList) {
                hVar2.f66386xae782d0e = 0;
                ((nn.j) i95.n0.c(nn.j.class)).Di().mo9952xce0038c9(hVar2, new java.lang.String[0]);
            }
        }
    }

    public void wi(java.lang.String str) {
        rn.h c17;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str) || (c17 = kn.l0.c(str)) == null || c17.f66386xae782d0e == 0) {
            return;
        }
        c17.t0(new com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a("roomaa@app.origin", "", c01.id.a()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.RoomTodoService", "handleGroupToolByLaunchAA room:%s result:%s", str, java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Di().mo9952xce0038c9(c17, new java.lang.String[0])));
    }
}
