package rh4;

/* loaded from: classes8.dex */
public class o extends rh4.n0 {

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.FrameLayout f477305p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.RelativeLayout f477306q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f477307r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.LinearLayout f477308s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f477309t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f477310u;

    /* renamed from: v, reason: collision with root package name */
    public final android.os.Vibrator f477311v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, lh4.b callback, int i17, android.util.AttributeSet attributeSet, int i18) {
        super(context, callback, i17, attributeSet, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f477305p = (android.widget.FrameLayout) m145777xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.ng6);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) m145777xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.ng7);
        this.f477306q = relativeLayout;
        this.f477307r = (android.widget.TextView) m145777xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.nga);
        this.f477308s = (android.widget.LinearLayout) m145777xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.ng8);
        this.f477311v = (android.os.Vibrator) context.getSystemService("vibrator");
        relativeLayout.setBackgroundResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560210du : com.p314xaae8f345.mm.R.C30859x5a72f63.f560209dt);
        m162446x4905e9fa().setId(com.p314xaae8f345.mm.R.id.f568765nz0);
        m162445x6ece7510().setAccessibilityTraversalBefore(m162446x4905e9fa().getId());
        j();
    }

    @Override // rh4.n0, lh4.h
    public void d() {
        android.widget.TextView m145779x7531c8a2 = m145779x7531c8a2();
        android.view.ViewGroup.LayoutParams layoutParams = m145779x7531c8a2 != null ? m145779x7531c8a2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
            m145779x7531c8a2().setLayoutParams(marginLayoutParams);
        }
    }

    @Override // rh4.n0, lh4.h
    public java.lang.String f() {
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571843rf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // rh4.n0
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 i() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18565x166dd6f4(getContext());
    }

    @Override // rh4.n0
    public void l() {
        rh4.j0 m162451x2b17f622 = m162451x2b17f622();
        if (m162451x2b17f622 != null) {
            m162451x2b17f622.r(2);
        }
    }

    @Override // rh4.n0
    public void m(float f17) {
        super.m(f17);
        android.widget.FrameLayout frameLayout = this.f477305p;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int i17 = (int) f17;
        ((android.widget.FrameLayout.LayoutParams) layoutParams).leftMargin = i17;
        android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams2).rightMargin = i17;
    }

    public final void p(boolean z17) {
        android.widget.FrameLayout frameLayout = this.f477305p;
        if (frameLayout.getVisibility() != 4 || !z17) {
            if (frameLayout.getVisibility() != 0 || z17) {
                return;
            }
            frameLayout.clearAnimation();
            frameLayout.animate().alpha(0.0f).setDuration(250L).setListener(new rh4.n(this)).start();
            return;
        }
        q(-1.0f, -1.0f);
        frameLayout.setVisibility(0);
        if (!this.f477310u) {
            int f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561571ma) + i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.m_);
            android.graphics.Rect rect = new android.graphics.Rect();
            android.widget.LinearLayout linearLayout = this.f477308s;
            linearLayout.getGlobalVisibleRect(rect);
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            if (rect.bottom + i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) > i65.a.k(getContext()) - f17) {
                this.f477310u = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopSectionMyWeAppView", "need adjust mask view height");
                layoutParams2.removeRule(13);
                layoutParams2.addRule(14);
                layoutParams2.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            } else {
                layoutParams2.addRule(13);
                layoutParams2.removeRule(14);
                layoutParams2.topMargin = 0;
            }
            linearLayout.setLayoutParams(layoutParams2);
        }
        frameLayout.setAlpha(0.0f);
        frameLayout.clearAnimation();
        frameLayout.animate().alpha(1.0f).setDuration(250L).setListener(null).start();
    }

    public final boolean q(float f17, float f18) {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f477305p.getGlobalVisibleRect(rect);
        boolean contains = rect.contains((int) f17, (int) f18);
        if (!this.f477309t && contains) {
            announceForAccessibility(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571632kv));
            android.os.Vibrator vibrator = this.f477311v;
            if (vibrator != null) {
                vibrator.vibrate(10L);
            }
        }
        this.f477309t = contains;
        this.f477307r.setText(contains ? com.p314xaae8f345.mm.R.C30867xcad56011.f571839rb : com.p314xaae8f345.mm.R.C30867xcad56011.ra);
        this.f477306q.setBackgroundResource(contains ? com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560208ds : com.p314xaae8f345.mm.R.C30859x5a72f63.f560207dr : com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560210du : com.p314xaae8f345.mm.R.C30859x5a72f63.f560209dt);
        return contains;
    }
}
