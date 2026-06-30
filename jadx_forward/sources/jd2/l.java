package jd2;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44.C14139x4d2f44c5 f380691d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44.C14139x4d2f44c5 c14139x4d2f44c5) {
        this.f380691d = c14139x4d2f44c5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleView$updateData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jd2.m mVar = this.f380691d.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (mVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dm dmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dm) mVar;
            cd2.c cVar = dmVar.f184699c.f122188d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.em emVar = dmVar.f184697a;
            emVar.getClass();
            ya2.b2 b17 = ya2.h.f542017a.b(cVar.q());
            in5.s0 s0Var = dmVar.f184698b;
            if (b17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMsgConvert", "onClickFollowBtn: " + emVar.getClass() + ", username: " + b17.D0() + ", nickname: " + b17.w0(), "isPrivate: " + hc2.s.f(b17));
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.yb.R8((c61.yb) c17, V6, b17.D0(), 1, 0L, false, null, null, 25, 61, null, null, null, null, 7800, null);
                android.content.Context context2 = s0Var.f374654e;
                db5.t7.h(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573186ns2));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
                java.lang.String D0 = b17.D0();
                am.zd zdVar = c5560x6f070be.f135879g;
                zdVar.f90084a = D0;
                zdVar.f90085b = 4;
                zdVar.f90086c = true;
                c5560x6f070be.e();
            }
            android.content.Context context3 = s0Var.f374654e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = context3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context3 : null;
            if (abstractActivityC15087xee12defa == null || (str = java.lang.Integer.valueOf(abstractActivityC15087xee12defa.getD()).toString()) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b18 = b52.b.b();
            long l17 = cVar.l();
            java.lang.String q17 = cVar.q();
            java.lang.String str2 = q17 != null ? q17 : "";
            cl0.g gVar = new cl0.g();
            gVar.h("feedid", pm0.v.u(l17));
            gVar.h("finder_username", str2);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            a4Var.b(str, b18, "person_page_message_page_message_focus", gVar2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleView$updateData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
