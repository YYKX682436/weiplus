package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/model/WeAppJumpInfo;", "Landroid/os/Parcelable;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.model.WeAppJumpInfo */
/* loaded from: classes8.dex */
public final /* data */ class C15926x985e4f6f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15926x985e4f6f> f36939x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a4();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f221720d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f221721e;

    public C15926x985e4f6f(java.lang.String str, java.lang.String str2) {
        this.f221720d = str;
        this.f221721e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64651xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15926x985e4f6f)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15926x985e4f6f c15926x985e4f6f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15926x985e4f6f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221720d, c15926x985e4f6f.f221720d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221721e, c15926x985e4f6f.f221721e);
    }

    /* renamed from: hashCode */
    public int m64652x8cdac1b() {
        java.lang.String str = this.f221720d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f221721e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m64653x9616526c() {
        return "WeAppJumpInfo(appId=" + this.f221720d + ", path=" + this.f221721e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f221720d);
        out.writeString(this.f221721e);
    }
}
