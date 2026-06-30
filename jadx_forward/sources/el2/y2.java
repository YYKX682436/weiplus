package el2;

/* loaded from: classes3.dex */
public final class y2 implements el2.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.do2 f335486a;

    public y2(r45.do2 promoteInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(promoteInfo, "promoteInfo");
        this.f335486a = promoteInfo;
    }

    @Override // el2.v2
    public java.lang.String a() {
        return pm0.v.u(zl2.r4.f555483a.c0(this.f335486a));
    }

    @Override // el2.v2
    public java.lang.String b() {
        r45.do2 do2Var = this.f335486a;
        int m75939xb282bd08 = do2Var.m75939xb282bd08(2);
        if (m75939xb282bd08 == 1) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.Object[] objArr = new java.lang.Object[2];
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            objArr[0] = java.lang.Integer.valueOf(uz0Var != null ? uz0Var.m75939xb282bd08(4) : 0);
            r45.uz0 uz0Var2 = (r45.uz0) do2Var.m75936x14adae67(0);
            objArr[1] = java.lang.Integer.valueOf(uz0Var2 != null ? uz0Var2.m75939xb282bd08(5) : 0);
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbb, objArr);
        }
        if (m75939xb282bd08 != 2) {
            return "";
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        r45.n11 n11Var = (r45.n11) do2Var.m75936x14adae67(1);
        objArr2[0] = java.lang.Integer.valueOf(n11Var != null ? n11Var.m75939xb282bd08(4) : 0);
        r45.n11 n11Var2 = (r45.n11) do2Var.m75936x14adae67(1);
        objArr2[1] = java.lang.Integer.valueOf(n11Var2 != null ? n11Var2.m75939xb282bd08(5) : 0);
        return context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjp, objArr2);
    }

    @Override // el2.v2
    public java.lang.String c() {
        return "";
    }

    @Override // el2.v2
    public java.lang.String d() {
        return null;
    }

    @Override // el2.v2
    public r45.a52 e() {
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, 20);
        a52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(this.f335486a.mo14344x5f01b1f6()));
        return a52Var;
    }

    @Override // el2.v2
    public jz5.l f() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79173x912fb83f), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#CFB177")));
    }

    @Override // el2.v2
    /* renamed from: getData */
    public java.lang.Object mo127813xfb7e5820() {
        return this.f335486a;
    }

    @Override // el2.v2
    /* renamed from: getTitle */
    public java.lang.String mo127814x7531c8a2() {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        r45.do2 do2Var = this.f335486a;
        int m75939xb282bd08 = do2Var.m75939xb282bd08(2);
        java.lang.String str = "";
        if (m75939xb282bd08 == 1) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.Object[] objArr = new java.lang.Object[1];
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var != null && (m75945x2fec8307 = uz0Var.m75945x2fec8307(1)) != null) {
                str = m75945x2fec8307;
            }
            objArr[0] = str;
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573278fy4, objArr);
        }
        if (m75939xb282bd08 != 2) {
            return "";
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        r45.n11 n11Var = (r45.n11) do2Var.m75936x14adae67(1);
        if (n11Var != null && (m75945x2fec83072 = n11Var.m75945x2fec8307(1)) != null) {
            str = m75945x2fec83072;
        }
        objArr2[0] = str;
        return context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gvd, objArr2);
    }

    @Override // el2.v2
    /* renamed from: getType */
    public int mo127815xfb85f7b0() {
        return 20;
    }
}
