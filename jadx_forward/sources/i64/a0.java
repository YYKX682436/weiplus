package i64;

/* loaded from: classes4.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f370595a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f370596b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f370597c = "AdModelManager";

    public void a(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyModelChange", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d(), "apply k=" + obj + " model=" + obj2);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) e(obj))).k(obj2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyModelChange", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
    }

    public java.lang.Object b(java.lang.Object obj) {
        java.lang.Object mo144003x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("currentModel", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        synchronized (this.f370595a) {
            try {
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) ((java.util.LinkedHashMap) this.f370595a).get(obj);
                mo144003x754a37bb = j2Var != null ? ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb() : null;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("currentModel", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("currentModel", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        return mo144003x754a37bb;
    }

    public final java.util.Map c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getModelFlows", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        java.util.Map map = this.f370595a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getModelFlows", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        return map;
    }

    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        return this.f370597c;
    }

    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j e(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("observeModelChange", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        synchronized (this.f370595a) {
            try {
                j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) ((java.util.LinkedHashMap) this.f370595a).get(obj);
                if (j2Var == null) {
                    j2Var = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
                    this.f370595a.put(obj, j2Var);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("observeModelChange", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("observeModelChange", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        return j2Var;
    }

    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("obtainMutex", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        synchronized (this.f370596b) {
            try {
                dVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) ((java.util.LinkedHashMap) this.f370596b).get(obj);
                if (dVar == null) {
                    dVar = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);
                    this.f370596b.put(obj, dVar);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainMutex", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainMutex", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        return dVar;
    }
}
