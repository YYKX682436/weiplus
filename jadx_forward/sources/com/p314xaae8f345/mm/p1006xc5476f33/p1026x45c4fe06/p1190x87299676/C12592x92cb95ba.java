package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/shortlink/WxaShortLinkRiskManager$UploadResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult */
/* loaded from: classes7.dex */
public final /* data */ class C12592x92cb95ba implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba> f35192x681a0c0c = new kj1.j0();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f170405d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f170406e;

    public C12592x92cb95ba(boolean z17, java.lang.String fileUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileUrl, "fileUrl");
        this.f170405d = z17;
        this.f170406e = fileUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52709xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba c12592x92cb95ba = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba) obj;
        return this.f170405d == c12592x92cb95ba.f170405d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170406e, c12592x92cb95ba.f170406e);
    }

    /* renamed from: hashCode */
    public int m52710x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f170405d) * 31) + this.f170406e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52711x9616526c() {
        return "UploadResult(ret=" + this.f170405d + ", fileUrl=" + this.f170406e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f170405d ? 1 : 0);
        out.writeString(this.f170406e);
    }

    public /* synthetic */ C12592x92cb95ba(boolean z17, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i17 & 2) != 0 ? "" : str);
    }
}
