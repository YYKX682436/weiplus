package h22;

/* loaded from: classes15.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f359814d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f359815e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f359816f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f359817g;

    /* renamed from: h, reason: collision with root package name */
    public int f359818h;

    /* renamed from: i, reason: collision with root package name */
    public int f359819i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f359820m;

    /* renamed from: n, reason: collision with root package name */
    public int f359821n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f359822o;

    /* renamed from: p, reason: collision with root package name */
    public final h22.b f359823p;

    public c(android.content.Context context, java.util.LinkedList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f359814d = context;
        this.f359815e = data;
        this.f359816f = "MicroMsg.EmojiStoreV3BannerAdapter";
        new java.util.ArrayList();
        this.f359818h = 1;
        this.f359821n = 10001;
        this.f359823p = new h22.b(this);
    }

    public final void B(java.util.List newData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newData, "newData");
        java.util.LinkedList linkedList = this.f359815e;
        int size = linkedList.size();
        int size2 = newData.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f359816f, "setBannerData: from:" + size + ", to:" + size2);
        int min = java.lang.Math.min(size, size2);
        int i17 = size2 - size;
        int i18 = size - size2;
        linkedList.clear();
        linkedList.addAll(newData);
        if (i18 > 0) {
            m8154xdb81fc7f(size2, i18);
        }
        if (i17 > 0) {
            m8153xd399a4d9(size, i17);
        }
        if (min > 0) {
            m8151xc67946d3(0, min);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f359815e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8156x4147ed22(recyclerView);
        recyclerView.i(this.f359823p);
        this.f359817g = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r14, int r15) {
        /*
            r13 = this;
            h22.j r14 = (h22.j) r14
            java.lang.String r0 = "holder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            java.util.LinkedList r0 = r13.f359815e
            java.lang.Object r0 = r0.get(r15)
            com.tencent.mm.plugin.emoji.model.b r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b) r0
            if (r0 != 0) goto L1a
            java.lang.String r14 = "BaseEmotionBanner is null."
            java.lang.String r15 = r13.f359816f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r15, r14)
            goto Lcb
        L1a:
            boolean r1 = r0.f179072c
            java.lang.String r2 = "StripUrl"
            r45.kj0 r3 = r0.f179070a
            if (r1 == 0) goto L2f
            r45.ij0 r1 = r3.f460259d
            java.lang.String r1 = r1.f458627g
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            java.lang.String r2 = r3.f460261f
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            goto L42
        L2f:
            r45.hj0 r1 = r0.f179071b
            r45.ij0 r4 = r1.f457744e
            java.lang.String r4 = r4.f458627g
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r2)
            r45.zj0 r1 = r1.f457743d
            java.lang.String r1 = r1.f473661d
            java.lang.String r2 = "ProductID"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            r1 = r4
        L42:
            r2 = 0
            if (r3 == 0) goto L48
            java.lang.String r4 = r3.f460260e
            goto L49
        L48:
            r4 = r2
        L49:
            android.widget.TextView r5 = r14.f359840f
            r5.setText(r4)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            com.tencent.mm.plugin.gif.MMAnimateView r5 = r14.f359839e
            r5.setScaleType(r4)
            if (r3 == 0) goto L5d
            r45.ij0 r3 = r3.f460259d
            if (r3 == 0) goto L5d
            r45.jj0 r2 = r3.f458629i
        L5d:
            android.widget.TextView r3 = r14.f359841g
            if (r2 == 0) goto Lab
            java.lang.String r4 = r2.f459380d
            r6 = 0
            if (r4 == 0) goto L6f
            int r4 = r4.length()
            if (r4 != 0) goto L6d
            goto L6f
        L6d:
            r4 = r6
            goto L70
        L6f:
            r4 = 1
        L70:
            if (r4 == 0) goto L73
            goto Lab
        L73:
            r3.setVisibility(r6)
            android.content.Context r4 = r13.f359814d
            r6 = 1082130432(0x40800000, float:4.0)
            int r4 = ym5.x.a(r4, r6)
            float r12 = (float) r4
            java.util.LinkedList r4 = r2.f459381e
            java.lang.String r6 = "TextColorArgb"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r6)
            int r4 = r13.x(r4)
            r3.setTextColor(r4)
            java.lang.String r4 = r2.f459380d
            r3.setText(r4)
            java.util.LinkedList r2 = r2.f459383g
            java.lang.String r4 = "BgColorArgb"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            int r8 = r13.x(r2)
            n22.f r6 = n22.f.f415823a
            r7 = r8
            r9 = r12
            r10 = r12
            r11 = r12
            android.graphics.drawable.Drawable r2 = r6.b(r7, r8, r9, r10, r11, r12)
            r3.setBackgroundDrawable(r2)
            goto Lb0
        Lab:
            r2 = 8
            r3.setVisibility(r2)
        Lb0:
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r2 != 0) goto Lc1
            vo0.a r2 = vo0.e.f520001b
            wo0.c r1 = r2.a(r1)
            wo0.b r1 = (wo0.b) r1
            r1.c(r5)
        Lc1:
            h22.a r1 = new h22.a
            r1.<init>(r13, r15, r0)
            android.widget.FrameLayout r14 = r14.f359838d
            r14.setOnClickListener(r1)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h22.c.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup group, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(group, "group");
        android.content.Context context = this.f359814d;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8b, group, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new h22.j(context, inflate);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onDetachedFromRecyclerView */
    public void mo8158xdba684df(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8158xdba684df(recyclerView);
        recyclerView.V0(this.f359823p);
        this.f359817g = null;
    }

    public final int x(java.util.List list) {
        try {
            java.lang.String str = (java.lang.String) ((!com.p314xaae8f345.mm.ui.bk.C() || list.size() < 2) ? kz5.n0.X(list) : list.get(1));
            if (!r26.n0.i0(str, '#', false, 2, null)) {
                str = "#" + str;
            }
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public final java.util.List y(java.util.List list, java.util.List list2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.hj0 hj0Var = (r45.hj0) it.next();
                if ((hj0Var != null ? hj0Var.f457744e : null) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hj0Var.f457744e.f458627g)) {
                    linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b(hj0Var, null, false));
                }
            }
        }
        if (list2 != null) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                r45.kj0 kj0Var = (r45.kj0) it6.next();
                if ((kj0Var != null ? kj0Var.f460259d : null) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kj0Var.f460259d.f458627g)) {
                    linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b(null, kj0Var, true));
                }
            }
        }
        return linkedList;
    }

    public final void z() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de;
        int w17;
        int y17;
        if (this.f359820m) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f359817g;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null;
            java.lang.String str = this.f359816f;
            if (layoutManager == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "report 31502 fail, layoutManager is null");
                return;
            }
            if (mo1894x7e414b06() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "report 31502 fail, itemCount is 0");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13369xdedd0dff) {
                int m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13369xdedd0dff) layoutManager).m();
                int i17 = this.f359818h;
                for (int i18 = 0; i18 < i17; i18++) {
                    arrayList.add(java.lang.Integer.valueOf((m17 + i18) % mo1894x7e414b06()));
                }
            } else if ((layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) && (w17 = (c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w()) <= (y17 = c1162x665295de.y())) {
                while (true) {
                    arrayList.add(java.lang.Integer.valueOf(w17));
                    if (w17 == y17) {
                        break;
                    } else {
                        w17++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                int intValue = ((java.lang.Number) arrayList.get(i19)).intValue();
                if (intValue < mo1894x7e414b06() && intValue >= 0) {
                    j22.a.b((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b) this.f359815e.get(intValue), intValue + 1, this.f359819i == 0 ? 1 : 2, "view_exp");
                }
            }
        }
    }
}
