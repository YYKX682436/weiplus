package ak1;

/* loaded from: classes8.dex */
public final class d implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.MMPreference f5569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ak1.b f5571f;

    public d(com.tencent.mm.ui.base.preference.MMPreference mMPreference, java.lang.String str, ak1.b bVar) {
        this.f5569d = mMPreference;
        this.f5570e = str;
        this.f5571f = bVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        ak1.e eVar = ak1.e.f5572a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoipDeviceListCache", "WxaGetVoipDeviceListResp errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaGetVoipDeviceListResp");
            r45.yd7 yd7Var = (r45.yd7) fVar;
            java.util.LinkedList linkedList = yd7Var.f391003d;
            java.util.LinkedList linkedList2 = yd7Var.f391004e;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandVoipDeviceListCache", "WxaGetVoipDeviceListResp success deviceListSize:%d, voipCallAuthListSize:%d", java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0), java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : 0));
            if ((linkedList != null && !linkedList.isEmpty()) || (linkedList2 != null && !linkedList2.isEmpty())) {
                this.f5569d.runOnUiThread(new ak1.c(this.f5570e, linkedList, linkedList2, this.f5571f));
            }
        }
        return 0;
    }
}
