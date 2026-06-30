package b5;

/* loaded from: classes13.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f17869a = a5.a0.e("Schedulers");

    public static void a(a5.d dVar, androidx.work.impl.WorkDatabase workDatabase, java.util.List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        j5.x n17 = workDatabase.n();
        workDatabase.c();
        try {
            j5.g0 g0Var = (j5.g0) n17;
            java.util.List c17 = g0Var.c(dVar.f1382h);
            java.util.List b17 = g0Var.b(200);
            if (((java.util.ArrayList) c17).size() > 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Iterator it = ((java.util.ArrayList) c17).iterator();
                while (it.hasNext()) {
                    g0Var.l(((j5.w) it.next()).f297764a, currentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            java.util.ArrayList arrayList = (java.util.ArrayList) c17;
            if (arrayList.size() > 0) {
                j5.w[] wVarArr = (j5.w[]) arrayList.toArray(new j5.w[arrayList.size()]);
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    b5.f fVar = (b5.f) it6.next();
                    if (fVar.c()) {
                        fVar.e(wVarArr);
                    }
                }
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) b17;
            if (arrayList2.size() > 0) {
                j5.w[] wVarArr2 = (j5.w[]) arrayList2.toArray(new j5.w[arrayList2.size()]);
                java.util.Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    b5.f fVar2 = (b5.f) it7.next();
                    if (!fVar2.c()) {
                        fVar2.e(wVarArr2);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            workDatabase.f();
            throw th6;
        }
    }
}
