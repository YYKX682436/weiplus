package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes15.dex */
public final class pr implements android.view.View.OnClickListener {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public long E;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f200939d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f200940e;

    /* renamed from: f, reason: collision with root package name */
    public int f200941f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f200942g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f200943h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f200944i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f200945m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f200946n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f200947o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f200948p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f200949q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f200950r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f200951s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f200952t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f200953u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f200954v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f200955w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f200956x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f200957y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f200958z;

    public pr(android.view.ViewGroup root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f200939d = root;
        this.f200940e = "FinderLivePrecheckWidget";
        this.f200942g = "";
        this.f200943h = "";
        this.f200944i = "";
        this.f200957y = true;
        this.B = true;
        this.C = true;
    }

    public final void a(java.lang.String str, int i17) {
        if (i17 != 4) {
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f200940e, "gotoFaceVerify error url is empty!");
                zl2.r4 r4Var = zl2.r4.f555483a;
                android.content.Context context = this.f200939d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                r4Var.f3(context, "检测地址为空");
                return;
            }
        }
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).ij(7, this.D, this.E, kz5.b1.e(new jz5.l("certification_type", java.lang.Integer.valueOf(i17))));
        yz5.p pVar = this.f200945m;
        if (pVar != null) {
            pVar.mo149xb9724478(str, java.lang.Integer.valueOf(i17));
        }
    }

    public final void b() {
        g();
        d();
        f(this.f200944i);
        e();
    }

    public final void c() {
        this.f200957y = pm0.v.z(this.f200941f, 4);
        this.f200958z = pm0.v.z(this.f200941f, 32);
        boolean z17 = pm0.v.z(this.f200941f, 64);
        this.A = z17;
        this.B = z17 | this.f200957y | this.f200958z | pm0.v.z(this.f200941f, 8);
        this.C = pm0.v.z(this.f200941f, 16);
    }

    public final void d() {
        if (this.B) {
            android.widget.TextView textView = this.f200950r;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.e5w);
            }
            android.widget.TextView textView2 = this.f200950r;
            if (textView2 != null) {
                textView2.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f200951s;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(4);
            }
            android.widget.TextView textView3 = this.f200950r;
            if (textView3 == null) {
                return;
            }
            textView3.setEnabled(true);
            return;
        }
        android.widget.TextView textView4 = this.f200950r;
        if (textView4 != null) {
            textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.e5x);
        }
        android.widget.TextView textView5 = this.f200950r;
        if (textView5 != null) {
            textView5.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f200951s;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(4);
        }
        android.widget.TextView textView6 = this.f200950r;
        if (textView6 == null) {
            return;
        }
        textView6.setEnabled(false);
    }

    public final void e() {
        if (this.f200956x) {
            android.widget.Button button = this.f200947o;
            if (button != null) {
                button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.e5s);
            }
        } else {
            android.widget.Button button2 = this.f200947o;
            if (button2 != null) {
                button2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.e5r);
            }
        }
        boolean z17 = (this.f200957y || this.B || this.C || this.f200958z || this.A) ? false : true;
        android.widget.Button button3 = this.f200947o;
        if (button3 == null) {
            return;
        }
        button3.setEnabled(z17);
    }

    public final void f(java.lang.String str) {
        boolean z17 = true;
        if (this.C) {
            android.view.View view = this.f200952t;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = this.f200954v;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.e5w);
            }
            android.widget.TextView textView2 = this.f200954v;
            if (textView2 != null) {
                textView2.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            }
            android.widget.TextView textView3 = this.f200953u;
            if (textView3 != null) {
                textView3.setText(str);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f200955w;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            android.widget.TextView textView4 = this.f200954v;
            if (textView4 == null) {
                return;
            }
            textView4.setEnabled(true);
            return;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            android.view.View view2 = this.f200952t;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f200952t;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView5 = this.f200954v;
        if (textView5 != null) {
            textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.e5x);
        }
        android.widget.TextView textView6 = this.f200954v;
        if (textView6 != null) {
            textView6.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        }
        android.widget.TextView textView7 = this.f200953u;
        if (textView7 != null) {
            textView7.setText(str);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f200955w;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(4);
        }
        android.widget.TextView textView8 = this.f200954v;
        if (textView8 == null) {
            return;
        }
        textView8.setEnabled(false);
    }

    public final void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f200940e, "setRealname realnameCheckFail" + this.f200957y + ", finderRealNameCheckFail:" + this.f200958z + ", finderRealNameNewCheckFail:" + this.A);
        boolean z17 = this.f200957y;
        if (!z17 && !this.f200958z && !this.A) {
            android.widget.TextView textView = this.f200948p;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.e5x);
            }
            android.widget.TextView textView2 = this.f200948p;
            if (textView2 != null) {
                textView2.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f200949q;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(4);
            }
            android.widget.TextView textView3 = this.f200948p;
            if (textView3 == null) {
                return;
            }
            textView3.setEnabled(false);
            return;
        }
        if (z17) {
            android.widget.TextView textView4 = this.f200948p;
            if (textView4 != null) {
                textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.e5w);
            }
        } else {
            android.widget.TextView textView5 = this.f200948p;
            if (textView5 != null) {
                textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.e6b);
            }
        }
        android.widget.TextView textView6 = this.f200948p;
        if (textView6 != null) {
            textView6.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f200949q;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(0);
        }
        android.widget.TextView textView7 = this.f200948p;
        if (textView7 == null) {
            return;
        }
        textView7.setEnabled(true);
    }

    public final void h(boolean z17, int i17) {
        java.lang.String str = this.f200940e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updatePrecheck precheckType:" + i17 + ", " + z17);
        if (i17 == 1) {
            if (z17) {
                this.f200957y = false;
            }
            g();
        } else if (i17 == 2) {
            if (z17) {
                this.B = false;
            }
            d();
        } else if (i17 == 3) {
            if (z17) {
                this.C = false;
            }
            f(this.f200944i);
        } else if (i17 == 4) {
            if (z17) {
                this.f200958z = false;
            }
            g();
        } else if (i17 == 5) {
            if (z17) {
                this.A = false;
            }
            g();
        }
        e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updatePrecheck realnameCheckFail:" + this.f200957y + ", finderRealNameCheckFail:" + this.f200958z + ", finderRealNameNewCheckFail:" + this.A + ", ageCheckFail:" + this.B + ", othersCheckFail:" + this.C);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        yz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = false;
        if (!((valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.l2m) || (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.l2k))) {
            if (!((valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.l2b) || (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.l2_))) {
                if ((valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.l2h) || (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.l2f)) {
                    a(this.f200942g, 3);
                } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.l2d) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (currentTimeMillis - qd2.h.f443300a < 500) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
                        z17 = true;
                    }
                    qd2.h.f443300a = currentTimeMillis;
                    if (z17) {
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    if (this.f200956x) {
                        yz5.l lVar2 = this.f200946n;
                        if (lVar2 != null) {
                            lVar2.mo146xb9724478(java.lang.Boolean.TRUE);
                        }
                    } else {
                        android.content.Context context = this.f200939d.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("KEY_PATH", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
                        intent.putExtra("KEY_TYPE", "TYPE_LICENSE");
                        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", this.D);
                        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", this.E);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Jj((android.app.Activity) context, intent, 10123);
                    }
                } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.ofa && (lVar = this.f200946n) != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                }
            }
        } else if (this.f200957y) {
            a(this.f200942g, 1);
        } else if (this.A) {
            a(this.f200943h, 5);
        } else {
            a("", 4);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
