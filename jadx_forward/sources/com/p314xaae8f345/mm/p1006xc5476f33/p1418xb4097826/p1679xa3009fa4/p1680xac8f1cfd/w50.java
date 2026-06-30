package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class w50 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 f217835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f217837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f217838g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ow2.h f217839h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, yz5.a aVar, ow2.h hVar) {
        super(1);
        this.f217835d = c15477xbd78f833;
        this.f217836e = s0Var;
        this.f217837f = c15188xd8bd4bd;
        this.f217838g = aVar;
        this.f217839h = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        r45.bn2 dramaInfo;
        r45.qj2 qj2Var;
        float floatValue = ((java.lang.Number) obj).floatValue();
        in5.s0 s0Var = this.f217836e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833 = this.f217835d;
        c15477xbd78f833.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedControlUIC", "handleSpeedSelected ratio: " + floatValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f217837f;
        cw2.wa f212140n = c15188xd8bd4bd.getF212140n();
        if (f212140n != null && (c14989xf862ae88 = f212140n.f305632f) != null && (dramaInfo = c14989xf862ae88.getDramaInfo()) != null && (qj2Var = (r45.qj2) dramaInfo.m75936x14adae67(0)) != null) {
            ey2.v2 v2Var = (ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class);
            java.lang.Long valueOf = java.lang.Long.valueOf(qj2Var.m75942xfb822ef2(0));
            android.app.Activity context = c15477xbd78f833.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            v2Var.V6(valueOf, nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().m75939xb282bd08(5)) : null, floatValue);
        }
        c15188xd8bd4bd.m61420xeb2d9731(floatValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60 k60Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x60) ((jz5.n) c15477xbd78f833.f215169d).mo141623x754a37bb()).f217940d;
        k60Var.getClass();
        boolean z17 = k60Var == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60.f216458e;
        ow2.h hVar = this.f217839h;
        if (hVar != null) {
            hVar.g(floatValue, 2000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u50(floatValue, hVar, s0Var, z17, c15477xbd78f833), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yk.f214932e, s0Var, z17);
        }
        java.lang.String mo56696x9040359a = c15188xd8bd4bd.mo56696x9040359a();
        jz5.g gVar = tn2.d.f502355x;
        jz5.g gVar2 = tn2.d.f502355x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd m58245x4ee17f0a = ((tn2.d) gVar2.mo141623x754a37bb()).k0().m58245x4ee17f0a();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo56696x9040359a, m58245x4ee17f0a != null ? m58245x4ee17f0a.mo56696x9040359a() : null)) {
            tn2.d dVar = (tn2.d) gVar2.mo141623x754a37bb();
            if (dVar.u()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd m58245x4ee17f0a2 = dVar.k0().m58245x4ee17f0a();
                if (m58245x4ee17f0a2 != null) {
                    m58245x4ee17f0a2.m61420xeb2d9731(floatValue);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFinderMiniViewHelper", "setPlaySpeed, do not have ball");
            }
        }
        yz5.a aVar = this.f217838g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        if (floatValue == 0.5f) {
            i17 = com.p314xaae8f345.mm.R.raw.f80041x58acb40d;
        } else {
            if (!(floatValue == 1.0f)) {
                if (floatValue == 1.5f) {
                    i17 = com.p314xaae8f345.mm.R.raw.f80043x58acb7ce;
                } else {
                    if (floatValue == 2.0f) {
                        i17 = com.p314xaae8f345.mm.R.raw.f80044xdb98d219;
                    }
                }
            }
            i17 = com.p314xaae8f345.mm.R.raw.f80042xdb98d218;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c15477xbd78f833.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.iqj);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(i17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c15477xbd78f833.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f567864kx3);
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setImageResource(i17);
        }
        c15477xbd78f833.Y6(floatValue);
        return jz5.f0.f384359a;
    }
}
