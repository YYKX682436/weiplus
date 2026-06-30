package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wj0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xj0 f196484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f196485e;

    public wj0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xj0 xj0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var) {
        this.f196484d = xj0Var;
        this.f196485e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        pk2.o9 o9Var;
        pk2.d9 d9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorOnlyAudioModePlugin$showNetWorkHalf$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.X1;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "4");
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        ml2.r0.hj(r0Var, b4Var, r26.i0.t(gVar2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xj0 xj0Var = this.f196484d;
        java.util.List list = ((mm2.o4) xj0Var.P0(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) xj0Var.P0(mm2.c1.class)).m8())) {
                        break;
                    }
                }
            }
        }
        boolean z17 = obj != null;
        boolean E7 = ((mm2.o4) xj0Var.P0(mm2.o4.class)).E7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "showCustomerVideoLevel linking:" + z17 + ",linkWait:" + E7);
        if (z17 || E7) {
            db5.t7.b(xj0Var.f446856d.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egv));
        } else {
            boolean z18 = ((mm2.c1) xj0Var.P0(mm2.c1.class)).V4 != 0;
            boolean m40080x23b734ff = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (z18 || !m40080x23b734ff) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "anchor pause live:" + z18 + ",networkEnable:" + m40080x23b734ff + '!');
                db5.t7.b(xj0Var.f446856d.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egu));
            } else {
                kn0.r c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx.f202011f.c(z17);
                df2.ox oxVar = (df2.ox) xj0Var.U0(df2.ox.class);
                if (oxVar != null && (o9Var = oxVar.f312549q) != null && (d9Var = o9Var.f437615f) != null) {
                    if (d9Var.f437200j == null) {
                        android.content.Context context = xj0Var.f446856d.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        d9Var.f437200j = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx(context, xj0Var.S0());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar = d9Var.f437200j;
                    if (yxVar != null) {
                        yxVar.f202015d = c18;
                    }
                    if (yxVar != null) {
                        yxVar.b(xj0Var.x0(), 2);
                    }
                }
            }
        }
        this.f196485e.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorOnlyAudioModePlugin$showNetWorkHalf$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
