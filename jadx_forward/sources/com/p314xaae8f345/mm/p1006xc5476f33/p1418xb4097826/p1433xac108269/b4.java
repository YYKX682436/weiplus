package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes5.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f183557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f183558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.t f183559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f183560g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(java.lang.StringBuilder sb6, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, zy2.t tVar, java.lang.Integer num, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f183557d = sb6;
        this.f183558e = f0Var;
        this.f183559f = tVar;
        this.f183560g = num;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b4(this.f183557d, this.f183558e, this.f183559f, this.f183560g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b4 b4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f183557d.append("get max words(" + java.lang.Thread.currentThread() + "),");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4.f183754a;
        java.lang.Integer num = this.f183560g;
        zy2.t tVar = this.f183559f;
        int a17 = h4Var.a(tVar, num);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f183558e;
        f0Var.f391649d = a17;
        ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4.f183755b).mo141623x754a37bb()).put(tVar, new java.lang.Integer(f0Var.f391649d));
        return jz5.f0.f384359a;
    }
}
