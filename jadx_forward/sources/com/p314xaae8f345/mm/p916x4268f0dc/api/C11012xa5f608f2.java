package com.p314xaae8f345.mm.p916x4268f0dc.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mj_template/api/MaasAlbumTemplateRequestParams;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams */
/* loaded from: classes4.dex */
public final /* data */ class C11012xa5f608f2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p916x4268f0dc.api.C11012xa5f608f2> f29781x681a0c0c = new uy0.l();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f151306d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f f151307e;

    public C11012xa5f608f2(java.util.List mediaList, com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f mjTemplateSession) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjTemplateSession, "mjTemplateSession");
        this.f151306d = mediaList;
        this.f151307e = mjTemplateSession;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m47472xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p916x4268f0dc.api.C11012xa5f608f2)) {
            return false;
        }
        com.p314xaae8f345.mm.p916x4268f0dc.api.C11012xa5f608f2 c11012xa5f608f2 = (com.p314xaae8f345.mm.p916x4268f0dc.api.C11012xa5f608f2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151306d, c11012xa5f608f2.f151306d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151307e, c11012xa5f608f2.f151307e);
    }

    /* renamed from: hashCode */
    public int m47473x8cdac1b() {
        return (this.f151306d.hashCode() * 31) + this.f151307e.m47465x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m47474x9616526c() {
        return "MaasAlbumTemplateRequestParams(mediaList=" + this.f151306d + ", mjTemplateSession=" + this.f151307e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f151306d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
        this.f151307e.writeToParcel(out, i17);
    }
}
