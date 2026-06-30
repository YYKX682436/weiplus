package com.tencent.mm.modelcdntran;

/* loaded from: classes9.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.m f71028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f71029e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(dn.m mVar, kotlinx.coroutines.r2 r2Var) {
        super(1);
        this.f71028d = mVar;
        this.f71029e = r2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        if (aj6 != null) {
            java.lang.String field_mediaId = this.f71028d.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            aj6.c7(new com.tencent.mm.modelcdntran.j(aj6, field_mediaId, kotlinx.coroutines.flow.r2.b(3, 0, null, 6, null), null));
        }
        kotlinx.coroutines.r2 r2Var = this.f71029e;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
