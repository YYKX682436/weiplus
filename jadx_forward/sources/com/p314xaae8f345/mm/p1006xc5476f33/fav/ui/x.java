package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 f183120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 f183122f;

    public x(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, int i17, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f732) {
        this.f183120d = c5303xc75d2f73;
        this.f183121e = i17;
        this.f183122f = c5303xc75d2f732;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.jq0 jq0Var;
        r45.jq0 jq0Var2;
        int i18 = this.f183121e;
        if (i17 == -2) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.d(this.f183120d, i18);
            return;
        }
        if (i17 == -1) {
            a82.j1 j1Var = a82.j1.f83578a;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 event = this.f183122f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            am.c4 c4Var = event.f135623g;
            if (c4Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FavPostReporter", "reportPreCheckFail, event.data is null");
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6441x2a3819af c6441x2a3819af = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6441x2a3819af();
            c6441x2a3819af.f137811k = 2;
            c6441x2a3819af.f137804d = c4Var.f87850c;
            r45.bq0 bq0Var = c4Var.f87848a;
            c6441x2a3819af.f137806f = (bq0Var == null || (jq0Var2 = bq0Var.f452495d) == null) ? c4Var.f87860m : jq0Var2.f459567d;
            long j17 = (bq0Var == null || (jq0Var = bq0Var.f452495d) == null) ? 0L : jq0Var.f459577q;
            if (j17 > 1000000000000L) {
                j17 /= 1000;
            }
            c6441x2a3819af.f137815o = j17;
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            if (!java.lang.Boolean.valueOf(valueOf.longValue() > 0).booleanValue()) {
                valueOf = null;
            }
            c6441x2a3819af.f137816p = valueOf != null ? java.lang.Long.valueOf((java.lang.System.currentTimeMillis() / 1000) - valueOf.longValue()).longValue() : 0L;
            c6441x2a3819af.f137808h = c01.id.c() / 1000;
            c6441x2a3819af.f137809i = 1;
            c6441x2a3819af.I = 1;
            c6441x2a3819af.f137813m = 2;
            c6441x2a3819af.f137814n = j1Var.b(i18);
            c6441x2a3819af.k();
            java.lang.String n17 = c6441x2a3819af.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FavPostReporter", "report36784 ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false)));
        }
    }
}
