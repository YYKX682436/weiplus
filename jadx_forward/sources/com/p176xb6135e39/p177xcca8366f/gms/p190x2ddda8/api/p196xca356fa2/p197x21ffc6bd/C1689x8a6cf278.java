package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* renamed from: com.google.android.gms.auth.api.signin.internal.HashAccumulator */
/* loaded from: classes13.dex */
public class C1689x8a6cf278 {
    private int zaa = 1;

    /* renamed from: addObject */
    public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1689x8a6cf278 m17545xf8384b40(java.lang.Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: hash */
    public int m17546x30c10e() {
        return this.zaa;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1689x8a6cf278 zaa(boolean z17) {
        this.zaa = (this.zaa * 31) + (z17 ? 1 : 0);
        return this;
    }
}
