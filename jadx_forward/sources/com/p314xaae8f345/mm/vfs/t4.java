package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class t4 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final long f294719d;

    public t4(com.p314xaae8f345.mm.vfs.u4 u4Var) {
        this.f294719d = java.lang.System.currentTimeMillis() - u4Var.f294736i;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
        com.p314xaae8f345.mm.vfs.x1 x1Var2 = (com.p314xaae8f345.mm.vfs.x1) obj2;
        long j17 = x1Var.f294768e;
        long j18 = this.f294719d;
        int i17 = 1;
        if (j17 >= j18 || x1Var2.f294768e >= j18) {
            long j19 = x1Var2.f294768e - j17;
            int i18 = j19 == 0 ? 0 : j19 > 0 ? 1 : -1;
            if (i18 != 0) {
                return i18;
            }
        }
        long j27 = x1Var.f294767d - x1Var2.f294767d;
        if (j27 == 0) {
            i17 = 0;
        } else if (j27 <= 0) {
            i17 = -1;
        }
        return i17;
    }
}
