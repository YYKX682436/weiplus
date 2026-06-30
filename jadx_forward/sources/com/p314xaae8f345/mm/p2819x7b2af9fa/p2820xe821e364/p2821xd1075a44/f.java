package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e f296040a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d f296041b = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f296042c = new java.util.ArrayList();

    public f(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e eVar) {
        this.f296040a = eVar;
    }

    public void a(android.view.View view, int i17, boolean z17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e eVar = this.f296040a;
        int a17 = i17 < 0 ? ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) eVar).a() : f(i17);
        this.f296041b.e(a17, z17);
        if (z17) {
            i(view);
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) eVar).f296156a;
        c22949xf1deaba4.addView(view, a17);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(view);
        java.util.List list = c22949xf1deaba4.H;
        if (list != null) {
            for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
                ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.k) ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h1) ((java.util.ArrayList) c22949xf1deaba4.H).get(size))).getClass();
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams layoutParams = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view.getLayoutParams();
                if (((android.view.ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                    throw new java.lang.IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public void b(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e eVar = this.f296040a;
        int a17 = i17 < 0 ? ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) eVar).a() : f(i17);
        this.f296041b.e(a17, z17);
        if (z17) {
            i(view);
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0 r0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) eVar;
        r0Var.getClass();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(view);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = r0Var.f296156a;
        if (K != null) {
            if (!K.s() && !K.y()) {
                throw new java.lang.IllegalArgumentException("Called attach on a child which is not detached: " + K + c22949xf1deaba4.B());
            }
            if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Z1) {
                K.m83643x9616526c();
            }
            K.f296245p &= -257;
        } else if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Y1) {
            throw new java.lang.IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + a17 + c22949xf1deaba4.B());
        }
        c22949xf1deaba4.attachViewToParent(view, a17, layoutParams);
    }

    public void c(int i17) {
        int f17 = f(i17);
        this.f296041b.f(f17);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0 r0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) this.f296040a;
        android.view.View childAt = r0Var.f296156a.getChildAt(f17);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = r0Var.f296156a;
        if (childAt != null) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(childAt);
            if (K != null) {
                if (K.s() && !K.y()) {
                    throw new java.lang.IllegalArgumentException("called detach on an already detached child " + K + c22949xf1deaba4.B());
                }
                if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Z1) {
                    K.m83643x9616526c();
                }
                K.c(256);
            }
        } else if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Y1) {
            throw new java.lang.IllegalArgumentException("No view at offset " + f17 + c22949xf1deaba4.B());
        }
        c22949xf1deaba4.detachViewFromParent(f17);
    }

    public android.view.View d(int i17) {
        return ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) this.f296040a).f296156a.getChildAt(f(i17));
    }

    public int e() {
        return ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) this.f296040a).a() - ((java.util.ArrayList) this.f296042c).size();
    }

    public final int f(int i17) {
        if (i17 < 0) {
            return -1;
        }
        int a17 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) this.f296040a).a();
        int i18 = i17;
        while (i18 < a17) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d dVar = this.f296041b;
            int b17 = i17 - (i18 - dVar.b(i18));
            if (b17 == 0) {
                while (dVar.d(i18)) {
                    i18++;
                }
                return i18;
            }
            i18 += b17;
        }
        return -1;
    }

    public android.view.View g(int i17) {
        return ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) this.f296040a).f296156a.getChildAt(i17);
    }

    public int h() {
        return ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) this.f296040a).a();
    }

    public final void i(android.view.View view) {
        ((java.util.ArrayList) this.f296042c).add(view);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0 r0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) this.f296040a;
        r0Var.getClass();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(view);
        if (K != null) {
            int i17 = K.f296252w;
            android.view.View view2 = K.f296236d;
            if (i17 != -1) {
                K.f296251v = i17;
            } else {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                K.f296251v = n3.u0.c(view2);
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = r0Var.f296156a;
            if (c22949xf1deaba4.L()) {
                K.f296252w = 4;
                ((java.util.ArrayList) c22949xf1deaba4.S1).add(K);
            } else {
                java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                n3.u0.s(view2, 4);
            }
        }
    }

    public boolean j(android.view.View view) {
        return ((java.util.ArrayList) this.f296042c).contains(view);
    }

    public final boolean k(android.view.View view) {
        if (!((java.util.ArrayList) this.f296042c).remove(view)) {
            return false;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0 r0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) this.f296040a;
        r0Var.getClass();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(view);
        if (K == null) {
            return true;
        }
        int i17 = K.f296251v;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = r0Var.f296156a;
        if (c22949xf1deaba4.L()) {
            K.f296252w = i17;
            ((java.util.ArrayList) c22949xf1deaba4.S1).add(K);
        } else {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.s(K.f296236d, i17);
        }
        K.f296251v = 0;
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m83634x9616526c() {
        return this.f296041b.m83632x9616526c() + ", hidden list:" + ((java.util.ArrayList) this.f296042c).size();
    }
}
