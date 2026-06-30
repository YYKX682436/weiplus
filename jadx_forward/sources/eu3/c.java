package eu3;

/* loaded from: classes3.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f338354d;

    /* renamed from: e, reason: collision with root package name */
    public int f338355e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f338356f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f338357g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f338358h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f338359i;

    public c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f338354d = arrayList;
        this.f338355e = 2;
        this.f338357g = true;
        arrayList.add(-1);
        arrayList.add(-16777216);
        arrayList.add(-707825);
        arrayList.add(-352965);
        arrayList.add(-17592);
        arrayList.add(-7220480);
        arrayList.add(-16535286);
        arrayList.add(-15683841);
        arrayList.add(-15172610);
        arrayList.add(-7054596);
        arrayList.add(-8421505);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f338354d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        eu3.a holder = (eu3.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = this.f338357g;
        android.view.View view = holder.f338350d;
        if (z17 && i17 == this.f338355e) {
            this.f338357g = false;
            view.setScaleX(1.4f);
            view.setScaleY(1.4f);
            this.f338356f = view;
        }
        if (i17 == 2) {
            this.f338359i = view;
        }
        android.view.View view2 = holder.f338351e;
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) (view2 != null ? view2.getBackground() : null);
        if (gradientDrawable != null) {
            gradientDrawable.setShape(1);
        }
        if (gradientDrawable != null) {
            java.lang.Object obj = this.f338354d.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            gradientDrawable.setColor(((java.lang.Number) obj).intValue());
        }
        view.setOnClickListener(new eu3.b(this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dco, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new eu3.a(inflate);
    }

    public final void x(android.view.View view, float f17) {
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
}
