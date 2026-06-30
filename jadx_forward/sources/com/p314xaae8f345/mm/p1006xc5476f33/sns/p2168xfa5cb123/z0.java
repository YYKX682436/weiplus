package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Vector f246537a = new java.util.Vector();

    public m21.w a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        if (obj == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
            return null;
        }
        java.util.Vector vector = this.f246537a;
        try {
            java.util.Iterator it = vector.iterator();
            while (it.hasNext()) {
                m21.w wVar = (m21.w) it.next();
                if (obj.equals(wVar.f404536a)) {
                    vector.remove(wVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
                    return wVar;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ss_log_base_helper", "report by key " + e17.getMessage() + " " + obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        return null;
    }

    public boolean b(m21.w wVar) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBySeq", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        java.util.Vector vector = this.f246537a;
        java.util.Iterator it = vector.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            m21.w wVar2 = (m21.w) it.next();
            if (wVar2.f404540e == wVar.f404540e) {
                vector.remove(wVar2);
                z17 = true;
                break;
            }
        }
        vector.add(wVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBySeq", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        return z17;
    }
}
