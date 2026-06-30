package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.v {

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.w f165338u = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.w(null);

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f165339v = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f165340g;

    /* renamed from: h, reason: collision with root package name */
    public int f165341h;

    /* renamed from: p, reason: collision with root package name */
    public boolean f165346p;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f165342i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.d0.f165334d);

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f165343m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.z(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f165344n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.y(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f165345o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.x(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f165347q = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.a0.f165328d);

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f165348r = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.c0.f165333d);

    /* renamed from: s, reason: collision with root package name */
    public final float[] f165349s = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: t, reason: collision with root package name */
    public final org.p3371xd0ce3e8d.C29783x806035d7 f165350t = new org.p3371xd0ce3e8d.C29783x806035d7(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.v
    public void M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l appBrandComponent, org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e videoSink, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0 videoSinkErrCode, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandComponent, "appBrandComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoSink, "videoSink");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoSinkErrCode, "videoSinkErrCode");
        super.M(appBrandComponent, videoSink, videoSinkErrCode, jSONObject);
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("useSR", false) : false;
        int optInt = jSONObject != null ? jSONObject.optInt("mediaStreamTrackId", -1) : -1;
        if (videoSink instanceof org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c) {
            org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c interfaceC29791x2ddf4c2c = (org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c) videoSink;
            if (interfaceC29791x2ddf4c2c.mo155619x2fdd9927() == null) {
                interfaceC29791x2ddf4c2c.mo155623x7e22589b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.b0(optBoolean, optInt, this));
            }
        }
    }
}
