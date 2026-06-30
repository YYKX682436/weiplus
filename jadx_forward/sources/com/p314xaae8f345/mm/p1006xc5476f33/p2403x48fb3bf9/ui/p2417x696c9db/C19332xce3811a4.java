package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ImageQBarData */
/* loaded from: classes8.dex */
class C19332xce3811a4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19332xce3811a4> f38738x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w5();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f265316d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f265317e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f265318f;

    public C19332xce3811a4(java.util.ArrayList arrayList, java.lang.String str, java.lang.Boolean bool) {
        this.f265316d = arrayList;
        this.f265317e = str;
        this.f265318f = bool.booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f265316d);
        parcel.writeString(this.f265317e);
        parcel.writeByte(this.f265318f ? (byte) 1 : (byte) 0);
    }

    public C19332xce3811a4(android.os.Parcel parcel) {
        this.f265316d = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357.f37911x681a0c0c);
        this.f265317e = parcel.readString();
        this.f265318f = parcel.readByte() != 0;
    }
}
