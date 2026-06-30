package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class kw implements com.tencent.mapsdk.internal.ky {

    /* renamed from: a, reason: collision with root package name */
    static java.util.Set<java.lang.String> f50193a;

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f50194g;

    /* renamed from: b, reason: collision with root package name */
    boolean f50195b;

    /* renamed from: c, reason: collision with root package name */
    private long f50196c;

    /* renamed from: d, reason: collision with root package name */
    private int f50197d;

    /* renamed from: e, reason: collision with root package name */
    private java.io.File f50198e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Map<java.lang.String, int[]> f50199f = new java.util.HashMap();

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f50193a = hashSet;
        hashSet.add(com.tencent.mapsdk.internal.kx.f50208i);
        f50193a.add("NetManager");
        f50193a.add("asset");
        f50194g = new int[]{2, 3, 4, 5, 6};
    }

    public kw(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        java.lang.String[] debugTags;
        this.f50198e = com.tencent.mapsdk.internal.ks.a(new java.io.File(com.tencent.mapsdk.internal.mz.a(context, tencentMapOptions).c().getAbsolutePath()), "logs");
        if (tencentMapOptions == null || (debugTags = tencentMapOptions.getDebugTags()) == null) {
            return;
        }
        a(debugTags);
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void a(java.lang.String str) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void b(java.lang.String str) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void c(java.lang.String str) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void d() {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void e(java.lang.String str) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void a(java.lang.String str, java.lang.Throwable th6) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void b(java.lang.String str, java.lang.Throwable th6) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void c(java.lang.String str, java.lang.Throwable th6) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void d(java.lang.String str) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void e(java.lang.String str, java.lang.Throwable th6) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void a(boolean z17) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public final boolean b() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void c(java.lang.String str, java.lang.String str2) {
        if (a(4, str)) {
            a(4, str, str2, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void d(java.lang.String str, java.lang.Throwable th6) {
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void e(java.lang.String str, java.lang.String str2) {
        if (a(6, str)) {
            a(6, str, str2, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public final boolean a() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void b(java.lang.String str, java.lang.String str2) {
        if (a(3, str)) {
            a(3, str, str2, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void d(java.lang.String str, java.lang.String str2) {
        if (a(5, str)) {
            a(5, str, str2, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public boolean a(int i17, java.lang.String str) {
        return this.f50199f.containsKey(str) || this.f50195b || (com.tencent.mapsdk.internal.tf.f51582d && !f50193a.contains(str));
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void c(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(4, str)) {
            a(4, str, str2, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(6, str)) {
            a(6, str, str2, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void b(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(3, str)) {
            a(3, str, str2, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(5, str)) {
            a(5, str, str2, th6);
        }
    }

    private static void a(int i17, java.lang.String str, java.lang.String str2) {
        a(i17, str, str2, null);
    }

    @Override // com.tencent.mapsdk.internal.ky
    public java.lang.String c() {
        return this.f50198e.getAbsolutePath();
    }

    public static void a(int i17, java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (th6 == null) {
            android.util.Log.println(i17, str, str2);
        } else {
            if (i17 != 7) {
                return;
            }
            android.util.Log.wtf(str, str2, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void a(java.lang.String str, java.lang.String str2) {
        if (a(2, str)) {
            a(2, str, str2, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(2, str)) {
            a(2, str, str2, th6);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public void a(android.content.Context context, com.tencent.mapsdk.internal.kp.a aVar) {
        if (context != null) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            long j17 = this.f50196c;
            if (j17 != 0 && uptimeMillis - j17 >= 400) {
                this.f50197d = 0;
                this.f50196c = 0L;
                this.f50195b = false;
                return;
            }
            this.f50196c = uptimeMillis;
            this.f50197d++;
            java.lang.String str = "触发调试模式" + this.f50197d + "次";
            int i17 = this.f50197d;
            if (i17 >= 5 && i17 < 10) {
                str = "开发者调试在" + (10 - this.f50197d) + "次后开启";
                if (aVar != null) {
                    aVar.a(str, 1).b();
                }
            } else if (i17 == 10) {
                this.f50195b = true;
                str = "开发者调试已开启";
                if (aVar != null) {
                    aVar.a("开发者调试已开启", 1).b();
                }
            }
            a(5, com.tencent.mapsdk.internal.kx.f50203d, str, null);
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public final void a(java.lang.String... strArr) {
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                this.f50199f.remove(str);
                this.f50199f.put(str, f50194g);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ky
    public final void a(boolean z17, int i17, java.lang.String... strArr) {
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                this.f50199f.remove(str);
                if (z17) {
                    this.f50199f.put(str, new int[]{i17});
                }
            }
        }
    }
}
