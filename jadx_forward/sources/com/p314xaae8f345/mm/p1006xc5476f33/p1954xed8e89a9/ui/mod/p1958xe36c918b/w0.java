package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes11.dex */
public final class w0 extends kr3.t {

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f235678r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f235678r = kz5.p0.f395529d;
    }

    @Override // kr3.t
    public void O6() {
        if (Q6()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.u0(this);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) this.f393013h;
            if (c19645x574159e9 == null) {
                u0Var.mo152xb9724478();
                return;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = this.f393010e;
            if (c21475x81dbaa18 == null) {
                u0Var.mo152xb9724478();
                return;
            }
            java.lang.String m144228x6c03c64c = m144228x6c03c64c();
            if (m144228x6c03c64c == null) {
                u0Var.mo152xb9724478();
                return;
            }
            c21475x81dbaa18.setVisibility(0);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(gc0.p2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((gc0.p2) a17).U6(new gc0.b0(m144228x6c03c64c, null), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.r0(c19645x574159e9), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.s0(c19645x574159e9), c21475x81dbaa18, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.t0(c19645x574159e9, this));
        }
    }

    @Override // kr3.t
    public void P6(xg3.q0 op6, com.p314xaae8f345.mm.p944x882e457a.f cgiBack) {
        java.util.List list;
        r45.c85 c85Var;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        super.P6(op6, cgiBack);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = op6.f535964j;
        r45.qo4 qo4Var = fVar instanceof r45.qo4 ? (r45.qo4) fVar : null;
        if (qo4Var == null || (c85Var = qo4Var.f465682e) == null || (linkedList = c85Var.f452907e) == null) {
            list = kz5.p0.f395529d;
        } else {
            list = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                list.add(((r45.b85) it.next()).f452164d);
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518214g, vg3.b.f518179f, l7(list, this.f235678r), cgiBack.f152149b, kz5.b0.c(m144228x6c03c64c())));
    }

    @Override // kr3.t
    public java.lang.Object R6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return java.lang.Boolean.TRUE;
    }

    @Override // kr3.t
    public java.lang.Object S6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.o0(this, null), interfaceC29045xdcb5ca57);
    }

    @Override // kr3.t
    public void T6(yz5.l onResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onResult, "onResult");
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("contact_add_phone_from_recommend");
        if (stringExtra == null) {
            onResult.mo146xb9724478(0);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "recommend phone: ".concat(stringExtra));
        if (!r26.n0.N(stringExtra)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) this.f393013h;
            java.util.List m75370xcd47ad5f = c19645x574159e9 != null ? c19645x574159e9.m75370xcd47ad5f() : null;
            if (m75370xcd47ad5f == null) {
                m75370xcd47ad5f = kz5.p0.f395529d;
            }
            if (!m75370xcd47ad5f.contains(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "current phone does not contains recommend phone, len: " + m75370xcd47ad5f.size());
                if (m75370xcd47ad5f.size() >= 5) {
                    onResult.mo146xb9724478(-2);
                    return;
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e92 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) this.f393013h;
                if (c19645x574159e92 != null) {
                    c19645x574159e92.c(stringExtra, false, false);
                }
                onResult.mo146xb9724478(1);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "current phone contains recommend phone, len: " + m75370xcd47ad5f.size());
        }
        onResult.mo146xb9724478(0);
    }

    @Override // kr3.t
    public java.lang.String V6() {
        return "ModPhoneUIC";
    }

    @Override // kr3.t
    public xg3.q0 W6() {
        com.p314xaae8f345.mm.p670x38b72420.o U6;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) this.f393013h;
        java.util.ArrayList<java.lang.String> m75370xcd47ad5f = c19645x574159e9 != null ? c19645x574159e9.m75370xcd47ad5f() : null;
        if (m75370xcd47ad5f == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.n0.V(m75370xcd47ad5f));
        if (arrayList.size() > 5 || (U6 = U6()) == null) {
            return null;
        }
        yq3.v vVar = (yq3.v) U6;
        if (!vVar.k()) {
            return null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518214g, vg3.b.f518178e, l7(arrayList, this.f235678r), 0, kz5.b0.c(vVar.h()), 8, null));
        java.lang.String h17 = vVar.h();
        r45.qo4 qo4Var = new r45.qo4();
        qo4Var.f465681d = h17;
        r45.c85 c85Var = new r45.c85();
        c85Var.f452907e = new java.util.LinkedList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (aq1.e.d(str)) {
                r45.b85 b85Var = new r45.b85();
                b85Var.f452164d = str;
                java.util.LinkedList linkedList = c85Var.f452907e;
                if (linkedList != null) {
                    linkedList.add(b85Var);
                }
                arrayList2.add(str);
            }
        }
        c85Var.f452906d = arrayList2.size();
        qo4Var.f465682e = c85Var;
        return new xg3.p0(60, qo4Var);
    }

    @Override // kr3.t
    public lr3.a Y6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.q0(this);
    }

    @Override // kr3.t
    public boolean Z6() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) this.f393013h;
        if (c19645x574159e9 != null) {
            return c19645x574159e9.e();
        }
        return false;
    }

    @Override // kr3.t
    public android.view.View b7(java.lang.String username, com.p314xaae8f345.mm.p670x38b72420.o contact) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2 n2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a;
        this.f235678r = n2Var.j(contact, m158359x1e885992());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9(m158354x19263085());
        c19645x574159e9.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aih);
        yq3.v vVar = (yq3.v) contact;
        c19645x574159e9.f271345d = vVar.f546068f;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("contact_phone_number_by_md5");
        if (stringExtra == null) {
            stringExtra = n2Var.l(contact, m158359x1e885992());
        }
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("contact_phone_number_list");
        if (stringExtra2 == null) {
            stringExtra2 = (java.lang.String) vVar.f546084v.a(vVar, yq3.v.f546062z[3]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "is null phone, mContactPhoneNumberList: %s, mContactPhoneNumberByMD5: %s, ", stringExtra2, stringExtra);
        }
        c19645x574159e9.f271337e = stringExtra;
        c19645x574159e9.f271338f = stringExtra2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            i17 = 0;
        } else {
            i17 = 1;
            c19645x574159e9.b(c19645x574159e9.f271337e, true, false);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19645x574159e9.f271338f)) {
            java.lang.String[] c17 = com.p314xaae8f345.mm.p670x38b72420.a.c(c19645x574159e9.f271345d, c19645x574159e9.f271338f);
            c19645x574159e9.f271339g = c17;
            if (c17 != null) {
                int i18 = i17;
                while (true) {
                    java.lang.String[] strArr = c19645x574159e9.f271339g;
                    if (i18 >= strArr.length + i17) {
                        break;
                    }
                    c19645x574159e9.b(strArr[i18 - i17].trim(), false, false);
                    i18++;
                }
                i17 = i18;
            }
        }
        if (i17 < 5) {
            c19645x574159e9.g();
        } else {
            c19645x574159e9.d();
        }
        c19645x574159e9.f271342m = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.v0(this, contact, c19645x574159e9);
        android.widget.TextView textView = this.f393011f;
        if (textView != null) {
            textView.setText(i65.a.r(m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.f574087gy4));
        }
        android.widget.TextView textView2 = this.f393011f;
        if (textView2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = i65.a.f(m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            }
            textView2.setLayoutParams(marginLayoutParams);
        }
        return c19645x574159e9;
    }

    @Override // kr3.t
    public boolean h7() {
        return !((java.lang.Boolean) ((jz5.n) this.f393018p).mo141623x754a37bb()).booleanValue();
    }

    @Override // kr3.t
    public int i7() {
        return 40;
    }

    @Override // kr3.t
    public int k7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.gxv;
    }

    public final vg3.c l7(java.util.List list, java.util.List list2) {
        java.util.List list3;
        java.util.List list4 = kz5.p0.f395529d;
        if (list != null) {
            java.util.List V = kz5.n0.V(list);
            list3 = new java.util.ArrayList();
            for (java.lang.Object obj : V) {
                if (!r26.n0.N((java.lang.String) obj)) {
                    list3.add(obj);
                }
            }
        } else {
            list3 = list4;
        }
        if (list2 != null) {
            java.util.List V2 = kz5.n0.V(list2);
            list4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : V2) {
                if (!r26.n0.N((java.lang.String) obj2)) {
                    list4.add(obj2);
                }
            }
        }
        return ((list3.isEmpty() ^ true) && list4.isEmpty()) ? vg3.c.A : (list3.isEmpty() && (list4.isEmpty() ^ true)) ? vg3.c.C : ((list3.isEmpty() ^ true) && (list4.isEmpty() ^ true) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(list3, list4)) ? vg3.c.B : vg3.c.A;
    }
}
