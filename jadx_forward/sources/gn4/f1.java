package gn4;

/* loaded from: classes15.dex */
public class f1 extends gn4.z {
    public android.view.View A1;
    public android.view.View W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ImageView f355146l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f355147p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.TextView f355148p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f355149x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f355150x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f355151y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.ImageView f355152y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.TextView f355153z1;

    @Override // gn4.z, fn4.g
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 b(r45.xn6 xn6Var) {
        float B = i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        float k17 = i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 64);
        float f17 = B / k17;
        float f18 = xn6Var.f471793i / xn6Var.f471794m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVerticalFSVideoContainer", "getScaleType playAreaRatio %.2f videoRatio %.2f playAreaWidth %.2f playAreaHeight %.2f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(B), java.lang.Float.valueOf(k17));
        return f17 <= f18 ? com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN : com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER;
    }

    @Override // gn4.z, fn4.g
    public void d() {
        super.d();
        this.W = findViewById(com.p314xaae8f345.mm.R.id.msx);
        this.f355147p0 = findViewById(com.p314xaae8f345.mm.R.id.jrb);
        this.f355149x0 = findViewById(com.p314xaae8f345.mm.R.id.jqz);
        this.f355151y0 = findViewById(com.p314xaae8f345.mm.R.id.poj);
        this.f355146l1 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.poi);
        this.f355148p1 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.poh);
        this.f355150x1 = findViewById(com.p314xaae8f345.mm.R.id.ne9);
        this.f355152y1 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ne8);
        this.f355153z1 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nec);
        this.A1 = findViewById(com.p314xaae8f345.mm.R.id.ne7);
        this.f355147p0.setOnClickListener(this.I);
        this.f355151y0.setOnClickListener(this.K);
        this.f355150x1.setOnClickListener(this.M);
        this.W.setOnClickListener(this.f355197J);
    }

    @Override // gn4.z, fn4.g
    /* renamed from: getLayoutId */
    public int mo129844x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d1m;
    }

    @Override // gn4.z, fn4.g
    public void p() {
        super.p();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 b17 = b(this.E);
        android.view.ViewGroup.LayoutParams layoutParams = this.f346045g.getLayoutParams();
        if (b17 == com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN) {
            int B = i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            layoutParams.width = B;
            r45.xn6 xn6Var = this.E;
            layoutParams.height = (int) (B / (xn6Var.f471793i / xn6Var.f471794m));
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        this.f346045g.setLayoutParams(layoutParams);
        android.view.View view = this.A1;
        if (view != null && this.f355153z1 != null && this.f355152y1 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f355153z1.setVisibility(8);
            this.f355152y1.setVisibility(8);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.E.f471802t)) {
                this.f355153z1.setText(this.E.f471802t);
                this.f355153z1.setVisibility(0);
                if (fn4.z0.f(this.E)) {
                    android.view.View view2 = this.A1;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.E.C)) {
                    this.f355152y1.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
                } else {
                    n11.a.b().h(this.E.C, this.f355152y1, wm4.u.f528842a);
                }
                this.f355152y1.setVisibility(0);
            }
        }
        if (this.A.H4()) {
            android.view.View view3 = this.f355149x0;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f355147p0;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = this.f355149x0;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f355147p0;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        u();
    }

    @Override // gn4.z
    public void r() {
        this.H = new fn4.h0(getContext(), this, new gn4.e1(this));
    }

    @Override // gn4.z
    public void u() {
        if ((this.E.L & 128) <= 0) {
            android.view.View view = this.f355151y0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f355151y0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.E.R) {
            this.f355146l1.setImageResource(com.p314xaae8f345.mm.R.raw.f81241x228946f);
            this.f355148p1.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9b));
        } else {
            this.f355146l1.setImageResource(com.p314xaae8f345.mm.R.raw.f81242x1effd508);
            this.f355148p1.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        }
        this.f355148p1.setText(wm4.u.p(this.E.X));
    }
}
