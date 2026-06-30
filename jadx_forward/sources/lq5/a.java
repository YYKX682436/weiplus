package lq5;

/* loaded from: classes9.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f401996d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2816xed9644dc.C22934xcb7b78c0 f401998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c f401999g;

    public a(int i17, com.p314xaae8f345.mm.p2816xed9644dc.C22934xcb7b78c0 c22934xcb7b78c0, com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c c22936xbad5951c) {
        this.f401997e = i17;
        this.f401998f = c22934xcb7b78c0;
        this.f401999g = c22936xbad5951c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if ((r3 != null && r3.mo1894x7e414b06() == r6.f401999g.getShowSize() + 59) == false) goto L20;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/wepicker/RemindTimePicker$1$picker$1$1"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r2 = "onScrollStateChanged"
            java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "recyclerView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            if (r8 != 0) goto Lb8
            androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
            java.lang.String r8 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r7, r8)
            androidx.recyclerview.widget.LinearLayoutManager r7 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) r7
            int r7 = r7.t()
            r8 = 2
            r0 = 1
            r1 = 0
            com.tencent.mm.wepicker.RemindTimePicker r2 = r6.f401998f
            int r3 = r6.f401997e
            if (r3 == 0) goto L89
            if (r3 == r0) goto L45
            goto Lb6
        L45:
            java.util.List r3 = r2.f295837q
            java.lang.Object r3 = r3.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto Lb6
            if (r7 == 0) goto L79
            int r3 = r6.f401996d
            if (r3 <= 0) goto L79
            java.util.ArrayList r3 = r2.f295836p
            java.lang.Object r3 = r3.get(r8)
            com.tencent.mm.wepicker.WePicker r3 = (com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c) r3
            androidx.recyclerview.widget.f2 r3 = r3.mo7946xf939df19()
            if (r3 == 0) goto L76
            int r3 = r3.mo1894x7e414b06()
            com.tencent.mm.wepicker.WePicker r4 = r6.f401999g
            int r4 = r4.getShowSize()
            int r4 = r4 + 59
            if (r3 != r4) goto L76
            goto L77
        L76:
            r0 = r1
        L77:
            if (r0 != 0) goto Lb6
        L79:
            java.util.ArrayList r0 = r2.f295836p
            java.lang.Object r8 = r0.get(r8)
            com.tencent.mm.wepicker.WePicker r8 = (com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c) r8
            java.util.List r0 = r2.c()
            r8.g1(r0, r1)
            goto Lb6
        L89:
            if (r7 == 0) goto L8f
            int r3 = r6.f401996d
            if (r3 > 0) goto Lb6
        L8f:
            java.util.ArrayList r3 = r2.f295836p
            java.lang.Object r3 = r3.get(r0)
            com.tencent.mm.wepicker.WePicker r3 = (com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c) r3
            java.util.List r4 = r2.b()
            r3.g1(r4, r1)
            java.util.List r3 = r2.f295837q
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3.set(r0, r4)
            java.util.ArrayList r0 = r2.f295836p
            java.lang.Object r8 = r0.get(r8)
            com.tencent.mm.wepicker.WePicker r8 = (com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c) r8
            java.util.List r0 = r2.c()
            r8.g1(r0, r1)
        Lb6:
            r6.f401996d = r7
        Lb8:
            java.lang.String r7 = "onScrollStateChanged"
            java.lang.String r8 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            java.lang.String r0 = "com/tencent/mm/wepicker/RemindTimePicker$1$picker$1$1"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            yj0.a.h(r6, r0, r1, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lq5.a.mo481x4d79408f(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wepicker/RemindTimePicker$1$picker$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        java.lang.Object tag = recyclerView.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        com.p314xaae8f345.mm.p2816xed9644dc.C22934xcb7b78c0 c22934xcb7b78c0 = this.f401998f;
        int m83474xb747914f = ((com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c) c22934xcb7b78c0.f295836p.get(intValue)).m83474xb747914f();
        java.util.List list = c22934xcb7b78c0.f295837q;
        if (m83474xb747914f != ((java.lang.Number) list.get(intValue)).intValue()) {
            list.set(intValue, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c) c22934xcb7b78c0.f295836p.get(intValue)).m83474xb747914f()));
            int i19 = android.os.Build.VERSION.SDK_INT;
            android.os.Vibrator vibrator = c22934xcb7b78c0.f295845y;
            if (i19 >= 26) {
                android.os.VibrationEffect createOneShot = android.os.VibrationEffect.createOneShot(10L, 255);
                if (vibrator != null) {
                    vibrator.vibrate(createOneShot);
                }
            } else if (vibrator != null) {
                vibrator.vibrate(10L);
            }
        }
        c22934xcb7b78c0.m83438xcc17022a();
        yj0.a.h(this, "com/tencent/mm/wepicker/RemindTimePicker$1$picker$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
