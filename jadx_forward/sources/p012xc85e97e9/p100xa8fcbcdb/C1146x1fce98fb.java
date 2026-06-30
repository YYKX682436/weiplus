package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.Preference */
/* loaded from: classes13.dex */
public class C1146x1fce98fb implements java.lang.Comparable<p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb> {
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
    public int f93279J;
    public final int K;
    public p012xc85e97e9.p100xa8fcbcdb.n L;
    public java.util.List M;
    public p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 N;
    public boolean P;
    public final android.view.View.OnClickListener Q;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f93280d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.c0 f93281e;

    /* renamed from: f, reason: collision with root package name */
    public long f93282f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93283g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.o f93284h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.p f93285i;

    /* renamed from: m, reason: collision with root package name */
    public int f93286m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f93287n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f93288o;

    /* renamed from: p, reason: collision with root package name */
    public int f93289p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f93290q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f93291r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.Intent f93292s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f93293t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.Bundle f93294u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f93295v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f93296w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f93297x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f93298y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Object f93299z;

    /* renamed from: androidx.preference.Preference$BaseSavedState */
    /* loaded from: classes13.dex */
    public static class BaseSavedState extends android.view.AbsSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb.BaseSavedState> f3586x681a0c0c = new p012xc85e97e9.p100xa8fcbcdb.m();

