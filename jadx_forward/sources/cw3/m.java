package cw3;

/* loaded from: classes10.dex */
public final class m extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f305711d;

    /* renamed from: e, reason: collision with root package name */
    public int f305712e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f305713f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f305714g;

    /* renamed from: h, reason: collision with root package name */
    public cw3.o f305715h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f305716i;

    public m(java.util.ArrayList resourceList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourceList, "resourceList");
        this.f305711d = resourceList;
        this.f305712e = -1;
        this.f305714g = true;
        this.f305716i = new java.util.HashMap();
    }

    public static final void x(cw3.m mVar, android.view.View view, float f17) {
        mVar.getClass();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", f17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", f17);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f305711d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        cw3.k holder = (cw3.k) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = this.f305714g;
        android.view.View view = holder.f305707d;
        if (z17 && i17 == this.f305712e) {
            this.f305714g = false;
            view.setScaleX(1.4f);
            view.setScaleY(1.4f);
            this.f305713f = view;
        }
        java.util.HashMap hashMap = this.f305716i;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-outerFl>(...)");
        hashMap.put(valueOf, view);
        android.view.View view2 = holder.f305708e;
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) (view2 != null ? view2.getBackground() : null);
        if (gradientDrawable != null) {
            gradientDrawable.setShape(1);
        }
        if (gradientDrawable != null) {
            gradientDrawable.setColor(((cw3.n) this.f305711d.get(i17)).f305717a);
        }
        view.setOnClickListener(new cw3.l(this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dco, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new cw3.k(inflate);
    }

    public final void y(int i17) {
        if (this.f305712e != i17) {
            android.view.View view = this.f305713f;
            if (view != null) {
                view.setScaleX(1.0f);
            }
            android.view.View view2 = this.f305713f;
            if (view2 != null) {
                view2.setScaleY(1.0f);
            }
        }
        this.f305712e = i17;
        android.view.View view3 = (android.view.View) this.f305716i.get(java.lang.Integer.valueOf(i17));
        this.f305713f = view3;
        if (view3 != null) {
            view3.setScaleX(1.4f);
        }
        android.view.View view4 = this.f305713f;
        if (view4 == null) {
            return;
        }
        view4.setScaleY(1.4f);
    }
}
