package bi1;

/* loaded from: classes7.dex */
public final class e implements l81.p0 {

    /* renamed from: h, reason: collision with root package name */
    public static final bi1.d f20977h = new bi1.d(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f20978d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20979e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f20980f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20981g;

    public e(java.lang.String mimeType, java.lang.String materialPath, java.lang.String materialName, int i17) {
        kotlin.jvm.internal.o.g(mimeType, "mimeType");
        kotlin.jvm.internal.o.g(materialPath, "materialPath");
        kotlin.jvm.internal.o.g(materialName, "materialName");
        this.f20978d = mimeType;
        this.f20979e = materialPath;
        this.f20980f = materialName;
        this.f20981g = i17;
    }

    @Override // l81.p0
    public java.lang.String a() {
        java.lang.String str;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("mimeType", this.f20978d);
            jSONObject.put("materialPath", this.f20979e);
            jSONObject.put("materialName", this.f20980f);
            jSONObject.put("materialSize", this.f20981g);
            str = jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialNativeExtraData", "toJsonString fail since " + e17);
            str = "{}";
        }
        kotlin.jvm.internal.o.d(str);
        return str;
    }

    public /* synthetic */ e(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(str, str2, (i18 & 4) != 0 ? "" : str3, (i18 & 8) != 0 ? 0 : i17);
    }
}
