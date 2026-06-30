package com.tencent.mm.plugin.appbrand.jsapi.webview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/webview/EmojiFetcher$EmojiArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class EmojiFetcher$EmojiArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.webview.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83865d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f83866e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f83867f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f83868g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f83869h;

    public EmojiFetcher$EmojiArgs(java.lang.String md52, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.o.g(md52, "md5");
        this.f83865d = md52;
        this.f83866e = str;
        this.f83867f = str2;
        this.f83868g = str3;
        this.f83869h = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs emojiFetcher$EmojiArgs = (com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs) obj;
        return kotlin.jvm.internal.o.b(this.f83865d, emojiFetcher$EmojiArgs.f83865d) && kotlin.jvm.internal.o.b(this.f83866e, emojiFetcher$EmojiArgs.f83866e) && kotlin.jvm.internal.o.b(this.f83867f, emojiFetcher$EmojiArgs.f83867f) && kotlin.jvm.internal.o.b(this.f83868g, emojiFetcher$EmojiArgs.f83868g) && kotlin.jvm.internal.o.b(this.f83869h, emojiFetcher$EmojiArgs.f83869h);
    }

    public int hashCode() {
        int hashCode = this.f83865d.hashCode() * 31;
        java.lang.String str = this.f83866e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f83867f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f83868g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f83869h;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EmojiArgs(md5='");
        sb6.append(this.f83865d);
        sb6.append("', encryptUrl=");
        java.lang.String str = this.f83866e;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", aesKey=");
        java.lang.String str2 = this.f83867f;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(", productId=");
        java.lang.String str3 = this.f83868g;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(", designerId=");
        java.lang.String str4 = this.f83869h;
        sb6.append(str4 != null ? str4 : "");
        sb6.append(')');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f83865d);
        out.writeString(this.f83866e);
        out.writeString(this.f83867f);
        out.writeString(this.f83868g);
        out.writeString(this.f83869h);
    }
}
