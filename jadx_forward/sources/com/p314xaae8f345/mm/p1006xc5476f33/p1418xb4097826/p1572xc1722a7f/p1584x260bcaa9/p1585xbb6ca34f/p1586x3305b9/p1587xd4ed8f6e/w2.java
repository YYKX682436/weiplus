package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class w2 implements ep0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f203536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f203537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203538c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp2.b f203539d;

    public w2(boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str, wp2.b bVar) {
        this.f203536a = z17;
        this.f203537b = c19792x256d2725;
        this.f203538c = str;
        this.f203539d = bVar;
    }

    @Override // ep0.f
    public void a(long j17) {
        if (this.f203536a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "reportReadCacheTime: " + j17 + " feedId: " + pm0.v.u(this.f203537b.m76784x5db1b11()) + " url: " + this.f203538c);
            wp2.b bVar = this.f203539d;
            r45.d94 d94Var = bVar.f529921t;
            d94Var.set(1, java.lang.Long.valueOf((long) (((int) d94Var.m75942xfb822ef2(1)) | 1)));
            bVar.f529921t.set(2, java.lang.Integer.valueOf((int) j17));
            bVar.f529921t.set(3, java.lang.Long.valueOf(c01.id.c()));
        }
    }

    @Override // ep0.f
    public void b(long j17) {
        if (this.f203536a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "reportDownloadTime: " + j17 + " feedId: " + pm0.v.u(this.f203537b.m76784x5db1b11()) + " url: " + this.f203538c);
            wp2.b bVar = this.f203539d;
            r45.d94 d94Var = bVar.f529921t;
            d94Var.set(1, java.lang.Long.valueOf((long) (((int) d94Var.m75942xfb822ef2(1)) | 1)));
            bVar.f529921t.set(2, java.lang.Integer.valueOf((int) j17));
            bVar.f529921t.set(3, java.lang.Long.valueOf(c01.id.c()));
        }
    }
}
