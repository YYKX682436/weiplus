package oj;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f427232a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public e(java.util.List fgServices, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 1) != 0) {
            fgServices = new java.util.ArrayList();
            java.util.List<android.app.ActivityManager.RunningServiceInfo> list = kz5.p0.f395529d;
            try {
                java.util.List runningServices = oj.p.f427245a.getRunningServices(Integer.MAX_VALUE);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(runningServices, "MemInfoFactory.activityM…ngServices(Int.MAX_VALUE)");
                list = runningServices;
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.MemoryInfoFactory", th6, "", new java.lang.Object[0]);
            }
            for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : list) {
                if (runningServiceInfo.uid == android.os.Process.myUid() && runningServiceInfo.pid == android.os.Process.myPid() && runningServiceInfo.foreground) {
                    android.content.ComponentName componentName = runningServiceInfo.service;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(componentName, "serviceInfo.service");
                    fgServices.add(componentName.getClassName());
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fgServices, "fgServices");
        this.f427232a = fgServices;
    }

    /* renamed from: equals */
    public boolean m151463xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof oj.e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427232a, ((oj.e) obj).f427232a);
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m151464x8cdac1b() {
        java.util.List list = this.f427232a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m151465x9616526c() {
        java.lang.Object[] array = this.f427232a.toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        java.lang.String arrays = java.util.Arrays.toString(array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }
}
