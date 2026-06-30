package sx5;

/* loaded from: classes13.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495201d;

    public a0(sx5.a1 a1Var) {
        this.f495201d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f495201d;
        android.widget.FrameLayout frameLayout = a1Var.f495222w;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        a1Var.C.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61240xf5e9ed4));
        a1Var.D.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61240xf5e9ed4));
        a1Var.E.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61240xf5e9ed4));
        a1Var.F.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61240xf5e9ed4));
        a1Var.G.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61240xf5e9ed4));
        a1Var.H.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61240xf5e9ed4));
        double d17 = a1Var.S;
        if (d17 == 0.5d) {
            a1Var.C.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61235xb2db0ae));
            return;
        }
        if (d17 == 0.75d) {
            a1Var.D.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61235xb2db0ae));
            return;
        }
        if (d17 == 1.0d) {
            a1Var.E.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61235xb2db0ae));
            return;
        }
        if (d17 == 1.5d) {
            a1Var.F.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61235xb2db0ae));
        } else if (d17 == 2.0d) {
            a1Var.G.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61235xb2db0ae));
        } else if (d17 == 3.0d) {
            a1Var.H.setTextColor(a1Var.p().getColorStateList(com.p314xaae8f345.p3222x9cba06de.R.C27872x5a72f63.f61235xb2db0ae));
        }
    }
}
