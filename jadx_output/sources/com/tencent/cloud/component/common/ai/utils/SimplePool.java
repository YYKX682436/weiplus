package com.tencent.cloud.component.common.ai.utils;

/* loaded from: classes14.dex */
public class SimplePool<T> {
    public static final java.lang.String TAG = "SimplePool";
    public final java.lang.Object[] pool;
    public java.lang.String poolName;
    public int poolSize;

    public SimplePool(int i17, java.lang.String str) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
        }
        this.pool = new java.lang.Object[i17];
        this.poolName = str;
    }

    private boolean isInPool(T t17) {
        for (int i17 = 0; i17 < this.poolSize; i17++) {
            if (this.pool[i17] == t17) {
                return true;
            }
        }
        return false;
    }

    public T acquire() {
        int i17 = this.poolSize;
        if (i17 <= 0) {
            return null;
        }
        int i18 = i17 - 1;
        java.lang.Object[] objArr = this.pool;
        T t17 = (T) objArr[i18];
        objArr[i18] = null;
        this.poolSize = i18;
        return t17;
    }

    public boolean release(T t17) {
        if (isInPool(t17)) {
            throw new java.lang.IllegalStateException("Already in the pool!");
        }
        int i17 = this.poolSize;
        java.lang.Object[] objArr = this.pool;
        if (i17 >= objArr.length) {
            return false;
        }
        objArr[i17] = t17;
        this.poolSize = i17 + 1;
        return true;
    }
}
