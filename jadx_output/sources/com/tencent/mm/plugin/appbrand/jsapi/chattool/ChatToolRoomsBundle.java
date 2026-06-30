package com.tencent.mm.plugin.appbrand.jsapi.chattool;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolRoomsBundle;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class ChatToolRoomsBundle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolRoomsBundle> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.chattool.h();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f80355d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80356e;

    public ChatToolRoomsBundle(java.util.ArrayList userNameList, java.lang.String chatToolRoomsId) {
        kotlin.jvm.internal.o.g(userNameList, "userNameList");
        kotlin.jvm.internal.o.g(chatToolRoomsId, "chatToolRoomsId");
        this.f80355d = userNameList;
        this.f80356e = chatToolRoomsId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolRoomsBundle)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolRoomsBundle chatToolRoomsBundle = (com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolRoomsBundle) obj;
        return kotlin.jvm.internal.o.b(this.f80355d, chatToolRoomsBundle.f80355d) && kotlin.jvm.internal.o.b(this.f80356e, chatToolRoomsBundle.f80356e);
    }

    public int hashCode() {
        return (this.f80355d.hashCode() * 31) + this.f80356e.hashCode();
    }

    public java.lang.String toString() {
        return "ChatToolRoomsBundle(userNameList=" + this.f80355d + ", chatToolRoomsId=" + this.f80356e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeStringList(this.f80355d);
        out.writeString(this.f80356e);
    }
}
