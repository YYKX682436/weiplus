package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class rm {

    /* renamed from: a, reason: collision with root package name */
    private static final int f51234a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f51235b;

    public static void a(android.content.Context context) {
        synchronized (com.tencent.mapsdk.internal.rm.class) {
            f51235b = com.tencent.mapsdk.internal.my.a(context).b(com.tencent.mapsdk.internal.er.f49407z);
        }
    }

    public static void a(android.content.Context context, int i17) {
        synchronized (com.tencent.mapsdk.internal.rm.class) {
            f51235b = i17;
            com.tencent.mapsdk.internal.my.a(context).a(com.tencent.mapsdk.internal.er.f49407z, i17);
        }
    }

    public static int a() {
        int i17;
        synchronized (com.tencent.mapsdk.internal.rm.class) {
            i17 = f51235b;
        }
        return i17;
    }
}
