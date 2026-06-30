package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/model/H5CgiPreloadModel;", "Landroid/os/Parcelable;", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel */
/* loaded from: classes8.dex */
public final /* data */ class C15897x3884718 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718> f36932x681a0c0c = new d53.a();

    /* renamed from: d, reason: collision with root package name */
    public long f221385d;

    /* renamed from: e, reason: collision with root package name */
    public long f221386e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f221387f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f221388g;

    public C15897x3884718(long j17, long j18, boolean z17, java.lang.String str) {
        this.f221385d = j17;
        this.f221386e = j18;
        this.f221387f = z17;
        this.f221388g = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64573xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718 c15897x3884718 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718) obj;
        return this.f221385d == c15897x3884718.f221385d && this.f221386e == c15897x3884718.f221386e && this.f221387f == c15897x3884718.f221387f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221388g, c15897x3884718.f221388g);
    }

    /* renamed from: hashCode */
    public int m64574x8cdac1b() {
        int hashCode = ((((java.lang.Long.hashCode(this.f221385d) * 31) + java.lang.Long.hashCode(this.f221386e)) * 31) + java.lang.Boolean.hashCode(this.f221387f)) * 31;
        java.lang.String str = this.f221388g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m64575x9616526c() {
        return "H5CgiPreloadModel(timeStamp=" + this.f221385d + ", cgiCostTimeMs=" + this.f221386e + ", isRequestFail=" + this.f221387f + ", cgiResponseStr=" + this.f221388g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeLong(this.f221385d);
        out.writeLong(this.f221386e);
        out.writeInt(this.f221387f ? 1 : 0);
        out.writeString(this.f221388g);
    }
}
