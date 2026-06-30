package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/magicbrush/fs/MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams", "Landroid/os/Parcelable;", "mb-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams */
/* loaded from: classes5.dex */
final /* data */ class C16435xf11ff843 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.C16435xf11ff843> f37486x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.u();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229472d;

    /* renamed from: e, reason: collision with root package name */
    public final long f229473e;

    /* renamed from: f, reason: collision with root package name */
    public final long f229474f;

    /* renamed from: g, reason: collision with root package name */
    public final long f229475g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f229476h;

    public C16435xf11ff843(java.lang.String bizName, long j17, long j18, long j19, java.util.HashMap storageKey2Path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageKey2Path, "storageKey2Path");
        this.f229472d = bizName;
        this.f229473e = j17;
        this.f229474f = j18;
        this.f229475g = j19;
        this.f229476h = storageKey2Path;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66333xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.C16435xf11ff843)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.C16435xf11ff843 c16435xf11ff843 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.C16435xf11ff843) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229472d, c16435xf11ff843.f229472d) && this.f229473e == c16435xf11ff843.f229473e && this.f229474f == c16435xf11ff843.f229474f && this.f229475g == c16435xf11ff843.f229475g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229476h, c16435xf11ff843.f229476h);
    }

    /* renamed from: hashCode */
    public int m66334x8cdac1b() {
        return (((((((this.f229472d.hashCode() * 31) + java.lang.Long.hashCode(this.f229473e)) * 31) + java.lang.Long.hashCode(this.f229474f)) * 31) + java.lang.Long.hashCode(this.f229475g)) * 31) + this.f229476h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m66335x9616526c() {
        return "CleanupTempFilesOnMBBIzExitParams(bizName=" + this.f229472d + ", minTempSize=" + this.f229473e + ", maxTempSize=" + this.f229474f + ", maxTotalTempSize=" + this.f229475g + ", storageKey2Path=" + this.f229476h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f229472d);
        out.writeLong(this.f229473e);
        out.writeLong(this.f229474f);
        out.writeLong(this.f229475g);
        java.util.HashMap hashMap = this.f229476h;
        out.writeInt(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            out.writeString((java.lang.String) entry.getKey());
            out.writeString((java.lang.String) entry.getValue());
        }
    }
}
