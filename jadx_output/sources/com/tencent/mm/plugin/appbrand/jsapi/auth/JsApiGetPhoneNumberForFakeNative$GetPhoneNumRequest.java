package com.tencent.mm.plugin.appbrand.jsapi.auth;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001&B'\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010$J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0014J\b\u0010\u000e\u001a\u00020\bH\u0016R\"\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u000f\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006'"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "in", "Ljz5/f0;", "readParcel", "parcel", "", "flags", "writeToParcel", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/jsapi/auth/d2;", "getTaskClass", "describeContents", "d", "I", "a", "()I", "e", "(I)V", "businessId", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "displayName", "h", "usageDescription", "g", "c", "iconURL", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/auth/z1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.auth.z1 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.auth.z1(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int businessId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private java.lang.String displayName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private java.lang.String usageDescription;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private java.lang.String iconURL;

    public JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest(int i17, java.lang.String displayName, java.lang.String usageDescription, java.lang.String iconURL) {
        kotlin.jvm.internal.o.g(displayName, "displayName");
        kotlin.jvm.internal.o.g(usageDescription, "usageDescription");
        kotlin.jvm.internal.o.g(iconURL, "iconURL");
        this.businessId = i17;
        this.displayName = displayName;
        this.usageDescription = usageDescription;
        this.iconURL = iconURL;
    }

    /* renamed from: a, reason: from getter */
    public final int getBusinessId() {
        return this.businessId;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: c, reason: from getter */
    public final java.lang.String getIconURL() {
        return this.iconURL;
    }

    /* renamed from: d, reason: from getter */
    public final java.lang.String getUsageDescription() {
        return this.usageDescription;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(int i17) {
        this.businessId = i17;
    }

    public final void f(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.displayName = str;
    }

    public final void g(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.iconURL = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.auth.d2> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.auth.d2.class;
    }

    public final void h(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.usageDescription = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.d(parcel);
        this.businessId = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.displayName = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this.usageDescription = readString2;
        java.lang.String readString3 = parcel.readString();
        this.iconURL = readString3 != null ? readString3 : "";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.businessId);
        parcel.writeString(this.displayName);
        parcel.writeString(this.usageDescription);
        parcel.writeString(this.iconURL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.g(r5, r0)
            int r0 = r5.readInt()
            java.lang.String r1 = r5.readString()
            java.lang.String r2 = ""
            if (r1 != 0) goto L12
            r1 = r2
        L12:
            java.lang.String r3 = r5.readString()
            if (r3 != 0) goto L19
            r3 = r2
        L19:
            java.lang.String r5 = r5.readString()
            if (r5 != 0) goto L20
            goto L21
        L20:
            r2 = r5
        L21:
            r4.<init>(r0, r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest.<init>(android.os.Parcel):void");
    }
}
