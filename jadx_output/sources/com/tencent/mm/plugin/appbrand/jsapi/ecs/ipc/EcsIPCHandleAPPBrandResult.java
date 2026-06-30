package com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ecs/ipc/EcsIPCHandleAPPBrandResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "gc1/b", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EcsIPCHandleAPPBrandResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final gc1.b CREATOR = new gc1.b(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f80775d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80776e;

    /* renamed from: f, reason: collision with root package name */
    public final gc1.g f80777f;

    /* JADX WARN: Multi-variable type inference failed */
    public EcsIPCHandleAPPBrandResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        gc1.e eVar = new gc1.e();
        eVar.f270397d = java.lang.String.valueOf(this.f80775d);
        boolean[] zArr = eVar.f270399f;
        zArr[1] = true;
        eVar.f270398e = this.f80776e;
        zArr[2] = true;
        this.f80777f.b(eVar, parcel);
    }

    public /* synthetic */ EcsIPCHandleAPPBrandResult(java.lang.Integer num, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : num, (i17 & 2) != 0 ? null : str);
    }

    public EcsIPCHandleAPPBrandResult(java.lang.Integer num, java.lang.String str) {
        this.f80775d = num;
        this.f80776e = str;
        this.f80777f = new gc1.g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EcsIPCHandleAPPBrandResult(android.os.Parcel parcel) {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.Object a17 = this.f80777f.a(parcel);
        if (a17 == null || !(a17 instanceof gc1.e)) {
            return;
        }
        gc1.e eVar = (gc1.e) a17;
        java.lang.String b17 = eVar.b();
        kotlin.jvm.internal.o.f(b17, "getStr1(...)");
        this.f80775d = r26.h0.h(b17);
        this.f80776e = eVar.c();
    }
}
