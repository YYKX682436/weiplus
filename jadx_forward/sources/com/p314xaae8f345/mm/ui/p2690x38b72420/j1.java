package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class j1 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.k1 f288487d;

    public j1(com.p314xaae8f345.mm.ui.p2690x38b72420.k1 k1Var) {
        this.f288487d = k1Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        com.p314xaae8f345.mm.ui.p2690x38b72420.k1 k1Var = this.f288487d;
        return (((java.util.HashMap) k1Var.f288520e).get(str) != null ? ((java.lang.Integer) ((java.util.HashMap) k1Var.f288520e).get(str)).intValue() : Integer.MAX_VALUE) - (((java.util.HashMap) k1Var.f288520e).get(str2) != null ? ((java.lang.Integer) ((java.util.HashMap) k1Var.f288520e).get(str2)).intValue() : Integer.MAX_VALUE);
    }
}
