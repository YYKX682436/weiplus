package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class x1 implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f203557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f203558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp2.b f203559c;

    public x1(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, wp2.b bVar) {
        this.f203557a = c19792x256d2725;
        this.f203558b = h0Var;
        this.f203559c = bVar;
    }

    @Override // ep0.c
    public void a(ip0.a aVar, cp0.n nVar, hp0.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onImageLoadFinish from ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f364442a) : null);
        sb6.append(" feedId: ");
        sb6.append(pm0.v.u(this.f203557a.m76784x5db1b11()));
        sb6.append(" url: ");
        sb6.append((java.lang.String) this.f203558b.f391656d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReplayConvert", sb6.toString());
        this.f203559c.f529921t.set(1, java.lang.Long.valueOf(((int) r3.m75942xfb822ef2(1)) | 1));
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
    }
}
