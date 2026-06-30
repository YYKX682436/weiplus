package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/networking/AppBrandWeakNetReceiver$WeakNetNotifyMessage", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.networking.AppBrandWeakNetReceiver$WeakNetNotifyMessage */
/* loaded from: classes7.dex */
public final class C12442x1fd01f4f extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6> {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.C12442x1fd01f4f> f35119x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.j();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f167601e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f167602f;

    /* renamed from: g, reason: collision with root package name */
    public final int f167603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12442x1fd01f4f(java.lang.String appId, boolean z17, int i17) {
        super(appId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f167601e = appId;
        this.f167602f = z17;
        this.f167603g = i17;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    /* renamed from: a, reason: from getter */
    public java.lang.String getF167601e() {
        return this.f167601e;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    public void b(ze.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a17;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        boolean z17 = this.f167602f;
        int i17 = this.f167603g;
        if (z17 && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(runtime)) != null) {
            a17.F = i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b c12444x48c806b = runtime.Y1;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b c12444x48c806b2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b(z17, xh1.j.f536049f);
        if (c12444x48c806b != null && c12444x48c806b2.f167634d == c12444x48c806b.f167634d) {
            return;
        }
        runtime.I1(new java.lang.Runnable() { // from class: ze.n$$e
            @Override // java.lang.Runnable
            public final void run() {
                ze.n nVar2 = ze.n.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b c12444x48c806b3 = c12444x48c806b2;
                if (c12444x48c806b3 != null) {
                    nVar2.Y1 = c12444x48c806b3;
                }
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y C0 = nVar2.C0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b c12444x48c806b4 = nVar2.Y1;
                c12444x48c806b4.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, c12444x48c806b4.f167634d);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, c12444x48c806b4.f167635e.f536052d);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                C0.g("onToggleWxappLibServerMode", jSONObject2);
            }
        });
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWeakNetReceiver.AppBrandReceiver", "dispatchWxAppLibServerModeChanged " + c12444x48c806b2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f167601e);
        out.writeInt(this.f167602f ? 1 : 0);
        out.writeInt(this.f167603g);
    }
}
