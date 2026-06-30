package br1;

@j95.b
/* loaded from: classes11.dex */
public final class m extends i95.w implements zq1.u {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f23622d = "MicroMsg.BizFansContactHelper";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f23623e = jz5.h.b(new br1.g(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f23624f = jz5.h.b(new br1.j(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f23625g = jz5.h.b(br1.f.f23610d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f23626h = jz5.h.b(br1.d.f23601d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f23627i = jz5.h.b(new br1.i(this));

    public hr1.a Ai(java.lang.String identityName, int i17, int i18) {
        hr1.a y07;
        android.database.Cursor f17;
        boolean z17 = false;
        if (identityName == null || identityName.length() == 0) {
            return null;
        }
        hr1.a aVar = (hr1.a) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f23626h).getValue()).get(identityName);
        if (aVar != null) {
            return aVar;
        }
        if (i17 == 5) {
            if (i18 != 0) {
                nr1.b Ui = yq1.u0.Ui();
                Ui.getClass();
                kotlin.jvm.internal.o.g(identityName, "identityName");
                f17 = Ui.f339137d.f("SELECT *, rowid FROM BizPhotoFansContact WHERE identityName = " + d95.b0.O(identityName), null, 2);
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
                    y07.convertFrom(f17);
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
            kotlin.jvm.internal.o.g(identityName, "identityName");
            f17 = Bi.f283343d.f("SELECT *, rowid FROM BizFansContact WHERE identityName = " + d95.b0.O(identityName), null, 2);
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
                y07.convertFrom(f17);
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
        kotlin.jvm.internal.o.g(oldContact, "oldContact");
        kotlin.jvm.internal.o.g(biz, "biz");
        kotlin.jvm.internal.o.g(getContactCallback, "getContactCallback");
        if (biz.length() == 0) {
            if (i17 == 5) {
                rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
                tk.s[] sVarArr = tk.s.f419870d;
                c17 = ((ox.r) d0Var).Bi(2).c();
            } else {
                rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
                tk.s[] sVarArr2 = tk.s.f419870d;
                c17 = ((ox.r) d0Var2).Bi(1).c();
            }
            str = c17;
        } else {
            str = biz;
        }
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = oldContact.field_identityType;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String str2 = oldContact.field_identityName;
        h0Var.f310123d = str2;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.e(this.f23622d, "getEntireContact error, identityName is null");
            br1.w.c(getContactCallback, false, i17, null, 4, null);
            return;
        }
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        f0Var2.f310116d = f0Var.f310116d == 0 ? 2 : 1;
        com.tencent.wechat.iam.biz.l0 l0Var = com.tencent.wechat.iam.biz.l0.f217758c;
        int i18 = f0Var.f310116d;
        java.lang.Object element = h0Var.f310123d;
        kotlin.jvm.internal.o.f(element, "element");
        l0Var.c(str, i18, jr1.j.e((java.lang.String) element, i17), new br1.e(this, i17, getContactCallback, f0Var, h0Var, oldContact, f0Var2));
    }

    public final java.util.concurrent.ConcurrentHashMap Di() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f23625g).getValue();
    }

    public final br1.y Ni(int i17) {
        return i17 == 5 ? (br1.y) ((jz5.n) this.f23624f).getValue() : (br1.y) ((jz5.n) this.f23623e).getValue();
    }

    public final void Ri(hr1.a aVar, int i17) {
        java.lang.String field_openid = aVar.field_openid;
        kotlin.jvm.internal.o.f(field_openid, "field_openid");
        java.lang.String b17 = jr1.j.b(field_openid, i17);
        java.lang.String str = aVar.field_identityName;
        jz5.g gVar = this.f23626h;
        ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).getValue()).put(b17, aVar);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.d(str);
        concurrentHashMap.put(str, aVar);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(b17);
        ((va3.m0) u45.e.a()).wi(b17);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(str);
        ((va3.m0) u45.e.a()).wi(str);
    }

    public void wi(java.lang.String biz, java.util.List talkers, int i17) {
        kotlin.jvm.internal.o.g(biz, "biz");
        kotlin.jvm.internal.o.g(talkers, "talkers");
        br1.y Ni = Ni(i17);
        Ni.getClass();
        java.util.Iterator it = talkers.iterator();
        while (it.hasNext()) {
            Ni.a((java.lang.String) it.next(), i17, java.lang.Boolean.FALSE);
        }
        Ni.b(biz, i17);
    }
}
