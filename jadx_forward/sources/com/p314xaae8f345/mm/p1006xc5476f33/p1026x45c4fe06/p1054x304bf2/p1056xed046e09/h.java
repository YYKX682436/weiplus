package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09;

/* loaded from: classes7.dex */
public class h implements uh1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i f159743c;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i iVar, java.lang.String str, java.lang.String str2) {
        this.f159743c = iVar;
        this.f159741a = str;
        this.f159742b = str2;
    }

    @Override // uh1.d
    public void a(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f159743c.f159752i.addAndGet(jSONObject.getInt("Content-Length"));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGamePreloadManager", e17, "content-length get error", new java.lang.Object[0]);
            }
        }
    }

    @Override // uh1.d
    public void b(int i17, long j17, long j18) {
    }

    @Override // uh1.d
    public void c(int i17, java.lang.String str, java.lang.String str2, int i18, long j17, java.util.Map map) {
        java.lang.String str3 = this.f159741a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i iVar = this.f159743c;
        if (iVar.f159747d == null || i18 != 200) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGamePreloadManager", "download fileSystem is null or download failed!");
            return;
        }
        iVar.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            synchronized (iVar.f159750g) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = iVar.f159750g;
                if (copyOnWriteArrayList != null) {
                    java.util.Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (str3.equals((java.lang.String) it.next())) {
                            iVar.f159750g.remove(str3);
                            break;
                        }
                    }
                }
            }
        }
        this.f159743c.a();
        java.lang.String str4 = this.f159742b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49626x6322a2f = this.f159743c.f159747d.mo49626x6322a2f(str4.substring(0, str4.lastIndexOf("/") + 1), true);
        if (mo49626x6322a2f == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK || mo49626x6322a2f == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_ALREADY_EXISTS) {
            this.f159743c.f159747d.mo49618xaf40b0d0(this.f159742b, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2)), true);
        }
        this.f159743c.f159753j.addAndGet(1);
    }

    @Override // uh1.d
    public void d(int i17, java.lang.String str, int i18) {
    }
}
