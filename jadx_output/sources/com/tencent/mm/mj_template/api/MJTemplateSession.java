package com.tencent.mm.mj_template.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mj_template/api/MJTemplateSession;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class MJTemplateSession implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.mj_template.api.MJTemplateSession> CREATOR = new uy0.i();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f69765d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f69766e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f69767f;

    public MJTemplateSession(byte[] templatePb, java.lang.String musicId) {
        kotlin.jvm.internal.o.g(templatePb, "templatePb");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        this.f69765d = templatePb;
        this.f69766e = musicId;
        this.f69767f = jz5.h.b(new uy0.j(this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.mj_template.api.MJTemplateSession)) {
            return false;
        }
        com.tencent.mm.mj_template.api.MJTemplateSession mJTemplateSession = (com.tencent.mm.mj_template.api.MJTemplateSession) obj;
        return kotlin.jvm.internal.o.b(this.f69765d, mJTemplateSession.f69765d) && kotlin.jvm.internal.o.b(this.f69766e, mJTemplateSession.f69766e);
    }

    public int hashCode() {
        return (java.util.Arrays.hashCode(this.f69765d) * 31) + this.f69766e.hashCode();
    }

    public java.lang.String toString() {
        return "MJTemplateSession(templatePb=" + java.util.Arrays.toString(this.f69765d) + ", musicId=" + this.f69766e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeByteArray(this.f69765d);
        out.writeString(this.f69766e);
    }
}
