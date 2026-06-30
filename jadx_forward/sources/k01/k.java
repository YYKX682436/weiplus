package k01;

/* loaded from: classes7.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f384575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.List list) {
        super(1);
        this.f384575d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject jsonObject = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        java.lang.String string = jsonObject.getString("mimeType");
        java.lang.String string2 = jsonObject.getString("imagePath");
        int optInt = jsonObject.optInt("imageWidth", 0);
        int optInt2 = jsonObject.optInt("imageHeight", 0);
        boolean optBoolean = jsonObject.optBoolean("isLivePhoto", false);
        java.lang.String optString = jsonObject.optString("livePhotoVideoPath", "");
        java.lang.String optString2 = jsonObject.optString("originLivePhotoVideoPath", "");
        java.lang.String optString3 = jsonObject.optString("originImagePath", "");
        java.lang.String optString4 = jsonObject.optString("imageName", "");
        int optInt3 = jsonObject.optInt("imageSize", 0);
        java.lang.String optString5 = jsonObject.optString("livePhotoFileName", "");
        int optInt4 = jsonObject.optInt("livePhotoFileSize", 0);
        double optDouble = jsonObject.optDouble("longitude", 0.0d);
        double optDouble2 = jsonObject.optDouble("latitude", 0.0d);
        java.lang.String optString6 = jsonObject.optString("aiPicId", "");
        java.lang.String str = optString6.length() == 0 ? null : optString6;
        java.lang.String optString7 = jsonObject.optString("aiPicPrompt", "");
        java.lang.String str2 = optString7.length() == 0 ? null : optString7;
        java.lang.Long valueOf = java.lang.Long.valueOf(jsonObject.optLong("aiPicSource", -1L));
        java.lang.Long l17 = (valueOf.longValue() > (-1L) ? 1 : (valueOf.longValue() == (-1L) ? 0 : -1)) != 0 ? valueOf : null;
        java.lang.String optString8 = jsonObject.optString("aiPicTemplateId", "");
        java.lang.String str3 = optString8.length() == 0 ? null : optString8;
        java.lang.String optString9 = jsonObject.optString("aiPicDataBuf", "");
        java.lang.String str4 = optString9.length() == 0 ? null : optString9;
        java.lang.String optString10 = jsonObject.optString("aiPicStyle", "");
        if (optString10.length() == 0) {
            optString10 = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
        this.f384575d.add(new k01.c1(string, string2, optString3, optInt, optInt2, optBoolean, optString, optString2, optString4, optInt3, optString5, optInt4, optDouble2, optDouble, str, str2, l17, str3, str4, optString10));
        return jz5.f0.f384359a;
    }
}
