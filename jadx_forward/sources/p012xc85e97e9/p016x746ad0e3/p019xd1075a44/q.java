package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class q extends o.d implements n3.d {
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n A;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i B;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k C;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j D;
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o E;
    public int F;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m f91204p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f91205q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f91206r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f91207s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f91208t;

    /* renamed from: u, reason: collision with root package name */
    public int f91209u;

    /* renamed from: v, reason: collision with root package name */
    public int f91210v;

    /* renamed from: w, reason: collision with root package name */
    public int f91211w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f91212x;

    /* renamed from: y, reason: collision with root package name */
    public final android.util.SparseBooleanArray f91213y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f91214z;

    public q(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569413ah, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569412ag);
        this.f91213y = new android.util.SparseBooleanArray();
        this.E = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o(this);
    }

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
        l();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i iVar = this.B;
        if (iVar != null && iVar.b()) {
            iVar.f423244j.mo2732x63a3b28a();
        }
        o.f0 f0Var = this.f423227h;
        if (f0Var != null) {
            f0Var.a(rVar, z17);
        }
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0075x7bb65b c0075x7bb65b = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0075x7bb65b();
        c0075x7bb65b.f90868d = this.F;
        return c0075x7bb65b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.g0
    public void c(boolean z17) {
        int i17;
        boolean z18;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f423230n;
        java.util.ArrayList arrayList = null;
        boolean z19 = false;
        if (viewGroup != null) {
            o.r rVar = this.f423225f;
            if (rVar != null) {
                rVar.i();
                java.util.ArrayList l17 = this.f423225f.l();
                int size = l17.size();
                i17 = 0;
                for (int i18 = 0; i18 < size; i18++) {
                    o.u uVar = (o.u) l17.get(i18);
                    if ((uVar.D & 32) == 32) {
                        android.view.View childAt = viewGroup.getChildAt(i17);
                        o.u mo2574xc2025ad3 = childAt instanceof o.h0 ? ((o.h0) childAt).mo2574xc2025ad3() : null;
                        android.view.View k17 = k(uVar, childAt, viewGroup);
                        if (uVar != mo2574xc2025ad3) {
                            k17.setPressed(false);
                            k17.jumpDrawablesToCurrentState();
                        }
                        if (k17 != childAt) {
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) k17.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(k17);
                            }
                            ((android.view.ViewGroup) this.f423230n).addView(k17, i17);
                        }
                        i17++;
                    }
                }
            } else {
                i17 = 0;
            }
            while (i17 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i17) == this.f91204p) {
                    z18 = false;
                } else {
                    viewGroup.removeViewAt(i17);
                    z18 = true;
                }
                if (!z18) {
                    i17++;
                }
            }
        }
        ((android.view.View) this.f423230n).requestLayout();
        o.r rVar2 = this.f423225f;
        if (rVar2 != null) {
            rVar2.i();
            java.util.ArrayList arrayList2 = rVar2.f423321o;
            int size2 = arrayList2.size();
            for (int i19 = 0; i19 < size2; i19++) {
                n3.f fVar = ((o.u) arrayList2.get(i19)).G;
                if (fVar != null) {
                    fVar.f415863a = this;
                }
            }
        }
        o.r rVar3 = this.f423225f;
        if (rVar3 != null) {
            rVar3.i();
            arrayList = rVar3.f423322p;
        }
        if (this.f91207s && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z19 = !((o.u) arrayList.get(0)).I;
            } else if (size3 > 0) {
                z19 = true;
            }
        }
        if (z19) {
            if (this.f91204p == null) {
                this.f91204p = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m(this, this.f423223d);
            }
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.f91204p.getParent();
            if (viewGroup3 != this.f423230n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f91204p);
                }
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a) this.f423230n;
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m mVar = this.f91204p;
                c0076xa566151a.getClass();
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams(-2, -2);
                layoutParams.f90949b = 16;
                layoutParams.f90874c = true;
                c0076xa566151a.addView(mVar, layoutParams);
            }
        } else {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m mVar2 = this.f91204p;
            if (mVar2 != null) {
                java.lang.Object parent = mVar2.getParent();
                java.lang.Object obj = this.f423230n;
                if (parent == obj) {
                    ((android.view.ViewGroup) obj).removeView(this.f91204p);
                }
            }
        }
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a) this.f423230n).m2630x7ff37dcc(this.f91207s);
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
        this.f423224e = context;
        android.view.LayoutInflater.from(context);
        this.f423225f = rVar;
        android.content.res.Resources resources = context.getResources();
        if (!this.f91208t) {
            this.f91207s = true;
        }
        int i17 = 2;
        this.f91209u = context.getResources().getDisplayMetrics().widthPixels / 2;
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        int i18 = configuration.screenWidthDp;
        int i19 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i18 > 600 || ((i18 > 960 && i19 > 720) || (i18 > 720 && i19 > 960))) {
            i17 = 5;
        } else if (i18 >= 500 || ((i18 > 640 && i19 > 480) || (i18 > 480 && i19 > 640))) {
            i17 = 4;
        } else if (i18 >= 360) {
            i17 = 3;
        }
        this.f91211w = i17;
        int i27 = this.f91209u;
        if (this.f91207s) {
            if (this.f91204p == null) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m mVar = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m(this, this.f423223d);
                this.f91204p = mVar;
                if (this.f91206r) {
                    mVar.setImageDrawable(this.f91205q);
                    this.f91205q = null;
                    this.f91206r = false;
                }
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f91204p.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i27 -= this.f91204p.getMeasuredWidth();
        } else {
            this.f91204p = null;
        }
        this.f91210v = i27;
        float f17 = resources.getDisplayMetrics().density;
        this.f91214z = null;
    }

    @Override // o.g0
    public boolean e() {
        java.util.ArrayList arrayList;
        int i17;
        int i18;
        boolean z17;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this;
        o.r rVar = qVar.f423225f;
        if (rVar != null) {
            arrayList = rVar.l();
            i17 = arrayList.size();
        } else {
            arrayList = null;
            i17 = 0;
        }
        int i19 = qVar.f91211w;
        int i27 = qVar.f91210v;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) qVar.f423230n;
        int i28 = 0;
        boolean z18 = false;
        int i29 = 0;
        int i37 = 0;
        while (true) {
            i18 = 2;
            z17 = true;
            if (i28 >= i17) {
                break;
            }
            o.u uVar = (o.u) arrayList.get(i28);
            int i38 = uVar.E;
            if ((i38 & 2) == 2) {
                i29++;
            } else if ((i38 & 1) == 1) {
                i37++;
            } else {
                z18 = true;
            }
            if (qVar.f91212x && uVar.I) {
                i19 = 0;
            }
            i28++;
        }
        if (qVar.f91207s && (z18 || i37 + i29 > i19)) {
            i19--;
        }
        int i39 = i19 - i29;
        android.util.SparseBooleanArray sparseBooleanArray = qVar.f91213y;
        sparseBooleanArray.clear();
        int i47 = 0;
        int i48 = 0;
        while (i47 < i17) {
            o.u uVar2 = (o.u) arrayList.get(i47);
            int i49 = uVar2.E;
            boolean z19 = (i49 & 2) == i18 ? z17 : false;
            int i57 = uVar2.f423338e;
            if (z19) {
                android.view.View k17 = qVar.k(uVar2, qVar.f91214z, viewGroup);
                if (qVar.f91214z == null) {
                    qVar.f91214z = k17;
                }
                k17.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = k17.getMeasuredWidth();
                i27 -= measuredWidth;
                if (i48 == 0) {
                    i48 = measuredWidth;
                }
                if (i57 != 0) {
                    sparseBooleanArray.put(i57, z17);
                }
                uVar2.g(z17);
            } else if ((i49 & 1) == z17 ? z17 : false) {
                boolean z27 = sparseBooleanArray.get(i57);
                boolean z28 = ((i39 > 0 || z27) && i27 > 0) ? z17 : false;
                if (z28) {
                    android.view.View k18 = qVar.k(uVar2, qVar.f91214z, viewGroup);
                    if (qVar.f91214z == null) {
                        qVar.f91214z = k18;
                    }
                    k18.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = k18.getMeasuredWidth();
                    i27 -= measuredWidth2;
                    if (i48 == 0) {
                        i48 = measuredWidth2;
                    }
                    z28 &= i27 + i48 > 0;
                }
                if (z28 && i57 != 0) {
                    sparseBooleanArray.put(i57, true);
                } else if (z27) {
                    sparseBooleanArray.put(i57, false);
                    for (int i58 = 0; i58 < i47; i58++) {
                        o.u uVar3 = (o.u) arrayList.get(i58);
                        if (uVar3.f423338e == i57) {
                            if ((uVar3.D & 32) == 32) {
                                i39++;
                            }
                            uVar3.g(false);
                        }
                    }
                }
                if (z28) {
                    i39--;
                }
                uVar2.g(z28);
            } else {
                uVar2.g(false);
                i47++;
                i18 = 2;
                qVar = this;
                z17 = true;
            }
            i47++;
            i18 = 2;
            qVar = this;
            z17 = true;
        }
        return z17;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
        int i17;
        android.view.MenuItem findItem;
        if ((parcelable instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0075x7bb65b) && (i17 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0075x7bb65b) parcelable).f90868d) > 0 && (findItem = this.f423225f.findItem(i17)) != null) {
            i((o.o0) findItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    @Override // o.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(o.o0 r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            o.r r2 = r0.F
            o.r r3 = r8.f423225f
            if (r2 == r3) goto L13
            r0 = r2
            o.o0 r0 = (o.o0) r0
            goto L9
        L13:
            o.i0 r2 = r8.f423230n
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = r1
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof o.h0
            if (r6 == 0) goto L35
            r6 = r5
            o.h0 r6 = (o.h0) r6
            o.u r6 = r6.mo2574xc2025ad3()
            o.u r7 = r0.G
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            o.u r0 = r9.G
            int r0 = r0.f423337d
            r8.F = r0
            int r0 = r9.size()
            r2 = r1
        L47:
            r3 = 1
            if (r2 >= r0) goto L5f
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5c
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5c
            r0 = r3
            goto L60
        L5c:
            int r2 = r2 + 1
            goto L47
        L5f:
            r0 = r1
        L60:
            androidx.appcompat.widget.i r2 = new androidx.appcompat.widget.i
            android.content.Context r4 = r8.f423224e
            r2.<init>(r8, r4, r9, r5)
            r8.B = r2
            r2.f423242h = r0
            o.c0 r2 = r2.f423244j
            if (r2 == 0) goto L72
            r2.n(r0)
        L72:
            androidx.appcompat.widget.i r0 = r8.B
            boolean r2 = r0.b()
            if (r2 == 0) goto L7c
        L7a:
            r1 = r3
            goto L85
        L7c:
            android.view.View r2 = r0.f423240f
            if (r2 != 0) goto L81
            goto L85
        L81:
            r0.d(r1, r1, r1, r1)
            goto L7a
        L85:
            if (r1 == 0) goto L8f
            o.f0 r0 = r8.f423227h
            if (r0 == 0) goto L8e
            r0.c(r9)
        L8e:
            return r3
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q.i(o.o0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v4, types: [o.h0] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public android.view.View k(o.u uVar, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View actionView = uVar.getActionView();
        if (actionView == null || uVar.e()) {
            p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.ViewOnClickListenerC0069xaad3004d viewOnClickListenerC0069xaad3004d = view instanceof o.h0 ? (o.h0) view : (o.h0) this.f423226g.inflate(this.f423229m, viewGroup, false);
            viewOnClickListenerC0069xaad3004d.a(uVar, 0);
            p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.ViewOnClickListenerC0069xaad3004d viewOnClickListenerC0069xaad3004d2 = viewOnClickListenerC0069xaad3004d;
            viewOnClickListenerC0069xaad3004d2.m2579xc53f16a5((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a) this.f423230n);
            if (this.D == null) {
                this.D = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j(this);
            }
            viewOnClickListenerC0069xaad3004d2.m2580xa0b5abcf(this.D);
            actionView = viewOnClickListenerC0069xaad3004d;
        }
        int i17 = uVar.I ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(actionView, arrayList.toArray(), "androidx/appcompat/widget/ActionMenuPresenter", "getItemView", "(Landroidx/appcompat/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        actionView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(actionView, "androidx/appcompat/widget/ActionMenuPresenter", "getItemView", "(Landroidx/appcompat/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a) viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!c0076xa566151a.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(c0076xa566151a.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public boolean l() {
        java.lang.Object obj;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k kVar = this.C;
        if (kVar != null && (obj = this.f423230n) != null) {
            ((android.view.View) obj).removeCallbacks(kVar);
            this.C = null;
            return true;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n nVar = this.A;
        if (nVar == null) {
            return false;
        }
        if (nVar.b()) {
            nVar.f423244j.mo2732x63a3b28a();
        }
        return true;
    }

    public boolean m() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n nVar = this.A;
        return nVar != null && nVar.b();
    }

    public void n(boolean z17) {
        if (z17) {
            o.f0 f0Var = this.f423227h;
            if (f0Var != null) {
                f0Var.c(null);
                return;
            }
            return;
        }
        o.r rVar = this.f423225f;
        if (rVar != null) {
            rVar.c(false);
        }
    }

    public boolean o() {
        o.r rVar;
        if (!this.f91207s || m() || (rVar = this.f423225f) == null || this.f423230n == null || this.C != null) {
            return false;
        }
        rVar.i();
        if (rVar.f423322p.isEmpty()) {
            return false;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k kVar = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k(this, new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n(this, this.f423224e, this.f423225f, this.f91204p, true));
        this.C = kVar;
        ((android.view.View) this.f423230n).post(kVar);
        o.f0 f0Var = this.f423227h;
        if (f0Var == null) {
            return true;
        }
        f0Var.c(null);
        return true;
    }
}
