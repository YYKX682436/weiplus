package ju3;

/* loaded from: classes4.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17027xff3f401c f383515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17027xff3f401c c17027xff3f401c) {
        super(1);
        this.f383515d = c17027xff3f401c;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = it.f237195f;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        java.lang.String r17 = c01.z1.r();
        java.lang.String format = java.lang.String.format("%s#%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), r17}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        jq0Var.e(r17);
        jq0Var.j(r17);
        jq0Var.g(3);
        jq0Var.c(currentTimeMillis);
        jq0Var.d(format);
        jq0Var.i(format);
        gp0Var.g0(format);
        gp0Var.A0(str);
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (j17) {
            gp0Var.B0(str);
        } else {
            c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
        }
        gp0Var.h0(2);
        bq0Var.f452497f.add(gp0Var);
        bq0Var.o(jq0Var);
        c4Var.f87848a = bq0Var;
        android.content.Context context = this.f383515d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        c4Var.f87856i = (android.app.Activity) context;
        c4Var.f87850c = 2;
        c5303xc75d2f73.e();
        return jz5.f0.f384359a;
    }
}
