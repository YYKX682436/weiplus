package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class h1 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.k1 f288283d;

    public h1(com.p314xaae8f345.mm.ui.p2690x38b72420.k1 k1Var) {
        this.f288283d = k1Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
        if (entry.getValue() != entry2.getValue()) {
            return ((java.lang.Integer) entry2.getValue()).intValue() - ((java.lang.Integer) entry.getValue()).intValue();
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.k1 k1Var = this.f288283d;
        int i18 = Integer.MAX_VALUE;
        if (((java.util.HashMap) k1Var.f288520e).get(entry.getKey()) != null) {
            i17 = ((java.lang.Integer) ((java.util.HashMap) k1Var.f288520e).get(entry.getKey())).intValue();
        } else {
            i17 = Integer.MAX_VALUE;
        }
        if (((java.util.HashMap) k1Var.f288520e).get(entry2.getKey()) != null) {
            i18 = ((java.lang.Integer) ((java.util.HashMap) k1Var.f288520e).get(entry2.getKey())).intValue();
        }
        return i17 - i18;
    }
}
