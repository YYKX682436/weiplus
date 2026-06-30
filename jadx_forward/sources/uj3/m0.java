package uj3;

/* loaded from: classes14.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.v0 f509863d;

    public m0(uj3.v0 v0Var) {
        this.f509863d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View mo168119x43ae89e9;
        android.graphics.Canvas lockCanvas;
        if (this.f509863d.F || (mo168119x43ae89e9 = this.f509863d.mo168119x43ae89e9()) == null) {
            return;
        }
        uj3.v0 v0Var = this.f509863d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        uj3.k m168154x8dd3dc28 = v0Var.m168154x8dd3dc28();
        boolean contains = m168154x8dd3dc28 != null ? m168154x8dd3dc28.f509836c.contains(11) : false;
        synchronized (v0Var) {
            int measuredWidth = mo168119x43ae89e9.getMeasuredWidth() - (mo168119x43ae89e9.getMeasuredWidth() % 4);
            int measuredHeight = mo168119x43ae89e9.getMeasuredHeight() - (mo168119x43ae89e9.getMeasuredHeight() % 4);
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (v0Var.f509906v == null) {
                    v0Var.f509906v = new yj3.g(measuredWidth, measuredHeight, new uj3.t0(v0Var));
                }
                yj3.g gVar = v0Var.f509906v;
                if (gVar != null) {
                    gVar.b(measuredWidth, measuredHeight);
                }
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                android.view.Surface surface = v0Var.f509907w;
                if (surface != null && (lockCanvas = surface.lockCanvas(null)) != null) {
                    lockCanvas.drawPaint(new android.graphics.Paint());
                    lockCanvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
                    if (!contains) {
                        mo168119x43ae89e9.draw(lockCanvas);
                    }
                    long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
                    uj3.k1 k1Var = v0Var.f509894g;
                    if (k1Var != null) {
                        k1Var.f509842e = (k1Var.f509842e + elapsedRealtime3) / 2;
                    }
                    long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                    uj3.c cVar = v0Var.f509901q;
                    if (cVar != null) {
                        cVar.a(lockCanvas);
                    }
                    long elapsedRealtime5 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime4;
                    uj3.k1 k1Var2 = v0Var.f509894g;
                    if (k1Var2 != null) {
                        k1Var2.f509841d = (k1Var2.f509841d + elapsedRealtime5) / 2;
                    }
                    android.view.Surface surface2 = v0Var.f509907w;
                    if (surface2 != null) {
                        surface2.unlockCanvasAndPost(lockCanvas);
                    }
                }
            }
        }
        uj3.k1 m168149x29665661 = v0Var.m168149x29665661();
        if (m168149x29665661 == null) {
            return;
        }
        uj3.k1 m168149x296656612 = v0Var.m168149x29665661();
        m168149x29665661.f509840c = ((m168149x296656612 != null ? m168149x296656612.f509840c : 0L) + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime)) / 2;
    }
}
