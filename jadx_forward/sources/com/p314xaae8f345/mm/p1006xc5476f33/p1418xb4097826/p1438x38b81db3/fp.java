package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class fp extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp f184937h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f184938i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data, yz5.l lVar) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.eco, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f184937h = data;
        this.f184938i = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yw
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.n3 item, int i17, int i18, boolean z17, java.util.List list) {
        dm.pd pdVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.snn);
        dm.pd pdVar2 = item.f491944d;
        if (p17 == null) {
            pdVar = pdVar2;
        } else if (pdVar2.f66129x2262335f == 39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgBulletConvert", "bullet liked no operateLayout");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            pdVar = pdVar2;
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            pdVar = pdVar2;
            if (pm0.v.z(pdVar.f66082x26b1b2e8, 256)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgBulletConvert", "bullet invalid");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                holder.p(com.p314xaae8f345.mm.R.id.f568175lz3).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dp(this, item));
                android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.i1c);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.i1m);
                boolean z18 = pm0.v.z(pdVar.f66082x26b1b2e8, 128);
                android.content.Context context = holder.f374654e;
                if (z18) {
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79758xc84e73d5);
                    c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                    c22699x3dcdb352.setTag(com.p314xaae8f345.mm.R.id.qco, java.lang.Boolean.TRUE);
                } else {
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b);
                    c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                    c22699x3dcdb352.setTag(com.p314xaae8f345.mm.R.id.qco, java.lang.Boolean.FALSE);
                }
                p18.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ep(c22699x3dcdb352, this, holder, item));
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        int i19 = pdVar.f66082x26b1b2e8;
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.ctl);
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.snn);
        if (!pm0.v.z(i19, 256)) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p19, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p27, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p28, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p28.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(p19, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        so2.n3 item = (so2.n3) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        dm.pd pdVar = item.f491944d;
        mn2.n nVar = new mn2.n(pdVar.f66093xa3f9e12a, null, 2, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        java.lang.String str = pdVar.f66131xdec927b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        sb6.append(str);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgBulletConvert", sb6.toString());
        int i18 = pdVar.f66082x26b1b2e8;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        boolean z18 = true;
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
        java.lang.String str6 = str5 == null ? "" : str5;
        i95.m c17 = i95.n0.c(zy2.s6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c15372x3f906e75.setText(zy2.s6.l6((zy2.s6) c17, str6, (int) c15372x3f906e75.getTextSize(), false, null, 0, false, null, 124, null));
        c15372x3f906e75.setVisibility(0);
        java.lang.CharSequence f213058i = c15372x3f906e75.getF213058i();
        if (f213058i != null && f213058i.length() != 0) {
            z18 = false;
        }
        if (z18) {
            int i27 = pdVar.f66129x2262335f;
            if (i27 == 39) {
                str2 = c15372x3f906e75.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.owp);
            } else if (i27 != 40) {
                c15372x3f906e75.setVisibility(8);
            } else {
                str2 = c15372x3f906e75.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.owr);
            }
            c15372x3f906e75.setText(str2);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66112x830ccb)) {
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.uxr);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.uxr);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p27, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66116x38e2f75a);
            android.content.Context context = holder.f374654e;
            if (K0) {
                android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str7 = pdVar.f66112x830ccb;
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str7));
            } else {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epv, pdVar.f66116x38e2f75a, pdVar.f66112x830ccb);
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string));
            }
        }
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p28, "getView(...)");
        android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.o48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p29, "getView(...)");
        A(pdVar, (android.widget.ImageView) p28, (android.widget.TextView) p29);
    }
}
