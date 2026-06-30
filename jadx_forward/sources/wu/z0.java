package wu;

/* loaded from: classes9.dex */
public final class z0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        java.lang.String P;
        java.lang.String k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null || (P = item.f366530e.P()) == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(P);
        z01.z zVar = new z01.z();
        v05.b k18 = cVar.k();
        u05.a aVar = k18 != null ? (u05.a) k18.m75936x14adae67(k18.f513848e + 60) : null;
        zVar.f550725d = aVar;
        zVar.f550726e = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        zVar.f550728g = new wu.x0(this, item);
        if (aVar != null && (k17 = aVar.k()) != null) {
            zVar.f550727f = new wu.y0(k17);
        }
        abstractC11172x705e5905.m48330xfcfee142(zVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String P = item.f366530e.P();
        if (P == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(P);
        v05.b k17 = cVar.k();
        u05.a aVar = k17 != null ? (u05.a) k17.m75936x14adae67(k17.f513848e + 60) : null;
        java.lang.String m167302x6c03c64c = aVar != null ? aVar.m167302x6c03c64c() : null;
        java.lang.String m167298x8010e5e4 = aVar != null ? aVar.m167298x8010e5e4() : null;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(m167302x6c03c64c);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(m167302x6c03c64c, true);
            if (h47 == 0) {
                if (n17 != null && n17.r2()) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(view.getContext());
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(R4 ? 2 : 1, m167302x6c03c64c, m167298x8010e5e4);
                    return;
                }
            }
            if (h47 == 2) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(view.getContext());
                ((qk.s6) gm0.j1.s(qk.s6.class)).U6(R4 ? 2 : 1, m167302x6c03c64c, m167298x8010e5e4);
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", m167302x6c03c64c);
        intent.putExtra("Contact_Alias", aVar != null ? aVar.j() : null);
        intent.putExtra("Contact_Nick", m167298x8010e5e4);
        intent.putExtra("Contact_QuanPin", aVar != null ? aVar.q() : null);
        intent.putExtra("Contact_PyInitial", aVar != null ? aVar.u() : null);
        intent.putExtra("User_From_Fmessage", false);
        intent.putExtra("Contact_Scene", aVar != null ? java.lang.Integer.valueOf(aVar.m167300x7520bed6()) : null);
        intent.putExtra("Contact_FMessageCard", true);
        intent.putExtra("Contact_VUser_Info_Flag", aVar != null ? java.lang.Integer.valueOf(aVar.n()) : null);
        intent.putExtra("Contact_VUser_Info", aVar != null ? aVar.o() : null);
        intent.putExtra("Contact_BrandIconURL", aVar != null ? aVar.k() : null);
        intent.putExtra("Contact_Province", aVar != null ? aVar.m167299x40fe68a6() : null);
        intent.putExtra("Contact_City", aVar != null ? aVar.m167296xfb7e01e1() : null);
        intent.putExtra("Contact_Sex", aVar != null ? java.lang.Integer.valueOf(aVar.m167301xb5886d30()) : null);
        intent.putExtra("Contact_Signature", aVar != null ? aVar.w() : null);
        intent.putExtra("Contact_ShowUserName", false);
        intent.putExtra("Contact_KSnsIFlag", 0);
        j45.l.n(view.getContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 1);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 x17 = ((bf5.a) Ai).x(context);
        x17.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(x17, -2, -2);
    }
}
