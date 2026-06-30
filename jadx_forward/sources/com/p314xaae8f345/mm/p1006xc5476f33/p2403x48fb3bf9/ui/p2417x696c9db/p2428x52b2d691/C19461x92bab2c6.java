package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiShowOpenIMContactProfile$JumpProfileData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/newjsapi/kd", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile$JumpProfileData */
/* loaded from: classes.dex */
final class C19461x92bab2c6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.kd f38769x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.kd(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267456d;

    /* renamed from: e, reason: collision with root package name */
    public final int f267457e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f267458f;

    /* renamed from: g, reason: collision with root package name */
    public final int f267459g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f267460h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f267461i;

    public C19461x92bab2c6(java.lang.String str, byte[] bArr, int i17, java.lang.String bizInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizInfo, "bizInfo");
        this.f267456d = str;
        this.f267458f = bArr;
        this.f267459g = i17;
        this.f267460h = bizInfo;
        this.f267457e = bArr != null ? bArr.length : 0;
        this.f267461i = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f267456d);
        dest.writeInt(this.f267457e);
        dest.writeInt(this.f267459g);
        dest.writeString(this.f267460h);
        dest.writeByteArray(this.f267458f);
        dest.writeByte(this.f267461i ? (byte) 1 : (byte) 0);
    }

    public C19461x92bab2c6(android.os.Parcel src) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        java.lang.String readString = src.readString();
        this.f267456d = readString == null ? "" : readString;
        int readInt = src.readInt();
        this.f267457e = readInt;
        this.f267459g = src.readInt();
        java.lang.String readString2 = src.readString();
        this.f267460h = readString2 != null ? readString2 : "";
        byte[] bArr = new byte[readInt];
        src.readByteArray(bArr);
        this.f267458f = bArr;
        this.f267461i = src.readByte() != 0;
    }
}
