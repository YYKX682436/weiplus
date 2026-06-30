package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250;

/* loaded from: classes5.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f237895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17069x6b694 f237896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f237897c;

    public d(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17069x6b694 c17069x6b694, boolean z17) {
        this.f237895a = j17;
        this.f237896b = c17069x6b694;
        this.f237897c = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a f17;
        dv3.c cVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f237895a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17069x6b694 c17069x6b694 = this.f237896b;
        boolean z17 = this.f237897c;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str2 = fVar.f152150c;
        r45.xv0 xv0Var = (r45.xv0) fVar.f152151d;
        boolean z18 = xv0Var.f472007e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = xv0Var.f472006d;
        java.util.LinkedList items = xv0Var.f472008f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items, "items");
        c17069x6b694.G0(z17, i17, i18, str2, z18, gVar, items);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17069x6b694 c17069x6b6942 = this.f237896b;
        dv3.c cVar2 = c17069x6b6942.f237914e;
        if (cVar2 == null || (str = cVar2.f325529J) == null) {
            str = "";
        }
        if ((str.length() > 0) && (cVar = c17069x6b6942.f237914e) != null) {
            cVar.V0(str, rv3.y.f481952a);
        }
        ev3.d dVar = c17069x6b6942.f237913d;
        if (dVar == null || (f17 = dVar.f()) == null) {
            return null;
        }
        f17.n(c17069x6b6942.n0(), ((r45.xv0) fVar.f152151d).f472008f.size(), currentTimeMillis);
        return null;
    }
}
