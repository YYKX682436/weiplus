package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/media/MpVideoDataParcelable;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/media/r0", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable */
/* loaded from: classes8.dex */
public final class C19429x834b7ec5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.r0 f38745x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.r0(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f267262d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f267263e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f267264f;

    /* renamed from: g, reason: collision with root package name */
    public int f267265g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ee f267266h;

    public C19429x834b7ec5(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f267262d = parcel.readString();
        this.f267264f = parcel.readString();
        int readInt = parcel.readInt();
        this.f267265g = readInt;
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            ot0.m1 m1Var = new ot0.m1();
            m1Var.mo11468x92b714fd(bArr);
            this.f267266h = m1Var;
        }
        this.f267263e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f267262d);
        dest.writeString(this.f267264f);
        r45.ee eeVar = this.f267266h;
        byte[] mo14344x5f01b1f6 = eeVar != null ? eeVar.mo14344x5f01b1f6() : null;
        if (mo14344x5f01b1f6 != null) {
            if (!(mo14344x5f01b1f6.length == 0)) {
                int length = mo14344x5f01b1f6.length;
                this.f267265g = length;
                dest.writeInt(length);
                dest.writeByteArray(mo14344x5f01b1f6);
                dest.writeString(this.f267263e);
            }
        }
        dest.writeInt(this.f267265g);
        dest.writeString(this.f267263e);
    }
}
