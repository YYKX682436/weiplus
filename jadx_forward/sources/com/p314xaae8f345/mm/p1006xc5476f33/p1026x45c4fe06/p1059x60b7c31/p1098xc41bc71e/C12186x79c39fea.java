package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/SubscribeMsgExecutor;", "Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/ISubscribeMsgCGIExecutor;", "com/tencent/mm/plugin/appbrand/jsapi/msgsubscription/u", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor */
/* loaded from: classes9.dex */
public final class C12186x79c39fea implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.InterfaceC12184xe53caf98 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea> f34538x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.t();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f163845d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e f163846e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.u f163847f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f163848g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f163849h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public o31.a f163850i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.c.f163856a;

    public C12186x79c39fea(java.lang.String str) {
        this.f163845d = str;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.u uVar = this.f163847f;
        if (uVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.r) uVar).f163886a.a(i17, i18, errMsg, c11158xe7d16ed5);
        }
    }

    public void b(android.content.Context context, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.u uVar = this.f163847f;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.r rVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.r) uVar;
            if (result.f153332y) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12185x86bd78c5.f(rVar.f163886a, "cancel", null, 0, 6, null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : result.f153318h) {
                hashMap.put(c11159x8f55e6d3.f153336f, c11159x8f55e6d3.f153344q);
            }
            rVar.f163886a.e("ok", hashMap, 0);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f163845d);
        dest.writeTypedList(this.f163849h);
        byte[] bArr = this.f163848g;
        dest.writeInt(bArr != null ? bArr.length : 0);
        byte[] bArr2 = this.f163848g;
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        dest.writeByteArray(bArr2);
        dest.writeParcelable(this.f163846e, i17);
    }
}
