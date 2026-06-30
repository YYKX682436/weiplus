package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class z2 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273552d;

    public z2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f) {
        this.f273552d = activityC19730xa7b9756f;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView view, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    @Override // android.widget.AbsListView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrollStateChanged(android.widget.AbsListView r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$5"
            java.lang.String r1 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r2 = "onScrollStateChanged"
            java.lang.String r3 = "(Landroid/widget/AbsListView;I)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r9
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "view"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r10 = r9.f273552d
            boolean r0 = r10.f272911r
            java.lang.String r1 = "(Landroid/widget/AbsListView;I)V"
            java.lang.String r2 = "onScrollStateChanged"
            java.lang.String r3 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r4 = "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$5"
            java.lang.String r5 = "MicroMsg.FileSelectorUI"
            if (r0 == 0) goto L44
            java.lang.String r10 = "search mode, not load data"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r10)
            yj0.a.h(r9, r4, r3, r2, r1)
            return
        L44:
            if (r11 != 0) goto Lc7
            android.widget.ListView r11 = r10.f272902f
            r0 = 0
            java.lang.String r6 = "listView"
            if (r11 == 0) goto Lc3
            int r7 = r11.getChildCount()
            r8 = 1
            int r7 = r7 - r8
            android.view.View r11 = r11.getChildAt(r7)
            if (r11 != 0) goto L5a
            goto L73
        L5a:
            android.widget.ListView r11 = r10.f272902f
            if (r11 == 0) goto Lbf
            int r11 = r11.getLastVisiblePosition()
            android.widget.ListView r7 = r10.f272902f
            if (r7 == 0) goto Lbb
            android.widget.ListAdapter r6 = r7.getAdapter()
            int r6 = r6.getCount()
            int r6 = r6 - r8
            if (r11 != r6) goto L73
            r11 = r8
            goto L74
        L73:
            r11 = 0
        L74:
            if (r11 == 0) goto Lc7
            java.lang.String r11 = "will load data when it at bottom"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r11)
            com.tencent.mm.pluginsdk.ui.tools.a2 r10 = r10.f272907n
            if (r10 == 0) goto Lb5
            int r11 = r10.f273042n
            if (r11 == r8) goto La3
            r0 = 2
            if (r11 == r0) goto L91
            r0 = 3
            if (r11 == r0) goto L8b
            goto Lc7
        L8b:
            com.tencent.mm.pluginsdk.ui.tools.n2 r10 = r10.f273041m
            r10.getClass()
            goto Lc7
        L91:
            com.tencent.mm.pluginsdk.ui.tools.r1 r10 = r10.f273040i
            r10.getClass()
            ku5.u0 r11 = ku5.t0.f394148d
            com.tencent.mm.pluginsdk.ui.tools.q1 r0 = new com.tencent.mm.pluginsdk.ui.tools.q1
            r0.<init>(r10)
            ku5.t0 r11 = (ku5.t0) r11
            r11.g(r0)
            goto Lc7
        La3:
            com.tencent.mm.pluginsdk.ui.tools.n1 r10 = r10.f273039h
            r10.getClass()
            ku5.u0 r11 = ku5.t0.f394148d
            com.tencent.mm.pluginsdk.ui.tools.l1 r0 = new com.tencent.mm.pluginsdk.ui.tools.l1
            r0.<init>(r10)
            ku5.t0 r11 = (ku5.t0) r11
            r11.g(r0)
            goto Lc7
        Lb5:
            java.lang.String r10 = "adapter"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r10)
            throw r0
        Lbb:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r6)
            throw r0
        Lbf:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r6)
            throw r0
        Lc3:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r6)
            throw r0
        Lc7:
            yj0.a.h(r9, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z2.onScrollStateChanged(android.widget.AbsListView, int):void");
    }
}
