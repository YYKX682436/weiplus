package el2;

/* loaded from: classes3.dex */
public final class a3 implements el2.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.qy1 f335279a;

    public a3(r45.qy1 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f335279a = item;
    }

    @Override // el2.v2
    public java.lang.String a() {
        bw5.mb0 P0 = zl2.r4.f555483a.P0(this.f335279a);
        if (P0 != null) {
            return P0.b();
        }
        return null;
    }

    @Override // el2.v2
    public java.lang.String b() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object[] objArr = new java.lang.Object[2];
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        r45.qy1 qy1Var = this.f335279a;
        objArr[0] = r4Var.d1(context2, r4Var.P0(qy1Var));
        bw5.mb0 P0 = r4Var.P0(qy1Var);
        objArr[1] = java.lang.Integer.valueOf(P0 != null ? P0.f111689m : 0);
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5q, objArr);
    }

    @Override // el2.v2
    public java.lang.String c() {
        return "";
    }

    @Override // el2.v2
    public java.lang.String d() {
        bw5.mb0 P0 = zl2.r4.f555483a.P0(this.f335279a);
        if (P0 != null) {
            return P0.c();
        }
        return null;
    }

    @Override // el2.v2
    public r45.a52 e() {
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, 19);
        a52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(this.f335279a.mo14344x5f01b1f6()));
        return a52Var;
    }

    @Override // el2.v2
    public jz5.l f() {
        return null;
    }

    @Override // el2.v2
    /* renamed from: getData */
    public java.lang.Object mo127813xfb7e5820() {
        return this.f335279a;
    }

    @Override // el2.v2
    /* renamed from: getTitle */
    public java.lang.String mo127814x7531c8a2() {
        bw5.mb0 P0 = zl2.r4.f555483a.P0(this.f335279a);
        if (P0 != null) {
            return P0.m12484xfb82e301();
        }
        return null;
    }

    @Override // el2.v2
    /* renamed from: getType */
    public int mo127815xfb85f7b0() {
        return 19;
    }
}
