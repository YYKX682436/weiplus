package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class kw implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky {

    /* renamed from: a, reason: collision with root package name */
    static java.util.Set<java.lang.String> f131726a;

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f131727g;

    /* renamed from: b, reason: collision with root package name */
    boolean f131728b;

    /* renamed from: c, reason: collision with root package name */
    private long f131729c;

    /* renamed from: d, reason: collision with root package name */
    private int f131730d;

    /* renamed from: e, reason: collision with root package name */
    private java.io.File f131731e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Map<java.lang.String, int[]> f131732f = new java.util.HashMap();

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f131726a = hashSet;
        hashSet.add(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i);
        f131726a.add("NetManager");
        f131726a.add("asset");
        f131727g = new int[]{2, 3, 4, 5, 6};
    }

    public kw(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        java.lang.String[] m99196xf39c4e56;
        this.f131731e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, c25966x7e4576a7).c().getAbsolutePath()), "logs");
        if (c25966x7e4576a7 == null || (m99196xf39c4e56 = c25966x7e4576a7.m99196xf39c4e56()) == null) {
            return;
        }
        a(m99196xf39c4e56);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void a(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void b(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void c(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void d() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void e(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void a(java.lang.String str, java.lang.Throwable th6) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void b(java.lang.String str, java.lang.Throwable th6) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void c(java.lang.String str, java.lang.Throwable th6) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void d(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void e(java.lang.String str, java.lang.Throwable th6) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void a(boolean z17) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final boolean b() {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void c(java.lang.String str, java.lang.String str2) {
        if (a(4, str)) {
            a(4, str, str2, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void d(java.lang.String str, java.lang.Throwable th6) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void e(java.lang.String str, java.lang.String str2) {
        if (a(6, str)) {
            a(6, str, str2, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final boolean a() {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void b(java.lang.String str, java.lang.String str2) {
        if (a(3, str)) {
            a(3, str, str2, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void d(java.lang.String str, java.lang.String str2) {
        if (a(5, str)) {
            a(5, str, str2, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public boolean a(int i17, java.lang.String str) {
        return this.f131732f.containsKey(str) || this.f131728b || (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133115d && !f131726a.contains(str));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void c(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(4, str)) {
            a(4, str, str2, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(6, str)) {
            a(6, str, str2, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void b(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(3, str)) {
            a(3, str, str2, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(5, str)) {
            a(5, str, str2, th6);
        }
    }

    private static void a(int i17, java.lang.String str, java.lang.String str2) {
        a(i17, str, str2, null);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public java.lang.String c() {
        return this.f131731e.getAbsolutePath();
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

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void a(java.lang.String str, java.lang.String str2) {
        if (a(2, str)) {
            a(2, str, str2, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (a(2, str)) {
            a(2, str, str2, th6);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public void a(android.content.Context context, com.tencent.mapsdk.internal.kp.a aVar) {
        if (context != null) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            long j17 = this.f131729c;
            if (j17 != 0 && uptimeMillis - j17 >= 400) {
                this.f131730d = 0;
                this.f131729c = 0L;
                this.f131728b = false;
                return;
            }
            this.f131729c = uptimeMillis;
            this.f131730d++;
            java.lang.String str = "触发调试模式" + this.f131730d + "次";
            int i17 = this.f131730d;
            if (i17 >= 5 && i17 < 10) {
                str = "开发者调试在" + (10 - this.f131730d) + "次后开启";
                if (aVar != null) {
                    aVar.a(str, 1).b();
                }
            } else if (i17 == 10) {
                this.f131728b = true;
                str = "开发者调试已开启";
                if (aVar != null) {
                    aVar.a("开发者调试已开启", 1).b();
                }
            }
            a(5, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, str, null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void a(java.lang.String... strArr) {
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                this.f131732f.remove(str);
                this.f131732f.put(str, f131727g);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky
    public final void a(boolean z17, int i17, java.lang.String... strArr) {
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                this.f131732f.remove(str);
                if (z17) {
                    this.f131732f.put(str, new int[]{i17});
                }
            }
        }
    }
}
