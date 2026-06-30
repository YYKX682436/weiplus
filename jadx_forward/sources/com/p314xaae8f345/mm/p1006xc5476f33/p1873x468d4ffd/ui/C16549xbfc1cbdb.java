package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView */
/* loaded from: classes10.dex */
public class C16549xbfc1cbdb extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public long f230701d;

    /* renamed from: e, reason: collision with root package name */
    public float f230702e;

    /* renamed from: f, reason: collision with root package name */
    public int f230703f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u f230704g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.GestureDetector f230705h;

    public C16549xbfc1cbdb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            android.view.GestureDetector r8 = r11.f230705h
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.add(r12)
            java.util.Collections.reverse(r9)
            java.lang.Object[] r1 = r9.toArray()
            java.lang.String r2 = "com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView"
            java.lang.String r3 = "onTouchEvent"
            java.lang.String r4 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r5 = "android/view/GestureDetector_EXEC_"
            java.lang.String r6 = "onTouchEvent"
            java.lang.String r7 = "(Landroid/view/MotionEvent;)Z"
            r0 = r8
            yj0.a.d(r0, r1, r2, r3, r4, r5, r6, r7)
            r10 = 0
            java.lang.Object r0 = r9.get(r10)
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            boolean r1 = r8.onTouchEvent(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView"
            java.lang.String r3 = "onTouchEvent"
            java.lang.String r4 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r5 = "android/view/GestureDetector_EXEC_"
            java.lang.String r6 = "onTouchEvent"
            java.lang.String r7 = "(Landroid/view/MotionEvent;)Z"
            r0 = r8
            yj0.a.g(r0, r1, r2, r3, r4, r5, r6, r7)
            int r0 = r12.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1
            if (r0 == 0) goto Lcc
            if (r0 == r2) goto Lc7
            r1 = 2
            if (r0 == r1) goto L62
            r12 = 5
            if (r0 == r12) goto L5b
            r12 = 6
            if (r0 == r12) goto L54
            goto Ld3
        L54:
            int r12 = r11.f230703f
            int r12 = r12 - r2
            r11.f230703f = r12
            goto Ld3
        L5b:
            int r12 = r11.f230703f
            int r12 = r12 + r2
            r11.f230703f = r12
            goto Ld3
        L62:
            int r0 = r11.f230703f
            if (r0 < r1) goto Ld3
            r3 = 0
            if (r0 < r1) goto L95
            float r0 = r12.getX(r10)     // Catch: java.lang.Exception -> L85
            float r1 = r12.getY(r10)     // Catch: java.lang.Exception -> L85
            float r4 = r12.getX(r2)     // Catch: java.lang.Exception -> L85
            float r12 = r12.getY(r2)     // Catch: java.lang.Exception -> L85
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Exception -> L85
            float r1 = r1 - r12
            float r12 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L85
            float r0 = r0 + r12
            goto L96
        L85:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r0 = "MicroMsg.MMSightCaptureTouchView"
            java.lang.String r1 = "pointerDistance error: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1, r12)
        L95:
            r0 = r3
        L96:
            int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r12 <= 0) goto Ld3
            float r12 = r11.f230702e
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 > 0) goto La3
            r11.f230702e = r0
            goto Ld3
        La3:
            float r12 = r0 - r12
            float r12 = java.lang.Math.abs(r12)
            r1 = 1097859072(0x41700000, float:15.0)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 <= 0) goto Ld3
            float r12 = r11.f230702e
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 <= 0) goto Lbd
            com.tencent.mm.plugin.mmsight.ui.u r12 = r11.f230704g
            if (r12 == 0) goto Lc4
            r12.a()
            goto Lc4
        Lbd:
            com.tencent.mm.plugin.mmsight.ui.u r12 = r11.f230704g
            if (r12 == 0) goto Lc4
            r12.b()
        Lc4:
            r11.f230702e = r0
            goto Ld3
        Lc7:
            r11.f230702e = r1
            r11.f230703f = r10
            goto Ld3
        Lcc:
            r11.f230702e = r1
            int r12 = r11.f230703f
            int r12 = r12 + r2
            r11.f230703f = r12
        Ld3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16549xbfc1cbdb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setTouchCallback */
    public void m66959x73ebd762(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u uVar) {
        this.f230704g = uVar;
    }

    public C16549xbfc1cbdb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230701d = 0L;
        this.f230702e = -1.0f;
        this.f230703f = 0;
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t(this));
        this.f230705h = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }
}
