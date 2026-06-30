package com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u0014\u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u000f\u0010\u0014R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ecs/ipc/EcsIPCHandleAPPBrandRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "describeContents", "in", "readParcel", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "", "d", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "paramsJsonStr", "a", "envDataJsonStr", "Lgc1/g;", "f", "Lgc1/g;", "c", "()Lgc1/g;", "transfer", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "gc1/a", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EcsIPCHandleAPPBrandRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final gc1.a CREATOR = new gc1.a(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private java.lang.String paramsJsonStr;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private java.lang.String envDataJsonStr;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final gc1.g transfer;

    /* JADX WARN: Multi-variable type inference failed */
    public EcsIPCHandleAPPBrandRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getEnvDataJsonStr() {
        return this.envDataJsonStr;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getParamsJsonStr() {
        return this.paramsJsonStr;
    }

    /* renamed from: c, reason: from getter */
    public final gc1.g getTransfer() {
        return this.transfer;
    }

    public final void d(java.lang.String str) {
        this.envDataJsonStr = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(java.lang.String str) {
        this.paramsJsonStr = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.d.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        gc1.e eVar = new gc1.e();
        eVar.f270397d = this.paramsJsonStr;
        boolean[] zArr = eVar.f270399f;
        zArr[1] = true;
        eVar.f270398e = this.envDataJsonStr;
        zArr[2] = true;
        this.transfer.b(eVar, parcel);
    }

    public /* synthetic */ EcsIPCHandleAPPBrandRequest(java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2);
    }

    public EcsIPCHandleAPPBrandRequest(java.lang.String str, java.lang.String str2) {
        this.paramsJsonStr = str;
        this.envDataJsonStr = str2;
        this.transfer = new gc1.g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EcsIPCHandleAPPBrandRequest(android.os.Parcel parcel) {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.Object a17 = this.transfer.a(parcel);
        if (a17 == null || !(a17 instanceof gc1.e)) {
            return;
        }
        gc1.e eVar = (gc1.e) a17;
        this.paramsJsonStr = eVar.b();
        this.envDataJsonStr = eVar.c();
    }
}
