package com.tencent.mm.plugin.appbrand.tipsmsg;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/tipsmsg/TipsMsgInfo;", "Ldm/jb;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "rj1/j", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class TipsMsgInfo extends dm.jb implements android.os.Parcelable {
    public static final rj1.j CREATOR = new rj1.j(null);
    public static final l75.e0 D = dm.jb.initAutoDBInfo(com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo.class);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.jb, l75.f0
    public l75.e0 getDBInfo() {
        return D;
    }

    public java.lang.String toString() {
        return "TipsMsgInfo:{appId:" + this.field_appId + ", msgId:" + this.field_msgId + ", businessType:" + this.field_busiType + ", msgType:" + this.field_msgType + ", dataJson:" + this.field_dataJson;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.field_appId);
        dest.writeString(this.field_msgId);
        dest.writeLong(this.field_createTime);
        dest.writeLong(this.field_expireTime);
        dest.writeInt(this.field_busiType);
        dest.writeInt(this.field_msgType);
        dest.writeString(this.field_dataJson);
    }
}
