package ot0;

/* loaded from: classes9.dex */
public class e extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f429975b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f429976c;

    /* renamed from: d, reason: collision with root package name */
    public long f429977d;

    /* renamed from: e, reason: collision with root package name */
    public long f429978e;

    /* renamed from: f, reason: collision with root package name */
    public int f429979f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f429980g;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.e();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (qVar.f430199i == 2001) {
            sb6.append("<voice>");
            sb6.append("<voiceurl>");
            sb6.append(ot0.q.g(this.f429975b));
            sb6.append("</voiceurl>");
            sb6.append("<aeskey>");
            sb6.append(ot0.q.g(this.f429976c));
            sb6.append("</aeskey>");
            sb6.append("<length>");
            sb6.append(this.f429977d);
            sb6.append("</length>");
            sb6.append("<playtime>");
            sb6.append(this.f429978e);
            sb6.append("</playtime>");
            sb6.append("<format>");
            sb6.append(this.f429979f);
            sb6.append("</format>");
            sb6.append("<key_words>");
            sb6.append(ot0.q.g(this.f429980g));
            sb6.append("</key_words>");
            sb6.append("</voice>");
        }
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (qVar.f430199i == 2001) {
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.voice.voiceurl");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            this.f429975b = str;
            java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.voice.aeskey");
            if (str2 == null) {
                str2 = "";
            }
            this.f429976c = str2;
            this.f429977d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".msg.appmsg.voice.length"), 0L);
            this.f429978e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".msg.appmsg.voice.playtime"), 0L);
            this.f429979f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.voice.format"), 0);
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.voice.key_words");
            if (str3 == null) {
                str3 = "";
            }
            this.f429980g = str3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppContentLuckyMoneyVoicePiece", "voiceUrl:%s asekey:%s keywords:%s", this.f429975b, this.f429976c, str3);
            java.lang.String str4 = qVar.f430211l;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f429975b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f429976c) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f429980g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppContentLuckyMoneyVoicePiece", "need parse lowUrl:%s", str4);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    return;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(str4, 0)));
                    this.f429975b = jSONObject.optString("voice_url");
                    this.f429976c = jSONObject.optString("voice_aeskey");
                    this.f429977d = jSONObject.optLong("voice_file_length");
                    this.f429978e = jSONObject.optLong("voice_playtime");
                    this.f429979f = jSONObject.optInt("voice_format");
                    this.f429980g = jSONObject.optString("voice_key_words");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppContentLuckyMoneyVoicePiece", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }
}
