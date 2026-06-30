package p012xc85e97e9.p073xee01125a.p074xd1075a44;

/* loaded from: classes15.dex */
public class c extends android.view.ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior f92539a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f92540b;

    /* renamed from: c, reason: collision with root package name */
    public int f92541c;

    /* renamed from: d, reason: collision with root package name */
    public int f92542d;

    /* renamed from: e, reason: collision with root package name */
    public final int f92543e;

    /* renamed from: f, reason: collision with root package name */
    public final int f92544f;

    /* renamed from: g, reason: collision with root package name */
    public final int f92545g;

    /* renamed from: h, reason: collision with root package name */
    public int f92546h;

    /* renamed from: i, reason: collision with root package name */
    public int f92547i;

    /* renamed from: j, reason: collision with root package name */
    public int f92548j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f92549k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f92550l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92551m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f92552n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f92553o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f92554p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f92555q;

    public c(int i17, int i18) {
        super(i17, i18);
        this.f92540b = false;
        this.f92541c = 0;
        this.f92542d = 0;
        this.f92543e = -1;
        this.f92544f = -1;
        this.f92545g = 0;
        this.f92546h = 0;
        this.f92555q = new android.graphics.Rect();
    }

    public boolean a(int i17) {
        if (i17 == 0) {
            return this.f92552n;
        }
        if (i17 != 1) {
            return false;
        }
        return this.f92553o;
    }

    public void b(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior2 = this.f92539a;
        if (behavior2 != behavior) {
            if (behavior2 != null) {
                behavior2.getClass();
            }
            this.f92539a = behavior;
            this.f92540b = true;
            if (behavior != null) {
                behavior.c(this);
            }
        }
    }

    public c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior;
        this.f92540b = false;
        this.f92541c = 0;
        this.f92542d = 0;
        this.f92543e = -1;
        this.f92544f = -1;
        this.f92545g = 0;
        this.f92546h = 0;
        this.f92555q = new android.graphics.Rect();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w2.a.f523807b);
        this.f92541c = obtainStyledAttributes.getInteger(0, 0);
        this.f92544f = obtainStyledAttributes.getResourceId(1, -1);
        this.f92542d = obtainStyledAttributes.getInteger(2, 0);
        this.f92543e = obtainStyledAttributes.getInteger(6, -1);
        this.f92545g = obtainStyledAttributes.getInt(5, 0);
        this.f92546h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f92540b = hasValue;
        if (hasValue) {
            java.lang.String string = obtainStyledAttributes.getString(3);
            java.lang.String str = p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.f92518y;
            if (android.text.TextUtils.isEmpty(string)) {
                behavior = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    java.lang.String str2 = p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.f92518y;
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    java.lang.ThreadLocal threadLocal = p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.A;
                    java.util.Map map = (java.util.Map) threadLocal.get();
                    if (map == null) {
                        map = new java.util.HashMap();
                        threadLocal.set(map);
                    }
                    java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = context.getClassLoader().loadClass(string).getConstructor(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.f92519z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    behavior = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior) constructor.newInstance(context, attributeSet);
                } catch (java.lang.Exception e17) {
                    throw new java.lang.RuntimeException("Could not inflate Behavior subclass " + string, e17);
                }
            }
            this.f92539a = behavior;
        }
        obtainStyledAttributes.recycle();
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior2 = this.f92539a;
        if (behavior2 != null) {
            behavior2.c(this);
        }
    }

    public c(p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar) {
        super((android.view.ViewGroup.MarginLayoutParams) cVar);
        this.f92540b = false;
        this.f92541c = 0;
        this.f92542d = 0;
        this.f92543e = -1;
        this.f92544f = -1;
        this.f92545g = 0;
        this.f92546h = 0;
        this.f92555q = new android.graphics.Rect();
    }

    public c(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f92540b = false;
        this.f92541c = 0;
        this.f92542d = 0;
        this.f92543e = -1;
        this.f92544f = -1;
        this.f92545g = 0;
        this.f92546h = 0;
        this.f92555q = new android.graphics.Rect();
    }

    public c(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f92540b = false;
        this.f92541c = 0;
        this.f92542d = 0;
        this.f92543e = -1;
        this.f92544f = -1;
        this.f92545g = 0;
        this.f92546h = 0;
        this.f92555q = new android.graphics.Rect();
    }
}
