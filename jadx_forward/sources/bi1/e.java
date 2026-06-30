package bi1;

/* loaded from: classes7.dex */
public final class e implements l81.p0 {

    /* renamed from: h, reason: collision with root package name */
    public static final bi1.d f102510h = new bi1.d(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f102511d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f102512e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f102513f;

    /* renamed from: g, reason: collision with root package name */
    public final int f102514g;

    public e(java.lang.String mimeType, java.lang.String materialPath, java.lang.String materialName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mimeType, "mimeType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialPath, "materialPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialName, "materialName");
        this.f102511d = mimeType;
        this.f102512e = materialPath;
        this.f102513f = materialName;
        this.f102514g = i17;
    }

    @Override // l81.p0
    public java.lang.String a() {
        java.lang.String str;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("mimeType", this.f102511d);
            jSONObject.put("materialPath", this.f102512e);
            jSONObject.put("materialName", this.f102513f);
            jSONObject.put("materialSize", this.f102514g);
            str = jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialNativeExtraData", "toJsonString fail since " + e17);
            str = "{}";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }

    public /* synthetic */ e(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, (i18 & 4) != 0 ? "" : str3, (i18 & 8) != 0 ? 0 : i17);
    }
}
