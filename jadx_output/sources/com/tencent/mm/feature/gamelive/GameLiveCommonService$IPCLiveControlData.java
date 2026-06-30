package com.tencent.mm.feature.gamelive;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/feature/gamelive/GameLiveCommonService$IPCLiveControlData", "Landroid/os/Parcelable;", "p60/l", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class GameLiveCommonService$IPCLiveControlData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData> CREATOR = new p60.k();

    /* renamed from: d, reason: collision with root package name */
    public final p60.l f67108d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f67109e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67110f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Parcelable f67111g;

    public GameLiveCommonService$IPCLiveControlData(p60.l action, java.lang.String str, int i17, android.os.Parcelable parcelable) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f67108d = action;
        this.f67109e = str;
        this.f67110f = i17;
        this.f67111g = parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData)) {
            return false;
        }
        com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData gameLiveCommonService$IPCLiveControlData = (com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData) obj;
        return this.f67108d == gameLiveCommonService$IPCLiveControlData.f67108d && kotlin.jvm.internal.o.b(this.f67109e, gameLiveCommonService$IPCLiveControlData.f67109e) && this.f67110f == gameLiveCommonService$IPCLiveControlData.f67110f && kotlin.jvm.internal.o.b(this.f67111g, gameLiveCommonService$IPCLiveControlData.f67111g);
    }

    public int hashCode() {
        int hashCode = this.f67108d.hashCode() * 31;
        java.lang.String str = this.f67109e;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f67110f)) * 31;
        android.os.Parcelable parcelable = this.f67111g;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "IPCLiveControlData(action=" + this.f67108d + ", appId=" + this.f67109e + ", versionType=" + this.f67110f + ", payload=" + this.f67111g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f67108d.name());
        out.writeString(this.f67109e);
        out.writeInt(this.f67110f);
        out.writeParcelable(this.f67111g, i17);
    }

    public /* synthetic */ GameLiveCommonService$IPCLiveControlData(p60.l lVar, java.lang.String str, int i17, android.os.Parcelable parcelable, int i18, kotlin.jvm.internal.i iVar) {
        this(lVar, (i18 & 2) != 0 ? null : str, (i18 & 4) != 0 ? 0 : i17, (i18 & 8) != 0 ? null : parcelable);
    }
}
