package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f65978d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f65979e;

    public d(android.content.Context context, java.util.List customMenuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(customMenuItem, "customMenuItem");
        this.f65978d = context;
        this.f65979e = customMenuItem;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var == null || !g4Var.z()) {
            return;
        }
        for (com.tencent.mm.feature.ecs.share.p pVar : this.f65979e) {
            int i17 = pVar.f65998a.f65977d;
            android.content.Context context = this.f65978d;
            com.tencent.mm.feature.ecs.share.c cVar = new com.tencent.mm.feature.ecs.share.c(context, i17, pVar);
            boolean z17 = pVar.f66000c;
            cVar.f228375s = z17;
            int ordinal = pVar.f65998a.ordinal();
            if (ordinal == 1) {
                cVar.f228368i = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(z17 ? com.tencent.mm.R.string.ned : com.tencent.mm.R.string.hr_);
                cVar.d(com.tencent.mm.R.raw.icons_filled_share, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478502m));
                g4Var.v(cVar);
            } else if (ordinal == 2) {
                cVar.f228368i = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(z17 ? com.tencent.mm.R.string.nee : com.tencent.mm.R.string.hra);
                cVar.d(com.tencent.mm.R.raw.bottomsheet_icon_moment, 0);
                g4Var.v(cVar);
            } else if (ordinal == 5) {
                com.tencent.mm.feature.ecs.share.b bVar = com.tencent.mm.feature.ecs.share.b.f65970e;
                com.tencent.mm.feature.ecs.share.c cVar2 = new com.tencent.mm.feature.ecs.share.c(context, 5, pVar);
                cVar2.f228368i = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491241cg4);
                cVar2.d(com.tencent.mm.R.raw.icons_filled_search_logo, -65536);
                g4Var.v(cVar2);
            }
        }
    }
}
