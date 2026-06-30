package com.p314xaae8f345.mm.p916x4268f0dc.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mj_template/api/MaasAlbumTemplateSnsFeedInfo;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo */
/* loaded from: classes4.dex */
public final /* data */ class C11013xe2775c41 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41> f29782x681a0c0c = new uy0.m();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f151308d;

    /* renamed from: e, reason: collision with root package name */
    public final int f151309e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f151310f;

    /* renamed from: g, reason: collision with root package name */
    public final long f151311g;

    /* renamed from: h, reason: collision with root package name */
    public final long f151312h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f151313i;

    public C11013xe2775c41(java.lang.String desc, int i17, byte[] bArr, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f151308d = desc;
        this.f151309e = i17;
        this.f151310f = bArr;
        this.f151311g = j17;
        this.f151312h = j18;
        this.f151313i = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m47476xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41)) {
            return false;
        }
        com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41 c11013xe2775c41 = (com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151308d, c11013xe2775c41.f151308d) && this.f151309e == c11013xe2775c41.f151309e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151310f, c11013xe2775c41.f151310f) && this.f151311g == c11013xe2775c41.f151311g && this.f151312h == c11013xe2775c41.f151312h && this.f151313i == c11013xe2775c41.f151313i;
    }

    /* renamed from: hashCode */
    public int m47477x8cdac1b() {
        int hashCode = ((this.f151308d.hashCode() * 31) + java.lang.Integer.hashCode(this.f151309e)) * 31;
        byte[] bArr = this.f151310f;
        return ((((((hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31) + java.lang.Long.hashCode(this.f151311g)) * 31) + java.lang.Long.hashCode(this.f151312h)) * 31) + java.lang.Boolean.hashCode(this.f151313i);
    }

    /* renamed from: toString */
    public java.lang.String m47478x9616526c() {
        return "MaasAlbumTemplateSnsFeedInfo(desc=" + this.f151308d + ", videoSource=" + this.f151309e + ", location=" + java.util.Arrays.toString(this.f151310f) + ", snsFeedId=" + this.f151311g + ", snsLocalId=" + this.f151312h + ", selectNoTemplate=" + this.f151313i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f151308d);
        out.writeInt(this.f151309e);
        out.writeByteArray(this.f151310f);
        out.writeLong(this.f151311g);
        out.writeLong(this.f151312h);
        out.writeInt(this.f151313i ? 1 : 0);
    }
}
