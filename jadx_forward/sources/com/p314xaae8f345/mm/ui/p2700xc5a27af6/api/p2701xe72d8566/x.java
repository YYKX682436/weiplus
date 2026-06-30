package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowManager f290109a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f290110b;

    public x(android.view.WindowManager windowManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowManager, "windowManager");
        this.f290109a = windowManager;
        this.f290110b = new java.util.LinkedHashMap();
    }

    public final void a(int i17, android.view.View view, android.view.WindowManager.LayoutParams layoutParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutParams, "layoutParams");
        try {
            this.f290109a.addView(view, layoutParams);
            java.util.Map map = this.f290110b;
            map.put(java.lang.Integer.valueOf(i17), new java.lang.ref.WeakReference(view));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "addView, viewMapSize: " + map.size());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "addView, failed: " + th6.getMessage());
        }
    }

    public final void b() {
        jz5.f0 f0Var;
        java.util.Map map = this.f290110b;
        java.util.List<jz5.l> v17 = kz5.e1.v(map);
        ((java.util.LinkedHashMap) map).clear();
        for (jz5.l lVar : v17) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) lVar.f384367e).get();
                if (view != null) {
                    this.f290109a.removeViewImmediate(view);
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "clear, viewMapSize: " + map.size());
    }

    public final void c(int i17) {
        java.util.Map map = this.f290110b;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "removeView, viewId not found in viewMap, skip");
            return;
        }
        map.remove(java.lang.Integer.valueOf(i17));
        android.view.View view = (android.view.View) weakReference.get();
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "removeView, viewRef gets null, view might have been GC, skip");
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f290109a.removeViewImmediate(view);
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "removeView, viewMapSize: " + map.size());
    }
}
