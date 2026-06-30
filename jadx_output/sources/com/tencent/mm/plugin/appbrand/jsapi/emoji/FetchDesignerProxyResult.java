package com.tencent.mm.plugin.appbrand.jsapi.emoji;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/emoji/FetchDesignerProxyResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/emoji/b", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class FetchDesignerProxyResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.emoji.b CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.emoji.b(null);

    /* renamed from: d, reason: collision with root package name */
    public boolean f80813d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult f80814e;

    public FetchDesignerProxyResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f80813d = parcel.readInt() != 0;
        this.f80814e = (com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult) parcel.readParcelable(com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f80813d ? 1 : 0);
        dest.writeParcelable(this.f80814e, i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchDesignerProxyResult(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.o.g(parcel, "parcel");
    }
}
