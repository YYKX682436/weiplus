package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class o1 implements nx1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 f178151a;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1) {
        this.f178151a = abstractActivityC13156x6363e8e1;
    }

    public void a(java.lang.String str, ix1.i iVar) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        ix1.m mVar = (ix1.m) iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "compressNoteVideo onExportFinish");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str) || mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "file not exist or user canceled");
        } else {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            mVar.f376862r = str;
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            long j17 = 0;
            if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
                j17 = m17.f294766c;
            }
            mVar.f376859o = j17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = this.f178151a;
        abstractActivityC13156x6363e8e1.A.remove(mVar.f376844a);
        java.lang.Runnable runnable = abstractActivityC13156x6363e8e1.E;
        if (runnable != null) {
            runnable.run();
            abstractActivityC13156x6363e8e1.E = null;
        }
    }
}
