package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class s0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f148797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f148798c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148799d;

    public s0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, java.lang.String str, int i17, q80.f0 f0Var) {
        this.f148799d = iVar;
        this.f148796a = str;
        this.f148797b = i17;
        this.f148798c = f0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = this.f148799d;
        if (((java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) iVar.f148710o).get(str)) != null && java.lang.Integer.valueOf(r0.intValue() - 1).intValue() <= 0) {
            ((java.util.concurrent.ConcurrentHashMap) iVar.f148710o).remove(str);
        }
        q80.f0 f0Var = this.f148798c;
        if (f0Var != null) {
            f0Var.mo555x2fd71e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = this.f148799d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) iVar.f148710o;
        java.lang.String str = this.f148796a;
        if (((java.lang.Integer) concurrentHashMap.get(str)) != null && java.lang.Integer.valueOf(r0.intValue() - 1).intValue() <= 0) {
            ((java.util.concurrent.ConcurrentHashMap) iVar.f148710o).remove(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65271xe1eba545(str, c3712x3ed8a441.f14369x346425, c3712x3ed8a441.f14372xa8503287, this.f148797b);
        q80.f0 f0Var = this.f148798c;
        if (f0Var != null) {
            f0Var.mo556x90b54003();
        }
    }
}
