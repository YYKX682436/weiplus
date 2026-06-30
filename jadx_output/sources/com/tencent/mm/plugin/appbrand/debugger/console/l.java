package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f77681d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.PointF f77682e = new android.graphics.PointF();

    /* renamed from: f, reason: collision with root package name */
    public boolean f77683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.p f77684g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.o f77685h;

    public l(com.tencent.mm.plugin.appbrand.debugger.console.p pVar, com.tencent.mm.plugin.appbrand.debugger.console.o oVar) {
        this.f77684g = pVar;
        this.f77685h = oVar;
        this.f77681d = android.view.ViewConfiguration.get(pVar.getContext()).getScaledTouchSlop();
    }

    public final boolean a(android.view.MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        android.graphics.PointF pointF = this.f77682e;
        float abs = java.lang.Math.abs(rawX - pointF.x);
        int i17 = this.f77681d;
        return abs > ((float) i17) || java.lang.Math.abs(motionEvent.getRawY() - pointF.y) > ((float) i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r0 != 3) goto L49;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.debugger.console.l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
