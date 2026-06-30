package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc f169976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169977e;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc ocVar) {
        this.f169977e = c11510xdd90c2f2;
        this.f169976d = ocVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.SparseArray sparseArray = this.f169977e.S1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc ocVar = this.f169976d;
        java.util.Set set = (java.util.Set) sparseArray.get(ocVar.f167776a);
        if (set != null) {
            set.remove(ocVar);
        }
    }
}
