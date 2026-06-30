package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f159214d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.PointF f159215e = new android.graphics.PointF();

    /* renamed from: f, reason: collision with root package name */
    public boolean f159216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.p f159217g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o f159218h;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o oVar) {
        this.f159217g = pVar;
        this.f159218h = oVar;
        this.f159214d = android.view.ViewConfiguration.get(pVar.getContext()).getScaledTouchSlop();
    }

    public final boolean a(android.view.MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        android.graphics.PointF pointF = this.f159215e;
        float abs = java.lang.Math.abs(rawX - pointF.x);
        int i17 = this.f159214d;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
