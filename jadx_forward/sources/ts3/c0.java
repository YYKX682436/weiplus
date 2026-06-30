package ts3;

/* loaded from: classes9.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f503174a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f503175b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f503176c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f503177d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f503178e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f503179f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f503180g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ts3.d0 f503181h;

    public c0(ts3.d0 d0Var) {
        this.f503181h = d0Var;
    }

    public void a(c01.ta taVar, int i17, java.lang.String str) {
        ts3.d0 d0Var = this.f503181h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152 = d0Var.B;
        android.view.View.OnClickListener T6 = activityC16956x7944e152.T6(taVar, activityC16956x7944e152.f236593h, i17, 0, str, str);
        android.view.View view = this.f503174a;
        if (view == null) {
            return;
        }
        view.setOnClickListener(T6);
        this.f503174a.setTag(java.lang.Integer.valueOf(i17));
        this.f503174a.setTag(com.p314xaae8f345.mm.R.id.ljk, java.lang.Integer.valueOf(i17));
        taVar.i();
        int i18 = taVar.f119022v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e1522 = d0Var.B;
        if (i18 != 5) {
            activityC16956x7944e1522.f236599q.i(this.f503174a, new ts3.p(activityC16956x7944e1522, false), activityC16956x7944e1522.f236602t);
        }
        this.f503179f.b(taVar.f());
        taVar.i();
        java.lang.String d17 = ot0.g0.d(taVar.f119020t);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            android.view.View view2 = this.f503175b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f503180g.setText(d17);
            android.view.View view3 = this.f503175b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f503179f.m84183x1c5c5ff4(activityC16956x7944e1522.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560837vk));
        this.f503176c.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
        int textSize = (int) (this.f503180g.getTextSize() * 1.7d);
        android.view.ViewGroup.LayoutParams layoutParams = this.f503178e.getLayoutParams();
        layoutParams.height = textSize;
        layoutParams.width = textSize;
        this.f503178e.setLayoutParams(layoutParams);
        android.widget.ImageView imageView = this.f503177d;
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int i19 = d0Var.f503191w;
        layoutParams2.height = i19;
        imageView.setLayoutParams(layoutParams2);
        java.lang.String c17 = taVar.c();
        android.widget.ImageView imageView2 = this.f503177d;
        ts3.b0 b0Var = new ts3.b0(this);
        java.lang.String d18 = m11.n1.d(c17);
        int e17 = (int) ((fq1.e.f347040a.e(activityC16956x7944e1522.mo55332x76847179()) - (com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152.f236588u * 52.0f)) / 2.0f);
        float dimensionPixelSize = imageView2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a8y);
        n11.a b17 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562508gt;
        fVar.f423611b = true;
        fVar.D = "reader_weishi";
        fVar.f423619j = e17;
        fVar.f423620k = i19;
        fVar.A = new r35.n0(0);
        fVar.B = new r35.w(0);
        fVar.f423615f = tv.a.b(d18);
        b17.k(d18, imageView2, fVar.a(), null, new r35.m0(0, e17, d0Var.f503191w, true, true, dimensionPixelSize, b0Var));
    }

    public void b() {
        android.view.View view = this.f503174a;
        if (view == null) {
            return;
        }
        this.f503177d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.pkz);
        this.f503179f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) this.f503174a.findViewById(com.p314xaae8f345.mm.R.id.odc);
        this.f503180g = (android.widget.TextView) this.f503174a.findViewById(com.p314xaae8f345.mm.R.id.oxt);
        this.f503178e = (android.widget.ImageView) this.f503174a.findViewById(com.p314xaae8f345.mm.R.id.kwn);
        this.f503175b = this.f503174a.findViewById(com.p314xaae8f345.mm.R.id.kxc);
        this.f503176c = this.f503174a.findViewById(com.p314xaae8f345.mm.R.id.pkw);
    }
}
