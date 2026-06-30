package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ecs/ipc/EcsIPCHandleRequest;", "Landroid/os/Parcelable;", "CREATOR", "gc1/c", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleRequest */
/* loaded from: classes15.dex */
public final class C12081xc7365220 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final gc1.c f34125x681a0c0c = new gc1.c(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f162311d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f162312e;

    /* renamed from: f, reason: collision with root package name */
    public final gc1.g f162313f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12081xc7365220(android.os.Parcel parcel) {
        this(null, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.Object a17 = this.f162313f.a(parcel);
        if (a17 == null || !(a17 instanceof gc1.e)) {
            return;
        }
        gc1.e eVar = (gc1.e) a17;
        this.f162311d = eVar.b();
        this.f162312e = eVar.c();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        gc1.e eVar = new gc1.e();
        eVar.f351930d = this.f162311d;
        boolean[] zArr = eVar.f351932f;
        zArr[1] = true;
        eVar.f351931e = this.f162312e;
        zArr[2] = true;
        this.f162313f.b(eVar, parcel);
    }

    public C12081xc7365220(java.lang.String str, java.lang.String str2) {
        this.f162311d = str;
        this.f162312e = str2;
        this.f162313f = new gc1.g();
    }
}
