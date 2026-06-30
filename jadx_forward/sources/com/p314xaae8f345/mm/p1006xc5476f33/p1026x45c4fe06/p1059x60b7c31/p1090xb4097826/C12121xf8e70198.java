package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0016"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiShareFinderOrder$ShareFinderOrderTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "y", "z", "Landroid/os/Parcel;", "in", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "dest", "", "flags", "writeToParcel", "Lcom/tencent/mm/plugin/appbrand/e9;", "service", "Lorg/json/JSONObject;", "jsonObject", "callbackId", "<init>", "(Lcom/tencent/mm/plugin/appbrand/e9;Lorg/json/JSONObject;I)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/finder/o0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderOrder$ShareFinderOrderTask */
/* loaded from: classes.dex */
final class C12121xf8e70198 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.o0 f34272x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.o0(null);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162704f;

    /* renamed from: g, reason: collision with root package name */
    public final int f162705g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162706h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONObject f162707i;

    public C12121xf8e70198(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        this.f162704f = e9Var;
        this.f162705g = i17;
        this.f162707i = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel in6) {
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
        try {
            jSONObject = new org.json.JSONObject(in6.readString());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Finder.JsApiShareFinderOrder", e17, "parseFromParcel", new java.lang.Object[0]);
            jSONObject = null;
        }
        this.f162707i = jSONObject;
        this.f162706h = in6.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(java.lang.String.valueOf(this.f162707i));
        dest.writeString(this.f162706h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162704f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e9Var);
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        java.lang.String str = this.f162706h;
        int i17 = this.f162705g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiShareFinderOrder", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", mo48798x74292566, str, valueOf, java.lang.Boolean.valueOf(e9Var.mo50262x39e05d35()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e9Var);
        e9Var.a(i17, this.f162706h);
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        org.json.JSONObject jSONObject = this.f162707i;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("talkUserName") : null;
        if (optString == null) {
            optString = "";
        }
        org.json.JSONObject jSONObject2 = this.f162707i;
        java.lang.String optString2 = jSONObject2 != null ? jSONObject2.optString("orderId") : null;
        java.lang.String str = optString2 != null ? optString2 : "";
        ot0.q qVar = new ot0.q();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiShareFinderOrder", "invoked, username = " + optString + ", orderId = " + str);
        qVar.f430199i = 96;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) ((s40.b1) i95.n0.c(s40.b1.class))).Vi(null, str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.p0(qVar, optString));
        c();
    }

    public C12121xf8e70198(android.os.Parcel in6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
        v(in6);
    }
}
