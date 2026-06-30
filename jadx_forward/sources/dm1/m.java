package dm1;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f323179a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewManager f323180b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f323181c;

    /* renamed from: d, reason: collision with root package name */
    public int f323182d;

    /* renamed from: e, reason: collision with root package name */
    public int f323183e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.Animator f323184f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323185g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323186h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f323187i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f323188j;

    /* renamed from: k, reason: collision with root package name */
    public final l01.r f323189k;

    /* renamed from: l, reason: collision with root package name */
    public dm1.a f323190l;

    /* renamed from: m, reason: collision with root package name */
    public final dm1.c f323191m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f323192n;

    public m(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f323179a = context;
        this.f323182d = 1;
        this.f323185g = "";
        this.f323186h = "";
        this.f323187i = "";
        this.f323189k = new l01.n0();
        this.f323191m = new dm1.c(this);
    }

    public final void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInPopupWindow", "dismissCard() called with: quickHide = " + z17);
        if (!z18) {
            com.p314xaae8f345.mm.app.w.INSTANCE.p(this.f323191m);
        }
        android.view.View view = this.f323181c;
        if (view != null) {
            dm1.f fVar = new dm1.f(this);
            if (z17) {
                fVar.mo152xb9724478();
                return;
            }
            android.animation.Animator animator = this.f323184f;
            if (animator != null) {
                animator.cancel();
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, -this.f323183e);
            ofInt.addUpdateListener(new dm1.d(view, this));
            ofInt.addListener(new dm1.e(fVar));
            ofInt.setDuration(200L);
            ofInt.start();
            this.f323184f = ofInt;
        }
    }

    public final void b(boolean z17, int i17) {
        this.f323182d = i17;
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f323191m);
        android.view.ViewManager viewManager = this.f323180b;
        android.content.Context context = this.f323179a;
        if (viewManager == null) {
            java.lang.Object systemService = context.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f323180b = new dm1.n((android.view.WindowManager) systemService);
        }
        if (this.f323181c == null) {
            if (i17 == 2) {
                this.f323181c = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569684dz4, (android.view.ViewGroup) null, false);
            } else {
                this.f323181c = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569683ik, (android.view.ViewGroup) null, false);
            }
        }
        android.view.View view = this.f323181c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kg6)).setText(this.f323186h);
        android.view.View view2 = this.f323181c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.kg8)).setText(this.f323185g);
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInPopupWindow", "show: avatarUrl = " + this.f323187i);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f323187i)) {
                l01.b bVar = l01.d0.f396294a;
                android.view.View view3 = this.f323181c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
                bVar.b((android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.kfq), this.f323187i, l01.a.h(), this.f323189k);
            }
        }
        android.view.View view4 = this.f323181c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
        view4.findViewById(com.p314xaae8f345.mm.R.id.f566553g91).setOnClickListener(new dm1.g(this));
        android.view.View view5 = this.f323181c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view5);
        view5.findViewById(com.p314xaae8f345.mm.R.id.kfp).setOnClickListener(new dm1.h(this));
        android.view.View view6 = this.f323181c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view6);
        view6.findViewById(com.p314xaae8f345.mm.R.id.f567705kg4).setOnClickListener(new dm1.i(this));
        if (this.f323188j) {
            android.view.View view7 = this.f323181c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view7);
            view7.findViewById(com.p314xaae8f345.mm.R.id.kfp).setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bci));
        } else {
            android.view.View view8 = this.f323181c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view8);
            view8.findViewById(com.p314xaae8f345.mm.R.id.kfp).setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bch));
        }
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = fp.h.c(26) ? 2038 : 2002;
        layoutParams.flags = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f0.f34795x366c91de;
        layoutParams.format = 1;
        layoutParams.packageName = context.getPackageName();
        layoutParams.gravity = 49;
        layoutParams.width = -1;
        layoutParams.height = -2;
        android.view.View view9 = this.f323181c;
        if (view9 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view9, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow", "show", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow", "show", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewManager viewManager2 = this.f323180b;
            if (viewManager2 != null) {
                viewManager2.addView(view9, layoutParams);
            }
            view9.post(new dm1.l(z17, view9, this));
        }
    }
}
