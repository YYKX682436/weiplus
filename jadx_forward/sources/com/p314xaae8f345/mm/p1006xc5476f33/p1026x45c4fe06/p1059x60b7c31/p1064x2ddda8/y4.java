package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class y4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f161332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f161335g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f161333e = str;
        this.f161334f = yVar;
        this.f161335g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y4(this.f161333e, this.f161334f, this.f161335g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f161332d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.lang.String str = this.f161333e;
                java.lang.String mo48798x74292566 = this.f161334f.mo48798x74292566();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
                qt1.j jVar = new qt1.j(str, mo48798x74292566, this.f161335g);
                this.f161332d = 1;
                if (jVar.e(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
        } catch (qt1.f unused) {
        }
        return jz5.f0.f384359a;
    }
}
