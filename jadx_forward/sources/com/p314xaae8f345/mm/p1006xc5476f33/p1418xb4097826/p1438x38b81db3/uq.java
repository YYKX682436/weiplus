package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class uq extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f186264h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570568dg0, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f186264h = "Finder.FinderMsgTingRecommendMusicConvert";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        java.lang.String str;
        so2.f4 item = (so2.f4) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        dm.pd pdVar = item.f491944d;
        mn2.n nVar = new mn2.n(pdVar.f66093xa3f9e12a, null, 2, null);
        holder.p(com.p314xaae8f345.mm.R.id.k3l);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kbq);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f186264h, sb6.toString());
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
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String a18 = item.a();
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f374654e;
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, a18));
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str5 = pdVar.f66079xad49e234;
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str5));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66112x830ccb)) {
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            if (p19 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingRecommendMusicConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgTingRecommendMusicConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            if (p27 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p27, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingRecommendMusicConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderMsgTingRecommendMusicConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66116x38e2f75a)) {
                android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str6 = pdVar.f66112x830ccb;
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str6));
            } else {
                android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epv, pdVar.f66116x38e2f75a, pdVar.f66112x830ccb);
                ((ke0.e) xVar4).getClass();
                textView4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string));
            }
        }
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p28, "getView(...)");
        android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.o48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p29, "getView(...)");
        A(pdVar, (android.widget.ImageView) p28, (android.widget.TextView) p29);
        android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.jtf);
        if (p37 != null) {
            p37.setTag(com.p314xaae8f345.mm.R.id.e79, textView.getText());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = pdVar.f66071x3a790d90;
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str = "";
            }
            p37.setTag(com.p314xaae8f345.mm.R.id.e5k, str);
            java.lang.String str7 = pdVar.f66079xad49e234;
            if (str7 == null) {
                str7 = "";
            }
            p37.setTag(com.p314xaae8f345.mm.R.id.f565951e75, str7);
            java.lang.String str8 = pdVar.f66112x830ccb;
            if (str8 == null) {
                str8 = "";
            }
            p37.setTag(com.p314xaae8f345.mm.R.id.e77, str8);
            java.lang.String str9 = pdVar.f66116x38e2f75a;
            p37.setTag(com.p314xaae8f345.mm.R.id.e7f, str9 != null ? str9 : "");
        }
    }
}
