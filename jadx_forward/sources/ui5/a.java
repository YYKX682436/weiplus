package ui5;

/* loaded from: classes.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final ri5.j a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String id6, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, int i17, java.lang.String managerHeadDisplay, ui5.b extension) {
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(managerHeadDisplay, "managerHeadDisplay");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extension, "extension");
        si5.e a17 = si5.b.f489858a.a(activity, contact, extension.f509676b, extension.f509677c, extension.f509675a);
        java.lang.String d17 = contact.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        java.lang.CharSequence charSequence = a17.f489862a;
        java.lang.String str = "";
        ri5.j jVar = new ri5.j(id6, i17, d17, charSequence == null ? "" : charSequence, extension, 0, 32, null);
        jVar.n(a17.f489863b);
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        if (b0Var != null) {
            java.lang.String fj6 = ((l41.q2) b0Var).fj(contact.Q0(), contact.G0());
            if (fj6 != null) {
                str = fj6;
            }
        }
        jVar.f477649m = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", contact.Q0())) {
            jVar.f477649m = "@" + ((java.lang.Object) jVar.f477649m);
        }
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) && (m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) activity).m67437x4bd5310()) != null && (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) != null) {
            jVar.f477660x = n0Var.e();
            java.lang.String str2 = jVar.f477644f;
            jVar.f477659w = n0Var.f(str2);
            boolean d18 = n0Var.d(str2);
            jVar.f477658v = d18;
            jVar.f477648l1 = !d18 && n0Var.e(str2);
        }
        jVar.f477652p = managerHeadDisplay;
        jVar.f477653q = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        return jVar;
    }

    public final ri5.j b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String id6, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, int i17, ui5.b extension) {
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extension, "extension");
        si5.a aVar = si5.b.f489858a;
        si5.e a17 = aVar.a(activity, contact, extension.f509676b, extension.f509677c, extension.f509675a);
        java.lang.String d17 = contact.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        java.lang.CharSequence charSequence = a17.f489862a;
        java.lang.String str = "";
        ri5.j jVar = new ri5.j(id6, i17, d17, charSequence == null ? "" : charSequence, extension, 0, 32, null);
        jVar.n(a17.f489863b);
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        if (b0Var != null) {
            java.lang.String fj6 = ((l41.q2) b0Var).fj(contact.Q0(), contact.G0());
            if (fj6 != null) {
                str = fj6;
            }
        }
        jVar.f477649m = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", contact.Q0())) {
            jVar.f477649m = "@" + ((java.lang.Object) jVar.f477649m);
        }
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) && (m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) activity).m67437x4bd5310()) != null && (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) != null) {
            jVar.f477660x = n0Var.e();
            java.lang.String str2 = jVar.f477644f;
            jVar.f477659w = n0Var.f(str2);
            boolean d18 = n0Var.d(str2);
            jVar.f477658v = d18;
            jVar.f477648l1 = !d18 && n0Var.e(str2);
        }
        si5.d c17 = aVar.c(extension.f509679e, contact, extension.f509675a);
        extension.f509679e = c17.f489859a;
        java.lang.String str3 = c17.f489860b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
        extension.f509680f = str3;
        jVar.o(c17.f489861c);
        jVar.f477653q = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        return jVar;
    }

    public final java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.z3 memberContact, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberContact, "memberContact");
        java.lang.String z07 = a3Var != null ? a3Var.z0(memberContact.d1()) : null;
        if (z07 == null) {
            z07 = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            return z07;
        }
        java.lang.String wi6 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(memberContact);
        return wi6 != null ? wi6 : "";
    }
}
