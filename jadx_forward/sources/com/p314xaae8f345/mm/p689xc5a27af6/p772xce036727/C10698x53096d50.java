package com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/yuanbao/IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo", "Landroid/os/Parcelable;", "yuanbao-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo */
/* loaded from: classes8.dex */
public final class C10698x53096d50 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final int f149398d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f149399e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f149400f;

    /* renamed from: g, reason: collision with root package name */
    public int f149401g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f149402h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f149403i;

    /* renamed from: m, reason: collision with root package name */
    public final int f149404m;

    public C10698x53096d50(int i17, java.lang.String title, java.lang.String url, int i18, boolean z17, boolean z18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f149398d = i17;
        this.f149399e = title;
        this.f149400f = url;
        this.f149401g = i18;
        this.f149402h = z17;
        this.f149403i = z18;
        this.f149404m = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f149398d);
        dest.writeString(this.f149399e);
        dest.writeString(this.f149400f);
        dest.writeInt(this.f149401g);
        dest.writeByte(this.f149402h ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f149403i ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f149404m);
    }
}
