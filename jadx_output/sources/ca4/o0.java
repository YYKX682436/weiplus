package ca4;

/* loaded from: classes.dex */
public final class o0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsBgmInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsBgmInfo$Creator");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.sns.data.SnsBgmInfo snsBgmInfo = new com.tencent.mm.plugin.sns.data.SnsBgmInfo(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsBgmInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsBgmInfo$Creator");
        return snsBgmInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsBgmInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsBgmInfo$Creator");
        com.tencent.mm.plugin.sns.data.SnsBgmInfo[] snsBgmInfoArr = new com.tencent.mm.plugin.sns.data.SnsBgmInfo[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsBgmInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsBgmInfo$Creator");
        return snsBgmInfoArr;
    }
}
