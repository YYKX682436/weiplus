package kp3;

/* loaded from: classes14.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f392550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Result f392551e;

    public o(kp3.x xVar, com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Result result) {
        this.f392550d = xVar;
        this.f392551e = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int i17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f392550d.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        kp3.p0 p0Var = (kp3.p0) zVar.a(activity).a(kp3.p0.class);
        com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Result result = this.f392551e;
        int i18 = result.f61441xb1ca1d28;
        int i19 = result.f61439xa12fa8fa;
        boolean z17 = result.f61435x4e2913f8;
        p0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] errorCode： " + i18 + " ，targetHandType: " + i19 + " (left:0、right：1), isFirstSDKVerifyFrame ： " + z17 + ' ');
        if (p0Var.f392563p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] isFirtVerify");
            p0Var.f392563p = false;
            p0Var.f392565r.f392508a = i18;
            p0Var.O6(p0Var.Q6(), "palm_verify_circle_begin.pag", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[setEnterAnimation]");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(p0Var.Q6(), "alpha", 0.0f, 1.0f);
            if (ofFloat != null) {
                ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
                str = "tipsErrorIv";
                ofFloat.setDuration(200L);
                ofFloat.addListener(new kp3.j0(p0Var));
                ofFloat.start();
            } else {
                str = "tipsErrorIv";
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            kp3.k0 k0Var = new kp3.k0(p0Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(k0Var, 300L, false);
            p0Var.O6(p0Var.S6(), "palm_verify_tips_enter.pag", true);
            android.widget.ImageView imageView = p0Var.f392558h;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                throw null;
            }
            imageView.setVisibility(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.C16782x4f8f0be0 R6 = p0Var.R6();
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.C16782x4f8f0be0.f234415p;
            R6.a(false, true);
        } else {
            str = "tipsErrorIv";
        }
        if (!p0Var.f392566s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] finishAnimation: no, return ");
            return;
        }
        int i28 = i19 != com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.HandType.f61425x19d1382a ? i19 : p0Var.f392565r.f392509b;
        if (p0Var.f392565r.f392509b != i28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] do change hand type");
            p0Var.f392565r.f392509b = i28;
            if (i19 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.HandType.f61424x4a5c9fc) {
                android.widget.ImageView imageView2 = p0Var.f392558h;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                    throw null;
                }
                imageView2.setScaleX(1.0f);
                p0Var.S6().setScaleX(1.0f);
            } else if (i19 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.HandType.f61423x239807) {
                android.widget.ImageView imageView3 = p0Var.f392558h;
                if (imageView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                    throw null;
                }
                imageView3.setScaleX(-1.0f);
                p0Var.S6().setScaleX(-1.0f);
            }
        }
        kp3.e0 e0Var = p0Var.f392565r;
        if (e0Var.f392508a != i18 || p0Var.f392564q) {
            e0Var.f392508a = i18;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = p0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.palm.ui.PalmPrintMainUI");
            java.lang.Integer num = ((com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868) m158354x19263085).f234410m;
            boolean z18 = num != null && num.intValue() == 2;
            android.widget.TextView T6 = p0Var.T6();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = p0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((kp3.x) zVar.a(activity2).a(kp3.x.class)).f392582e.getClass();
            android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
            if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61486x5d02d2e) {
                i17 = z18 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574212oc1 : com.p314xaae8f345.mm.R.C30867xcad56011.m4u;
            } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61443xc8b720cb) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4i;
            } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61445xbc700062) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4t;
            } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61442x4d823377) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4c;
            } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61444xd0e546c0) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4s;
            } else {
                if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61456xe4291931 || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61465x92ca5db4) {
                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4g;
                } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61460x7364ae04) {
                    i17 = z18 ? com.p314xaae8f345.mm.R.C30867xcad56011.obx : com.p314xaae8f345.mm.R.C30867xcad56011.m4j;
                } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61461xf987739f) {
                    i17 = z18 ? com.p314xaae8f345.mm.R.C30867xcad56011.oby : com.p314xaae8f345.mm.R.C30867xcad56011.m4k;
                } else {
                    if ((((((i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61457xd495e435 || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61478x36bf4712) || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61474x11297e20) || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61468x55b2ec2d) || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61484x3d6fe61e) || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61482x17a23135) || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61485x17f6e55f) {
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f574209mc3;
                    } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61459xea2a413b) {
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.muu;
                    } else {
                        if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61451xfa14969b || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61467xab67dc9) {
                            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f574208mc2;
                        } else {
                            if ((i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61449x4c3c0fb4 || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61448x9cf1ecb4) || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61450xc3ba4fb) {
                                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.muw;
                            } else {
                                if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61472xcb9798c9 || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61483x9973e228) {
                                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mc7;
                                } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61452xfa77abc0) {
                                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4d;
                                } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61454x2b6e07e) {
                                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4e;
                                } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61455x143ca7a1) {
                                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4f;
                                } else {
                                    if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61480xfca437cd || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61477x87ba27b9) {
                                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4r;
                                    } else {
                                        if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61469x63d672bf || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61475x1740d91e) {
                                            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f574210mc5;
                                        } else {
                                            if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61476x7f50de7d || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61479x61f717c8) {
                                                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4q;
                                            } else {
                                                if (((i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61481x63daf259 || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61470xe946c2da) || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61473x17315ef3) || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61453x941c8022) {
                                                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4o;
                                                } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61471x99231c8) {
                                                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mc6;
                                                } else {
                                                    if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61458xe9968eee || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61466x252bd9f1) {
                                                        if (i28 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.HandType.f61423x239807) {
                                                            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.muv;
                                                        } else if (i28 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.HandType.f61424x4a5c9fc) {
                                                            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.muz;
                                                        }
                                                    }
                                                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.m4n;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            java.lang.String string = resources.getString(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            T6.setText(string);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] do change tips： " + ((java.lang.Object) p0Var.T6().getText()));
            if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61458xe9968eee || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61466x252bd9f1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] not found hand，firstHandleErrorCode ：" + p0Var.f392564q);
                if (!p0Var.f392564q) {
                    p0Var.Q6().n();
                    p0Var.Q6().setVisibility(8);
                    p0Var.O6(p0Var.S6(), "palm_verify_tips_enter.pag", true);
                    android.widget.ImageView imageView4 = p0Var.f392558h;
                    if (imageView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                        throw null;
                    }
                    imageView4.setVisibility(4);
                    p0Var.R6().a(true, false);
                }
            } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61486x5d02d2e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] verify success");
                p0Var.Q6().setVisibility(0);
                p0Var.O6(p0Var.Q6(), "palm_verify_circle_end.pag", true);
                android.widget.ImageView imageView5 = p0Var.f392558h;
                if (imageView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                    throw null;
                }
                imageView5.setVisibility(4);
                p0Var.R6().a(true, true);
                p0Var.S6().n();
                p0Var.S6().setVisibility(4);
                android.widget.ImageView imageView6 = p0Var.f392558h;
                if (imageView6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                    throw null;
                }
                imageView6.setVisibility(4);
                android.widget.ProgressBar progressBar = p0Var.f392557g;
                if (progressBar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ed3.a.f69666x24728b);
                    throw null;
                }
                progressBar.setVisibility(0);
                p0Var.P6("heavy");
                ((ku5.t0) ku5.t0.f394148d).g(new kp3.f0(p0Var, com.p314xaae8f345.mm.R.C30867xcad56011.m4v));
            } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61442x4d823377) {
                p0Var.P6("light");
                ((ku5.t0) ku5.t0.f394148d).g(new kp3.f0(p0Var, com.p314xaae8f345.mm.R.C30867xcad56011.hpq));
                p0Var.R6().a(true, true);
                p0Var.Q6().n();
                p0Var.Q6().setVisibility(8);
                android.widget.ImageView imageView7 = p0Var.f392558h;
                if (imageView7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                    throw null;
                }
                imageView7.setVisibility(4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] verify action： close");
                p0Var.O6(p0Var.S6(), "palm_verify_tips_close.pag", true);
            } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61444xd0e546c0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] keep action ");
                p0Var.R6().a(true, true);
                android.widget.ImageView imageView8 = p0Var.f392558h;
                if (imageView8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                    throw null;
                }
                imageView8.setVisibility(4);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] verify error");
                if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61455x143ca7a1) {
                    p0Var.O6(p0Var.S6(), "palm_verify_tips_move_rotate.pag", true);
                    android.widget.ImageView imageView9 = p0Var.f392558h;
                    if (imageView9 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                        throw null;
                    }
                    imageView9.setVisibility(4);
                } else if (i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61448x9cf1ecb4 || i18 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61474x11297e20) {
                    p0Var.O6(p0Var.S6(), "palm_verify_tips_lean_backward.pag", true);
                    android.widget.ImageView imageView10 = p0Var.f392558h;
                    if (imageView10 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                        throw null;
                    }
                    imageView10.setVisibility(4);
                } else {
                    p0Var.S6().n();
                    p0Var.S6().setVisibility(8);
                    android.widget.ImageView imageView11 = p0Var.f392558h;
                    if (imageView11 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                        throw null;
                    }
                    imageView11.setVisibility(0);
                }
                p0Var.Q6().n();
                p0Var.Q6().setVisibility(8);
                p0Var.R6().a(true, false);
            }
            p0Var.f392564q = false;
        }
    }
}
