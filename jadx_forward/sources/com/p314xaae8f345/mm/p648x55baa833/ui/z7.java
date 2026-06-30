package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class z7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f146245d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f146246e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View.OnTouchListener f146247f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f146248g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f146249h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f146250i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f146251m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f146252n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f146253o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f146254p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(android.view.View itemView, android.view.View.OnClickListener clickListener, android.view.View.OnLongClickListener longClickListener, android.view.View.OnTouchListener touchListener) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longClickListener, "longClickListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchListener, "touchListener");
        this.f146245d = clickListener;
        this.f146246e = longClickListener;
        this.f146247f = touchListener;
        this.f146248g = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.p7(itemView));
        this.f146249h = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.y7(itemView));
        this.f146250i = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.q7(itemView));
        this.f146251m = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.n7(itemView));
        this.f146252n = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.o7(itemView));
        jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.w7(itemView));
        this.f146253o = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.x7(itemView));
        this.f146254p = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.r7(itemView));
    }

    public static final void i(com.p314xaae8f345.mm.p648x55baa833.ui.z7 z7Var, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5) {
        z7Var.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str2);
        if (str4 == null || str4.length() == 0) {
            intent.putExtra("Contact_RoomNickname", W0.z0(str2));
            str4 = W0.z0(str2);
        }
        if (str4 == null || str4.length() == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(str2);
            str4 = z07 != null ? z07.f66694xdd77ad16 : null;
        }
        if (str4 != null) {
            intent.putExtra("Contact_RemarkName", str4);
        }
        intent.putExtra("key_add_contact_verify_ticket", str5);
        intent.putExtra("Contact_Nick", str3);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", str);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 16);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
            am.au auVar = c6005x8a110b2f.f136299g;
            auVar.f87720a = intent;
            auVar.f87721b = str2;
            c6005x8a110b2f.e();
        }
        if (n17 != null && n17.k2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n17.d1() + ",14");
        }
        if (z17) {
            intent.putExtra("Contact_Scene", 96);
        } else {
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", str);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public final android.widget.Button j() {
        return (android.widget.Button) ((jz5.n) this.f146251m).mo141623x754a37bb();
    }

    public final android.widget.TextView k() {
        return (android.widget.TextView) ((jz5.n) this.f146254p).mo141623x754a37bb();
    }

    public final java.lang.String l(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        if (!(str == null || str.length() == 0)) {
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                dm.w8 w8Var = new dm.w8();
                w8Var.f69018x28d46377 = str;
                w8Var.f69024xd0366ace = str2;
                w8Var.f69019xbd959cfd = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                ((u41.l) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Ai()).y0(w8Var, new java.lang.String[]{"appid", "wordingId", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68});
                if (w8Var.f69023xcf77aa53 != null) {
                    java.lang.String str3 = "＠" + w8Var.f69023xcf77aa53;
                    if (str3 != null) {
                        return str3;
                    }
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(str2);
                com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
                ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                java.lang.String str4 = w8Var.f69019xbd959cfd;
                ((za0.k) b0Var).getClass();
                r1Var.g(new l41.z(str, str4, linkedList, 0));
            }
        }
        return "";
    }
}
