package i12;

/* loaded from: classes15.dex */
public abstract class c {
    public final android.view.View A;

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f368702a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f368703b;

    /* renamed from: c, reason: collision with root package name */
    public j12.i f368704c;

    /* renamed from: d, reason: collision with root package name */
    public int f368705d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f368706e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f368707f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f368708g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f368709h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f368710i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f368711j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f368712k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.ViewGroup f368713l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f368714m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ProgressBar f368715n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f368716o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f368717p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f368718q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f368719r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f368720s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ProgressBar f368721t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f368722u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.FrameLayout f368723v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f368724w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f368725x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f368726y;

    /* renamed from: z, reason: collision with root package name */
    public android.content.Context f368727z;

    public c(android.content.Context context, android.view.View view) {
        android.widget.ImageView imageView;
        int i17;
        int i18;
        this.f368703b = new int[]{-1, -1};
        this.f368727z = context;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        if (view == null) {
            view = null;
            if (from != null) {
                view = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6o, (android.view.ViewGroup) null);
            }
        }
        this.A = view;
        if (view != null) {
            this.f368702a = view;
            this.f368706e = view.findViewById(com.p314xaae8f345.mm.R.id.hhb);
            this.f368708g = (android.widget.ImageView) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hjm);
            this.f368707f = (android.widget.ImageView) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hhr);
            this.f368709h = (android.widget.TextView) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hiq);
            this.f368710i = this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.his);
            this.f368711j = (android.widget.TextView) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hit);
            this.f368712k = (android.widget.TextView) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hhe);
            this.f368713l = (android.view.ViewGroup) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hhy);
            this.f368714m = (android.widget.TextView) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hhx);
            this.f368715n = (android.widget.ProgressBar) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.f567949l53);
            this.f368716o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.r9r);
            this.f368717p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.r9s);
            this.f368718q = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.r9t);
            this.f368719r = (android.widget.ImageView) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hjh);
            this.f368720s = this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hj_);
            this.f368721t = (android.widget.ProgressBar) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hhl);
            this.f368722u = (android.widget.TextView) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hh_);
            this.f368723v = (android.widget.FrameLayout) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.hib);
            this.f368724w = this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.f565724db3);
            this.f368725x = (android.widget.ImageView) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.f565725db4);
            this.f368726y = (android.widget.TextView) this.f368702a.findViewById(com.p314xaae8f345.mm.R.id.f565726db5);
        }
        b();
        int[] c17 = c();
        if (c17 != null && (imageView = this.f368707f) != null && c17.length == 2 && (i17 = c17[0]) >= 0 && (i18 = c17[1]) >= 0) {
            int[] iArr = this.f368703b;
            if (i17 != iArr[0] || i18 != iArr[1]) {
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = c17[0];
                layoutParams.height = c17[1];
                this.f368707f.setLayoutParams(layoutParams);
                this.f368703b = c17;
            }
        }
        int d17 = d();
        android.view.View view2 = this.f368702a;
        if (view2 != null && d17 >= 0 && -1 != d17) {
            view2.setMinimumHeight(d17);
            android.view.View view3 = this.f368706e;
            if (view3 != null) {
                view3.setMinimumHeight(d17);
            }
        }
        view.setTag(this);
    }

    public void a() {
        this.f368715n.setVisibility(8);
        android.view.View view = this.f368720s;
        if (view == null) {
            this.f368721t.setVisibility(4);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f368716o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byn);
        this.f368716o.setEnabled(true);
        i(true);
    }

    public abstract void b();

    public abstract int[] c();

    public abstract int d();

    public final java.lang.String e() {
        r45.zj0 zj0Var;
        j12.i iVar = this.f368704c;
        if (iVar == null || (zj0Var = iVar.f378700b) == null) {
            return null;
        }
        return zj0Var.f473661d;
    }

    public final int f() {
        j12.i iVar = this.f368704c;
        return (iVar == null ? null : java.lang.Integer.valueOf(iVar.f378704f)).intValue();
    }

    public abstract boolean g();

    public void h() {
        if (this.f368704c != null && g()) {
            k(8);
            int f17 = f();
            if (f17 == -2) {
                this.f368715n.setVisibility(8);
                this.f368716o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572643bz1);
                this.f368716o.setEnabled(false);
                i(true);
                android.view.View view = this.f368720s;
                if (view == null) {
                    this.f368721t.setVisibility(4);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealNotAvailableBuyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealNotAvailableBuyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (f17 == 0) {
                a();
            } else if (f17 != 3) {
                if (f17 != 4) {
                    if (f17 == 6) {
                        this.f368715n.setVisibility(8);
                        k(8);
                        this.f368721t.setVisibility(0);
                        android.widget.ProgressBar progressBar = this.f368721t;
                        j12.i iVar = this.f368704c;
                        progressBar.setProgress(iVar == null ? 0 : iVar.f378703e);
                        android.widget.ProgressBar progressBar2 = this.f368721t;
                        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572630bw2);
                        j12.i iVar2 = this.f368704c;
                        progressBar2.setContentDescription(java.lang.String.format(g17, java.lang.Integer.valueOf(iVar2 == null ? 0 : iVar2.f378703e)));
                        android.view.View view2 = this.f368720s;
                        if (view2 == null) {
                            this.f368721t.setVisibility(0);
                        } else {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(0);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else if (f17 == 7) {
                        j12.i iVar3 = this.f368704c;
                        if (iVar3.f378708j && j12.g.b(iVar3.f378700b.f473668n, 64)) {
                            i(true);
                            k(8);
                            this.f368718q.setVisibility(0);
                            android.view.View view3 = this.f368720s;
                            if (view3 == null) {
                                this.f368721t.setVisibility(4);
                                return;
                            }
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            arrayList3.add(4);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        this.f368715n.setVisibility(8);
                        i(false);
                        android.view.View view4 = this.f368720s;
                        if (view4 == null) {
                            this.f368721t.setVisibility(4);
                        } else {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                            arrayList4.add(4);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(view4, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else if (f17 != 8) {
                        switch (f17) {
                            case 10:
                                this.f368715n.setVisibility(8);
                                i(true);
                                this.f368716o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572645bz3);
                                this.f368716o.setEnabled(true);
                                android.view.View view5 = this.f368720s;
                                if (view5 != null) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                                    arrayList5.add(4);
                                    java.util.Collections.reverse(arrayList5);
                                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                    yj0.a.f(view5, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    break;
                                } else {
                                    this.f368721t.setVisibility(4);
                                    break;
                                }
                            case 11:
                                this.f368715n.setVisibility(0);
                                this.f368716o.setVisibility(8);
                                android.view.View view6 = this.f368720s;
                                if (view6 != null) {
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                                    arrayList6.add(4);
                                    java.util.Collections.reverse(arrayList6);
                                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                    yj0.a.f(view6, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    break;
                                } else {
                                    this.f368721t.setVisibility(4);
                                    break;
                                }
                            case 12:
                                break;
                            default:
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.BaseEmojiItemHolder", "unknow product status:%d", java.lang.Integer.valueOf(f()));
                                break;
                        }
                    } else {
                        this.f368715n.setVisibility(8);
                        this.f368716o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byq);
                        this.f368716o.setEnabled(false);
                        i(true);
                        android.view.View view7 = this.f368720s;
                        if (view7 == null) {
                            this.f368721t.setVisibility(4);
                        } else {
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                            arrayList7.add(4);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                            yj0.a.f(view7, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                this.f368715n.setVisibility(8);
                android.view.View view8 = this.f368720s;
                if (view8 == null) {
                    this.f368721t.setVisibility(4);
                } else {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                    arrayList8.add(4);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                i(true);
                r45.zj0 zj0Var = this.f368704c.f378700b;
                if (zj0Var != null) {
                    if ((zj0Var.f473668n & 512) == 512) {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f368716o;
                        android.content.Context context = this.f368727z;
                        c22661xa3a2b3c0.setText(n22.j.f415826a.d(context, zj0Var.A, "", context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq)));
                        this.f368716o.setContentDescription(java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.c0n), java.lang.Integer.valueOf(this.f368704c.f378700b.A)));
                    } else {
                        this.f368716o.setText(zj0Var.f473666i);
                        this.f368716o.setContentDescription(java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.bxc), this.f368716o.getText()));
                    }
                }
                this.f368716o.setEnabled(true);
            } else {
                a();
            }
            r45.zj0 zj0Var2 = this.f368704c.f378700b;
            if (zj0Var2 == null) {
                return;
            }
            r45.tj0 tj0Var = zj0Var2.D;
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.v(tj0Var)) {
                android.view.View view9 = this.f368724w;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view10 = this.f368724w;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str = tj0Var.f468029e;
            if (str != null) {
                wo0.c a17 = vo0.e.f520001b.a(str);
                yo0.f fVar = new yo0.f();
                fVar.f545611b = true;
                a17.f529405c = fVar.a();
                ((wo0.b) a17).c(this.f368725x);
            }
            this.f368726y.setText(tj0Var.f468030f);
            this.f368713l.setVisibility(8);
        }
    }

    public void i(boolean z17) {
        if (this.f368717p.isEnabled()) {
            this.f368717p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byp);
            this.f368717p.m81544x764b6bfb(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            this.f368717p.setEnabled(false);
            this.f368717p.setBackgroundColor(0);
        }
        if (z17) {
            this.f368717p.setVisibility(8);
            this.f368716o.setVisibility(0);
        } else {
            this.f368716o.setVisibility(8);
            this.f368717p.setVisibility(0);
        }
        this.f368718q.setVisibility(8);
    }

    public void j(java.lang.String str) {
        r45.zj0 zj0Var;
        j12.i iVar = this.f368704c;
        if (iVar == null || (zj0Var = iVar.f378700b) == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.v(zj0Var.D)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f368713l.setVisibility(8);
                this.f368714m.setVisibility(8);
            } else {
                this.f368713l.setVisibility(0);
                this.f368714m.setVisibility(0);
                this.f368714m.setText(str);
            }
        }
    }

    public void k(int i17) {
        this.f368716o.setVisibility(i17);
        this.f368717p.setVisibility(i17);
        this.f368718q.setVisibility(i17);
    }
}
