package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes11.dex */
public class m1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f225975a;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.o1 o1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar) {
        this.f225975a = sVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        boolean equals = str.equals("setData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = this.f225975a;
        if (equals) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("nativePointer", "setData from native");
            sVar.d(hashMap);
            return false;
        }
        if (!str.equals("throwError")) {
            sVar.c(j17, i17, "dispatch from native");
            return false;
        }
        sVar.getClass();
        ((java.util.HashSet) sVar.f225697a).remove(java.lang.String.format("%d_%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65499xdd68ad86(sVar.f225699c, j17, i17, "error", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s.b("throwError from native", "{}"));
        return false;
    }
}
