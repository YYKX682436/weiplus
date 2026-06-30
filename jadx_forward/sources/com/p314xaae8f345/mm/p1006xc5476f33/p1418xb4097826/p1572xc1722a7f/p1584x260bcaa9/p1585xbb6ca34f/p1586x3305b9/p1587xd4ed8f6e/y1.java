package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class y1 implements ep0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f203573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f203574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp2.b f203575c;

    public y1(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, wp2.b bVar) {
        this.f203573a = c19792x256d2725;
        this.f203574b = h0Var;
        this.f203575c = bVar;
    }

    @Override // ep0.f
    public void a(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReplayConvert", "reportReadCacheTime: " + j17 + " feedId: " + pm0.v.u(this.f203573a.m76784x5db1b11()) + " url: " + ((java.lang.String) this.f203574b.f391656d));
        wp2.b bVar = this.f203575c;
        r45.d94 d94Var = bVar.f529921t;
        d94Var.set(1, java.lang.Long.valueOf((long) (((int) d94Var.m75942xfb822ef2(1)) | 1)));
        bVar.f529921t.set(2, java.lang.Integer.valueOf((int) j17));
        bVar.f529921t.set(3, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // ep0.f
    public void b(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReplayConvert", "reportDownloadTime: " + j17 + " feedId: " + pm0.v.u(this.f203573a.m76784x5db1b11()) + " url: " + ((java.lang.String) this.f203574b.f391656d));
        wp2.b bVar = this.f203575c;
        r45.d94 d94Var = bVar.f529921t;
        d94Var.set(1, java.lang.Long.valueOf((long) (((int) d94Var.m75942xfb822ef2(1)) | 1)));
        bVar.f529921t.set(2, java.lang.Integer.valueOf((int) j17));
        bVar.f529921t.set(3, java.lang.Long.valueOf(c01.id.c()));
    }
}
