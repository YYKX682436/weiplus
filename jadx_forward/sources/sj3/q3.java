package sj3;

/* loaded from: classes14.dex */
public final class q3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 {

    /* renamed from: h, reason: collision with root package name */
    public final sj3.x1 f490242h;

    /* renamed from: i, reason: collision with root package name */
    public final sj3.u1 f490243i;

    /* renamed from: m, reason: collision with root package name */
    public final sj3.n1 f490244m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f490245n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f490246o;

    /* renamed from: p, reason: collision with root package name */
    public final bj3.b f490247p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c3e, (android.view.ViewGroup) this, false);
        addView(inflate);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        int i17 = com.p314xaae8f345.mm.R.id.jwn;
        android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jwn);
        if (a17 != null) {
            int i18 = com.p314xaae8f345.mm.R.id.h69;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(a17, com.p314xaae8f345.mm.R.id.h69);
            if (linearLayout != null) {
                i18 = com.p314xaae8f345.mm.R.id.f567561jx4;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(a17, com.p314xaae8f345.mm.R.id.f567561jx4);
                if (c22699x3dcdb352 != null) {
                    i18 = com.p314xaae8f345.mm.R.id.f567562jx5;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(a17, com.p314xaae8f345.mm.R.id.f567562jx5);
                    if (c22699x3dcdb3522 != null) {
                        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) a17;
                        bj3.a aVar = new bj3.a(relativeLayout2, linearLayout, c22699x3dcdb352, c22699x3dcdb3522);
                        i17 = com.p314xaae8f345.mm.R.id.jxd;
                        android.view.View a18 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jxd);
                        if (a18 != null) {
                            int i19 = com.p314xaae8f345.mm.R.id.a9z;
                            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(a18, com.p314xaae8f345.mm.R.id.a9z);
                            if (imageView != null) {
                                i19 = com.p314xaae8f345.mm.R.id.a_l;
                                android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(a18, com.p314xaae8f345.mm.R.id.a_l);
                                if (relativeLayout3 != null) {
                                    i19 = com.p314xaae8f345.mm.R.id.jw7;
                                    android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) x4.b.a(a18, com.p314xaae8f345.mm.R.id.jw7);
                                    if (relativeLayout4 != null) {
                                        int i27 = com.p314xaae8f345.mm.R.id.jwk;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(a18, com.p314xaae8f345.mm.R.id.jwk);
                                        if (imageView2 != null) {
                                            i27 = com.p314xaae8f345.mm.R.id.jwl;
                                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(a18, com.p314xaae8f345.mm.R.id.jwl);
                                            if (textView != null) {
                                                i27 = com.p314xaae8f345.mm.R.id.jx6;
                                                android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(a18, com.p314xaae8f345.mm.R.id.jx6);
                                                if (imageView3 != null) {
                                                    i27 = com.p314xaae8f345.mm.R.id.jx7;
                                                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0) x4.b.a(a18, com.p314xaae8f345.mm.R.id.jx7);
                                                    if (textureViewSurfaceTextureListenerC16577xc6e62da0 != null) {
                                                        i27 = com.p314xaae8f345.mm.R.id.jxc;
                                                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(a18, com.p314xaae8f345.mm.R.id.jxc);
                                                        if (textView2 != null) {
                                                            i27 = com.p314xaae8f345.mm.R.id.p7z;
                                                            android.widget.RelativeLayout relativeLayout5 = (android.widget.RelativeLayout) x4.b.a(a18, com.p314xaae8f345.mm.R.id.p7z);
                                                            if (relativeLayout5 != null) {
                                                                i27 = com.p314xaae8f345.mm.R.id.pm8;
                                                                android.widget.ImageView imageView4 = (android.widget.ImageView) x4.b.a(a18, com.p314xaae8f345.mm.R.id.pm8);
                                                                if (imageView4 != null) {
                                                                    android.widget.RelativeLayout relativeLayout6 = (android.widget.RelativeLayout) a18;
                                                                    bj3.c cVar = new bj3.c(relativeLayout6, imageView, relativeLayout3, relativeLayout4, imageView2, textView, imageView3, textureViewSurfaceTextureListenerC16577xc6e62da0, textView2, relativeLayout5, imageView4);
                                                                    android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jxg);
                                                                    if (a19 != null) {
                                                                        android.widget.RelativeLayout relativeLayout7 = (android.widget.RelativeLayout) x4.b.a(a19, com.p314xaae8f345.mm.R.id.jw7);
                                                                        if (relativeLayout7 != null) {
                                                                            i19 = com.p314xaae8f345.mm.R.id.jwi;
                                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(a19, com.p314xaae8f345.mm.R.id.jwi);
                                                                            if (c22699x3dcdb3523 != null) {
                                                                                i19 = com.p314xaae8f345.mm.R.id.jxh;
                                                                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(a19, com.p314xaae8f345.mm.R.id.jxh);
                                                                                if (textView3 != null) {
                                                                                    i19 = com.p314xaae8f345.mm.R.id.jxi;
                                                                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(a19, com.p314xaae8f345.mm.R.id.jxi);
                                                                                    if (textView4 != null) {
                                                                                        android.widget.ImageView imageView5 = (android.widget.ImageView) x4.b.a(a19, com.p314xaae8f345.mm.R.id.pm8);
                                                                                        if (imageView5 != null) {
                                                                                            android.widget.RelativeLayout relativeLayout8 = (android.widget.RelativeLayout) a19;
                                                                                            this.f490247p = new bj3.b(relativeLayout, relativeLayout, aVar, cVar, new bj3.d(relativeLayout8, relativeLayout7, c22699x3dcdb3523, textView3, textView4, imageView5));
                                                                                            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                                                                                            android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) systemService).newWakeLock(536870922, "MicroMsg.MultiTalkSmallView");
                                                                                            this.f490245n = newWakeLock;
                                                                                            if (newWakeLock != null) {
                                                                                                yj0.a.c(newWakeLock, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView", "<init>", "(Landroid/content/Context;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                                                                                                newWakeLock.acquire();
                                                                                                yj0.a.f(newWakeLock, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView", "<init>", "(Landroid/content/Context;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                                                                                            }
                                                                                            setClipToOutline(true);
                                                                                            this.f490242h = new sj3.x1(relativeLayout8);
                                                                                            this.f490243i = new sj3.u1(relativeLayout6);
                                                                                            this.f490244m = new sj3.n1(relativeLayout2);
                                                                                            return;
                                                                                        }
                                                                                        i19 = com.p314xaae8f345.mm.R.id.pm8;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(a19.getResources().getResourceName(i19)));
                                                                    }
                                                                    i17 = com.p314xaae8f345.mm.R.id.jxg;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i19 = i27;
                                    }
                                }
                            }
                            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(a18.getResources().getResourceName(i19)));
                        }
                    }
                }
            }
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(a17.getResources().getResourceName(i18)));
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    /* renamed from: getStateContentDesc */
    private final java.lang.String m164680xb17a38cf() {
        java.lang.String string;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sj3.n1 n1Var = this.f490244m;
        java.lang.String str = null;
        if ((n1Var == null || n1Var.f490186g) ? false : true) {
            android.content.Context context = getContext();
            if (context != null) {
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kcd);
            }
            string = null;
        } else {
            android.content.Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kcc);
            }
            string = null;
        }
        sb6.append(string);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        if (n1Var != null && n1Var.f490185f) {
            android.content.Context context3 = getContext();
            if (context3 != null) {
                str = context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kcb);
            }
        } else {
            android.content.Context context4 = getContext();
            if (context4 != null) {
                str = context4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kca);
            }
        }
        sb8.append(str);
        return sb8.toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0
    public void a(java.lang.String userName, android.graphics.Bitmap bm6, int i17, int i18) {
        sj3.u1 u1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bm6, "bm");
        sj3.u1 u1Var2 = this.f490243i;
        if ((u1Var2 != null ? u1Var2.f490300o : null) != null) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userName, u1Var2 != null ? u1Var2.f490300o : null) || (u1Var = this.f490243i) == null) {
                return;
            }
            synchronized (u1Var) {
                if (!u1Var.f490298m) {
                    if (u1Var.f490289d == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkMiniVideoView", "drawVideo view is null");
                    } else if (u1Var.f490306u) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkMiniVideoView", "renderVideoBitmap img false cause isDoingAnimationChange");
                    } else if (!u1Var.a(userName, bm6, i17, i18)) {
                        u1Var.d(bm6, i17, i18);
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        android.os.SystemClock.elapsedRealtime();
                        u1Var.b(userName);
                        u1Var.f490297l = true;
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void c(boolean z17) {
        android.content.res.Resources resources;
        if (!z17) {
            super.c(false);
            return;
        }
        sj3.x1 x1Var = this.f490242h;
        if (x1Var != null) {
            android.widget.TextView textView = x1Var.f490331b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = x1Var.f490332c;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kcl);
            }
            if (textView2 != null) {
                textView2.setTextColor(android.graphics.Color.parseColor("#FA5151"));
            }
            android.content.Context context = x1Var.f490333d;
            if (textView2 != null) {
                textView2.setContentDescription((context == null || (resources = context.getResources()) == null) ? null : resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jpv));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = x1Var.f490335f;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79543xa8cb7202, android.graphics.Color.parseColor("#FA5151")));
            }
            if (c22699x3dcdb352 == null) {
                return;
            }
            c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#FA5151"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public boolean d() {
        super.d();
        sj3.x1 x1Var = this.f490242h;
        if (x1Var != null) {
            android.widget.TextView textView = x1Var.f490331b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = x1Var.f490335f;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(x1Var.f490333d, com.p314xaae8f345.mm.R.raw.f79529x884b9ec4, android.graphics.Color.parseColor("#FA5151")));
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#FA5151"));
            }
            android.widget.TextView textView2 = x1Var.f490332c;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setTextColor(android.graphics.Color.parseColor("#FA5151"));
            }
            if (textView2 != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc_);
            }
            x1Var.f490330a.clearAnimation();
        }
        sj3.u1 u1Var = this.f490243i;
        if (u1Var != null) {
            android.widget.TextView textView3 = u1Var.f490287b;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            android.view.View view = u1Var.f490294i;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onHangupHappened", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onHangupHappened", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ImageView imageView = u1Var.f490295j;
            if (imageView != null) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(u1Var.f490288c, com.p314xaae8f345.mm.R.raw.f79654xc8f97a92, android.graphics.Color.parseColor("#FFFFFF")));
            }
            android.widget.TextView textView4 = u1Var.f490296k;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            android.widget.ImageView imageView2 = u1Var.f490291f;
            if (imageView2 != null) {
                imageView2.clearAnimation();
            }
            if (textView4 != null) {
                textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc_);
            }
        }
        this.f490247p.f102692b.f102694a.setContentDescription("");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void f() {
        sj3.u1 u1Var = this.f490243i;
        if (u1Var != null) {
            android.widget.TextView textView = u1Var.f490287b;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View view = u1Var.f490294i;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onResumeIconAndTipShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onResumeIconAndTipShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        sj3.x1 x1Var = this.f490242h;
        if (x1Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = x1Var.f490335f;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(x1Var.f490333d, com.p314xaae8f345.mm.R.raw.f79543xa8cb7202, android.graphics.Color.parseColor("#07C160")));
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#07C160"));
            }
            android.widget.TextView textView2 = x1Var.f490332c;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setTextColor(android.graphics.Color.parseColor("#07C160"));
            }
            android.widget.TextView textView3 = x1Var.f490331b;
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0
    /* renamed from: getAvatarIv */
    public android.widget.ImageView getF231874g() {
        return null;
    }

    /* renamed from: getHasShowDeviceStatus */
    public final boolean m164681xe0f01d09() {
        return this.f490246o;
    }

    /* renamed from: getLastRenderSwitchTick */
    public final java.lang.Long m164682xd3f40453() {
        sj3.u1 u1Var = this.f490243i;
        if (u1Var != null) {
            return u1Var.f490302q;
        }
        return null;
    }

    /* renamed from: getRendererSpeaker */
    public final java.lang.String m164683xb5feb786() {
        java.lang.String str;
        sj3.u1 u1Var = this.f490243i;
        return (u1Var == null || (str = u1Var.f490300o) == null) ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0
    /* renamed from: getUsername */
    public java.lang.String getF231877m() {
        java.lang.String str;
        sj3.u1 u1Var = this.f490243i;
        return (u1Var == null || (str = u1Var.f490300o) == null) ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void j() {
        android.widget.ImageView imageView;
        this.f258621d = null;
        sj3.u1 u1Var = this.f490243i;
        if (u1Var != null && (imageView = u1Var.f490291f) != null) {
            imageView.clearAnimation();
        }
        sj3.x1 x1Var = this.f490242h;
        if (x1Var != null) {
            x1Var.f490330a.clearAnimation();
        }
        android.os.PowerManager.WakeLock wakeLock = this.f490245n;
        if (wakeLock != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wakeLock);
            if (wakeLock.isHeld()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkSmallView", "release waklock");
                if (wakeLock != null) {
                    yj0.a.c(wakeLock, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView", "uninit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock.release();
                    yj0.a.f(wakeLock, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView", "uninit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void k(java.lang.String str) {
        sj3.x1 x1Var = this.f490242h;
        if (x1Var != null) {
            android.widget.TextView textView = x1Var.f490331b;
            if (textView != null) {
                textView.setTextSize(1, 12.0f);
            }
            if (textView != null) {
                textView.setText(str);
            }
        }
        android.widget.RelativeLayout relativeLayout = this.f490247p.f102692b.f102694a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = getContext();
        sb6.append(context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jpr) : null);
        sb6.append(m164680xb17a38cf());
        relativeLayout.setContentDescription(sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void l(java.lang.String str) {
        sj3.x1 x1Var = this.f490242h;
        if (x1Var != null) {
            android.widget.TextView textView = x1Var.f490331b;
            if (textView != null) {
                textView.setTextSize(1, 14.0f);
            }
            if (textView != null) {
                textView.setText(str);
            }
        }
        bj3.b bVar = this.f490247p;
        bj3.c cVar = bVar.f102692b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.databinding.MultitalkVideoSmallContentViewBinding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = getContext();
        sb6.append(context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jpq) : null);
        sb6.append(m164680xb17a38cf());
        cVar.f102694a.setContentDescription(sb6.toString());
        android.widget.RelativeLayout relativeLayout = bVar.f102693c.f102695a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        android.content.Context context2 = getContext();
        sb7.append(context2 != null ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jpq) : null);
        sb7.append(m164680xb17a38cf());
        relativeLayout.setContentDescription(sb7.toString());
    }

    public final void m(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.Long m164682xd3f40453 = m164682xd3f40453();
        long longValue = m164682xd3f40453 != null ? m164682xd3f40453.longValue() : 0L;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - longValue);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MultiTalkSmallView", "changeRendererSpeaker %s", objArr);
        sj3.u1 u1Var = this.f490243i;
        if (u1Var == null) {
            return;
        }
        u1Var.g(str);
    }

    public void n() {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        sj3.x1 x1Var = this.f490242h;
        if (x1Var != null) {
            android.content.Context context = x1Var.f490333d;
            android.view.View view = x1Var.f490336g;
            if (view != null) {
                view.setBackground(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.C30861xcebc809e.b_6, (context == null || (resources2 = context.getResources()) == null) ? -1 : resources2.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560983zn)));
            }
            if (context == null || (resources = context.getResources()) == null) {
                return;
            }
            int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19);
            android.widget.TextView textView = x1Var.f490331b;
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
    }

    public final void o(java.lang.String userName) {
        sj3.u1 u1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231707q.contains(userName) || (u1Var = this.f490243i) == null) {
            return;
        }
        u1Var.c(userName);
    }

    public final void p() {
        java.lang.Integer valueOf;
        sj3.x1 x1Var = this.f490242h;
        if (!((x1Var == null || (valueOf = java.lang.Integer.valueOf(x1Var.f490330a.getVisibility())) == null || valueOf.intValue() != 4) ? false : true)) {
            sj3.x1 x1Var2 = this.f490242h;
            if (x1Var2 != null) {
                android.view.View view = x1Var2.f490330a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView", "doAnimationHide", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView", "doAnimationHide", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view2 = x1Var2.f490330a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView", "doAnimationHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView", "doAnimationHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = x1Var2.f490330a;
                view3.clearAnimation();
                view3.animate().alpha(0.0f).setDuration(300L).setListener(new sj3.v1(x1Var2)).start();
            }
            sj3.u1 u1Var = this.f490243i;
            if (u1Var != null) {
                u1Var.f(0);
            }
            sj3.u1 u1Var2 = this.f490243i;
            if (u1Var2 != null) {
                u1Var2.c(m164683xb5feb786());
            }
        }
        sj3.u1 u1Var3 = this.f490243i;
        if (u1Var3 == null) {
            return;
        }
        u1Var3.f490297l = true;
    }

    /* renamed from: setHasShowDeviceStatus */
    public final void m164684x2f34dc7d(boolean z17) {
        this.f490246o = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    /* renamed from: setVoicePlayDevice */
    public void mo72882xbbf730ba(int i17) {
        android.widget.TextView textView;
        if (this.f258622e != i17) {
            this.f490246o = true;
            this.f258622e = i17;
            sj3.u1 u1Var = this.f490243i;
            if (u1Var != null && (textView = u1Var.f490287b) != null) {
                textView.setVisibility(8);
            }
            if (u1Var != null) {
                android.view.View view = u1Var.f490294i;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "setVoicePlayDevice", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "setVoicePlayDevice", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView2 = u1Var.f490296k;
                android.content.Context context = u1Var.f490288c;
                android.widget.ImageView imageView = u1Var.f490295j;
                if (i17 == 1) {
                    if (imageView != null) {
                        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79947x15bb39c8, android.graphics.Color.parseColor("#FFFFFF")));
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                    textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc9);
                } else if (i17 == 2) {
                    if (imageView != null) {
                        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79714x614cd13e, android.graphics.Color.parseColor("#FFFFFF")));
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                    textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc7);
                } else if (i17 == 3) {
                    if (imageView != null) {
                        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79762x4abb86a, android.graphics.Color.parseColor("#FFFFFF")));
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                    textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc8);
                } else if (i17 == 4) {
                    if (imageView != null) {
                        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79650x9f0fe96, android.graphics.Color.parseColor("#FFFFFF")));
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                    textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc6);
                }
            }
            sj3.x1 x1Var = this.f490242h;
            if (x1Var != null) {
                android.widget.TextView textView3 = x1Var.f490332c;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                android.content.Context context2 = x1Var.f490333d;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = x1Var.f490335f;
                if (i17 == 1) {
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f79947x15bb39c8, android.graphics.Color.parseColor("#07C160")));
                    }
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#07C160"));
                    }
                    if (textView3 != null) {
                        textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc9);
                    }
                } else if (i17 == 2) {
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f79714x614cd13e, android.graphics.Color.parseColor("#07C160")));
                    }
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#07C160"));
                    }
                    if (textView3 != null) {
                        textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc7);
                    }
                } else if (i17 == 3) {
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f79762x4abb86a, android.graphics.Color.parseColor("#07C160")));
                    }
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#07C160"));
                    }
                    if (textView3 != null) {
                        textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc8);
                    }
                } else if (i17 == 4) {
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f79650x9f0fe96, android.graphics.Color.parseColor("#07C160")));
                    }
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#07C160"));
                    }
                    if (textView3 != null) {
                        textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc6);
                    }
                }
                android.widget.TextView textView4 = x1Var.f490331b;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
            super.mo72882xbbf730ba(i17);
        }
    }
}
