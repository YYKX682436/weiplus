package ru0;

/* loaded from: classes5.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f481219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f481220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f481221f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j17, float f17, java.util.ArrayList arrayList) {
        super(1);
        this.f481219d = j17;
        this.f481220e = f17;
        this.f481221f = arrayList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject sentence = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sentence, "sentence");
        java.lang.String optString = sentence.optString("langid_lang");
        org.json.JSONArray optJSONArray = sentence.optJSONArray("sents");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() > 0) {
            if (optJSONArray != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optJSONArray);
                c75.c.d(optJSONArray, new ru0.k(this.f481219d, this.f481220e, optString, this.f481221f));
            }
        }
        return jz5.f0.f384359a;
    }
}
