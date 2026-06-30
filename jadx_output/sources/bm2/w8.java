package bm2;

/* loaded from: classes.dex */
public final class w8 implements android.os.Parcelable.Creator {
    public w8(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(final android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new android.os.Parcelable(parcel) { // from class: com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveWhiteListGroupAdapter$ChatRoomInfo
            public static final bm2.w8 CREATOR = new bm2.w8(null);

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.String f116192d;

            /* renamed from: e, reason: collision with root package name */
            public final java.lang.String f116193e;

            {
                kotlin.jvm.internal.o.g(parcel, "parcel");
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                this.f116192d = readString;
                this.f116193e = readString2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveWhiteListGroupAdapter$ChatRoomInfo)) {
                    return false;
                }
                com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveWhiteListGroupAdapter$ChatRoomInfo finderLiveWhiteListGroupAdapter$ChatRoomInfo = (com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveWhiteListGroupAdapter$ChatRoomInfo) obj;
                return kotlin.jvm.internal.o.b(this.f116192d, finderLiveWhiteListGroupAdapter$ChatRoomInfo.f116192d) && kotlin.jvm.internal.o.b(this.f116193e, finderLiveWhiteListGroupAdapter$ChatRoomInfo.f116193e);
            }

            public int hashCode() {
                java.lang.String str = this.f116192d;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.f116193e;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public java.lang.String toString() {
                return "ChatRoomInfo(username=" + this.f116192d + ", nickname=" + this.f116193e + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                kotlin.jvm.internal.o.g(parcel2, "parcel");
                parcel2.writeString(this.f116192d);
                parcel2.writeString(this.f116193e);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveWhiteListGroupAdapter$ChatRoomInfo[i17];
    }
}
