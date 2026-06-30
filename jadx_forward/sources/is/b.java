package is;

/* loaded from: classes4.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ js.q0 f375835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(js.q0 q0Var) {
        super(1);
        this.f375835d = q0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732 c11384xf0e29732 = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732) obj;
        r45.fn4 fn4Var = c11384xf0e29732 != null ? c11384xf0e29732.f154719e : null;
        js.q0 q0Var = this.f375835d;
        if (fn4Var != null) {
            java.lang.String str = c11384xf0e29732.f154719e.f455996e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "reqSimMobile masked mobile: %s", str);
            if (str != null) {
                int i17 = 1;
                if (str.length() > 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(c01.b9.f118602c.a("last_login_bind_mobile", ""));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "last login bind mobile: %s", sb6);
                    if ((sb6.length() > 0) && sb6.length() >= str.length()) {
                        int length = str.length();
                        int length2 = sb6.length();
                        if (1 <= length) {
                            while (true) {
                                char charAt = str.charAt(length - i17);
                                if (charAt < '0' || charAt > '9') {
                                    sb6.setCharAt(length2 - i17, charAt);
                                }
                                if (i17 == length) {
                                    break;
                                }
                                i17++;
                            }
                        }
                        java.lang.String sb7 = sb6.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                        if (r26.i0.n(sb7, str, false)) {
                            if (q0Var != null) {
                                r45.fn4 fn4Var2 = c11384xf0e29732.f154719e;
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11423x465a464c) q0Var).a(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.t(str, java.lang.Integer.valueOf(fn4Var2.f455997f), fn4Var2.f455998g, fn4Var2.f455999h));
                            }
                            return jz5.f0.f384359a;
                        }
                    }
                }
            }
        }
        if (q0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11423x465a464c) q0Var).a(null);
        }
        return jz5.f0.f384359a;
    }
}
