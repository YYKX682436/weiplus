package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public abstract class p5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f135116a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean[] f135117b = {false};

    public static void a(int i17, int i18, int i19) {
        boolean[] zArr = f135117b;
        synchronized (zArr) {
            if (zArr[0]) {
                jx3.f.INSTANCE.mo68477x336bdfd8(i17, i18, i19, true);
            } else {
                java.util.List list = f135116a;
                synchronized (list) {
                    ((java.util.ArrayList) list).add(new com.p314xaae8f345.mm.app.m5(i17, i18, i19));
                }
            }
        }
    }

    public static void b(int i17, java.lang.Object... objArr) {
        boolean[] zArr = f135117b;
        synchronized (zArr) {
            if (zArr[0]) {
                jx3.f.INSTANCE.d(i17, objArr);
            } else {
                java.util.List list = f135116a;
                synchronized (list) {
                    ((java.util.ArrayList) list).add(new com.p314xaae8f345.mm.app.n5(i17, objArr));
                }
            }
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        boolean[] zArr = f135117b;
        synchronized (zArr) {
            if (zArr[0]) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2, objArr);
            } else {
                java.util.List list = f135116a;
                synchronized (list) {
                    if (objArr != null) {
                        try {
                            if (objArr.length > 0) {
                                str2 = java.lang.String.format(str2, objArr);
                            }
                        } finally {
                        }
                    }
                    ((java.util.ArrayList) list).add(new com.p314xaae8f345.mm.app.o5(6, str, str2));
                }
            }
        }
    }

    public static void d(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        boolean[] zArr = f135117b;
        synchronized (zArr) {
            if (zArr[0]) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, str2, objArr);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                if (objArr == null || objArr.length <= 0) {
                    sb6.append(str2);
                } else {
                    sb6.append(java.lang.String.format(str2, objArr));
                }
                sb6.append("  ");
                sb6.append(android.util.Log.getStackTraceString(th6));
                java.util.List list = f135116a;
                synchronized (list) {
                    ((java.util.ArrayList) list).add(new com.p314xaae8f345.mm.app.o5(6, str, sb6.toString()));
                }
            }
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        boolean[] zArr = f135117b;
        synchronized (zArr) {
            if (zArr[0]) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2, objArr);
            } else {
                java.util.List list = f135116a;
                synchronized (list) {
                    if (objArr != null) {
                        try {
                            if (objArr.length > 0) {
                                str2 = java.lang.String.format(str2, objArr);
                            }
                        } finally {
                        }
                    }
                    ((java.util.ArrayList) list).add(new com.p314xaae8f345.mm.app.o5(4, str, str2));
                }
            }
        }
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        boolean[] zArr = f135117b;
        synchronized (zArr) {
            if (zArr[0]) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, str2, objArr);
            } else {
                java.util.List list = f135116a;
                synchronized (list) {
                    if (objArr != null) {
                        try {
                            if (objArr.length > 0) {
                                str2 = java.lang.String.format(str2, objArr);
                            }
                        } finally {
                        }
                    }
                    ((java.util.ArrayList) list).add(new com.p314xaae8f345.mm.app.o5(5, str, str2));
                }
            }
        }
    }
}
