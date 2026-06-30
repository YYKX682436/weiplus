package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/SubscribeMsgExecutor;", "Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/ISubscribeMsgCGIExecutor;", "com/tencent/mm/plugin/appbrand/jsapi/msgsubscription/u", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SubscribeMsgExecutor implements com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.ISubscribeMsgCGIExecutor {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.t();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82312d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData f82313e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.u f82314f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f82315g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f82316h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public o31.a f82317i = com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.c.f82323a;

    public SubscribeMsgExecutor(java.lang.String str) {
        this.f82312d = str;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.u uVar = this.f82314f;
        if (uVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.r) uVar).f82353a.a(i17, i18, errMsg, subscribeMsgRequestResult);
        }
    }

    public void b(android.content.Context context, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.u uVar = this.f82314f;
        if (uVar != null) {
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.r rVar = (com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.r) uVar;
            if (result.f71799y) {
                com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask.f(rVar.f82353a, "cancel", null, 0, 6, null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : result.f71785h) {
                hashMap.put(subscribeMsgTmpItem.f71803f, subscribeMsgTmpItem.f71811q);
            }
            rVar.f82353a.e("ok", hashMap, 0);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f82312d);
        dest.writeTypedList(this.f82316h);
        byte[] bArr = this.f82315g;
        dest.writeInt(bArr != null ? bArr.length : 0);
        byte[] bArr2 = this.f82315g;
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        dest.writeByteArray(bArr2);
        dest.writeParcelable(this.f82313e, i17);
    }
}
