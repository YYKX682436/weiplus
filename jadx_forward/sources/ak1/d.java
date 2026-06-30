package ak1;

/* loaded from: classes8.dex */
public final class d implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b f87102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ak1.b f87104f;

    public d(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b, java.lang.String str, ak1.b bVar) {
        this.f87102d = abstractActivityC21555x39071a9b;
        this.f87103e = str;
        this.f87104f = bVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        ak1.e eVar = ak1.e.f87105a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVoipDeviceListCache", "WxaGetVoipDeviceListResp errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaGetVoipDeviceListResp");
            r45.yd7 yd7Var = (r45.yd7) fVar;
            java.util.LinkedList linkedList = yd7Var.f472536d;
            java.util.LinkedList linkedList2 = yd7Var.f472537e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandVoipDeviceListCache", "WxaGetVoipDeviceListResp success deviceListSize:%d, voipCallAuthListSize:%d", java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0), java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : 0));
            if ((linkedList != null && !linkedList.isEmpty()) || (linkedList2 != null && !linkedList2.isEmpty())) {
                this.f87102d.runOnUiThread(new ak1.c(this.f87103e, linkedList, linkedList2, this.f87104f));
            }
        }
        return 0;
    }
}
