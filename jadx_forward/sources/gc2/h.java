package gc2;

/* loaded from: classes10.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f351943d;

    /* renamed from: e, reason: collision with root package name */
    public gc2.c f351944e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f351945f;

    /* renamed from: g, reason: collision with root package name */
    public int f351946g;

    /* renamed from: h, reason: collision with root package name */
    public int f351947h;

    /* renamed from: i, reason: collision with root package name */
    public final gc2.g f351948i;

    /* renamed from: m, reason: collision with root package name */
    public int f351949m;

    /* renamed from: n, reason: collision with root package name */
    public int f351950n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f351951o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f351952p;

    /* renamed from: q, reason: collision with root package name */
    public int f351953q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f351954r;

    public h(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mRecyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mRecyclerView, "mRecyclerView");
        this.f351943d = mRecyclerView;
        this.f351953q = -1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mRecyclerView.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1162x665295de);
        this.f351945f = c1162x665295de;
        this.f351948i = new gc2.g();
        c();
    }

    public final void a(int i17) {
        gc2.c cVar = this.f351944e;
        if (cVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
            cVar.a(this.f351943d, i17);
        }
    }

    public final void b(int i17) {
        int i18;
        if ((this.f351946g == 3 && this.f351947h == 0) || this.f351947h == i17) {
            return;
        }
        this.f351947h = i17;
        gc2.c cVar = this.f351944e;
        if (cVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
            cVar.b(this.f351943d, i17);
        }
        if (i17 != 0 || (i18 = this.f351953q) == -1) {
            return;
        }
        this.f351953q = -1;
        if (this.f351949m != i18) {
            a(i18);
        }
    }

    public final void c() {
        this.f351946g = 0;
        this.f351947h = 0;
        gc2.g gVar = this.f351948i;
        gVar.f351940a = -1;
        gVar.f351941b = 0.0f;
        gVar.f351942c = 0;
        this.f351949m = -1;
        this.f351950n = -1;
        this.f351951o = false;
        this.f351952p = false;
        this.f351953q = -1;
    }

    public final void d(boolean z17) {
        this.f351946g = z17 ? 4 : 1;
        int i17 = this.f351950n;
        if (i17 != -1) {
            this.f351949m = i17;
            this.f351950n = -1;
        } else if (this.f351949m == -1) {
            this.f351949m = this.f351945f.w();
        }
        b(1);
    }

    public final void e() {
        int top;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f351945f;
        int w17 = c1162x665295de.w();
        gc2.g gVar = this.f351948i;
        gVar.f351940a = w17;
        if (w17 == -1) {
            gVar.f351940a = -1;
            gVar.f351941b = 0.0f;
            gVar.f351942c = 0;
            return;
        }
        android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(w17);
        if (mo7935xa188593e == null) {
            gVar.f351940a = -1;
            gVar.f351941b = 0.0f;
            gVar.f351942c = 0;
            return;
        }
        int m8023xe96e78b9 = c1162x665295de.m8023xe96e78b9(mo7935xa188593e);
        int m8033x269429b0 = c1162x665295de.m8033x269429b0(mo7935xa188593e);
        int m8035xd0248a36 = c1162x665295de.m8035xd0248a36(mo7935xa188593e);
        int m8006xda9e9138 = c1162x665295de.m8006xda9e9138(mo7935xa188593e);
        android.view.ViewGroup.LayoutParams layoutParams = mo7935xa188593e.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            m8023xe96e78b9 += marginLayoutParams.leftMargin;
            m8033x269429b0 += marginLayoutParams.rightMargin;
            m8035xd0248a36 += marginLayoutParams.topMargin;
            m8006xda9e9138 += marginLayoutParams.bottomMargin;
        }
        int height = mo7935xa188593e.getHeight() + m8035xd0248a36 + m8006xda9e9138;
        int width = mo7935xa188593e.getWidth() + m8023xe96e78b9 + m8033x269429b0;
        boolean z17 = c1162x665295de.H() == 0;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f351943d;
        if (z17) {
            top = (mo7935xa188593e.getLeft() - m8023xe96e78b9) - c1163xf1deaba4.getPaddingLeft();
            height = width;
        } else {
            top = (mo7935xa188593e.getTop() - m8035xd0248a36) - c1163xf1deaba4.getPaddingTop();
        }
        int i17 = -top;
        gVar.f351942c = i17;
        if (i17 < 0) {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "Page can only be offset by a positive amount, not by %d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderScrollEventAdapter", format);
        }
        gVar.f351941b = height != 0 ? gVar.f351942c / height : 0.0f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        gc2.c cVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int i18 = this.f351946g;
        boolean z17 = true;
        if (!(i18 == 1 && this.f351947h == 1) && i17 == 1) {
            d(false);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if ((i18 == 1 || i18 == 4) && i17 == 2) {
            if (this.f351952p) {
                b(2);
                this.f351951o = true;
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if ((i18 == 1 || i18 == 4) && i17 == 0) {
            e();
            boolean z18 = this.f351952p;
            gc2.g gVar = this.f351948i;
            if (!z18) {
                int i19 = gVar.f351940a;
                if (i19 != -1 && (cVar = this.f351944e) != null) {
                    cVar.c(this.f351943d, i19, 0.0f, 0);
                }
            } else if (gVar.f351942c == 0) {
                int i27 = this.f351949m;
                int i28 = gVar.f351940a;
                if (i27 != i28) {
                    a(i28);
                }
            } else {
                z17 = false;
            }
            if (z17) {
                b(0);
                c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if ((r8 < 0) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r2 = "onScrolled"
            java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView;II)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.add(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "recyclerView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            r7 = 1
            r6.f351952p = r7
            r6.e()
            boolean r0 = r6.f351951o
            r1 = -1
            gc2.g r2 = r6.f351948i
            r3 = 0
            if (r0 == 0) goto L6c
            r6.f351951o = r3
            if (r9 > 0) goto L4e
            if (r9 != 0) goto L4c
            if (r8 >= 0) goto L48
            r8 = r7
            goto L49
        L48:
            r8 = r3
        L49:
            if (r8 != 0) goto L4c
            goto L4e
        L4c:
            r8 = r3
            goto L4f
        L4e:
            r8 = r7
        L4f:
            if (r8 == 0) goto L59
            int r8 = r2.f351942c
            if (r8 == 0) goto L59
            int r8 = r2.f351940a
            int r8 = r8 + r7
            goto L5b
        L59:
            int r8 = r2.f351940a
        L5b:
            r6.f351950n = r8
            int r9 = r6.f351949m
            if (r9 == r8) goto L78
            boolean r9 = r6.f351954r
            if (r9 == 0) goto L68
            r6.f351953q = r8
            goto L78
        L68:
            r6.a(r8)
            goto L78
        L6c:
            int r8 = r6.f351946g
            if (r8 != 0) goto L78
            int r8 = r2.f351940a
            if (r8 != r1) goto L75
            r8 = r3
        L75:
            r6.a(r8)
        L78:
            int r8 = r2.f351940a
            if (r8 != r1) goto L7d
            r8 = r3
        L7d:
            float r9 = r2.f351941b
            int r0 = r2.f351942c
            gc2.c r4 = r6.f351944e
            if (r4 == 0) goto L8a
            androidx.recyclerview.widget.RecyclerView r5 = r6.f351943d
            r4.c(r5, r8, r9, r0)
        L8a:
            int r8 = r2.f351940a
            int r9 = r6.f351950n
            if (r8 == r9) goto L92
            if (r9 != r1) goto La0
        L92:
            int r8 = r2.f351942c
            if (r8 != 0) goto La0
            int r8 = r6.f351947h
            if (r8 == r7) goto La0
            r6.b(r3)
            r6.c()
        La0:
            java.lang.String r7 = "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter"
            java.lang.String r8 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r9 = "onScrolled"
            java.lang.String r0 = "(Landroidx/recyclerview/widget/RecyclerView;II)V"
            yj0.a.h(r6, r7, r8, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc2.h.mo482x8d21972b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
