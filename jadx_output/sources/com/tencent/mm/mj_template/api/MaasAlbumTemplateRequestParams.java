package com.tencent.mm.mj_template.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mj_template/api/MaasAlbumTemplateRequestParams;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class MaasAlbumTemplateRequestParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams> CREATOR = new uy0.l();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f69773d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.mj_template.api.MJTemplateSession f69774e;

    public MaasAlbumTemplateRequestParams(java.util.List mediaList, com.tencent.mm.mj_template.api.MJTemplateSession mjTemplateSession) {
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        kotlin.jvm.internal.o.g(mjTemplateSession, "mjTemplateSession");
        this.f69773d = mediaList;
        this.f69774e = mjTemplateSession;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams)) {
            return false;
        }
        com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams maasAlbumTemplateRequestParams = (com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams) obj;
        return kotlin.jvm.internal.o.b(this.f69773d, maasAlbumTemplateRequestParams.f69773d) && kotlin.jvm.internal.o.b(this.f69774e, maasAlbumTemplateRequestParams.f69774e);
    }

    public int hashCode() {
        return (this.f69773d.hashCode() * 31) + this.f69774e.hashCode();
    }

    public java.lang.String toString() {
        return "MaasAlbumTemplateRequestParams(mediaList=" + this.f69773d + ", mjTemplateSession=" + this.f69774e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f69773d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
        this.f69774e.writeToParcel(out, i17);
    }
}
