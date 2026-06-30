package c12;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(java.lang.String appId, java.lang.String stockId, java.lang.String uxInfo, java.lang.String compId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(stockId, "stockId");
        kotlin.jvm.internal.o.g(uxInfo, "uxInfo");
        kotlin.jvm.internal.o.g(compId, "compId");
        uq.k kVar = new uq.k();
        kVar.f430152d = appId;
        kVar.f430153e = stockId;
        kVar.f430154f = uxInfo;
        kVar.f430155g = compId;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = kVar;
        lVar.f70665b = new uq.l();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/mmoc-bin/adplayinfo/send_ad_coupon";
        lVar.f70667d = 4743;
        p(lVar.a());
    }
}
