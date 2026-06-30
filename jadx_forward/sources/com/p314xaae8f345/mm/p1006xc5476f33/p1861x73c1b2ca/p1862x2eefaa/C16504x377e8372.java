package com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaErrorInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo */
/* loaded from: classes10.dex */
public final /* data */ class C16504x377e8372 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372> f37628x681a0c0c = new og3.c();

    /* renamed from: d, reason: collision with root package name */
    public final og3.h f230135d;

    /* renamed from: e, reason: collision with root package name */
    public final int f230136e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f230137f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Bundle f230138g;

    public C16504x377e8372(og3.h status, int i17, java.lang.String str, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f230135d = status;
        this.f230136e = i17;
        this.f230137f = str;
        this.f230138g = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66635xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372 c16504x377e8372 = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372) obj;
        return this.f230135d == c16504x377e8372.f230135d && this.f230136e == c16504x377e8372.f230136e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f230137f, c16504x377e8372.f230137f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f230138g, c16504x377e8372.f230138g);
    }

    /* renamed from: hashCode */
    public int m66636x8cdac1b() {
        int hashCode = ((this.f230135d.hashCode() * 31) + java.lang.Integer.hashCode(this.f230136e)) * 31;
        java.lang.String str = this.f230137f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        android.os.Bundle bundle = this.f230138g;
        return hashCode2 + (bundle != null ? bundle.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m66637x9616526c() {
        return "MediaErrorInfo(status=" + this.f230135d + ", errorCode=" + this.f230136e + ", errorMsg=" + this.f230137f + ", extra=" + this.f230138g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f230135d.name());
        out.writeInt(this.f230136e);
        out.writeString(this.f230137f);
        out.writeBundle(this.f230138g);
    }

    public /* synthetic */ C16504x377e8372(og3.h hVar, int i17, java.lang.String str, android.os.Bundle bundle, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(hVar, i17, (i18 & 4) != 0 ? null : str, (i18 & 8) != 0 ? null : bundle);
    }
}
