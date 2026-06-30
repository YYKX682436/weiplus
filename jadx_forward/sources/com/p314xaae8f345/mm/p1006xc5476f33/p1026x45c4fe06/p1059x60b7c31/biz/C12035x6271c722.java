package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\t\b\u0016¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0013\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiStartBindPhone$BindPhoneRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "Landroid/os/Parcel;", "parcel", "Ljz5/f0;", "readParcel", "dest", "", "flags", "writeToParcel", "d", "I", "a", "()I", "b", "(I)V", "enterType", "<init>", "()V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/biz/h1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiStartBindPhone$BindPhoneRequest */
/* loaded from: classes7.dex */
public final class C12035x6271c722 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.h1 f33942x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.h1(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int enterType;

    public C12035x6271c722() {
    }

    /* renamed from: a, reason: from getter */
    public final int getEnterType() {
        return this.enterType;
    }

    public final void b(int i17) {
        this.enterType = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.k1.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: readParcel */
    public void mo50318xdc053d3f(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        super.mo50318xdc053d3f(parcel);
        this.enterType = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        dest.writeInt(this.enterType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12035x6271c722(android.os.Parcel parcel) {
        super(parcel);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
    }
}
