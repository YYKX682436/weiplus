package q32;

/* loaded from: classes12.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public q32.f f441462d;

    public c() {
        gm0.j1.n().f354821b.a(1042, this);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v1.f33869x366c91de, this);
        gm0.j1.n().f354821b.a(1043, this);
        gm0.j1.n().f354821b.a(1040, this);
    }

    public java.util.ArrayList a(java.lang.String str) {
        java.util.ArrayList arrayList = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankInfoManager", "hy: param error");
            return null;
        }
        s32.d fj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.fj();
        fj6.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceRankInfoStg", "hy: param error");
        } else {
            java.lang.String format = java.lang.String.format("select *, rowid from %s where %s = ? order by %s desc", "HardDeviceRankInfo", "rankID", ya.b.f77498x4b14672);
            java.lang.String[] strArr = new java.lang.String[1];
            if (str == null) {
                str = "";
            }
            strArr[0] = str;
            android.database.Cursor f17 = fj6.f483997d.f(format, strArr, 2);
            if (f17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
            } else {
                if (f17.moveToFirst()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    do {
                        r32.d dVar = new r32.d();
                        dVar.mo9015xbf5d97fd(f17);
                        arrayList2.add(dVar);
                    } while (f17.moveToNext());
                    arrayList = arrayList2;
                }
                f17.close();
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof p32.l) {
            if (i17 == 0 && i18 == 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error.");
            return;
        }
        if (m1Var instanceof p32.o) {
            if (i17 == 0 && i18 == 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
            return;
        }
        if (m1Var instanceof p32.p) {
            if (i17 == 0 && i18 == 0) {
                return;
            }
            jx3.f.INSTANCE.mo68477x336bdfd8(323L, 0L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
        }
    }
}
