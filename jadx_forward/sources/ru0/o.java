package ru0;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f481226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(org.json.JSONArray jSONArray) {
        super(2);
        this.f481226d = jSONArray;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        org.json.JSONArray jSONArray = this.f481226d;
        java.lang.String optString = jSONArray.optJSONObject(intValue).optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        java.lang.String optString2 = jSONArray.optJSONObject(intValue2).optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        return kz5.c0.i(optString, optString2);
    }
}
