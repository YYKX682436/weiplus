package androidx.transition;

/* loaded from: classes13.dex */
public abstract class Transition implements java.lang.Cloneable {
    public static final int[] I = {2, 1, 3, 4};

    /* renamed from: J, reason: collision with root package name */
    public static final androidx.transition.PathMotion f12380J = new u4.v0();
    public static final java.lang.ThreadLocal K = new java.lang.ThreadLocal();
    public int A;
    public boolean B;
    public boolean C;
    public java.util.ArrayList D;
    public java.util.ArrayList E;
    public u4.h1 F;
    public u4.a1 G;
    public androidx.transition.PathMotion H;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f12381d;

    /* renamed from: e, reason: collision with root package name */
    public long f12382e;

    /* renamed from: f, reason: collision with root package name */
    public long f12383f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.TimeInterpolator f12384g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f12385h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f12386i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f12387m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f12388n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f12389o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f12390p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f12391q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f12392r;

    /* renamed from: s, reason: collision with root package name */
    public u4.n1 f12393s;

    /* renamed from: t, reason: collision with root package name */
    public u4.n1 f12394t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.transition.TransitionSet f12395u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f12396v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.ArrayList f12397w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f12398x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12399y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f12400z;

    public Transition() {
        this.f12381d = getClass().getName();
        this.f12382e = -1L;
        this.f12383f = -1L;
        this.f12384g = null;
        this.f12385h = new java.util.ArrayList();
        this.f12386i = new java.util.ArrayList();
        this.f12387m = null;
        this.f12388n = null;
        this.f12389o = null;
        this.f12390p = null;
        this.f12391q = null;
        this.f12392r = null;
        this.f12393s = new u4.n1();
        this.f12394t = new u4.n1();
        this.f12395u = null;
        this.f12396v = I;
        this.f12399y = false;
        this.f12400z = new java.util.ArrayList();
        this.A = 0;
        this.B = false;
        this.C = false;
        this.D = null;
        this.E = new java.util.ArrayList();
        this.H = f12380J;
    }

