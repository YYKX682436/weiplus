package al1;

/* loaded from: classes7.dex */
public class l extends vj5.h implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v {

    /* renamed from: w, reason: collision with root package name */
    public int f87317w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f87318x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f87319y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Integer f87320z;

    public l(android.content.Context context) {
        super(context);
        this.f87317w = 0;
        this.f87318x = false;
        this.f87319y = true;
        this.f87320z = null;
    }

    /* renamed from: getActionBar */
    private al1.k0 m2238xb3ec347() {
        if (getChildCount() <= 0) {
            return null;
        }
        return (al1.k0) getChildAt(0);
    }

    public void D(android.content.Context context) {
        if (getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) getContext()).setBaseContext(context);
        }
        if (this.f87320z != null) {
            n6(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    public void c() {
        m2239xb6ab3395(false);
    }

    @Override // android.view.ViewGroup
    public boolean canAnimate() {
        return false;
    }

    @Override // vj5.h, android.view.ViewGroup, android.view.View
    public void dispatchSystemUiVisibilityChanged(int i17) {
        super.dispatchSystemUiVisibilityChanged(i17);
        if (this.f87319y) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(this) && vj5.h.f519233v && (getWindowSystemUiVisibility() & 4) == 0) {
                hashCode();
                hashCode();
                this.f519248u = null;
                x(this.f87317w, this.f87318x);
            }
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // vj5.h, vj5.k
    public void n6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandActionBarContainer", "onStatusBarHeightChange: newHeight = " + i17);
        java.lang.Integer num = this.f87320z;
        if (num != null) {
            q(num.intValue());
        } else {
            if (this.f519242o) {
                return;
            }
            q(i17);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (!(view instanceof al1.k0)) {
            throw new java.lang.IllegalAccessError("Cant add non ActionBar instance here");
        }
        if (!(view.getBackground() instanceof android.graphics.drawable.ColorDrawable)) {
            view.setBackground(new al1.k(this, 0));
            return;
        }
        al1.k kVar = new al1.k(this, ((android.graphics.drawable.ColorDrawable) view.getBackground()).getColor());
        view.setBackground(kVar);
        mo2242x7c84ae24(kVar.getColor());
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if ((view instanceof al1.k0) && (view.getBackground() instanceof al1.k)) {
            view.setBackground(new android.graphics.drawable.ColorDrawable(((al1.k) view.getBackground()).getColor()));
        }
    }

    /* renamed from: setActuallyVisible */
    public void m2239xb6ab3395(boolean z17) {
        boolean z18 = z17 != this.f87319y;
        this.f87319y = z17;
        if (z18 && z17) {
            m2240x5d3252c8(false);
            hashCode();
            this.f519248u = null;
            x(this.f87317w, this.f87318x);
            setWillNotDraw(false);
        }
        if (!z18 || z17) {
            return;
        }
        m2240x5d3252c8(true);
    }

    /* renamed from: setDeferStatusBarHeightChange */
    public void m2240x5d3252c8(boolean z17) {
        super.m172250xf161ffec(z17);
    }

    /* renamed from: setForceTopInsetsHeight */
    public void m2241xdb27f2c9(int i17) {
        this.f87320z = java.lang.Integer.valueOf(i17);
    }

    @Override // vj5.h
    /* renamed from: setStatusBarColor */
    public void mo2242x7c84ae24(int i17) {
        x(i17, this.f87318x);
    }

    /* renamed from: setStatusBarForegroundStyle */
    public void m2243xf1b0d7af(boolean z17) {
        if (m2238xb3ec347() == null) {
            return;
        }
        x(m2238xb3ec347().mo2208x3119c89f(), z17);
    }

    @Override // vj5.h
    public void x(int i17, boolean z17) {
        this.f87317w = i17;
        this.f87318x = z17;
        if (this.f87319y) {
            B(i17, z17, true);
        } else {
            B(i17, z17, false);
        }
    }
}
