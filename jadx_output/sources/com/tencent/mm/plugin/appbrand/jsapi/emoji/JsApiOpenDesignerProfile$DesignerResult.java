package com.tencent.mm.plugin.appbrand.jsapi.emoji;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/emoji/JsApiOpenDesignerProfile$DesignerResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final /* data */ class JsApiOpenDesignerProfile$DesignerResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.emoji.i();

    /* renamed from: d, reason: collision with root package name */
    public final int f80815d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80816e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f80817f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f80818g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f80819h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f80820i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f80821m;

    public JsApiOpenDesignerProfile$DesignerResult(int i17, java.lang.String name, java.lang.String headUrl, java.lang.String finderUserName, java.lang.String finderNickname, java.lang.String finderHeadimgUrl, java.lang.String designerDescription) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(headUrl, "headUrl");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(finderNickname, "finderNickname");
        kotlin.jvm.internal.o.g(finderHeadimgUrl, "finderHeadimgUrl");
        kotlin.jvm.internal.o.g(designerDescription, "designerDescription");
        this.f80815d = i17;
        this.f80816e = name;
        this.f80817f = headUrl;
        this.f80818g = finderUserName;
        this.f80819h = finderNickname;
        this.f80820i = finderHeadimgUrl;
        this.f80821m = designerDescription;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult jsApiOpenDesignerProfile$DesignerResult = (com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult) obj;
        return this.f80815d == jsApiOpenDesignerProfile$DesignerResult.f80815d && kotlin.jvm.internal.o.b(this.f80816e, jsApiOpenDesignerProfile$DesignerResult.f80816e) && kotlin.jvm.internal.o.b(this.f80817f, jsApiOpenDesignerProfile$DesignerResult.f80817f) && kotlin.jvm.internal.o.b(this.f80818g, jsApiOpenDesignerProfile$DesignerResult.f80818g) && kotlin.jvm.internal.o.b(this.f80819h, jsApiOpenDesignerProfile$DesignerResult.f80819h) && kotlin.jvm.internal.o.b(this.f80820i, jsApiOpenDesignerProfile$DesignerResult.f80820i) && kotlin.jvm.internal.o.b(this.f80821m, jsApiOpenDesignerProfile$DesignerResult.f80821m);
    }

    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.f80815d) * 31) + this.f80816e.hashCode()) * 31) + this.f80817f.hashCode()) * 31) + this.f80818g.hashCode()) * 31) + this.f80819h.hashCode()) * 31) + this.f80820i.hashCode()) * 31) + this.f80821m.hashCode();
    }

    public java.lang.String toString() {
        return "DesignerResult(designerUin=" + this.f80815d + ", name=" + this.f80816e + ", headUrl=" + this.f80817f + ", finderUserName=" + this.f80818g + ", finderNickname=" + this.f80819h + ", finderHeadimgUrl=" + this.f80820i + ", designerDescription=" + this.f80821m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f80815d);
        out.writeString(this.f80816e);
        out.writeString(this.f80817f);
        out.writeString(this.f80818g);
        out.writeString(this.f80819h);
        out.writeString(this.f80820i);
        out.writeString(this.f80821m);
    }
}
