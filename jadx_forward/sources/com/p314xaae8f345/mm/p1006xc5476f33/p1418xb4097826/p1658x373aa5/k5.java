package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class k5 implements nl5.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 f214012a;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 c15269x718714b0) {
        this.f214012a = c15269x718714b0;
    }

    @Override // nl5.u
    public void a(android.text.Editable editable, java.lang.CharSequence charSequence, int i17, int i18) {
        if (charSequence == null || editable == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 c15269x718714b0 = this.f214012a;
        if (c15269x718714b0.m61839x50c91065().get(java.lang.Long.valueOf(c15269x718714b0.getFeedId())) == null) {
            c15269x718714b0.m61839x50c91065().put(java.lang.Long.valueOf(c15269x718714b0.getFeedId()), new java.util.LinkedList<>());
        }
        java.util.LinkedList<java.lang.String> linkedList = c15269x718714b0.m61839x50c91065().get(java.lang.Long.valueOf(c15269x718714b0.getFeedId()));
        if (linkedList != null) {
            linkedList.add(charSequence.toString());
        }
    }
}
