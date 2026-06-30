package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class w2 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f172474d;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f172474d = c11510xdd90c2f2;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Runnable runnable = (java.lang.Runnable) obj;
        java.lang.Runnable runnable2 = (java.lang.Runnable) obj2;
        if (runnable == runnable2) {
            return 0;
        }
        return runnable.hashCode() - runnable2.hashCode();
    }
}
