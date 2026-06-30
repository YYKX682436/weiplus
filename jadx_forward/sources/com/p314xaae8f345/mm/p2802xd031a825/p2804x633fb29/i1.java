package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f295447a = false;

    /* renamed from: b, reason: collision with root package name */
    public static int f295448b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f295449c = "";

    public static void a() {
        f295447a = false;
        f295448b = -1;
        f295449c = "";
    }

    public static void b(int i17) {
        if (f295447a) {
            return;
        }
        f295447a = true;
        f295448b = i17;
        f295449c = java.util.UUID.randomUUID().toString();
    }
}
