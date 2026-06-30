package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class cq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr f188033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar) {
        super(2);
        this.f188033d = krVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = this.f188033d.f188780x;
        if (xrVar != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56677x4905e9fa = xrVar.m56677x4905e9fa();
            m56677x4905e9fa.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bq(m56677x4905e9fa, intValue, m56677x4905e9fa));
        }
        return jz5.f0.f384359a;
    }
}
