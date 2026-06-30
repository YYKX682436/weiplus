package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public abstract class v0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d f192949u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d galleryConfig, int i17) {
        super(context, 0, 0, false, i17, false, 32, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryConfig, "galleryConfig");
        this.f192949u = galleryConfig;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public boolean I() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f188689e.m56393xfb854877()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(a07);
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14149x7d40ca9c.B;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
            sb6.append(a07);
            sb6.append(" id:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            sb6.append(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11());
            sb6.append(", pos:");
            sb6.append(a07);
            sb6.append(", field_localFlag:");
            sb6.append(abstractC14490x69736cb5.getFeedObject().f66940x52c1d072);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGalleryFragment", sb6.toString());
            boolean m59331xcb21161d = abstractC14490x69736cb5.getFeedObject().m59331xcb21161d();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187707d;
            if (!m59331xcb21161d) {
                if (abstractC14490x69736cb5.getFeedObject().m59328xcaae1dc7() && abstractC14490x69736cb5.getFeedObject().m59329x3a06df9f()) {
                    ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                    mv2.f0.f413094a.s(abstractC14490x69736cb5.getFeedObject());
                    return;
                } else {
                    if (abstractC14490x69736cb5.getFeedObject().m59328xcaae1dc7()) {
                        return;
                    }
                    db5.t7.g(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.exj));
                    return;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d dVar = this.f192949u;
            if (dVar.b()) {
                dVar.c(abstractActivityC21394xb3d2c0cf, z().f188689e, a07, this.f187709f);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d dVar2 = this.f192949u;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC21394xb3d2c0cf, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                dVar2.i(abstractActivityC21394xb3d2c0cf, this.f187709f, abstractC14490x69736cb5, z().f188689e.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class), z().f188689e.m56357x44e5026c(), false);
            }
            long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
            boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getMediaType() == 2;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 c6553x54ab9387 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387();
            c6553x54ab9387.q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192884b);
            c6553x54ab9387.f139025e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192885c;
            c6553x54ab9387.f139026f = 2L;
            c6553x54ab9387.p(z17 ? "pic_feed" : "vid_feed");
            c6553x54ab9387.f139028h = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192886d;
            c6553x54ab9387.s("{\"feedid\":\"" + pm0.v.u(mo2128x1ed62e84) + "\"}");
            c6553x54ab9387.r(java.lang.String.valueOf(c01.id.c()));
            c6553x54ab9387.k();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("report");
            sb7.append(22878);
            sb7.append(' ');
            java.lang.String n17 = c6553x54ab9387.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
            sb7.append(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGalleryReportLogic", sb7.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void M() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public boolean S() {
        return this.f187709f == 5;
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f187707d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void r(java.util.ArrayList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.r(data);
        if (this.f192949u.d()) {
            android.widget.TextView textView = (android.widget.TextView) l(com.p314xaae8f345.mm.R.id.dft);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187707d;
            if (textView != null) {
                textView.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
            }
            android.widget.TextView textView2 = (android.widget.TextView) l(com.p314xaae8f345.mm.R.id.m2g);
            if (textView2 != null) {
                textView2.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
            }
            android.widget.TextView textView3 = (android.widget.TextView) l(com.p314xaae8f345.mm.R.id.ili);
            if (textView3 != null) {
                textView3.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.String s(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View t() {
        android.view.View l17 = l(com.p314xaae8f345.mm.R.id.f565762dg3);
        if (l17 instanceof android.view.View) {
            return l17;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x() {
        return this.f192949u.e(this.f187709f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return this.f192949u.f(context, this.f187709f);
    }
}
