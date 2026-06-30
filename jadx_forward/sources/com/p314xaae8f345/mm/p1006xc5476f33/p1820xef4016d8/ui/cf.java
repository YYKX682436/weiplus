package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class cf implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f228325d;

    public cf(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def) {
        this.f228325d = activityC16377xf00b6def;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r11 <= (r3 + r0.getHeight())) goto L23;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$setActivityBg$1"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r10)
            r4.add(r11)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r9
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "v"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r10 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r10)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI r10 = r9.f228325d
            androidx.appcompat.app.AppCompatActivity r0 = r10.mo55332x76847179()
            boolean r0 = r0.isFinishing()
            r1 = 0
            java.lang.String r2 = "MicroMsg.LuckyMoneyNewReceiveUI"
            if (r0 == 0) goto L4b
            java.lang.String r10 = "[onTouch] isFinishing"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10)
            java.lang.String r5 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$setActivityBg$1"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = 0
            r4 = r9
            yj0.a.i(r3, r4, r5, r6, r7, r8)
            return r1
        L4b:
            int r0 = r11.getAction()
            if (r0 != 0) goto La0
            java.lang.String r0 = "[onTouch] touch outside content"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            android.view.View r0 = r10.f227845v
            if (r0 == 0) goto L95
            int r3 = r0.getVisibility()
            r4 = 8
            if (r3 != r4) goto L63
            goto L95
        L63:
            r3 = 2
            int[] r3 = new int[r3]
            r0.getLocationOnScreen(r3)
            float r4 = r11.getRawX()
            float r11 = r11.getRawY()
            r5 = r3[r1]
            float r6 = (float) r5
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L95
            int r6 = r0.getWidth()
            int r5 = r5 + r6
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L95
            r4 = 1
            r3 = r3[r4]
            float r5 = (float) r3
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 < 0) goto L95
            int r0 = r0.getHeight()
            int r3 = r3 + r0
            float r0 = (float) r3
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 > 0) goto L95
            goto L96
        L95:
            r4 = r1
        L96:
            if (r4 != 0) goto La0
            java.lang.String r11 = "[onTouch] touch outside content, finish"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r11)
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def.V6(r10)
        La0:
            java.lang.String r5 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$setActivityBg$1"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = 0
            r4 = r9
            yj0.a.i(r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.cf.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
