package com.tencent.matrix.batterycanary.monitor.feature;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class JiffiesMonitorFeature$ThreadWatchDog implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f52578d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f52579e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f52580f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.batterycanary.monitor.feature.c f52581g;

    public JiffiesMonitorFeature$ThreadWatchDog(com.tencent.matrix.batterycanary.monitor.feature.c cVar) {
        this.f52581g = cVar;
    }

    public void a() {
        synchronized (this.f52579e) {
            oj.j.c("Matrix.battery.JiffiesMonitorFeature", "ThreadWatchDog start watching, count = " + ((java.util.ArrayList) this.f52579e).size(), new java.lang.Object[0]);
            if (!((java.util.ArrayList) this.f52579e).isEmpty()) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("matrix_watchdog");
                handlerThread.start();
                android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
                this.f52580f = handler;
                long j17 = 0 + 300000;
                this.f52578d = j17;
                handler.postDelayed(this, j17);
            }
        }
    }

    public void b(int i17, int i18) {
        synchronized (this.f52579e) {
            java.util.Iterator it = ((java.util.ArrayList) this.f52579e).iterator();
            while (it.hasNext()) {
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.ThreadInfo threadInfo = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.ThreadInfo) it.next();
                if (threadInfo.f52573a == i17 && threadInfo.f52574b == i18) {
                    return;
                }
            }
            java.util.List list = this.f52579e;
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.ThreadInfo threadInfo2 = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.ThreadInfo();
            threadInfo2.f52573a = i17;
            threadInfo2.f52574b = i18;
            ((java.util.ArrayList) list).add(threadInfo2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        oj.j.c("Matrix.battery.JiffiesMonitorFeature", "threadWatchDog start, size = " + ((java.util.ArrayList) this.f52579e).size() + ", delayMillis = " + this.f52578d, new java.lang.Object[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f52579e) {
            java.util.Iterator it = ((java.util.ArrayList) this.f52579e).iterator();
            while (it.hasNext()) {
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot c17 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot.c((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.ThreadInfo) it.next());
                if (c17 != null) {
                    c17.f52567d = false;
                    arrayList.add(c17);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            rh.y2 y2Var = new rh.y2();
            y2Var.f395560a = arrayList;
            this.f52581g.f395294a.f363335d.f363283b.g(y2Var);
        }
        synchronized (this.f52579e) {
            long j17 = this.f52578d;
            if (j17 <= 300000) {
                android.os.Handler handler = this.f52580f;
                if (handler != null) {
                    this.f52578d = j17 + 300000;
                    handler.postDelayed(this, 300000L);
                }
            } else if (j17 <= 600000) {
                android.os.Handler handler2 = this.f52580f;
                if (handler2 != null) {
                    this.f52578d = j17 + 600000;
                    handler2.postDelayed(this, 600000L);
                }
            } else {
                synchronized (this.f52579e) {
                    ((java.util.ArrayList) this.f52579e).clear();
                }
            }
        }
    }
}
