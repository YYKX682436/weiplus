package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f169777a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.l1 f169778b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f169779c;

    /* renamed from: d, reason: collision with root package name */
    public long f169780d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f169781e;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j1 j1Var) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f169781e = sparseArray;
        sparseArray.put(1, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1(1));
        sparseArray.put(2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1(2));
        sparseArray.put(3, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1(3));
        sparseArray.put(4, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1(4));
        sparseArray.put(5, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1(5));
        sparseArray.put(6, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1(6));
        sparseArray.put(7, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1(7));
    }

    public final void a() {
        yd.c0 c0Var = yd.c0.INST;
        android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
        android.os.Debug.getMemoryInfo(memoryInfo);
        yd.b0 a17 = yd.c0.a(memoryInfo);
        yd.b0 h17 = c0Var.h();
        android.util.SparseArray sparseArray = this.f169781e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1) sparseArray.get(1)).a(a17.f542451a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1 m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1) sparseArray.get(2);
        int i17 = a17.f542457g;
        if (i17 <= 0) {
            i17 = a17.f542453c;
        }
        m1Var.a(i17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1) sparseArray.get(3)).a(a17.f542452b);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1) sparseArray.get(4)).a(h17.f542454d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1) sparseArray.get(5)).a(a17.f542458h);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1) sparseArray.get(6)).a(a17.f542459i);
        if (((ob0.h3) i95.n0.c(ob0.h3.class)) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1) sparseArray.get(7)).a((int) ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328.f() / 1024) / 1024));
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1 b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1 m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1) this.f169781e.get(i17);
        if (m1Var != null) {
            return m1Var;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("StatisticsWrapper null, type:%d", java.lang.Integer.valueOf(i17)));
    }
}
