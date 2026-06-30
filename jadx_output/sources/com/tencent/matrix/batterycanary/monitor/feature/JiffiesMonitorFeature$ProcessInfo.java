package com.tencent.matrix.batterycanary.monitor.feature;

/* loaded from: classes12.dex */
public class JiffiesMonitorFeature$ProcessInfo {

    /* renamed from: a, reason: collision with root package name */
    public int f52569a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f52570b;

    /* renamed from: c, reason: collision with root package name */
    public long f52571c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f52572d = java.util.Collections.emptyList();

    /* loaded from: classes12.dex */
    public static class ThreadInfo {

        /* renamed from: a, reason: collision with root package name */
        public int f52573a;

        /* renamed from: b, reason: collision with root package name */
        public int f52574b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f52575c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f52576d;

        /* renamed from: e, reason: collision with root package name */
        public long f52577e;

        public void a() {
            wh.t1 e17 = wh.u1.e(this.f52573a, this.f52574b);
            if (e17 != null && !android.text.TextUtils.isEmpty(e17.f445873a)) {
                this.f52575c = e17.f445873a;
                this.f52576d = e17.f445874b;
                this.f52577e = e17.a();
                return;
            }
            throw new java.io.IOException("parse fail: " + wh.m.a("/proc/" + this.f52573a + "/task/" + this.f52574b + "/stat"));
        }

        public java.lang.String toString() {
            return "thread:" + this.f52575c + "(" + this.f52574b + ") " + this.f52577e;
        }
    }

    public static com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo a(int i17, boolean z17) {
        java.util.List emptyList;
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo jiffiesMonitorFeature$ProcessInfo = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo();
        jiffiesMonitorFeature$ProcessInfo.f52569a = i17;
        jiffiesMonitorFeature$ProcessInfo.f52570b = ih.d.c() ? oj.m.b(ih.d.d().f291471b) : "default";
        if (z17) {
            int i18 = jiffiesMonitorFeature$ProcessInfo.f52569a;
            java.io.File file = new java.io.File("/proc/" + i18 + "/task/");
            try {
            } catch (java.lang.Exception e17) {
                oj.j.d("Matrix.battery.JiffiesMonitorFeature", e17, "list thread dir error", new java.lang.Object[0]);
            }
            if (file.isDirectory()) {
                java.io.File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    emptyList = java.util.Collections.emptyList();
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList(listFiles.length);
                    for (java.io.File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            try {
                                int parseInt = java.lang.Integer.parseInt(file2.getName());
                                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.ThreadInfo threadInfo = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.ThreadInfo();
                                threadInfo.f52573a = i18;
                                threadInfo.f52574b = parseInt;
                                arrayList.add(threadInfo);
                            } catch (java.lang.Exception e18) {
                                oj.j.d("Matrix.battery.JiffiesMonitorFeature", e18, "parse thread error: " + file2.getName(), new java.lang.Object[0]);
                            }
                        }
                    }
                    emptyList = arrayList;
                }
                jiffiesMonitorFeature$ProcessInfo.f52572d = emptyList;
            }
            emptyList = java.util.Collections.emptyList();
            jiffiesMonitorFeature$ProcessInfo.f52572d = emptyList;
        }
        android.os.SystemClock.uptimeMillis();
        java.lang.System.currentTimeMillis();
        return jiffiesMonitorFeature$ProcessInfo;
    }

    public void b() {
        wh.t1 d17 = wh.u1.d(this.f52569a);
        if (d17 != null) {
            this.f52570b = d17.f445873a;
            this.f52571c = d17.a();
            return;
        }
        throw new java.io.IOException("parse fail: " + wh.m.a("/proc/" + this.f52569a + "/stat"));
    }

    public java.lang.String toString() {
        return "process:" + this.f52570b + "(" + this.f52569a + ") thread size:" + this.f52572d.size();
    }
}
