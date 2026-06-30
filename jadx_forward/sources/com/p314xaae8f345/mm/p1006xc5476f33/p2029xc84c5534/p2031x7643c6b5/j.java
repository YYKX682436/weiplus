package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes7.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f239815a = new java.util.HashSet(64);

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f239816b = false;

    public static void a() {
        synchronized (f239815a) {
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().openRawResource(com.p314xaae8f345.mm.R.raw.f80394xcd8d771c)), 4096);
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        ((java.util.HashSet) f239815a).add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(readLine)));
                    } catch (java.lang.Throwable th6) {
                        try {
                            bufferedReader.close();
                        } catch (java.lang.Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                }
                bufferedReader.close();
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("IDKeyInvalidList", "invalid value in R file");
            }
            f239816b = true;
        }
    }

    public static boolean b(int i17) {
        if (!f239816b) {
            synchronized (f239815a) {
                if (!f239816b) {
                    a();
                }
            }
        }
        return ((java.util.HashSet) f239815a).contains(java.lang.Integer.valueOf(i17));
    }
}
