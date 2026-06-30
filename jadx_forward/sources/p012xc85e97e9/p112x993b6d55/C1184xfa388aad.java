package p012xc85e97e9.p112x993b6d55;

/* renamed from: androidx.transition.TransitionSet */
/* loaded from: classes13.dex */
public class C1184xfa388aad extends p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 {
    public java.util.ArrayList L;
    public boolean M;
    public int N;
    public boolean P;
    public int Q;

    public C1184xfa388aad() {
        this.L = new java.util.ArrayList();
        this.M = true;
        this.P = false;
        this.Q = 0;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void C(android.view.View view) {
        super.C(view);
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).C(view);
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 E(u4.b1 b1Var) {
        super.E(b1Var);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 F(android.view.View view) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).F(view);
        }
        this.f93919i.remove(view);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void G(android.view.View view) {
        super.G(view);
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).G(view);
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void H() {
        if (this.L.isEmpty()) {
            R();
            p();
            return;
        }
        u4.j1 j1Var = new u4.j1(this);
        java.util.Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) it.next()).a(j1Var);
        }
        this.N = this.L.size();
        if (this.M) {
            java.util.Iterator it6 = this.L.iterator();
            while (it6.hasNext()) {
                ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) it6.next()).H();
            }
            return;
        }
        for (int i17 = 1; i17 < this.L.size(); i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17 - 1)).a(new u4.i1(this, (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)));
        }
        p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(0);
        if (abstractC1183x100d4975 != null) {
            abstractC1183x100d4975.H();
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void I(boolean z17) {
        this.f93932y = z17;
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).I(z17);
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public /* bridge */ /* synthetic */ p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 J(long j17) {
        Z(j17);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void K(u4.a1 a1Var) {
        this.G = a1Var;
        this.Q |= 8;
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).K(a1Var);
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public /* bridge */ /* synthetic */ p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 L(android.animation.TimeInterpolator timeInterpolator) {
        a0(timeInterpolator);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void N(p012xc85e97e9.p112x993b6d55.AbstractC1180x9e297c5b abstractC1180x9e297c5b) {
        super.N(abstractC1180x9e297c5b);
        this.Q |= 4;
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).N(abstractC1180x9e297c5b);
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void O(u4.h1 h1Var) {
        this.F = h1Var;
        this.Q |= 2;
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).O(h1Var);
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 P(android.view.ViewGroup viewGroup) {
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).P(viewGroup);
        }
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 Q(long j17) {
        this.f93915e = j17;
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public java.lang.String S(java.lang.String str) {
        java.lang.String S = super.S(str);
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(S);
            sb6.append("\n");
            sb6.append(((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).S(str + "  "));
            S = sb6.toString();
        }
        return S;
    }

    public p012xc85e97e9.p112x993b6d55.C1184xfa388aad T(u4.b1 b1Var) {
        super.a(b1Var);
        return this;
    }

    public p012xc85e97e9.p112x993b6d55.C1184xfa388aad U(int i17) {
        for (int i18 = 0; i18 < this.L.size(); i18++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i18)).b(i17);
        }
        super.b(i17);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public p012xc85e97e9.p112x993b6d55.C1184xfa388aad c(android.view.View view) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).c(view);
        }
        this.f93919i.add(view);
        return this;
    }

    public p012xc85e97e9.p112x993b6d55.C1184xfa388aad W(java.lang.Class cls) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).d(cls);
        }
        super.d(cls);
        return this;
    }

    public p012xc85e97e9.p112x993b6d55.C1184xfa388aad X(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        this.L.add(abstractC1183x100d4975);
        abstractC1183x100d4975.f93928u = this;
        long j17 = this.f93916f;
        if (j17 >= 0) {
            abstractC1183x100d4975.J(j17);
        }
        if ((this.Q & 1) != 0) {
            abstractC1183x100d4975.L(this.f93917g);
        }
        if ((this.Q & 2) != 0) {
            abstractC1183x100d4975.O(this.F);
        }
        if ((this.Q & 4) != 0) {
            abstractC1183x100d4975.N(this.H);
        }
        if ((this.Q & 8) != 0) {
            abstractC1183x100d4975.K(this.G);
        }
        return this;
    }

    public p012xc85e97e9.p112x993b6d55.C1184xfa388aad Y(u4.b1 b1Var) {
        super.E(b1Var);
        return this;
    }

    public p012xc85e97e9.p112x993b6d55.C1184xfa388aad Z(long j17) {
        this.f93916f = j17;
        if (j17 >= 0) {
            int size = this.L.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).J(j17);
            }
        }
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 a(u4.b1 b1Var) {
        super.a(b1Var);
        return this;
    }

    public p012xc85e97e9.p112x993b6d55.C1184xfa388aad a0(android.animation.TimeInterpolator timeInterpolator) {
        this.Q |= 1;
        java.util.ArrayList arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).L(timeInterpolator);
            }
        }
        this.f93917g = timeInterpolator;
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public /* bridge */ /* synthetic */ p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 b(int i17) {
        U(i17);
        return this;
    }

    public p012xc85e97e9.p112x993b6d55.C1184xfa388aad b0(int i17) {
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

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public /* bridge */ /* synthetic */ p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 d(java.lang.Class cls) {
        W(cls);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 e(java.lang.String str) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).e(str);
        }
        super.e(str);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void g(u4.m1 m1Var) {
        if (A(m1Var.f506048b)) {
            java.util.Iterator it = this.L.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) it.next();
                if (abstractC1183x100d4975.A(m1Var.f506048b)) {
                    abstractC1183x100d4975.g(m1Var);
                    m1Var.f506049c.add(abstractC1183x100d4975);
                }
            }
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void i(u4.m1 m1Var) {
        super.i(m1Var);
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).i(m1Var);
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void j(u4.m1 m1Var) {
        if (A(m1Var.f506048b)) {
            java.util.Iterator it = this.L.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) it.next();
                if (abstractC1183x100d4975.A(m1Var.f506048b)) {
                    abstractC1183x100d4975.j(m1Var);
                    m1Var.f506049c.add(abstractC1183x100d4975);
                }
            }
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    /* renamed from: m */
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 mo8267x5a5dd5d() {
        p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = (p012xc85e97e9.p112x993b6d55.C1184xfa388aad) super.mo8267x5a5dd5d();
        c1184xfa388aad.L = new java.util.ArrayList();
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            c1184xfa388aad.X(((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).mo8267x5a5dd5d());
        }
        return c1184xfa388aad;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void o(android.view.ViewGroup viewGroup, u4.n1 n1Var, u4.n1 n1Var2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        long j17 = this.f93915e;
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17);
            if (j17 > 0 && (this.M || i17 == 0)) {
                long j18 = abstractC1183x100d4975.f93915e;
                if (j18 > 0) {
                    abstractC1183x100d4975.Q(j18 + j17);
                } else {
                    abstractC1183x100d4975.Q(j17);
                }
            }
            abstractC1183x100d4975.o(viewGroup, n1Var, n1Var2, arrayList, arrayList2);
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 q(int i17, boolean z17) {
        for (int i18 = 0; i18 < this.L.size(); i18++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i18)).q(i17, z17);
        }
        super.q(i17, z17);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 r(android.view.View view, boolean z17) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).r(view, z17);
        }
        super.r(view, z17);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 s(java.lang.Class cls, boolean z17) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).s(cls, z17);
        }
        super.s(cls, z17);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 t(java.lang.String str, boolean z17) {
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).t(str, z17);
        }
        super.t(str, z17);
        return this;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void u(android.view.ViewGroup viewGroup) {
        super.u(viewGroup);
        int size = this.L.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) this.L.get(i17)).u(viewGroup);
        }
    }

    public C1184xfa388aad(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new java.util.ArrayList();
        this.M = true;
        this.P = false;
        this.Q = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.u0.f506097h);
        b0(d3.r.e(obtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
