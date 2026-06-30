package com.tencent.mm.app;

/* loaded from: classes12.dex */
public abstract class i4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f53453a = new java.util.HashSet(16);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f53454b = new java.util.ArrayList(16);

    /* renamed from: c, reason: collision with root package name */
    public static final z65.a[] f53455c = {null};

    public static void a(com.tencent.mm.app.h4 h4Var) {
        java.util.Objects.requireNonNull(h4Var);
        java.util.Set set = f53453a;
        synchronized (set) {
            ((java.util.HashSet) set).add(h4Var);
            f53454b.ensureCapacity(((java.util.HashSet) set).size() + 4);
        }
    }

    public static void b(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        java.util.Set set = f53453a;
        synchronized (set) {
            java.util.ArrayList arrayList = f53454b;
            arrayList.addAll(set);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((com.tencent.mm.app.h4) it.next()).a(thread, str, th6);
                } catch (java.lang.Throwable unused) {
                }
            }
            f53454b.clear();
        }
    }

    public static void c(int i17, java.lang.String str) {
        java.util.Set set = f53453a;
        synchronized (set) {
            java.util.ArrayList arrayList = f53454b;
            arrayList.addAll(set);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((com.tencent.mm.app.h4) it.next()).e(i17, str);
                } catch (java.lang.Throwable unused) {
                }
            }
            f53454b.clear();
        }
    }

    public static void d(java.lang.String str, long j17) {
        z65.a aVar;
        z65.a[] aVarArr = f53455c;
        synchronized (aVarArr) {
            aVar = aVarArr[0];
        }
        if (aVar != null) {
            try {
                boolean[] zArr = {false};
                com.tencent.mm.app.f4.a(new com.tencent.mm.app.g4(aVar, str, zArr));
                synchronized (zArr) {
                    zArr[0] = true;
                    while (zArr[0]) {
                        zArr.wait(j17);
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
