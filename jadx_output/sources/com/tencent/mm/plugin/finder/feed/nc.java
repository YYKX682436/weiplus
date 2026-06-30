package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class nc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f108569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(com.tencent.mm.plugin.finder.feed.id idVar) {
        super(1);
        this.f108569d = idVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.feed.id idVar = this.f108569d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = idVar.f107003f;
        yw2.n nVar = idVar.f107010p;
        java.lang.Object obj2 = null;
        if (nVar != null) {
            android.content.Context context = nVar.f466659o;
            if (context == null) {
                kotlin.jvm.internal.o.o("context");
                throw null;
            }
            obj2 = context;
        }
        if (obj2 instanceof com.tencent.mm.ui.MMFragmentActivity) {
            int scene = idVar.getScene();
            com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
            if (scene == 2 && finderItem != null) {
                androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) obj2;
                kotlin.jvm.internal.o.g(activity, "activity");
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                in5.s0 s0Var = idVar.f107009o;
                if (s0Var != null) {
                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(s0Var, finderItem.getId(), finderItem);
                }
                so2.e2.f410328a.b(V6, 1, finderItem, booleanValue, false, 2, (r25 & 64) != 0 ? false : false, (r25 & 128) != 0 ? false : false, (r25 & 256) != 0 ? false : false, (r25 & 512) != 0 ? null : null);
                com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                long id6 = finderItem.getId();
                am.ia iaVar = feedUpdateEvent.f54252g;
                iaVar.f6918a = id6;
                iaVar.f6919b = 4;
                iaVar.f6922e = booleanValue ? 1 : 0;
                feedUpdateEvent.e();
                int i17 = 3;
                if (booleanValue) {
                    idVar.f107013s++;
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(pm0.v.u(finderItem.getId()));
                    sb6.append(",2,");
                    if (idVar.f107018x) {
                        i17 = 1;
                    } else if (!idVar.f107020z) {
                        i17 = 2;
                    }
                    sb6.append(i17);
                    g0Var.kvStat(20851, sb6.toString());
                } else {
                    idVar.f107013s--;
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(pm0.v.u(finderItem.getId()));
                    sb7.append(",3,");
                    if (idVar.f107018x) {
                        i17 = 1;
                    } else if (!idVar.f107020z) {
                        i17 = 2;
                    }
                    sb7.append(i17);
                    g0Var2.kvStat(20851, sb7.toString());
                }
                idVar.o();
            }
        }
        return jz5.f0.f302826a;
    }
}
