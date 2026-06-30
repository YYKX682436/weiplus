package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ih implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f216276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f216277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f216278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kh f216279g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f216280h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f216281i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f216282m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216283n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f216284o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216285p;

    public ih(boolean[] zArr, yz5.a aVar, android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kh khVar, boolean z17, android.view.View view, android.view.View view2, in5.s0 s0Var, long j17, java.lang.String str) {
        this.f216276d = zArr;
        this.f216277e = aVar;
        this.f216278f = textView;
        this.f216279g = khVar;
        this.f216280h = z17;
        this.f216281i = view;
        this.f216282m = view2;
        this.f216283n = s0Var;
        this.f216284o = j17;
        this.f216285p = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ec2.d e27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f216276d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.Z7("ce_feed_follow", "<FeedFollow>");
            sVar.H2("ce_feed_follow", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_feed_follow");
        }
        this.f216277e.mo152xb9724478();
        android.widget.TextView followTv = this.f216278f;
        followTv.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573807fw4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kh khVar = this.f216279g;
        android.content.res.Resources resources = khVar.m80379x76847179().getResources();
        boolean z17 = this.f216280h;
        followTv.setTextColor(resources.getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a : com.p314xaae8f345.mm.R.C30859x5a72f63.f560785u4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(followTv, "$followTv");
        com.p314xaae8f345.mm.ui.fk.c(followTv);
        android.view.View view2 = this.f216281i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        in5.s0 s0Var = this.f216283n;
        android.graphics.drawable.Drawable drawable = s0Var.f374654e.getDrawable(z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f563175yx : com.p314xaae8f345.mm.R.C30861xcebc809e.f563174yw);
        android.view.View view3 = this.f216282m;
        view3.setBackground(drawable);
        int dimensionPixelOffset = s0Var.f374654e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        view3.setPadding(dimensionPixelOffset, view3.getPaddingTop(), dimensionPixelOffset, view3.getPaddingBottom());
        view3.setOnClickListener(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        hc2.f1.d(view);
        android.app.Activity context = khVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
            e27.a(new ec2.a(25, this.f216284o, this.f216285p));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
