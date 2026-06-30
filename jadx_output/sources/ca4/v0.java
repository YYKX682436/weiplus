package ca4;

/* loaded from: classes.dex */
public class v0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
        com.tencent.mm.plugin.sns.data.SnsTagList snsTagList = new com.tencent.mm.plugin.sns.data.SnsTagList();
        int readInt = parcel.readInt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.data.SnsTagList");
        snsTagList.f164023d = readInt;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.data.SnsTagList");
        int i17 = 0;
        while (true) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsTagList");
            int i18 = snsTagList.f164023d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsTagList");
            if (i17 >= i18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
                return snsTagList;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsTagList");
            java.util.List list = snsTagList.f164024e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsTagList");
            ((java.util.LinkedList) list).add(java.lang.Long.valueOf(parcel.readLong()));
            i17++;
        }
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
        com.tencent.mm.plugin.sns.data.SnsTagList[] snsTagListArr = new com.tencent.mm.plugin.sns.data.SnsTagList[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
        return snsTagListArr;
    }
}
