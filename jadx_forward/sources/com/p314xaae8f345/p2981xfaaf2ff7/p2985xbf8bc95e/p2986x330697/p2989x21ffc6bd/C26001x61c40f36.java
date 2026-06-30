package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2989x21ffc6bd;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.internal.TencentMapPro */
/* loaded from: classes13.dex */
public final class C26001x61c40f36 {

    /* renamed from: mVectorMapDelegate */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f49316x253dc0d1;

    /* renamed from: mapDestroyed */
    private boolean f49317x7f4a581d = false;

    /* renamed from: mapManager */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg f49318x38b882b1;

    /* renamed from: viewControl */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.af f49319x38256ef8;

    public C26001x61c40f36(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.af afVar) {
        this.f49318x38b882b1 = bgVar;
        this.f49319x38256ef8 = afVar;
        this.f49316x253dc0d1 = bgVar.f130438b;
    }

    /* renamed from: isLocal */
    public static final boolean m99272x7b0e8c61(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a().a(context);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.f133006a);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.b(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26));
        if (b17 == null || c17 == null) {
            return true;
        }
        boolean a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a(b17, c17);
        if (a17) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.tencentmap.mapsdk.maps.internal.TencentMapPro.1
                private static java.lang.Boolean a() {
                    try {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx dxVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx.class);
                        if (dxVar == null) {
                            dxVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx.class, new java.lang.Object[0]);
                        }
                        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36699x625df6b = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.di) dxVar.i()).m36699x625df6b(1);
                        if (m36699x625df6b != null) {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("data with response:".concat(new java.lang.String(m36699x625df6b.f16977x2eefaa, m36699x625df6b.f16974x2c0d614c)));
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("err:" + e17.getMessage());
                    }
                    return java.lang.Boolean.TRUE;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return a();
                }
            }).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE);
        }
        return a17;
    }

    /* renamed from: addIntersectionEnlargeOverlay */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26038xede03d67 m99273x89d36028(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26039x42294f37 c26039x42294f37) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.f49317x7f4a581d || (trVar = this.f49316x253dc0d1) == null || (neVar = trVar.f133806as) == null || neVar.f132039f == null) {
            return null;
        }
        return (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26038xede03d67) neVar.f132043j.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ob(c26039x42294f37));
    }

    /* renamed from: addRouteNameSegments */
    public final void m99274x93d44993(java.util.List<com.p314xaae8f345.map.lib.p495x9a09cf97.C4233x40b7049> list, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2) {
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.map.lib.p495x9a09cf97.C4233x40b7049 c4233x40b7049 : list) {
                if (c4233x40b7049 != null) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26056xa47d77b8 c26056xa47d77b8 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26056xa47d77b8();
                    c26056xa47d77b8.f49556x5a72f63 = c4233x40b7049.f49561x5a72f63;
                    c26056xa47d77b8.f49557xb29638ab = c4233x40b7049.f49562xb29638ab;
                    c26056xa47d77b8.f49558xdd45ddcb = c4233x40b7049.f49563xdd45ddcb;
                    c26056xa47d77b8.f49559x4e7c7bc4 = c4233x40b7049.f49564x4e7c7bc4;
                    arrayList.add(c26056xa47d77b8);
                }
            }
            m99275x4957c46d(arrayList, list2);
        }
    }

    /* renamed from: addSegmentsWithRouteName */
    public final void m99275x4957c46d(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26056xa47d77b8> list, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null || bgVar.f130438b == null || (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) bgVar.f130438b.e_) == null) {
            return;
        }
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> m35329x3017aa = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35329x3017aa(list2);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = c4430xc2040f9.f134045o;
        if (neVar.f132059z == null) {
            neVar.f132059z = new com.tencent.mapsdk.internal.ne.d();
        }
        com.tencent.mapsdk.internal.ne.d dVar = neVar.f132059z;
        dVar.f132071a = list;
        dVar.f132072b = m35329x3017aa;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.this.f132039f.a(list, m35329x3017aa);
    }

    /* renamed from: animateToNaviPosition */
    public final void m99276x793bd64b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null) {
            return;
        }
        bgVar.a(c26041x873d1d26, f17, f18, 0.0f, true);
    }

    /* renamed from: animateToNaviPosition2 */
    public final void m99279xae3ef347(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, float f17, float f18, float f19, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        thVar.b((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d), (int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
        thVar.a(f19);
        thVar.c(f17);
        thVar.d(f18);
        thVar.f133136a = bgVar.f130446j;
        thVar.f133166g = true;
        thVar.a(1000L);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) bgVar.f130438b.e_).y();
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) bgVar.f130438b.e_).a(thVar);
    }

    /* renamed from: calNaviLevel */
    public final float m99280x162d0f50(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, float f17, int i17, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null || c26042xcb530b7b == null) {
            return 0.0f;
        }
        int i18 = z17 ? bgVar.f130438b.H : bgVar.f130438b.f133712J;
        float f18 = !z17 ? 0.0f : f17;
        if (i18 < 0) {
            i18 = bgVar.f130438b.Z / 2;
        }
        return bgVar.a(f18, 0, 0, i17, bgVar.f130438b.f133713aa - i18, c26042xcb530b7b.f49514x9e7cbcfc, c26042xcb530b7b.f49513x1a6ba282);
    }

    /* renamed from: calNaviLevel2 */
    public final float m99281xaf74dae2(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, float f17, float f18, int i17, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null || c26041x873d1d26 == null || c26041x873d1d262 == null) {
            return 0.0f;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder builder = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder();
        builder.m99564x73c954a8(c26041x873d1d26);
        builder.m99564x73c954a8(c26041x873d1d262);
        return bgVar.a(!z17 ? 0.0f : f17, 0, 0, i17, 0, builder.m99563x59bc66e().f49514x9e7cbcfc, builder.m99563x59bc66e().f49513x1a6ba282);
    }

    /* renamed from: calNaviLevel3 */
    public final float m99282xaf74dae3(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, float f17, int i17, int i18, int i19, int i27, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null || c26041x873d1d26 == null || c26041x873d1d262 == null) {
            return 0.0f;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder builder = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder();
        builder.m99564x73c954a8(c26041x873d1d26);
        builder.m99564x73c954a8(c26041x873d1d262);
        return bgVar.a(!z17 ? 0.0f : f17, i17, i18, i19, i27, builder.m99563x59bc66e().f49514x9e7cbcfc, builder.m99563x59bc66e().f49513x1a6ba282);
    }

    /* renamed from: calculateZoomToSpanLevelAsync */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e m99283x67c1a16(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7> list, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2, int i17, int i18, int i19, int i27, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.AsyncOperateCallback<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e> asyncOperateCallback) {
        if (this.f49317x7f4a581d || this.f49318x38b882b1 == null) {
            if (asyncOperateCallback != null) {
                asyncOperateCallback.m99148x6f81ba37(null);
            }
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7 interfaceC26030xc162a7c7 : list) {
                if (interfaceC26030xc162a7c7 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez) {
                    arrayList.add((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez) interfaceC26030xc162a7c7);
                }
            }
        }
        return this.f49318x38b882b1.a(arrayList, list2, i17, i18, i19, i27, asyncOperateCallback);
    }

    /* renamed from: clearRouteNameSegments */
    public final void m99284xdf959967() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null || bgVar.f130438b == null || (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) bgVar.f130438b.e_) == null) {
            return;
        }
        c4430xc2040f9.mo36990xdf959967();
    }

    /* renamed from: isNaviStateEnabled */
    public final boolean m99285x46e08d80() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null) {
            return false;
        }
        return bgVar.x();
    }

    /* renamed from: moveToNavPosition */
    public final void m99286xbcb591a0(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null) {
            return;
        }
        bgVar.a(c25950xd5528c6e);
        if (c26041x873d1d26 != null) {
            m99288x47b1ed16((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d), (int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
        }
    }

    /* renamed from: onDestroy */
    public final void m99287xac79a11b() {
        this.f49317x7f4a581d = true;
    }

    /* renamed from: setNavCenter */
    public final void m99288x47b1ed16(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.af afVar = this.f49319x38256ef8;
        if (afVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.al alVar = afVar.f130391a;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> C = alVar == null ? null : alVar.C();
        if (C != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar = C.get();
            if (buVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud) buVar).m37059xdb90c108().b(i17, i18);
            }
        }
    }

    /* renamed from: setNaviFixingProportion */
    public final void m99289x11c0a36f(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null || bgVar.f130438b == null) {
            return;
        }
        if (f17 < 0.0f) {
            f17 = 0.0f;
        } else if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f18 < 0.0f) {
            f18 = 0.0f;
        } else if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        bgVar.f130438b.c((int) (bgVar.f130438b.Z * f17), (int) (bgVar.f130438b.f133713aa * f18));
        bgVar.f130438b.K = f17;
        bgVar.f130438b.L = f18;
    }

    /* renamed from: setNaviFixingProportion2D */
    public final void m99290xa4258a01(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null || bgVar.f130438b == null) {
            return;
        }
        if (f17 < 0.0f) {
            f17 = 0.0f;
        } else if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f18 < 0.0f) {
            f18 = 0.0f;
        } else if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        bgVar.f130438b.d((int) (bgVar.f130438b.Z * f17), (int) (bgVar.f130438b.f133713aa * f18));
        bgVar.f130438b.M = f17;
        bgVar.f130438b.N = f18;
    }

    /* renamed from: setNaviStateEnabled */
    public final void m99291xe8ccccb8(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null) {
            return;
        }
        bgVar.h(z17);
    }

    /* renamed from: setOnCameraChangeListener */
    public final void m99292xee69e68a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCameraChangeListener onCameraChangeListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null || bgVar.f130438b == null) {
            return;
        }
        bgVar.f130438b.C = onCameraChangeListener;
    }

    /* renamed from: setOptionalResourcePath */
    public final void m99293x4b536055(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om omVar;
        if (this.f49317x7f4a581d || (trVar = this.f49316x253dc0d1) == null || (neVar = trVar.f133806as) == null || (omVar = neVar.f132057x) == null) {
            return;
        }
        omVar.a(str);
    }

    /* renamed from: animateToNaviPosition */
    public final void m99277x793bd64b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, float f17, float f18, float f19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null) {
            return;
        }
        bgVar.a(c26041x873d1d26, f17, f18, f19, true);
    }

    /* renamed from: animateToNaviPosition */
    public final void m99278x793bd64b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, float f17, float f18, float f19, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        if (this.f49317x7f4a581d || (bgVar = this.f49318x38b882b1) == null) {
            return;
        }
        bgVar.a(c26041x873d1d26, f17, f18, f19, z17);
    }
}
