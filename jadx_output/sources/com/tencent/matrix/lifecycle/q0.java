package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.matrix.lifecycle.p f52780a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f52781b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f52782c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f52783d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f52784e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.q0 f52785f;

    static {
        com.tencent.matrix.lifecycle.q0 q0Var = new com.tencent.matrix.lifecycle.q0();
        f52785f = q0Var;
        f52780a = new com.tencent.matrix.lifecycle.p(null, 0, 0L, null, null, 31, null);
        f52781b = jz5.h.a(jz5.i.f302829d, com.tencent.matrix.lifecycle.o0.f52706d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < 5; i17++) {
            arrayList.add("matrix_x_" + i17);
        }
        f52782c = arrayList;
        f52783d = jz5.h.a(jz5.i.f302829d, new com.tencent.matrix.lifecycle.n0(q0Var));
        f52784e = new java.util.concurrent.ConcurrentHashMap();
    }

    public final android.os.Handler a() {
        return (android.os.Handler) f52781b.getValue();
    }
}
