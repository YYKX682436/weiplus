package aj3;

/* loaded from: classes14.dex */
public class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember = new com.tencent.mm.modeltalkroom.MultiTalkGroupMember();
        java.lang.String readString = parcel.readString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (readString == null) {
            readString = "";
        }
        multiTalkGroupMember.f71612d = readString;
        java.lang.String readString2 = parcel.readString();
        multiTalkGroupMember.f71613e = readString2 != null ? readString2 : "";
        multiTalkGroupMember.f71614f = parcel.readInt();
        multiTalkGroupMember.f71615g = parcel.readInt();
        multiTalkGroupMember.f71616h = parcel.readInt();
        return new com.tencent.mm.plugin.multitalk.data.MultiTalkGroupMemberData(multiTalkGroupMember);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.multitalk.data.MultiTalkGroupMemberData[i17];
    }
}
