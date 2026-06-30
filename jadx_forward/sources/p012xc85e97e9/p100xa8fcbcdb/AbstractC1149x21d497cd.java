package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.PreferenceFragmentCompat */
/* loaded from: classes13.dex */
public abstract class AbstractC1149x21d497cd extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 implements p012xc85e97e9.p100xa8fcbcdb.b0, p012xc85e97e9.p100xa8fcbcdb.z, p012xc85e97e9.p100xa8fcbcdb.a0, p012xc85e97e9.p100xa8fcbcdb.e {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.c0 f93308d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93309e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93310f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93311g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f93312h;

    /* renamed from: i, reason: collision with root package name */
    public int f93313i = com.p314xaae8f345.mm.R.C30864xbddafb2a.c_l;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p100xa8fcbcdb.t f93314m = new p012xc85e97e9.p100xa8fcbcdb.t(this);

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f93315n = new p012xc85e97e9.p100xa8fcbcdb.r(this);

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f93316o = new p012xc85e97e9.p100xa8fcbcdb.s(this);

    @Override // p012xc85e97e9.p100xa8fcbcdb.b0
    public boolean H(p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb) {
        if (c1146x1fce98fb.f93293t != null) {
            mo7430x19263085();
        }
        return false;
    }

    public p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb j0(java.lang.CharSequence charSequence) {
        p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d47;
        p012xc85e97e9.p100xa8fcbcdb.c0 c0Var = this.f93308d;
        if (c0Var == null || (c1151xb1835d47 = c0Var.f93333g) == null) {
            return null;
        }
        return c1151xb1835d47.M(charSequence);
    }

    public abstract void l0(android.os.Bundle bundle, java.lang.String str);

    public void m0(int i17, java.lang.String str) {
        p012xc85e97e9.p100xa8fcbcdb.c0 c0Var = this.f93308d;
        if (c0Var == null) {
            throw new java.lang.RuntimeException("This should be called after super.onCreate.");
        }
        android.content.Context context = this.f93312h;
        c0Var.f93331e = true;
        p012xc85e97e9.p100xa8fcbcdb.y yVar = new p012xc85e97e9.p100xa8fcbcdb.y(context, c0Var);
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i17);
        try {
            p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c17 = yVar.c(xml, null);
            xml.close();
            p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d47 = (p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47) c17;
            c1151xb1835d47.r(c0Var);
            android.content.SharedPreferences.Editor editor = c0Var.f93330d;
            if (editor != null) {
                editor.apply();
            }
            boolean z17 = false;
            c0Var.f93331e = false;
            p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb = c1151xb1835d47;
            if (str != null) {
                p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb M = c1151xb1835d47.M(str);
                boolean z18 = M instanceof p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47;
                c1146x1fce98fb = M;
                if (!z18) {
                    throw new java.lang.IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
                }
            }
            p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d472 = (p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47) c1146x1fce98fb;
            p012xc85e97e9.p100xa8fcbcdb.c0 c0Var2 = this.f93308d;
            p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d473 = c0Var2.f93333g;
            if (c1151xb1835d472 != c1151xb1835d473) {
                if (c1151xb1835d473 != null) {
                    c1151xb1835d473.u();
                }
                c0Var2.f93333g = c1151xb1835d472;
                z17 = true;
            }
            if (!z17 || c1151xb1835d472 == null) {
                return;
            }
            this.f93310f = true;
            if (this.f93311g) {
                android.os.Handler handler = this.f93315n;
                if (handler.hasMessages(1)) {
                    return;
                }
                handler.obtainMessage(1).sendToTarget();
            }
        } catch (java.lang.Throwable th6) {
            xml.close();
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        mo7430x19263085().getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559901hz, typedValue, true);
        int i17 = typedValue.resourceId;
        if (i17 == 0) {
            i17 = com.p314xaae8f345.mm.R.C30868x68b1db1.f576021of;
        }
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(mo7430x19263085(), i17);
        this.f93312h = contextThemeWrapper;
        p012xc85e97e9.p100xa8fcbcdb.c0 c0Var = new p012xc85e97e9.p100xa8fcbcdb.c0(contextThemeWrapper);
        this.f93308d = c0Var;
        c0Var.f93336j = this;
        l0(bundle, m7436x8619eaa0() != null ? m7436x8619eaa0().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        android.content.res.TypedArray obtainStyledAttributes = this.f93312h.obtainStyledAttributes(null, p012xc85e97e9.p100xa8fcbcdb.g0.f93354g, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559896hu, 0);
        this.f93313i = obtainStyledAttributes.getResourceId(0, this.f93313i);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z17 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.f93312h);
        android.view.View inflate = cloneInContext.inflate(this.f93313i, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof android.view.ViewGroup)) {
            throw new java.lang.RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
        if (!this.f93312h.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.lqa)) == null) {
            c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) cloneInContext.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c_n, viewGroup2, false);
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7430x19263085()));
            c1163xf1deaba4.m7959x256fb093(new p012xc85e97e9.p100xa8fcbcdb.e0(c1163xf1deaba4));
        }
        this.f93309e = c1163xf1deaba4;
        p012xc85e97e9.p100xa8fcbcdb.t tVar = this.f93314m;
        c1163xf1deaba4.N(tVar);
        if (drawable != null) {
            tVar.getClass();
            tVar.f93372e = drawable.getIntrinsicHeight();
        } else {
            tVar.f93372e = 0;
        }
        tVar.f93371d = drawable;
        tVar.f93374g.f93309e.D0();
        if (dimensionPixelSize != -1) {
            tVar.f93372e = dimensionPixelSize;
            tVar.f93374g.f93309e.D0();
        }
        tVar.f93373f = z17;
        if (this.f93309e.getParent() == null) {
            viewGroup2.addView(this.f93309e);
        }
        this.f93315n.post(this.f93316o);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d47;
        android.os.Handler handler = this.f93315n;
        handler.removeCallbacks(this.f93316o);
        handler.removeMessages(1);
        if (this.f93310f && (c1151xb1835d47 = this.f93308d.f93333g) != null) {
            c1151xb1835d47.u();
        }
        this.f93309e = null;
        super.mo7399xa6664a60();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
        super.mo7404xa71a2260(bundle);
        p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d47 = this.f93308d.f93333g;
        if (c1151xb1835d47 != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            c1151xb1835d47.f(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        p012xc85e97e9.p100xa8fcbcdb.c0 c0Var = this.f93308d;
        c0Var.f93334h = this;
        c0Var.f93335i = this;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        p012xc85e97e9.p100xa8fcbcdb.c0 c0Var = this.f93308d;
        c0Var.f93334h = null;
        c0Var.f93335i = null;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d47;
        android.os.Bundle bundle2;
        p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d472;
        super.mo7518x594b1124(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (c1151xb1835d472 = this.f93308d.f93333g) != null) {
            c1151xb1835d472.e(bundle2);
        }
        if (this.f93310f && (c1151xb1835d47 = this.f93308d.f93333g) != null) {
            this.f93309e.mo7960x6cab2c8d(new p012xc85e97e9.p100xa8fcbcdb.x(c1151xb1835d47));
            c1151xb1835d47.p();
        }
        this.f93311g = true;
    }
}
