package ts3;

/* loaded from: classes9.dex */
public class d0 extends ts3.a {
    public final int A;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 B;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f503183o;

    /* renamed from: p, reason: collision with root package name */
    public int f503184p;

    /* renamed from: q, reason: collision with root package name */
    public int f503185q;

    /* renamed from: r, reason: collision with root package name */
    public final int f503186r;

    /* renamed from: s, reason: collision with root package name */
    public final int f503187s;

    /* renamed from: t, reason: collision with root package name */
    public final int f503188t;

    /* renamed from: u, reason: collision with root package name */
    public final int f503189u;

    /* renamed from: v, reason: collision with root package name */
    public final int f503190v;

    /* renamed from: w, reason: collision with root package name */
    public final int f503191w;

    /* renamed from: x, reason: collision with root package name */
    public final int f503192x;

    /* renamed from: y, reason: collision with root package name */
    public final int f503193y;

    /* renamed from: z, reason: collision with root package name */
    public final int f503194z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152, android.content.Context context, java.lang.String str) {
        super(context, str);
        this.B = activityC16956x7944e152;
        this.f503186r = 0;
        this.f503187s = 0;
        this.f503188t = 0;
        this.f503189u = 0;
        this.f503190v = 0;
        this.f503191w = 0;
        this.f503194z = 1;
        this.A = 2;
        this.f503183o = context;
        this.f503184p = 3;
        this.f503185q = ss3.d0.Di().y0(activityC16956x7944e152.f236593h);
        this.f503187s = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3);
        this.f503188t = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        this.f503186r = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
        this.f503189u = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx);
        this.f503192x = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561763s1);
        this.f503193y = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561761rz);
        int e17 = fq1.e.f347040a.e(context);
        int k17 = i65.a.k(context);
        e17 = e17 >= k17 ? k17 : e17;
        float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152.f236588u;
        this.f503190v = (int) ((e17 - ((int) (28.0f * f17))) / 2.35d);
        this.f503191w = (((int) ((e17 - (f17 * 52.0f)) / 2.0f)) * 4) / 3;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        return cursor.getString(0);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        java.util.List x17 = x(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(x17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReaderAppUI", "getItemViewType info is null");
            return 0;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) x17;
        c01.ta taVar = (c01.ta) arrayList.get(0);
        taVar.i();
        if (!(taVar.f119021u == 1) || arrayList.size() < 2) {
            return 0;
        }
        return this.f503194z;
    }

    @Override // android.widget.Adapter, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    /* renamed from: getView */
    public android.view.View mo75872xfb86a31b(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        ts3.a0 a0Var;
        java.util.ArrayList arrayList;
        boolean z17;
        java.lang.Integer num;
        android.view.View view3;
        ts3.a0 a0Var2;
        int i18;
        ts3.a0 a0Var3;
        android.view.View view4;
        int itemViewType = getItemViewType(i17);
        int i19 = this.f503194z;
        int i27 = this.f503186r;
        int i28 = this.f503187s;
        android.content.Context context = this.f503183o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152 = this.B;
        if (itemViewType == i19) {
            if (view == null) {
                a0Var3 = new ts3.a0(this);
                view4 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570907cc2, null);
                a0Var3.f503155a = (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.f569257pl0);
                a0Var3.f503167m = (android.widget.ImageView) view4.findViewById(com.p314xaae8f345.mm.R.id.a_4);
                a0Var3.f503168n = (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.kbb);
                ts3.c0 c0Var = new ts3.c0(this);
                a0Var3.f503169o = c0Var;
                c0Var.f503174a = view4.findViewById(com.p314xaae8f345.mm.R.id.ckt);
                a0Var3.f503169o.b();
                ts3.c0 c0Var2 = new ts3.c0(this);
                a0Var3.f503170p = c0Var2;
                c0Var2.f503174a = view4.findViewById(com.p314xaae8f345.mm.R.id.cku);
                a0Var3.f503170p.b();
                view4.setTag(a0Var3);
            } else {
                a0Var3 = (ts3.a0) view.getTag();
                view4 = view;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) x(i17);
            if (arrayList2.size() >= 2) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                android.view.View view5 = view4;
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c01.ta taVar = (c01.ta) arrayList2.get(0);
                a0Var3.f503155a.setText(k35.m1.f(context, taVar.f119002b, false, false));
                o11.f fVar = new o11.f();
                fVar.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.bgo;
                fVar.f423612c = true;
                fVar.f423629t = true;
                n11.a b17 = n11.a.b();
                java.lang.String str = taVar.f119011k;
                if (str == null) {
                    str = "";
                }
                b17.h(str, a0Var3.f503167m, fVar.a());
                android.widget.TextView textView = a0Var3.f503168n;
                java.lang.String str2 = taVar.f119010j;
                textView.setText(str2 != null ? str2 : "");
                a0Var3.f503168n.getPaint().setFakeBoldText(true);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.i0 i0Var = activityC16956x7944e152.f236597o;
                if (i0Var != null) {
                    a0Var3.f503155a.setTextColor(i0Var.f272399a);
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.i0 i0Var2 = activityC16956x7944e152.f236597o;
                    if (i0Var2.f272400b) {
                        a0Var3.f503155a.setShadowLayer(2.0f, 1.2f, 1.2f, i0Var2.f272401c);
                    } else {
                        a0Var3.f503155a.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    }
                    if (activityC16956x7944e152.f236597o.f272402d) {
                        a0Var3.f503155a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562702mc);
                        a0Var3.f503155a.setPadding(i28, i27, i28, i27);
                    } else {
                        a0Var3.f503155a.setBackgroundColor(0);
                    }
                }
                c01.ta taVar2 = (c01.ta) arrayList2.get(1);
                a0Var3.f503169o.a(taVar, i17, taVar.f());
                a0Var3.f503170p.a(taVar2, i17, taVar.f());
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                android.view.View view6 = view4;
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return view4;
        }
        if (view == null) {
            ts3.a0 a0Var4 = new ts3.a0(this);
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570906cc1, null);
            a0Var4.f503155a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ljh);
            a0Var4.f503162h = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.ljc);
            a0Var4.f503158d = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564969au4);
            a0Var4.f503157c = inflate.findViewById(com.p314xaae8f345.mm.R.id.cks);
            a0Var4.f503165k = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.l3k);
            a0Var4.f503164j = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cle);
            a0Var4.f503156b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lji);
            a0Var4.f503159e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ljg);
            a0Var4.f503160f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ljf);
            a0Var4.f503161g = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568900of5);
            a0Var4.f503163i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.odc);
            a0Var4.f503166l = new java.util.ArrayList();
            inflate.setTag(a0Var4);
            a0Var = a0Var4;
            view2 = inflate;
        } else {
            view2 = view;
            a0Var = (ts3.a0) view.getTag();
        }
        java.util.Iterator it = ((java.util.ArrayList) a0Var.f503166l).iterator();
        while (it.hasNext()) {
            a0Var.f503162h.removeView(((ts3.z) it.next()).f503240a);
        }
        ((java.util.ArrayList) a0Var.f503166l).clear();
        java.util.List x17 = x(i17);
        java.util.ArrayList arrayList5 = (java.util.ArrayList) x17;
        if (arrayList5.size() > 0) {
            int size = arrayList5.size();
            c01.ta taVar3 = (c01.ta) arrayList5.get(0);
            a0Var.f503155a.setText(k35.m1.f(context, taVar3.f119002b, false, false));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.i0 i0Var3 = activityC16956x7944e152.f236597o;
            if (i0Var3 != null) {
                a0Var.f503155a.setTextColor(i0Var3.f272399a);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.i0 i0Var4 = activityC16956x7944e152.f236597o;
                if (i0Var4.f272400b) {
                    a0Var.f503155a.setShadowLayer(2.0f, 1.2f, 1.2f, i0Var4.f272401c);
                } else {
                    a0Var.f503155a.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                if (activityC16956x7944e152.f236597o.f272402d) {
                    a0Var.f503155a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562702mc);
                    a0Var.f503155a.setPadding(i28, i27, i28, i27);
                } else {
                    a0Var.f503155a.setBackgroundColor(0);
                }
            }
            arrayList = arrayList5;
            a0Var2 = a0Var;
            a0Var2.f503161g.setOnClickListener(activityC16956x7944e152.T6(taVar3, activityC16956x7944e152.f236593h, i17, 0, taVar3.f(), taVar3.f()));
            boolean z18 = size == 1;
            a0Var2.f503156b.setText(taVar3.f());
            a0Var2.f503160f.setText(taVar3.d());
            boolean z19 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(taVar3.c());
            a0Var2.f503163i.b(taVar3.f());
            a0Var2.f503160f.setVisibility((!z18 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(taVar3.d())) ? 8 : 0);
            a0Var2.f503164j.setVisibility(8);
            if (z18) {
                a0Var2.f503165k.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562771o4);
                android.view.View view7 = a0Var2.f503158d;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a0Var2.f503163i.setVisibility(8);
                a0Var2.f503156b.setVisibility(0);
            } else {
                a0Var2.f503165k.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562772o5);
                android.view.View view8 = a0Var2.f503158d;
                int i29 = z19 ? 8 : 0;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList7.add(java.lang.Integer.valueOf(i29));
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a0Var2.f503156b.setVisibility(8);
                a0Var2.f503163i.setVisibility(0);
                a0Var2.f503163i.m84183x1c5c5ff4(activityC16956x7944e152.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560837vk));
                a0Var2.f503163i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
                a0Var2.f503163i.m84162x74f59ea8().setFakeBoldText(true);
            }
            android.widget.ImageView imageView = a0Var2.f503165k;
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i37 = this.f503190v;
            layoutParams.height = i37;
            imageView.setLayoutParams(layoutParams);
            android.view.View view9 = a0Var2.f503157c;
            android.view.ViewGroup.LayoutParams layoutParams2 = view9.getLayoutParams();
            layoutParams2.height = i37;
            view9.setLayoutParams(layoutParams2);
            int i38 = this.f503188t;
            if (z19) {
                android.view.View view10 = a0Var2.f503157c;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.lang.String c17 = taVar3.c();
                android.widget.ImageView imageView2 = a0Var2.f503159e;
                int i39 = this.f503190v;
                ts3.y yVar = new ts3.y(this, z18, a0Var2);
                java.lang.String d17 = m11.n1.d(c17);
                float dimensionPixelSize = imageView2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561766s4);
                int e17 = fq1.e.f347040a.e(activityC16956x7944e152.mo55332x76847179()) - ((int) (com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152.f236588u * 28.0f));
                n11.a b18 = n11.a.b();
                o11.f fVar2 = new o11.f();
                view3 = view2;
                fVar2.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562507gs;
                fVar2.f423611b = true;
                fVar2.D = "2131231349";
                fVar2.f423619j = e17;
                fVar2.f423620k = i39;
                num = 0;
                fVar2.A = new r35.n0(0);
                fVar2.B = new r35.w(0);
                fVar2.f423615f = tv.a.b(d17);
                b18.k(d17, imageView2, fVar2.a(), null, new r35.m0(0, e17, i39, true, false, dimensionPixelSize, yVar));
                android.view.View view11 = a0Var2.f503158d;
                android.graphics.drawable.Drawable drawable = activityC16956x7944e152.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562749nh);
                com.p314xaae8f345.mm.ui.uk.f(drawable, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
                view11.setBackground(drawable);
                a0Var2.f503158d.setPadding(i38, this.f503189u, i38, i38);
                a0Var2.f503165k.setVisibility(0);
                z17 = false;
            } else {
                num = 0;
                view3 = view2;
                android.view.View view12 = a0Var2.f503157c;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view12, arrayList9.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                z17 = false;
                a0Var2.f503156b.setVisibility(0);
                a0Var2.f503160f.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(taVar3.d()) ? 8 : 0);
                if (z18) {
                    a0Var2.f503158d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562759nr);
                } else {
                    a0Var2.f503158d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562757np);
                }
                a0Var2.f503158d.setPadding(i38, i38, i38, i38);
                a0Var2.f503165k.setVisibility(8);
            }
            if (size > 1) {
                int i47 = 1;
                while (true) {
                    i18 = size - 1;
                    if (i47 >= i18) {
                        break;
                    }
                    u(a0Var2, x17, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570910cc5, i47, i17, taVar3.f());
                    i47++;
                }
                u(a0Var2, x17, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570909cc4, i18, i17, taVar3.f());
            }
            zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
            if (m0Var != null) {
                ((yq1.x0) m0Var).e(taVar3.h(), 164, "wx073f4a4daff0abe8", taVar3.f(), taVar3.d(), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, 8);
            }
        } else {
            arrayList = arrayList5;
            z17 = false;
            num = 0;
            view3 = view2;
            a0Var2 = a0Var;
        }
        a0Var2.f503161g.setTag(java.lang.Integer.valueOf(i17));
        a0Var2.f503161g.setTag(com.p314xaae8f345.mm.R.id.ljk, num);
        rl5.r rVar = activityC16956x7944e152.f236599q;
        android.view.View view13 = a0Var2.f503161g;
        ts3.p pVar = new ts3.p(activityC16956x7944e152, arrayList.size() == 1 ? true : z17);
        db5.t4 t4Var = activityC16956x7944e152.f236602t;
        rVar.i(view13, pVar, t4Var);
        java.util.Iterator it6 = ((java.util.ArrayList) a0Var2.f503166l).iterator();
        int i48 = 1;
        while (it6.hasNext()) {
            ts3.z zVar = (ts3.z) it6.next();
            java.util.ArrayList arrayList10 = arrayList;
            c01.ta taVar4 = (c01.ta) arrayList10.get(i48);
            zVar.f503240a.setTag(java.lang.Integer.valueOf(i17));
            int i49 = i48 + 1;
            zVar.f503240a.setTag(com.p314xaae8f345.mm.R.id.ljk, java.lang.Integer.valueOf(i48));
            taVar4.i();
            if (taVar4.f119022v != 5) {
                activityC16956x7944e152.f236599q.i(zVar.f503240a, new ts3.p(activityC16956x7944e152, arrayList10.size() == 1 ? true : z17), t4Var);
            }
            arrayList = arrayList10;
            i48 = i49;
        }
        return view3;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.A;
    }

    @Override // ts3.a, android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        super.onScrollStateChanged(absListView, i17);
        if (absListView == null || i17 != 0) {
            return;
        }
        t(absListView.getFirstVisiblePosition(), absListView.getLastVisiblePosition());
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f503185q = ss3.d0.Di().y0(20);
        s(ss3.d0.Di().u0(this.f503184p, 20));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReaderAppUI", "[resetCursor] cost:%sms showCount:%s totalCount:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(this.f503184p), java.lang.Integer.valueOf(this.f503185q));
        notifyDataSetChanged();
    }

    public void t(int i17, int i18) {
        zq1.m0 m0Var;
        if (i17 <= i18 && (m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class)) != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            while (i17 <= i18) {
                java.util.ArrayList arrayList = (java.util.ArrayList) x(i17 - 1);
                if (arrayList.size() > 0) {
                    linkedList.clear();
                    zq1.i0 w17 = w((c01.ta) arrayList.get(0));
                    if (w17 != null) {
                        w17.f556519d = 4;
                        linkedList.add(w17);
                    }
                    if (linkedList.size() > 0) {
                        ((yq1.x0) m0Var).f(linkedList, 8);
                    }
                    linkedList.size();
                    linkedList.clear();
                    for (int i19 = 1; i19 < arrayList.size(); i19++) {
                        zq1.i0 w18 = w((c01.ta) arrayList.get(i19));
                        if (w18 != null) {
                            w18.f556519d = 5;
                            linkedList.add(w18);
                        }
                    }
                    if (linkedList.size() > 0) {
                        ((yq1.x0) m0Var).f(linkedList, 16);
                    }
                    linkedList.size();
                }
                i17++;
            }
        }
    }

    public void u(ts3.a0 a0Var, java.util.List list, int i17, int i18, int i19, java.lang.String str) {
        java.lang.String f17;
        ts3.z zVar = new ts3.z(this);
        android.view.View inflate = android.view.View.inflate(this.f503183o, i17, null);
        zVar.f503240a = inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152 = this.B;
        if (i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570910cc5) {
            android.graphics.drawable.Drawable drawable = activityC16956x7944e152.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562756no);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16956x7944e152.mo55332x76847179();
            float f18 = com.p314xaae8f345.mm.ui.zk.f294170a;
            android.util.TypedValue typedValue = new android.util.TypedValue();
            mo55332x76847179.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.g_, typedValue, true);
            android.content.res.ColorStateList m9703x441695a2 = b3.l.m9703x441695a2(mo55332x76847179, typedValue.resourceId);
            if (drawable == null) {
                drawable = null;
            } else {
                f3.b.h(drawable, m9703x441695a2);
            }
            inflate.setBackground(drawable);
        } else if (i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570909cc4) {
            android.graphics.drawable.Drawable drawable2 = activityC16956x7944e152.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562755nn);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC16956x7944e152.mo55332x76847179();
            float f19 = com.p314xaae8f345.mm.ui.zk.f294170a;
            android.util.TypedValue typedValue2 = new android.util.TypedValue();
            mo55332x768471792.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.g_, typedValue2, true);
            android.content.res.ColorStateList m9703x441695a22 = b3.l.m9703x441695a2(mo55332x768471792, typedValue2.resourceId);
            if (drawable2 == null) {
                drawable2 = null;
            } else {
                f3.b.h(drawable2, m9703x441695a22);
            }
            inflate.setBackground(drawable2);
        }
        zVar.f503241b = (android.widget.TextView) zVar.f503240a.findViewById(com.p314xaae8f345.mm.R.id.obc);
        zVar.f503243d = (android.widget.ImageView) zVar.f503240a.findViewById(com.p314xaae8f345.mm.R.id.cki);
        zVar.f503242c = zVar.f503240a.findViewById(com.p314xaae8f345.mm.R.id.ckn);
        zVar.f503244e = zVar.f503240a.findViewById(com.p314xaae8f345.mm.R.id.ofy);
        zVar.f503245f = zVar.f503240a.findViewById(com.p314xaae8f345.mm.R.id.chj);
        if (a0Var != null) {
            a0Var.f503162h.addView(zVar.f503240a);
            ((java.util.ArrayList) a0Var.f503166l).add(zVar);
        }
        c01.ta taVar = (c01.ta) list.get(i18);
        int size = list.size();
        int i27 = this.f503188t;
        if (i18 != 1) {
            android.view.View view = zVar.f503244e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c01.ta taVar2 = (c01.ta) list.get(i18 - 1);
            c01.ta taVar3 = (c01.ta) list.get(i18);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(taVar2.c()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(taVar3.c())) {
                android.view.View view2 = zVar.f503244e;
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view2.getLayoutParams();
                layoutParams.rightMargin = i27;
                view2.setLayoutParams(layoutParams);
            } else {
                android.view.View view3 = zVar.f503244e;
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) view3.getLayoutParams();
                layoutParams2.rightMargin = this.f503193y;
                view3.setLayoutParams(layoutParams2);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((c01.ta) list.get(0)).c())) {
            android.view.View view4 = zVar.f503244e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = zVar.f503244e;
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) view5.getLayoutParams();
            layoutParams3.rightMargin = i27;
            view5.setLayoutParams(layoutParams3);
        } else {
            android.view.View view6 = zVar.f503244e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i28 = this.f503187s;
        if (i18 == 1) {
            if (i18 == size - 1) {
                zVar.f503245f.setPadding(0, i27, 0, i27);
            } else {
                zVar.f503245f.setPadding(0, i27, 0, i28);
            }
        } else if (i18 == size - 1) {
            zVar.f503245f.setPadding(0, i28, 0, i27);
        } else {
            zVar.f503245f.setPadding(0, i28, 0, i28);
        }
        taVar.i();
        if (taVar.f119022v == 5) {
            if (!android.text.TextUtils.isEmpty(taVar.f())) {
                taVar.i();
                if (!android.text.TextUtils.isEmpty(taVar.f119024x)) {
                    xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
                    taVar.i();
                    wj.n Ai = ((wj.j0) iVar).Ai(taVar.f119026z);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReaderAppUI", "yuanbao hit scene1 installStatus is " + Ai);
                    if (Ai == wj.n.f527983g) {
                        taVar.i();
                        f17 = taVar.f119024x;
                    } else {
                        f17 = taVar.f();
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReaderAppUI", "yuanbao hit scene2");
            f17 = taVar.f();
            if (android.text.TextUtils.isEmpty(f17)) {
                taVar.i();
                f17 = taVar.f119024x;
            }
        } else {
            f17 = taVar.f();
        }
        java.lang.String str2 = f17;
        zVar.f503241b.setText(str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(taVar.c())) {
            android.view.View view7 = zVar.f503242c;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "dealWithItemNews", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;Ljava/util/List;IIILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "dealWithItemNews", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;Ljava/util/List;IIILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            zVar.f503243d.setVisibility(0);
            java.lang.String c17 = taVar.c();
            android.widget.ImageView imageView = zVar.f503243d;
            java.lang.String d17 = m11.n1.d(c17);
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f423626q = com.p314xaae8f345.mm.R.C30859x5a72f63.f560349i1;
            fVar.f423611b = true;
            int i29 = this.f503192x;
            fVar.f423619j = i29;
            fVar.f423620k = i29;
            fVar.A = new r35.n0(0);
            fVar.B = new r35.w(0);
            fVar.f423615f = tv.a.b(d17);
            b17.k(d17, imageView, fVar.a(), null, new r35.m0(0, 0, null, null));
        }
        zVar.f503240a.setOnClickListener(activityC16956x7944e152.T6(taVar, activityC16956x7944e152.f236593h, i19, i18, str, str2));
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        if (m0Var != null) {
            ((yq1.x0) m0Var).e(taVar.h(), 164, "wx073f4a4daff0abe8", taVar.f(), taVar.d(), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, 16);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public java.lang.String getItem(int i17) {
        return (java.lang.String) super.getItem(i17);
    }

    public final zq1.i0 w(c01.ta taVar) {
        if (taVar == null) {
            return null;
        }
        zq1.i0 i0Var = new zq1.i0();
        i0Var.f556516a = taVar.h();
        i0Var.f556518c = 164;
        i0Var.f556520e = "wx073f4a4daff0abe8";
        i0Var.f556521f = taVar.f();
        i0Var.f556522g = taVar.d();
        i0Var.f556523h = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7;
        return i0Var;
    }

    public java.util.List x(int i17) {
        return ss3.d0.Di().z0(getItem(i17), 20);
    }
}
