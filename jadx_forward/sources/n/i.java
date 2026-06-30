package n;

/* loaded from: classes15.dex */
public class i {
    public java.lang.CharSequence A;
    public java.lang.CharSequence B;
    public final /* synthetic */ n.j E;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Menu f414915a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f414922h;

    /* renamed from: i, reason: collision with root package name */
    public int f414923i;

    /* renamed from: j, reason: collision with root package name */
    public int f414924j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f414925k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.CharSequence f414926l;

    /* renamed from: m, reason: collision with root package name */
    public int f414927m;

    /* renamed from: n, reason: collision with root package name */
    public char f414928n;

    /* renamed from: o, reason: collision with root package name */
    public int f414929o;

    /* renamed from: p, reason: collision with root package name */
    public char f414930p;

    /* renamed from: q, reason: collision with root package name */
    public int f414931q;

    /* renamed from: r, reason: collision with root package name */
    public int f414932r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f414933s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f414934t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f414935u;

    /* renamed from: v, reason: collision with root package name */
    public int f414936v;

    /* renamed from: w, reason: collision with root package name */
    public int f414937w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f414938x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f414939y;

    /* renamed from: z, reason: collision with root package name */
    public n3.f f414940z;
    public android.content.res.ColorStateList C = null;
    public android.graphics.PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f414916b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f414917c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f414918d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f414919e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f414920f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f414921g = true;

    public i(n.j jVar, android.view.Menu menu) {
        this.E = jVar;
        this.f414915a = menu;
    }

    public final void a(android.view.MenuItem menuItem) {
        java.lang.Object obj;
        boolean z17 = false;
        menuItem.setChecked(this.f414933s).setVisible(this.f414934t).setEnabled(this.f414935u).setCheckable(this.f414932r >= 1).setTitleCondensed(this.f414926l).setIcon(this.f414927m);
        int i17 = this.f414936v;
        if (i17 >= 0) {
            menuItem.setShowAsAction(i17);
        }
        java.lang.String str = this.f414939y;
        n.j jVar = this.E;
        if (str != null) {
            if (jVar.f414945c.isRestricted()) {
                throw new java.lang.IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (jVar.f414946d == null) {
                jVar.f414946d = jVar.a(jVar.f414945c);
            }
            menuItem.setOnMenuItemClickListener(new n.h(jVar.f414946d, this.f414939y));
        }
        boolean z18 = menuItem instanceof o.u;
        if (z18) {
        }
        if (this.f414932r >= 2) {
            if (z18) {
                ((o.u) menuItem).f(true);
            } else if (menuItem instanceof o.z) {
                o.z zVar = (o.z) menuItem;
                try {
                    java.lang.reflect.Method method = zVar.f423362g;
                    java.lang.Object obj2 = zVar.f423247d;
                    if (method == null) {
                        zVar.f423362g = ((g3.b) obj2).getClass().getDeclaredMethod("setExclusiveCheckable", java.lang.Boolean.TYPE);
                    }
                    zVar.f423362g.invoke(obj2, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        java.lang.String str2 = this.f414938x;
        if (str2 != null) {
            java.lang.Class<?>[] clsArr = n.j.f414941e;
            java.lang.Object[] objArr = jVar.f414943a;
            try {
                java.lang.reflect.Constructor<?> constructor = jVar.f414945c.getClassLoader().loadClass(str2).getConstructor(clsArr);
                constructor.setAccessible(true);
                obj = constructor.newInstance(objArr);
            } catch (java.lang.Exception unused2) {
                obj = null;
            }
            menuItem.setActionView((android.view.View) obj);
            z17 = true;
        }
        int i18 = this.f414937w;
        if (i18 > 0 && !z17) {
            menuItem.setActionView(i18);
        }
        n3.f fVar = this.f414940z;
        if (fVar != null && (menuItem instanceof g3.b)) {
            ((g3.b) menuItem).a(fVar);
        }
        java.lang.CharSequence charSequence = this.A;
        boolean z19 = menuItem instanceof g3.b;
        if (z19) {
            ((g3.b) menuItem).setContentDescription(charSequence);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            n3.z.h(menuItem, charSequence);
        }
        java.lang.CharSequence charSequence2 = this.B;
        if (z19) {
            ((g3.b) menuItem).setTooltipText(charSequence2);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            n3.z.m(menuItem, charSequence2);
        }
        char c17 = this.f414928n;
        int i19 = this.f414929o;
        if (z19) {
            ((g3.b) menuItem).setAlphabeticShortcut(c17, i19);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            n3.z.g(menuItem, c17, i19);
        }
        char c18 = this.f414930p;
        int i27 = this.f414931q;
        if (z19) {
            ((g3.b) menuItem).setNumericShortcut(c18, i27);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            n3.z.k(menuItem, c18, i27);
        }
        android.graphics.PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z19) {
                ((g3.b) menuItem).setIconTintMode(mode);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                n3.z.j(menuItem, mode);
            }
        }
        android.content.res.ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z19) {
                ((g3.b) menuItem).setIconTintList(colorStateList);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                n3.z.i(menuItem, colorStateList);
            }
        }
    }
}
