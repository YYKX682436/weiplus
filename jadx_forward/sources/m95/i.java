package m95;

/* loaded from: classes13.dex */
public class i extends android.graphics.drawable.Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final int f406632a;

    /* renamed from: b, reason: collision with root package name */
    public final long f406633b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.res.Resources f406634c;

    /* renamed from: d, reason: collision with root package name */
    public final int f406635d;

    public i(int i17, android.content.res.Resources resources, long j17, int i18) {
        this.f406632a = 0;
        this.f406633b = 0L;
        this.f406635d = 0;
        if (i17 == 0) {
            n95.d.a("MicroMsg.SVGResourceLoader", "SVGConstantState Why this id is %d. TypedValue %s", java.lang.Integer.valueOf(i17));
            n95.d.b("MicroMsg.SVGResourceLoader", android.util.Log.getStackTraceString(new java.lang.Throwable()), new java.lang.Object[0]);
        }
        this.f406632a = i17;
        this.f406634c = resources;
        this.f406633b = j17;
        this.f406635d = i18;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        java.util.Map map;
        try {
            java.util.HashMap hashMap = (java.util.HashMap) m95.k.f406649m;
            java.util.Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    map = null;
                    break;
                }
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                android.content.res.Resources resources2 = (android.content.res.Resources) weakReference.get();
                if (resources2 != null && resources2 == resources) {
                    map = (java.util.Map) hashMap.get(weakReference);
                    break;
                }
            }
            if (map != null) {
                int intValue = ((java.lang.Integer) map.get(java.lang.Long.valueOf(this.f406633b))).intValue();
                android.graphics.drawable.Drawable f17 = m95.k.f(resources, intValue);
                n95.d.b("MicroMsg.SVGResourceLoader", "loadDrawableSkipCache id:" + java.lang.Integer.toHexString(intValue) + ",drawable:" + f17, new java.lang.Object[0]);
                return f17;
            }
        } catch (java.lang.Exception e17) {
            n95.d.b("MicroMsg.SVGResourceLoader", "newDrawable loadDrawableSkipCache error:" + e17.getMessage(), new java.lang.Object[0]);
        }
        return newDrawable();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable() {
        int i17 = this.f406632a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f406633b);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f406635d);
        android.content.res.Resources resources = this.f406634c;
        n95.d.b("MicroMsg.SVGResourceLoader", "newDrawable mResources %s %s %s %s", resources, valueOf, valueOf2, valueOf3);
        return m95.a.e(resources, i17, 0.0f);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        return newDrawable(resources);
    }
}
