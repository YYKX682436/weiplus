package al5;

/* loaded from: classes8.dex */
public final class y2 implements al5.k4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f87633a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f87634b;

    public y2() {
        java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newSetFromMap, "newSetFromMap(...)");
        this.f87633a = newSetFromMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if ((r5[1] + r3.getHeight()) >= ((r4[1] + r8.getHeight()) - r9)) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 r8, int r9, al5.y2 r10, android.view.ViewGroup r11) {
        /*
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto Lf6
            android.view.View r3 = r11.getChildAt(r2)
            if (r3 != 0) goto L10
            goto Lf2
        L10:
            int r4 = r3.getWidth()
            if (r4 <= 0) goto Lf2
            int r4 = r3.getHeight()
            if (r4 > 0) goto L1e
            goto Lf2
        L1e:
            al5.j4 r4 = al5.l4.f87480c
            boolean r5 = r4.b(r3)
            if (r5 == 0) goto L28
            goto Lf2
        L28:
            int r5 = r3.getVisibility()
            if (r5 != 0) goto Lf2
            java.lang.String r5 = "wrapper"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r5)
            boolean r4 = r4.b(r3)
            if (r4 == 0) goto L3b
            goto L91
        L3b:
            int r4 = r3.getVisibility()
            if (r4 == 0) goto L42
            goto L91
        L42:
            int r4 = r3.getWidth()
            if (r4 <= 0) goto L91
            int r4 = r3.getHeight()
            if (r4 > 0) goto L4f
            goto L91
        L4f:
            if (r9 > 0) goto L52
            goto L91
        L52:
            int r4 = r8.getWidth()
            int r5 = r8.getHeight()
            if (r4 <= 0) goto L91
            if (r5 > 0) goto L5f
            goto L91
        L5f:
            int r6 = r3.getHeight()
            int r5 = r5 * 3
            int r5 = r5 / 10
            if (r6 < r5) goto L6a
            goto L91
        L6a:
            int r5 = r3.getWidth()
            int r4 = r4 / 2
            if (r5 > r4) goto L73
            goto L91
        L73:
            r4 = 2
            int[] r5 = new int[r4]
            r3.getLocationInWindow(r5)
            int[] r4 = new int[r4]
            r8.getLocationInWindow(r4)
            r6 = 1
            r4 = r4[r6]
            int r7 = r8.getHeight()
            int r4 = r4 + r7
            int r4 = r4 - r9
            r5 = r5[r6]
            int r7 = r3.getHeight()
            int r5 = r5 + r7
            if (r5 < r4) goto L91
            goto L92
        L91:
            r6 = r1
        L92:
            if (r6 == 0) goto Le9
            java.util.Set r4 = r10.f87633a
            boolean r4 = r4.add(r3)
            if (r4 == 0) goto Lf2
            java.lang.Class r4 = r3.getClass()
            java.lang.String r4 = r4.getSimpleName()
            int r5 = r3.getId()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.Set r6 = r10.f87633a
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r5 = "MicroMsg.ScrollableListBottomBarStrategy"
            java.lang.String r6 = "discovered bottom pinned view: %s (id=0x%x), total tracked: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6, r4)
            kotlin.jvm.internal.f0 r4 = new kotlin.jvm.internal.f0
            r4.<init>()
            int r5 = r3.getVisibility()
            r4.f391649d = r5
            al5.x2 r5 = new al5.x2
            r5.<init>(r3, r4, r8)
            al5.w2 r6 = new al5.w2
            r6.<init>(r4, r5)
            r3.addOnAttachStateChangeListener(r6)
            boolean r6 = r3.isAttachedToWindow()
            if (r6 == 0) goto Lf2
            int r6 = r3.getVisibility()
            r4.f391649d = r6
            r3.addOnLayoutChangeListener(r5)
            goto Lf2
        Le9:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto Lf2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            a(r8, r9, r10, r3)
        Lf2:
            int r2 = r2 + 1
            goto L6
        Lf6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al5.y2.a(com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout, int, al5.y2, android.view.ViewGroup):void");
    }
}
