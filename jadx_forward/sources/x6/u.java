package x6;

/* loaded from: classes13.dex */
public class u implements x6.p {

    /* renamed from: d, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f533706d;

    /* renamed from: e, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f533707e;

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f533708f;

    /* renamed from: g, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f533709g;

    /* renamed from: h, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f533710h;

    /* renamed from: a, reason: collision with root package name */
    public final x6.t f533711a = new x6.t();

    /* renamed from: b, reason: collision with root package name */
    public final x6.h f533712b = new x6.h();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f533713c = new java.util.HashMap();

    static {
        android.graphics.Bitmap.Config[] configArr = {android.graphics.Bitmap.Config.ARGB_8888, null};
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            configArr = (android.graphics.Bitmap.Config[]) java.util.Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = android.graphics.Bitmap.Config.RGBA_F16;
        }
        f533706d = configArr;
        f533707e = configArr;
        f533708f = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.RGB_565};
        f533709g = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_4444};
        f533710h = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ALPHA_8};
    }

    public static java.lang.String c(int i17, android.graphics.Bitmap.Config config) {
        return "[" + i17 + "](" + config + ")";
    }

    public final void a(java.lang.Integer num, android.graphics.Bitmap bitmap) {
        java.util.NavigableMap d17 = d(bitmap.getConfig());
        java.lang.Integer num2 = (java.lang.Integer) d17.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d17.remove(num);
                return;
            } else {
                d17.put(num, java.lang.Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new java.lang.NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    public android.graphics.Bitmap b(int i17, int i18, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap.Config[] configArr;
        int b17 = q7.p.b(i17, i18, config);
        x6.t tVar = this.f533711a;
        x6.s sVar = (x6.s) tVar.b();
        sVar.f533704b = b17;
        sVar.f533705c = config;
        int i19 = 0;
        if (android.os.Build.VERSION.SDK_INT < 26 || !android.graphics.Bitmap.Config.RGBA_F16.equals(config)) {
            int i27 = x6.r.f533702a[config.ordinal()];
            configArr = i27 != 1 ? i27 != 2 ? i27 != 3 ? i27 != 4 ? new android.graphics.Bitmap.Config[]{config} : f533710h : f533709g : f533708f : f533706d;
        } else {
            configArr = f533707e;
        }
        int length = configArr.length;
        while (true) {
            if (i19 >= length) {
                break;
            }
            android.graphics.Bitmap.Config config2 = configArr[i19];
            java.lang.Integer num = (java.lang.Integer) d(config2).ceilingKey(java.lang.Integer.valueOf(b17));
            if (num == null || num.intValue() > b17 * 8) {
                i19++;
            } else if (num.intValue() != b17 || (config2 != null ? !config2.equals(config) : config != null)) {
                tVar.c(sVar);
                int intValue = num.intValue();
                sVar = (x6.s) tVar.b();
                sVar.f533704b = intValue;
                sVar.f533705c = config2;
            }
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f533712b.a(sVar);
        if (bitmap != null) {
            a(java.lang.Integer.valueOf(sVar.f533704b), bitmap);
            bitmap.reconfigure(i17, i18, config);
        }
        return bitmap;
    }

    public final java.util.NavigableMap d(android.graphics.Bitmap.Config config) {
        java.util.Map map = this.f533713c;
        java.util.NavigableMap navigableMap = (java.util.NavigableMap) ((java.util.HashMap) map).get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        ((java.util.HashMap) map).put(config, treeMap);
        return treeMap;
    }

    public java.lang.String e(android.graphics.Bitmap bitmap) {
        return c(q7.p.c(bitmap), bitmap.getConfig());
    }

    public void f(android.graphics.Bitmap bitmap) {
        int c17 = q7.p.c(bitmap);
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        x6.s sVar = (x6.s) this.f533711a.b();
        sVar.f533704b = c17;
        sVar.f533705c = config;
        this.f533712b.b(sVar, bitmap);
        java.util.NavigableMap d17 = d(bitmap.getConfig());
        java.lang.Integer num = (java.lang.Integer) d17.get(java.lang.Integer.valueOf(sVar.f533704b));
        d17.put(java.lang.Integer.valueOf(sVar.f533704b), java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* renamed from: toString */
    public java.lang.String m175064x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("SizeConfigStrategy{groupedMap=");
        sb6.append(this.f533712b);
        sb6.append(", sortedSizes=(");
        java.util.Map map = this.f533713c;
        for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
            sb6.append(entry.getKey());
            sb6.append('[');
            sb6.append(entry.getValue());
            sb6.append("], ");
        }
        if (!((java.util.HashMap) map).isEmpty()) {
            sb6.replace(sb6.length() - 2, sb6.length(), "");
        }
        sb6.append(")}");
        return sb6.toString();
    }
}
