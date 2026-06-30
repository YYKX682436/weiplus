package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo */
/* loaded from: classes12.dex */
public class C4636x85728d6d {

    /* renamed from: a, reason: collision with root package name */
    public int f134102a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f134103b;

    /* renamed from: c, reason: collision with root package name */
    public long f134104c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f134105d = java.util.Collections.emptyList();

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo$ThreadInfo */
    /* loaded from: classes12.dex */
    public static class ThreadInfo {

        /* renamed from: a, reason: collision with root package name */
        public int f134106a;

        /* renamed from: b, reason: collision with root package name */
        public int f134107b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f134108c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f134109d;

        /* renamed from: e, reason: collision with root package name */
        public long f134110e;

        public void a() {
            wh.t1 e17 = wh.u1.e(this.f134106a, this.f134107b);
            if (e17 != null && !android.text.TextUtils.isEmpty(e17.f527406a)) {
                this.f134108c = e17.f527406a;
                this.f134109d = e17.f527407b;
                this.f134110e = e17.a();
                return;
            }
            throw new java.io.IOException("parse fail: " + wh.m.a("/proc/" + this.f134106a + "/task/" + this.f134107b + "/stat"));
        }

        /* renamed from: toString */
        public java.lang.String m40850x9616526c() {
            return "thread:" + this.f134108c + "(" + this.f134107b + ") " + this.f134110e;
        }
    }

    public static com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d a(int i17, boolean z17) {
        java.util.List emptyList;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d c4636x85728d6d = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d();
        c4636x85728d6d.f134102a = i17;
        c4636x85728d6d.f134103b = ih.d.c() ? oj.m.b(ih.d.d().f373004b) : "default";
        if (z17) {
            int i18 = c4636x85728d6d.f134102a;
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
                                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.ThreadInfo threadInfo = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.ThreadInfo();
                                threadInfo.f134106a = i18;
                                threadInfo.f134107b = parseInt;
                                arrayList.add(threadInfo);
                            } catch (java.lang.Exception e18) {
                                oj.j.d("Matrix.battery.JiffiesMonitorFeature", e18, "parse thread error: " + file2.getName(), new java.lang.Object[0]);
                            }
                        }
                    }
                    emptyList = arrayList;
                }
                c4636x85728d6d.f134105d = emptyList;
            }
            emptyList = java.util.Collections.emptyList();
            c4636x85728d6d.f134105d = emptyList;
        }
        android.os.SystemClock.uptimeMillis();
        java.lang.System.currentTimeMillis();
        return c4636x85728d6d;
    }

    public void b() {
        wh.t1 d17 = wh.u1.d(this.f134102a);
        if (d17 != null) {
            this.f134103b = d17.f527406a;
            this.f134104c = d17.a();
            return;
        }
        throw new java.io.IOException("parse fail: " + wh.m.a("/proc/" + this.f134102a + "/stat"));
    }

    /* renamed from: toString */
    public java.lang.String m40849x9616526c() {
        return "process:" + this.f134103b + "(" + this.f134102a + ") thread size:" + this.f134105d.size();
    }
}
