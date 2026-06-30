package com.tencent.mm.feature.emoji;

/* loaded from: classes9.dex */
public final class v3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vd0 f66513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66514e;

    public v3(int i17, r45.vd0 vd0Var, android.content.Context context, int i18) {
        this.f66513d = vd0Var;
        this.f66514e = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f66514e;
        r45.vd0 vd0Var = this.f66513d;
        if (itemId == 1001) {
            se5.a aVar = new se5.a();
            aVar.l(n13.v.f334140a.a(vd0Var.f388136f, vd0Var.f388137g, 0, vd0Var.f388135e, null, 0, vd0Var.f388134d));
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            n13.r rVar = new n13.r();
            rVar.f334117a = true;
            rVar.f334120d.f334139a = 5;
            ((dk5.b0) b0Var).Bi(context, aVar, rVar);
            return;
        }
        if (itemId == 1000) {
            y12.k.a(this.f66514e, vd0Var.f388136f + context.getString(com.tencent.mm.R.string.bzp), vd0Var.f388137g, vd0Var.f388135e, ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().R(), com.tencent.mm.plugin.emoji.model.EmojiLogic.c(0, vd0Var.f388136f, vd0Var.f388137g, vd0Var.f388135e, null, 0, vd0Var.f388134d), 33);
        }
    }
}
