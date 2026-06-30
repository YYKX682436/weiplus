package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes.dex */
public final class OpenBusinessViewUtil$NavigateBackH5Task extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$NavigateBackH5Task> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.g0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f80898f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f80899g;

    /* renamed from: h, reason: collision with root package name */
    public int f80900h;

    public OpenBusinessViewUtil$NavigateBackH5Task() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f80898f = parcel.readString();
        this.f80899g = parcel.readString();
        this.f80900h = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f80898f);
        parcel.writeString(this.f80899g);
        parcel.writeInt(this.f80900h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.lang.String str = this.f80899g;
        int i17 = this.f80900h;
        com.tencent.mm.autogen.events.NavigateBackH5Event navigateBackH5Event = new com.tencent.mm.autogen.events.NavigateBackH5Event();
        am.mk mkVar = navigateBackH5Event.f54515g;
        mkVar.getClass();
        mkVar.f7352a = i17;
        mkVar.f7353b = str;
        navigateBackH5Event.e();
    }

    public OpenBusinessViewUtil$NavigateBackH5Task(java.lang.String str, java.lang.String str2, int i17) {
        this.f80898f = str;
        this.f80899g = str2;
        this.f80900h = i17;
    }
}
