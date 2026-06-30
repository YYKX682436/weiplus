package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f159363a = -1;

    public static int a() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
            return 0;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context)) {
            return 1;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            return 2;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            return 3;
        }
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context) ? 4 : 5;
    }

    public static void b(r45.k47 k47Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.z0 z0Var) {
        if (z0Var != null) {
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - z0Var.f159386b);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(currentTimeMillis);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(z0Var.f159385a);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(k47Var.mo75928xcd1e8d8());
            int i17 = f159363a;
            if (i17 < 0) {
                i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40065x82653f5d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                f159363a = i17;
            }
            ((ch1.d) cVar).c(15190, valueOf, valueOf2, valueOf3, 0, "", "", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a()));
        }
    }
}
