package com.tencent.mm.modelmulti;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/modelmulti/BizScreenshotMsgInfo;", "Landroid/os/Parcelable;", "w11/d", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class BizScreenshotMsgInfo implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f71251d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f71252e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71253f;

    /* renamed from: g, reason: collision with root package name */
    public final long f71254g;

    /* renamed from: h, reason: collision with root package name */
    public final long f71255h;

    /* renamed from: i, reason: collision with root package name */
    public final long f71256i;

    /* renamed from: m, reason: collision with root package name */
    public static final w11.d f71250m = new w11.d(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.modelmulti.BizScreenshotMsgInfo> CREATOR = new w11.e();

    public BizScreenshotMsgInfo(java.lang.String screenshotId, java.lang.String url, int i17, long j17, long j18, long j19) {
        kotlin.jvm.internal.o.g(screenshotId, "screenshotId");
        kotlin.jvm.internal.o.g(url, "url");
        this.f71251d = screenshotId;
        this.f71252e = url;
        this.f71253f = i17;
        this.f71254g = j17;
        this.f71255h = j18;
        this.f71256i = j19;
    }

    public final boolean a() {
        if (this.f71251d.length() > 0) {
            if (this.f71252e.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final p15.h b() {
        p15.h hVar = new p15.h();
        hVar.t(this.f71251d);
        hVar.q(this.f71252e);
        hVar.u(java.lang.Long.valueOf(this.f71253f));
        hVar.r(java.lang.Long.valueOf(this.f71254g));
        hVar.w(java.lang.Long.valueOf(this.f71255h));
        hVar.s(java.lang.Long.valueOf(this.f71256i));
        return hVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.modelmulti.BizScreenshotMsgInfo)) {
            return false;
        }
        com.tencent.mm.modelmulti.BizScreenshotMsgInfo bizScreenshotMsgInfo = (com.tencent.mm.modelmulti.BizScreenshotMsgInfo) obj;
        return kotlin.jvm.internal.o.b(this.f71251d, bizScreenshotMsgInfo.f71251d) && kotlin.jvm.internal.o.b(this.f71252e, bizScreenshotMsgInfo.f71252e) && this.f71253f == bizScreenshotMsgInfo.f71253f && this.f71254g == bizScreenshotMsgInfo.f71254g && this.f71255h == bizScreenshotMsgInfo.f71255h && this.f71256i == bizScreenshotMsgInfo.f71256i;
    }

    public int hashCode() {
        return (((((((((this.f71251d.hashCode() * 31) + this.f71252e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f71253f)) * 31) + java.lang.Long.hashCode(this.f71254g)) * 31) + java.lang.Long.hashCode(this.f71255h)) * 31) + java.lang.Long.hashCode(this.f71256i);
    }

    public java.lang.String toString() {
        return "BizScreenshotMsgInfo(screenshotId=" + this.f71251d + ", url=" + this.f71252e + ", itemShowType=" + this.f71253f + ", biz=" + this.f71254g + ", mid=" + this.f71255h + ", idx=" + this.f71256i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f71251d);
        out.writeString(this.f71252e);
        out.writeInt(this.f71253f);
        out.writeLong(this.f71254g);
        out.writeLong(this.f71255h);
        out.writeLong(this.f71256i);
    }
}
