package b92;

@j95.b
/* loaded from: classes15.dex */
public final class d2 extends i95.w implements zy2.d8 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f99946d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f99947e = new java.util.HashMap();

    public void Ai(int i17, java.lang.String scene, java.lang.String commentScene) {
        java.lang.ref.WeakReference weakReference;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 26) {
            return;
        }
        b92.b2 b2Var = (b92.b2) this.f99947e.remove(java.lang.Integer.valueOf(i17));
        jz5.f0 f0Var = null;
        if (b2Var != null) {
            if (b2Var.f99919j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveFpsService", "dead: trigger multiple times! task=" + b2Var);
            } else {
                b2Var.f99923n = android.os.SystemClock.elapsedRealtime();
                b92.y1 y1Var = b2Var.f99916g;
                java.lang.ref.WeakReference weakReference2 = b2Var.f99912c;
                if (y1Var != null) {
                    if (y1Var.f100101c <= 0) {
                        y1Var.f100101c = java.lang.System.nanoTime();
                    }
                    android.view.Window window = (android.view.Window) weakReference2.get();
                    y1Var.f100105g = window != null ? or2.k.a(window) : y1Var.f100099a;
                    b2Var.a("dead", y1Var);
                }
                android.os.MessageQueue.IdleHandler idleHandler = b2Var.f99926q;
                if (idleHandler != null) {
                    android.os.Looper.getMainLooper().getQueue().removeIdleHandler(idleHandler);
                    b2Var.f99926q = null;
                }
                android.view.Window window2 = (android.view.Window) weakReference2.get();
                if (window2 != null) {
                    window2.removeOnFrameMetricsAvailableListener(b2Var);
                }
                i95.m c17 = i95.n0.c(b92.d2.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                if (i18 < 26) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "report32406: error sdk version too low, version=" + i18);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = b2Var.f99918i;
                    if (!arrayList2.isEmpty()) {
                        arrayList.addAll(arrayList2);
                        arrayList2.clear();
                    }
                    pm0.v.O("FinderLiveFpsService", new b92.c2(arrayList, b2Var));
                }
                b2Var.f99919j = true;
                b2Var.f99916g = null;
            }
            p012xc85e97e9.p093xedfae76a.f fVar = b2Var.f99924o;
            if (fVar != null && (weakReference = b2Var.f99925p) != null && (activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) weakReference.get()) != null && (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) != null) {
                mo273xed6858b4.c(fVar);
            }
            b2Var.f99924o = null;
            b2Var.f99925p = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "endRecordLiveFps: success, frameTask=" + b2Var);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "endRecordLiveFps: record is null, scene=" + scene + ", commentScene=" + commentScene + ", hashCode=" + i17);
        }
    }

    public void wi(final int i17, final java.lang.String scene, final java.lang.String commentScene, android.content.Context context, android.view.Window window, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 26) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "beginRecordLiveFps: error sdk version too low, version=" + i18);
            return;
        }
        java.util.HashMap hashMap = this.f99947e;
        b92.b2 b2Var = (b92.b2) hashMap.get(java.lang.Integer.valueOf(i17));
        if (b2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveFpsService", "beginRecordLiveFps: is recording, hashCode=" + i17 + ", frameTask=" + b2Var);
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        b92.b2 b2Var2 = new b92.b2(scene, commentScene, new java.lang.ref.WeakReference(window), this.f99946d, j17, j18);
        android.view.Window window2 = (android.view.Window) b2Var2.f99912c.get();
        if (window2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveFpsService", "alive: error, window is null, this=" + b2Var2);
        } else {
            int a17 = or2.k.a(window2);
            b92.y1 y1Var = new b92.y1(a17);
            b2Var2.f99922m = android.os.SystemClock.elapsedRealtime();
            if (y1Var.f100100b <= 0) {
                y1Var.f100100b = java.lang.System.nanoTime();
            }
            b2Var2.f99920k = a17;
            b2Var2.f99921l = a17;
            window2.addOnFrameMetricsAvailableListener(b2Var2, b2Var2.f99913d);
            b2Var2.f99916g = y1Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "beginRecordLiveFps: success, hashCode=" + i17 + ", scene=" + scene + ", commentScene=" + commentScene + ", feedId=" + pm0.v.u(j17) + ", liveId=" + pm0.v.u(j18));
        p012xc85e97e9.p093xedfae76a.f fVar = new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.finder.FinderLiveFpsService$beginRecordLiveFps$2$observer$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "onDestroy: remove record");
                b92.d2.this.Ai(i17, scene, commentScene);
            }
        };
        b2Var2.f99924o = fVar;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        if (activityC0065xcd7aa112 != null) {
            b2Var2.f99925p = new java.lang.ref.WeakReference(activityC0065xcd7aa112);
            activityC0065xcd7aa112.mo273xed6858b4().a(fVar);
        }
        hashMap.put(valueOf, b2Var2);
    }
}
