package bm5;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final bm5.m f22701a = new bm5.m();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f22702b = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.ActivityStatusManager");

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f22703c = jz5.h.b(bm5.f.f22559d);

    public final void a(java.lang.String str, android.app.Activity activity) {
        java.lang.String name = activity.getClass().getName();
        java.lang.String f17 = f(activity);
        if (!(r26.n0.N(name)) && !r26.n0.N(f17)) {
            java.lang.String b17 = b(name, f17);
            com.tencent.mm.sdk.platformtools.o4 o4Var = f22702b;
            java.lang.String string = o4Var.getString(str, "");
            java.util.Set W0 = kz5.n0.W0(r26.n0.f0(string == null ? "" : string, new java.lang.String[]{";"}, false, 0, 6, null));
            W0.add(b17);
            o4Var.putString(str, kz5.n0.g0(W0, ";", null, null, 0, null, null, 62, null));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ActivityStatusManager", "[appendActivity:" + str + "] activityName:" + name + " affinity:" + f17);
    }

    public final java.lang.String b(java.lang.String activity, java.lang.String affinity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(affinity, "affinity");
        return activity + '&' + affinity;
    }

    public final java.util.List c() {
        java.lang.String string = f22702b.getString("MMKVKey_CreatedActivity", "");
        java.util.List f07 = r26.n0.f0(string == null ? "" : string, new java.lang.String[]{";"}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
        java.util.Iterator it = f07.iterator();
        while (it.hasNext()) {
            arrayList.add(f22701a.g((java.lang.String) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            jz5.l lVar = (jz5.l) obj;
            boolean z17 = true;
            if (!r26.n0.N((java.lang.CharSequence) lVar.f302833d)) {
                if (!(((java.lang.CharSequence) lVar.f302834e).length() == 0)) {
                    z17 = false;
                }
            }
            if (!z17) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final java.util.List d() {
        java.lang.String string = f22702b.getString("MMKVKey_ResumedActivity", "");
        java.util.List f07 = r26.n0.f0(string == null ? "" : string, new java.lang.String[]{";"}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
        java.util.Iterator it = f07.iterator();
        while (it.hasNext()) {
            arrayList.add(f22701a.g((java.lang.String) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            jz5.l lVar = (jz5.l) obj;
            boolean z17 = true;
            if (!r26.n0.N((java.lang.CharSequence) lVar.f302833d)) {
                if (!(((java.lang.CharSequence) lVar.f302834e).length() == 0)) {
                    z17 = false;
                }
            }
            if (!z17) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final java.util.List e() {
        java.lang.String string = f22702b.getString("MMKVKey_StartedActivity", "");
        java.util.List f07 = r26.n0.f0(string == null ? "" : string, new java.lang.String[]{";"}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
        java.util.Iterator it = f07.iterator();
        while (it.hasNext()) {
            arrayList.add(f22701a.g((java.lang.String) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            jz5.l lVar = (jz5.l) obj;
            boolean z17 = true;
            if (!r26.n0.N((java.lang.CharSequence) lVar.f302833d)) {
                if (!(((java.lang.CharSequence) lVar.f302834e).length() == 0)) {
                    z17 = false;
                }
            }
            if (!z17) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final java.lang.String f(android.app.Activity activity) {
        try {
            android.content.ComponentName componentName = activity.getComponentName();
            if (componentName == null) {
                return "";
            }
            android.content.pm.ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(componentName, 0);
            kotlin.jvm.internal.o.f(activityInfo, "getActivityInfo(...)");
            java.lang.String str = activityInfo.taskAffinity;
            return str == null ? "" : str;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public final jz5.l g(java.lang.String string) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(string, "string");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.util.List f07 = r26.n0.f0(string, new java.lang.String[]{"&"}, false, 0, 6, null);
            m521constructorimpl = kotlin.Result.m521constructorimpl(new jz5.l(f07.get(0), f07.get(1)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        jz5.l lVar = new jz5.l("", "");
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = lVar;
        }
        return (jz5.l) m521constructorimpl;
    }

    public final void h(java.lang.String str, android.app.Activity activity) {
        java.lang.String name = activity.getClass().getName();
        java.lang.String f17 = f(activity);
        if (!(r26.n0.N(name)) && !r26.n0.N(f17)) {
            java.lang.String b17 = b(name, f17);
            com.tencent.mm.sdk.platformtools.o4 o4Var = f22702b;
            java.lang.String string = o4Var.getString(str, "");
            java.util.Set W0 = kz5.n0.W0(r26.n0.f0(string == null ? "" : string, new java.lang.String[]{";"}, false, 0, 6, null));
            W0.remove(b17);
            o4Var.putString(str, kz5.n0.g0(W0, ";", null, null, 0, null, null, 62, null));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ActivityStatusManager", "[removeActivity:" + str + "] activityName:" + name + " affinity:" + f17);
    }
}
