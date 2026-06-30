package com.tencent.mm.plugin.appbrand.jsapi.chattool;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class ChatToolParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.chattool.g();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f80345d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80346e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f80347f;

    /* renamed from: g, reason: collision with root package name */
    public final int f80348g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f80349h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f80350i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f80351m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f80352n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f80353o;

    /* renamed from: p, reason: collision with root package name */
    public final int f80354p;

    public ChatToolParams(boolean z17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, boolean z18, java.lang.String str5, java.lang.String str6, int i18) {
        this.f80345d = z17;
        this.f80346e = str;
        this.f80347f = str2;
        this.f80348g = i17;
        this.f80349h = str3;
        this.f80350i = str4;
        this.f80351m = z18;
        this.f80352n = str5;
        this.f80353o = str6;
        this.f80354p = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams = (com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams) obj;
        return this.f80345d == chatToolParams.f80345d && kotlin.jvm.internal.o.b(this.f80346e, chatToolParams.f80346e) && kotlin.jvm.internal.o.b(this.f80347f, chatToolParams.f80347f) && this.f80348g == chatToolParams.f80348g && kotlin.jvm.internal.o.b(this.f80349h, chatToolParams.f80349h) && kotlin.jvm.internal.o.b(this.f80350i, chatToolParams.f80350i) && this.f80351m == chatToolParams.f80351m && kotlin.jvm.internal.o.b(this.f80352n, chatToolParams.f80352n) && kotlin.jvm.internal.o.b(this.f80353o, chatToolParams.f80353o) && this.f80354p == chatToolParams.f80354p;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f80345d) * 31;
        java.lang.String str = this.f80346e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f80347f;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f80348g)) * 31;
        java.lang.String str3 = this.f80349h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f80350i;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f80351m)) * 31;
        java.lang.String str5 = this.f80352n;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f80353o;
        return ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f80354p);
    }

    public java.lang.String toString() {
        return "ChatToolParams(needEntrance=" + this.f80345d + ", appId=" + this.f80346e + ", entrancePath=" + this.f80347f + ", showSourceView=" + this.f80348g + ", iconUrl=" + this.f80349h + ", nickName=" + this.f80350i + ", useForChatTool=" + this.f80351m + ", sendToUserName=" + this.f80352n + ", chatToolRoom=" + this.f80353o + ", versionType=" + this.f80354p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f80345d ? 1 : 0);
        out.writeString(this.f80346e);
        out.writeString(this.f80347f);
        out.writeInt(this.f80348g);
        out.writeString(this.f80349h);
        out.writeString(this.f80350i);
        out.writeInt(this.f80351m ? 1 : 0);
        out.writeString(this.f80352n);
        out.writeString(this.f80353o);
        out.writeInt(this.f80354p);
    }
}
