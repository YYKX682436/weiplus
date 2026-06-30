package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class HCEEventLogic$SendHCEEventToMMTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.nfc.HCEEventLogic$SendHCEEventToMMTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.nfc.c();

    /* renamed from: f, reason: collision with root package name */
    public int f82389f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f82390g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Bundle f82391h;

    public /* synthetic */ HCEEventLogic$SendHCEEventToMMTask(java.lang.String str, int i17, android.os.Bundle bundle, com.tencent.mm.plugin.appbrand.jsapi.nfc.b bVar) {
        this(str, i17, bundle);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f82389f = parcel.readInt();
        this.f82390g = parcel.readString();
        this.f82391h = parcel.readBundle();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f82389f);
        parcel.writeString(this.f82390g);
        parcel.writeBundle(this.f82391h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEEventLogic", "HCEEventLogic SendHCEEventToMMTask runInMainProcess");
        cd1.o.f40641n.c(this.f82389f, this.f82390g, this.f82391h);
        c();
    }

    private HCEEventLogic$SendHCEEventToMMTask(java.lang.String str, int i17, android.os.Bundle bundle) {
        this.f82389f = i17;
        this.f82390g = str;
        this.f82391h = bundle;
    }

    public HCEEventLogic$SendHCEEventToMMTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
