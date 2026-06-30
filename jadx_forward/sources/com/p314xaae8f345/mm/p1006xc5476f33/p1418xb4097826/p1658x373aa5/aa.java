package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class aa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f213158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f213159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f213160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf f213161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd f213162h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(yz5.a aVar, tx2.i0 i0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf c15422x1a5a3ecf, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd c15287xabbcfcd, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f213159e = aVar;
        this.f213160f = i0Var;
        this.f213161g = c15422x1a5a3ecf;
        this.f213162h = c15287xabbcfcd;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.aa(this.f213159e, this.f213160f, this.f213161g, this.f213162h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.aa) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f213158d;
        tx2.i0 i0Var = this.f213160f;
        yz5.a aVar2 = this.f213159e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf c15422x1a5a3ecf = this.f213161g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.q65 q65Var = (r45.q65) ((r45.h32) aVar2.mo152xb9724478()).m75936x14adae67(10);
            boolean z17 = false;
            if (q65Var != null && q65Var.m75933x41a8a7f2(0)) {
                z17 = true;
            }
            if (z17) {
                i0Var.a();
                this.f213158d = 1;
                if (c15422x1a5a3ecf.a(1, this) == aVar) {
                    return aVar;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd.a(this.f213162h);
            } else {
                this.f213158d = 2;
                if (c15422x1a5a3ecf.a(1, this) == aVar) {
                    return aVar;
                }
                i0Var.z(c15422x1a5a3ecf.getDm.i4.COL_USERNAME java.lang.String(), (r45.h32) aVar2.mo152xb9724478(), null);
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd.a(this.f213162h);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i0Var.z(c15422x1a5a3ecf.getDm.i4.COL_USERNAME java.lang.String(), (r45.h32) aVar2.mo152xb9724478(), null);
        }
        return jz5.f0.f384359a;
    }
}
