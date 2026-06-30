package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.SplashWelcomeView */
/* loaded from: classes5.dex */
public class C21440xfcb6d020 extends android.widget.FrameLayout implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.ne {

    /* renamed from: d, reason: collision with root package name */
    public boolean f278624d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f278625e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f278626f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f278627g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f278628h;

    /* renamed from: i, reason: collision with root package name */
    public int f278629i;

    public C21440xfcb6d020(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public final boolean a(android.content.SharedPreferences sharedPreferences) {
        this.f278629i = sharedPreferences.getInt("launch_fail_times", 0);
        int i17 = sharedPreferences.getInt("launch_last_status", 0);
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "last launch status is 'start'.");
            this.f278629i++;
            sharedPreferences.edit().putInt("launch_fail_times", this.f278629i).commit();
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "last launch status is 'end'.");
        }
        sharedPreferences.edit().putInt("launch_last_status", 1).apply();
        int i18 = this.f278629i;
        if (i18 < 3) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "launch exceed max failed times, %d", java.lang.Integer.valueOf(i18));
        return false;
    }

    public final void b(android.content.Context context) {
        com.p314xaae8f345.mm.ui.C21439xe06fa3d9 c21439xe06fa3d9 = new com.p314xaae8f345.mm.ui.C21439xe06fa3d9(context);
        this.f278628h = c21439xe06fa3d9;
        c21439xe06fa3d9.m78821x4ac79299(this);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0);
            try {
                boolean z17 = sharedPreferences.getBoolean("transit_to_switch_account", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "transit to switch account %s", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    java.lang.String str = com.p314xaae8f345.mm.ui.p2.f291023a;
                    byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, (int) com.p314xaae8f345.mm.vfs.w6.k(str));
                    com.p314xaae8f345.mm.vfs.w6.h(str);
                    sharedPreferences.edit().putBoolean("transit_to_switch_account", false).commit();
                    if (N != null && N.length > 0) {
                        int length = N.length;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(length));
                        arrayList.add(0);
                        arrayList.add(N);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/SplashWelcomeView", "initSrc", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/ui/SplashWelcomeView", "initSrc", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                        if (decodeByteArray != null) {
                            this.f278628h.setImageBitmap(decodeByteArray);
                            fp.m.e();
                            ((android.app.Activity) getContext()).getWindow().setStatusBarColor(-1);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SplashWelcomeView", "get switch account bg null!");
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SplashWelcomeView", e17, "show switch account view with exception!", new java.lang.Object[0]);
            }
        }
        addView(this.f278628h, layoutParams);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "not main process, only load default splash bitmap.");
                return;
            }
            android.content.SharedPreferences sharedPreferences2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0);
            long j17 = sharedPreferences2.getLong("new_launch_image_begin_time", 0L);
            long j18 = sharedPreferences2.getLong("new_launch_image_end_time", 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "beginTime:%s,endTime:%s,currentTime:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis));
            java.lang.String str2 = lp0.b.e() + "splashWelcomeImg";
            if (currentTimeMillis <= j17 || currentTimeMillis >= j18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "change launch image activity is finished!");
                com.p314xaae8f345.mm.vfs.w6.h(str2);
            } else if (a(sharedPreferences2)) {
                s75.d.b(new com.p314xaae8f345.mm.ui.bj(this, str2), "readWelcomeBg");
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SplashWelcomeView", e18, "%s", e18.getMessage());
        }
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "hasDrawed:%s", java.lang.Boolean.valueOf(this.f278624d));
        if (this.f278624d) {
            return;
        }
        this.f278624d = true;
        if (!this.f278626f || this.f278625e) {
            return;
        }
        d();
    }

    public final synchronized void d() {
        if (!this.f278625e) {
            this.f278625e = true;
            if (this.f278627g != null) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.dj(this));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SplashWelcomeView", e17, "%s", e17.getMessage());
                }
            }
        }
    }

    public C21440xfcb6d020(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b(context);
    }
}
