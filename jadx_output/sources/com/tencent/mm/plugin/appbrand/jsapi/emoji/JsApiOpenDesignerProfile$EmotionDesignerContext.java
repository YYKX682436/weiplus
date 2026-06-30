package com.tencent.mm.plugin.appbrand.jsapi.emoji;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/emoji/JsApiOpenDesignerProfile$EmotionDesignerContext", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final /* data */ class JsApiOpenDesignerProfile$EmotionDesignerContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.emoji.j();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80822d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80823e;

    /* renamed from: f, reason: collision with root package name */
    public final int f80824f;

    /* renamed from: g, reason: collision with root package name */
    public final int f80825g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f80826h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f80827i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f80828m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f80829n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f80830o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f80831p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f80832q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f80833r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f80834s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f80835t;

    public JsApiOpenDesignerProfile$EmotionDesignerContext(java.lang.String designerID, java.lang.String searchID, int i17, int i18, java.lang.String oldRedirectUrl, java.lang.String designerName, java.lang.String designerHeadUrl, boolean z17, java.lang.String finderUserName, java.lang.String finderNickName, java.lang.String finderHeadimgUrl, boolean z18, boolean z19, java.lang.String sdkRequestId) {
        kotlin.jvm.internal.o.g(designerID, "designerID");
        kotlin.jvm.internal.o.g(searchID, "searchID");
        kotlin.jvm.internal.o.g(oldRedirectUrl, "oldRedirectUrl");
        kotlin.jvm.internal.o.g(designerName, "designerName");
        kotlin.jvm.internal.o.g(designerHeadUrl, "designerHeadUrl");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(finderNickName, "finderNickName");
        kotlin.jvm.internal.o.g(finderHeadimgUrl, "finderHeadimgUrl");
        kotlin.jvm.internal.o.g(sdkRequestId, "sdkRequestId");
        this.f80822d = designerID;
        this.f80823e = searchID;
        this.f80824f = i17;
        this.f80825g = i18;
        this.f80826h = oldRedirectUrl;
        this.f80827i = designerName;
        this.f80828m = designerHeadUrl;
        this.f80829n = z17;
        this.f80830o = finderUserName;
        this.f80831p = finderNickName;
        this.f80832q = finderHeadimgUrl;
        this.f80833r = z18;
        this.f80834s = z19;
        this.f80835t = sdkRequestId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext jsApiOpenDesignerProfile$EmotionDesignerContext = (com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext) obj;
        return kotlin.jvm.internal.o.b(this.f80822d, jsApiOpenDesignerProfile$EmotionDesignerContext.f80822d) && kotlin.jvm.internal.o.b(this.f80823e, jsApiOpenDesignerProfile$EmotionDesignerContext.f80823e) && this.f80824f == jsApiOpenDesignerProfile$EmotionDesignerContext.f80824f && this.f80825g == jsApiOpenDesignerProfile$EmotionDesignerContext.f80825g && kotlin.jvm.internal.o.b(this.f80826h, jsApiOpenDesignerProfile$EmotionDesignerContext.f80826h) && kotlin.jvm.internal.o.b(this.f80827i, jsApiOpenDesignerProfile$EmotionDesignerContext.f80827i) && kotlin.jvm.internal.o.b(this.f80828m, jsApiOpenDesignerProfile$EmotionDesignerContext.f80828m) && this.f80829n == jsApiOpenDesignerProfile$EmotionDesignerContext.f80829n && kotlin.jvm.internal.o.b(this.f80830o, jsApiOpenDesignerProfile$EmotionDesignerContext.f80830o) && kotlin.jvm.internal.o.b(this.f80831p, jsApiOpenDesignerProfile$EmotionDesignerContext.f80831p) && kotlin.jvm.internal.o.b(this.f80832q, jsApiOpenDesignerProfile$EmotionDesignerContext.f80832q) && this.f80833r == jsApiOpenDesignerProfile$EmotionDesignerContext.f80833r && this.f80834s == jsApiOpenDesignerProfile$EmotionDesignerContext.f80834s && kotlin.jvm.internal.o.b(this.f80835t, jsApiOpenDesignerProfile$EmotionDesignerContext.f80835t);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f80822d.hashCode() * 31) + this.f80823e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f80824f)) * 31) + java.lang.Integer.hashCode(this.f80825g)) * 31) + this.f80826h.hashCode()) * 31) + this.f80827i.hashCode()) * 31) + this.f80828m.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f80829n)) * 31) + this.f80830o.hashCode()) * 31) + this.f80831p.hashCode()) * 31) + this.f80832q.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f80833r)) * 31) + java.lang.Boolean.hashCode(this.f80834s)) * 31) + this.f80835t.hashCode();
    }

    public java.lang.String toString() {
        return "EmotionDesignerContext(designerID=" + this.f80822d + ", searchID=" + this.f80823e + ", operationScene=" + this.f80824f + ", designerUin=" + this.f80825g + ", oldRedirectUrl=" + this.f80826h + ", designerName=" + this.f80827i + ", designerHeadUrl=" + this.f80828m + ", containsFinderUserName=" + this.f80829n + ", finderUserName=" + this.f80830o + ", finderNickName=" + this.f80831p + ", finderHeadimgUrl=" + this.f80832q + ", needJumpToSingleEmoji=" + this.f80833r + ", needJumpToEmoticonTab=" + this.f80834s + ", sdkRequestId=" + this.f80835t + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f80822d);
        out.writeString(this.f80823e);
        out.writeInt(this.f80824f);
        out.writeInt(this.f80825g);
        out.writeString(this.f80826h);
        out.writeString(this.f80827i);
        out.writeString(this.f80828m);
        out.writeInt(this.f80829n ? 1 : 0);
        out.writeString(this.f80830o);
        out.writeString(this.f80831p);
        out.writeString(this.f80832q);
        out.writeInt(this.f80833r ? 1 : 0);
        out.writeInt(this.f80834s ? 1 : 0);
        out.writeString(this.f80835t);
    }
}
