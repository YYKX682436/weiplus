package nf2;

/* loaded from: classes10.dex */
public final class t implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.w f418331d;

    public t(nf2.w wVar) {
        this.f418331d = wVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.g94 g94Var = (r45.g94) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (g94Var != null) {
            nf2.w wVar = this.f418331d;
            wVar.getClass();
            boolean z17 = g94Var.f456555m;
            if (z17 && wVar.f418346r) {
                ko0.d0.f391373a.a("handleVisitorSEIData_collapse_event", 5, "FinderLiveLyricsController", "handleVisitorSEIData: sei is_collapsed=true");
                ko0.d0.f391374b.remove("handleVisitorSEIData_expand_event");
                nf2.d1 d1Var = wVar.f418341m;
                if (d1Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee3 = d1Var.f418231s;
                    if (c14199x90952ee3 != null) {
                        c14199x90952ee3.i();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "stopRender");
                }
                wVar.f418346r = false;
                wVar.b7();
            } else {
                if (!wVar.f418346r && !z17) {
                    ko0.d0.f391373a.a("handleVisitorSEIData_expand_event", 5, "FinderLiveLyricsController", "handleVisitorSEIData: sei is_collapsed=false, but not rendering");
                    ko0.d0.f391374b.remove("handleVisitorSEIData_collapse_event");
                    wVar.a7((mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) wVar.Z6().f410784s).mo144003x754a37bb());
                }
                nf2.d1 d1Var2 = wVar.f418341m;
                if (d1Var2 != null) {
                    int i17 = g94Var.f456551f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee32 = d1Var2.f418231s;
                    if (c14199x90952ee32 != null) {
                        c14199x90952ee32.f193128i = i17;
                    }
                }
                r45.e94 e94Var = g94Var.f456552g;
                int i18 = e94Var != null ? e94Var.f454695d : 50;
                int i19 = e94Var != null ? e94Var.f454696e : 18;
                if (i18 != wVar.f418347s || i19 != wVar.f418348t) {
                    wVar.f418347s = i18;
                    wVar.f418348t = i19;
                    if (d1Var2 != null) {
                        d1Var2.l(i18 / 100.0f, i19 / 100.0f);
                    }
                }
                r45.f94 f94Var = g94Var.f456553h;
                if (f94Var != null) {
                    boolean z18 = f94Var.f455645d;
                    java.lang.String str = f94Var.f455646e;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.valueOf(z18), wVar.f418349u) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, wVar.f418350v)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsController", "updateVisitorStyle: isVertical=" + z18 + ", colorRgba=" + str);
                        wVar.f418349u = java.lang.Boolean.valueOf(z18);
                        wVar.f418350v = str;
                        nf2.f1 a17 = nf2.f1.a(wVar.f418351w, 0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, z18 ? nf2.a.f418182f : nf2.a.f418181e, z18 ? nf2.k1.f418301e : nf2.k1.f418300d, null, 0L, wVar.e7(str), 106495, null);
                        wVar.f418351w = a17;
                        nf2.d1 d1Var3 = wVar.f418341m;
                        if (d1Var3 != null) {
                            d1Var3.j(a17);
                        }
                    }
                }
            }
        }
        return f0Var;
    }
}
