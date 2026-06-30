package com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaSingleInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo */
/* loaded from: classes4.dex */
public final /* data */ class C16506x8e746ffa implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa> f37630x681a0c0c = new og3.g();

    /* renamed from: d, reason: collision with root package name */
    public final og3.a f230142d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f230143e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16503xf5608a46 f230144f;

    public C16506x8e746ffa(og3.a type, java.lang.String path, com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16503xf5608a46 durationInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(durationInfo, "durationInfo");
        this.f230142d = type;
        this.f230143e = path;
        this.f230144f = durationInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66643xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa c16506x8e746ffa = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) obj;
        return this.f230142d == c16506x8e746ffa.f230142d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f230143e, c16506x8e746ffa.f230143e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f230144f, c16506x8e746ffa.f230144f);
    }

    /* renamed from: hashCode */
    public int m66644x8cdac1b() {
        return (((this.f230142d.hashCode() * 31) + this.f230143e.hashCode()) * 31) + this.f230144f.m66632x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m66645x9616526c() {
        return "MediaSingleInfo(type=" + this.f230142d + ", path=" + this.f230143e + ", durationInfo=" + this.f230144f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f230142d.name());
        out.writeString(this.f230143e);
        this.f230144f.writeToParcel(out, i17);
    }

    public C16506x8e746ffa(og3.a aVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16503xf5608a46 c16503xf5608a46, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(aVar, str, (i17 & 4) != 0 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16503xf5608a46(0L, 2147483647L) : c16503xf5608a46);
    }
}
