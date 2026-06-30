package com.p314xaae8f345.p3210x3857dc.p3220xf206e0c9;

/* renamed from: com.tencent.xweb.updater.XWebAutoUpdateWorker */
/* loaded from: classes12.dex */
public class C27866xe60b80f2 extends p012xc85e97e9.p125x37c711.AbstractC1263x9ac73f9e {
    public C27866xe60b80f2(android.content.Context context, p012xc85e97e9.p125x37c711.C1264xcd547028 c1264xcd547028) {
        super(context, c1264xcd547028);
    }

    @Override // p012xc85e97e9.p125x37c711.AbstractC1263x9ac73f9e
    public a5.y h() {
        by5.c4.f("XWebAutoUpdateWorker", "doWork, xweb auto check update");
        by5.t0 t0Var = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429515o;
        if (t0Var != null) {
            java.lang.Object a17 = t0Var.a("autoCheckUpdate", new java.lang.Object[0]);
            if ((a17 instanceof java.lang.Boolean) && ((java.lang.Boolean) a17).booleanValue()) {
                by5.c4.f("XWebAutoUpdateWorker", "doWork, check update by app");
                return a5.y.a();
            }
        }
        if (com.p314xaae8f345.p3210x3857dc.a3.o(true)) {
            by5.c4.f("XWebAutoUpdateWorker", "doWork, check update by sdk");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("UpdaterCheckType", "7");
            com.p314xaae8f345.p3210x3857dc.a3.A(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c, hashMap);
        } else {
            by5.c4.f("XWebAutoUpdateWorker", "doWork, no need check update");
        }
        return a5.y.a();
    }
}
