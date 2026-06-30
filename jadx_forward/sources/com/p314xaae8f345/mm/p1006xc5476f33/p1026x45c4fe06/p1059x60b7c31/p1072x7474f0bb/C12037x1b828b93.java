package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1072x7474f0bb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\t\b\u0016¢\u0006\u0004\b\r\u0010\u000eB/\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\r\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016¨\u0006\u001a"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/bizvideochannel/JsApiOpenWebViewUseFastLoad$OpenWebViewUseFastLoad", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "src", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "parcel", "", "flags", "writeToParcel", "describeContents", "<init>", "()V", "Lcom/tencent/mm/plugin/appbrand/jsapi/k0;", "api", "Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "service", "callbackId", "Lorg/json/JSONObject;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "(Lcom/tencent/mm/plugin/appbrand/jsapi/k0;Lcom/tencent/mm/plugin/appbrand/jsapi/l;ILorg/json/JSONObject;)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/bizvideochannel/a", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiOpenWebViewUseFastLoad$OpenWebViewUseFastLoad */
/* loaded from: classes.dex */
final class C12037x1b828b93 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1072x7474f0bb.a f33952x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1072x7474f0bb.a(null);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f161555f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161556g;

    /* renamed from: h, reason: collision with root package name */
    public final int f161557h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONObject f161558i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f161559m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f161560n;

    public C12037x1b828b93() {
        this.f161560n = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        java.lang.String str;
        super.v(parcel);
        if (parcel == null || (str = parcel.readString()) == null) {
            str = "";
        }
        this.f161558i = new org.json.JSONObject(str);
        boolean z17 = false;
        if (parcel != null && parcel.readInt() == 1) {
            z17 = true;
        }
        this.f161559m = z17;
        java.lang.String readString = parcel != null ? parcel.readString() : null;
        this.f161560n = readString != null ? readString : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        super.writeToParcel(parcel, i17);
        org.json.JSONObject jSONObject = this.f161558i;
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f161559m ? 1 : 0);
        parcel.writeString(this.f161560n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        x();
        boolean z17 = this.f161559m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f161555f;
        int i17 = this.f161557h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161556g;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebViewUseFastLoad", "openWebViewUseFastLoad success");
            if (lVar != null) {
                lVar.a(i17, k0Var != null ? k0Var.o("ok") : null);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWebViewUseFastLoad", "openWebViewUseFastLoad failed %s", this.f161560n);
        if (lVar != null) {
            if (k0Var != null) {
                r1 = k0Var.o("failed: " + this.f161560n);
            }
            lVar.a(i17, r1);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWebViewUseFastLoad", "openWebViewUseFastLoad abtest closed");
            this.f161559m = false;
            this.f161560n = "abtest closed";
            c();
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).t(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f161558i, hashMap);
        this.f161559m = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hashMap.get(ya.b.f77504xbb80cbe3), java.lang.Boolean.TRUE);
        java.lang.Object obj = hashMap.get("desc");
        this.f161560n = obj != null ? (java.lang.String) obj : "";
        c();
    }

    public C12037x1b828b93(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f161560n = "";
        this.f161555f = k0Var;
        this.f161556g = lVar;
        this.f161557h = i17;
        this.f161558i = jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12037x1b828b93(android.os.Parcel parcel) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        v(parcel);
    }
}
