package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class mc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id f188901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar) {
        super(0);
        this.f188901d = idVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f188901d.f188536f;
        if (c14994x9b99c079 != null) {
            jz5.l k17 = nv2.n1.f422084h.k(c14994x9b99c079.getFeedObject());
            boolean booleanValue = ((java.lang.Boolean) k17.f384366d).booleanValue();
            boolean booleanValue2 = ((java.lang.Boolean) k17.f384367e).booleanValue();
            if (booleanValue && !booleanValue2) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
