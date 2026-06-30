package ru0;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f481227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f481228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f481229f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f481230g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f481231h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f481232i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z17, org.json.JSONArray jSONArray, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.ArrayList arrayList) {
        super(2);
        this.f481227d = z17;
        this.f481228e = jSONArray;
        this.f481229f = str;
        this.f481230g = str2;
        this.f481231h = str3;
        this.f481232i = arrayList;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ru0.n nVar;
        int intValue = ((java.lang.Number) obj).intValue();
        org.json.JSONObject word = (org.json.JSONObject) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(word, "word");
        boolean z17 = false;
        if (!this.f481227d || word.optBoolean("stable_flag", false)) {
            org.json.JSONArray jSONArray = this.f481228e;
            int length = jSONArray.length();
            ru0.o oVar = new ru0.o(jSONArray);
            java.lang.String optString = word.optString(this.f481229f);
            long optLong = word.optLong(this.f481230g, 0L);
            long optLong2 = word.optLong(this.f481231h, 0L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (!(optString.length() > 0) || optLong2 < optLong) {
                nVar = null;
            } else {
                if (intValue > 0 && ru0.t.d(optString)) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue - 1);
                    if (intValue != length - 1) {
                        intValue++;
                    }
                    java.lang.Iterable iterable = (java.lang.Iterable) oVar.mo149xb9724478(valueOf, java.lang.Integer.valueOf(intValue));
                    if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                        java.util.Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (!ru0.t.d((java.lang.String) it.next())) {
                                break;
                            }
                        }
                    }
                    z17 = true;
                    if (z17) {
                        nVar = new ru0.n(" ".concat(optString), optLong, optLong2);
                    }
                }
                nVar = new ru0.n(optString, optLong, optLong2);
            }
            if (nVar != null) {
                this.f481232i.add(nVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
