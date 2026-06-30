package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class jc0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f216387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f216388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(java.util.LinkedList linkedList, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f216387d = linkedList;
        this.f216388e = activityC0065xcd7aa112;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jc0(this.f216387d, this.f216388e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jc0 jc0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jc0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jc0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        for (in5.x0 x0Var : this.f216387d) {
            in5.c cVar = x0Var.f374691a;
            ox3.f fVar = cVar instanceof ox3.f ? (ox3.f) cVar : null;
            dd0.m0 m0Var = (dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f216388e;
            ed0.z0 Di = m0Var.Di(activityC0065xcd7aa112);
            int i17 = x0Var.f374693c;
            in5.c cVar2 = x0Var.f374691a;
            ed0.z0.i1(Di, 1L, i17, cVar2 instanceof ox3.f ? (ox3.f) cVar2 : null, 0L, 8, null);
            if ((fVar != null ? ((ox3.g) fVar).f431282d.f497155n : null) != null) {
                ed0.z0.i1(((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Di(activityC0065xcd7aa112), 11L, x0Var.f374693c, cVar2 instanceof ox3.f ? (ox3.f) cVar2 : null, 0L, 8, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
