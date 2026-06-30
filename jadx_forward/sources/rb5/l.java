package rb5;

/* loaded from: classes11.dex */
public class l implements wn.t, al5.z2 {
    public android.graphics.Bitmap C;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f475413d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.b f475414e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea f475415f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21631x5f0c8f14 f475416g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Animation f475417h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 f475418i;

    /* renamed from: m, reason: collision with root package name */
    public int f475419m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f475421o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f475422p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f475423q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f475424r;

    /* renamed from: s, reason: collision with root package name */
    public android.os.Bundle f475425s;

    /* renamed from: w, reason: collision with root package name */
    public wn.r f475429w;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Class f475432z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f475420n = false;

    /* renamed from: t, reason: collision with root package name */
    public rb5.k f475426t = rb5.k.ACTIVITY_CREATE;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f475427u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f475428v = new java.util.HashSet();

    /* renamed from: x, reason: collision with root package name */
    public int f475430x = -1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f475431y = false;
    public final java.lang.Runnable A = new rb5.c(this);
    public final db5.x8 B = new rb5.f(this);

    public l(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f475413d = abstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea();
        this.f475415f = c21628xcedb13ea;
        this.f475416g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21631x5f0c8f14(abstractActivityC21394xb3d2c0cf, c21628xcedb13ea);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(rb5.l r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb5.l.a(rb5.l, boolean):void");
    }

    public void b() {
        this.f475420n = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = this.f475418i;
        objArr[0] = java.lang.Boolean.valueOf(c22559x35245a10 != null && c22559x35245a10.isShown());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "try closeChatting, isShown:%b", objArr);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f475415f;
        if (c21628xcedb13ea != null && c21628xcedb13ea.m78668x4e2d2008()) {
            al5.a3.c(this);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a102 = this.f475418i;
        if (c22559x35245a102 == null || c22559x35245a102.getVisibility() == 8 || this.f475415f == null) {
            return;
        }
        java.util.Iterator it = this.f475428v.iterator();
        while (it.hasNext()) {
            if (!((wn.q) it.next()).c3()) {
                it.remove();
            }
        }
        this.f475418i.setVisibility(8);
        android.widget.ImageView imageView = (android.widget.ImageView) d().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.l3_);
        if (imageView != null && imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "[closeChatting] prepareView GONE");
            if (imageView.getTag() != null) {
                android.view.View view = (android.view.View) imageView.getTag();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "closeChatting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "closeChatting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        java.lang.Class cls = this.f475432z;
        if (cls != null && this.f475415f.f279685f.f542241c.f283495a.containsKey(cls)) {
            yn.e eVar = (yn.e) this.f475415f.f279685f.f542241c.f283495a.get(this.f475432z);
            if (eVar != null && (eVar instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg) eVar).I();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingComponentManager", "[unInstall] listener:%s cost:%sms", eVar.getClass().getName(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
            this.f475432z = null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21631x5f0c8f14 c21631x5f0c8f14 = this.f475416g;
        c21631x5f0c8f14.mo78435xaae90f0c();
        c21631x5f0c8f14.mo78436x13e5bfe();
        this.f475418i.setVisibility(8);
        mo2326xb052149b(1.0f);
        m();
        this.f475413d.mo78514x143f1b92().G0(this.f475430x);
    }

    public boolean c(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            this.f475427u.mo50300x3fa464aa(this.A);
        }
        if (this.f475421o) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f475415f;
        return c21628xcedb13ea != null && c21628xcedb13ea.mo78345x1f03f0c2(keyEvent.getKeyCode(), keyEvent);
    }

    public final android.view.Window d() {
        return this.f475413d.getWindow();
    }

    public void e() {
        this.f475413d.mo52921x858d605d();
    }

    public boolean f(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea;
        if ((i17 != 2001 && i17 != 30763 && i17 != 226 && i17 != 30762 && i17 != 1111) || (c21628xcedb13ea = this.f475415f) == null) {
            return false;
        }
        c21628xcedb13ea.mo7496x9d4787cb(i17, i18, intent);
        return true;
    }

    @Override // al5.z2
    /* renamed from: forceRemoveNoMatchOnPath */
    public boolean mo2324x9a379939() {
        return false;
    }

    public void g() {
        d().setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        this.f475414e = al5.p0.N(this.f475413d.mo2533x106ab264());
        e();
        if (this.f475431y) {
            android.os.Looper.myQueue().addIdleHandler(new rb5.b(this));
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f475415f;
        if (c21628xcedb13ea == null || !c21628xcedb13ea.f279685f.f542247i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChattingCompat", "[initActionBar] isChattingForeground False!");
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f475413d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b_, (android.view.ViewGroup) null);
            com.p314xaae8f345.mm.ui.j jVar = new com.p314xaae8f345.mm.ui.j(inflate);
            this.f475414e.I(new android.graphics.drawable.ColorDrawable(this.f475413d.getResources().getColor(android.R.color.transparent)));
            this.f475414e.F(false);
            this.f475414e.B(false);
            this.f475414e.E(false);
            this.f475414e.D(true);
            this.f475414e.y(inflate);
            this.f475413d.mo78514x143f1b92().H = jVar.f290504d;
            jVar.c(new rb5.h(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChattingCompat", "[initActionBar] isChattingForeground True!");
        }
        this.f475414e.L();
        o25.n1.c(this.f475413d);
    }

    public void h() {
        d().setFormat(-2);
        o25.n1.f(this.f475413d);
        this.f475413d.m78497xc03943d(true);
    }

    public void i() {
        android.graphics.Bitmap bitmap = this.C;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "bitmap recycle %s", this.C.toString());
            this.C.recycle();
        }
        this.f475422p = false;
        this.f475428v.clear();
        this.f475427u.mo50302x6b17ad39(null);
        this.f475413d = null;
        this.f475415f = null;
        this.f475418i = null;
        this.f475417h = null;
    }

    public void j() {
        this.f475426t = rb5.k.ACTIVITY_RESUME;
        mo2326xb052149b(1.0f);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f475415f;
        if ((c21628xcedb13ea != null && c21628xcedb13ea.f279685f.f542247i) || !this.f475422p) {
            return;
        }
        java.lang.String str = this.f475423q;
        android.os.Bundle bundle = this.f475425s;
        this.f475423q = str;
        this.f475425s = bundle;
        this.f475422p = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f475427u;
        java.lang.Runnable runnable = this.A;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50293x3498a0(runnable);
    }

    public final void k(boolean z17, int i17) {
        if (db5.f.g() && ep.a.a()) {
            android.view.View findViewById = this.f475413d.findViewById(com.p314xaae8f345.mm.R.id.huh);
            if (findViewById == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingCompat", "[onSettle] null == container");
                return;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) this.f475413d.findViewById(com.p314xaae8f345.mm.R.id.l3_);
            if (imageView != null && imageView.getVisibility() == 8 && imageView.getDrawable() != null) {
                imageView.setVisibility(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "[onSettle] prepareView VISIBLE");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "performOnSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "performOnSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (imageView == null || imageView.getVisibility() != 0) {
                if (z17) {
                    com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(findViewById, i17 > 0 ? 130L : 230L, 0.0f, 0.0f, null);
                    return;
                } else {
                    com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(findViewById, i17 > 0 ? 130L : 230L, (findViewById.getWidth() * (-1)) / 2.5f, 0.0f, null);
                    return;
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(imageView, i17 > 0 ? 130L : 230L, 0.0f, 0.0f, null);
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(imageView, i17 > 0 ? 130L : 230L, (imageView.getWidth() * (-1)) / 2.5f, 0.0f, null);
            }
        }
    }

    public void l(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, wn.q qVar) {
        if (qVar != null) {
            this.f475428v.add(qVar);
        }
        this.f475423q = str;
        this.f475424r = str2;
        this.f475425s = bundle;
        this.f475422p = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f475427u;
        java.lang.Runnable runnable = this.A;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50293x3498a0(runnable);
    }

    public final void m() {
        if (db5.f.g() && ep.a.a()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f475415f == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", objArr);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f475415f;
            if (c21628xcedb13ea != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78658x28280f95 = c21628xcedb13ea.m78658x28280f95();
                m78658x28280f95.f292974v = false;
                m78658x28280f95.F = false;
            }
        }
    }

    @Override // al5.z2
    /* renamed from: onSettle */
    public void mo2325x58f7e80a(boolean z17, int i17, boolean z18) {
        if (z18) {
            k(z17, i17);
        }
    }

    @Override // al5.z2
    /* renamed from: onSwipe */
    public void mo2326xb052149b(float f17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea;
        android.widget.ImageView imageView;
        android.view.ViewGroup viewGroup;
        if (db5.f.g() && ep.a.a() && (c21628xcedb13ea = this.f475415f) != null) {
            if (f17 == 0.0f && !this.f475420n) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) d().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.l3_);
                if (imageView2 != null && (viewGroup = (android.view.ViewGroup) imageView2.getTag()) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "[onSwipe] prepareView GONE");
                    viewGroup.setVisibility(0);
                    imageView2.setVisibility(8);
                    imageView2.setImageDrawable(null);
                }
                android.view.animation.Animation animation = this.f475417h;
                if (animation != null) {
                    animation.cancel();
                }
            } else if (f17 == 1.0f && !this.f475420n && c21628xcedb13ea.m78668x4e2d2008() && (imageView = (android.widget.ImageView) d().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.l3_)) != null && imageView.getVisibility() == 0 && imageView.getTag() != null) {
                android.view.View view = (android.view.View) imageView.getTag();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "[onSwipe] prepareView GONE");
                imageView.setVisibility(8);
            }
            if (rb5.k.ACTIVITY_RESUME != this.f475426t && java.lang.Float.compare(1.0f, f17) > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "[onSwipe] return! consumedSuperCall:%s", java.lang.Float.valueOf(f17));
                return;
            }
            android.view.View findViewById = this.f475413d.findViewById(com.p314xaae8f345.mm.R.id.huh);
            android.widget.ImageView imageView3 = (android.widget.ImageView) this.f475413d.findViewById(com.p314xaae8f345.mm.R.id.l3_);
            if (imageView3 != null && imageView3.getVisibility() == 8 && imageView3.getDrawable() != null && !this.f475420n && f17 != 1.0f && f17 != 0.0f) {
                imageView3.setVisibility(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "[onSwipe] !1 && !0 prepareView VISIBLE");
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (java.lang.Float.compare(1.0f, f17) <= 0) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(findViewById, 0.0f, 0.0f);
                if (imageView3 == null || imageView3.getDrawable() == null) {
                    return;
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(imageView3, 0.0f, 0.0f);
                return;
            }
            if (imageView3 == null || imageView3.getDrawable() == null) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(findViewById, (findViewById.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(imageView3, (imageView3.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
            }
        }
    }
}
