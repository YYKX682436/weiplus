package hr3;

/* loaded from: classes11.dex */
public final class ld extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 f365299d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f365300e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f365301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final boolean O6(java.lang.String phone) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phone, "phone");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = this.f365299d;
        if (c19645x574159e9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editPhoneNumberView");
            throw null;
        }
        if (!c19645x574159e9.f()) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e92 = this.f365299d;
        if (c19645x574159e92 != null) {
            c19645x574159e92.c(phone, false, false);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editPhoneNumberView");
        throw null;
    }

    public final void P6(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.util.ArrayList Q6 = Q6();
        if (z3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1()) || Q6.size() == 0) {
            return;
        }
        java.lang.String d17 = z3Var.d1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = Q6.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (aq1.e.d(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiAddPhoneUIC", "no phone after check");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(d17, true);
        if (n17 == null || ((int) n17.E2) <= 0 || !n17.r2()) {
            return;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p670x38b72420.a.a(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiAddPhoneUIC", "[dealModPhoneNumberList] username:%s %s", d17, a17);
        z3Var.a3(a17);
        com.p314xaae8f345.mm.p670x38b72420.a.d(z3Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(z3Var);
    }

    public final java.util.ArrayList Q6() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = this.f365299d;
        if (c19645x574159e9 != null) {
            java.util.ArrayList<java.lang.String> m75370xcd47ad5f = c19645x574159e9.m75370xcd47ad5f();
            return m75370xcd47ad5f == null ? new java.util.ArrayList() : m75370xcd47ad5f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editPhoneNumberView");
        throw null;
    }

    public final r45.c85 R6() {
        r45.c85 c85Var = new r45.c85();
        java.util.Iterator it = Q6().iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (aq1.e.d(str)) {
                r45.b85 b85Var = new r45.b85();
                b85Var.f452164d = str;
                c85Var.f452907e.add(b85Var);
            }
        }
        c85Var.f452906d = c85Var.f452907e.size();
        return c85Var;
    }

    public final void S6() {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f567494jp2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        this.f365299d = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) mo144222x4ff8c0f0;
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.upz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f02, "findViewById(...)");
        this.f365300e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) mo144222x4ff8c0f02;
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jcz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f03, "findViewById(...)");
        this.f365301f = (android.widget.TextView) mo144222x4ff8c0f03;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = this.f365299d;
        if (c19645x574159e9 != null) {
            c19645x574159e9.f271342m = new hr3.kd(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editPhoneNumberView");
            throw null;
        }
    }

    public final void T6(java.lang.String str, java.lang.String str2) {
        jz5.f0 f0Var;
        int i17;
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f567495uh2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiAddPhoneUIC", "showAddPhoneWidget", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/profile/ui/SayHiAddPhoneUIC", "showAddPhoneWidget", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i18 = 1;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = this.f365299d;
            if (c19645x574159e9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editPhoneNumberView");
                throw null;
            }
            c19645x574159e9.f271345d = n17;
            java.lang.String str3 = n17.E1;
            c19645x574159e9.f271337e = str2;
            c19645x574159e9.f271338f = str3;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                i17 = 0;
            } else {
                c19645x574159e9.b(c19645x574159e9.f271337e, true, false);
                i17 = 1;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19645x574159e9.f271338f)) {
                java.lang.String[] c17 = com.p314xaae8f345.mm.p670x38b72420.a.c(c19645x574159e9.f271345d, c19645x574159e9.f271338f);
                c19645x574159e9.f271339g = c17;
                if (c17 != null) {
                    int i19 = i17;
                    while (true) {
                        java.lang.String[] strArr = c19645x574159e9.f271339g;
                        if (i19 >= strArr.length + i17) {
                            break;
                        }
                        c19645x574159e9.b(strArr[i19 - i17].trim(), false, false);
                        i19++;
                    }
                    i17 = i19;
                }
            }
            if (i17 < 5) {
                c19645x574159e9.g();
            } else {
                c19645x574159e9.d();
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e92 = this.f365299d;
            if (c19645x574159e92 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editPhoneNumberView");
                throw null;
            }
            c19645x574159e92.f271337e = str2;
            c19645x574159e92.f271338f = "";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                i18 = 0;
            } else {
                c19645x574159e92.b(c19645x574159e92.f271337e, true, false);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19645x574159e92.f271338f)) {
                java.lang.String[] c18 = com.p314xaae8f345.mm.p670x38b72420.a.c(c19645x574159e92.f271345d, c19645x574159e92.f271338f);
                c19645x574159e92.f271339g = c18;
                if (c18 != null) {
                    int i27 = i18;
                    while (true) {
                        java.lang.String[] strArr2 = c19645x574159e92.f271339g;
                        if (i27 >= strArr2.length + i18) {
                            break;
                        }
                        c19645x574159e92.b(strArr2[i27 - i18].trim(), false, false);
                        i27++;
                    }
                    i18 = i27;
                }
            }
            if (i18 < 5) {
                c19645x574159e92.g();
            } else {
                c19645x574159e92.d();
            }
        }
    }
}
