package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;", "Landroid/os/Parcelable;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.model.LocalJumpInfo */
/* loaded from: classes8.dex */
public final /* data */ class C15923xcaadde67 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67> f36937x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t2();

    /* renamed from: d, reason: collision with root package name */
    public final int f221705d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f221706e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15926x985e4f6f f221707f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15922xf05fa42a f221708g;

    public C15923xcaadde67(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15926x985e4f6f c15926x985e4f6f, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15922xf05fa42a c15922xf05fa42a) {
        this.f221705d = i17;
        this.f221706e = str;
        this.f221707f = c15926x985e4f6f;
        this.f221708g = c15922xf05fa42a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64642xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67 c15923xcaadde67 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67) obj;
        return this.f221705d == c15923xcaadde67.f221705d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221706e, c15923xcaadde67.f221706e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221707f, c15923xcaadde67.f221707f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221708g, c15923xcaadde67.f221708g);
    }

    /* renamed from: hashCode */
    public int m64643x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f221705d) * 31;
        java.lang.String str = this.f221706e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15926x985e4f6f c15926x985e4f6f = this.f221707f;
        int m64652x8cdac1b = (hashCode2 + (c15926x985e4f6f == null ? 0 : c15926x985e4f6f.m64652x8cdac1b())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15922xf05fa42a c15922xf05fa42a = this.f221708g;
        return m64652x8cdac1b + (c15922xf05fa42a != null ? c15922xf05fa42a.m64639x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m64644x9616526c() {
        return "LocalJumpInfo(jumpType=" + this.f221705d + ", jumpUrl=" + this.f221706e + ", weAppJumpInfo=" + this.f221707f + ", halfScreen=" + this.f221708g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f221705d);
        out.writeString(this.f221706e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15926x985e4f6f c15926x985e4f6f = this.f221707f;
        if (c15926x985e4f6f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c15926x985e4f6f.writeToParcel(out, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15922xf05fa42a c15922xf05fa42a = this.f221708g;
        if (c15922xf05fa42a == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c15922xf05fa42a.writeToParcel(out, i17);
        }
    }
}
