package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class s8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f217402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 f217403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f217406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 f217407i;

    public s8(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 e9Var, android.view.View view, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 db0Var) {
        this.f217402d = c19781xd1c47b87;
        this.f217403e = e9Var;
        this.f217404f = view;
        this.f217405g = s0Var;
        this.f217406h = abstractC14490x69736cb5;
        this.f217407i = db0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb m43708x63ed375e;
        java.lang.String str;
        java.util.LinkedList m75941xfb821914;
        r45.j60 j60Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$beforeShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = this.f217402d;
        if (c19781xd1c47b87.m76062x928789b6() == 2) {
            r45.e60 m76061x92825f2a = c19781xd1c47b87.m76061x92825f2a();
            if (m76061x92825f2a == null || (m75941xfb821914 = m76061x92825f2a.m75941xfb821914(1)) == null || (j60Var = (r45.j60) kz5.n0.Z(m75941xfb821914)) == null) {
                str = null;
            } else {
                java.lang.String m75945x2fec8307 = j60Var.m75945x2fec8307(7);
                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                    java.lang.String m75945x2fec83072 = j60Var.m75945x2fec8307(0);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    java.lang.String m75945x2fec83073 = j60Var.m75945x2fec8307(1);
                    str = m75945x2fec83072.concat(m75945x2fec83073 != null ? m75945x2fec83073 : "");
                } else {
                    java.lang.String m75945x2fec83074 = j60Var.m75945x2fec8307(7);
                    if (m75945x2fec83074 == null) {
                        m75945x2fec83074 = "";
                    }
                    java.lang.String m75945x2fec83075 = j60Var.m75945x2fec8307(8);
                    str = m75945x2fec83074.concat(m75945x2fec83075 != null ? m75945x2fec83075 : "");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 e9Var = this.f217403e;
            long j17 = e9Var.f215754h;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b872 = e9Var.f215756m;
            e9Var.i7("image_popular_comment", "view_clk", j17, c19781xd1c47b872 != null ? c19781xd1c47b872.m76058xa6514d24() : 0L, kz5.c1.l(new jz5.l("media_url", str)));
        } else if (c19781xd1c47b87.m76062x928789b6() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 e9Var2 = this.f217403e;
            long j18 = e9Var2.f215754h;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b873 = e9Var2.f215756m;
            long m76058xa6514d24 = c19781xd1c47b873 != null ? c19781xd1c47b873.m76058xa6514d24() : 0L;
            jz5.l[] lVarArr = new jz5.l[1];
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665) this.f217404f.findViewById(com.p314xaae8f345.mm.R.id.det);
            java.lang.String mo42933xb5885648 = (c15276x168ec665 == null || (m43708x63ed375e = c15276x168ec665.m43708x63ed375e()) == null) ? null : m43708x63ed375e.mo42933xb5885648();
            lVarArr[0] = new jz5.l("emoticon_md5", mo42933xb5885648 != null ? mo42933xb5885648 : "");
            e9Var2.i7("play_finish_big_sticker_bubble", "view_clk", j18, m76058xa6514d24, kz5.c1.l(lVarArr));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f217406h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b874 = this.f217403e.f215756m;
        long m76058xa6514d242 = c19781xd1c47b874 != null ? c19781xd1c47b874.m76058xa6514d24() : 0L;
        in5.s0 s0Var = this.f217405g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = s0Var.f374655f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = f2Var instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) f2Var : null;
        java.lang.Object w07 = c22848x6ddd90cf != null ? c22848x6ddd90cf.w0(s0Var.m8185xcdaf1228()) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe) w07 : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", "jumpFinderComment commentId=" + pm0.v.u(m76058xa6514d242) + ",fullConvert=" + qeVar);
        if (qeVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.E0(qeVar, s0Var, abstractC14490x69736cb5, false, m76058xa6514d242, null, 0, 5, false, 1500L, 0, 2, 692, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0.T6(this.f217403e, this.f217405g, this.f217407i, 0, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$beforeShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
