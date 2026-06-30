package com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ecs/ipc/EcsIPCHandleRequest;", "Landroid/os/Parcelable;", "CREATOR", "gc1/c", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EcsIPCHandleRequest implements android.os.Parcelable {
    public static final gc1.c CREATOR = new gc1.c(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80778d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80779e;

    /* renamed from: f, reason: collision with root package name */
    public final gc1.g f80780f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsIPCHandleRequest(android.os.Parcel parcel) {
        this(null, null);
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.Object a17 = this.f80780f.a(parcel);
        if (a17 == null || !(a17 instanceof gc1.e)) {
            return;
        }
        gc1.e eVar = (gc1.e) a17;
        this.f80778d = eVar.b();
        this.f80779e = eVar.c();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        gc1.e eVar = new gc1.e();
        eVar.f270397d = this.f80778d;
        boolean[] zArr = eVar.f270399f;
        zArr[1] = true;
        eVar.f270398e = this.f80779e;
        zArr[2] = true;
        this.f80780f.b(eVar, parcel);
    }

    public EcsIPCHandleRequest(java.lang.String str, java.lang.String str2) {
        this.f80778d = str;
        this.f80779e = str2;
        this.f80780f = new gc1.g();
    }
}
