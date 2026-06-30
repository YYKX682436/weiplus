package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class v2 implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f203515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f203516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp2.b f203518d;

    public v2(boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str, wp2.b bVar) {
        this.f203515a = z17;
        this.f203516b = c19792x256d2725;
        this.f203517c = str;
        this.f203518d = bVar;
    }

    @Override // ep0.c
    public void a(ip0.a aVar, cp0.n nVar, hp0.e eVar) {
        if (this.f203515a) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onImageLoadFinish from ");
            sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f364442a) : null);
            sb6.append(" feedId: ");
            sb6.append(pm0.v.u(this.f203516b.m76784x5db1b11()));
            sb6.append(" url: ");
            sb6.append(this.f203517c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", sb6.toString());
            this.f203518d.f529921t.set(1, java.lang.Long.valueOf(((int) r3.m75942xfb822ef2(1)) | 1));
        }
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
    }
}
