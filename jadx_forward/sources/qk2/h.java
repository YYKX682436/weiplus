package qk2;

/* loaded from: classes3.dex */
public abstract class h extends qk2.f {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f445967g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f445967g = "MoreActionMenuItem";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static void z(qk2.h hVar, int i17, int i18, java.lang.String str, boolean z17, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertRedDot");
        }
        if ((i19 & 2) != 0) {
            i18 = 1;
        }
        if ((i19 & 4) != 0) {
            str = null;
        }
        ?? r76 = z17;
        if ((i19 & 8) != 0) {
            r76 = 1;
        }
        int i27 = hVar.f445961b;
        java.lang.String str2 = i27 != 0 ? i27 != 1 ? i27 != 2 ? "assistant.more" : "audience.more" : "startlive.more" : "anchorlive.bottom.tools";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.f03 f03Var = new r45.f03();
        f03Var.f455420d = i18;
        f03Var.f455424h = 1;
        f03Var.f455425i = hVar.i();
        f03Var.f455426m = str2;
        f03Var.f455433t = r76;
        arrayList.add(f03Var);
        r45.f03 f03Var2 = new r45.f03();
        f03Var2.f455424h = 2;
        f03Var2.f455425i = str2;
        arrayList.add(f03Var2);
        ll2.e.f400666a.i(i17, arrayList, str);
    }

    public final void A() {
        B(this.f445960a);
        qk2.f.f(this, false, 1, null);
    }

    public abstract void B(pk2.o9 o9Var);

    public final void C(android.view.MenuItem menuItem) {
        if (menuItem instanceof db5.h4) {
            this.f445964e = new qk2.g(menuItem);
        }
    }

    public final void r(db5.g4 g4Var, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g4Var, "<this>");
        C(g4Var.b(i17, i18, i19));
    }

    public final void s(db5.g4 g4Var, int i17, java.lang.CharSequence title, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g4Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        C(g4Var.g(i17, title, i18));
    }

    public final void t(db5.g4 g4Var, int i17, java.lang.CharSequence title, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g4Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        C(g4Var.h(i17, title, i18, i19));
    }

    public final void u(db5.g4 g4Var, int i17, java.lang.CharSequence title, int i18, java.lang.CharSequence desc, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g4Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        db5.h4 h4Var = new db5.h4(g4Var.f309879f, i17, 0);
        h4Var.f309901i = title;
        h4Var.setIcon(i18);
        h4Var.f309906q = desc;
        h4Var.f309907r = i19;
        ((java.util.ArrayList) g4Var.f309877d).add(h4Var);
        C(h4Var);
    }

    public abstract void v(pk2.o9 o9Var, db5.g4 g4Var);

    public final void w(db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        if (h() && zl2.r4.F1(this.f445960a.f437607b)) {
            boolean z17 = ((mm2.n0) this.f445960a.f437607b.a(mm2.n0.class)).f410806r;
            if (!r() || z17) {
                java.lang.String str = this.f445967g;
                java.lang.String str2 = "skip add menuItem " + y() + ": blocked by coLive phase1 switch, isInviteeAnchor=" + z17 + ", allowCoLiveInitiator=" + r();
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2, null);
                return;
            }
        }
        if (!re2.b.b(y())) {
            java.lang.String str3 = this.f445967g;
            java.lang.String str4 = "skip add menuItem " + y() + ": blocked by invitee perm gate";
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str4, null);
            return;
        }
        if (o()) {
            v(this.f445960a, menu);
            q();
            if (p() || !(!(this instanceof pk2.m2))) {
                return;
            }
            ll2.e.f400666a.j(i(), false);
            return;
        }
        java.lang.String str5 = this.f445967g;
        java.lang.String str6 = "add menuItem " + y() + " failed, as it is not enabled";
        int i19 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, str6, null);
    }

    public boolean x() {
        return true;
    }

    public abstract int y();
}
