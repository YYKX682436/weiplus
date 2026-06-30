package cj4;

/* loaded from: classes11.dex */
public final class s0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f42033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.h f42034e;

    public s0(android.content.Context context, mj4.h hVar) {
        this.f42033d = context;
        this.f42034e = hVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f42033d;
        java.lang.String r17 = i65.a.r(context, com.tencent.mm.R.string.jwy);
        di4.i.f232782a.c();
        g4Var.f(com.tencent.mm.R.id.jhb, r17);
        mj4.h hVar = this.f42034e;
        g4Var.t(com.tencent.mm.R.id.jgy, context.getString(com.tencent.mm.R.string.jwb), hVar != null && ((mj4.k) hVar).y());
        int e17 = (hVar != null ? ((mj4.k) hVar).f327067b.field_ExpireTime : 0) - c01.id.e();
        int i17 = e17 < 0 ? 0 : e17 / 3600;
        java.lang.String string = i17 >= 1 ? context.getString(com.tencent.mm.R.string.jvm, java.lang.Integer.valueOf(i17)) : context.getString(com.tencent.mm.R.string.jvk);
        kotlin.jvm.internal.o.d(string);
        g4Var.p(com.tencent.mm.R.id.jgq, context.getString(com.tencent.mm.R.string.jvl), string, 0);
        int i18 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i18 == 788529167 || i18 == 788529166) || z65.c.a()) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.textstatus.multiple.RepairerConfigTextStatusLargeDataDebugOpt()) == 1) {
                g4Var.p(com.tencent.mm.R.id.f485905ug1, "状态压测", "本地将所有好友设置成和自己相同状态", 0);
            }
        }
    }
}
