package androidx.preference;

/* loaded from: classes13.dex */
public abstract class PreferenceFragmentCompat extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment implements androidx.preference.b0, androidx.preference.z, androidx.preference.a0, androidx.preference.e {

    /* renamed from: d, reason: collision with root package name */
    public androidx.preference.c0 f11775d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f11776e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11777f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11778g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f11779h;

    /* renamed from: i, reason: collision with root package name */
    public int f11780i = com.tencent.mm.R.layout.c_l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.preference.t f11781m = new androidx.preference.t(this);

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f11782n = new androidx.preference.r(this);

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f11783o = new androidx.preference.s(this);

    @Override // androidx.preference.b0
    public boolean H(androidx.preference.Preference preference) {
        if (preference.f11760t != null) {
            getActivity();
        }
        return false;
    }

    public androidx.preference.Preference j0(java.lang.CharSequence charSequence) {
        androidx.preference.PreferenceScreen preferenceScreen;
        androidx.preference.c0 c0Var = this.f11775d;
        if (c0Var == null || (preferenceScreen = c0Var.f11800g) == null) {
            return null;
        }
        return preferenceScreen.M(charSequence);
    }

    public abstract void l0(android.os.Bundle bundle, java.lang.String str);

    public void m0(int i17, java.lang.String str) {
        androidx.preference.c0 c0Var = this.f11775d;
        if (c0Var == null) {
            throw new java.lang.RuntimeException("This should be called after super.onCreate.");
        }
        android.content.Context context = this.f11779h;
        c0Var.f11798e = true;
        androidx.preference.y yVar = new androidx.preference.y(context, c0Var);
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i17);
        try {
            androidx.preference.Preference c17 = yVar.c(xml, null);
            xml.close();
            androidx.preference.PreferenceScreen preferenceScreen = (androidx.preference.PreferenceScreen) c17;
            preferenceScreen.r(c0Var);
            android.content.SharedPreferences.Editor editor = c0Var.f11797d;
            if (editor != null) {
                editor.apply();
            }
            boolean z17 = false;
            c0Var.f11798e = false;
            androidx.preference.Preference preference = preferenceScreen;
            if (str != null) {
                androidx.preference.Preference M = preferenceScreen.M(str);
                boolean z18 = M instanceof androidx.preference.PreferenceScreen;
                preference = M;
                if (!z18) {
                    throw new java.lang.IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
                }
            }
            androidx.preference.PreferenceScreen preferenceScreen2 = (androidx.preference.PreferenceScreen) preference;
            androidx.preference.c0 c0Var2 = this.f11775d;
            androidx.preference.PreferenceScreen preferenceScreen3 = c0Var2.f11800g;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.u();
                }
                c0Var2.f11800g = preferenceScreen2;
                z17 = true;
            }
            if (!z17 || preferenceScreen2 == null) {
                return;
            }
            this.f11777f = true;
            if (this.f11778g) {
                android.os.Handler handler = this.f11782n;
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

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getActivity().getTheme().resolveAttribute(com.tencent.mm.R.attr.f478368hz, typedValue, true);
        int i17 = typedValue.resourceId;
        if (i17 == 0) {
            i17 = com.tencent.mm.R.style.f494488of;
        }
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(getActivity(), i17);
        this.f11779h = contextThemeWrapper;
        androidx.preference.c0 c0Var = new androidx.preference.c0(contextThemeWrapper);
        this.f11775d = c0Var;
        c0Var.f11803j = this;
        l0(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        android.content.res.TypedArray obtainStyledAttributes = this.f11779h.obtainStyledAttributes(null, androidx.preference.g0.f11821g, com.tencent.mm.R.attr.f478363hu, 0);
        this.f11780i = obtainStyledAttributes.getResourceId(0, this.f11780i);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z17 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.f11779h);
        android.view.View inflate = cloneInContext.inflate(this.f11780i, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof android.view.ViewGroup)) {
            throw new java.lang.RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
        if (!this.f11779h.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (androidx.recyclerview.widget.RecyclerView) viewGroup2.findViewById(com.tencent.mm.R.id.lqa)) == null) {
            recyclerView = (androidx.recyclerview.widget.RecyclerView) cloneInContext.inflate(com.tencent.mm.R.layout.c_n, viewGroup2, false);
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
            recyclerView.setAccessibilityDelegateCompat(new androidx.preference.e0(recyclerView));
        }
        this.f11776e = recyclerView;
        androidx.preference.t tVar = this.f11781m;
        recyclerView.N(tVar);
        if (drawable != null) {
            tVar.getClass();
            tVar.f11839e = drawable.getIntrinsicHeight();
        } else {
            tVar.f11839e = 0;
        }
        tVar.f11838d = drawable;
        tVar.f11841g.f11776e.D0();
        if (dimensionPixelSize != -1) {
            tVar.f11839e = dimensionPixelSize;
            tVar.f11841g.f11776e.D0();
        }
        tVar.f11840f = z17;
        if (this.f11776e.getParent() == null) {
            viewGroup2.addView(this.f11776e);
        }
        this.f11782n.post(this.f11783o);
        return inflate;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        androidx.preference.PreferenceScreen preferenceScreen;
        android.os.Handler handler = this.f11782n;
        handler.removeCallbacks(this.f11783o);
        handler.removeMessages(1);
        if (this.f11777f && (preferenceScreen = this.f11775d.f11800g) != null) {
            preferenceScreen.u();
        }
        this.f11776e = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        androidx.preference.PreferenceScreen preferenceScreen = this.f11775d.f11800g;
        if (preferenceScreen != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            preferenceScreen.f(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        androidx.preference.c0 c0Var = this.f11775d;
        c0Var.f11801h = this;
        c0Var.f11802i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        androidx.preference.c0 c0Var = this.f11775d;
        c0Var.f11801h = null;
        c0Var.f11802i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        androidx.preference.PreferenceScreen preferenceScreen;
        android.os.Bundle bundle2;
        androidx.preference.PreferenceScreen preferenceScreen2;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f11775d.f11800g) != null) {
            preferenceScreen2.e(bundle2);
        }
        if (this.f11777f && (preferenceScreen = this.f11775d.f11800g) != null) {
            this.f11776e.setAdapter(new androidx.preference.x(preferenceScreen));
            preferenceScreen.p();
        }
        this.f11778g = true;
    }
}
