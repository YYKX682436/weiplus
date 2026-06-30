package androidx.preference;

/* loaded from: classes13.dex */
public class Preference implements java.lang.Comparable<androidx.preference.Preference> {
    public boolean A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f11746J;
    public final int K;
    public androidx.preference.n L;
    public java.util.List M;
    public androidx.preference.PreferenceGroup N;
    public boolean P;
    public final android.view.View.OnClickListener Q;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f11747d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.preference.c0 f11748e;

    /* renamed from: f, reason: collision with root package name */
    public long f11749f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11750g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.preference.o f11751h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.preference.p f11752i;

    /* renamed from: m, reason: collision with root package name */
    public int f11753m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f11754n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f11755o;

    /* renamed from: p, reason: collision with root package name */
    public int f11756p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f11757q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f11758r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.Intent f11759s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f11760t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.Bundle f11761u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f11762v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f11763w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11764x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f11765y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Object f11766z;

    /* loaded from: classes13.dex */
    public static class BaseSavedState extends android.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.Preference.BaseSavedState> CREATOR = new androidx.preference.m();

        public BaseSavedState(android.os.Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        this.f11753m = Integer.MAX_VALUE;
        this.f11762v = true;
        this.f11763w = true;
        this.f11764x = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.G = true;
        this.I = true;
        this.f11746J = com.tencent.mm.R.layout.c_d;
        this.Q = new androidx.preference.l(this);
        this.f11747d = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11820f, i17, i18);
        this.f11756p = obtainStyledAttributes.getResourceId(22, obtainStyledAttributes.getResourceId(0, 0));
        this.f11758r = d3.r.h(obtainStyledAttributes, 25, 6);
        java.lang.CharSequence text = obtainStyledAttributes.getText(33);
        this.f11754n = text == null ? obtainStyledAttributes.getText(4) : text;
        java.lang.CharSequence text2 = obtainStyledAttributes.getText(32);
        this.f11755o = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f11753m = obtainStyledAttributes.getInt(27, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        this.f11760t = d3.r.h(obtainStyledAttributes, 21, 13);
        this.f11746J = obtainStyledAttributes.getResourceId(26, obtainStyledAttributes.getResourceId(3, com.tencent.mm.R.layout.c_d));
        this.K = obtainStyledAttributes.getResourceId(34, obtainStyledAttributes.getResourceId(9, 0));
        this.f11762v = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(2, true));
        boolean z17 = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(5, true));
        this.f11763w = z17;
        this.f11764x = obtainStyledAttributes.getBoolean(28, obtainStyledAttributes.getBoolean(1, true));
        this.f11765y = d3.r.h(obtainStyledAttributes, 19, 10);
        this.D = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z17));
        this.E = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z17));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f11766z = w(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f11766z = w(obtainStyledAttributes, 11);
        }
        this.I = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(31);
        this.F = hasValue;
        if (hasValue) {
            this.G = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(14, true));
        }
        this.H = obtainStyledAttributes.getBoolean(23, obtainStyledAttributes.getBoolean(15, false));
        this.C = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(24, true));
        obtainStyledAttributes.recycle();
    }

    public void A(android.os.Parcelable parcelable) {
        this.P = true;
        if (parcelable != android.view.AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new java.lang.IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public android.os.Parcelable B() {
        this.P = true;
        return android.view.AbsSavedState.EMPTY_STATE;
    }

    public void C(java.lang.Object obj) {
    }

    public void D(android.view.View view) {
        android.content.Intent intent;
        androidx.preference.b0 b0Var;
        if (m()) {
            t();
            androidx.preference.p pVar = this.f11752i;
            if (pVar != null) {
                androidx.preference.b bVar = (androidx.preference.b) pVar;
                bVar.f11792a.V = Integer.MAX_VALUE;
                androidx.preference.x xVar = bVar.f11793b.f11804a;
                android.os.Handler handler = xVar.f11851i;
                java.lang.Runnable runnable = xVar.f11853n;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
                return;
            }
            androidx.preference.c0 c0Var = this.f11748e;
            if ((c0Var == null || (b0Var = c0Var.f11801h) == null || !b0Var.H(this)) && (intent = this.f11759s) != null) {
                android.content.Context context = this.f11747d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "androidx/preference/Preference", "performClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "androidx/preference/Preference", "performClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    public boolean E(java.lang.String str) {
        if (!L()) {
            return false;
        }
        if (android.text.TextUtils.equals(str, j(null))) {
            return true;
        }
        k();
        android.content.SharedPreferences.Editor a17 = this.f11748e.a();
        a17.putString(this.f11758r, str);
        if (!this.f11748e.f11798e) {
            a17.apply();
        }
        return true;
    }

    public final void G(android.view.View view, boolean z17) {
        view.setEnabled(z17);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                G(viewGroup.getChildAt(childCount), z17);
            }
        }
    }

    public void H(java.lang.CharSequence charSequence) {
        if ((charSequence != null || this.f11755o == null) && (charSequence == null || charSequence.equals(this.f11755o))) {
            return;
        }
        this.f11755o = charSequence;
        n();
    }

    public final void I(boolean z17) {
        boolean z18;
        if (this.C != z17) {
            this.C = z17;
            androidx.preference.n nVar = this.L;
            if (nVar != null) {
                androidx.preference.x xVar = (androidx.preference.x) nVar;
                if (((java.util.ArrayList) xVar.f11848f).contains(this)) {
                    androidx.preference.d dVar = xVar.f11852m;
                    dVar.getClass();
                    int i17 = 0;
                    if ((this instanceof androidx.preference.PreferenceGroup) || dVar.f11806c) {
                        androidx.preference.x xVar2 = dVar.f11804a;
                        android.os.Handler handler = xVar2.f11851i;
                        java.lang.Runnable runnable = xVar2.f11853n;
                        handler.removeCallbacks(runnable);
                        handler.post(runnable);
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        return;
                    }
                    if (!this.C) {
                        int size = ((java.util.ArrayList) xVar.f11847e).size();
                        while (i17 < size && !equals(((java.util.ArrayList) xVar.f11847e).get(i17))) {
                            if (i17 == size - 1) {
                                return;
                            } else {
                                i17++;
                            }
                        }
                        ((java.util.ArrayList) xVar.f11847e).remove(i17);
                        xVar.notifyItemRemoved(i17);
                        return;
                    }
                    java.util.Iterator it = ((java.util.ArrayList) xVar.f11848f).iterator();
                    int i18 = -1;
                    while (it.hasNext()) {
                        androidx.preference.Preference preference = (androidx.preference.Preference) it.next();
                        if (equals(preference)) {
                            break;
                        } else if (preference.C) {
                            i18++;
                        }
                    }
                    int i19 = i18 + 1;
                    ((java.util.ArrayList) xVar.f11847e).add(i19, this);
                    xVar.notifyItemInserted(i19);
                }
            }
        }
    }

    public boolean J() {
        return !m();
    }

    public boolean L() {
        return this.f11748e != null && this.f11764x && (android.text.TextUtils.isEmpty(this.f11758r) ^ true);
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.preference.Preference preference) {
        androidx.preference.Preference preference2 = preference;
        int i17 = this.f11753m;
        int i18 = preference2.f11753m;
        if (i17 != i18) {
            return i17 - i18;
        }
        java.lang.CharSequence charSequence = this.f11754n;
        java.lang.CharSequence charSequence2 = preference2.f11754n;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f11754n.toString());
    }

    public boolean d(java.lang.Object obj) {
        androidx.preference.o oVar = this.f11751h;
        return oVar == null || oVar.h0(this, obj);
    }

    public void e(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        java.lang.String str = this.f11758r;
        if (!(!android.text.TextUtils.isEmpty(str)) || (parcelable = bundle.getParcelable(str)) == null) {
            return;
        }
        this.P = false;
        A(parcelable);
        if (!this.P) {
            throw new java.lang.IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void f(android.os.Bundle bundle) {
        java.lang.String str = this.f11758r;
        if (!android.text.TextUtils.isEmpty(str)) {
            this.P = false;
            android.os.Parcelable B = B();
            if (!this.P) {
                throw new java.lang.IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (B != null) {
                bundle.putParcelable(str, B);
            }
        }
    }

    public long i() {
        return this.f11749f;
    }

    public java.lang.String j(java.lang.String str) {
        if (!L()) {
            return str;
        }
        k();
        return this.f11748e.b().getString(this.f11758r, str);
    }

    public androidx.preference.q k() {
        androidx.preference.c0 c0Var = this.f11748e;
        if (c0Var != null) {
            c0Var.getClass();
        }
        return null;
    }

    public java.lang.CharSequence l() {
        return this.f11755o;
    }

    public boolean m() {
        return this.f11762v && this.A && this.B;
    }

    public void n() {
        androidx.preference.n nVar = this.L;
        if (nVar != null) {
            androidx.preference.x xVar = (androidx.preference.x) nVar;
            int indexOf = xVar.f11847e.indexOf(this);
            if (indexOf != -1) {
                xVar.notifyItemChanged(indexOf, this);
            }
        }
    }

    public void o(boolean z17) {
        java.util.List list = this.M;
        if (list == null) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            androidx.preference.Preference preference = (androidx.preference.Preference) arrayList.get(i17);
            if (preference.A == z17) {
                preference.A = !z17;
                preference.o(preference.J());
                preference.n();
            }
        }
    }

    public void p() {
        androidx.preference.c0 c0Var;
        androidx.preference.PreferenceScreen preferenceScreen;
        java.lang.String str = this.f11765y;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        androidx.preference.Preference M = (android.text.TextUtils.isEmpty(str) || (c0Var = this.f11748e) == null || (preferenceScreen = c0Var.f11800g) == null) ? null : preferenceScreen.M(str);
        if (M == null) {
            throw new java.lang.IllegalStateException("Dependency \"" + str + "\" not found for preference \"" + this.f11758r + "\" (title: \"" + ((java.lang.Object) this.f11754n) + "\"");
        }
        if (M.M == null) {
            M.M = new java.util.ArrayList();
        }
        ((java.util.ArrayList) M.M).add(this);
        boolean J2 = M.J();
        if (this.A == J2) {
            this.A = !J2;
            o(J());
            n();
        }
    }

    public void r(androidx.preference.c0 c0Var) {
        android.content.SharedPreferences sharedPreferences;
        long j17;
        this.f11748e = c0Var;
        if (!this.f11750g) {
            synchronized (c0Var) {
                j17 = c0Var.f11795b;
                c0Var.f11795b = 1 + j17;
            }
            this.f11749f = j17;
        }
        k();
        if (L()) {
            if (this.f11748e != null) {
                k();
                sharedPreferences = this.f11748e.b();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.f11758r)) {
                C(null);
                return;
            }
        }
        java.lang.Object obj = this.f11766z;
        if (obj != null) {
            C(obj);
        }
    }

    public void s(androidx.preference.f0 f0Var) {
        f0Var.itemView.setOnClickListener(this.Q);
        f0Var.itemView.setId(0);
        android.widget.TextView textView = (android.widget.TextView) f0Var.i(android.R.id.title);
        if (textView != null) {
            java.lang.CharSequence charSequence = this.f11754n;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequence);
                textView.setVisibility(0);
                if (this.F) {
                    textView.setSingleLine(this.G);
                }
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) f0Var.i(android.R.id.summary);
        if (textView2 != null) {
            java.lang.CharSequence l17 = l();
            if (android.text.TextUtils.isEmpty(l17)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(l17);
                textView2.setVisibility(0);
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) f0Var.i(android.R.id.icon);
        boolean z17 = this.H;
        if (imageView != null) {
            int i17 = this.f11756p;
            if (i17 != 0 || this.f11757q != null) {
                if (this.f11757q == null) {
                    this.f11757q = b3.l.getDrawable(this.f11747d, i17);
                }
                android.graphics.drawable.Drawable drawable = this.f11757q;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f11757q != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z17 ? 4 : 8);
            }
        }
        android.view.View i18 = f0Var.i(com.tencent.mm.R.id.h6w);
        if (i18 == null) {
            i18 = f0Var.i(android.R.id.icon_frame);
        }
        if (i18 != null) {
            if (this.f11757q != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(i18, arrayList.toArray(), "androidx/preference/Preference", "onBindViewHolder", "(Landroidx/preference/PreferenceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(i18, "androidx/preference/Preference", "onBindViewHolder", "(Landroidx/preference/PreferenceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                int i19 = z17 ? 4 : 8;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(i18, arrayList2.toArray(), "androidx/preference/Preference", "onBindViewHolder", "(Landroidx/preference/PreferenceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(i18, "androidx/preference/Preference", "onBindViewHolder", "(Landroidx/preference/PreferenceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.I) {
            G(f0Var.itemView, m());
        } else {
            G(f0Var.itemView, true);
        }
        android.view.View view = f0Var.itemView;
        boolean z18 = this.f11763w;
        view.setFocusable(z18);
        f0Var.itemView.setClickable(z18);
        f0Var.f11813e = this.D;
        f0Var.f11814f = this.E;
    }

    public void t() {
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.CharSequence charSequence = this.f11754n;
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            sb6.append(charSequence);
            sb6.append(' ');
        }
        java.lang.CharSequence l17 = l();
        if (!android.text.TextUtils.isEmpty(l17)) {
            sb6.append(l17);
            sb6.append(' ');
        }
        if (sb6.length() > 0) {
            sb6.setLength(sb6.length() - 1);
        }
        return sb6.toString();
    }

    public void u() {
        java.util.List list;
        androidx.preference.c0 c0Var;
        androidx.preference.PreferenceScreen preferenceScreen;
        java.lang.String str = this.f11765y;
        if (str != null) {
            androidx.preference.Preference M = (android.text.TextUtils.isEmpty(str) || (c0Var = this.f11748e) == null || (preferenceScreen = c0Var.f11800g) == null) ? null : preferenceScreen.M(str);
            if (M == null || (list = M.M) == null) {
                return;
            }
            ((java.util.ArrayList) list).remove(this);
        }
    }

    public java.lang.Object w(android.content.res.TypedArray typedArray, int i17) {
        return null;
    }

    public void y(o3.l lVar) {
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.tencent.mm.R.attr.f478367hy, android.R.attr.preferenceStyle));
    }
}
