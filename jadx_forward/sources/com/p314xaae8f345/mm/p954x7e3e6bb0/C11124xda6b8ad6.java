package com.p314xaae8f345.mm.p954x7e3e6bb0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/modelmulti/BizScreenshotMsgInfo;", "Landroid/os/Parcelable;", "w11/d", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.modelmulti.BizScreenshotMsgInfo */
/* loaded from: classes9.dex */
public final /* data */ class C11124xda6b8ad6 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f152784d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f152785e;

    /* renamed from: f, reason: collision with root package name */
    public final int f152786f;

    /* renamed from: g, reason: collision with root package name */
    public final long f152787g;

    /* renamed from: h, reason: collision with root package name */
    public final long f152788h;

    /* renamed from: i, reason: collision with root package name */
    public final long f152789i;

    /* renamed from: m, reason: collision with root package name */
    public static final w11.d f152783m = new w11.d(null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6> f32564x681a0c0c = new w11.e();

    public C11124xda6b8ad6(java.lang.String screenshotId, java.lang.String url, int i17, long j17, long j18, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screenshotId, "screenshotId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f152784d = screenshotId;
        this.f152785e = url;
        this.f152786f = i17;
        this.f152787g = j17;
        this.f152788h = j18;
        this.f152789i = j19;
    }

    public final boolean a() {
        if (this.f152784d.length() > 0) {
            if (this.f152785e.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final p15.h b() {
        p15.h hVar = new p15.h();
        hVar.t(this.f152784d);
        hVar.q(this.f152785e);
        hVar.u(java.lang.Long.valueOf(this.f152786f));
        hVar.r(java.lang.Long.valueOf(this.f152787g));
        hVar.w(java.lang.Long.valueOf(this.f152788h));
        hVar.s(java.lang.Long.valueOf(this.f152789i));
        return hVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48131xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6)) {
            return false;
        }
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6 c11124xda6b8ad6 = (com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152784d, c11124xda6b8ad6.f152784d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152785e, c11124xda6b8ad6.f152785e) && this.f152786f == c11124xda6b8ad6.f152786f && this.f152787g == c11124xda6b8ad6.f152787g && this.f152788h == c11124xda6b8ad6.f152788h && this.f152789i == c11124xda6b8ad6.f152789i;
    }

    /* renamed from: hashCode */
    public int m48132x8cdac1b() {
        return (((((((((this.f152784d.hashCode() * 31) + this.f152785e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f152786f)) * 31) + java.lang.Long.hashCode(this.f152787g)) * 31) + java.lang.Long.hashCode(this.f152788h)) * 31) + java.lang.Long.hashCode(this.f152789i);
    }

    /* renamed from: toString */
    public java.lang.String m48133x9616526c() {
        return "BizScreenshotMsgInfo(screenshotId=" + this.f152784d + ", url=" + this.f152785e + ", itemShowType=" + this.f152786f + ", biz=" + this.f152787g + ", mid=" + this.f152788h + ", idx=" + this.f152789i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f152784d);
        out.writeString(this.f152785e);
        out.writeInt(this.f152786f);
        out.writeLong(this.f152787g);
        out.writeLong(this.f152788h);
        out.writeLong(this.f152789i);
    }
}
