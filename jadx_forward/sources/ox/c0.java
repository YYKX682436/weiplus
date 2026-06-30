package ox;

/* loaded from: classes4.dex */
public final class c0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox.e0 f430986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430987b;

    public c0(ox.e0 e0Var, java.lang.String str) {
        this.f430986a = e0Var;
        this.f430987b = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        ox.e0 e0Var = this.f430986a;
        java.lang.String str2 = e0Var.f430999g;
        java.lang.String poiId = this.f430987b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, poiId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo, poiId changed, currentPoiId=" + e0Var.f430999g + ", poiId=" + poiId);
            return;
        }
        boolean z17 = true;
        boolean z18 = i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f152244b.f152233a) != null && (fVar instanceof r45.bj3);
        java.lang.Long Ai = ((ox.h0) i95.n0.c(ox.h0.class)).Ai(poiId);
        long longValue = Ai != null ? Ai.longValue() : 0L;
        ox.h0 h0Var = (ox.h0) i95.n0.c(ox.h0.class);
        h0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiId, "poiId");
        if (poiId.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizSnsPublishMonitor", "recordRequestFinish: poiId is empty");
        } else {
            h0Var.f431016d.remove(poiId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishMonitor", "recordRequestFinish: poiId=".concat(poiId));
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo finish, poiId: " + poiId + ", errType: " + i17 + ", errCode: " + i18 + ", duration: " + longValue + "ms");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2118L, 5L, 1L, false);
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetMomentPoiBarInfoResp");
        r45.bj3 bj3Var = (r45.bj3) fVar2;
        java.lang.String str3 = bj3Var.f452333d;
        if (!(str3 == null || str3.length() == 0)) {
            java.lang.String str4 = bj3Var.f452334e;
            if (!(str4 == null || str4.length() == 0)) {
                java.lang.String str5 = bj3Var.f452335f;
                if (str5 != null && str5.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    if (!bj3Var.f452336g) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo , should_show_info: false, poiId: " + poiId);
                        return;
                    }
                    java.lang.String biz_cnt_wording = bj3Var.f452333d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(biz_cnt_wording, "biz_cnt_wording");
                    java.lang.String cover_img_url = bj3Var.f452334e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cover_img_url, "cover_img_url");
                    java.lang.String aggr_url = bj3Var.f452335f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aggr_url, "aggr_url");
                    e0Var.f430996d.put(poiId, new ox.b0(biz_cnt_wording, cover_img_url, aggr_url));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo success, poiId: " + poiId + ", data cached, duration: " + longValue + "ms");
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo params empty, " + bj3Var.f452333d + ", " + bj3Var.f452334e + ", " + bj3Var.f452335f);
    }
}
