package com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaDurationInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo */
/* loaded from: classes4.dex */
public final /* data */ class C16503xf5608a46 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16503xf5608a46> f37627x681a0c0c = new og3.b();

    /* renamed from: d, reason: collision with root package name */
    public final long f230133d;

    /* renamed from: e, reason: collision with root package name */
    public final long f230134e;

    public C16503xf5608a46(long j17, long j18) {
        this.f230133d = j17;
        this.f230134e = j18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66631xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16503xf5608a46)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16503xf5608a46 c16503xf5608a46 = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16503xf5608a46) obj;
        return this.f230133d == c16503xf5608a46.f230133d && this.f230134e == c16503xf5608a46.f230134e;
    }

    /* renamed from: hashCode */
    public int m66632x8cdac1b() {
        return (java.lang.Long.hashCode(this.f230133d) * 31) + java.lang.Long.hashCode(this.f230134e);
    }

    /* renamed from: toString */
    public java.lang.String m66633x9616526c() {
        return "MediaDurationInfo(startMs=" + this.f230133d + ", endMs=" + this.f230134e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeLong(this.f230133d);
        out.writeLong(this.f230134e);
    }
}
