package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class a2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gl {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1 f206471a = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206992s;

    /* renamed from: b, reason: collision with root package name */
    public boolean f206472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f206473c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 f206474d;

    public a2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var) {
        this.f206473c = activityC0065xcd7aa112;
        this.f206474d = l3Var;
    }

    public void a(java.lang.String lifecycle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "lifecycle");
        int hashCode = lifecycle.hashCode();
        boolean z17 = false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 finder = this.f206473c;
        switch (hashCode) {
            case -1340212393:
                if (lifecycle.equals("onPause")) {
                    this.f206471a = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206992s;
                    this.f206472b = false;
                    return;
                }
                return;
            case -918269635:
                if (lifecycle.equals("onNewIntent")) {
                    this.f206471a = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206994u;
                    return;
                }
                return;
            case 94292548:
                if (lifecycle.equals("onScreenOff")) {
                    this.f206471a = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206995v;
                    return;
                }
                return;
            case 1046116283:
                if (lifecycle.equals("onCreate")) {
                    this.f206471a = (finder.getIntent().getFlags() & 1048576) > 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206992s : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206993t;
                    return;
                }
                return;
            case 1463983852:
                if (lifecycle.equals("onResume") && !this.f206472b) {
                    this.f206472b = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = this.f206474d;
                    int size = l3Var.f207665r.size();
                    java.util.Set set = l3Var.f207665r;
                    if (size == 2) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(set, "<get-foregroundFinderActivity>(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : set) {
                            if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15050x22d18475) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            z17 = true;
                        }
                    }
                    if (set.size() == 1 || z17 || (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(finder.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1.class) && this.f206471a == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206994u)) {
                        if (z17) {
                            this.f206471a = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206996w;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b2 b2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b2.f206498a;
                        b2Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206991r);
                        b2Var.a(this.f206471a);
                        if (this.f206471a == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206992s) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finder, "finder");
                            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).mj(3, null);
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(finder, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
                            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209176ce).mo141623x754a37bb()).r()).intValue() == 1) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskReporter", "switch multi task sessionId " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(finder).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216918q);
                                pm0.v.V(50L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z1(finder));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
