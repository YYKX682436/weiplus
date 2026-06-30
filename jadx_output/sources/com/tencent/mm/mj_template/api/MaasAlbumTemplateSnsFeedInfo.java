package com.tencent.mm.mj_template.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mj_template/api/MaasAlbumTemplateSnsFeedInfo;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class MaasAlbumTemplateSnsFeedInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo> CREATOR = new uy0.m();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f69775d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69776e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f69777f;

    /* renamed from: g, reason: collision with root package name */
    public final long f69778g;

    /* renamed from: h, reason: collision with root package name */
    public final long f69779h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f69780i;

    public MaasAlbumTemplateSnsFeedInfo(java.lang.String desc, int i17, byte[] bArr, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f69775d = desc;
        this.f69776e = i17;
        this.f69777f = bArr;
        this.f69778g = j17;
        this.f69779h = j18;
        this.f69780i = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo)) {
            return false;
        }
        com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo = (com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo) obj;
        return kotlin.jvm.internal.o.b(this.f69775d, maasAlbumTemplateSnsFeedInfo.f69775d) && this.f69776e == maasAlbumTemplateSnsFeedInfo.f69776e && kotlin.jvm.internal.o.b(this.f69777f, maasAlbumTemplateSnsFeedInfo.f69777f) && this.f69778g == maasAlbumTemplateSnsFeedInfo.f69778g && this.f69779h == maasAlbumTemplateSnsFeedInfo.f69779h && this.f69780i == maasAlbumTemplateSnsFeedInfo.f69780i;
    }

    public int hashCode() {
        int hashCode = ((this.f69775d.hashCode() * 31) + java.lang.Integer.hashCode(this.f69776e)) * 31;
        byte[] bArr = this.f69777f;
        return ((((((hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31) + java.lang.Long.hashCode(this.f69778g)) * 31) + java.lang.Long.hashCode(this.f69779h)) * 31) + java.lang.Boolean.hashCode(this.f69780i);
    }

    public java.lang.String toString() {
        return "MaasAlbumTemplateSnsFeedInfo(desc=" + this.f69775d + ", videoSource=" + this.f69776e + ", location=" + java.util.Arrays.toString(this.f69777f) + ", snsFeedId=" + this.f69778g + ", snsLocalId=" + this.f69779h + ", selectNoTemplate=" + this.f69780i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f69775d);
        out.writeInt(this.f69776e);
        out.writeByteArray(this.f69777f);
        out.writeLong(this.f69778g);
        out.writeLong(this.f69779h);
        out.writeInt(this.f69780i ? 1 : 0);
    }
}
