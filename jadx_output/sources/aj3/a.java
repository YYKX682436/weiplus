package aj3;

/* loaded from: classes14.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = new com.tencent.mm.modeltalkroom.MultiTalkGroup();
        java.lang.String readString = parcel.readString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (readString == null) {
            readString = "";
        }
        multiTalkGroup.f71606d = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        multiTalkGroup.f71607e = readString2;
        java.lang.String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        multiTalkGroup.f71608f = readString3;
        multiTalkGroup.f71609g = parcel.readInt();
        java.lang.String readString4 = parcel.readString();
        multiTalkGroup.f71610h = readString4 != null ? readString4 : "";
        int readInt = parcel.readInt();
        multiTalkGroup.f71611i = new java.util.ArrayList();
        for (int i17 = 0; i17 < readInt; i17++) {
            multiTalkGroup.f71611i.add(((com.tencent.mm.plugin.multitalk.data.MultiTalkGroupMemberData) parcel.readParcelable(com.tencent.mm.plugin.multitalk.data.MultiTalkGroupMemberData.class.getClassLoader())).f149495d);
        }
        return new com.tencent.mm.plugin.multitalk.data.MultiTalkGroupData(multiTalkGroup);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.multitalk.data.MultiTalkGroupData[i17];
    }
}
