package op4;

/* loaded from: classes10.dex */
public class h extends op4.k {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce f428814e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f428815f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f428816g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f428817h;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f428814e = pluginLayout;
        this.f428815f = "";
    }

    @Override // op4.k
    public void a(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef95 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95();
        this.f428824d = c6586xa056ef95;
        c6586xa056ef95.p("101");
    }

    @Override // op4.k
    public java.lang.String g() {
        return "21875";
    }

    public final void j(boolean z17) {
        jx3.a aVar = this.f428824d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef95 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) aVar;
        if (c6586xa056ef95 != null) {
            c6586xa056ef95.f139362g = 1;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef952 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) aVar;
        if (c6586xa056ef952 != null) {
            c6586xa056ef952.r(java.lang.String.valueOf(c01.id.c()));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef953 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) this.f428824d;
        if (c6586xa056ef953 != null) {
            c6586xa056ef953.q("like_fav_feed_music");
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef954 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) this.f428824d;
        if (c6586xa056ef954 != null) {
            cl0.g gVar = new cl0.g();
            gVar.o("if_show_reddot", z17 ? 1 : 0);
            java.lang.String gVar2 = gVar.h("editId", this.f428815f).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            c6586xa056ef954.t(r26.i0.t(gVar2, ",", ";", false));
        }
        e();
    }

    public final void l(boolean z17) {
        jx3.a aVar = this.f428824d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef95 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) aVar;
        if (c6586xa056ef95 != null) {
            c6586xa056ef95.f139362g = 0;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef952 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) aVar;
        if (c6586xa056ef952 != null) {
            c6586xa056ef952.r(java.lang.String.valueOf(c01.id.c()));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef953 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) this.f428824d;
        if (c6586xa056ef953 != null) {
            c6586xa056ef953.q("like_fav_feed_music");
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef954 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) this.f428824d;
        if (c6586xa056ef954 != null) {
            cl0.g gVar = new cl0.g();
            gVar.o("if_show_reddot", z17 ? 1 : 0);
            java.lang.String gVar2 = gVar.h("editId", this.f428815f).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            c6586xa056ef954.t(r26.i0.t(gVar2, ",", ";", false));
        }
        e();
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce = this.f428814e;
        if (ordinal != 48) {
            if (ordinal == 50) {
                yo4.p pVar = (yo4.p) abstractC17010x26b2d1ce.j(yo4.p.class);
                if (pVar == null || !pVar.A().mo68189xf8d57ddb()) {
                    return;
                }
                j(pVar.A().getF237509p1());
                return;
            }
            if (ordinal == 69 || ordinal == 164) {
                if (status == ju3.c0.E1) {
                    this.f428816g = true;
                    this.f428817h = true;
                }
                yo4.p pVar2 = (yo4.p) abstractC17010x26b2d1ce.j(yo4.p.class);
                if (pVar2 != null) {
                    int i17 = pVar2.f545819q.getVisibility() != 0 ? 0 : 1;
                    if (this.f428816g) {
                        this.f428816g = false;
                        return;
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef95 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) this.f428824d;
                    if (c6586xa056ef95 != null) {
                        c6586xa056ef95.f139362g = 0;
                    }
                    if (c6586xa056ef95 != null) {
                        c6586xa056ef95.r(java.lang.String.valueOf(c01.id.c()));
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef952 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) this.f428824d;
                    if (c6586xa056ef952 != null) {
                        c6586xa056ef952.q("music_use");
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef953 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) this.f428824d;
                    if (c6586xa056ef953 != null) {
                        cl0.g gVar = new cl0.g();
                        gVar.o("tips", i17);
                        java.lang.String gVar2 = gVar.h("editId", this.f428815f).toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                        c6586xa056ef953.t(r26.i0.t(gVar2, ",", ";", false));
                    }
                    e();
                    return;
                }
                return;
            }
            if (ordinal != 97 && ordinal != 98) {
                return;
            }
        }
        yo4.p pVar3 = (yo4.p) abstractC17010x26b2d1ce.j(yo4.p.class);
        if (pVar3 != null) {
            if (status == ju3.c0.S) {
                boolean z17 = pVar3.f545827y;
                if (this.f428817h) {
                    this.f428817h = false;
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef954 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) this.f428824d;
                    if (c6586xa056ef954 != null) {
                        c6586xa056ef954.f139362g = 1;
                    }
                    if (c6586xa056ef954 != null) {
                        c6586xa056ef954.r(java.lang.String.valueOf(c01.id.c()));
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef955 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) this.f428824d;
                    if (c6586xa056ef955 != null) {
                        c6586xa056ef955.q("music_use");
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef956 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95) this.f428824d;
                    if (c6586xa056ef956 != null) {
                        cl0.g gVar3 = new cl0.g();
                        gVar3.o("tips", z17 ? 1 : 0);
                        java.lang.String gVar4 = gVar3.h("editId", this.f428815f).toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
                        c6586xa056ef956.t(r26.i0.t(gVar4, ",", ";", false));
                    }
                    e();
                }
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.v0.a()) {
                l(pVar3.A().mo68188x7857c7a5());
            }
        }
    }
}
