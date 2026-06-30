package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class q extends o.d implements n3.d {
    public androidx.appcompat.widget.n A;
    public androidx.appcompat.widget.i B;
    public androidx.appcompat.widget.k C;
    public androidx.appcompat.widget.j D;
    public final androidx.appcompat.widget.o E;
    public int F;

    /* renamed from: p, reason: collision with root package name */
    public androidx.appcompat.widget.m f9671p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9672q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9673r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9674s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9675t;

    /* renamed from: u, reason: collision with root package name */
    public int f9676u;

    /* renamed from: v, reason: collision with root package name */
    public int f9677v;

    /* renamed from: w, reason: collision with root package name */
    public int f9678w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9679x;

    /* renamed from: y, reason: collision with root package name */
    public final android.util.SparseBooleanArray f9680y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f9681z;

    public q(android.content.Context context) {
        super(context, com.tencent.mm.R.layout.f487880ah, com.tencent.mm.R.layout.f487879ag);
        this.f9680y = new android.util.SparseBooleanArray();
        this.E = new androidx.appcompat.widget.o(this);
    }

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
        l();
        androidx.appcompat.widget.i iVar = this.B;
        if (iVar != null && iVar.b()) {
            iVar.f341711j.dismiss();
        }
        o.f0 f0Var = this.f341694h;
        if (f0Var != null) {
            f0Var.a(rVar, z17);
        }
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        androidx.appcompat.widget.ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new androidx.appcompat.widget.ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f9335d = this.F;
        return actionMenuPresenter$SavedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.g0
    public void c(boolean z17) {
        int i17;
        boolean z18;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f341697n;
        java.util.ArrayList arrayList = null;
        boolean z19 = false;
        if (viewGroup != null) {
            o.r rVar = this.f341692f;
            if (rVar != null) {
                rVar.i();
                java.util.ArrayList l17 = this.f341692f.l();
                int size = l17.size();
                i17 = 0;
                for (int i18 = 0; i18 < size; i18++) {
                    o.u uVar = (o.u) l17.get(i18);
                    if ((uVar.D & 32) == 32) {
                        android.view.View childAt = viewGroup.getChildAt(i17);
                        o.u itemData = childAt instanceof o.h0 ? ((o.h0) childAt).getItemData() : null;
                        android.view.View k17 = k(uVar, childAt, viewGroup);
                        if (uVar != itemData) {
                            k17.setPressed(false);
                            k17.jumpDrawablesToCurrentState();
                        }
                        if (k17 != childAt) {
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) k17.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(k17);
                            }
                            ((android.view.ViewGroup) this.f341697n).addView(k17, i17);
                        }
                        i17++;
                    }
                }
            } else {
                i17 = 0;
            }
            while (i17 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i17) == this.f9671p) {
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
        ((android.view.View) this.f341697n).requestLayout();
        o.r rVar2 = this.f341692f;
        if (rVar2 != null) {
            rVar2.i();
            java.util.ArrayList arrayList2 = rVar2.f341788o;
            int size2 = arrayList2.size();
            for (int i19 = 0; i19 < size2; i19++) {
                n3.f fVar = ((o.u) arrayList2.get(i19)).G;
                if (fVar != null) {
                    fVar.f334330a = this;
                }
            }
        }
        o.r rVar3 = this.f341692f;
        if (rVar3 != null) {
            rVar3.i();
            arrayList = rVar3.f341789p;
        }
        if (this.f9674s && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z19 = !((o.u) arrayList.get(0)).I;
            } else if (size3 > 0) {
                z19 = true;
            }
        }
        if (z19) {
            if (this.f9671p == null) {
                this.f9671p = new androidx.appcompat.widget.m(this, this.f341690d);
            }
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.f9671p.getParent();
            if (viewGroup3 != this.f341697n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f9671p);
                }
                androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) this.f341697n;
                androidx.appcompat.widget.m mVar = this.f9671p;
                actionMenuView.getClass();
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = new androidx.appcompat.widget.ActionMenuView.LayoutParams(-2, -2);
                layoutParams.f9416b = 16;
                layoutParams.f9341c = true;
                actionMenuView.addView(mVar, layoutParams);
            }
        } else {
            androidx.appcompat.widget.m mVar2 = this.f9671p;
            if (mVar2 != null) {
                java.lang.Object parent = mVar2.getParent();
                java.lang.Object obj = this.f341697n;
                if (parent == obj) {
                    ((android.view.ViewGroup) obj).removeView(this.f9671p);
                }
            }
        }
        ((androidx.appcompat.widget.ActionMenuView) this.f341697n).setOverflowReserved(this.f9674s);
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
        this.f341691e = context;
        android.view.LayoutInflater.from(context);
        this.f341692f = rVar;
        android.content.res.Resources resources = context.getResources();
        if (!this.f9675t) {
            this.f9674s = true;
        }
        int i17 = 2;
        this.f9676u = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f9678w = i17;
        int i27 = this.f9676u;
        if (this.f9674s) {
            if (this.f9671p == null) {
                androidx.appcompat.widget.m mVar = new androidx.appcompat.widget.m(this, this.f341690d);
                this.f9671p = mVar;
                if (this.f9673r) {
                    mVar.setImageDrawable(this.f9672q);
                    this.f9672q = null;
                    this.f9673r = false;
                }
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f9671p.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i27 -= this.f9671p.getMeasuredWidth();
        } else {
            this.f9671p = null;
        }
        this.f9677v = i27;
        float f17 = resources.getDisplayMetrics().density;
        this.f9681z = null;
    }

    @Override // o.g0
    public boolean e() {
        java.util.ArrayList arrayList;
        int i17;
        int i18;
        boolean z17;
        androidx.appcompat.widget.q qVar = this;
        o.r rVar = qVar.f341692f;
        if (rVar != null) {
            arrayList = rVar.l();
            i17 = arrayList.size();
        } else {
            arrayList = null;
            i17 = 0;
        }
        int i19 = qVar.f9678w;
        int i27 = qVar.f9677v;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) qVar.f341697n;
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
            if (qVar.f9679x && uVar.I) {
                i19 = 0;
            }
            i28++;
        }
        if (qVar.f9674s && (z18 || i37 + i29 > i19)) {
            i19--;
        }
        int i39 = i19 - i29;
        android.util.SparseBooleanArray sparseBooleanArray = qVar.f9680y;
        sparseBooleanArray.clear();
        int i47 = 0;
        int i48 = 0;
        while (i47 < i17) {
            o.u uVar2 = (o.u) arrayList.get(i47);
            int i49 = uVar2.E;
            boolean z19 = (i49 & 2) == i18 ? z17 : false;
            int i57 = uVar2.f341805e;
            if (z19) {
                android.view.View k17 = qVar.k(uVar2, qVar.f9681z, viewGroup);
                if (qVar.f9681z == null) {
                    qVar.f9681z = k17;
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
                    android.view.View k18 = qVar.k(uVar2, qVar.f9681z, viewGroup);
                    if (qVar.f9681z == null) {
                        qVar.f9681z = k18;
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
                        if (uVar3.f341805e == i57) {
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
        if ((parcelable instanceof androidx.appcompat.widget.ActionMenuPresenter$SavedState) && (i17 = ((androidx.appcompat.widget.ActionMenuPresenter$SavedState) parcelable).f9335d) > 0 && (findItem = this.f341692f.findItem(i17)) != null) {
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
            o.r r3 = r8.f341692f
            if (r2 == r3) goto L13
            r0 = r2
            o.o0 r0 = (o.o0) r0
            goto L9
        L13:
            o.i0 r2 = r8.f341697n
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
            o.u r6 = r6.getItemData()
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
            int r0 = r0.f341804d
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
            android.content.Context r4 = r8.f341691e
            r2.<init>(r8, r4, r9, r5)
            r8.B = r2
            r2.f341709h = r0
            o.c0 r2 = r2.f341711j
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
            android.view.View r2 = r0.f341707f
            if (r2 != 0) goto L81
            goto L85
        L81:
            r0.d(r1, r1, r1, r1)
            goto L7a
        L85:
            if (r1 == 0) goto L8f
            o.f0 r0 = r8.f341694h
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q.i(o.o0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v4, types: [o.h0] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public android.view.View k(o.u uVar, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View actionView = uVar.getActionView();
        if (actionView == null || uVar.e()) {
            androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = view instanceof o.h0 ? (o.h0) view : (o.h0) this.f341693g.inflate(this.f341696m, viewGroup, false);
            actionMenuItemView.a(uVar, 0);
            androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((androidx.appcompat.widget.ActionMenuView) this.f341697n);
            if (this.D == null) {
                this.D = new androidx.appcompat.widget.j(this);
            }
            actionMenuItemView2.setPopupCallback(this.D);
            actionView = actionMenuItemView;
        }
        int i17 = uVar.I ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(actionView, arrayList.toArray(), "androidx/appcompat/widget/ActionMenuPresenter", "getItemView", "(Landroidx/appcompat/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        actionView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(actionView, "androidx/appcompat/widget/ActionMenuPresenter", "getItemView", "(Landroidx/appcompat/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public boolean l() {
        java.lang.Object obj;
        androidx.appcompat.widget.k kVar = this.C;
        if (kVar != null && (obj = this.f341697n) != null) {
            ((android.view.View) obj).removeCallbacks(kVar);
            this.C = null;
            return true;
        }
        androidx.appcompat.widget.n nVar = this.A;
        if (nVar == null) {
            return false;
        }
        if (nVar.b()) {
            nVar.f341711j.dismiss();
        }
        return true;
    }

    public boolean m() {
        androidx.appcompat.widget.n nVar = this.A;
        return nVar != null && nVar.b();
    }

    public void n(boolean z17) {
        if (z17) {
            o.f0 f0Var = this.f341694h;
            if (f0Var != null) {
                f0Var.c(null);
                return;
            }
            return;
        }
        o.r rVar = this.f341692f;
        if (rVar != null) {
            rVar.c(false);
        }
    }

    public boolean o() {
        o.r rVar;
        if (!this.f9674s || m() || (rVar = this.f341692f) == null || this.f341697n == null || this.C != null) {
            return false;
        }
        rVar.i();
        if (rVar.f341789p.isEmpty()) {
            return false;
        }
        androidx.appcompat.widget.k kVar = new androidx.appcompat.widget.k(this, new androidx.appcompat.widget.n(this, this.f341691e, this.f341692f, this.f9671p, true));
        this.C = kVar;
        ((android.view.View) this.f341697n).post(kVar);
        o.f0 f0Var = this.f341694h;
        if (f0Var == null) {
            return true;
        }
        f0Var.c(null);
        return true;
    }
}
