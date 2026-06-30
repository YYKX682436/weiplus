package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes5.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f183586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f183587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f183588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.t f183589g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f183590h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(java.lang.StringBuilder sb6, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, zy2.t tVar, java.lang.Integer num, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f183587e = sb6;
        this.f183588f = f0Var;
        this.f183589g = tVar;
        this.f183590h = num;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c4(this.f183587e, this.f183588f, this.f183589g, this.f183590h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f183586d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b4(this.f183587e, this.f183588f, this.f183589g, this.f183590h, null);
            this.f183586d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, b4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
