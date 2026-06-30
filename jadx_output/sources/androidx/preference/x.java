package androidx.preference;

/* loaded from: classes13.dex */
public class x extends androidx.recyclerview.widget.f2 implements androidx.preference.n {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.preference.PreferenceGroup f11846d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f11847e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f11848f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f11849g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.preference.w f11850h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f11851i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.preference.d f11852m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f11853n;

    public x(androidx.preference.PreferenceGroup preferenceGroup) {
        android.os.Handler handler = new android.os.Handler();
        this.f11850h = new androidx.preference.w();
        this.f11853n = new androidx.preference.v(this);
        this.f11846d = preferenceGroup;
        this.f11851i = handler;
        this.f11852m = new androidx.preference.d(preferenceGroup, this);
        preferenceGroup.L = this;
        this.f11847e = new java.util.ArrayList();
        this.f11848f = new java.util.ArrayList();
        this.f11849g = new java.util.ArrayList();
        if (preferenceGroup instanceof androidx.preference.PreferenceScreen) {
            setHasStableIds(((androidx.preference.PreferenceScreen) preferenceGroup).X);
        } else {
            setHasStableIds(true);
        }
        z();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f11847e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        if (hasStableIds()) {
            return y(i17).i();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        androidx.preference.Preference y17 = y(i17);
        androidx.preference.w wVar = this.f11850h;
        if (wVar == null) {
            wVar = new androidx.preference.w();
        }
        wVar.f11845c = y17.getClass().getName();
        wVar.f11843a = y17.f11746J;
        wVar.f11844b = y17.K;
        this.f11850h = wVar;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f11849g;
        int indexOf = arrayList.indexOf(wVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(new androidx.preference.w(this.f11850h));
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        y(i17).s((androidx.preference.f0) k3Var);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        androidx.preference.w wVar = (androidx.preference.w) ((java.util.ArrayList) this.f11849g).get(i17);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        android.content.res.TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((android.util.AttributeSet) null, androidx.preference.g0.f11815a);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = b3.l.getDrawable(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        android.view.View inflate = from.inflate(wVar.f11843a, viewGroup, false);
        if (inflate.getBackground() == null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.q(inflate, drawable);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i18 = wVar.f11844b;
            if (i18 != 0) {
                from.inflate(i18, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new androidx.preference.f0(inflate);
    }

    public final void x(java.util.List list, androidx.preference.PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            java.util.Collections.sort(preferenceGroup.R);
        }
        int O = preferenceGroup.O();
        for (int i17 = 0; i17 < O; i17++) {
            androidx.preference.Preference N = preferenceGroup.N(i17);
            list.add(N);
            androidx.preference.w wVar = new androidx.preference.w();
            wVar.f11845c = N.getClass().getName();
            wVar.f11843a = N.f11746J;
            wVar.f11844b = N.K;
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f11849g;
            if (!arrayList.contains(wVar)) {
                arrayList.add(wVar);
            }
            if (N instanceof androidx.preference.PreferenceGroup) {
                androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) N;
                if (!(preferenceGroup2 instanceof androidx.preference.PreferenceScreen)) {
                    x(list, preferenceGroup2);
                }
            }
            N.L = this;
        }
    }

    public androidx.preference.Preference y(int i17) {
        if (i17 < 0 || i17 >= getItemCount()) {
            return null;
        }
        return (androidx.preference.Preference) this.f11847e.get(i17);
    }

    public void z() {
        java.util.Iterator it = this.f11848f.iterator();
        while (it.hasNext()) {
            ((androidx.preference.Preference) it.next()).L = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f11848f.size());
        androidx.preference.PreferenceGroup preferenceGroup = this.f11846d;
        x(arrayList, preferenceGroup);
        this.f11847e = this.f11852m.a(preferenceGroup);
        this.f11848f = arrayList;
        androidx.preference.c0 c0Var = preferenceGroup.f11748e;
        notifyDataSetChanged();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((androidx.preference.Preference) it6.next()).getClass();
        }
    }
}
