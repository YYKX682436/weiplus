package vu0;

/* loaded from: classes5.dex */
public final class d implements com.p314xaae8f345.p457x3304c6.p482xca9708e2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu0.k f521596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ru0.g f521598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f521599d;

    public d(vu0.k kVar, java.lang.String str, ru0.g gVar, boolean z17) {
        this.f521596a = kVar;
        this.f521597b = str;
        this.f521598c = gVar;
        this.f521599d = z17;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p482xca9708e2.d
    public final void a(java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b, int i17, int i18) {
        org.json.JSONObject a17 = vu0.k.a(this.f521596a, this.f521597b, byteBuffer, c4093x6b88526b, i17, i18);
        if (a17 != null) {
            java.lang.String str = this.f521598c.f481203a;
            vu0.k kVar = this.f521596a;
            kVar.getClass();
            int optInt = a17.optInt("ack_seq");
            java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) kVar.f521645g).get(str);
            vu0.h hVar = kVar.f521643e;
            if (num != null && optInt == num.intValue()) {
                hVar.c(str, vu0.u.f521696h);
            }
            org.json.JSONArray optJSONArray = a17.optJSONArray("results");
            org.json.JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(0) : null;
            org.json.JSONArray optJSONArray2 = a17.optJSONArray("vad_speak_ts");
            boolean optBoolean = a17.optBoolean("is_final");
            if (!optBoolean && (optJSONObject == null || optJSONArray2 == null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AudioRecognitionService", "parseStreamResponseData: results == null isFinal false");
                return;
            }
            java.util.List a18 = optJSONObject != null ? ru0.a.a(optJSONObject, true) : kz5.p0.f395529d;
            a18.toString();
            hVar.b(str, a18, optBoolean, this.f521599d);
        }
    }
}
