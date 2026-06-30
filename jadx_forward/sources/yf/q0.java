package yf;

/* loaded from: classes7.dex */
public class q0 implements android.view.ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public int f542977d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542978e;

    public q0(yf.i0 i0Var) {
        this.f542978e = i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x003b, code lost:
    
        if (r7 >= 0.9f) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r7 <= 1.1f) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        r7 = r3;
     */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScale(android.view.ScaleGestureDetector r7) {
        /*
            r6 = this;
            yf.i0 r0 = r6.f542978e
            yf.o r1 = r0.f542895i
            int r1 = r1.mo176944x70202721()
            if (r1 <= 0) goto L9a
            float r7 = r7.getScaleFactor()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            if (r3 <= 0) goto L2a
            float r7 = (float) r1
            float r4 = r4 / r7
            int r7 = r6.f542977d
            int r7 = r1 - r7
            float r7 = (float) r7
            float r4 = r4 * r7
            float r7 = r4 + r2
            r3 = 1066192077(0x3f8ccccd, float:1.1)
            int r4 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r4 > 0) goto L3e
        L28:
            r7 = r3
            goto L3e
        L2a:
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 >= 0) goto L3e
            float r7 = (float) r1
            float r4 = r4 / r7
            int r7 = r6.f542977d
            float r7 = (float) r7
            float r4 = r4 * r7
            float r7 = r2 - r4
            r3 = 1063675494(0x3f666666, float:0.9)
            int r4 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r4 < 0) goto L3e
            goto L28
        L3e:
            int r3 = r6.f542977d
            float r3 = (float) r3
            float r3 = r3 * r7
            int r3 = java.lang.Math.round(r3)
            int r4 = r6.f542977d
            if (r3 != r4) goto L57
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 <= 0) goto L51
            int r3 = r3 + 1
            goto L57
        L51:
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 >= 0) goto L57
            int r3 = r3 + (-1)
        L57:
            if (r3 < r1) goto L5a
            r3 = r1
        L5a:
            r5 = 1
            if (r3 > r5) goto L5e
            r3 = r5
        L5e:
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 <= 0) goto L65
            if (r3 >= r4) goto L6c
            goto L6d
        L65:
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L6c
            if (r3 <= r4) goto L6c
            goto L6d
        L6c:
            r4 = r3
        L6d:
            r6.f542977d = r4
            yf.o r7 = r0.f542895i
            if (r7 == 0) goto L9a
            java.lang.String r7 = r0.x()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r6.f542977d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "onScale, maxZoom:%s, current scale:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r2, r1)
            yf.o r7 = r0.f542895i
            int r1 = r6.f542977d
            r7.mo176949x76535355(r1)
            ag.g r7 = r0.f542893g
            ag.e r7 = r7.e()
            r7.a(r4)
        L9a:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.q0.onScale(android.view.ScaleGestureDetector):boolean");
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
    }
}
