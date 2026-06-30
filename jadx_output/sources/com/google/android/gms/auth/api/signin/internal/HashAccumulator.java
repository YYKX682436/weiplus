package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public class HashAccumulator {
    private int zaa = 1;

    public com.google.android.gms.auth.api.signin.internal.HashAccumulator addObject(java.lang.Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int hash() {
        return this.zaa;
    }

    public final com.google.android.gms.auth.api.signin.internal.HashAccumulator zaa(boolean z17) {
        this.zaa = (this.zaa * 31) + (z17 ? 1 : 0);
        return this;
    }
}
