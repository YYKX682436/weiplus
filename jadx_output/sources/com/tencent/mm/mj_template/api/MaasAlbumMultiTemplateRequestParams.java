package com.tencent.mm.mj_template.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mj_template/api/MaasAlbumMultiTemplateRequestParams;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class MaasAlbumMultiTemplateRequestParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams> CREATOR = new uy0.k();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f69768d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f69769e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f69770f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69771g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo f69772h;

    public MaasAlbumMultiTemplateRequestParams(java.util.List mediaList, boolean z17, boolean z18, boolean z19, com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo) {
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        this.f69768d = mediaList;
        this.f69769e = z17;
        this.f69770f = z18;
        this.f69771g = z19;
        this.f69772h = maasAlbumTemplateSnsFeedInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams)) {
            return false;
        }
        com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams maasAlbumMultiTemplateRequestParams = (com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams) obj;
        return kotlin.jvm.internal.o.b(this.f69768d, maasAlbumMultiTemplateRequestParams.f69768d) && this.f69769e == maasAlbumMultiTemplateRequestParams.f69769e && this.f69770f == maasAlbumMultiTemplateRequestParams.f69770f && this.f69771g == maasAlbumMultiTemplateRequestParams.f69771g && kotlin.jvm.internal.o.b(this.f69772h, maasAlbumMultiTemplateRequestParams.f69772h);
    }

    public int hashCode() {
        int hashCode = ((((((this.f69768d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f69769e)) * 31) + java.lang.Boolean.hashCode(this.f69770f)) * 31) + java.lang.Boolean.hashCode(this.f69771g)) * 31;
        com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo = this.f69772h;
        return hashCode + (maasAlbumTemplateSnsFeedInfo == null ? 0 : maasAlbumTemplateSnsFeedInfo.hashCode());
    }

    public java.lang.String toString() {
        return "MaasAlbumMultiTemplateRequestParams(mediaList=" + this.f69768d + ", manageSdk=" + this.f69769e + ", snsPhotoTheme=" + this.f69770f + ", directPost=" + this.f69771g + ", snsFeedInfo=" + this.f69772h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f69768d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
        out.writeInt(this.f69769e ? 1 : 0);
        out.writeInt(this.f69770f ? 1 : 0);
        out.writeInt(this.f69771g ? 1 : 0);
        com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo = this.f69772h;
        if (maasAlbumTemplateSnsFeedInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            maasAlbumTemplateSnsFeedInfo.writeToParcel(out, i17);
        }
    }

    public /* synthetic */ MaasAlbumMultiTemplateRequestParams(java.util.List list, boolean z17, boolean z18, boolean z19, com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo, int i17, kotlin.jvm.internal.i iVar) {
        this(list, (i17 & 2) != 0 ? false : z17, (i17 & 4) != 0 ? false : z18, (i17 & 8) != 0 ? false : z19, (i17 & 16) != 0 ? null : maasAlbumTemplateSnsFeedInfo);
    }
}
