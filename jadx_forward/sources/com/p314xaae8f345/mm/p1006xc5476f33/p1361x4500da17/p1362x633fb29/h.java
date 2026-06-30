package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a f178807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m02.b f178808e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar, m02.b bVar) {
        this.f178807d = aVar;
        this.f178808e = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar = this.f178807d;
        h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(aVar.f178770d);
        if (d17 != null) {
            d17.f68441x10a0fed7 = 4;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(d17);
        } else {
            d17 = new h02.a();
            d17.f68408x32b20428 = java.lang.System.currentTimeMillis();
            d17.f68404x28d45f97 = aVar.f178770d;
            d17.f68411x238eb002 = aVar.f178767a;
            d17.f68441x10a0fed7 = 4;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.a(d17.f68408x32b20428);
        m02.b bVar = this.f178808e;
        if (bVar != null) {
            bVar.a(m02.a.FAIL, d17.f68408x32b20428);
        }
    }
}
