package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams */
/* loaded from: classes8.dex */
public class C19410x64c9504 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.C19410x64c9504> f38744x681a0c0c = new sx4.w();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f266295d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f266296e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f266297f;

    public C19410x64c9504(android.os.Parcel parcel, sx4.w wVar) {
        this.f266295d = parcel.readString();
        this.f266296e = parcel.readString();
        this.f266297f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f266295d);
        parcel.writeString(this.f266296e);
        parcel.writeString(this.f266297f);
    }
}