        public BaseSavedState(android.os.Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public C1146x1fce98fb(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        this.f93286m = Integer.MAX_VALUE;
        this.f93295v = true;
        this.f93296w = true;
        this.f93297x = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.G = true;
        this.I = true;
        this.f93279J = com.p314xaae8f345.mm.R.C30864xbddafb2a.c_d;
        this.Q = new p012xc85e97e9.p100xa8fcbcdb.l(this);
        this.f93280d = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p100xa8fcbcdb.g0.f93353f, i17, i18);
        this.f93289p = obtainStyledAttributes.getResourceId(22, obtainStyledAttributes.getResourceId(0, 0));
        this.f93291r = d3.r.h(obtainStyledAttributes, 25, 6);
        java.lang.CharSequence text = obtainStyledAttributes.getText(33);
        this.f93287n = text == null ? obtainStyledAttributes.getText(4) : text;
        java.lang.CharSequence text2 = obtainStyledAttributes.getText(32);
        this.f93288o = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f93286m = obtainStyledAttributes.getInt(27, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        this.f93293t = d3.r.h(obtainStyledAttributes, 21, 13);
        this.f93279J = obtainStyledAttributes.getResourceId(26, obtainStyledAttributes.getResourceId(3, com.p314xaae8f345.mm.R.C30864xbddafb2a.c_d));
        this.K = obtainStyledAttributes.getResourceId(34, obtainStyledAttributes.getResourceId(9, 0));
        this.f93295v = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(2, true));
        boolean z17 = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(5, true));
        this.f93296w = z17;
        this.f93297x = obtainStyledAttributes.getBoolean(28, obtainStyledAttributes.getBoolean(1, true));
        this.f93298y = d3.r.h(obtainStyledAttributes, 19, 10);
        this.D = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z17));
        this.E = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z17));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f93299z = w(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f93299z = w(obtainStyledAttributes, 11);
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
        p012xc85e97e9.p100xa8fcbcdb.b0 b0Var;
        if (m()) {
            t();
            p012xc85e97e9.p100xa8fcbcdb.p pVar = this.f93285i;
            if (pVar != null) {
                p012xc85e97e9.p100xa8fcbcdb.b bVar = (p012xc85e97e9.p100xa8fcbcdb.b) pVar;
                bVar.f93325a.V = Integer.MAX_VALUE;
                p012xc85e97e9.p100xa8fcbcdb.x xVar = bVar.f93326b.f93337a;
                android.os.Handler handler = xVar.f93384i;
                java.lang.Runnable runnable = xVar.f93386n;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
                return;
            }
            p012xc85e97e9.p100xa8fcbcdb.c0 c0Var = this.f93281e;
            if ((c0Var == null || (b0Var = c0Var.f93334h) == null || !b0Var.H(this)) && (intent = this.f93292s) != null) {
                android.content.Context context = this.f93280d;
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
        android.content.SharedPreferences.Editor a17 = this.f93281e.a();
        a17.putString(this.f93291r, str);
        if (!this.f93281e.f93331e) {
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
        if ((charSequence != null || this.f93288o == null) && (charSequence == null || charSequence.equals(this.f93288o))) {
            return;
        }
        this.f93288o = charSequence;
        n();
    }

    public final void I(boolean z17) {
        boolean z18;
        if (this.C != z17) {
            this.C = z17;
            p012xc85e97e9.p100xa8fcbcdb.n nVar = this.L;
            if (nVar != null) {
                p012xc85e97e9.p100xa8fcbcdb.x xVar = (p012xc85e97e9.p100xa8fcbcdb.x) nVar;
                if (((java.util.ArrayList) xVar.f93381f).contains(this)) {
                    p012xc85e97e9.p100xa8fcbcdb.d dVar = xVar.f93385m;
                    dVar.getClass();
                    int i17 = 0;
                    if ((this instanceof p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) || dVar.f93339c) {
                        p012xc85e97e9.p100xa8fcbcdb.x xVar2 = dVar.f93337a;
                        android.os.Handler handler = xVar2.f93384i;
                        java.lang.Runnable runnable = xVar2.f93386n;
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
                        int size = ((java.util.ArrayList) xVar.f93380e).size();
                        while (i17 < size && !equals(((java.util.ArrayList) xVar.f93380e).get(i17))) {
                            if (i17 == size - 1) {
                                return;
                            } else {
                                i17++;
                            }
                        }
                        ((java.util.ArrayList) xVar.f93380e).remove(i17);
                        xVar.m8155x27702c4(i17);
                        return;
                    }
                    java.util.Iterator it = ((java.util.ArrayList) xVar.f93381f).iterator();
                    int i18 = -1;
                    while (it.hasNext()) {
                        p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb = (p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb) it.next();
                        if (equals(c1146x1fce98fb)) {
                            break;
                        } else if (c1146x1fce98fb.C) {
                            i18++;
                        }
                    }
                    int i19 = i18 + 1;
                    ((java.util.ArrayList) xVar.f93380e).add(i19, this);
                    xVar.m8149x8b456734(i19);
                }
            }
        }
    }

    public boolean J() {
        return !m();
    }

    public boolean L() {
        return this.f93281e != null && this.f93297x && (android.text.TextUtils.isEmpty(this.f93291r) ^ true);
    }

    @Override // java.lang.Comparable
    public int compareTo(p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb) {
        p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb2 = c1146x1fce98fb;
        int i17 = this.f93286m;
        int i18 = c1146x1fce98fb2.f93286m;
        if (i17 != i18) {
            return i17 - i18;
        }
        java.lang.CharSequence charSequence = this.f93287n;
        java.lang.CharSequence charSequence2 = c1146x1fce98fb2.f93287n;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(c1146x1fce98fb2.f93287n.toString());
    }

    public boolean d(java.lang.Object obj) {
        p012xc85e97e9.p100xa8fcbcdb.o oVar = this.f93284h;
        return oVar == null || oVar.h0(this, obj);
    }

    public void e(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        java.lang.String str = this.f93291r;
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
        java.lang.String str = this.f93291r;
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
        return this.f93282f;
    }

    public java.lang.String j(java.lang.String str) {
        if (!L()) {
            return str;
        }
        k();
        return this.f93281e.b().getString(this.f93291r, str);
    }

    public p012xc85e97e9.p100xa8fcbcdb.q k() {
        p012xc85e97e9.p100xa8fcbcdb.c0 c0Var = this.f93281e;
        if (c0Var != null) {
            c0Var.getClass();
        }
        return null;
    }

    public java.lang.CharSequence l() {
        return this.f93288o;
    }

    public boolean m() {
        return this.f93295v && this.A && this.B;
    }

    public void n() {
        p012xc85e97e9.p100xa8fcbcdb.n nVar = this.L;
        if (nVar != null) {
            p012xc85e97e9.p100xa8fcbcdb.x xVar = (p012xc85e97e9.p100xa8fcbcdb.x) nVar;
            int indexOf = xVar.f93380e.indexOf(this);
            if (indexOf != -1) {
                xVar.m8148xed6e4d18(indexOf, this);
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
            p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb = (p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb) arrayList.get(i17);
            if (c1146x1fce98fb.A == z17) {
                c1146x1fce98fb.A = !z17;
                c1146x1fce98fb.o(c1146x1fce98fb.J());
                c1146x1fce98fb.n();
            }
        }
    }

    public void p() {
        p012xc85e97e9.p100xa8fcbcdb.c0 c0Var;
        p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d47;
        java.lang.String str = this.f93298y;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb M = (android.text.TextUtils.isEmpty(str) || (c0Var = this.f93281e) == null || (c1151xb1835d47 = c0Var.f93333g) == null) ? null : c1151xb1835d47.M(str);
        if (M == null) {
            throw new java.lang.IllegalStateException("Dependency \"" + str + "\" not found for preference \"" + this.f93291r + "\" (title: \"" + ((java.lang.Object) this.f93287n) + "\"");
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

    public void r(p012xc85e97e9.p100xa8fcbcdb.c0 c0Var) {
        android.content.SharedPreferences sharedPreferences;
        long j17;
        this.f93281e = c0Var;
        if (!this.f93283g) {
            synchronized (c0Var) {
                j17 = c0Var.f93328b;
                c0Var.f93328b = 1 + j17;
            }
            this.f93282f = j17;
        }
        k();
        if (L()) {
            if (this.f93281e != null) {
                k();
                sharedPreferences = this.f93281e.b();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.f93291r)) {
                C(null);
                return;
            }
        }
        java.lang.Object obj = this.f93299z;
        if (obj != null) {
            C(obj);
        }
    }

    public void s(p012xc85e97e9.p100xa8fcbcdb.f0 f0Var) {
        f0Var.f3639x46306858.setOnClickListener(this.Q);
        f0Var.f3639x46306858.setId(0);
        android.widget.TextView textView = (android.widget.TextView) f0Var.i(android.R.id.title);
        if (textView != null) {
            java.lang.CharSequence charSequence = this.f93287n;
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
            int i17 = this.f93289p;
            if (i17 != 0 || this.f93290q != null) {
                if (this.f93290q == null) {
                    this.f93290q = b3.l.m9707x4a96be14(this.f93280d, i17);
                }
                android.graphics.drawable.Drawable drawable = this.f93290q;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f93290q != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z17 ? 4 : 8);
            }
        }
        android.view.View i18 = f0Var.i(com.p314xaae8f345.mm.R.id.h6w);
        if (i18 == null) {
            i18 = f0Var.i(android.R.id.icon_frame);
        }
        if (i18 != null) {
            if (this.f93290q != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(i18, arrayList.toArray(), "androidx/preference/Preference", "onBindViewHolder", "(Landroidx/preference/PreferenceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(i18, "androidx/preference/Preference", "onBindViewHolder", "(Landroidx/preference/PreferenceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                int i19 = z17 ? 4 : 8;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(i18, arrayList2.toArray(), "androidx/preference/Preference", "onBindViewHolder", "(Landroidx/preference/PreferenceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(i18, "androidx/preference/Preference", "onBindViewHolder", "(Landroidx/preference/PreferenceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.I) {
            G(f0Var.f3639x46306858, m());
        } else {
            G(f0Var.f3639x46306858, true);
        }
        android.view.View view = f0Var.f3639x46306858;
        boolean z18 = this.f93296w;
        view.setFocusable(z18);
        f0Var.f3639x46306858.setClickable(z18);
        f0Var.f93346e = this.D;
        f0Var.f93347f = this.E;
    }

    public void t() {
    }

    /* renamed from: toString */
    public java.lang.String m7896x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.CharSequence charSequence = this.f93287n;
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
        p012xc85e97e9.p100xa8fcbcdb.c0 c0Var;
        p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d47;
        java.lang.String str = this.f93298y;
        if (str != null) {
            p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb M = (android.text.TextUtils.isEmpty(str) || (c0Var = this.f93281e) == null || (c1151xb1835d47 = c0Var.f93333g) == null) ? null : c1151xb1835d47.M(str);
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

    public C1146x1fce98fb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public C1146x1fce98fb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559900hy, android.R.attr.preferenceStyle));
    }
}
