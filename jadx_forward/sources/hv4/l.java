package hv4;

/* loaded from: classes8.dex */
public final class l extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final r45.ck6 f366841f;

    /* renamed from: g, reason: collision with root package name */
    public final hv4.a f366842g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f366843h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f366844i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f366845m;

    /* renamed from: n, reason: collision with root package name */
    public hv4.n f366846n;

    /* renamed from: o, reason: collision with root package name */
    public hv4.o f366847o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f366848p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, r45.ck6 homeContext, hv4.a listener) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576086pz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(homeContext, "homeContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f366841f = homeContext;
        this.f366842g = listener;
        this.f366843h = "MicroMsg.WebSearch.TagSearchDialog";
    }

    public final void D(r45.sn3 shareContent, android.graphics.Bitmap bitmap, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSearchShare BusinessType:");
        sb6.append(shareContent.f467389d.f461486g);
        sb6.append(" SubType:");
        sb6.append(shareContent.f467389d.f461487h);
        sb6.append(" BrandFeed:");
        sb6.append(shareContent.f467390e != null);
        sb6.append(" WeappFeed:");
        sb6.append(shareContent.f467392g != null);
        sb6.append(" WeappProfile:");
        sb6.append(shareContent.f467393h != null);
        sb6.append(" BrandProfile:");
        sb6.append(shareContent.f467391f != null);
        sb6.append(" FinderFeed:");
        sb6.append(shareContent.f467395m != null);
        sb6.append(" FinderProfile:");
        sb6.append(shareContent.f467394i != null);
        sb6.append(" Emoticon:");
        sb6.append(shareContent.f467396n != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f366843h, sb6.toString());
        pm0.v.X(new hv4.g(this, shareContent, bitmap, str));
    }

    public final void E(r45.sn3 shareContent, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f366848p;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f366842g.b(shareContent);
        dismiss();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7062x716a67f3 c7062x716a67f3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7062x716a67f3();
        c7062x716a67f3.f143702e = c01.id.e();
        c7062x716a67f3.f143701d = 2L;
        c7062x716a67f3.f143703f = 2L;
        if (str == null) {
            str = "";
        }
        c7062x716a67f3.f143704g = c7062x716a67f3.b("ResultQuery", str, true);
        r45.ck6 ck6Var = this.f366841f;
        c7062x716a67f3.f143705h = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(ck6Var.f453163o) ? 2L : 1L;
        c7062x716a67f3.f143706i = c7062x716a67f3.b("ShareSceneId", ck6Var.f453163o, true);
        java.lang.String str2 = shareContent.f467389d.f461483d;
        if (str2 == null) {
            str2 = "";
        }
        c7062x716a67f3.f143707j = c7062x716a67f3.b("ShareSessionId", str2, true);
        java.lang.String str3 = shareContent.f467389d.f461484e;
        if (str3 == null) {
            str3 = "";
        }
        c7062x716a67f3.f143708k = c7062x716a67f3.b("ShareSearchId", str3, true);
        java.lang.String str4 = shareContent.f467389d.f461485f;
        if (str4 == null) {
            str4 = "";
        }
        c7062x716a67f3.f143709l = c7062x716a67f3.b("ShareRequestId", str4, true);
        java.lang.String str5 = shareContent.f467389d.f461488i;
        c7062x716a67f3.f143710m = c7062x716a67f3.b("ShareDocId", str5 != null ? str5 : "", true);
        r45.lx5 lx5Var = shareContent.f467389d;
        c7062x716a67f3.f143712o = lx5Var.f461487h;
        c7062x716a67f3.f143711n = lx5Var.f461486g;
        c7062x716a67f3.k();
        su4.k3.m(c7062x716a67f3);
    }

    public final void F(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        if (this.f366848p == null) {
            this.f366848p = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(getContext(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, new hv4.h(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f366848p;
        if (u3Var == null || u3Var.isShowing()) {
            return;
        }
        u3Var.show();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        android.view.View findViewById;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator rotation;
        android.view.ViewPropertyAnimator duration;
        android.widget.TextView textView;
        if (!this.f366845m) {
            dismiss();
            return;
        }
        android.view.View view = this.f366844i;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odf)) != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jo6);
        }
        android.view.View view2 = this.f366844i;
        if (view2 != null && (findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2)) != null && (animate = findViewById.animate()) != null && (rotation = animate.rotation(0.0f)) != null && (duration = rotation.setDuration(200L)) != null) {
            duration.start();
        }
        hv4.o oVar = this.f366847o;
        if (oVar != null) {
            oVar.f366862g.animate().translationX(i65.a.B(oVar.H())).setDuration(300L).start();
        }
        this.f366845m = false;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxl, (android.view.ViewGroup) null);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.f565753df2).setOnTouchListener(new hv4.c(this));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).setOnClickListener(new hv4.d(this));
        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.meb)).setOnClickListener(new hv4.e(inflate));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf)).setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz) * i65.a.m(getContext()));
        this.f366846n = new hv4.n(this, this.f366841f, this.f366842g, inflate);
        setOnDismissListener(new hv4.f(this));
        setCancelable(true);
        this.f366844i = inflate;
    }
}
