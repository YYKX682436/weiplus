package k01;

/* loaded from: classes7.dex */
public final class l implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f384577d;

    /* renamed from: e, reason: collision with root package name */
    public final org.json.JSONObject f384578e;

    public l(java.util.List personalCreatorExtraDataList, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(personalCreatorExtraDataList, "personalCreatorExtraDataList");
        this.f384577d = personalCreatorExtraDataList;
        this.f384578e = jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandProfileNativeExtraData", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // l81.p0
    public java.lang.String a() {
        java.lang.String str;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (k01.c1 c1Var : this.f384577d) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("mimeType", c1Var.f384543a);
                jSONObject.put("imagePath", c1Var.f384544b);
                jSONObject.put("originImagePath", c1Var.f384545c);
                jSONObject.put("imageWidth", c1Var.f384546d);
                jSONObject.put("imageHeight", c1Var.f384547e);
                jSONObject.put("isLivePhoto", c1Var.f384548f);
                jSONObject.put("livePhotoVideoPath", c1Var.f384549g);
                jSONObject.put("originLivePhotoVideoPath", c1Var.f384550h);
                jSONObject.put("imageName", c1Var.f384551i);
                jSONObject.put("imageSize", c1Var.f384552j);
                jSONObject.put("livePhotoFileName", c1Var.f384553k);
                jSONObject.put("livePhotoFileSize", c1Var.f384554l);
                jSONObject.put("latitude", c1Var.f384555m);
                jSONObject.put("longitude", c1Var.f384556n);
                jSONObject.put("aiPicId", c1Var.f384557o);
                jSONObject.put("aiPicPrompt", c1Var.f384558p);
                jSONObject.put("aiPicSource", c1Var.f384559q);
                jSONObject.put("aiPicTemplateId", c1Var.f384560r);
                jSONObject.put("aiPicDataBuf", c1Var.f384561s);
                jSONObject.put("aiPicStyle", c1Var.f384562t);
                jSONArray.put(jSONObject);
            }
            org.json.JSONObject jSONObject2 = this.f384578e;
            if (jSONObject2 == null) {
                jSONObject2 = new org.json.JSONObject();
            }
            jSONObject2.put("personalCenterPublishPic", jSONArray);
            str = jSONObject2.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandProfileNativeExtraData", "toJsonString fail since " + e17);
            str = "{}";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }

    @Override // l81.p0
    /* renamed from: creator */
    public l81.o0 mo141701x3d4e802c() {
        return new k01.m();
    }
}
