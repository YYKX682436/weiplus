package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class q5 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.vb, android.view.View.OnClickListener, android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public db5.d5 f284132d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f284133e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f284134f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f284135g;

    /* renamed from: h, reason: collision with root package name */
    public int f284136h;

    /* renamed from: i, reason: collision with root package name */
    public int f284137i;

    /* renamed from: m, reason: collision with root package name */
    public int f284138m;

    /* renamed from: n, reason: collision with root package name */
    public int f284139n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f284140o;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f284143r;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f284145t;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.n5 f284141p = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.n5();

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnTouchListener f284142q = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.o5(this);

    /* renamed from: s, reason: collision with root package name */
    public final int f284144s = 300;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 f284146u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p5(this);

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (view == this.f284135g) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.r5.a(view.getContext(), erVar.f285439b, 3, 2);
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.r5.a(view.getContext(), erVar.f285439b, 2, 1);
        }
        db5.d5 d5Var = this.f284132d;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r7 != 3) goto L11;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            r4.add(r8)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            int r7 = r8.getAction()
            r8 = 1
            if (r7 == r8) goto L29
            r8 = 3
            if (r7 == r8) goto L2b
            goto L32
        L29:
            r6.f284140o = r8
        L2b:
            db5.d5 r7 = r6.f284132d
            if (r7 == 0) goto L32
            r7.dismiss()
        L32:
            java.lang.String r2 = "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r0 = 0
            r1 = r6
            yj0.a.i(r0, r1, r2, r3, r4, r5)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.q5.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
