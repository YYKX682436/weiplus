package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ecs/ipc/EcsIPCHandleAPPBrandResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "gc1/b", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandResult */
/* loaded from: classes15.dex */
public final class C12080x7be4ecf2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 {

    /* renamed from: CREATOR */
    public static final gc1.b f34124x681a0c0c = new gc1.b(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f162308d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f162309e;

    /* renamed from: f, reason: collision with root package name */
    public final gc1.g f162310f;

    /* JADX WARN: Multi-variable type inference failed */
    public C12080x7be4ecf2() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600
    /* renamed from: readParcel */
    public void mo50320xdc053d3f(android.os.Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        gc1.e eVar = new gc1.e();
        eVar.f351930d = java.lang.String.valueOf(this.f162308d);
        boolean[] zArr = eVar.f351932f;
        zArr[1] = true;
        eVar.f351931e = this.f162309e;
        zArr[2] = true;
        this.f162310f.b(eVar, parcel);
    }

    public /* synthetic */ C12080x7be4ecf2(java.lang.Integer num, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : num, (i17 & 2) != 0 ? null : str);
    }

    public C12080x7be4ecf2(java.lang.Integer num, java.lang.String str) {
        this.f162308d = num;
        this.f162309e = str;
        this.f162310f = new gc1.g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12080x7be4ecf2(android.os.Parcel parcel) {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.Object a17 = this.f162310f.a(parcel);
        if (a17 == null || !(a17 instanceof gc1.e)) {
            return;
        }
        gc1.e eVar = (gc1.e) a17;
        java.lang.String b17 = eVar.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getStr1(...)");
        this.f162308d = r26.h0.h(b17);
        this.f162309e = eVar.c();
    }
}
