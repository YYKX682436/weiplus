package hr3;

/* loaded from: classes11.dex */
public class eb extends hr3.va {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 f365053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668) {
        super(c16861xdcf09668);
        this.f365053f = c16861xdcf09668;
    }

    @Override // hr3.va
    public void f() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365053f;
        iz5.a.g(null, !c01.e2.D(c16861xdcf09668.L.d1()));
        android.view.View view = c16861xdcf09668.f235267x0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = c16861xdcf09668.f235271z1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (c16861xdcf09668.V) {
            c16861xdcf09668.f235264l1.setOnClickListener(new hr3.za(this));
            if (c16861xdcf09668.L.r2()) {
                c16861xdcf09668.f235264l1.setVisibility(0);
            } else {
                c16861xdcf09668.f235264l1.setVisibility(8);
            }
            c16861xdcf09668.C1.setVisibility(8);
            c16861xdcf09668.D1.setVisibility(8);
            c16861xdcf09668.G1.setVisibility(8);
            c16861xdcf09668.E1.setVisibility(8);
            c16861xdcf09668.H1.setVisibility(8);
            return;
        }
        c16861xdcf09668.C1.setOnClickListener(new hr3.ab(this));
        if (c16861xdcf09668.L.r2()) {
            c16861xdcf09668.C1.setVisibility(8);
            c16861xdcf09668.D1.setVisibility(0);
            if (c16861xdcf09668.Q() || c16861xdcf09668.L.d1().equals(c01.z1.r()) || c01.e2.D(c16861xdcf09668.L.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(c16861xdcf09668.L.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(c16861xdcf09668.L.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(c16861xdcf09668.L.d1())) {
                c16861xdcf09668.E1.setVisibility(8);
            } else {
                c16861xdcf09668.E1.setVisibility(0);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
            java.lang.String d17 = c16861xdcf09668.L.d1();
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 k4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17;
            k4Var.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                z17 = false;
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select count(*) from ");
                sb6.append(com.p314xaae8f345.mm.p2621x8fb0427b.k4.a0(d17));
                sb6.append(" where type & 8 !=0 and username=");
                l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
                sb6.append(d95.b0.O(d17));
                android.database.Cursor f17 = k4Var.f276604d.f(sb6.toString(), null, 2);
                z17 = f17.moveToFirst() && f17.getInt(0) > 0;
                f17.close();
            }
            if (z17) {
                c16861xdcf09668.F1.setVisibility(0);
                c16861xdcf09668.N = c16861xdcf09668.L.m43619x2fa78b11();
            }
        } else {
            c16861xdcf09668.C1.setVisibility(0);
            c16861xdcf09668.D1.setVisibility(8);
            c16861xdcf09668.G1.setVisibility(8);
            c16861xdcf09668.E1.setVisibility(8);
        }
        if (c16861xdcf09668.L.o2()) {
            c16861xdcf09668.H1.setVisibility(0);
        } else {
            c16861xdcf09668.H1.setVisibility(8);
        }
    }

    @Override // hr3.va
    public void h() {
        super.h();
    }

    @Override // hr3.va
    public void i() {
        super.i();
    }

    public void m() {
        java.lang.String str;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365053f;
        if (((int) c16861xdcf09668.L.E2) == 0) {
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).i0(c16861xdcf09668.L) != -1) {
                c16861xdcf09668.L = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(c16861xdcf09668.L.d1(), true);
            }
        }
        java.lang.String str2 = "";
        if (c16861xdcf09668.R || (i17 = c16861xdcf09668.N) == 12) {
            long j17 = c16861xdcf09668.S;
            java.lang.String str3 = c16861xdcf09668.T;
            if (j17 != 0 && str3 != null && !str3.equals("")) {
                r61.w1 g17 = m61.k.Ri().g(c16861xdcf09668.S);
                if (g17 == null) {
                    r61.w1 w1Var = new r61.w1();
                    w1Var.f474515e = "";
                    w1Var.f474511a = c16861xdcf09668.S;
                    w1Var.f474521k = c16861xdcf09668.T;
                    w1Var.f474514d = c16861xdcf09668.L.d1();
                    w1Var.f474525o |= 1;
                    r61.x1 Ri = m61.k.Ri();
                    Ri.getClass();
                    w1Var.f474527q = -1;
                    if (((int) Ri.f474531d.l("qqlist", "qq", w1Var.b())) != -1) {
                        Ri.b(2, Ri, "" + w1Var.f474511a);
                    }
                } else {
                    g17.f474511a = c16861xdcf09668.S;
                    g17.f474521k = c16861xdcf09668.T;
                    g17.f474514d = c16861xdcf09668.L.d1();
                    g17.f474525o |= 1;
                    m61.k.Ri().i(c16861xdcf09668.S, g17);
                }
            }
        } else if (i17 == 58 || i17 == 59 || i17 == 60) {
            m61.k.Di().P0(c16861xdcf09668.L.d1(), 1, 0);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c16861xdcf09668.K1;
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Contact_Mobile_MD5");
        java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Contact_full_Mobile_MD5");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (!stringExtra.equals("") || !stringExtra2.equals("")) {
            r61.a i18 = m61.k.wi().i(stringExtra);
            if (i18 == null) {
                i18 = m61.k.wi().i(stringExtra2);
                stringExtra = stringExtra2;
            }
            if (i18 != null) {
                m61.k.wi().j(stringExtra, i18);
            }
        }
        r35.a aVar = new r35.a(c16861xdcf09668.f279303d, new hr3.bb(this));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(java.lang.Integer.valueOf(c16861xdcf09668.N));
        java.lang.String stringExtra3 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("source_from_user_name");
        java.lang.String stringExtra4 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("source_from_nick_name");
        aVar.f450552t = stringExtra3;
        aVar.f450553u = stringExtra4;
        aVar.f450540e = new hr3.cb(this, stringExtra3, stringExtra4);
        java.lang.String stringExtra5 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("room_name");
        java.lang.String stringExtra6 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("AntispamTicket");
        if (!android.text.TextUtils.isEmpty(stringExtra6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalUserFooterPreference", "add contact case 1:%s", stringExtra6);
            aVar.m(stringExtra6);
            aVar.a(c16861xdcf09668.L.d1(), "", linkedList);
            return;
        }
        if (android.text.TextUtils.isEmpty(stringExtra5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalUserFooterPreference", "add contact case 2, %s", c16861xdcf09668.L.F1);
            aVar.m(c16861xdcf09668.L.F1);
            aVar.b(c16861xdcf09668.L.d1(), linkedList, false, "");
            return;
        }
        if (!android.text.TextUtils.isEmpty(aVar.f450549q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalUserFooterPreference", "add contact case 3, %s", c16861xdcf09668.L.F1);
            aVar.m(c16861xdcf09668.L.F1);
            aVar.a(c16861xdcf09668.L.d1(), stringExtra5, linkedList);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(c16861xdcf09668.L.d1(), true);
        if (n17 != null && (str = n17.F1) != null) {
            str2 = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalUserFooterPreference", "dkverify footer add:%s chat:%s ticket:%s", c16861xdcf09668.L.d1(), stringExtra5, str2);
        if (!android.text.TextUtils.isEmpty(str2)) {
            aVar.m(str2);
            aVar.a(c16861xdcf09668.L.d1(), stringExtra5, linkedList);
            return;
        }
        c01.p8 a17 = c01.n8.a();
        java.lang.String d17 = c16861xdcf09668.L.d1();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c16861xdcf09668.N);
        int i19 = 10000;
        if (valueOf != null) {
            valueOf.intValue();
            i19 = 10000 + valueOf.intValue();
        }
        ((c01.k7) a17).g(d17, stringExtra5, i19, new hr3.db(this, aVar, stringExtra5, linkedList));
    }
}
