package al1;

/* loaded from: classes7.dex */
public class l extends vj5.h implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: w, reason: collision with root package name */
    public int f5784w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5785x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5786y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Integer f5787z;

    public l(android.content.Context context) {
        super(context);
        this.f5784w = 0;
        this.f5785x = false;
        this.f5786y = true;
        this.f5787z = null;
    }

    private al1.k0 getActionBar() {
        if (getChildCount() <= 0) {
            return null;
        }
        return (al1.k0) getChildAt(0);
    }

    public void D(android.content.Context context) {
        if (getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) getContext()).setBaseContext(context);
        }
        if (this.f5787z != null) {
            n6(0);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        setActuallyVisible(false);
    }

    @Override // android.view.ViewGroup
    public boolean canAnimate() {
        return false;
    }

    @Override // vj5.h, android.view.ViewGroup, android.view.View
    public void dispatchSystemUiVisibilityChanged(int i17) {
        super.dispatchSystemUiVisibilityChanged(i17);
        if (this.f5786y) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(this) && vj5.h.f437700v && (getWindowSystemUiVisibility() & 4) == 0) {
                hashCode();
                hashCode();
                this.f437715u = null;
                x(this.f5784w, this.f5785x);
            }
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // vj5.h, vj5.k
    public void n6(int i17) {
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandActionBarContainer", "onStatusBarHeightChange: newHeight = " + i17);
        java.lang.Integer num = this.f5787z;
        if (num != null) {
            q(num.intValue());
        } else {
            if (this.f437709o) {
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
        setStatusBarColor(kVar.getColor());
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if ((view instanceof al1.k0) && (view.getBackground() instanceof al1.k)) {
            view.setBackground(new android.graphics.drawable.ColorDrawable(((al1.k) view.getBackground()).getColor()));
        }
    }

    public void setActuallyVisible(boolean z17) {
        boolean z18 = z17 != this.f5786y;
        this.f5786y = z17;
        if (z18 && z17) {
            setDeferStatusBarHeightChange(false);
            hashCode();
            this.f437715u = null;
            x(this.f5784w, this.f5785x);
            setWillNotDraw(false);
        }
        if (!z18 || z17) {
            return;
        }
        setDeferStatusBarHeightChange(true);
    }

    public void setDeferStatusBarHeightChange(boolean z17) {
        super.setLayoutFrozen(z17);
    }

    public void setForceTopInsetsHeight(int i17) {
        this.f5787z = java.lang.Integer.valueOf(i17);
    }

    @Override // vj5.h
    public void setStatusBarColor(int i17) {
        x(i17, this.f5785x);
    }

    public void setStatusBarForegroundStyle(boolean z17) {
        if (getActionBar() == null) {
            return;
        }
        x(getActionBar().getBackgroundColor(), z17);
    }

    @Override // vj5.h
    public void x(int i17, boolean z17) {
        this.f5784w = i17;
        this.f5785x = z17;
        if (this.f5786y) {
            B(i17, z17, true);
        } else {
            B(i17, z17, false);
        }
    }
}
