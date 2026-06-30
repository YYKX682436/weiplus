package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class f6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34477x366c91de = 120;

    /* renamed from: NAME */
    private static final java.lang.String f34478x24728b = "getImageInfo";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Collection f163340g;

    static {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a6(null));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d6(null));
        f163340g = java.util.Collections.unmodifiableCollection(linkedList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        e9Var.mo48798x74292566();
        java.lang.String optString = jSONObject.optString("src");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            e9Var.a(i17, o("fail:invalid data"));
        } else {
            s75.d.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z5(this, e9Var, optString, new java.lang.ref.WeakReference(e9Var), i17), java.lang.String.format(java.util.Locale.US, "AppBrandJsApiGetImageInfo[%s]", optString), 10);
        }
    }
}
