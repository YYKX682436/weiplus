package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class g3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f199927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 f199928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.cw1 f199929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var, r45.cw1 cw1Var) {
        super(0);
        this.f199927d = view;
        this.f199928e = h3Var;
        this.f199929f = cw1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.cw1 cw1Var;
        android.view.View view = this.f199927d;
        if (view != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) view.findViewById(com.p314xaae8f345.mm.R.id.a_s);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f564832a85);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.cum);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            com.p314xaae8f345.mm.ui.fk.a(textView);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var = this.f199928e;
            c22628xfde5d61d.setImageDrawable(h3Var.f200045a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bhp));
            r45.cw1 cw1Var2 = this.f199929f;
            if (cw1Var2 != null) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.a().c(new mn2.n(cw1Var2.m75945x2fec8307(3), null, 2, null), c22628xfde5d61d, yo0.i.f545627o.a());
                boolean z17 = true;
                textView.setText(cw1Var2.m75945x2fec8307(1));
                r45.dr2 dr2Var = (r45.dr2) cw1Var2.m75936x14adae67(2);
                textView2.setText(dr2Var != null ? dr2Var.m75945x2fec8307(0) : null);
                r45.dr2 dr2Var2 = (r45.dr2) cw1Var2.m75936x14adae67(2);
                if (dr2Var2 != null) {
                    int m75939xb282bd08 = dr2Var2.m75939xb282bd08(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                    r45.dr2 dr2Var3 = (r45.dr2) cw1Var2.m75936x14adae67(2);
                    java.lang.String m75945x2fec8307 = dr2Var3 != null ? dr2Var3.m75945x2fec8307(2) : null;
                    imageView.setVisibility(0);
                    if (m75939xb282bd08 <= 0) {
                        imageView.setVisibility(8);
                    } else if (m75939xb282bd08 == 1) {
                        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79912xe883d012);
                        } else {
                            g1Var.e().c(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, g1Var.h(mn2.f1.B));
                        }
                    } else if (m75939xb282bd08 == 2) {
                        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79911x8d68c0f4);
                        } else {
                            g1Var.e().c(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, g1Var.h(mn2.f1.B));
                        }
                    } else if (m75939xb282bd08 != 100) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
                r45.dr2 dr2Var4 = (r45.dr2) cw1Var2.m75936x14adae67(2);
                java.lang.String m75945x2fec83072 = dr2Var4 != null ? dr2Var4.m75945x2fec8307(0) : null;
                if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    cw1Var = cw1Var2;
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    cw1Var = cw1Var2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                h3Var.a(view.findViewById(com.p314xaae8f345.mm.R.id.i_f), cw1Var);
                view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f3(cw1Var, h3Var));
            }
        }
        return jz5.f0.f384359a;
    }
}
