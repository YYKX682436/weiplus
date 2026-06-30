package b92;

@j95.b
/* loaded from: classes15.dex */
public final class d2 extends i95.w implements zy2.d8 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f18413d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f18414e = new java.util.HashMap();

    public void Ai(int i17, java.lang.String scene, java.lang.String commentScene) {
        java.lang.ref.WeakReference weakReference;
        androidx.appcompat.app.AppCompatActivity appCompatActivity;
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 26) {
            return;
        }
        b92.b2 b2Var = (b92.b2) this.f18414e.remove(java.lang.Integer.valueOf(i17));
        jz5.f0 f0Var = null;
        if (b2Var != null) {
            if (b2Var.f18386j) {
                com.tencent.mars.xlog.Log.e("FinderLiveFpsService", "dead: trigger multiple times! task=" + b2Var);
            } else {
                b2Var.f18390n = android.os.SystemClock.elapsedRealtime();
                b92.y1 y1Var = b2Var.f18383g;
                java.lang.ref.WeakReference weakReference2 = b2Var.f18379c;
                if (y1Var != null) {
                    if (y1Var.f18568c <= 0) {
                        y1Var.f18568c = java.lang.System.nanoTime();
                    }
                    android.view.Window window = (android.view.Window) weakReference2.get();
                    y1Var.f18572g = window != null ? or2.k.a(window) : y1Var.f18566a;
                    b2Var.a("dead", y1Var);
                }
                android.os.MessageQueue.IdleHandler idleHandler = b2Var.f18393q;
                if (idleHandler != null) {
                    android.os.Looper.getMainLooper().getQueue().removeIdleHandler(idleHandler);
                    b2Var.f18393q = null;
                }
                android.view.Window window2 = (android.view.Window) weakReference2.get();
                if (window2 != null) {
                    window2.removeOnFrameMetricsAvailableListener(b2Var);
                }
                i95.m c17 = i95.n0.c(b92.d2.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                if (i18 < 26) {
                    com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "report32406: error sdk version too low, version=" + i18);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = b2Var.f18385i;
                    if (!arrayList2.isEmpty()) {
                        arrayList.addAll(arrayList2);
                        arrayList2.clear();
                    }
                    pm0.v.O("FinderLiveFpsService", new b92.c2(arrayList, b2Var));
                }
                b2Var.f18386j = true;
                b2Var.f18383g = null;
            }
            androidx.lifecycle.f fVar = b2Var.f18391o;
            if (fVar != null && (weakReference = b2Var.f18392p) != null && (appCompatActivity = (androidx.appcompat.app.AppCompatActivity) weakReference.get()) != null && (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) != null) {
                mo133getLifecycle.c(fVar);
            }
            b2Var.f18391o = null;
            b2Var.f18392p = null;
            com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "endRecordLiveFps: success, frameTask=" + b2Var);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "endRecordLiveFps: record is null, scene=" + scene + ", commentScene=" + commentScene + ", hashCode=" + i17);
        }
    }

    public void wi(final int i17, final java.lang.String scene, final java.lang.String commentScene, android.content.Context context, android.view.Window window, long j17, long j18) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(window, "window");
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 26) {
            com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "beginRecordLiveFps: error sdk version too low, version=" + i18);
            return;
        }
        java.util.HashMap hashMap = this.f18414e;
        b92.b2 b2Var = (b92.b2) hashMap.get(java.lang.Integer.valueOf(i17));
        if (b2Var != null) {
            com.tencent.mars.xlog.Log.w("FinderLiveFpsService", "beginRecordLiveFps: is recording, hashCode=" + i17 + ", frameTask=" + b2Var);
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        b92.b2 b2Var2 = new b92.b2(scene, commentScene, new java.lang.ref.WeakReference(window), this.f18413d, j17, j18);
        android.view.Window window2 = (android.view.Window) b2Var2.f18379c.get();
        if (window2 == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveFpsService", "alive: error, window is null, this=" + b2Var2);
        } else {
            int a17 = or2.k.a(window2);
            b92.y1 y1Var = new b92.y1(a17);
            b2Var2.f18389m = android.os.SystemClock.elapsedRealtime();
            if (y1Var.f18567b <= 0) {
                y1Var.f18567b = java.lang.System.nanoTime();
            }
            b2Var2.f18387k = a17;
            b2Var2.f18388l = a17;
            window2.addOnFrameMetricsAvailableListener(b2Var2, b2Var2.f18380d);
            b2Var2.f18383g = y1Var;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "beginRecordLiveFps: success, hashCode=" + i17 + ", scene=" + scene + ", commentScene=" + commentScene + ", feedId=" + pm0.v.u(j17) + ", liveId=" + pm0.v.u(j18));
        androidx.lifecycle.f fVar = new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.finder.FinderLiveFpsService$beginRecordLiveFps$2$observer$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "onDestroy: remove record");
                b92.d2.this.Ai(i17, scene, commentScene);
            }
        };
        b2Var2.f18391o = fVar;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            b2Var2.f18392p = new java.lang.ref.WeakReference(appCompatActivity);
            appCompatActivity.mo133getLifecycle().a(fVar);
        }
        hashMap.put(valueOf, b2Var2);
    }
}
