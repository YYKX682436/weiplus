package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2258x4c4db2ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/taskbar/ui/dynamicbackground/DynamicBgServiceImpl;", "Llq/c;", "Landroid/content/Context;", "context", "Landroid/graphics/Point;", "getDisplayRealSize", "", "getSleepTimeInMsPerFrame", "Ljz5/f0;", "loadDynamicBgLibrary", "", "isEnableNativeDynamicBackground", "isInitCrash", "markDrawEndPoint", "markDrawStartPoint", "markWillCrash", "needMarkDrawPoint", "onInitCrash", "onInitStart", "onInitEnd", "enable", "setEnableNativeDynamicBackground", "willCrash", "<init>", "()V", "Companion", "jh4/g", "plugin-taskbar_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.taskbar.ui.dynamicbackground.DynamicBgServiceImpl */
/* loaded from: classes8.dex */
public final class C18562x89258b11 implements lq.c {

    /* renamed from: Companion */
    public static final jh4.g f38478x233c02ec = new jh4.g(null);
    private static final java.lang.String TAG = "MicroMsg.DynamicBgServiceImpl";

    /* renamed from: _hellAccFlag_ */
    private byte f38479x7f11beae;

    @Override // lq.c
    /* renamed from: getDisplayRealSize */
    public android.graphics.Point mo43630x69e01b6b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return com.p314xaae8f345.mm.ui.bk.h(context);
    }

    @Override // lq.c
    /* renamed from: getSleepTimeInMsPerFrame */
    public float mo43631xe949afc9() {
        return jh4.c.f381381c;
    }

    @Override // lq.c
    /* renamed from: isEnableNativeDynamicBackground */
    public boolean getIsEnable() {
        return gh4.j0.b();
    }

    @Override // lq.b
    /* renamed from: isInitCrash */
    public boolean mo43633x3555fa6d() {
        return jh4.e.f381388c;
    }

    @Override // lq.c
    /* renamed from: loadDynamicBgLibrary */
    public void mo43634xf6645c3d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "loadDynamicBgLibrary");
        if (gh4.j0.b()) {
            jh4.e.c();
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("dynamicBg");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/dynamicbackground/DynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/plugin/taskbar/ui/dynamicbackground/DynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "DynamicBackgroundNative exception", new java.lang.Object[0]);
            jh4.e.b();
        }
    }

    @Override // lq.b
    /* renamed from: markDrawEndPoint */
    public void mo43635x9b4fca46() {
        jh4.e.a();
    }

    @Override // lq.b
    /* renamed from: markDrawStartPoint */
    public void mo43636xb23dbadf() {
        if (jh4.e.f381386a == null) {
            jh4.e.f381386a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        }
        android.content.SharedPreferences sharedPreferences = jh4.e.f381386a;
        if (sharedPreferences != null) {
            int i17 = sharedPreferences.getInt("dynamic_bg_draw_start_point_count", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgCrashHelper", "markDrawStartPoint current: %d", java.lang.Integer.valueOf(i17));
            if (i17 > 2) {
                gh4.j0.c(false);
                jh4.e.f381386a.edit().putBoolean("dynamic_bg_will_crash", true).apply();
            }
            jh4.e.f381386a.edit().putInt("dynamic_bg_draw_start_point_count", i17 + 1).apply();
        }
    }

    @Override // lq.b
    /* renamed from: markWillCrash */
    public void mo43637xec9246a8() {
        android.content.SharedPreferences sharedPreferences = jh4.e.f381386a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgCrashHelper", "markWillCrash");
        if (jh4.e.f381386a == null) {
            jh4.e.f381386a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        }
        if (jh4.e.f381386a != null) {
            gh4.j0.c(false);
            jh4.e.f381386a.edit().putBoolean("dynamic_bg_will_crash", true).apply();
        }
        jh4.e.f381387b = true;
    }

    @Override // lq.b
    /* renamed from: needMarkDrawPoint */
    public boolean mo43638xe55c1d69() {
        return jh4.e.f381389d;
    }

    @Override // lq.b
    /* renamed from: onInitCrash */
    public void mo43639xed42f558() {
        jh4.e.b();
    }

    @Override // lq.b
    /* renamed from: onInitEnd */
    public void mo43640xc3c6d2cc() {
        android.content.SharedPreferences sharedPreferences = jh4.e.f381386a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgCrashHelper", "markInitEndPoint");
        jh4.e.f381386a.edit().putInt("dynamic_bg_init_start_point_count", 0).apply();
        jh4.e.f381386a.edit().putBoolean("dynamic_bg_will_crash", false).apply();
        jh4.e.f381386a.edit().putBoolean("dynamic_bg_init_crash", false).apply();
        jh4.e.f381387b = false;
        jh4.e.f381388c = false;
        gh4.j0.c(true);
    }

    /* renamed from: onInitStart */
    public void m71619xee255613() {
        jh4.e.c();
    }

    @Override // lq.c
    /* renamed from: setEnableNativeDynamicBackground */
    public void mo43642x4875e531(boolean z17) {
        gh4.j0.c(z17);
    }

    @Override // lq.b
    /* renamed from: willCrash */
    public boolean mo43643x947cd6f5() {
        return jh4.e.f381387b;
    }
}
