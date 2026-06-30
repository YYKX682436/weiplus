package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44;

/* loaded from: classes2.dex */
public final class e implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g f203601d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g gVar) {
        this.f203601d = gVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.util.List m82898xfb7e5820;
        r45.y23 y23Var;
        r45.y23 y23Var2;
        java.lang.String str;
        java.lang.String str2;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g gVar = this.f203601d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = gVar.f203612j.mo7946xf939df19();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null || i17 > m82898xfb7e5820.size() - 1) {
            return;
        }
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        java.lang.String str3 = (nyVar == null || (str2 = nyVar.f216915p) == null) ? "" : str2;
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        java.lang.String str4 = (nyVar2 == null || (str = nyVar2.f216919r) == null) ? "" : str;
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        long j17 = gVar.f203605c;
        long j18 = gVar.f203606d;
        java.lang.String str5 = gVar.f203607e;
        r45.qt2 qt2Var = gVar.f203610h;
        java.lang.String valueOf = java.lang.String.valueOf(qt2Var.m75939xb282bd08(5));
        ml2.b4 b4Var = ml2.b4.f408757e;
        cl0.g gVar2 = new cl0.g();
        gVar2.o("commerceAction", 2);
        gVar2.o("reason_type", 2);
        vp2.k0 k0Var = (vp2.k0) kz5.n0.a0(m82898xfb7e5820, i17);
        long j19 = 0;
        gVar2.p("productid", (k0Var == null || (y23Var2 = k0Var.f520466e) == null) ? 0L : y23Var2.m75942xfb822ef2(0));
        r0Var.ij(j17, j18, str5, valueOf, 12, gVar2.toString(), "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        java.lang.String valueOf2 = java.lang.String.valueOf(qt2Var.m75939xb282bd08(5));
        java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("liveid_id", java.lang.Long.valueOf(gVar.f203605c));
        vp2.k0 k0Var2 = (vp2.k0) kz5.n0.a0(m82898xfb7e5820, i17);
        jSONObject.putOpt("productid", java.lang.Long.valueOf((k0Var2 == null || (y23Var = k0Var2.f520466e) == null) ? 0L : y23Var.m75942xfb822ef2(0)));
        a4Var.b(valueOf2, m75945x2fec8307, "topic_page_single_commo_card", jSONObject.toString());
        wp2.b bVar = gVar.f203604b;
        if (bVar != null) {
            vp2.k0 k0Var3 = (vp2.k0) kz5.n0.a0(m82898xfb7e5820, i17);
            if (k0Var3 != null && k0Var3.f520467f) {
                j19 = k0Var3.f520465d;
            }
            tp2.f fVar = gVar.f203611i;
            if (fVar != null) {
                tp2.f.b(fVar, i17, bVar, ((cr2.b) gVar.f203603a).f303385a.f303444q, view, str3, str4, false, 5, null, null, j19, null, android.os.SystemClock.elapsedRealtime(), null, null, 27392, null);
            }
        }
    }
}
