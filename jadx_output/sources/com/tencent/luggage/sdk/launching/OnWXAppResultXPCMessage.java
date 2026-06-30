package com.tencent.luggage.sdk.launching;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/launching/OnWXAppResultXPCMessage;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class OnWXAppResultXPCMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage> CREATOR = new com.tencent.luggage.sdk.launching.l();

    /* renamed from: d, reason: collision with root package name */
    public final int f47600d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47601e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Parcelable f47602f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f47603g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f47604h;

    public OnWXAppResultXPCMessage(int i17, int i18, android.os.Parcelable parcelable, java.lang.String str, java.lang.String str2) {
        this.f47600d = i17;
        this.f47601e = i18;
        this.f47602f = parcelable;
        this.f47603g = str;
        this.f47604h = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage)) {
            return false;
        }
        com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage onWXAppResultXPCMessage = (com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage) obj;
        return this.f47600d == onWXAppResultXPCMessage.f47600d && this.f47601e == onWXAppResultXPCMessage.f47601e && kotlin.jvm.internal.o.b(this.f47602f, onWXAppResultXPCMessage.f47602f) && kotlin.jvm.internal.o.b(this.f47603g, onWXAppResultXPCMessage.f47603g) && kotlin.jvm.internal.o.b(this.f47604h, onWXAppResultXPCMessage.f47604h);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f47600d) * 31) + java.lang.Integer.hashCode(this.f47601e)) * 31;
        android.os.Parcelable parcelable = this.f47602f;
        int hashCode2 = (hashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        java.lang.String str = this.f47603g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f47604h;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "OnWXAppResultXPCMessage(instance=" + this.f47600d + ", action=" + this.f47601e + ", data=" + this.f47602f + ", stacktrace=" + this.f47603g + ", callProcess=" + this.f47604h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f47600d);
        out.writeInt(this.f47601e);
        out.writeParcelable(this.f47602f, i17);
        out.writeString(this.f47603g);
        out.writeString(this.f47604h);
    }

    public OnWXAppResultXPCMessage(int i17, int i18, android.os.Parcelable parcelable, java.lang.String str, java.lang.String str2, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, i18, parcelable, (i19 & 8) != 0 ? android.util.Log.getStackTraceString(new java.lang.Throwable()) : str, (i19 & 16) != 0 ? bm5.f1.a() : str2);
    }
}
