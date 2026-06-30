package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/slideprofile/FinderHomeSlideProfileUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC15139x91efb0f1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69 {

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f211357t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f211358u;

    /* renamed from: v, reason: collision with root package name */
    public int f211359v = -1;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f211360w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f211361x;

    public static final void c7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 abstractActivityC15139x91efb0f1, int i17) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        if (abstractActivityC15139x91efb0f1.g7() && i17 != abstractActivityC15139x91efb0f1.f211359v) {
            if (i17 == 0) {
                com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = abstractActivityC15139x91efb0f1.f211360w;
                if (c22584xf7d97e83 != null && (abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p) != null) {
                    pf5.z zVar = pf5.z.f435481a;
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a(abstractActivityC22579xbed01a37).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).f205647q == 0) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a(abstractActivityC22579xbed01a37).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).f205647q = 2;
                    }
                }
                abstractActivityC15139x91efb0f1.i7(true);
                abstractActivityC15139x91efb0f1.h7(false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "total focus to timeline");
            } else if (i17 == 1) {
                abstractActivityC15139x91efb0f1.i7(false);
                abstractActivityC15139x91efb0f1.h7(true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "start focus to profile");
            }
            abstractActivityC15139x91efb0f1.f211359v = i17;
        }
    }

    public static com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 e7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 abstractActivityC15139x91efb0f1, java.lang.String str, android.content.Intent intent, boolean z17, boolean z18, java.lang.Class cls, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProfileVASFragment");
        }
        if ((i17 & 2) != 0) {
            intent = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        if ((i17 & 16) != 0) {
            cls = com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83.class;
        }
        abstractActivityC15139x91efb0f1.getClass();
        java.lang.Class<?> cls2 = java.lang.Class.forName(str);
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39697xfa441f0a, cls2);
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39699xc6812768, true);
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39701x5f6db9dd, false);
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39698x83153425, z17);
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39704x5734e7fe, z18);
        if (intent.getComponent() == null) {
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, cls2);
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 a17 = com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83.Q.a(intent, cls);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "newInstance(...)");
        return a17;
    }

    public final void d7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "bindCurrentFeed: " + item.m59251x5db1b11());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.C15140xe7b62f62 c15140xe7b62f62 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.C15140xe7b62f62) findViewById(com.p314xaae8f345.mm.R.id.u2u);
        if (c15140xe7b62f62 != null) {
            c15140xe7b62f62.m60966xbe67ec43(true);
        }
        if (this.f211361x) {
            j7(true);
            this.f211361x = false;
        }
        this.f211357t = item;
        if (this.f211360w != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "bindCurrentFeed, reset profileFragment");
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f211360w;
            if (c22584xf7d97e83 != null) {
                p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
                m7630xb2c12e75.j(c22584xf7d97e83);
                m7630xb2c12e75.e();
            }
            this.f211360w = null;
            this.f211358u = false;
        }
        j7(false);
    }

    public final boolean f7() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.C15140xe7b62f62 c15140xe7b62f62 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.C15140xe7b62f62) findViewById(com.p314xaae8f345.mm.R.id.u2u);
        if (this.f211359v != 1 || c15140xe7b62f62 == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f211360w;
        if (c22584xf7d97e83 != null && (abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) pf5.z.f435481a.a(abstractActivityC22579xbed01a37).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).f205647q = 4;
        }
        c15140xe7b62f62.e();
        return true;
    }

    public final boolean g7() {
        int d17 = getD();
        return d17 == 20 || d17 == 25 || d17 == 172 || d17 == 38;
    }

    public final void h7(boolean z17) {
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = m78735x28280f95();
            if (m78735x28280f95 != null) {
                m78735x28280f95.m81450x8e764904(true);
            }
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f211360w;
            if (c22584xf7d97e83 != null) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (c22584xf7d97e83.f292666e != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c22584xf7d97e83.getF292653o(), "[onViewUnFocused] " + c22584xf7d97e83.getClass().getSimpleName() + '@' + c22584xf7d97e83.m7479x8cdac1b());
                    java.util.Iterator it = c22584xf7d97e83.f292667f.iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo58437xaa858cb6();
                    }
                    c22584xf7d97e83.f292666e = 2;
                    return;
                }
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "try resume");
        if (this.f211358u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "resume, alreadyBindFragment");
        } else {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f211360w;
            if (c22584xf7d97e832 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "resume, profileFragment is null");
                this.f211361x = true;
            } else {
                p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
                m7630xb2c12e75.m(c22584xf7d97e832, p012xc85e97e9.p093xedfae76a.n.RESUMED);
                m7630xb2c12e75.e();
                this.f211358u = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "resume success");
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f952 = m78735x28280f95();
        if (m78735x28280f952 != null) {
            m78735x28280f952.m81450x8e764904(false);
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e833 = this.f211360w;
        if (c22584xf7d97e833 != null) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (c22584xf7d97e833.f292666e != 1) {
                pk5.a aVar = new pk5.a(c22584xf7d97e833);
                if (c22584xf7d97e833.m7491x1edc854d()) {
                    aVar.run();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c22584xf7d97e833.getF292653o(), "[onUserVisibleFocused] wait to fragment resume.");
                    c22584xf7d97e833.f292672n.add(aVar);
                }
                c22584xf7d97e833.f292666e = 1;
            }
        }
    }

    public abstract void i7(boolean z17);

    public final void j7(boolean z17) {
        r45.vx0 vx0Var;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar;
        java.lang.String m76829x97edf6c0;
        java.lang.String str3;
        java.lang.String m75945x2fec8307;
        java.lang.String X6;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "tryInitProfileFragment, directCreate: " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f211357t;
        if (c14994x9b99c079 != null) {
            boolean z18 = c14994x9b99c079.m59211x37f6d02b() != null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "getBizProfileFragment");
                r45.xk m59211x37f6d02b = c14994x9b99c079.m59211x37f6d02b();
                if (m59211x37f6d02b == null || (str = m59211x37f6d02b.m75945x2fec8307(0)) == null) {
                    str = "";
                }
                android.content.Intent intent = new android.content.Intent();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar2, mo55332x76847179, intent, c14994x9b99c079.m59251x5db1b11(), null, 0, 1, false, 0, c14994x9b99c079.m59229xb5af1dd5(), 192, null);
                intent.putExtra("Contact_User", str);
                intent.putExtra("Contact_Scene", 213);
                intent.putExtra("biz_profile_enter_from_finder", true);
                intent.putExtra("force_get_contact", true);
                intent.putExtra("key_use_new_contact_profile", true);
                intent.putExtra("finder_feed_id", c14994x9b99c079.m59251x5db1b11());
                intent.putExtra("biz_profile_tab_type", 1);
                java.lang.String m76829x97edf6c02 = c14994x9b99c079.getFeedObject().m76829x97edf6c0();
                if (m76829x97edf6c02 == null || m76829x97edf6c02.length() == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
                    java.lang.String m59229xb5af1dd5 = c14994x9b99c079.m59229xb5af1dd5();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
                    str2 = "";
                    iyVar = iyVar2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(mo55332x768471792);
                    m76829x97edf6c0 = o3Var.ek(m59251x5db1b11, m59229xb5af1dd5, e17 != null ? e17.f216913n : 0);
                } else {
                    str2 = "";
                    iyVar = iyVar2;
                    m76829x97edf6c0 = c14994x9b99c079.getFeedObject().m76829x97edf6c0();
                }
                intent.putExtra("Contact_Scene_Note", m76829x97edf6c0);
                intent.putExtra("finder_from_feed_id", c14994x9b99c079.getFeedObject().m76784x5db1b11());
                intent.putExtra("finder_from_feed_dup_flag", c14994x9b99c079.m59229xb5af1dd5());
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471793, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(mo55332x768471793);
                intent.putExtra("finder_from_feed_comment_scene", e18 != null ? e18.f216913n : 0);
                intent.putExtra("finder_from_feed_type", c14994x9b99c079.m59311x25315bf4() ? 1 : 2);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471794 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471794, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(mo55332x768471794);
                r45.qt2 V6 = e19 != null ? e19.V6() : null;
                boolean booleanExtra = getIntent().getBooleanExtra("is_from_ad", false);
                intent.putExtra("key_is_from_slide", true);
                if (booleanExtra) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471795 = mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471795, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(mo55332x768471795);
                    if (e27 != null && (X6 = e27.X6()) != null) {
                        try {
                            java.lang.String optString = new org.json.JSONObject(X6).optString("sns_ad");
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                jSONObject.put("adReportInfo", optString);
                                jSONObject.put("commentscene", V6 != null ? V6.m75939xb282bd08(5) : 0);
                                if (V6 == null || (str4 = V6.m75945x2fec8307(2)) == null) {
                                    str4 = str2;
                                }
                                jSONObject.put("clicktabcontextid", str4);
                                if (V6 == null || (str5 = V6.m75945x2fec8307(1)) == null) {
                                    str5 = str2;
                                }
                                jSONObject.put("findercontextid", str5);
                                jSONObject.put("feedid", pm0.v.u(c14994x9b99c079.m59251x5db1b11()));
                                java.lang.String jSONObject2 = jSONObject.toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                                intent.putExtra("Contact_Finder_Buffer", r26.i0.t(jSONObject2, ",", ";", false));
                            }
                        } catch (java.lang.Exception unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderProfileUtils", "jumpBizProfile parse ad info");
                        }
                    }
                } else {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("commentscene", V6 != null ? V6.m75939xb282bd08(5) : 0);
                    if (V6 == null || (str3 = V6.m75945x2fec8307(2)) == null) {
                        str3 = str2;
                    }
                    jSONObject3.put("clicktabcontextid", str3);
                    jSONObject3.put("findercontextid", (V6 == null || (m75945x2fec8307 = V6.m75945x2fec8307(1)) == null) ? str2 : m75945x2fec8307);
                    jSONObject3.put("feedid", pm0.v.u(c14994x9b99c079.m59251x5db1b11()));
                    java.lang.String jSONObject4 = jSONObject3.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                    intent.putExtra("Contact_Finder_Buffer", r26.i0.t(jSONObject4, ",", ";", false));
                }
                this.f211360w = e7(this, "com.tencent.mm.plugin.profile.ui.ContactInfoUI", intent, false, false, null, 28, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "getFinderProfileFragment");
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471796 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471796, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e28 = iyVar2.e(mo55332x768471796);
                int i17 = e28 != null ? e28.f216913n : 0;
                android.content.Intent intent2 = new android.content.Intent();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471797 = mo55332x76847179();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo55332x768471797 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo55332x768471797 : null;
                if (abstractActivityC21394xb3d2c0cf != null) {
                    intent2.putExtra("key_to_user_name", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("key_to_user_name"));
                    intent2.putExtra("from_user", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("from_user"));
                    intent2.putExtra("key_from_user_name", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("key_from_user_name"));
                    intent2.putExtra("report_scene", abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("report_scene", 0));
                }
                intent2.putExtra("finder_username", c14994x9b99c079.m59299x6bf53a6c());
                intent2.putExtra("finder_read_feed_id", c14994x9b99c079.m59251x5db1b11());
                intent2.putExtra("finder_read_feed_dup_flag", c14994x9b99c079.m59229xb5af1dd5());
                intent2.putExtra("finder_from_feed_id", c14994x9b99c079.m59251x5db1b11());
                intent2.putExtra("finder_from_feed_dup_flag", c14994x9b99c079.m59229xb5af1dd5());
                intent2.putExtra("finder_from_feed_comment_scene", i17);
                intent2.putExtra("finder_from_feed_type", c14994x9b99c079.m59311x25315bf4() ? 1 : 2);
                r45.dm2 m76806xdef68064 = c14994x9b99c079.getFeedObject().m76806xdef68064();
                intent2.putExtra("key_finder_collection_id", (m76806xdef68064 == null || (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) == null) ? null : java.lang.Long.valueOf(vx0Var.m75942xfb822ef2(0)));
                intent2.putExtra("key_is_from_slide", true);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471798 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471798, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar2, mo55332x768471798, intent2, c14994x9b99c079.m59251x5db1b11(), null, 0, 1, false, 0, c14994x9b99c079.m59229xb5af1dd5(), 192, null);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471799 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471799, "getContext(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) pf5.z.f435481a.a(mo55332x768471799).c(zy2.v9.class))).S6(c14994x9b99c079.m59251x5db1b11(), intent2);
                if (!(mo55332x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6) && !(mo55332x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15075xf41a1c3c) && !(mo55332x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e)) {
                    intent2.putExtra("KEY_FROM_TIMELINE", true);
                }
                this.f211360w = e7(this, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857.class.getName(), intent2, false, false, null, 28, null);
            }
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f211360w;
            if (c22584xf7d97e83 != null) {
                if (z17 || this.f211359v == 1) {
                    p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
                    m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.l8l, c22584xf7d97e83, null);
                    m7630xb2c12e75.e();
                } else {
                    p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e752 = mo7595x9cdc264().m7630xb2c12e75();
                    m7630xb2c12e752.k(com.p314xaae8f345.mm.R.id.l8l, c22584xf7d97e83, null);
                    m7630xb2c12e752.m(c22584xf7d97e83, p012xc85e97e9.p093xedfae76a.n.CREATED);
                    m7630xb2c12e752.e();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (f7()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fc2.c n17;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.C15140xe7b62f62 c15140xe7b62f62 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.C15140xe7b62f62) findViewById(com.p314xaae8f345.mm.R.id.u2u);
        if (c15140xe7b62f62 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Qb).mo141623x754a37bb()).r()).booleanValue()) {
            c15140xe7b62f62.m60967x8d8096d1(new av2.a(this));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo55332x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
                return;
            }
            n17.a(new av2.c(this));
        }
    }
}
