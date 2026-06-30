package mx0;

/* loaded from: classes5.dex */
public final class r1 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f413809d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f413810e;

    /* renamed from: f, reason: collision with root package name */
    public final mx0.z f413811f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f413812g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f413813h;

    public r1(android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 imageView, mx0.z controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f413809d = view;
        this.f413810e = imageView;
        this.f413811f = controller;
        view.setOnClickListener(this);
        imageView.m82037xa10c26f6(false);
    }

    public final void a(boolean z17) {
        android.view.View view = this.f413809d;
        view.setContentDescription(view.getContext().getResources().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.mcp : com.p314xaae8f345.mm.R.C30867xcad56011.mci));
        this.f413810e.setImageResource(z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562580cl1 : com.p314xaae8f345.mm.R.C30861xcebc809e.f562581cl2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/MicMutePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.i7(m7Var, null), 3, null);
        if (this.f413813h) {
            mx0.z.i(this.f413811f, !this.f413812g, false, 2, null);
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MicMutePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            mx0.z.i(this.f413811f, false, false, 2, null);
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MicMutePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.View view = this.f413809d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MicMutePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/MicMutePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
