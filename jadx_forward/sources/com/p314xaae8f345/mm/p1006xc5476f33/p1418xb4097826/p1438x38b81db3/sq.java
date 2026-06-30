package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class sq extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f186103h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.b3v, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f186103h = "Finder.FinderMsgThankConvert";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        java.lang.String str;
        so2.q3 item = (so2.q3) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        dm.pd pdVar = item.f491944d;
        mn2.n nVar = new mn2.n(pdVar.f66093xa3f9e12a, null, 2, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        java.lang.String str2 = pdVar.f66131xdec927b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(" nickname ");
        java.lang.String str3 = pdVar.f66106x21f9b213;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(" url ");
        java.lang.String str4 = pdVar.f66093xa3f9e12a;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(" flag ");
        sb6.append(pdVar.f66082x26b1b2e8);
        sb6.append(" content ");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(pdVar.f66079xad49e234));
        sb6.append(" id ");
        sb6.append(pdVar.f66095xc8a07680);
        sb6.append(" time ");
        sb6.append(pdVar.f66080xac3be4e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f186103h, sb6.toString());
        int i18 = pdVar.f66082x26b1b2e8;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i19 == 0 && (i18 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
            l17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411494o));
        } else {
            vo0.d a17 = g1Var.a();
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f411490h));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15372x3f906e75 c15372x3f906e75 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15372x3f906e75) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        java.lang.String str5 = pdVar.f66079xad49e234;
        i95.m c17 = i95.n0.c(zy2.s6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
        c15372x3f906e75.setText(zy2.s6.l6((zy2.s6) c17, str5, (int) c15372x3f906e75.getTextSize(), false, null, 0, false, null, 124, null));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.l())) {
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.o78);
            if (p19 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgThankConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerThank;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgThankConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerThank;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.o78);
            if (p27 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p27, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgThankConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerThank;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderMsgThankConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerThank;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.o78);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p28, "getView(...)");
            android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.o48);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p29, "getView(...)");
            A(pdVar, (android.widget.ImageView) p28, (android.widget.TextView) p29);
        }
        com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q()) {
            com.p314xaae8f345.mm.ui.bk.A();
        }
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.content.Context context = holder.f374654e;
        i65.a.p(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561265dp);
        android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.o78);
        if (p37 != null && p37.getVisibility() == 0) {
            i65.a.p(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561192bw);
        }
        android.view.View p38 = holder.p(com.p314xaae8f345.mm.R.id.jtg);
        if (p38 != null) {
            p38.setTag(com.p314xaae8f345.mm.R.id.e79, item.a());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = pdVar.f66071x3a790d90;
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str = "";
            }
            p38.setTag(com.p314xaae8f345.mm.R.id.e5k, str);
            java.lang.String str7 = pdVar.f66079xad49e234;
            if (str7 == null) {
                str7 = "";
            }
            p38.setTag(com.p314xaae8f345.mm.R.id.f565951e75, str7);
            java.lang.String str8 = pdVar.f66112x830ccb;
            if (str8 == null) {
                str8 = "";
            }
            p38.setTag(com.p314xaae8f345.mm.R.id.e77, str8);
            java.lang.String str9 = pdVar.f66116x38e2f75a;
            p38.setTag(com.p314xaae8f345.mm.R.id.e7f, str9 != null ? str9 : "");
        }
        boolean z18 = item.f491945e;
        android.view.View p39 = holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        r45.xg2 xg2Var = pdVar.f66127xca12e5b3;
        int m75939xb282bd08 = xg2Var != null ? xg2Var.m75939xb282bd08(1) : 0;
        if (z18) {
            if (m75939xb282bd08 == 1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p39);
                ym5.a1.h(p39, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qq(pdVar));
            } else if (m75939xb282bd08 != 3) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p39);
                ym5.a1.h(p39, null);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p39);
                ym5.a1.h(p39, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rq(pdVar));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void s(in5.s0 holder, so2.i iVar) {
        so2.q3 item = (so2.q3) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.s(holder, item);
        z(holder, ym5.x.a(holder.f374654e, 0.0f));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void t(in5.s0 holder, so2.i iVar) {
        so2.q3 item = (so2.q3) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.t(holder, item);
        z(holder, ym5.x.a(holder.f374654e, 12.0f));
    }
}
