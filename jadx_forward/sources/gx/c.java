package gx;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx.e f357702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f357703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gx.e eVar, java.util.HashMap hashMap, java.lang.String str) {
        super(2);
        this.f357702d = eVar;
        this.f357703e = hashMap;
        this.f357704f = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        gx.e eVar = this.f357702d;
        java.util.HashMap hashMap = this.f357703e;
        if (z17) {
            eVar.s().mo146xb9724478(eVar.l(hashMap));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiGetBrandServiceInfo", "bobkw getBrandServiceInfo sessionId=" + this.f357704f + ", path=" + str2);
            hashMap.put("jumpPaths", str2);
            hashMap.put("jumpPathDepth", java.lang.String.valueOf(yw.h1.f547876l));
            eVar.s().mo146xb9724478(eVar.l(hashMap));
        }
        return jz5.f0.f384359a;
    }
}
