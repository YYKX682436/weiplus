package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a;

/* renamed from: com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference */
/* loaded from: classes11.dex */
public class C19662x4f7a67f3 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public int L;
    public lz.f M;
    public lz.j N;

    public C19662x4f7a67f3(android.content.Context context, int i17) {
        super(context);
        this.L = -1;
        if (i17 == 0) {
            M();
        } else if (i17 == 1) {
            this.L = 1;
            ((kz.a) ((lz.k) i95.n0.c(lz.k.class))).getClass();
            this.N = new r35.k2();
        }
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bz7;
    }

    public final void M() {
        this.L = 0;
        ((kz.a) ((lz.k) i95.n0.c(lz.k.class))).getClass();
        this.M = new r35.u1(this.f279303d);
    }

    public void N() {
        lz.f fVar = this.M;
        if (fVar != null) {
            r35.v1 v1Var = ((r35.u1) fVar).f450807f;
            v1Var.f450826i = false;
            v1Var.h();
        }
    }

    public void O(java.lang.String str, java.util.List list, boolean z17) {
        lz.f fVar = this.M;
        if (fVar != null) {
            r35.u1 u1Var = (r35.u1) fVar;
            u1Var.f450811j = str;
            if (list == null) {
                list = new java.util.ArrayList(0);
            }
            r35.v1 v1Var = u1Var.f450807f;
            v1Var.f450840z = true;
            v1Var.f450823f = list;
            v1Var.F = z17;
            v1Var.f450822e = null;
            u1Var.a(str);
        }
    }

    public void Q(java.util.List list) {
        O(null, list, true);
    }

    public void R(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, java.lang.String str) {
        lz.f fVar = this.M;
        if (fVar != null) {
            r35.u1 u1Var = (r35.u1) fVar;
            u1Var.getClass();
            if (rVar == null || str == null) {
                return;
            }
            u1Var.f450803b = rVar;
            u1Var.f450804c = str;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).m(str, true);
        }
    }

    public void S(java.util.List list) {
        lz.f fVar = this.M;
        if (fVar != null) {
            r35.v1 v1Var = ((r35.u1) fVar).f450807f;
            v1Var.f450840z = true;
            v1Var.f450823f = list;
            v1Var.h();
        }
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 T(boolean z17) {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).f450807f.f450838x = z17;
        }
        return this;
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 V(boolean z17) {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).f450807f.f450837w = z17;
        }
        return this;
    }

    public void W(boolean z17) {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).c(z17);
        }
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 Y(boolean z17) {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).f450807f.f450839y = z17;
        }
        return this;
    }

    public void Z(r35.d2 d2Var) {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).f450810i = d2Var;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void s() {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        android.view.View childAt;
        if (this.L == 1) {
            r35.k2 k2Var = (r35.k2) this.N;
            k2Var.f450699e = view;
            android.view.ViewGroup viewGroup = view.getId() == com.p314xaae8f345.mm.R.id.ceh ? (android.view.ViewGroup) view : (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.ceh);
            int i17 = k2Var.f450696b;
            if (i17 == 0) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp), viewGroup.getPaddingRight(), viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx));
            } else if (i17 == (k2Var.f450695a.getCount() / r35.v1.M) - 1) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp));
            } else {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx), viewGroup.getPaddingRight(), viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx));
            }
            r35.v1 v1Var = k2Var.f450695a;
            int i18 = v1Var.f450835u;
            int i19 = r35.v1.M;
            int i27 = i18 % i19;
            if ((i27 == i19 - 1 || i27 == 0) && k2Var.f450698d && k2Var.f450696b == (v1Var.getCount() / r35.v1.M) - 1) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), 0);
            } else if (!k2Var.f450698d) {
                r35.v1 v1Var2 = k2Var.f450695a;
                if (v1Var2.f450835u % r35.v1.M == 0 && k2Var.f450696b == (v1Var2.getCount() / r35.v1.M) - 1) {
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), (int) viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3));
                }
            }
            if (k2Var.f450695a != null) {
                viewGroup.setOnClickListener(k2Var.f450702h);
                if (viewGroup.getChildCount() > r35.v1.M) {
                    viewGroup.removeViews(0, viewGroup.getChildCount() - r35.v1.M);
                    viewGroup.requestLayout();
                }
                for (int i28 = 0; i28 < k2Var.f450697c; i28++) {
                    if (viewGroup.getChildAt(i28) == null) {
                        childAt = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.chc, null);
                        viewGroup.addView(childAt);
                    } else {
                        childAt = viewGroup.getChildAt(i28);
                    }
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 49;
                    if (r35.v1.M == 4) {
                        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
                        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                    } else {
                        int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx);
                        layoutParams.setMargins(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                    }
                    r35.v1 v1Var3 = k2Var.f450695a;
                    if (!(v1Var3.f450828n ? v1Var3.f450830p : com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(v1Var3.C)) && k2Var.f450695a.f450835u == 1) {
                        int dimensionPixelSize3 = viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561106p);
                        layoutParams.setMargins(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
                    }
                    childAt.setLayoutParams(layoutParams);
                    int i29 = (k2Var.f450696b * k2Var.f450697c) + i28;
                    k2Var.f450695a.getView(i29, childAt, viewGroup);
                    if (k2Var.f450700f != null) {
                        childAt.setOnClickListener(new r35.g2(k2Var, viewGroup, i29));
                    }
                    if (k2Var.f450701g != null) {
                        childAt.setOnLongClickListener(new r35.h2(k2Var, viewGroup, i29));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf c16784x72b881cf = (com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf) childAt.findViewById(com.p314xaae8f345.mm.R.id.m7e);
                    c16784x72b881cf.m67512x74caf26a(new r35.i2(k2Var));
                    c16784x72b881cf.setOnClickListener(new r35.j2(k2Var, viewGroup, i29));
                }
                r35.v1 v1Var4 = k2Var.f450695a;
                if ((v1Var4.f450828n ? v1Var4.f450830p : com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(v1Var4.C)) || k2Var.f450695a.f450835u > 1) {
                    ((android.widget.LinearLayout) viewGroup).setGravity(17);
                } else {
                    ((android.widget.LinearLayout) viewGroup).setGravity(19);
                }
            }
        }
        super.t(view);
    }

    public C19662x4f7a67f3(android.content.Context context) {
        super(context);
        this.L = -1;
        M();
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bz7;
    }

    public C19662x4f7a67f3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = -1;
        M();
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bz7;
    }

    public C19662x4f7a67f3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = -1;
        M();
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bz7;
    }
}
