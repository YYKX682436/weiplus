package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f295491a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f295492b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f295493c;

    /* renamed from: d, reason: collision with root package name */
    public final int f295494d;

    public o1(org.json.JSONObject jSONObject) {
        this.f295491a = "";
        this.f295492b = "";
        this.f295493c = "";
        this.f295494d = 0;
        jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030);
        this.f295491a = jSONObject.optString("device_name");
        this.f295492b = jSONObject.optString("device_os");
        this.f295494d = jSONObject.optInt("Is_cur_device");
        this.f295493c = jSONObject.optString("crt_no");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.m82996xcee59d22()[jSONObject.optInt("cert_encrypt_type")];
    }
}
