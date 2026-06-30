package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class j5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f188620e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, long j17) {
        super(0);
        this.f188619d = a7Var;
        this.f188620e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f188619d;
        java.util.Map map = a7Var.D1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = a7Var.f187745i;
        if (c14994x9b99c079 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        map.put(new bu2.k(c14994x9b99c079.m59251x5db1b11(), a7Var.A), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        ((kw2.c) ((jz5.n) a7Var.V).mo141623x754a37bb()).f394428b = java.lang.System.currentTimeMillis() - this.f188620e;
        return jz5.f0.f384359a;
    }
}
