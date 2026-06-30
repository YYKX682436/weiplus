package br1;

@j95.b
/* loaded from: classes11.dex */
public final class m extends i95.w implements zq1.u {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f105155d = "MicroMsg.BizFansContactHelper";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f105156e = jz5.h.b(new br1.g(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f105157f = jz5.h.b(new br1.j(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f105158g = jz5.h.b(br1.f.f105143d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f105159h = jz5.h.b(br1.d.f105134d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f105160i = jz5.h.b(new br1.i(this));

    public hr1.a Ai(java.lang.String identityName, int i17, int i18) {
        hr1.a y07;
        android.database.Cursor f17;
        boolean z17 = false;
        if (identityName == null || identityName.length() == 0) {
            return null;
        }
        hr1.a aVar = (hr1.a) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f105159h).mo141623x754a37bb()).get(identityName);
        if (aVar != null) {
            return aVar;
        }
        if (i17 == 5) {
            if (i18 != 0) {
                nr1.b Ui = yq1.u0.Ui();
                Ui.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(identityName, "identityName");
                f17 = Ui.f420670d.f("SELECT *, rowid FROM BizPhotoFansContact WHERE identityName = " + d95.b0.O(identityName), null, 2);
                if (f17 != null) {
                    try {
                        if (f17.moveToFirst()) {
                            z17 = true;
                        }
                    } finally {
                    }
                }
                if (z17) {
                    y07 = new hr1.a();
                    y07.mo9015xbf5d97fd(f17);
                } else {
                    y07 = null;
                }
                vz5.b.a(f17, null);
            } else {
                y07 = yq1.u0.Ui().y0(identityName);
            }
        } else if (i18 != 0) {
            hr1.c Bi = yq1.u0.Bi();
            Bi.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(identityName, "identityName");
            f17 = Bi.f364876d.f("SELECT *, rowid FROM BizFansContact WHERE identityName = " + d95.b0.O(identityName), null, 2);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        z17 = true;
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (z17) {
                y07 = new hr1.a();
                y07.mo9015xbf5d97fd(f17);
            } else {
                y07 = null;
            }
            vz5.b.a(f17, null);
        } else {
            y07 = yq1.u0.Bi().y0(identityName);
        }
        if (y07 == null) {
            return null;
        }
        Ri(y07, i17);
        return y07;
    }

    public void Bi(int i17, hr1.a oldContact, java.lang.String biz, br1.w getContactCallback) {
        java.lang.String str;
        java.lang.String c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldContact, "oldContact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getContactCallback, "getContactCallback");
        if (biz.length() == 0) {
            if (i17 == 5) {
                rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
                tk.s[] sVarArr = tk.s.f501403d;
                c17 = ((ox.r) d0Var).Bi(2).c();
            } else {
                rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
                tk.s[] sVarArr2 = tk.s.f501403d;
                c17 = ((ox.r) d0Var2).Bi(1).c();
            }
            str = c17;
        } else {
            str = biz;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = oldContact.f66210x4f9943d;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String str2 = oldContact.f66209x4f67f8e;
        h0Var.f391656d = str2;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f105155d, "getEntireContact error, identityName is null");
            br1.w.c(getContactCallback, false, i17, null, 4, null);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var2.f391649d = f0Var.f391649d == 0 ? 2 : 1;
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0 l0Var = com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0.f299291c;
        int i18 = f0Var.f391649d;
        java.lang.Object element = h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
        l0Var.c(str, i18, jr1.j.e((java.lang.String) element, i17), new br1.e(this, i17, getContactCallback, f0Var, h0Var, oldContact, f0Var2));
    }

    public final java.util.concurrent.ConcurrentHashMap Di() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f105158g).mo141623x754a37bb();
    }

    public final br1.y Ni(int i17) {
        return i17 == 5 ? (br1.y) ((jz5.n) this.f105157f).mo141623x754a37bb() : (br1.y) ((jz5.n) this.f105156e).mo141623x754a37bb();
    }

    public final void Ri(hr1.a aVar, int i17) {
        java.lang.String field_openid = aVar.f66213x996f7ca;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_openid, "field_openid");
        java.lang.String b17 = jr1.j.b(field_openid, i17);
        java.lang.String str = aVar.f66209x4f67f8e;
        jz5.g gVar = this.f105159h;
        ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).mo141623x754a37bb()).put(b17, aVar);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        concurrentHashMap.put(str, aVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(b17);
        ((va3.m0) u45.e.a()).wi(b17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(str);
        ((va3.m0) u45.e.a()).wi(str);
    }

    public void wi(java.lang.String biz, java.util.List talkers, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkers, "talkers");
        br1.y Ni = Ni(i17);
        Ni.getClass();
        java.util.Iterator it = talkers.iterator();
        while (it.hasNext()) {
            Ni.a((java.lang.String) it.next(), i17, java.lang.Boolean.FALSE);
        }
        Ni.b(biz, i17);
    }
}
