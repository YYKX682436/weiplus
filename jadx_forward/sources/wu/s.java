package wu;

/* loaded from: classes9.dex */
public final class s extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null) {
            return;
        }
        z01.j jVar = new z01.j();
        m15.a f17 = vu.a.f(item);
        jVar.f550592d = f17;
        jVar.f550593e = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        jVar.f550595g = new wu.q(this, item);
        java.lang.String w17 = f17.w();
        if (w17 == null || r26.n0.N(w17)) {
            w17 = f17.k();
            if (w17 == null || r26.n0.N(w17)) {
                w17 = f17.l();
            }
        }
        if (w17 != null) {
            jVar.f550594f = new wu.r(w17);
        }
        abstractC11172x705e5905.m48330xfcfee142(jVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 i17 = com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(vu.a.f(item).m126747x696739c());
        java.lang.String str = i17.f277891a;
        java.lang.String str2 = i17.f277892b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionOa.k(view.getContext(), null)) {
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
                boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (h47 == 0) {
                    if (n17 != null && n17.r2()) {
                        ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(view.getContext());
                        ((qk.s6) gm0.j1.s(qk.s6.class)).U6(R4 ? 2 : 1, str, str2);
                        return;
                    }
                }
                if (h47 == 2) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(view.getContext());
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(R4 ? 2 : 1, str, str2);
                    return;
                }
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", i17.f277891a);
            intent.putExtra("Contact_Alias", i17.f277893c);
            intent.putExtra("Contact_Nick", i17.f277892b);
            intent.putExtra("Contact_QuanPin", i17.f277894d);
            intent.putExtra("Contact_PyInitial", i17.f277895e);
            intent.putExtra("Contact_Uin", i17.f277900j);
            intent.putExtra("Contact_Mobile_MD5", i17.f277898h);
            intent.putExtra("Contact_full_Mobile_MD5", i17.f277899i);
            intent.putExtra("Contact_QQNick", i17.g());
            intent.putExtra("User_From_Fmessage", false);
            intent.putExtra("Contact_Scene", i17.f277897g);
            intent.putExtra("Contact_FMessageCard", true);
            intent.putExtra("Contact_RemarkName", i17.f277902l);
            intent.putExtra("Contact_VUser_Info_Flag", i17.f277907q);
            intent.putExtra("Contact_VUser_Info", i17.f277908r);
            intent.putExtra("Contact_BrandIconURL", i17.f277909s);
            intent.putExtra("Contact_Province", i17.f());
            intent.putExtra("Contact_City", i17.b());
            intent.putExtra("Contact_Sex", i17.f277905o);
            intent.putExtra("Contact_Signature", i17.f277906p);
            intent.putExtra("Contact_ShowUserName", false);
            intent.putExtra("Contact_KSnsIFlag", 0);
            j45.l.n(view.getContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 1);
        }
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 i18 = ((bf5.a) Ai).i(context);
        i18.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(i18, -2, -2);
    }
}
