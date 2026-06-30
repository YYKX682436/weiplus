package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ze implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f196867d;

    public ze(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f196867d = mgVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = it.what;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195033y1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f196867d;
        if (i17 == i18) {
            java.lang.Object obj = it.obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg> }");
            mgVar.T1((java.util.ArrayList) obj, true, it.arg1 == 1, java.lang.Boolean.valueOf(it.arg2 == 1));
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195034z1) {
            java.lang.Object obj2 = it.obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg> }");
            mgVar.T1((java.util.ArrayList) obj2, false, it.arg1 == 1, java.lang.Boolean.TRUE);
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.A1) {
            java.lang.Object obj3 = it.obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg> }");
            mgVar.Q1((java.util.ArrayList) obj3, java.lang.Boolean.TRUE, true);
        }
        return true;
    }
}
