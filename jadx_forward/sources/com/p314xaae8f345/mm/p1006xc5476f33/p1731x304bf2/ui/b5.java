package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class b5 extends com.p314xaae8f345.mm.ui.z9 {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c7 C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g1 A;
    public final kk.j B;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f222580o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f222581p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p6 f222582q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p6 f222583r;

    /* renamed from: s, reason: collision with root package name */
    public int f222584s;

    /* renamed from: t, reason: collision with root package name */
    public final int f222585t;

    /* renamed from: u, reason: collision with root package name */
    public final int f222586u;

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f222587v;

    /* renamed from: w, reason: collision with root package name */
    public final int f222588w;

    /* renamed from: x, reason: collision with root package name */
    public final int f222589x;

    /* renamed from: y, reason: collision with root package name */
    public int f222590y;

    /* renamed from: z, reason: collision with root package name */
    public long f222591z;

    public b5(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, int i17, long j17) {
        super(context, e1Var);
        this.f222584s = 15;
        this.f222585t = 0;
        this.f222586u = 0;
        this.f222588w = 0;
        this.f222589x = 0;
        this.f222590y = 0;
        this.f222587v = context;
        this.f222588w = i17;
        this.f222591z = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o1 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
        Di.getClass();
        android.database.Cursor m145256x1d3f4980 = Di.m145256x1d3f4980("select count(*) from GameRawMessage where " + Di.J0(2, 5, 6, 10, 11, 100) + " and showInMsgList = 1 and isHidden = 0", new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            r5 = m145256x1d3f4980.moveToFirst() ? m145256x1d3f4980.getInt(0) : 0;
            m145256x1d3f4980.close();
        }
        this.f222585t = r5;
        this.f222586u = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().d1();
        C = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c7();
        this.f222580o = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c5(context, i17);
        this.f222581p = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d5(context, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p6 p6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p6(context, 13);
        this.f222582q = p6Var;
        p6Var.f223252e = i17;
        p6Var.f223253f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de;
        p6Var.f223254g = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p6 p6Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p6(context, 13);
        this.f222583r = p6Var2;
        p6Var2.f223252e = i17;
        p6Var2.f223253f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de;
        p6Var2.f223254g = 2;
        this.A = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g1(context, i17);
        this.f222589x = i65.a.c(context, ((r53.f.h(context) - (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561106p) * 2)) - context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561367gj)) - context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx)) / 34;
        this.B = new jt0.i(30, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b5.class);
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1) obj;
        if (e1Var == null) {
            e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1();
        }
        e1Var.mo9015xbf5d97fd(cursor);
        return e1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        if (this.f294145i < 0) {
            this.f294145i = j().getCount();
        }
        int i17 = this.f294145i;
        if (i17 <= 0) {
            return 0;
        }
        return i17 + m();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05bb  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 2294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b5.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public int m() {
        int i17 = this.f222585t;
        int i18 = this.f222586u;
        return (i17 <= i18 || i18 <= 0) ? 0 : 1;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object n() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1) this.f294140d;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        j().close();
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public boolean p(int i17) {
        int i18 = this.f222585t;
        int i19 = this.f222586u;
        return i18 > i19 && i19 > 0 && i17 == i19;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o1 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
        int i17 = this.f222584s;
        Di.getClass();
        int i18 = 0;
        s(Di.m145256x1d3f4980("select * from GameRawMessage where " + Di.J0(2, 5, 6, 10, 11, 100) + " and showInMsgList = 1 and isHidden = 0 order by isRead, createTime desc limit " + i17, new java.lang.String[0]));
        this.f222584s = getCount();
        com.p314xaae8f345.mm.ui.y9 y9Var = this.f294144h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        if (this.f222591z > 0) {
            int count = getCount();
            while (true) {
                if (i18 < count) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 item = getItem(i18);
                    if (item != null && item.f68468x297eb4f7 == this.f222591z) {
                        this.f222590y = i18;
                        break;
                    }
                    i18++;
                } else {
                    break;
                }
            }
            this.f222591z = 0L;
        }
        notifyDataSetChanged();
    }

    public final void t(android.widget.ImageView imageView, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
            return;
        }
        kk.j jVar = this.B;
        if (!((lt0.f) jVar).k(str)) {
            android.graphics.Bitmap c17 = r53.y.a().c(imageView, str);
            if (c17 != null) {
                ((jt0.i) jVar).put(str, c17);
                return;
            }
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
        if (bitmap != null && !bitmap.isRecycled()) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        android.graphics.Bitmap c18 = r53.y.a().c(imageView, str);
        if (c18 != null) {
            ((jt0.i) jVar).put(str, c18);
        }
    }

    public final void u(android.widget.ImageView imageView, java.lang.String str) {
        kk.j jVar = this.B;
        if (!((lt0.f) jVar).k(str)) {
            w(imageView, str, 0.0f);
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            w(imageView, str, 0.0f);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void v(android.widget.ImageView imageView, java.lang.String str, float f17) {
        kk.j jVar = this.B;
        if (!((lt0.f) jVar).k(str)) {
            w(imageView, str, f17);
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            w(imageView, str, f17);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void w(android.widget.ImageView imageView, java.lang.String str, float f17) {
        r53.v vVar = new r53.v();
        vVar.f474236a = false;
        vVar.f474242g = f17;
        r53.y.a().e(imageView, str, vVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.z4(this, str));
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 getItem(int i17) {
        boolean p17 = p(i17);
        java.lang.Object obj = this.f294140d;
        if (p17) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1) obj;
        }
        java.util.Map map = this.f294143g;
        if (map != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            if (e1Var != null) {
                return e1Var;
            }
        }
        int i18 = this.f222585t;
        int i19 = this.f222586u;
        int i27 = i18 > i19 && i19 > 0 && i17 > i19 ? i17 - 1 : i17;
        if (i17 < 0 || !j().moveToPosition(i27)) {
            return null;
        }
        if (this.f294143g != null) {
            android.database.Cursor j17 = j();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1();
            e1Var2.mo9015xbf5d97fd(j17);
            ((java.util.HashMap) this.f294143g).put(java.lang.Integer.valueOf(i17), e1Var2);
            return e1Var2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1) obj;
        android.database.Cursor j18 = j();
        if (e1Var3 == null) {
            e1Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1();
        }
        e1Var3.mo9015xbf5d97fd(j18);
        return e1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean, int] */
    public final void y(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a5 a5Var) {
        boolean z17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 1; i17 < e1Var.f221808b2.size(); i17++) {
            linkedList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v0) e1Var.f221808b2.get(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15980x7eb67fb3 c15980x7eb67fb3 = a5Var.f222565n;
        kk.j jVar = this.B;
        c15980x7eb67fb3.getClass();
        int i18 = 8;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            c15980x7eb67fb3.setVisibility(8);
            return;
        }
        boolean z18 = false;
        c15980x7eb67fb3.setVisibility(0);
        int size = linkedList.size();
        int i19 = this.f222589x;
        int i27 = i19 > size ? 1 : 2;
        android.content.Context context = c15980x7eb67fb3.f222459d;
        android.content.res.Resources resources = context.getResources();
        int i28 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f;
        int dimensionPixelSize = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
        while (c15980x7eb67fb3.getChildCount() < i27) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15981x4bb6dd1c c15981x4bb6dd1c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15981x4bb6dd1c(context);
            if (c15980x7eb67fb3.getChildCount() > 0) {
                c15981x4bb6dd1c.setPadding(0, dimensionPixelSize, 0, 0);
            }
            c15981x4bb6dd1c.m64770x6a7f536f(this.f222588w);
            c15980x7eb67fb3.addView(c15981x4bb6dd1c);
        }
        int i29 = 0;
        while (i29 < c15980x7eb67fb3.getChildCount()) {
            if (i29 < i27) {
                android.view.View childAt = c15980x7eb67fb3.getChildAt(i29);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(z18 ? 1 : 0));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(z18 ? 1 : 0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15981x4bb6dd1c c15981x4bb6dd1c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15981x4bb6dd1c) c15980x7eb67fb3.getChildAt(i29);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (int i37 = i29 * i19; i37 < (i29 + 1) * i19 && i37 < linkedList.size(); i37++) {
                    linkedList2.add((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v0) linkedList.get(i37));
                }
                c15981x4bb6dd1c2.getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
                    c15981x4bb6dd1c2.setVisibility(i18);
                } else {
                    c15981x4bb6dd1c2.f222462f = jVar;
                    c15981x4bb6dd1c2.setVisibility(z18 ? 1 : 0);
                    android.content.Context context2 = c15981x4bb6dd1c2.f222460d;
                    int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561382gy);
                    int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(i28);
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
                    layoutParams.rightMargin = dimensionPixelSize3;
                    while (c15981x4bb6dd1c2.getChildCount() < linkedList2.size()) {
                        android.widget.ImageView imageView = new android.widget.ImageView(context2);
                        imageView.setLayoutParams(layoutParams);
                        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                        imageView.setOnClickListener(c15981x4bb6dd1c2.f222461e);
                        c15981x4bb6dd1c2.addView(imageView);
                    }
                    int i38 = z18 ? 1 : 0;
                    ?? r66 = z18;
                    while (i38 < c15981x4bb6dd1c2.getChildCount()) {
                        android.widget.ImageView imageView2 = (android.widget.ImageView) c15981x4bb6dd1c2.getChildAt(i38);
                        if (i38 < linkedList2.size()) {
                            imageView2.setVisibility(r66);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v0) linkedList2.get(i38);
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v0Var.f222024c)) {
                                java.lang.String str = v0Var.f222022a;
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView2, str, null);
                                } else if (c15981x4bb6dd1c2.f222462f.k(str)) {
                                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) c15981x4bb6dd1c2.f222462f.get(str);
                                    if (bitmap == null || bitmap.isRecycled()) {
                                        android.graphics.Bitmap c17 = r53.y.a().c(imageView2, str);
                                        if (c17 != null) {
                                            c15981x4bb6dd1c2.f222462f.put(str, c17);
                                        }
                                    } else {
                                        imageView2.setImageBitmap(bitmap);
                                    }
                                } else {
                                    android.graphics.Bitmap c18 = r53.y.a().c(imageView2, str);
                                    if (c18 != null) {
                                        c15981x4bb6dd1c2.f222462f.put(str, c18);
                                    }
                                }
                            } else {
                                java.lang.String str2 = v0Var.f222024c;
                                if (c15981x4bb6dd1c2.f222462f.k(str2)) {
                                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) c15981x4bb6dd1c2.f222462f.get(str2);
                                    if (bitmap2 == null || bitmap2.isRecycled()) {
                                        r53.v vVar = new r53.v();
                                        vVar.f474236a = r66;
                                        r53.y.a().e(imageView2, str2, vVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.e5(c15981x4bb6dd1c2, str2));
                                    } else {
                                        imageView2.setImageBitmap(bitmap2);
                                    }
                                } else {
                                    r53.v vVar2 = new r53.v();
                                    vVar2.f474236a = false;
                                    r53.y.a().e(imageView2, str2, vVar2.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.e5(c15981x4bb6dd1c2, str2));
                                }
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v0Var.f222026e)) {
                                imageView2.setEnabled(false);
                            } else {
                                imageView2.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f1(e1Var, v0Var.f222026e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 6));
                                imageView2.setEnabled(true);
                            }
                        } else {
                            imageView2.setVisibility(i18);
                        }
                        i38++;
                        r66 = 0;
                        i18 = 8;
                    }
                }
                i18 = 8;
                z17 = false;
            } else {
                android.view.View childAt2 = c15980x7eb67fb3.getChildAt(i29);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                i18 = 8;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                z17 = false;
                childAt2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt2, "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i29++;
            z18 = z17;
            i28 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f;
        }
    }
}
