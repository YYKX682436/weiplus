package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/model/LocalHalfScreen;", "Landroid/os/Parcelable;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.model.LocalHalfScreen */
/* loaded from: classes8.dex */
public final /* data */ class C15922xf05fa42a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15922xf05fa42a> f36936x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.s2();

    /* renamed from: d, reason: collision with root package name */
    public final int f221702d;

    /* renamed from: e, reason: collision with root package name */
    public final int f221703e;

    /* renamed from: f, reason: collision with root package name */
    public final float f221704f;

    public C15922xf05fa42a(int i17, int i18, float f17) {
        this.f221702d = i17;
        this.f221703e = i18;
        this.f221704f = f17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64638xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15922xf05fa42a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15922xf05fa42a c15922xf05fa42a = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15922xf05fa42a) obj;
        return this.f221702d == c15922xf05fa42a.f221702d && this.f221703e == c15922xf05fa42a.f221703e && java.lang.Float.compare(this.f221704f, c15922xf05fa42a.f221704f) == 0;
    }

    /* renamed from: hashCode */
    public int m64639x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f221702d) * 31) + java.lang.Integer.hashCode(this.f221703e)) * 31) + java.lang.Float.hashCode(this.f221704f);
    }

    /* renamed from: toString */
    public java.lang.String m64640x9616526c() {
        return "LocalHalfScreen(type=" + this.f221702d + ", screenHeightDp=" + this.f221703e + ", screenHeightPercent=" + this.f221704f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f221702d);
        out.writeInt(this.f221703e);
        out.writeFloat(this.f221704f);
    }
}
