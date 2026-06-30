package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1;

/* renamed from: com.tencent.cloud.component.common.ai.utils.SimplePool */
/* loaded from: classes14.dex */
public class C2908x217bf10e<T> {
    public static final java.lang.String TAG = "SimplePool";

    /* renamed from: pool */
    public final java.lang.Object[] f9907x34981c;

    /* renamed from: poolName */
    public java.lang.String f9908x25d818c7;

    /* renamed from: poolSize */
    public int f9909x25da7e3d;

    public C2908x217bf10e(int i17, java.lang.String str) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
        }
        this.f9907x34981c = new java.lang.Object[i17];
        this.f9908x25d818c7 = str;
    }

    /* renamed from: isInPool */
    private boolean m21723xe18df0ab(T t17) {
        for (int i17 = 0; i17 < this.f9909x25da7e3d; i17++) {
            if (this.f9907x34981c[i17] == t17) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: acquire */
    public T m21724xba9b60d6() {
        int i17 = this.f9909x25da7e3d;
        if (i17 <= 0) {
            return null;
        }
        int i18 = i17 - 1;
        java.lang.Object[] objArr = this.f9907x34981c;
        T t17 = (T) objArr[i18];
        objArr[i18] = null;
        this.f9909x25da7e3d = i18;
        return t17;
    }

    /* renamed from: release */
    public boolean m21725x41012807(T t17) {
        if (m21723xe18df0ab(t17)) {
            throw new java.lang.IllegalStateException("Already in the pool!");
        }
        int i17 = this.f9909x25da7e3d;
        java.lang.Object[] objArr = this.f9907x34981c;
        if (i17 >= objArr.length) {
            return false;
        }
        objArr[i17] = t17;
        this.f9909x25da7e3d = i17 + 1;
        return true;
    }
}
