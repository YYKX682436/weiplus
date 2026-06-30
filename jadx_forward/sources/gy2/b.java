package gy2;

/* loaded from: classes2.dex */
public class b extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f359075l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f359076m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f359077n;

    /* renamed from: o, reason: collision with root package name */
    public r45.f03 f359078o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f359079p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f359080q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f359081r;

    public b(int i17, int i18) {
        super(i17);
        this.f359079p = jz5.h.b(new gy2.a(this));
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b3z;
    }

    @Override // zx2.i
    public int[] b() {
        return new int[]{0, 0};
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        android.content.Context context;
        if (viewGroup != null) {
            this.f558585j = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nuw);
            this.f359075l = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nuu);
            this.f359076m = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.kd7);
            this.f359081r = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.g3w);
            android.widget.TextView textView = this.f558585j;
            if (textView != null) {
                textView.setTextSize(1, 15.0f);
            }
            android.widget.TextView textView2 = this.f359075l;
            if (textView2 != null) {
                textView2.setTextSize(1, 12.0f);
            }
        }
        if (viewGroup != null) {
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            viewGroup.setContentDescription(i(context2));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTabInflated lastTabIndex:");
        jz5.g gVar = this.f359079p;
        sb6.append(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
        sb6.append(" index:");
        sb6.append(this.f558573a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTab", sb6.toString());
        if (viewGroup != null && (context = viewGroup.getContext()) != null && ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() != this.f558573a) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.String w76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class)).w7(this.f558573a);
            this.f359077n = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), w76, p(), false, false, 12, null);
            this.f359078o = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0(w76, p());
        }
        this.f359080q = viewGroup;
        if (viewGroup != null) {
            java.lang.Object parent = viewGroup.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
            this.f558563k = (android.view.View) parent;
            viewGroup.setTag(this);
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        android.text.TextPaint paint;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        super.d(z17, tabView);
        android.widget.TextView textView = this.f558585j;
        if (textView == null || (paint = textView.getPaint()) == null) {
            return;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.bk.r0(paint, 0.8f);
        } else {
            com.p314xaae8f345.mm.ui.bk.t0(paint);
        }
    }

    @Override // zx2.k, zx2.i
    public void e(boolean z17) {
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.a0c : com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj;
        int i18 = z17 ? com.p314xaae8f345.mm.R.raw.f79668x47e8ad96 : com.p314xaae8f345.mm.R.raw.f79670xb62772ac;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.CharSequence i19 = i(context);
        int dimension = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        java.lang.CharSequence k17 = hc2.x0.k(i19, context2, '#', i18, i17, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        android.widget.TextView textView = this.f558585j;
        if (textView != null) {
            textView.setText(k17);
            k(z17);
            j(z17);
        }
    }

    @Override // zx2.k
    public void f(android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        super.f(tabView);
        if (tabView.getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f359077n;
            r45.f03 f03Var = this.f359078o;
            android.content.Context context = tabView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            if (jbVar == null || f03Var == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "5", jbVar, f03Var, 3, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
        }
    }

    @Override // zx2.k
    public void g(android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        super.g(tabView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTab", "onTabUnSelected real");
        r("", true);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        android.content.Context context = tabView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        nk6.N(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class)).w7(this.f558573a));
    }

    @Override // zx2.k
    public int h() {
        return ((java.lang.Number) ((jz5.n) this.f359079p).mo141623x754a37bb()).intValue();
    }

    @Override // zx2.c
    public android.view.View l() {
        return this.f558585j;
    }

    @Override // zx2.c
    public android.view.View m() {
        return this.f359081r;
    }

    @Override // zx2.c
    public android.view.View o() {
        return this.f359080q;
    }

    public final java.lang.String p() {
        android.content.Context context;
        android.view.View view = this.f359080q;
        if (view == null || (context = view.getContext()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return xy2.c.e(context);
    }

    public final void q(java.lang.String str, boolean z17, boolean z18) {
        if (z18) {
            android.widget.TextView textView = this.f359075l;
            if (textView != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    textView.setVisibility(4);
                    textView.setText("");
                } else {
                    textView.setVisibility(0);
                    textView.setText(str);
                }
            }
            android.view.View view = this.f359076m;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView textView2 = this.f359075l;
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || z17) {
            android.view.View view2 = this.f359076m;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f359076m;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void r(java.lang.String str, boolean z17) {
        android.widget.TextView textView = this.f359075l;
        if (!((textView != null ? textView.getContext() : null) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129)) {
            android.widget.TextView textView2 = this.f359075l;
            if (textView2 != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    textView2.setVisibility(4);
                    textView2.setText("");
                    return;
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(str);
                    return;
                }
            }
            return;
        }
        android.widget.TextView textView3 = this.f359075l;
        if (textView3 != null) {
            int i17 = this.f558584i;
            if (i17 == com.p314xaae8f345.mm.R.C30867xcad56011.erx) {
                ya2.g gVar = ya2.h.f542017a;
                android.content.Context context = textView3.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                q(str, z17, hc2.s.d(gVar.b(xy2.c.e(context)), 1L));
                return;
            }
            if (i17 == com.p314xaae8f345.mm.R.C30867xcad56011.erv) {
                ya2.g gVar2 = ya2.h.f542017a;
                android.content.Context context2 = textView3.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                q(str, z17, hc2.s.d(gVar2.b(xy2.c.e(context2)), 2L));
                return;
            }
            if (i17 == com.p314xaae8f345.mm.R.C30867xcad56011.erw) {
                ya2.g gVar3 = ya2.h.f542017a;
                android.content.Context context3 = textView3.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                q(str, z17, hc2.s.d(gVar3.b(xy2.c.e(context3)), 4L));
            }
        }
    }
}
