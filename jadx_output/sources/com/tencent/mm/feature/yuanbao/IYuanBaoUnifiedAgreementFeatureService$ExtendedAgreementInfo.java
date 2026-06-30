package com.tencent.mm.feature.yuanbao;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/yuanbao/IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo", "Landroid/os/Parcelable;", "yuanbao-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final int f67865d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f67866e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f67867f;

    /* renamed from: g, reason: collision with root package name */
    public int f67868g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f67869h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f67870i;

    /* renamed from: m, reason: collision with root package name */
    public final int f67871m;

    public IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo(int i17, java.lang.String title, java.lang.String url, int i18, boolean z17, boolean z18, int i19) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(url, "url");
        this.f67865d = i17;
        this.f67866e = title;
        this.f67867f = url;
        this.f67868g = i18;
        this.f67869h = z17;
        this.f67870i = z18;
        this.f67871m = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f67865d);
        dest.writeString(this.f67866e);
        dest.writeString(this.f67867f);
        dest.writeInt(this.f67868g);
        dest.writeByte(this.f67869h ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f67870i ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f67871m);
    }
}
