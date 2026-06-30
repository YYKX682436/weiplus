package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ji extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri f200292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri riVar) {
        super(0);
        this.f200292d = riVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ji jiVar;
        r45.qo qoVar;
        jz5.f0 f0Var;
        r45.eq1 eq1Var;
        mm2.n2 n2Var = (mm2.n2) dk2.ef.f314905a.i(mm2.n2.class);
        if (n2Var == null || (eq1Var = n2Var.f410812g) == null) {
            jiVar = this;
            qoVar = null;
        } else {
            qoVar = (r45.qo) eq1Var.m75936x14adae67(7);
            jiVar = this;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri riVar = jiVar.f200292d;
        riVar.getClass();
        android.content.Context context = riVar.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.of ofVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.of(context);
        ofVar.f200834y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mi(riVar);
        ofVar.f200833x = qoVar;
        ofVar.w();
        android.content.Context context2 = ofVar.f199914d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g4 g4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g4) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g4.class);
            g4Var.getClass();
            java.util.ArrayList arrayList = g4Var.f198644d;
            if (!arrayList.contains(ofVar)) {
                arrayList.add(ofVar);
            }
        }
        r45.qo qoVar2 = ofVar.f200833x;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (qoVar2 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = ofVar.f200820h;
            if (c22621x7603e017 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
                throw null;
            }
            boolean z17 = true;
            c22621x7603e017.setText(qoVar2.m75945x2fec8307(1));
            ofVar.f200831v = qoVar2.m75945x2fec8307(2);
            java.lang.String m75945x2fec8307 = qoVar2.m75945x2fec8307(2);
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (z17) {
                android.view.View view = ofVar.f200821i;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goSelectPhotoView");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = ofVar.f200822m;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverContainer");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                mn2.g1 g1Var = mn2.g1.f411508a;
                vo0.d e17 = g1Var.e();
                mn2.q3 q3Var = new mn2.q3(qoVar2.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
                android.widget.ImageView imageView = ofVar.f200823n;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentCoverView");
                    throw null;
                }
                e17.c(q3Var, imageView, g1Var.h(mn2.f1.f411498s));
                android.view.View view3 = ofVar.f200822m;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverContainer");
                    throw null;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = ofVar.f200821i;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goSelectPhotoView");
                    throw null;
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ofVar.f200829t = qoVar2.m75939xb282bd08(3);
            ofVar.f200830u = qoVar2.m75939xb282bd08(0);
            android.widget.TextView textView = ofVar.f200828s;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("visibilityDescTv");
                throw null;
            }
            textView.setText(ofVar.z(ofVar.f200829t));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = ofVar.f200820h;
            if (c22621x7603e0172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
                throw null;
            }
            c22621x7603e0172.setText("");
            android.view.View view5 = ofVar.f200822m;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverContainer");
                throw null;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = ofVar.f200821i;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goSelectPhotoView");
                throw null;
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view6, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = ofVar.f200828s;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("visibilityDescTv");
                throw null;
            }
            textView2.setText(ofVar.z(ofVar.f200829t));
        }
        ofVar.B();
        return f0Var2;
    }
}