    public static boolean B(u4.m1 m1Var, u4.m1 m1Var2, java.lang.String str) {
        java.lang.Object obj = ((java.util.HashMap) m1Var.f424514a).get(str);
        java.lang.Object obj2 = ((java.util.HashMap) m1Var2.f424514a).get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void f(u4.n1 n1Var, android.view.View view, u4.m1 m1Var) {
        n1Var.f424518a.put(view, m1Var);
        int id6 = view.getId();
        if (id6 >= 0) {
            android.util.SparseArray sparseArray = n1Var.f424519b;
            if (sparseArray.indexOfKey(id6) >= 0) {
                sparseArray.put(id6, null);
            } else {
                sparseArray.put(id6, view);
            }
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        java.lang.String k17 = n3.a1.k(view);
        if (k17 != null) {
            x.b bVar = n1Var.f424521d;
            if (bVar.containsKey(k17)) {
                bVar.put(k17, null);
            } else {
                bVar.put(k17, view);
            }
        }
        if (view.getParent() instanceof android.widget.ListView) {
            android.widget.ListView listView = (android.widget.ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                x.f fVar = n1Var.f424520c;
                if (fVar.f450821d) {
                    fVar.b();
                }
                if (x.e.b(fVar.f450822e, fVar.f450824g, itemIdAtPosition) < 0) {
                    n3.u0.r(view, true);
                    fVar.d(itemIdAtPosition, view);
                    return;
                }
                android.view.View view2 = (android.view.View) fVar.c(itemIdAtPosition, null);
                if (view2 != null) {
                    n3.u0.r(view2, false);
                    fVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static x.b w() {
        java.lang.ThreadLocal threadLocal = K;
        x.b bVar = (x.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        x.b bVar2 = new x.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public boolean A(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int id6 = view.getId();
        java.util.ArrayList arrayList3 = this.f12389o;
        if (arrayList3 != null && arrayList3.contains(java.lang.Integer.valueOf(id6))) {
            return false;
        }
        java.util.ArrayList arrayList4 = this.f12390p;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        java.util.ArrayList arrayList5 = this.f12391q;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (((java.lang.Class) this.f12391q.get(i17)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f12392r != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.a1.k(view) != null && this.f12392r.contains(n3.a1.k(view))) {
                return false;
            }
        }
        java.util.ArrayList arrayList6 = this.f12385h;
        int size2 = arrayList6.size();
        java.util.ArrayList arrayList7 = this.f12386i;
        if ((size2 == 0 && arrayList7.size() == 0 && (((arrayList = this.f12388n) == null || arrayList.isEmpty()) && ((arrayList2 = this.f12387m) == null || arrayList2.isEmpty()))) || arrayList6.contains(java.lang.Integer.valueOf(id6)) || arrayList7.contains(view)) {
            return true;
        }
        java.util.ArrayList arrayList8 = this.f12387m;
        if (arrayList8 != null) {
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            if (arrayList8.contains(n3.a1.k(view))) {
                return true;
            }
        }
        if (this.f12388n != null) {
            for (int i18 = 0; i18 < this.f12388n.size(); i18++) {
                if (((java.lang.Class) this.f12388n.get(i18)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void C(android.view.View view) {
        int i17;
        if (this.C) {
            return;
        }
        x.b w17 = w();
        int i18 = w17.f450846f;
        u4.a2 a2Var = u4.w1.f424572a;
        android.view.WindowId windowId = view.getWindowId();
        int i19 = i18 - 1;
        while (true) {
            i17 = 0;
            if (i19 < 0) {
                break;
            }
            u4.y0 y0Var = (u4.y0) w17.l(i19);
            if (y0Var.f424584a != null) {
                u4.g2 g2Var = y0Var.f424587d;
                if ((g2Var instanceof u4.f2) && ((u4.f2) g2Var).f424477a.equals(windowId)) {
                    i17 = 1;
                }
                if (i17 != 0) {
                    ((android.animation.Animator) w17.h(i19)).pause();
                }
            }
            i19--;
        }
        java.util.ArrayList arrayList = this.D;
        if (arrayList != null && arrayList.size() > 0) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.D.clone();
            int size = arrayList2.size();
            while (i17 < size) {
                ((u4.b1) arrayList2.get(i17)).c(this);
                i17++;
            }
        }
        this.B = true;
    }

    public androidx.transition.Transition E(u4.b1 b1Var) {
        java.util.ArrayList arrayList = this.D;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(b1Var);
        if (this.D.size() == 0) {
            this.D = null;
        }
        return this;
    }

    public androidx.transition.Transition F(android.view.View view) {
        this.f12386i.remove(view);
        return this;
    }

    public void G(android.view.View view) {
        if (this.B) {
            if (!this.C) {
                x.b w17 = w();
                int i17 = w17.f450846f;
                u4.a2 a2Var = u4.w1.f424572a;
                android.view.WindowId windowId = view.getWindowId();
                for (int i18 = i17 - 1; i18 >= 0; i18--) {
                    u4.y0 y0Var = (u4.y0) w17.l(i18);
                    if (y0Var.f424584a != null) {
                        u4.g2 g2Var = y0Var.f424587d;
                        if ((g2Var instanceof u4.f2) && ((u4.f2) g2Var).f424477a.equals(windowId)) {
                            ((android.animation.Animator) w17.h(i18)).resume();
                        }
                    }
                }
                java.util.ArrayList arrayList = this.D;
                if (arrayList != null && arrayList.size() > 0) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) this.D.clone();
                    int size = arrayList2.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        ((u4.b1) arrayList2.get(i19)).a(this);
                    }
                }
            }
            this.B = false;
        }
    }

    public void H() {
        R();
        x.b w17 = w();
        java.util.Iterator it = this.E.iterator();
        while (it.hasNext()) {
            android.animation.Animator animator = (android.animation.Animator) it.next();
            if (w17.containsKey(animator)) {
                R();
                if (animator != null) {
                    animator.addListener(new u4.w0(this, w17));
                    long j17 = this.f12383f;
                    if (j17 >= 0) {
                        animator.setDuration(j17);
                    }
                    long j18 = this.f12382e;
                    if (j18 >= 0) {
                        animator.setStartDelay(j18);
                    }
                    android.animation.TimeInterpolator timeInterpolator = this.f12384g;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new u4.x0(this));
                    animator.start();
                }
            }
        }
        this.E.clear();
        p();
    }

    public void I(boolean z17) {
        this.f12399y = z17;
    }

    public androidx.transition.Transition J(long j17) {
        this.f12383f = j17;
        return this;
    }

    public void K(u4.a1 a1Var) {
        this.G = a1Var;
    }

    public androidx.transition.Transition L(android.animation.TimeInterpolator timeInterpolator) {
        this.f12384g = timeInterpolator;
        return this;
    }

    public void N(androidx.transition.PathMotion pathMotion) {
        if (pathMotion == null) {
            this.H = f12380J;
        } else {
            this.H = pathMotion;
        }
    }

    public void O(u4.h1 h1Var) {
        this.F = h1Var;
    }

    public androidx.transition.Transition P(android.view.ViewGroup viewGroup) {
        return this;
    }

    public androidx.transition.Transition Q(long j17) {
        this.f12382e = j17;
        return this;
    }

    public void R() {
        if (this.A == 0) {
            java.util.ArrayList arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.D.clone();
                int size = arrayList2.size();
                for (int i17 = 0; i17 < size; i17++) {
                    ((u4.b1) arrayList2.get(i17)).b(this);
                }
            }
            this.C = false;
        }
        this.A++;
    }

    public java.lang.String S(java.lang.String str) {
        java.lang.String str2 = str + getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(hashCode()) + ": ";
        if (this.f12383f != -1) {
            str2 = str2 + "dur(" + this.f12383f + ") ";
        }
        if (this.f12382e != -1) {
            str2 = str2 + "dly(" + this.f12382e + ") ";
        }
        if (this.f12384g != null) {
            str2 = str2 + "interp(" + this.f12384g + ") ";
        }
        java.util.ArrayList arrayList = this.f12385h;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.f12386i;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        java.lang.String str3 = str2 + "tgts(";
        if (arrayList.size() > 0) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (i17 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + arrayList.get(i17);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                if (i18 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + arrayList2.get(i18);
            }
        }
        return str3 + ")";
    }

    public androidx.transition.Transition a(u4.b1 b1Var) {
        if (this.D == null) {
            this.D = new java.util.ArrayList();
        }
        this.D.add(b1Var);
        return this;
    }

    public androidx.transition.Transition b(int i17) {
        if (i17 != 0) {
            this.f12385h.add(java.lang.Integer.valueOf(i17));
        }
        return this;
    }

    public androidx.transition.Transition c(android.view.View view) {
        this.f12386i.add(view);
        return this;
    }

    public androidx.transition.Transition d(java.lang.Class cls) {
        if (this.f12388n == null) {
            this.f12388n = new java.util.ArrayList();
        }
        this.f12388n.add(cls);
        return this;
    }

    public androidx.transition.Transition e(java.lang.String str) {
        if (this.f12387m == null) {
            this.f12387m = new java.util.ArrayList();
        }
        this.f12387m.add(str);
        return this;
    }

    public abstract void g(u4.m1 m1Var);

    public final void h(android.view.View view, boolean z17) {
        if (view == null) {
            return;
        }
        int id6 = view.getId();
        java.util.ArrayList arrayList = this.f12389o;
        if (arrayList == null || !arrayList.contains(java.lang.Integer.valueOf(id6))) {
            java.util.ArrayList arrayList2 = this.f12390p;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                java.util.ArrayList arrayList3 = this.f12391q;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        if (((java.lang.Class) this.f12391q.get(i17)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof android.view.ViewGroup) {
                    u4.m1 m1Var = new u4.m1();
                    m1Var.f424515b = view;
                    if (z17) {
                        j(m1Var);
                    } else {
                        g(m1Var);
                    }
                    m1Var.f424516c.add(this);
                    i(m1Var);
                    if (z17) {
                        f(this.f12393s, view, m1Var);
                    } else {
                        f(this.f12394t, view, m1Var);
                    }
                }
                if (view instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                        h(viewGroup.getChildAt(i18), z17);
                    }
                }
            }
        }
    }

    public void i(u4.m1 m1Var) {
        java.util.Map map;
        boolean z17;
        if (this.F == null || ((java.util.HashMap) m1Var.f424514a).isEmpty()) {
            return;
        }
        this.F.getClass();
        java.lang.String[] strArr = u4.e2.f424472a;
        int i17 = 0;
        while (true) {
            map = m1Var.f424514a;
            if (i17 >= 2) {
                z17 = true;
                break;
            } else {
                if (!((java.util.HashMap) map).containsKey(strArr[i17])) {
                    z17 = false;
                    break;
                }
                i17++;
            }
        }
        if (z17) {
            return;
        }
        ((u4.e2) this.F).getClass();
        android.view.View view = m1Var.f424515b;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        java.lang.Integer num = (java.lang.Integer) hashMap.get("android:visibility:visibility");
        if (num == null) {
            num = java.lang.Integer.valueOf(view.getVisibility());
        }
        hashMap.put("android:visibilityPropagation:visibility", num);
        view.getLocationOnScreen(r0);
        int round = r0[0] + java.lang.Math.round(view.getTranslationX());
        int[] iArr = {round};
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + java.lang.Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        hashMap.put("android:visibilityPropagation:center", iArr);
    }

    public abstract void j(u4.m1 m1Var);

    public void k(android.view.ViewGroup viewGroup, boolean z17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        l(z17);
        java.util.ArrayList arrayList3 = this.f12385h;
        int size = arrayList3.size();
        java.util.ArrayList arrayList4 = this.f12386i;
        if ((size <= 0 && arrayList4.size() <= 0) || (((arrayList = this.f12387m) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f12388n) != null && !arrayList2.isEmpty()))) {
            h(viewGroup, z17);
            return;
        }
        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
            android.view.View findViewById = viewGroup.findViewById(((java.lang.Integer) arrayList3.get(i17)).intValue());
            if (findViewById != null) {
                u4.m1 m1Var = new u4.m1();
                m1Var.f424515b = findViewById;
                if (z17) {
                    j(m1Var);
                } else {
                    g(m1Var);
                }
                m1Var.f424516c.add(this);
                i(m1Var);
                if (z17) {
                    f(this.f12393s, findViewById, m1Var);
                } else {
                    f(this.f12394t, findViewById, m1Var);
                }
            }
        }
        for (int i18 = 0; i18 < arrayList4.size(); i18++) {
            android.view.View view = (android.view.View) arrayList4.get(i18);
            u4.m1 m1Var2 = new u4.m1();
            m1Var2.f424515b = view;
            if (z17) {
                j(m1Var2);
            } else {
                g(m1Var2);
            }
            m1Var2.f424516c.add(this);
            i(m1Var2);
            if (z17) {
                f(this.f12393s, view, m1Var2);
            } else {
                f(this.f12394t, view, m1Var2);
            }
        }
    }

    public void l(boolean z17) {
        if (z17) {
            this.f12393s.f424518a.clear();
            this.f12393s.f424519b.clear();
            this.f12393s.f424520c.clear();
        } else {
            this.f12394t.f424518a.clear();
            this.f12394t.f424519b.clear();
            this.f12394t.f424520c.clear();
        }
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public androidx.transition.Transition clone() {
        try {
            androidx.transition.Transition transition = (androidx.transition.Transition) super.clone();
            transition.E = new java.util.ArrayList();
            transition.f12393s = new u4.n1();
            transition.f12394t = new u4.n1();
            transition.f12397w = null;
            transition.f12398x = null;
            return transition;
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public android.animation.Animator n(android.view.ViewGroup viewGroup, u4.m1 m1Var, u4.m1 m1Var2) {
        return null;
    }

    public void o(android.view.ViewGroup viewGroup, u4.n1 n1Var, u4.n1 n1Var2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.animation.Animator n17;
        int i17;
        android.view.View view;
        android.animation.Animator animator;
        u4.m1 m1Var;
        android.animation.Animator animator2;
        u4.m1 m1Var2;
        x.b w17 = w();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int size = arrayList.size();
        long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        int i18 = 0;
        while (i18 < size) {
            u4.m1 m1Var3 = (u4.m1) arrayList.get(i18);
            u4.m1 m1Var4 = (u4.m1) arrayList2.get(i18);
            if (m1Var3 != null && !m1Var3.f424516c.contains(this)) {
                m1Var3 = null;
            }
            if (m1Var4 != null && !m1Var4.f424516c.contains(this)) {
                m1Var4 = null;
            }
            if (m1Var3 != null || m1Var4 != null) {
                if ((m1Var3 == null || m1Var4 == null || z(m1Var3, m1Var4)) && (n17 = n(viewGroup, m1Var3, m1Var4)) != null) {
                    if (m1Var4 != null) {
                        view = m1Var4.f424515b;
                        java.lang.String[] x17 = x();
                        if (view == null || x17 == null || x17.length <= 0) {
                            i17 = size;
                            animator2 = n17;
                            m1Var2 = null;
                        } else {
                            u4.m1 m1Var5 = new u4.m1();
                            m1Var5.f424515b = view;
                            i17 = size;
                            u4.m1 m1Var6 = (u4.m1) n1Var2.f424518a.getOrDefault(view, null);
                            if (m1Var6 != null) {
                                int i19 = 0;
                                while (i19 < x17.length) {
                                    java.util.Map map = m1Var5.f424514a;
                                    java.lang.String str = x17[i19];
                                    ((java.util.HashMap) map).put(str, ((java.util.HashMap) m1Var6.f424514a).get(str));
                                    i19++;
                                    x17 = x17;
                                }
                            }
                            int i27 = w17.f450846f;
                            int i28 = 0;
                            while (true) {
                                if (i28 >= i27) {
                                    m1Var2 = m1Var5;
                                    animator2 = n17;
                                    break;
                                }
                                u4.y0 y0Var = (u4.y0) w17.getOrDefault((android.animation.Animator) w17.h(i28), null);
                                if (y0Var.f424586c != null && y0Var.f424584a == view && y0Var.f424585b.equals(this.f12381d) && y0Var.f424586c.equals(m1Var5)) {
                                    m1Var2 = m1Var5;
                                    animator2 = null;
                                    break;
                                }
                                i28++;
                            }
                        }
                        animator = animator2;
                        m1Var = m1Var2;
                    } else {
                        i17 = size;
                        view = m1Var3.f424515b;
                        animator = n17;
                        m1Var = null;
                    }
                    if (animator != null) {
                        u4.h1 h1Var = this.F;
                        if (h1Var != null) {
                            long a17 = h1Var.a(viewGroup, this, m1Var3, m1Var4);
                            sparseIntArray.put(this.E.size(), (int) a17);
                            j17 = java.lang.Math.min(a17, j17);
                        }
                        long j18 = j17;
                        java.lang.String str2 = this.f12381d;
                        u4.a2 a2Var = u4.w1.f424572a;
                        w17.put(animator, new u4.y0(view, str2, this, new u4.f2(viewGroup), m1Var));
                        this.E.add(animator);
                        j17 = j18;
                    }
                    i18++;
                    size = i17;
                }
            }
            i17 = size;
            i18++;
            size = i17;
        }
        if (j17 != 0) {
            for (int i29 = 0; i29 < sparseIntArray.size(); i29++) {
                android.animation.Animator animator3 = (android.animation.Animator) this.E.get(sparseIntArray.keyAt(i29));
                animator3.setStartDelay((sparseIntArray.valueAt(i29) - j17) + animator3.getStartDelay());
            }
        }
    }

    public void p() {
        int i17 = this.A - 1;
        this.A = i17;
        if (i17 == 0) {
            java.util.ArrayList arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.D.clone();
                int size = arrayList2.size();
                for (int i18 = 0; i18 < size; i18++) {
                    ((u4.b1) arrayList2.get(i18)).d(this);
                }
            }
            for (int i19 = 0; i19 < this.f12393s.f424520c.e(); i19++) {
                android.view.View view = (android.view.View) this.f12393s.f424520c.f(i19);
                if (view != null) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    n3.u0.r(view, false);
                }
            }
            for (int i27 = 0; i27 < this.f12394t.f424520c.e(); i27++) {
                android.view.View view2 = (android.view.View) this.f12394t.f424520c.f(i27);
                if (view2 != null) {
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                    n3.u0.r(view2, false);
                }
            }
            this.C = true;
        }
    }

    public androidx.transition.Transition q(int i17, boolean z17) {
        java.util.ArrayList arrayList = this.f12389o;
        if (i17 > 0) {
            arrayList = z17 ? u4.z0.a(arrayList, java.lang.Integer.valueOf(i17)) : u4.z0.b(arrayList, java.lang.Integer.valueOf(i17));
        }
        this.f12389o = arrayList;
        return this;
    }

    public androidx.transition.Transition r(android.view.View view, boolean z17) {
        java.util.ArrayList arrayList = this.f12390p;
        if (view != null) {
            arrayList = z17 ? u4.z0.a(arrayList, view) : u4.z0.b(arrayList, view);
        }
        this.f12390p = arrayList;
        return this;
    }

    public androidx.transition.Transition s(java.lang.Class cls, boolean z17) {
        java.util.ArrayList arrayList = this.f12391q;
        if (cls != null) {
            arrayList = z17 ? u4.z0.a(arrayList, cls) : u4.z0.b(arrayList, cls);
        }
        this.f12391q = arrayList;
        return this;
    }

    public androidx.transition.Transition t(java.lang.String str, boolean z17) {
        java.util.ArrayList arrayList = this.f12392r;
        if (str != null) {
            arrayList = z17 ? u4.z0.a(arrayList, str) : u4.z0.b(arrayList, str);
        }
        this.f12392r = arrayList;
        return this;
    }

    public java.lang.String toString() {
        return S("");
    }

    public void u(android.view.ViewGroup viewGroup) {
        x.b w17 = w();
        int i17 = w17.f450846f;
        if (viewGroup != null) {
            u4.a2 a2Var = u4.w1.f424572a;
            android.view.WindowId windowId = viewGroup.getWindowId();
            for (int i18 = i17 - 1; i18 >= 0; i18--) {
                u4.y0 y0Var = (u4.y0) w17.l(i18);
                if (y0Var.f424584a != null) {
                    u4.g2 g2Var = y0Var.f424587d;
                    if ((g2Var instanceof u4.f2) && ((u4.f2) g2Var).f424477a.equals(windowId)) {
                        ((android.animation.Animator) w17.h(i18)).end();
                    }
                }
            }
        }
    }

    public u4.m1 v(android.view.View view, boolean z17) {
        androidx.transition.TransitionSet transitionSet = this.f12395u;
        if (transitionSet != null) {
            return transitionSet.v(view, z17);
        }
        java.util.ArrayList arrayList = z17 ? this.f12397w : this.f12398x;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                i17 = -1;
                break;
            }
            u4.m1 m1Var = (u4.m1) arrayList.get(i17);
            if (m1Var == null) {
                return null;
            }
            if (m1Var.f424515b == view) {
                break;
            }
            i17++;
        }
        if (i17 >= 0) {
            return (u4.m1) (z17 ? this.f12398x : this.f12397w).get(i17);
        }
        return null;
    }

    public java.lang.String[] x() {
        return null;
    }

    public u4.m1 y(android.view.View view, boolean z17) {
        androidx.transition.TransitionSet transitionSet = this.f12395u;
        if (transitionSet != null) {
            return transitionSet.y(view, z17);
        }
        return (u4.m1) (z17 ? this.f12393s : this.f12394t).f424518a.getOrDefault(view, null);
    }

    public boolean z(u4.m1 m1Var, u4.m1 m1Var2) {
        if (m1Var == null || m1Var2 == null) {
            return false;
        }
        java.lang.String[] x17 = x();
        if (x17 == null) {
            java.util.Iterator it = ((java.util.HashMap) m1Var.f424514a).keySet().iterator();
            while (it.hasNext()) {
                if (B(m1Var, m1Var2, (java.lang.String) it.next())) {
                }
            }
            return false;
        }
        for (java.lang.String str : x17) {
            if (!B(m1Var, m1Var2, str)) {
            }
        }
        return false;
        return true;
    }

    public Transition(android.content.Context context, android.util.AttributeSet attributeSet) {
        boolean z17;
        this.f12381d = getClass().getName();
        this.f12382e = -1L;
        this.f12383f = -1L;
        this.f12384g = null;
        this.f12385h = new java.util.ArrayList();
        this.f12386i = new java.util.ArrayList();
        this.f12387m = null;
        this.f12388n = null;
        this.f12389o = null;
        this.f12390p = null;
        this.f12391q = null;
        this.f12392r = null;
        this.f12393s = new u4.n1();
        this.f12394t = new u4.n1();
        this.f12395u = null;
        int[] iArr = I;
        this.f12396v = iArr;
        this.f12399y = false;
        this.f12400z = new java.util.ArrayList();
        this.A = 0;
        this.B = false;
        this.C = false;
        this.D = null;
        this.E = new java.util.ArrayList();
        this.H = f12380J;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.u0.f424558b);
        android.content.res.XmlResourceParser xmlResourceParser = (android.content.res.XmlResourceParser) attributeSet;
        long e17 = d3.r.e(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (e17 >= 0) {
            J(e17);
        }
        long e18 = d3.r.e(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (e18 > 0) {
            Q(e18);
        }
        int f17 = d3.r.f(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (f17 > 0) {
            L(android.view.animation.AnimationUtils.loadInterpolator(context, f17));
        }
        java.lang.String g17 = d3.r.g(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (g17 != null) {
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(g17, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i17 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                java.lang.String trim = stringTokenizer.nextToken().trim();
                if (dm.i4.COL_ID.equalsIgnoreCase(trim)) {
                    iArr2[i17] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr2[i17] = 1;
                } else if (com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME.equalsIgnoreCase(trim)) {
                    iArr2[i17] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr2[i17] = 4;
                } else if (trim.isEmpty()) {
                    int[] iArr3 = new int[iArr2.length - 1];
                    java.lang.System.arraycopy(iArr2, 0, iArr3, 0, i17);
                    i17--;
                    iArr2 = iArr3;
                } else {
                    throw new android.view.InflateException("Unknown match type in matchOrder: '" + trim + "'");
                }
                i17++;
            }
            if (iArr2.length == 0) {
                this.f12396v = iArr;
            } else {
                for (int i18 = 0; i18 < iArr2.length; i18++) {
                    int i19 = iArr2[i18];
                    if (!(i19 >= 1 && i19 <= 4)) {
                        throw new java.lang.IllegalArgumentException("matches contains invalid value");
                    }
                    int i27 = 0;
                    while (true) {
                        if (i27 >= i18) {
                            z17 = false;
                            break;
                        } else {
                            if (iArr2[i27] == i19) {
                                z17 = true;
                                break;
                            }
                            i27++;
                        }
                    }
                    if (z17) {
                        throw new java.lang.IllegalArgumentException("matches contains a duplicate value");
                    }
                }
                this.f12396v = (int[]) iArr2.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }
}
