package df2;

/* loaded from: classes3.dex */
public final class qd implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ud f312690d;

    public qd(df2.ud udVar) {
        this.f312690d = udVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        if (pm0.v.r(r1).contains((int) r22.getX(), (int) r22.getY()) == true) goto L10;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r21, android.view.MotionEvent r22) {
        /*
            r20 = this;
            r8 = r21
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$initView$1$1"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r8)
            r6 = r22
            r4.add(r6)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r20
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            r12 = r20
            df2.ud r0 = r12.f312690d
            java.lang.Integer r1 = r0.f313051u
            r13 = 0
            if (r1 == 0) goto L71
            int r1 = r1.intValue()
            r45.d62 r1 = r45.d62.a(r1)
            java.lang.String r2 = "forNumber(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            android.view.View r1 = r0.Z6(r1)
            if (r1 == 0) goto L55
            android.graphics.Rect r1 = pm0.v.r(r1)
            float r2 = r22.getX()
            int r2 = (int) r2
            float r3 = r22.getY()
            int r3 = (int) r3
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            if (r1 != r2) goto L55
            goto L56
        L55:
            r2 = r13
        L56:
            if (r2 == 0) goto L71
            df2.dd r14 = df2.od.f312485w
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = r0.getStore()
            gk2.e r15 = r1.getLiveRoomData()
            r16 = 2
            r17 = 6
            java.lang.String r1 = r0.f313052v
            java.lang.Integer r2 = r0.f313051u
            r18 = r1
            r19 = r2
            r14.a(r15, r16, r17, r18, r19)
        L71:
            r1 = 0
            r0.f313051u = r1
            r0.f313052v = r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.ThreadLocal r0 = zj0.c.f554818a
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.add(r0)
            java.util.Collections.reverse(r9)
            java.lang.Object[] r1 = r9.toArray()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$initView$1$1"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r21
            yj0.a.d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r9.get(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$initView$1$1"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r21
            yj0.a.f(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$initView$1$1"
            java.lang.String r9 = "android/view/View$OnTouchListener"
            java.lang.String r10 = "onTouch"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r6 = 0
            r7 = r20
            yj0.a.i(r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qd.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
