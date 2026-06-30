package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f203302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f203303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 f203304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203305g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f203306h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vp2.l f203307i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(r45.h32 h32Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 p1Var, in5.s0 s0Var, yz5.p pVar, vp2.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f203303e = h32Var;
        this.f203304f = p1Var;
        this.f203305g = s0Var;
        this.f203306h = pVar;
        this.f203307i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.l1(this.f203303e, this.f203304f, this.f203305g, this.f203306h, this.f203307i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.l1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f203302d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 p1Var = this.f203304f;
        in5.s0 s0Var = this.f203305g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.h32 noticeInfo = this.f203303e;
            r45.q65 q65Var = (r45.q65) noticeInfo.m75936x14adae67(10);
            boolean z17 = false;
            if (q65Var != null && q65Var.m75933x41a8a7f2(0)) {
                z17 = true;
            }
            tx2.k kVar = tx2.k.f504135a;
            if (z17) {
                p1Var.q().a();
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(noticeInfo, "$noticeInfo");
                yz5.p pVar = this.f203306h;
                this.f203302d = 1;
                if (kVar.d(context, 0, noticeInfo, pVar, this) == aVar) {
                    return aVar;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1.n(p1Var, s0Var, this.f203307i);
            } else {
                android.content.Context context2 = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(noticeInfo, "$noticeInfo");
                yz5.p pVar2 = this.f203306h;
                this.f203302d = 2;
                if (kVar.d(context2, 0, noticeInfo, pVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1.n(p1Var, s0Var, this.f203307i);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
