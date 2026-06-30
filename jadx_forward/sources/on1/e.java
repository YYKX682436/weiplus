package on1;

/* loaded from: classes12.dex */
public abstract class e {
    public static void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPackUtil", "cleanWxamDir");
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6[] G = lp0.b.h0("MicroMsg.BackupMoveServer").G();
        if (G != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var : G) {
                r6Var.l();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPackUtil", "cleanWxamDir done");
    }

    public static int b(on1.d dVar) {
        r45.ed edVar;
        java.lang.String str;
        if (dVar == null || (edVar = dVar.f428344b) == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = dVar == null ? "backupItemInfo" : "backupItemInfo.backupitem";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPackUtil", "packBackupItem %s is null!", objArr);
            return 0;
        }
        java.lang.String str2 = dVar.f428343a;
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str2);
        if (k17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPackUtil", "packBackupItem filePath error:" + str2);
            return 0;
        }
        if (dVar.f428347e) {
            return k17;
        }
        java.util.LinkedList linkedList = dVar.f428345c;
        if (linkedList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPackUtil", "packBackupItem error mediaInfoList null");
            return 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(edVar.f454814f.f454289d);
        sb6.append("_");
        sb6.append(edVar.f454815g.f454289d);
        sb6.append("_");
        sb6.append(edVar.f454827v);
        sb6.append("_backup");
        java.lang.String str3 = dVar.f428348f;
        if (str3 == null) {
            str = "";
        } else {
            str = "_" + str3;
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.util.LinkedList linkedList2 = edVar.f454822q;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = sb7;
        du5Var.f454290e = true;
        linkedList2.add(du5Var);
        java.util.LinkedList linkedList3 = edVar.f454823r;
        r45.eu5 eu5Var = new r45.eu5();
        int i17 = dVar.f428346d;
        eu5Var.f455266d = i17;
        eu5Var.f455267e = true;
        linkedList3.add(eu5Var);
        edVar.f454821p = edVar.f454822q.size();
        if (dVar.f428350h == null) {
            dVar.f428350h = new wn1.s();
        }
        wn1.s sVar = dVar.f428350h;
        sVar.f529008m = edVar.f454827v;
        sVar.f529004f = sb7;
        sVar.f529005g = str2;
        sVar.f529006h = i17;
        if (!dVar.f428349g) {
            linkedList.add(sVar);
        }
        return 0;
    }
}
