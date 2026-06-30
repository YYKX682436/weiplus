package vu0;

/* loaded from: classes5.dex */
public final class i implements com.p314xaae8f345.p457x3304c6.p482xca9708e2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu0.k f521628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521630c;

    public i(vu0.k kVar, java.lang.String str, java.lang.String str2) {
        this.f521628a = kVar;
        this.f521629b = str;
        this.f521630c = str2;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p482xca9708e2.d
    public final void a(java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b, int i17, int i18) {
        org.json.JSONArray optJSONArray;
        org.json.JSONObject a17 = vu0.k.a(this.f521628a, this.f521629b, byteBuffer, c4093x6b88526b, i17, i18);
        if (a17 != null) {
            java.lang.String str = this.f521630c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            vu0.k kVar = this.f521628a;
            kVar.getClass();
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.optString("voice_id"), str);
            java.lang.String str2 = this.f521629b;
            vu0.h hVar = kVar.f521643e;
            if (b17) {
                hVar.c(str2, vu0.u.f521696h);
            }
            org.json.JSONObject optJSONObject = a17.optJSONObject(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55720x1b30a884);
            org.json.JSONObject optJSONObject2 = (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("sentences")) == null) ? null : optJSONArray.optJSONObject(0);
            java.util.List a18 = optJSONObject2 != null ? ru0.a.a(optJSONObject2, false) : kz5.p0.f395529d;
            a18.toString();
            hVar.a(str2, a18, true);
        }
    }
}
