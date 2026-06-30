package androidx.transition;

/* loaded from: classes13.dex */
public class TransitionSet extends androidx.transition.Transition {
    public java.util.ArrayList L;
    public boolean M;
    public int N;
    public boolean P;
    public int Q;

    public TransitionSet() {
        this.L = new java.util.ArrayList();
        this.M = true;
        this.P = false;
        this.Q = 0;
    }

    @Override // androidx.transition.Transition
    public void C(android.view.View view) {
        super.C(view);
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).C(view);
        }
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition E(u4.b1 b1Var) {
        super.E(b1Var);
        return this;
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition F(android.view.View view) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).F(view);
        }
        this.f12386i.remove(view);
        return this;
    }

    @Override // androidx.transition.Transition
    public void G(android.view.View view) {
        super.G(view);
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).G(view);
        }
    }

    @Override // androidx.transition.Transition
    public void H() {
        if (this.L.isEmpty()) {
            R();
            p();
            return;
        }
        u4.j1 j1Var = new u4.j1(this);
        java.util.Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((androidx.transition.Transition) it.next()).a(j1Var);
        }
        this.N = this.L.size();
        if (this.M) {
            java.util.Iterator it6 = this.L.iterator();
            while (it6.hasNext()) {
                ((androidx.transition.Transition) it6.next()).H();
            }
            return;
        }
        for (int i17 = 1; i17 < this.L.size(); i17++) {
            ((androidx.transition.Transition) this.L.get(i17 - 1)).a(new u4.i1(this, (androidx.transition.Transition) this.L.get(i17)));
        }
        androidx.transition.Transition transition = (androidx.transition.Transition) this.L.get(0);
        if (transition != null) {
            transition.H();
        }
    }

    @Override // androidx.transition.Transition
    public void I(boolean z17) {
        this.f12399y = z17;
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).I(z17);
        }
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition J(long j17) {
        Z(j17);
        return this;
    }

    @Override // androidx.transition.Transition
    public void K(u4.a1 a1Var) {
        this.G = a1Var;
        this.Q |= 8;
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).K(a1Var);
        }
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition L(android.animation.TimeInterpolator timeInterpolator) {
        a0(timeInterpolator);
        return this;
    }

    @Override // androidx.transition.Transition
    public void N(androidx.transition.PathMotion pathMotion) {
        super.N(pathMotion);
        this.Q |= 4;
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).N(pathMotion);
        }
    }

    @Override // androidx.transition.Transition
    public void O(u4.h1 h1Var) {
        this.F = h1Var;
        this.Q |= 2;
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).O(h1Var);
        }
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition P(android.view.ViewGroup viewGroup) {
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).P(viewGroup);
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition Q(long j17) {
        this.f12382e = j17;
        return this;
    }

    @Override // androidx.transition.Transition
    public java.lang.String S(java.lang.String str) {
        java.lang.String S = super.S(str);
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(S);
            sb6.append("\n");
            sb6.append(((androidx.transition.Transition) this.L.get(i17)).S(str + "  "));
            S = sb6.toString();
        }
        return S;
    }

    public androidx.transition.TransitionSet T(u4.b1 b1Var) {
        super.a(b1Var);
        return this;
    }

    public androidx.transition.TransitionSet U(int i17) {
        for (int i18 = 0; i18 < this.L.size(); i18++) {
            ((androidx.transition.Transition) this.L.get(i18)).b(i17);
        }
        super.b(i17);
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public androidx.transition.TransitionSet c(android.view.View view) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).c(view);
        }
        this.f12386i.add(view);
        return this;
    }

    public androidx.transition.TransitionSet W(java.lang.Class cls) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).d(cls);
        }
        super.d(cls);
        return this;
    }

    public androidx.transition.TransitionSet X(androidx.transition.Transition transition) {
        this.L.add(transition);
        transition.f12395u = this;
        long j17 = this.f12383f;
        if (j17 >= 0) {
            transition.J(j17);
        }
        if ((this.Q & 1) != 0) {
            transition.L(this.f12384g);
        }
        if ((this.Q & 2) != 0) {
            transition.O(this.F);
        }
        if ((this.Q & 4) != 0) {
            transition.N(this.H);
        }
        if ((this.Q & 8) != 0) {
            transition.K(this.G);
        }
        return this;
    }

    public androidx.transition.TransitionSet Y(u4.b1 b1Var) {
        super.E(b1Var);
        return this;
    }

    public androidx.transition.TransitionSet Z(long j17) {
        this.f12383f = j17;
        if (j17 >= 0) {
            int size = this.L.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((androidx.transition.Transition) this.L.get(i17)).J(j17);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition a(u4.b1 b1Var) {
        super.a(b1Var);
        return this;
    }

    public androidx.transition.TransitionSet a0(android.animation.TimeInterpolator timeInterpolator) {
        this.Q |= 1;
        java.util.ArrayList arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((androidx.transition.Transition) this.L.get(i17)).L(timeInterpolator);
            }
        }
        this.f12384g = timeInterpolator;
        return this;
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition b(int i17) {
        U(i17);
        return this;
    }

    public androidx.transition.TransitionSet b0(int i17) {
        if (i17 == 0) {
            this.M = true;
        } else {
            if (i17 != 1) {
                throw new android.util.AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i17);
            }
            this.M = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition d(java.lang.Class cls) {
        W(cls);
        return this;
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition e(java.lang.String str) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).e(str);
        }
        super.e(str);
        return this;
    }

    @Override // androidx.transition.Transition
    public void g(u4.m1 m1Var) {
        if (A(m1Var.f424515b)) {
            java.util.Iterator it = this.L.iterator();
            while (it.hasNext()) {
                androidx.transition.Transition transition = (androidx.transition.Transition) it.next();
                if (transition.A(m1Var.f424515b)) {
                    transition.g(m1Var);
                    m1Var.f424516c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void i(u4.m1 m1Var) {
        super.i(m1Var);
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).i(m1Var);
        }
    }

    @Override // androidx.transition.Transition
    public void j(u4.m1 m1Var) {
        if (A(m1Var.f424515b)) {
            java.util.Iterator it = this.L.iterator();
            while (it.hasNext()) {
                androidx.transition.Transition transition = (androidx.transition.Transition) it.next();
                if (transition.A(m1Var.f424515b)) {
                    transition.j(m1Var);
                    m1Var.f424516c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: m */
    public androidx.transition.Transition clone() {
        androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) super.clone();
        transitionSet.L = new java.util.ArrayList();
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            transitionSet.X(((androidx.transition.Transition) this.L.get(i17)).clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public void o(android.view.ViewGroup viewGroup, u4.n1 n1Var, u4.n1 n1Var2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        long j17 = this.f12382e;
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            androidx.transition.Transition transition = (androidx.transition.Transition) this.L.get(i17);
            if (j17 > 0 && (this.M || i17 == 0)) {
                long j18 = transition.f12382e;
                if (j18 > 0) {
                    transition.Q(j18 + j17);
                } else {
                    transition.Q(j17);
                }
            }
            transition.o(viewGroup, n1Var, n1Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition q(int i17, boolean z17) {
        for (int i18 = 0; i18 < this.L.size(); i18++) {
            ((androidx.transition.Transition) this.L.get(i18)).q(i17, z17);
        }
        super.q(i17, z17);
        return this;
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition r(android.view.View view, boolean z17) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).r(view, z17);
        }
        super.r(view, z17);
        return this;
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition s(java.lang.Class cls, boolean z17) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).s(cls, z17);
        }
        super.s(cls, z17);
        return this;
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition t(java.lang.String str, boolean z17) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).t(str, z17);
        }
        super.t(str, z17);
        return this;
    }

    @Override // androidx.transition.Transition
    public void u(android.view.ViewGroup viewGroup) {
        super.u(viewGroup);
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.transition.Transition) this.L.get(i17)).u(viewGroup);
        }
    }

    public TransitionSet(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new java.util.ArrayList();
        this.M = true;
        this.P = false;
        this.Q = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.u0.f424564h);
        b0(d3.r.e(obtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
