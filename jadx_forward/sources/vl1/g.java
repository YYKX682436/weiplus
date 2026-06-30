package vl1;

/* loaded from: classes11.dex */
public class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: o, reason: collision with root package name */
    public static final android.view.ViewGroup.LayoutParams f519326o = new android.view.ViewGroup.LayoutParams(-1, -2);

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f519327d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f519328e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f519329f;

    /* renamed from: i, reason: collision with root package name */
    public vl1.p f519332i;

    /* renamed from: m, reason: collision with root package name */
    public vl1.q f519333m;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f519330g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f519331h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 f519334n = new vl1.a(this);

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public final int mo1894x7e414b06() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f519327d;
        int mo1894x7e414b06 = f2Var == null ? 0 : f2Var.mo1894x7e414b06();
        if (!this.f519330g.isEmpty()) {
            mo1894x7e414b06++;
        }
        return !this.f519331h.isEmpty() ? mo1894x7e414b06 + 1 : mo1894x7e414b06;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return mo863xcdaf1228(i17) == Integer.MAX_VALUE ? -1782095970 : mo863xcdaf1228(i17) == 2147483646 ? 1955920812 : !this.f519327d.m8145x24a16003() ? i17 : this.f519327d.mo7906x1ed62e84(i17 - (!this.f519330g.isEmpty() ? 1 : 0));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public final int mo863xcdaf1228(int i17) {
        java.util.List list = this.f519330g;
        if (!list.isEmpty() && i17 == 0) {
            return Integer.MAX_VALUE;
        }
        if (this.f519331h.isEmpty() || i17 != mo1894x7e414b06() - 1) {
            return this.f519327d.mo863xcdaf1228(i17 - (!list.isEmpty() ? 1 : 0));
        }
        return 2147483646;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.List list = this.f519330g;
        if (!list.isEmpty() && i17 == 0) {
            y(k3Var);
            return;
        }
        if (!this.f519331h.isEmpty() && i17 == mo1894x7e414b06() - 1) {
            y(k3Var);
            return;
        }
        int i18 = i17 - (!list.isEmpty() ? 1 : 0);
        this.f519327d.mo864xe5e2e48d(k3Var, i18);
        if (this.f519332i != null) {
            k3Var.f3639x46306858.setOnClickListener(new vl1.b(this, k3Var, i18));
        }
        if (this.f519333m != null) {
            k3Var.f3639x46306858.setOnLongClickListener(new vl1.c(this, k3Var, i18));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = f519326o;
        if (i17 != 2147483646) {
            if (i17 != Integer.MAX_VALUE) {
                return this.f519327d.mo865x9cc5cacc(viewGroup, i17);
            }
            android.view.ViewGroup viewGroup2 = this.f519329f;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxf, viewGroup, false);
            this.f519329f = viewGroup3;
            java.util.Iterator it = this.f519330g.iterator();
            while (it.hasNext()) {
                viewGroup3.addView((android.view.View) it.next(), layoutParams);
            }
            return new vl1.f(viewGroup3);
        }
        android.view.ViewGroup viewGroup4 = this.f519328e;
        if (viewGroup4 != null) {
            viewGroup4.removeAllViews();
        }
        android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxf, viewGroup, false);
        this.f519328e = viewGroup5;
        for (android.view.View view : this.f519331h) {
            if (view.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            viewGroup5.addView(view, layoutParams);
        }
        return new vl1.f(viewGroup5);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        super.mo8160xd8bfd53(k3Var);
        if (k3Var.m8185xcdaf1228() == Integer.MAX_VALUE || k3Var.m8185xcdaf1228() == 2147483646) {
            return;
        }
        this.f519327d.mo8160xd8bfd53(k3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        super.mo8161x38c82990(k3Var);
        if (k3Var.m8185xcdaf1228() == Integer.MAX_VALUE || k3Var.m8185xcdaf1228() == 2147483646) {
            return;
        }
        this.f519327d.mo8161x38c82990(k3Var);
    }

    public int x() {
        return ((java.util.LinkedList) this.f519331h).size();
    }

    public final void y(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (k3Var.f3639x46306858.getLayoutParams() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) k3Var.f3639x46306858.getLayoutParams();
            layoutParams.f93474i = true;
            k3Var.f3639x46306858.setLayoutParams(layoutParams);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        java.util.List list2 = this.f519330g;
        if (!list2.isEmpty() && i17 == 0) {
            y(k3Var);
            return;
        }
        if (!this.f519331h.isEmpty() && i17 == mo1894x7e414b06() - 1) {
            y(k3Var);
            return;
        }
        int i18 = i17 - (!list2.isEmpty() ? 1 : 0);
        this.f519327d.mo8157xe5e2e48d(k3Var, i18, list);
        if (this.f519332i != null) {
            k3Var.f3639x46306858.setOnClickListener(new vl1.d(this, k3Var, i18));
        }
        if (this.f519333m != null) {
            k3Var.f3639x46306858.setOnLongClickListener(new vl1.e(this, k3Var, i18));
        }
    }
}
