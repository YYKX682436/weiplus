package it2;

/* loaded from: classes3.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ it2.x f376054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f376055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376058h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f376059i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(it2.x xVar, yz5.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        super(0);
        this.f376054d = xVar;
        this.f376055e = lVar;
        this.f376056f = str;
        this.f376057g = str2;
        this.f376058h = str3;
        this.f376059i = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        it2.x xVar = this.f376054d;
        xVar.Ai();
        java.lang.String Bi = xVar.Bi();
        yz5.l lVar = this.f376055e;
        if (Bi == null) {
            lVar.mo146xb9724478(rs5.h.f480894i);
        } else {
            int andIncrement = it2.x.f376061s.getAndIncrement();
            xVar.f376071o.put(andIncrement, lVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start prepare resource ");
            java.lang.String str = this.f376056f;
            sb6.append(str);
            sb6.append(" with url: ");
            java.lang.String str2 = this.f376057g;
            sb6.append(str2);
            sb6.append(", md5: ");
            java.lang.String str3 = this.f376058h;
            sb6.append(str3);
            sb6.append(", callbackId: ");
            sb6.append(andIncrement);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardFeatureService", sb6.toString());
            java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l("resourceName", str), new jz5.l("url", str2), new jz5.l("md5", str3), new jz5.l("force", java.lang.Boolean.valueOf(this.f376059i)), new jz5.l("callbackId", java.lang.Integer.valueOf(andIncrement)))).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            xVar.wi("OnPrepareResource", jSONObject);
        }
        return jz5.f0.f384359a;
    }
}
