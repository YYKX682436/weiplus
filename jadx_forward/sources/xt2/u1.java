package xt2;

/* loaded from: classes10.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f538570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f538571b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f538572c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f538573d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ScrollView f538574e;

    /* renamed from: f, reason: collision with root package name */
    public int f538575f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f538576g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f538577h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f538578i;

    /* renamed from: j, reason: collision with root package name */
    public r45.s42 f538579j;

    /* renamed from: k, reason: collision with root package name */
    public r45.q42 f538580k;

    public u1(android.content.Context context, long j17, int i17, yz5.l fetchData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fetchData, "fetchData");
        this.f538570a = context;
        this.f538571b = i17;
        this.f538572c = fetchData;
        this.f538577h = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(xt2.u1 r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.u1.a(xt2.u1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(xt2.u1 r17, r45.q42 r18, android.view.View r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.u1.b(xt2.u1, r45.q42, android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(str + str3 + str4);
        if (!(str3 == null || str3.length() == 0)) {
            int L = r26.n0.L(f0Var, str3, 0, false, 6, null);
            f0Var.c(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor(str2)), L, str3.length() + L, 33);
        }
        return f0Var;
    }

    public final java.lang.Object c(android.widget.TextView textView, float f17, float f18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, f18);
        ofFloat.addUpdateListener(new xt2.n1(textView));
        ofFloat.setDuration(125L);
        ofFloat.start();
        ofFloat.addListener(new xt2.o1(nVar));
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f440719d ? j17 : jz5.f0.f384359a;
    }

    public final android.view.View d() {
        android.view.View view = this.f538573d;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(this.f538570a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dsw, (android.view.ViewGroup) null, false);
        this.f538573d = inflate;
        android.widget.ScrollView scrollView = (android.widget.ScrollView) inflate.findViewById(com.p314xaae8f345.mm.R.id.r_1);
        scrollView.setOnTouchListener(xt2.q1.f538494d);
        this.f538574e = scrollView;
        this.f538578i = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.s3v);
        inflate.addOnAttachStateChangeListener(new xt2.r1(this));
        return inflate;
    }

    public final void f(r45.s42 s42Var) {
        java.util.LinkedList m75941xfb821914;
        this.f538579j = s42Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this);
        sb6.append(" set data of size ");
        sb6.append((s42Var == null || (m75941xfb821914 = s42Var.m75941xfb821914(1)) == null) ? null : java.lang.Integer.valueOf(m75941xfb821914.size()));
        sb6.append(", pageType = ");
        sb6.append(this.f538571b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveShoppingAutoScrollCommentView", sb6.toString());
        if (s42Var != null) {
            g();
        }
    }

    public final void g() {
        h();
        android.view.View view = this.f538573d;
        boolean z17 = false;
        if (view != null && view.isAttachedToWindow()) {
            z17 = true;
        }
        int i17 = this.f538571b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveShoppingAutoScrollCommentView", this + " try start scroll when not attached, pageType = " + i17);
            return;
        }
        this.f538575f = -1;
        r45.s42 s42Var = this.f538579j;
        java.util.LinkedList m75941xfb821914 = s42Var != null ? s42Var.m75941xfb821914(1) : null;
        if (m75941xfb821914 == null) {
            return;
        }
        this.f538576g = p3325xe03a0797.p3326xc267989b.l.d(this.f538577h, null, null, new xt2.p1(this, m75941xfb821914, null), 3, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveShoppingAutoScrollCommentView", this + " start job " + this.f538576g + ", pageType = " + i17);
    }

    public final void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveShoppingAutoScrollCommentView", this + " cancel job " + this.f538576g + ", source = " + this.f538571b);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f538576g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }
}
