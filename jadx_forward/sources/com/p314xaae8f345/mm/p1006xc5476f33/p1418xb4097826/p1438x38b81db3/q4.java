package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 f185848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f185849f;

    public q4(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var, boolean[] zArr) {
        this.f185847d = s0Var;
        this.f185848e = u4Var;
        this.f185849f = zArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        boolean z18;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f185847d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.a_z);
        so2.y0 y0Var = (so2.y0) s0Var.f374658i;
        nv2.h1 h1Var = nv2.n1.f422083g;
        nv2.n1 n1Var = nv2.n1.f422084h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var = this.f185848e;
        boolean i17 = n1Var.i(u4Var.f186203e.z0().f66939xc8a07680, y0Var.f492236d, u4Var.f186203e.W());
        if (u4Var.f186203e.h0()) {
            if (i17) {
                db5.t7.m123882x26a183b(s0Var.f374654e, com.p314xaae8f345.mm.R.C30867xcad56011.m7l, 0).show();
            } else {
                db5.t7.m123882x26a183b(s0Var.f374654e, com.p314xaae8f345.mm.R.C30867xcad56011.m7j, 0).show();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z19 = !i17;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int s17 = u4Var.s(context, z19, u4Var.f186203e);
        c22699x3dcdb352.setImageDrawable(z19 ? com.p314xaae8f345.mm.ui.uk.e(s0Var.f374654e, com.p314xaae8f345.mm.R.raw.f79758xc84e73d5, s17) : com.p314xaae8f345.mm.ui.uk.e(s0Var.f374654e, com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b, s17));
        u4Var.f186203e.R(c22699x3dcdb352, s0Var.m8183xf806b362());
        int b17 = n1Var.b(u4Var.f186203e.z0().f66939xc8a07680, y0Var.f492236d, u4Var.f186203e.W());
        if (b17 > 0) {
            z17 = false;
            s0Var.w(com.p314xaae8f345.mm.R.id.f564845aa0, 0);
            s0Var.s(com.p314xaae8f345.mm.R.id.f564845aa0, java.lang.String.valueOf(b17));
        } else {
            z17 = false;
            s0Var.w(com.p314xaae8f345.mm.R.id.f564845aa0, 8);
            s0Var.s(com.p314xaae8f345.mm.R.id.f564845aa0, "");
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f564845aa0);
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        textView.setTextColor(u4Var.s(context2, z19, u4Var.f186203e));
        if (z19) {
            z18 = z17;
            str = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$3";
            str2 = "android/view/View$OnClickListener";
            uw2.h0.o(uw2.h0.f513207a, c22699x3dcdb352, 0L, 2, null);
            hc2.f1.d(c22699x3dcdb352);
        } else {
            z18 = z17;
            str = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$refreshAwesomeIv$3";
            str2 = "android/view/View$OnClickListener";
        }
        if (z19) {
            boolean[] zArr = this.f185849f;
            if (zArr[z18 ? 1 : 0]) {
                zArr[z18 ? 1 : 0] = z18;
            } else {
                fo3.s sVar = fo3.s.INSTANCE;
                sVar.Z7("ce_feed_comment_like", "<FeedCommentLike>");
                sVar.H2("ce_feed_comment_like", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_feed_comment_like");
            }
        }
        view.setTag(com.p314xaae8f345.mm.R.id.e5w, java.lang.Boolean.valueOf(z19));
        view.setTag(com.p314xaae8f345.mm.R.id.f565941e61, java.lang.Integer.valueOf(b17));
        view.announceForAccessibility(s0Var.f374654e.getString(z19 ? com.p314xaae8f345.mm.R.C30867xcad56011.mgl : com.p314xaae8f345.mm.R.C30867xcad56011.mgm));
        yj0.a.h(this, str, str2, "onClick", "(Landroid/view/View;)V");
    }
}
