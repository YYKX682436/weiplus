package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public abstract class i4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f134986a = new java.util.HashSet(16);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f134987b = new java.util.ArrayList(16);

    /* renamed from: c, reason: collision with root package name */
    public static final z65.a[] f134988c = {null};

    public static void a(com.p314xaae8f345.mm.app.h4 h4Var) {
        java.util.Objects.requireNonNull(h4Var);
        java.util.Set set = f134986a;
        synchronized (set) {
            ((java.util.HashSet) set).add(h4Var);
            f134987b.ensureCapacity(((java.util.HashSet) set).size() + 4);
        }
    }

    public static void b(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        java.util.Set set = f134986a;
        synchronized (set) {
            java.util.ArrayList arrayList = f134987b;
            arrayList.addAll(set);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((com.p314xaae8f345.mm.app.h4) it.next()).a(thread, str, th6);
                } catch (java.lang.Throwable unused) {
                }
            }
            f134987b.clear();
        }
    }

    public static void c(int i17, java.lang.String str) {
        java.util.Set set = f134986a;
        synchronized (set) {
            java.util.ArrayList arrayList = f134987b;
            arrayList.addAll(set);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((com.p314xaae8f345.mm.app.h4) it.next()).e(i17, str);
                } catch (java.lang.Throwable unused) {
                }
            }
            f134987b.clear();
        }
    }

    public static void d(java.lang.String str, long j17) {
        z65.a aVar;
        z65.a[] aVarArr = f134988c;
        synchronized (aVarArr) {
            aVar = aVarArr[0];
        }
        if (aVar != null) {
            try {
                boolean[] zArr = {false};
                com.p314xaae8f345.mm.app.f4.a(new com.p314xaae8f345.mm.app.g4(aVar, str, zArr));
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
