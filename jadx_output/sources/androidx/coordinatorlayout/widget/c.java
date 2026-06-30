package androidx.coordinatorlayout.widget;

/* loaded from: classes15.dex */
public class c extends android.view.ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior f11006a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11007b;

    /* renamed from: c, reason: collision with root package name */
    public int f11008c;

    /* renamed from: d, reason: collision with root package name */
    public int f11009d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11010e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11011f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11012g;

    /* renamed from: h, reason: collision with root package name */
    public int f11013h;

    /* renamed from: i, reason: collision with root package name */
    public int f11014i;

    /* renamed from: j, reason: collision with root package name */
    public int f11015j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f11016k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f11017l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11018m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11019n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11020o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11021p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f11022q;

    public c(int i17, int i18) {
        super(i17, i18);
        this.f11007b = false;
        this.f11008c = 0;
        this.f11009d = 0;
        this.f11010e = -1;
        this.f11011f = -1;
        this.f11012g = 0;
        this.f11013h = 0;
        this.f11022q = new android.graphics.Rect();
    }

    public boolean a(int i17) {
        if (i17 == 0) {
            return this.f11019n;
        }
        if (i17 != 1) {
            return false;
        }
        return this.f11020o;
    }

    public void b(androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior2 = this.f11006a;
        if (behavior2 != behavior) {
            if (behavior2 != null) {
                behavior2.getClass();
            }
            this.f11006a = behavior;
            this.f11007b = true;
            if (behavior != null) {
                behavior.c(this);
            }
        }
    }

    public c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        this.f11007b = false;
        this.f11008c = 0;
        this.f11009d = 0;
        this.f11010e = -1;
        this.f11011f = -1;
        this.f11012g = 0;
        this.f11013h = 0;
        this.f11022q = new android.graphics.Rect();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w2.a.f442274b);
        this.f11008c = obtainStyledAttributes.getInteger(0, 0);
        this.f11011f = obtainStyledAttributes.getResourceId(1, -1);
        this.f11009d = obtainStyledAttributes.getInteger(2, 0);
        this.f11010e = obtainStyledAttributes.getInteger(6, -1);
        this.f11012g = obtainStyledAttributes.getInt(5, 0);
        this.f11013h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f11007b = hasValue;
        if (hasValue) {
            java.lang.String string = obtainStyledAttributes.getString(3);
            java.lang.String str = androidx.coordinatorlayout.widget.CoordinatorLayout.f10985y;
            if (android.text.TextUtils.isEmpty(string)) {
                behavior = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    java.lang.String str2 = androidx.coordinatorlayout.widget.CoordinatorLayout.f10985y;
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    java.lang.ThreadLocal threadLocal = androidx.coordinatorlayout.widget.CoordinatorLayout.A;
                    java.util.Map map = (java.util.Map) threadLocal.get();
                    if (map == null) {
                        map = new java.util.HashMap();
                        threadLocal.set(map);
                    }
                    java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = context.getClassLoader().loadClass(string).getConstructor(androidx.coordinatorlayout.widget.CoordinatorLayout.f10986z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    behavior = (androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) constructor.newInstance(context, attributeSet);
                } catch (java.lang.Exception e17) {
                    throw new java.lang.RuntimeException("Could not inflate Behavior subclass " + string, e17);
                }
            }
            this.f11006a = behavior;
        }
        obtainStyledAttributes.recycle();
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior2 = this.f11006a;
        if (behavior2 != null) {
            behavior2.c(this);
        }
    }

    public c(androidx.coordinatorlayout.widget.c cVar) {
        super((android.view.ViewGroup.MarginLayoutParams) cVar);
        this.f11007b = false;
        this.f11008c = 0;
        this.f11009d = 0;
        this.f11010e = -1;
        this.f11011f = -1;
        this.f11012g = 0;
        this.f11013h = 0;
        this.f11022q = new android.graphics.Rect();
    }

    public c(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f11007b = false;
        this.f11008c = 0;
        this.f11009d = 0;
        this.f11010e = -1;
        this.f11011f = -1;
        this.f11012g = 0;
        this.f11013h = 0;
        this.f11022q = new android.graphics.Rect();
    }

    public c(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f11007b = false;
        this.f11008c = 0;
        this.f11009d = 0;
        this.f11010e = -1;
        this.f11011f = -1;
        this.f11012g = 0;
        this.f11013h = 0;
        this.f11022q = new android.graphics.Rect();
    }
}
