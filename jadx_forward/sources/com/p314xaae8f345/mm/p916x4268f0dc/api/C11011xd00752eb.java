package com.p314xaae8f345.mm.p916x4268f0dc.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mj_template/api/MaasAlbumMultiTemplateRequestParams;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams */
/* loaded from: classes4.dex */
public final /* data */ class C11011xd00752eb implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb> f29780x681a0c0c = new uy0.k();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f151301d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f151302e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f151303f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f151304g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41 f151305h;

    public C11011xd00752eb(java.util.List mediaList, boolean z17, boolean z18, boolean z19, com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41 c11013xe2775c41) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        this.f151301d = mediaList;
        this.f151302e = z17;
        this.f151303f = z18;
        this.f151304g = z19;
        this.f151305h = c11013xe2775c41;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m47468xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb)) {
            return false;
        }
        com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb c11011xd00752eb = (com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151301d, c11011xd00752eb.f151301d) && this.f151302e == c11011xd00752eb.f151302e && this.f151303f == c11011xd00752eb.f151303f && this.f151304g == c11011xd00752eb.f151304g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151305h, c11011xd00752eb.f151305h);
    }

    /* renamed from: hashCode */
    public int m47469x8cdac1b() {
        int hashCode = ((((((this.f151301d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f151302e)) * 31) + java.lang.Boolean.hashCode(this.f151303f)) * 31) + java.lang.Boolean.hashCode(this.f151304g)) * 31;
        com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41 c11013xe2775c41 = this.f151305h;
        return hashCode + (c11013xe2775c41 == null ? 0 : c11013xe2775c41.m47477x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m47470x9616526c() {
        return "MaasAlbumMultiTemplateRequestParams(mediaList=" + this.f151301d + ", manageSdk=" + this.f151302e + ", snsPhotoTheme=" + this.f151303f + ", directPost=" + this.f151304g + ", snsFeedInfo=" + this.f151305h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f151301d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
        out.writeInt(this.f151302e ? 1 : 0);
        out.writeInt(this.f151303f ? 1 : 0);
        out.writeInt(this.f151304g ? 1 : 0);
        com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41 c11013xe2775c41 = this.f151305h;
        if (c11013xe2775c41 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c11013xe2775c41.writeToParcel(out, i17);
        }
    }

    public /* synthetic */ C11011xd00752eb(java.util.List list, boolean z17, boolean z18, boolean z19, com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41 c11013xe2775c41, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(list, (i17 & 2) != 0 ? false : z17, (i17 & 4) != 0 ? false : z18, (i17 & 8) != 0 ? false : z19, (i17 & 16) != 0 ? null : c11013xe2775c41);
    }
}
