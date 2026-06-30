package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class r7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 f185982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f185983f;

    public r7(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var, boolean[] zArr) {
        this.f185981d = s0Var;
        this.f185982e = s7Var;
        this.f185983f = zArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f185981d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.a_z);
        so2.y0 y0Var = (so2.y0) s0Var.f374658i;
        nv2.h1 h1Var = nv2.n1.f422083g;
        nv2.n1 n1Var = nv2.n1.f422084h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var = this.f185982e;
        boolean i17 = n1Var.i(s7Var.f186061e.z0().f66939xc8a07680, y0Var.f492236d, s7Var.f186061e.W());
        if (s7Var.f186061e.h0()) {
            if (i17) {
                db5.t7.m123882x26a183b(s0Var.f374654e, com.p314xaae8f345.mm.R.C30867xcad56011.m7l, 0).show();
            } else {
                db5.t7.m123882x26a183b(s0Var.f374654e, com.p314xaae8f345.mm.R.C30867xcad56011.m7j, 0).show();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z18 = !i17;
        if (z18) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79758xc84e73d5);
            c22699x3dcdb352.m82040x7541828(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77890x91ab89a5));
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b);
            c22699x3dcdb352.m82040x7541828(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = s7Var.f186061e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        nPresenter.R(c22699x3dcdb352, s0Var.m8183xf806b362());
        int b17 = n1Var.b(s7Var.f186061e.z0().f66939xc8a07680, y0Var.f492236d, s7Var.f186061e.W());
        if (b17 > 0) {
            s0Var.w(com.p314xaae8f345.mm.R.id.f564845aa0, 0);
            s0Var.s(com.p314xaae8f345.mm.R.id.f564845aa0, java.lang.String.valueOf(b17));
        } else {
            s0Var.w(com.p314xaae8f345.mm.R.id.f564845aa0, 8);
            s0Var.s(com.p314xaae8f345.mm.R.id.f564845aa0, "");
        }
        if (z18) {
            ((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f564845aa0)).setTextColor(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        } else {
            ((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f564845aa0)).setTextColor(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aju));
        }
        if (z18) {
            z17 = false;
            str = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$3";
            str2 = "android/view/View$OnClickListener";
            uw2.h0.o(uw2.h0.f513207a, c22699x3dcdb352, 0L, 2, null);
            hc2.f1.d(c22699x3dcdb352);
        } else {
            z17 = false;
            str = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$3";
            str2 = "android/view/View$OnClickListener";
        }
        if (z18) {
            boolean[] zArr = this.f185983f;
            if (zArr[z17 ? 1 : 0]) {
                zArr[z17 ? 1 : 0] = z17;
            } else {
                fo3.s sVar = fo3.s.INSTANCE;
                sVar.Z7("ce_feed_comment_like", "<FeedCommentLike>");
                sVar.H2("ce_feed_comment_like", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_feed_comment_like");
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(s0Var.p(com.p314xaae8f345.mm.R.id.a_z), "finder_feed_second_comment_awesome_iv");
        view.setTag(com.p314xaae8f345.mm.R.id.e5w, java.lang.Boolean.valueOf(z18));
        view.setTag(com.p314xaae8f345.mm.R.id.f565941e61, java.lang.Integer.valueOf(b17));
        yj0.a.h(this, str, str2, "onClick", "(Landroid/view/View;)V");
    }
}
