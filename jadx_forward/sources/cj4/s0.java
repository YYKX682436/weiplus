package cj4;

/* loaded from: classes11.dex */
public final class s0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f123566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.h f123567e;

    public s0(android.content.Context context, mj4.h hVar) {
        this.f123566d = context;
        this.f123567e = hVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        android.content.Context context = this.f123566d;
        java.lang.String r17 = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.jwy);
        di4.i.f314315a.c();
        g4Var.f(com.p314xaae8f345.mm.R.id.jhb, r17);
        mj4.h hVar = this.f123567e;
        g4Var.t(com.p314xaae8f345.mm.R.id.jgy, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwb), hVar != null && ((mj4.k) hVar).y());
        int e17 = (hVar != null ? ((mj4.k) hVar).f408600b.f76515xfe382d11 : 0) - c01.id.e();
        int i17 = e17 < 0 ? 0 : e17 / 3600;
        java.lang.String string = i17 >= 1 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvm, java.lang.Integer.valueOf(i17)) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        g4Var.p(com.p314xaae8f345.mm.R.id.jgq, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvl), string, 0);
        int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if ((i18 == 788529167 || i18 == 788529166) || z65.c.a()) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.p2572x26f8a610.C20732x8a82ebaa()) == 1) {
                g4Var.p(com.p314xaae8f345.mm.R.id.f567438ug1, "状态压测", "本地将所有好友设置成和自己相同状态", 0);
            }
        }
    }
}
