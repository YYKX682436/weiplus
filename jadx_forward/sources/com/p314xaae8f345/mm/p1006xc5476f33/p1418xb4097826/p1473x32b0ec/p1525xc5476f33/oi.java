package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class oi extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f195289p;

    /* renamed from: q, reason: collision with root package name */
    public zy2.gc f195290q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oi(android.view.ViewGroup r1, qo0.c r2, r45.qt2 r3, int r4, p3321xbce91901.jvm.p3324x21ffc6bd.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r4 = "root"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            java.lang.String r4 = "statusMonitor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r4)
            r0.<init>(r1, r2, r3)
            r0.f195289p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oi.<init>(android.view.ViewGroup, qo0.c, r45.qt2, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.di.f193825a[status.ordinal()] == 1) {
            if (!((mm2.d) S0().a(mm2.d.class)).f410475f) {
                ya2.b2 b17 = ya2.h.f542017a.b(V0().f390662d.f150075m);
                t1(b17 != null ? b17.m176700xe5e0d2a0() : null, b17 != null ? b17.w0() : "", b17 != null ? b17.f69300x731cac1b : null, ((mm2.c1) S0().a(mm2.c1.class)).U1, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ni(b17, this));
            } else {
                java.lang.String string = this.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfh, ((mm2.d) S0().a(mm2.d.class)).f410477h);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                t1(null, string, null, ((mm2.d) S0().a(mm2.d.class)).f410479m, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mi(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc, int i17, yz5.a aVar) {
        int intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ki kiVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ki(this);
        boolean x07 = x0();
        android.view.ViewGroup viewGroup = this.f446856d;
        if (x07) {
            viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i4f).getLayoutParams().width = viewGroup.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561979y5);
        }
        ((android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i4d)).setImageDrawable(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bhp));
        if (str == null || str.length() == 0) {
            android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i4d);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin", "showGuide", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ILkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin", "showGuide", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ILkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(str, null, 2, null);
            android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i4d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            a17.c(nVar, (android.widget.ImageView) findViewById2, g1Var.h(mn2.f1.f411490h));
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i4h);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = viewGroup.getContext();
        float textSize = ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i4h)).getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize));
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i4j);
        if (c19780xceb4c4dc != null) {
            intValue = java.lang.Integer.valueOf(c19780xceb4c4dc.m76027x1cbb0791() > 0 ? 0 : 8).intValue();
        } else {
            java.lang.Integer num = 8;
            intValue = num.intValue();
        }
        imageView.setVisibility(intValue);
        if (imageView.getVisibility() == 0) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1.f542044a.c(imageView, c19780xceb4c4dc, 0);
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i4e);
        textView2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572927cy4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(i17, false)));
        textView2.setVisibility(i17 > 0 ? 0 : 8);
        ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i4g)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fi(aVar));
        viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i4i).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gi(kiVar));
        android.view.View findViewById3 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        findViewById3.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hi(findViewById3));
        findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ii(this));
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji(this));
        K0(0);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f409579g, null, null, null, null, null, false, 126, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.f409582h, null, null, null, null, null, false, 126, null);
        i95.m c19 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        zy2.zb.I8((zy2.zb) c19, ml2.u1.f409585i, null, null, null, null, null, false, 126, null);
    }
}
