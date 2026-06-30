package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class w implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC f101961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e21 f101962e;

    public w(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC, r45.e21 e21Var) {
        this.f101961d = finderActivityParticipateUIC;
        this.f101962e = e21Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            if (!this.f101961d.X6()) {
                com.tencent.mars.xlog.Log.i("FinderActivityParticipateUIC", "showParticipateBottomSheet: no maas");
                g4Var.a(1001, com.tencent.mm.R.string.f490407u4);
                g4Var.a(1002, com.tencent.mm.R.string.f490415uc);
                return;
            }
            r45.e21 e21Var = this.f101962e;
            r45.sz6 sz6Var = e21Var != null ? (r45.sz6) e21Var.getCustom(26) : null;
            int integer = sz6Var != null ? sz6Var.getInteger(3) : 0;
            com.tencent.mars.xlog.Log.i("FinderActivityParticipateUIC", "showParticipateBottomSheet: maas entryBit: " + integer);
            if ((integer & 1) > 0) {
                com.tencent.mars.xlog.Log.i("FinderActivityParticipateUIC", "showParticipateBottomSheet: maas camera enable");
                g4Var.a(1001, com.tencent.mm.R.string.f490407u4);
            }
            if ((integer & 2) > 0) {
                com.tencent.mars.xlog.Log.i("FinderActivityParticipateUIC", "showParticipateBottomSheet: maas album enable");
                g4Var.a(1002, com.tencent.mm.R.string.f490415uc);
            }
            g4Var.a(1031, com.tencent.mm.R.string.f9t);
        }
    }
}
