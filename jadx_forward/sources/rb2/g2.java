package rb2;

/* loaded from: classes10.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f475168f;

    public g2(in5.s0 s0Var, rb2.z2 z2Var, boolean[] zArr) {
        this.f475166d = s0Var;
        this.f475167e = z2Var;
        this.f475168f = zArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        android.graphics.drawable.Drawable e17;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f475166d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.a_z);
        so2.y0 y0Var = (so2.y0) s0Var.f374658i;
        nv2.h1 h1Var = nv2.n1.f422083g;
        nv2.n1 n1Var = nv2.n1.f422084h;
        rb2.z2 z2Var = this.f475167e;
        boolean i17 = n1Var.i(z2Var.f475219e.z0().f66939xc8a07680, y0Var.f492236d, z2Var.f475219e.W());
        if (z2Var.f475219e.h0()) {
            if (i17) {
                android.content.Context context = s0Var.f374654e;
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.m7l);
                e4Var.c();
            } else {
                android.content.Context context2 = s0Var.f374654e;
                int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.m7j);
                e4Var2.c();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = !i17;
        rb2.n0 n0Var = rb2.n0.f475228a;
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        int a17 = n0Var.a(context3, z17, z2Var.f475219e.h0());
        if (z17) {
            str = "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshAwesomeIv$3";
            e17 = com.p314xaae8f345.mm.ui.uk.e(s0Var.f374654e, com.p314xaae8f345.mm.R.raw.f79758xc84e73d5, a17);
        } else {
            str = "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshAwesomeIv$3";
            e17 = com.p314xaae8f345.mm.ui.uk.e(s0Var.f374654e, com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b, a17);
        }
        c22699x3dcdb352.setImageDrawable(e17);
        z2Var.f475219e.R(c22699x3dcdb352, s0Var.m8183xf806b362());
        int b17 = n1Var.b(z2Var.f475219e.z0().f66939xc8a07680, y0Var.f492236d, z2Var.f475219e.W());
        if (b17 > 0) {
            s0Var.w(com.p314xaae8f345.mm.R.id.f564845aa0, 0);
            s0Var.s(com.p314xaae8f345.mm.R.id.f564845aa0, java.lang.String.valueOf(b17));
        } else {
            s0Var.w(com.p314xaae8f345.mm.R.id.f564845aa0, 8);
            s0Var.s(com.p314xaae8f345.mm.R.id.f564845aa0, "");
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f564845aa0);
        android.content.Context context4 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        textView.setTextColor(n0Var.a(context4, z17, z2Var.f475219e.h0()));
        if (z17) {
            str3 = str;
            str2 = "android/view/View$OnClickListener";
            uw2.h0.o(uw2.h0.f513207a, c22699x3dcdb352, 0L, 2, null);
            hc2.f1.d(c22699x3dcdb352);
        } else {
            str2 = "android/view/View$OnClickListener";
            str3 = str;
        }
        if (z17) {
            boolean[] zArr = this.f475168f;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                fo3.s sVar = fo3.s.INSTANCE;
                sVar.Z7("ce_feed_comment_like", "<FeedCommentLike>");
                sVar.H2("ce_feed_comment_like", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_feed_comment_like");
            }
        }
        view.setTag(com.p314xaae8f345.mm.R.id.e5w, java.lang.Boolean.valueOf(z17));
        view.setTag(com.p314xaae8f345.mm.R.id.f565941e61, java.lang.Integer.valueOf(b17));
        view.announceForAccessibility(s0Var.f374654e.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.mgl : com.p314xaae8f345.mm.R.C30867xcad56011.mgm));
        yj0.a.h(this, str3, str2, "onClick", "(Landroid/view/View;)V");
    }
}
